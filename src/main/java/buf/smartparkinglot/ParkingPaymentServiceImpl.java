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
import generated.smartparkinglot.ParkingPayment.*;

// Service implementation for ParkingPaymentService.
public class ParkingPaymentServiceImpl extends ParkingPaymentServiceGrpc.ParkingPaymentServiceImplBase {

    // Implements the GetParkingFee unary RPC
    @Override
    public void getParkingFee(PaymentRequest request, StreamObserver<PaymentResponse> responseObserver) {
        System.out.println("Received GetParkingFee request for userId: " + request.getUserId());
        // Simulate calculation of parking fee based on duration (for demo purposes, fixed fee)
        double feeAmount = 10.0;
        String currency = "USD";
        String transactionId = UUID.randomUUID().toString();
        String status = "PENDING";

        PaymentResponse response = PaymentResponse.newBuilder().setFeeAmount(feeAmount).setCurrency(currency).setTransactionId(transactionId).setStatus(status).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    // Implements the HandlePayment bidirectional streaming RPC
    @Override
    public StreamObserver<PaymentInfo> handlePayment(final StreamObserver<PaymentStatus> responseObserver) {
        return new StreamObserver<PaymentInfo>() {
            @Override
            public void onNext(PaymentInfo paymentInfo) {
                // For each payment info, simulate processing payment and send status update
                System.out.println("Received PaymentInfo for userId: " + paymentInfo.getUserId() + ", amount: " + paymentInfo.getAmount());
                // Simulate payment processing and always respond with success for demo
                PaymentStatus paymentStatus = PaymentStatus.newBuilder().setStatus("success").setMessage("Payment processed successfully").setTransactionId(UUID.randomUUID().toString()).build();
                responseObserver.onNext(paymentStatus);
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in handlePayment stream: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                // When the client completes sending the stream, end the server stream as well
                responseObserver.onCompleted();
            }
        };
    }
}
