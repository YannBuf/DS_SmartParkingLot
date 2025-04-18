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

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;


// Service implementation for ParkingReservationService.
public class ParkingReservationServiceImpl extends ParkingReservationServiceGrpc.ParkingReservationServiceImplBase {
    //Using ConcurrentHashMap save reservation infomation
    private final Map<String, ReservationRequest> reservations = new ConcurrentHashMap<>();

    // Implements ReserveParkingSpace client-streaming RPC
    @Override
    public StreamObserver<ReservationRequest> reserveParkingSpace(final StreamObserver<ReservationResponse> responseObserver) {
        return new StreamObserver<ReservationRequest>() {
            // A counter to keep track of the number of requests
            int requestCount = 0;
            
            //save last reservation Id
            String lastReservationId = null;

            @Override
            public void onNext(ReservationRequest request) {
                // Process each reservation request from the stream
                requestCount++;
                System.out.println("Received ReservationRequest from userId: " + request.getUserId() + ", for spot: " + request.getSpotId());
                
                //Generates a unique reservationId and stores the reservation information
                String reservationId = UUID.randomUUID().toString();
                reservations.put(reservationId, request);
                lastReservationId = reservationId;
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in Reservation stream: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                // Once the client has sent all requests, send a summary response
                
                boolean success = lastReservationId != null;
                String message = success ? "Reservation(s) successful" : "No reservation requests received";

                ReservationResponse response = ReservationResponse.newBuilder()
                    .setReservationId(lastReservationId)
                    .setSuccess(success)
                    .setMessage(message)
                    .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }

    // Implements CancelReservation unary RPC
    @Override
    public void cancelReservation(CancelRequest request, StreamObserver<CancelResponse> responseObserver) {
        String reservationId = request.getReservationId();
        System.out.println("Received CancelReservation for reservationId: " + reservationId);
        
        if (reservations.containsKey(reservationId)) {
            reservations.remove(reservationId);
            CancelResponse response = CancelResponse.newBuilder()
                    .setSuccess(true)
                    .setMessage("Reservation cancelled successfully")
                    .build();
            responseObserver.onNext(response);
        } else {
            CancelResponse response = CancelResponse.newBuilder()
                    .setSuccess(false)
                    .setMessage("Reservation not found")
                    .build();
            responseObserver.onNext(response);
        }
        System.out.println("Cancel response for reservationId " + reservationId + ": " + responseObserver);
        responseObserver.onCompleted();
    }

    // Implements CheckReservationStatus unary RPC
    @Override
    public void checkReservationStatus(CheckStatusRequest request, StreamObserver<CheckStatusResponse> responseObserver) {
        String reservationId = request.getReservationId();
        System.out.println("Received CheckReservationStatus for reservationId: " + reservationId);

        ReservationRequest reservation = reservations.get(reservationId);
        if (reservation != null) {
    
            CheckStatusResponse response = CheckStatusResponse.newBuilder()
                    .setUserId(reservation.getUserId())
                    .setSuccess(true)
                    .setMessage("Reservation is confirmed and scheduled")
                    .setStartTime(reservation.getStartTime())
                    .setEndTime(reservation.getEndTime())
                    .setSpotId(reservation.getSpotId())
                    .setStatus("not started") //only for test
                    .build();
            responseObserver.onNext(response);
        } else {
            CheckStatusResponse response = CheckStatusResponse.newBuilder()
                    .setSuccess(false)
                    .setMessage("Reservation not found")
                    .build();
            responseObserver.onNext(response);
        }
        System.out.println("CheckStatus response for reservationId " + reservationId + ": " + responseObserver);
        responseObserver.onCompleted();
    }
}

