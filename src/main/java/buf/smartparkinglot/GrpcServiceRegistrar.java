/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buf.smartparkinglot;

/**
 *
 * @author 19835
 */
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;

/**
 * Registers a gRPC service using JmDNS.
 */
public class GrpcServiceRegistrar {

    private JmDNS jmdns;

    public void registerService(String serviceName, int port, String description) {
        try {
            jmdns = JmDNS.create(InetAddress.getLocalHost());
            ServiceInfo serviceInfo = ServiceInfo.create("_grpc._tcp.local.", serviceName, port, description);
            jmdns.registerService(serviceInfo);
            System.out.println("Registered service: " + serviceInfo);
        } catch (IOException e) {
            System.err.println("Error registering service: " + e.getMessage());
        }
    }

    public void unregisterAllServices() {
        if (jmdns != null) {
            jmdns.unregisterAllServices();
            System.out.println("🧹 Unregistered all services");
        }
    }
}
