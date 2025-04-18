/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buf.smartparkinglot;

/**
 *
 * @author 19835
 */
import generated.smartparkinglot.ParkingReservation.ParkingReservationServiceGrpc;
import generated.smartparkinglot.ParkingReservation.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.List;

public class ParkingReservationClient {
    private final ParkingReservationServiceGrpc.ParkingReservationServiceBlockingStub blockingStub;
    private final ParkingReservationServiceGrpc.ParkingReservationServiceStub asyncStub;

    public ParkingReservationClient(ManagedChannel channel) {
        this.blockingStub = ParkingReservationServiceGrpc.newBlockingStub(channel);
        this.asyncStub = ParkingReservationServiceGrpc.newStub(channel);
    }

    public void reserveParkingSpaces(List<ReservationRequest> requests, StreamObserver<ReservationResponse> responseObserver) {
        StreamObserver<ReservationRequest> requestObserver = asyncStub.reserveParkingSpace(responseObserver);
        for (ReservationRequest request : requests) {
            requestObserver.onNext(request);
        }
        requestObserver.onCompleted();
    }

    public CancelResponse cancelReservation(String reservationId) {
        CancelRequest request = CancelRequest.newBuilder()
                .setReservationId(reservationId)
                .build();
        return blockingStub.cancelReservation(request);
    }

    public CheckStatusResponse checkReservationStatus(String reservationId) {
        CheckStatusRequest request = CheckStatusRequest.newBuilder()
            .setReservationId(reservationId)
            .build();
        return blockingStub.checkReservationStatus(request);
    }

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        ParkingReservationClient client = new ParkingReservationClient(channel);

        // test
        ReservationRequest request = ReservationRequest.newBuilder()
                .setUserId("user_001")
                .setParkingZoneId("Zone1")
                .setSpotId("B2")
                .setStartTime("2025-04-20 09:00:00")
                .setEndTime("2025-04-20 11:00:00")
                .build();

        // test 
        client.reserveParkingSpaces(List.of(request), new StreamObserver<ReservationResponse>() {
            @Override
            public void onNext(ReservationResponse response) {
                System.out.println("Reservation ID: " + response.getReservationId() + ", Success: " + response.getSuccess());
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error during reservation: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Reservation process completed.");
            }
        });


        String testReservationId = "some-valid-id"; 
        CheckStatusResponse statusResponse = client.checkReservationStatus(testReservationId);
        System.out.println("Reservation Status: " + statusResponse.getMessage());
        

        CancelResponse cancelResponse = client.cancelReservation(testReservationId);
        System.out.println("Cancel response: " + cancelResponse.getMessage());

        channel.shutdown();
    }
}
