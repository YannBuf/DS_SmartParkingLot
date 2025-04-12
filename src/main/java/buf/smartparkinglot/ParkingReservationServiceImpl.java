/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buf.smartparkinglot;

/**
 *
 * @author 19835
 */
import io.grpc.stub.StreamObserver;
import java.util.UUID;
import generated.smartparkinglot.ParkingReservation.*;

// Service implementation for ParkingReservationService.
public class ParkingReservationServiceImpl extends ParkingReservationServiceGrpc.ParkingReservationServiceImplBase {

    // Implements ReserveParkingSpace client-streaming RPC
    @Override
    public StreamObserver<ReservationRequest> reserveParkingSpace(final StreamObserver<ReservationResponse> responseObserver) {
        return new StreamObserver<ReservationRequest>() {
            // A counter to keep track of the number of requests (for demo)
            int requestCount = 0;

            @Override
            public void onNext(ReservationRequest request) {
                // Process each reservation request from the stream
                requestCount++;
                System.out.println("Received ReservationRequest from userId: " + request.getUserId() + ", for spot: " + request.getSpotId());
                // In a real scenario, you would validate and temporarily hold the reservation.
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in Reservation stream: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                // Once the client has sent all requests, send a summary response
                // For this demo, we assume success if at least one request was received.
                boolean success = requestCount > 0;
                String message = success ? "Reservation(s) successful" : "No reservation requests received";
                String reservationId = UUID.randomUUID().toString();
                ReservationResponse response = ReservationResponse.newBuilder().setReservationId(reservationId).setSuccess(success).setMessage(message).build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }

    // Implements CancelReservation unary RPC
    @Override
    public void cancelReservation(CancelRequest request, StreamObserver<CancelResponse> responseObserver) {
        System.out.println("Received CancelReservation for reservationId: " + request.getReservationId());
        // Simulate cancellation logic (for demo, always successful)
        CancelResponse response = CancelResponse.newBuilder().setSuccess(true).setMessage("Reservation cancelled successfully").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    // Implements CheckReservationStatus unary RPC
    @Override
    public void checkReservationStatus(CheckStatusRequest request, StreamObserver<CheckStatusResponse> responseObserver) {
        System.out.println("Received CheckReservationStatus for reservationId: " + request.getReservationId());
        // Simulate returning scheduled status information
        CheckStatusResponse response = CheckStatusResponse.newBuilder().setUserId("user_123").setSuccess(true).setMessage("Reservation is confirmed and scheduled").setStartTime("2025-04-11 08:00:00").setEndTime("2025-04-11 10:00:00").setSpotId("A1").setStatus("not started").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
