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


// For DNS
import buf.jmDNS.*;

public class GrpcServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 5051;
        //start grpc server
        Server server = ServerBuilder.forPort(port)
                .addService(new ParkingAvailabilityServiceImpl())
                .addService(new ParkingPaymentServiceImpl())
                .addService(new ParkingReservationServiceImpl())
                .build();
        server.start();
        System.out.println("gRPC Server started on port " + port);
        
        //Register service via jmDNS
        GrpcServiceRegistrar registrar = new GrpcServiceRegistrar();
        registrar.registerService("SmartParkingGRPC", port, "gRPC service for smart parking lot");
        
        //Keep server alive
        server.awaitTermination();
    }
}
