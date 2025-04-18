/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buf.smartparkinglot;

/**
 *
 * @author 19835
 */
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import javax.swing.*;
import java.awt.*;

import buf.smartparkinglot.ParkingAvailabilityClient;
import buf.smartparkinglot.ParkingPaymentClient;
import buf.smartparkinglot.ParkingReservationClient;

import generated.smartparkinglot.ParkingAvailability.*;
import generated.smartparkinglot.ParkingPayment.*;
import generated.smartparkinglot.ParkingReservation.*;

import buf.jmDNS.GrpcServiceDiscovery;

public class GrpcClientGUI extends JFrame {

    private final JTextField availabilityZoneIdField = new JTextField(15);
    private final JTextField paymentZoneIdField = new JTextField(15);
    private final JTextField reservationZoneIdField = new JTextField(15);
    private final JTextField spotIdField = new JTextField(15);
    private final JTextField userIdField = new JTextField(15);
    private final JTextField durationField = new JTextField(15);
    private final JTextField startTimeField = new JTextField(15);
    private final JTextField endTimeField = new JTextField(15);
    private final JTextField reservationIdField = new JTextField(15);
    private final JTextField reservationUserIdField = new JTextField(15);
    private final JTextArea outputArea = new JTextArea(10, 80);

    private ParkingAvailabilityClient availabilityClient;
    private ParkingPaymentClient paymentClient;
    private ParkingReservationClient reservationClient;

    public GrpcClientGUI() {
        setTitle("Smart Parking Lot Client");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        outputArea.setEditable(false);

        initGrpcClients();

        JTabbedPane tabs = new JTabbedPane();
        tabs.add("Availability", buildAvailabilityPanel());
        tabs.add("Reservation", buildReservationPanel());
        tabs.add("Payment", buildPaymentPanel());

        add(tabs, BorderLayout.CENTER);
        add(new JScrollPane(outputArea), BorderLayout.SOUTH);
    }

    private void initGrpcClients() {
        GrpcServiceDiscovery discovery = new GrpcServiceDiscovery();
        discovery.discoverService("_grpc._tcp.local.", (host, port) -> {
            System.out.println("Discovered service at " + host + ":" + port);
            ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
            availabilityClient = new ParkingAvailabilityClient(channel);
            paymentClient = new ParkingPaymentClient(channel);
            reservationClient = new ParkingReservationClient(channel);
        });
    }

    private JPanel buildAvailabilityPanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Zone Info"));
        inputPanel.add(new JLabel("Parking Zone ID:"));
        inputPanel.add(availabilityZoneIdField);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        buttonPanel.setBorder(BorderFactory.createTitledBorder("Actions"));
        JButton getRealTimeBtn = new JButton("Get Real-Time Availability");
        JButton getStatusBtn = new JButton("Get Space Status");

        getRealTimeBtn.addActionListener(e -> getRealTimeAvailability());
        getStatusBtn.addActionListener(e -> getSpaceStatus());

        buttonPanel.add(getRealTimeBtn);
        buttonPanel.add(getStatusBtn);

        panel.add(inputPanel, BorderLayout.NORTH);
        panel.add(buttonPanel, BorderLayout.CENTER);
        return panel;
    }

    private JPanel buildReservationPanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBorder(BorderFactory.createTitledBorder("Reservation Info"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        addFormRow(formPanel, gbc, 0, "User ID:", reservationUserIdField);
        addFormRow(formPanel, gbc, 1, "Zone ID:", reservationZoneIdField);
        addFormRow(formPanel, gbc, 2, "Spot ID:", spotIdField);
        addFormRow(formPanel, gbc, 3, "Start Time:", startTimeField);
        addFormRow(formPanel, gbc, 4, "End Time:", endTimeField);
        addFormRow(formPanel, gbc, 5, "Reservation ID:", reservationIdField);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        buttonPanel.setBorder(BorderFactory.createTitledBorder("Actions"));
        JButton reserveBtn = new JButton("Reserve Spot");
        JButton cancelBtn = new JButton("Cancel Reservation");
        JButton checkStatusBtn = new JButton("Check Status");

        reserveBtn.addActionListener(e -> reserveParkingSpot());
        cancelBtn.addActionListener(e -> cancelReservation());
        checkStatusBtn.addActionListener(e -> checkReservationStatus());

        buttonPanel.add(reserveBtn);
        buttonPanel.add(cancelBtn);
        buttonPanel.add(checkStatusBtn);

        panel.add(formPanel, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);
        return panel;
    }

    private JPanel buildPaymentPanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        JPanel inputPanel = new JPanel(new GridBagLayout());
        inputPanel.setBorder(BorderFactory.createTitledBorder("Payment Info"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        addFormRow(inputPanel, gbc, 0, "User ID:", userIdField);
        addFormRow(inputPanel, gbc, 1, "Zone ID:", paymentZoneIdField);
        addFormRow(inputPanel, gbc, 2, "Duration (minutes):", durationField);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        buttonPanel.setBorder(BorderFactory.createTitledBorder("Actions"));
        JButton calcFeeBtn = new JButton("Calculate Fee");
        JButton handlePaymentBtn = new JButton("Handle Payment");

        calcFeeBtn.addActionListener(e -> calculateFee());
        handlePaymentBtn.addActionListener(e -> handlePayment());

        buttonPanel.add(calcFeeBtn);
        buttonPanel.add(handlePaymentBtn);

        panel.add(inputPanel, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);
        return panel;
    }

    private void addFormRow(JPanel panel, GridBagConstraints gbc, int row, String label, JTextField field) {
        gbc.gridx = 0;
        gbc.gridy = row;
        panel.add(new JLabel(label), gbc);
        gbc.gridx = 1;
        panel.add(field, gbc);
    }

    private void getRealTimeAvailability() {
        String zone = availabilityZoneIdField.getText().trim();
        availabilityClient.getRealTimeAvailability(zone, new StreamObserver<AvailableSpotsResponse>() {
            @Override
            public void onNext(AvailableSpotsResponse value) {
                appendOutput("Available: " + value.getAvailableSpots() + "/" + value.getTotalSpots()
                        + "\nTimestamp: " + value.getTimestamp() + "\n\n");
            }

            @Override
            public void onError(Throwable t) {
                appendOutput("Error: " + t.getMessage() + "\n");
            }

            @Override
            public void onCompleted() {
                appendOutput("Done receiving availability.\n\n");
            }
        });
    }

    private void getSpaceStatus() {
        String zone = availabilityZoneIdField.getText().trim();
        availabilityClient.getParkingSpaceStatus(zone, new StreamObserver<ParkingSpaceStatusResponse>() {
            @Override
            public void onNext(ParkingSpaceStatusResponse value) {
                appendOutput("Spot " + value.getSpotId() + " - " + value.getStatus()
                        + " (Time: " + value.getTimestamp() + ")\n");
            }

            @Override
            public void onError(Throwable t) {
                appendOutput("Error: " + t.getMessage() + "\n");
            }

            @Override
            public void onCompleted() {
                appendOutput("Done receiving spot statuses.\n\n");
            }
        });
    }
    
    private void reserveParkingSpot(){
        String userId = reservationUserIdField.getText().trim();
    String zoneId = reservationZoneIdField.getText().trim();
    String spotId = spotIdField.getText().trim();
    String start = startTimeField.getText().trim();
    String end = endTimeField.getText().trim();

    ReservationRequest request = ReservationRequest.newBuilder()
            .setUserId(userId)
            .setParkingZoneId(zoneId)
            .setSpotId(spotId)
            .setStartTime(start)
            .setEndTime(end)
            .build();

    reservationClient.reserveParkingSpaces(
            java.util.List.of(request),
            new StreamObserver<ReservationResponse>() {
                @Override
                public void onNext(ReservationResponse response) {
                    appendOutput("Reservation ID: " + response.getReservationId() +
                            " | Success: " + response.getSuccess() + "\n");
                }

                @Override
                public void onError(Throwable t) {
                    appendOutput("Reservation Error: " + t.getMessage() + "\n");
                }

                @Override
                public void onCompleted() {
                    appendOutput("Reservation process completed.\n\n");
                }
            }
    );
    }

    private void calculateFee() {
        String userId = userIdField.getText().trim();
        String parkingZoneId = reservationZoneIdField.getText().trim();
        String parkingDuration = durationField.getText().trim();
        
        PaymentResponse response = paymentClient.getParkingFee(userId, parkingZoneId, parkingDuration);
        appendOutput("Fee: $" + response.getFeeAmount() + " " + response.getCurrency()
                + " | Transaction ID: " + response.getTransactionId() + " | Status: " + response.getStatus() + "\n\n");
    }

    private void handlePayment() {
        paymentClient.handlePayment(new StreamObserver<PaymentStatus>() {
            @Override
            public void onNext(PaymentStatus value) {
                appendOutput("Payment " + value.getStatus() + " | Message: " + value.getMessage()
                        + " | Transaction ID: " + value.getTransactionId() + "\n\n");
            }

            @Override
            public void onError(Throwable t) {
                appendOutput("Payment Error: " + t.getMessage() + "\n");
            }

            @Override
            public void onCompleted() {
                appendOutput("Payment stream completed.\n\n");
            }
        });
    }
    


    private void cancelReservation() {
        String reservationId = reservationIdField.getText().trim();
        reservationClient.cancelReservation(reservationId);
        appendOutput("Cancellation request sent for ID: " + reservationId + "\n");
    }

    private void checkReservationStatus() {
        String reservationId = reservationIdField.getText().trim();
        try {
            CheckStatusResponse response = reservationClient.checkReservationStatus(reservationId);
            appendOutput("Reservation Status:\n" +
                    "User ID: " + response.getUserId() + "\n" +
                    "Spot ID: " + response.getSpotId() + "\n" +
                    "Status: " + response.getStatus() + "\n" +
                    "Start Time: " + response.getStartTime() + "\n" +
                    "End Time: " + response.getEndTime() + "\n" +
                    "Message: " + response.getMessage() + "\n" +
                    "Success: " + response.getSuccess() + "\n\n");
        } catch (Exception e) {
            appendOutput("Check Status Error: " + e.getMessage() + "\n");
        }
    }



    private void appendOutput(String text) {
        SwingUtilities.invokeLater(() -> outputArea.append(text));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GrpcClientGUI gui = new GrpcClientGUI();
            gui.setVisible(true);
        });
    }
}
