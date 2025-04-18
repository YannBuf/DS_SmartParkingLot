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
import java.util.*;


// Service implementation for ParkingAvailabilityService.
public class ParkingAvailabilityServiceImpl extends ParkingAvailabilityServiceGrpc.ParkingAvailabilityServiceImplBase{

    private static final String[] STATUSES = {"available", "occupied", "maintenance"};
    private static final int TOTAL_SPOTS_PER_ZONE = 100;
    private static final List<String> ZONES = Arrays.asList("A", "B", "C", "D", "E");
    
    // For generating random data, used for simulating parking spot availability
    private final Random random = new Random();

    // Simulate Parking Lot Data
    private Map<String, List<String>> generateParkingSpots() {
        Map<String, List<String>> zoneSpots = new HashMap<>();
        for (String zone : ZONES) {
            List<String> spots = new ArrayList<>();
            for (int i = 1; i <= TOTAL_SPOTS_PER_ZONE; i++) {
                spots.add(zone + i);
            }
            zoneSpots.put(zone, spots);
        }
        return zoneSpots;
    }
    // Generate the parking spots data
    private final Map<String, List<String>> parkingSpotsByZone = generateParkingSpots();
    
    
    // Implements the GetRealTimeAvailability streaming RPC
    @Override
    public void getRealTimeAvailability(AvailableSpotsRequest request, StreamObserver<AvailableSpotsResponse> responseObserver) {

        // Get the parking zone ID from the request and convert it to uppercase
        String parkingZoneId = request.getParkingZoneId().toUpperCase();
        System.out.println("Received GetRealTimeAvailability request for parkingZoneId: " + parkingZoneId);
        
        // If the zone ID is not found in the list of available zones, return an error
        if(!parkingSpotsByZone.containsKey(parkingZoneId)){
            responseObserver.onError(new IllegalArgumentException("Zone '" + parkingZoneId + "' not found."));
            return;
        }
        
        try {
            for (int i = 0; i < 5; i++) {
                // Example: total spots is always 100; available spots change each iteration.
                int totalSpots = TOTAL_SPOTS_PER_ZONE;
                int availableSpots = random.nextInt(totalSpots + 1); // 0~100
                String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

                AvailableSpotsResponse response = AvailableSpotsResponse.newBuilder()
                        .setTotalSpots(totalSpots)
                        .setAvailableSpots(availableSpots)
                        .setTimestamp(timestamp)
                        .build();
                
                // Send the response to the client
                responseObserver.onNext(response);
                // Sleep for 1 second before sending the next update
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {
            // If an error occurs, notify the client
            responseObserver.onError(e);
        }
        responseObserver.onCompleted();
    }

    // Implements the GetParkingSpaceStatus streaming RPC
    @Override
    public void getParkingSpaceStatus(ParkingSpaceStatusRequest request, StreamObserver<ParkingSpaceStatusResponse> responseObserver) {
        // Get the parking zone ID from the request and convert it to uppercase
        String parkingZoneId = request.getParkingZoneId().toUpperCase();
        System.out.println("Received GetParkingSpaceStatus request for parkingZoneId: " + parkingZoneId);

        // If the zone ID is not found in the list of available zones, return an error
        if (!parkingSpotsByZone.containsKey(parkingZoneId)) {
            responseObserver.onError(new IllegalArgumentException("Zone '" + parkingZoneId + "' not found."));
            return;
        }

        // Get the list of spot IDs for the selected zone
        List<String> spotIds = parkingSpotsByZone.get(parkingZoneId);

        for (String spotId : spotIds) {
            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            // Randomly select a status for this parking spot (available, occupied, or maintenance)
            String status = STATUSES[random.nextInt(STATUSES.length)];

            ParkingSpaceStatusResponse response = ParkingSpaceStatusResponse.newBuilder()
                    .setSpotId(spotId)
                    .setStatus(status)
                    .setTimestamp(timestamp)
                    .build();

            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }
}
