/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buf.smartparkinglot;

/**
 *
 * @author 19835
 */
import generated.smartparkinglot.ParkingPayment.ParkingPaymentServiceGrpc;
import generated.smartparkinglot.ParkingPayment.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class ParkingPaymentClient {
    private final ParkingPaymentServiceGrpc.ParkingPaymentServiceBlockingStub blockingStub;
    private final ParkingPaymentServiceGrpc.ParkingPaymentServiceStub asyncStub;

    public ParkingPaymentClient(ManagedChannel channel) {
        this.blockingStub = ParkingPaymentServiceGrpc.newBlockingStub(channel);
        this.asyncStub = ParkingPaymentServiceGrpc.newStub(channel);
    }

    public PaymentResponse getParkingFee(String userId, String parkingZoneId, String parkingDuration) {
        PaymentRequest request = PaymentRequest.newBuilder()
                .setUserId(userId)
                .setParkingZoneId(parkingZoneId)
                .setParkingDuration(parkingDuration)
                .build();
        return blockingStub.getParkingFee(request);
    }

    public StreamObserver<PaymentInfo> handlePayment(StreamObserver<PaymentStatus> responseObserver) {
        return asyncStub.handlePayment(responseObserver);
    }
}
