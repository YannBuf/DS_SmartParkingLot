/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buf.smartparkinglot;

/**
 *
 * @author 19835
 */

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import generated.smartparkinglot.ParkingAvailability.AvailableSpotsRequest;
import generated.smartparkinglot.ParkingAvailability.AvailableSpotsResponse;
import generated.smartparkinglot.ParkingAvailability.ParkingAvailabilityServiceGrpc;
import generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusRequest;
import generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse;
import generated.smartparkinglot.ParkingPayment.PaymentRequest;
import generated.smartparkinglot.ParkingPayment.PaymentResponse;
import generated.smartparkinglot.ParkingPayment.ParkingPaymentServiceGrpc;
import generated.smartparkinglot.ParkingPayment.PaymentInfo;
import generated.smartparkinglot.ParkingPayment.PaymentStatus;
import generated.smartparkinglot.ParkingReservation.CancelRequest;
import generated.smartparkinglot.ParkingReservation.CancelResponse;
import generated.smartparkinglot.ParkingReservation.CheckStatusRequest;
import generated.smartparkinglot.ParkingReservation.CheckStatusResponse;
import generated.smartparkinglot.ParkingReservation.ParkingReservationServiceGrpc;
import generated.smartparkinglot.ParkingReservation.ReservationRequest;
import generated.smartparkinglot.ParkingReservation.ReservationResponse;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

//For DNS
import buf.jmDNS.*;

import io.grpc.Metadata;
import io.grpc.stub.MetadataUtils;

public class GrpcClient {

    public static void main(String[] args) throws InterruptedException {
        GrpcServiceDiscovery discovery = new GrpcServiceDiscovery();

        discovery.discoverService("_grpc._tcp.local.", (host, port) -> {
            System.out.println("🚀 Connecting to discovered gRPC service at " + host + ":" + port);
            ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                    .usePlaintext()
                    .build();

            try {
                callParkingAvailabilityService(channel);
                callParkingPaymentService(channel);
                callParkingReservationService(channel);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                channel.shutdownNow();
            }
        });

        // Keep thread alive 
        Thread.sleep(10000);
    }

    private static void callParkingAvailabilityService(ManagedChannel channel) throws InterruptedException {
        ParkingAvailabilityServiceGrpc.ParkingAvailabilityServiceStub availabilityStub = ParkingAvailabilityServiceGrpc.newStub(channel);

        AvailableSpotsRequest availabilityRequest = AvailableSpotsRequest.newBuilder().setParkingZoneId("Zone1").build();

        System.out.println("Calling GetRealTimeAvailability...");

        CountDownLatch availabilityDone = new CountDownLatch(1);
        availabilityStub.getRealTimeAvailability(availabilityRequest, new StreamObserver<AvailableSpotsResponse>() {
            @Override
            public void onNext(AvailableSpotsResponse response) {
                System.out.println("Real-time update: " +
                        response.getAvailableSpots() + "/" + response.getTotalSpots() + " available at " + response.getTimestamp());
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error receiving real-time availability: " + t.getMessage());
                availabilityDone.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Completed receiving real-time availability.");
                availabilityDone.countDown();
            }
        });
        availabilityDone.await(10, TimeUnit.SECONDS);

        ParkingSpaceStatusRequest statusRequest = ParkingSpaceStatusRequest.newBuilder().setParkingZoneId("Zone1").build();

        System.out.println("Calling GetParkingSpaceStatus...");

        CountDownLatch spaceStatusDone = new CountDownLatch(1);
        availabilityStub.getParkingSpaceStatus(statusRequest, new StreamObserver<ParkingSpaceStatusResponse>() {
            @Override
            public void onNext(ParkingSpaceStatusResponse response) {
                System.out.println("Spot " + response.getSpotId() + " is " +
                        response.getStatus() + " (updated at " + response.getTimestamp() + ")");
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error receiving parking space status: " + t.getMessage());
                spaceStatusDone.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Completed receiving parking space status.");
                spaceStatusDone.countDown();
            }
        });
        spaceStatusDone.await(10, TimeUnit.SECONDS);
    }

    private static void callParkingPaymentService(ManagedChannel channel) throws InterruptedException {
        ParkingPaymentServiceGrpc.ParkingPaymentServiceStub paymentStub =
                ParkingPaymentServiceGrpc.newStub(channel);

        PaymentRequest feeRequest = PaymentRequest.newBuilder().setUserId("user_123").setParkingZoneId("Zone1").setParkingDuration("2h").build();

        CountDownLatch feeDone = new CountDownLatch(1);
        paymentStub.getParkingFee(feeRequest, new StreamObserver<PaymentResponse>() {
            @Override
            public void onNext(PaymentResponse response) {
                System.out.println("Parking fee: " + response.getFeeAmount() + " " + response.getCurrency() + ", transactionId: " + response.getTransactionId() + ", status: " + response.getStatus());
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error getting parking fee: " + t.getMessage());
                feeDone.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Completed GetParkingFee call.");
                feeDone.countDown();
            }
        });
        feeDone.await(5, TimeUnit.SECONDS);

        CountDownLatch paymentStreamDone = new CountDownLatch(1);
        StreamObserver<PaymentInfo> paymentRequestObserver =
                paymentStub.handlePayment(new StreamObserver<PaymentStatus>() {
                    @Override
                    public void onNext(PaymentStatus status) {
                        System.out.println("Payment status: " + status.getStatus() + ", message: " + status.getMessage());
                    }

                    @Override
                    public void onError(Throwable t) {
                        System.err.println("Error in handlePayment: " + t.getMessage());
                        paymentStreamDone.countDown();
                    }

                    @Override
                    public void onCompleted() {
                        System.out.println("Completed HandlePayment call.");
                        paymentStreamDone.countDown();
                    }
                });

        PaymentInfo info1 = PaymentInfo.newBuilder().setUserId("user_123").setAmount(5.0).build();

        PaymentInfo info2 = PaymentInfo.newBuilder().setUserId("user_123").setAmount(3.5).build();

        paymentRequestObserver.onNext(info1);
        paymentRequestObserver.onNext(info2);
        paymentRequestObserver.onCompleted();
        paymentStreamDone.await(5, TimeUnit.SECONDS);
    }

    private static void callParkingReservationService(ManagedChannel channel) throws InterruptedException {
        ParkingReservationServiceGrpc.ParkingReservationServiceStub reservationStub =
                ParkingReservationServiceGrpc.newStub(channel);

        CountDownLatch reservationDone = new CountDownLatch(1);
        StreamObserver<ReservationRequest> reservationRequestObserver =
                reservationStub.reserveParkingSpace(new StreamObserver<ReservationResponse>() {
                    @Override
                    public void onNext(ReservationResponse response) {
                        System.out.println("Reservation Response: reservationId=" + response.getReservationId() + ", success=" + response.getSuccess() + ", message=" + response.getMessage());
                    }

                    @Override
                    public void onError(Throwable t) {
                        System.err.println("Error in ReserveParkingSpace: " + t.getMessage());
                        reservationDone.countDown();
                    }

                    @Override
                    public void onCompleted() {
                        System.out.println("Completed ReserveParkingSpace call.");
                        reservationDone.countDown();
                    }
                });

        ReservationRequest req1 = ReservationRequest.newBuilder().setUserId("user_123").setParkingZoneId("Zone1").setSpotId("A1").setStartTime("2025-04-11 08:00:00").setEndTime("2025-04-11 10:00:00").build();
        
        ReservationRequest req2 = ReservationRequest.newBuilder().setUserId("user_123").setParkingZoneId("Zone1").setSpotId("A2").setStartTime("2025-04-11 11:00:00").setEndTime("2025-04-11 13:00:00").build();

        reservationRequestObserver.onNext(req1);
        reservationRequestObserver.onNext(req2);
        reservationRequestObserver.onCompleted();
        reservationDone.await(5, TimeUnit.SECONDS);

        CancelRequest cancelRequest = CancelRequest.newBuilder().setReservationId("some-reservation-id").build();
        CountDownLatch cancelDone = new CountDownLatch(1);
        reservationStub.cancelReservation(cancelRequest, new StreamObserver<CancelResponse>() {
            @Override
            public void onNext(CancelResponse response) {
                System.out.println("CancelReservation: success=" + response.getSuccess() + ", message=" + response.getMessage());
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in CancelReservation: " + t.getMessage());
                cancelDone.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Completed CancelReservation call.");
                cancelDone.countDown();
            }
        });
        cancelDone.await(5, TimeUnit.SECONDS);

        CheckStatusRequest checkStatusRequest = CheckStatusRequest.newBuilder().setReservationId("some-reservation-id").build();
        CountDownLatch statusCheckDone = new CountDownLatch(1);
        reservationStub.checkReservationStatus(checkStatusRequest, new StreamObserver<CheckStatusResponse>() {
            @Override
            public void onNext(CheckStatusResponse response) {
                System.out.println("Reservation status for user: " + response.getUserId() + ", status: " + response.getStatus() + ", scheduled from " + response.getStartTime() + " to " + response.getEndTime());
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in CheckReservationStatus: " + t.getMessage());
                statusCheckDone.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Completed CheckReservationStatus call.");
                statusCheckDone.countDown();
            }
        });
        statusCheckDone.await(5, TimeUnit.SECONDS);
    }
}
