/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buf.smartparkinglot;

/**
 *
 * @author 19835
 */
import generated.smartparkinglot.ParkingAvailability.ParkingAvailabilityServiceGrpc;
import generated.smartparkinglot.ParkingAvailability.*;
import io.grpc.ManagedChannel;
import io.grpc.stub.StreamObserver;

public class ParkingAvailabilityClient {
    private final ParkingAvailabilityServiceGrpc.ParkingAvailabilityServiceStub asyncStub;

    public ParkingAvailabilityClient(ManagedChannel channel) {
        this.asyncStub = ParkingAvailabilityServiceGrpc.newStub(channel);
    }

    public void getRealTimeAvailability(String zoneId, StreamObserver<AvailableSpotsResponse> responseObserver) {
        AvailableSpotsRequest request = AvailableSpotsRequest.newBuilder()
                .setParkingZoneId(zoneId)
                .build();
        asyncStub.getRealTimeAvailability(request, responseObserver);
    }

    public void getParkingSpaceStatus(String zoneId, StreamObserver<ParkingSpaceStatusResponse> responseObserver) {
        ParkingSpaceStatusRequest request = ParkingSpaceStatusRequest.newBuilder()
                .setParkingZoneId(zoneId)
                .build();
        asyncStub.getParkingSpaceStatus(request, responseObserver);
    }
}
