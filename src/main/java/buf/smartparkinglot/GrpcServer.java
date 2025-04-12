/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buf.smartparkinglot;

/**
 *
 * @author 19835
 */
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;


public class GrpcServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        // Create a new gRPC server on port 50051 and register the services.
        Server server = ServerBuilder.forPort(50051).addService(new buf.smartparkinglot.ParkingAvailabilityServiceImpl()).addService(new buf.smartparkinglot.ParkingPaymentServiceImpl()).addService(new buf.smartparkinglot.ParkingReservationServiceImpl()).build();

        // Start the server
        server.start();
        System.out.println("gRPC Server started on port " + server.getPort());

        // Keep the server running until terminated
        server.awaitTermination();
    }
}
