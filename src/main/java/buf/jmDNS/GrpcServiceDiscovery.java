/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buf.jmDNS;

/**
 *
 * @author 19835
 */
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import java.io.IOException;
import java.net.InetAddress;

/**
 * Discovers a gRPC service using JmDNS.
 */
public class GrpcServiceDiscovery {

    public interface ServiceFoundCallback {
        void onServiceResolved(String host, int port);
    }

    public void discoverService(String serviceType, ServiceFoundCallback callback) {
        try {
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
            jmdns.addServiceListener(serviceType, new ServiceListener() {

                @Override
                public void serviceAdded(ServiceEvent event) {
                    // Trigger resolve
                    jmdns.requestServiceInfo(event.getType(), event.getName());
                }

                @Override
                public void serviceRemoved(ServiceEvent event) {
                    System.out.println("Service removed: " + event.getName());
                }

                @Override
                public void serviceResolved(ServiceEvent event) {
                    ServiceInfo info = event.getInfo();
                    String host = info.getHostAddresses()[0];
                    int port = info.getPort();
                    System.out.println("Resolved service: " + host + ":" + port);
                    callback.onServiceResolved(host, port);
                }
            });
        } catch (IOException e) {
            System.err.println("Error discovering service: " + e.getMessage());
        }
    }
}
