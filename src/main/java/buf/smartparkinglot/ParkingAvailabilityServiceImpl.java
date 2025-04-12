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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import generated.smartparkinglot.ParkingAvailability.*;
import java.util.Random;

// Service implementation for ParkingAvailabilityService.
public class ParkingAvailabilityServiceImpl extends ParkingAvailabilityServiceGrpc.ParkingAvailabilityServiceImplBase{

    // Implements the GetRealTimeAvailability streaming RPC
    @Override
    public void getRealTimeAvailability(AvailableSpotsRequest request, StreamObserver<AvailableSpotsResponse> responseObserver) {
        // Simulate sending real-time updates every second for 5 seconds
        String parkingZoneId = request.getParkingZoneId();
        System.out.println("Received GetRealTimeAvailability request for parkingZoneId: " + parkingZoneId);

        try {
            for (int i = 0; i < 5; i++) {
                // Example: total spots is always 100; available spots change each iteration.
                int totalSpots = 100;
                int availableSpots = 100 - (i * 10); // decreasing availability
                String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

                AvailableSpotsResponse response = AvailableSpotsResponse.newBuilder()
                        .setTotalSpots(totalSpots)
                        .setAvailableSpots(availableSpots)
                        .setTimestamp(timestamp)
                        .build();
                // Send each response to the client
                responseObserver.onNext(response);
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {
            // Pass the error to the client if something goes wrong
            responseObserver.onError(e);
        }
        // Indicate that the streaming is complete
        responseObserver.onCompleted();
    }

    // Implements the GetParkingSpaceStatus streaming RPC
    @Override
    public void getParkingSpaceStatus(ParkingSpaceStatusRequest request, StreamObserver<ParkingSpaceStatusResponse> responseObserver) {
        String parkingZoneId = request.getParkingZoneId();
        System.out.println("Received GetParkingSpaceStatus request for parkingZoneId: " + parkingZoneId);

        // Simulate status updates for three parking spots
        String[] spotIds = {"A1", "A2", "A3", "A4", "A5", "A6","B1", "B2", "B3", "B4", "B5", "B6","C1", "C2", "C3", "C4", "C5", "C6"};
        String[] statuses = {"available", "occupied", "maintenance"};

        Random random = new Random();
        for(String spot : spotIds){
            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            String status = statuses[random.nextInt(statuses.length)];
            ParkingSpaceStatusResponse response = ParkingSpaceStatusResponse.newBuilder().setSpotId(spot).setStatus(status).setTimestamp(timestamp).build;
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }
}
