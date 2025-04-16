/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buf.smartparkinglot;

/**
 *
 * @author 19835
 */
import generated.smartparkinglot.ParkingAvailability.*;
import generated.smartparkinglot.ParkingPayment.*;
import generated.smartparkinglot.ParkingReservation.*;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import javax.swing.*;
import java.awt.*;

public class GrpcClientGUI extends JFrame {

    private JTextField zoneIdField;
    private JTextField spotIdField;
    private JTextField userIdField;
    private JTextField durationField;

    private JTextField startTimeField;
    private JTextField endTimeField;
    private JTextField reservationIdField;

    private JTextArea outputArea;
    
    //manage server discover 
    private ManagedChannel channel;
    private boolean connected = false;
    
    private ParkingAvailabilityServiceGrpc.ParkingAvailabilityServiceStub availabilityAsyncStub;
    private ParkingPaymentServiceGrpc.ParkingPaymentServiceStub paymentAsyncStub;
    private ParkingPaymentServiceGrpc.ParkingPaymentServiceBlockingStub paymentBlockingStub;
    private ParkingReservationServiceGrpc.ParkingReservationServiceStub reservationAsyncStub;
    private ParkingReservationServiceGrpc.ParkingReservationServiceBlockingStub reservationBlockingStub;

    public GrpcClientGUI() {
        setTitle("Smart Parking Lot Client");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
        availabilityAsyncStub = ParkingAvailabilityServiceGrpc.newStub(channel);
        paymentAsyncStub = ParkingPaymentServiceGrpc.newStub(channel);
        paymentBlockingStub = ParkingPaymentServiceGrpc.newBlockingStub(channel);
        reservationAsyncStub = ParkingReservationServiceGrpc.newStub(channel);
        reservationBlockingStub = ParkingReservationServiceGrpc.newBlockingStub(channel);

        JTabbedPane tabs = new JTabbedPane();
        tabs.add("Availability", buildAvailabilityPanel());
        tabs.add("Reservation", buildReservationPanel());
        tabs.add("Payment", buildPaymentPanel());

        add(tabs, BorderLayout.CENTER);

        outputArea = new JTextArea(10, 80);
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea), BorderLayout.SOUTH);
    }

    private JPanel buildAvailabilityPanel() {
        JPanel panel = new JPanel(new GridLayout(3, 2));

        zoneIdField = new JTextField();

        JButton getRealTimeBtn = new JButton("Get Real-Time Availability");
        JButton getStatusBtn = new JButton("Get Space Status");

        panel.add(new JLabel("Parking Zone ID:"));
        panel.add(zoneIdField);
        panel.add(getRealTimeBtn);
        panel.add(getStatusBtn);

        getRealTimeBtn.addActionListener(e -> simulateRealTimeAvailability());
        getStatusBtn.addActionListener(e -> simulateSpaceStatus());

        return panel;
    }

    private JPanel buildReservationPanel() {
        JPanel panel = new JPanel(new GridLayout(6, 2));

        userIdField = new JTextField();
        spotIdField = new JTextField();
        startTimeField = new JTextField();
        endTimeField = new JTextField();
        reservationIdField = new JTextField();

        JButton reserveBtn = new JButton("Reserve Spot");
        JButton cancelBtn = new JButton("Cancel Reservation");
        JButton checkStatusBtn = new JButton("Check Status");

        panel.add(new JLabel("User ID:"));
        panel.add(userIdField);
        panel.add(new JLabel("Zone ID:"));
        panel.add(zoneIdField);
        panel.add(new JLabel("Spot ID:"));
        panel.add(spotIdField);
        panel.add(new JLabel("Start Time:"));
        panel.add(startTimeField);
        panel.add(new JLabel("End Time:"));
        panel.add(endTimeField);
        panel.add(new JLabel("Reservation ID:"));
        panel.add(reservationIdField);

        panel.add(reserveBtn);
        panel.add(cancelBtn);
        panel.add(checkStatusBtn);

        reserveBtn.addActionListener(e -> simulateReservation());
        cancelBtn.addActionListener(e -> simulateCancelReservation());
        checkStatusBtn.addActionListener(e -> simulateCheckStatus());

        return panel;
    }

    private JPanel buildPaymentPanel() {
        JPanel panel = new JPanel(new GridLayout(4, 2));

        durationField = new JTextField();

        JButton calcFeeBtn = new JButton("Calculate Fee");
        JButton handlePaymentBtn = new JButton("Handle Payment");

        panel.add(new JLabel("User ID:"));
        panel.add(userIdField);
        panel.add(new JLabel("Zone ID:"));
        panel.add(zoneIdField);
        panel.add(new JLabel("Duration:"));
        panel.add(durationField);

        panel.add(calcFeeBtn);
        panel.add(handlePaymentBtn);

        calcFeeBtn.addActionListener(e -> simulateCalculateFee());
        handlePaymentBtn.addActionListener(e -> simulateHandlePayment());

        return panel;
    }
    
    private void simulateRealTimeAvailability() {
        String zone = zoneIdField.getText().trim();
        AvailableSpotsRequest request = AvailableSpotsRequest.newBuilder().setParkingZoneId(zone).build();

        availabilityAsyncStub.getRealTimeAvailability(request, new StreamObserver<AvailableSpotsResponse>() {
            @Override
            public void onNext(AvailableSpotsResponse value) {
                SwingUtilities.invokeLater(() -> outputArea.append("Available: " + value.getAvailableSpots() + 
                        " / " + value.getTotalSpots() + "\nTimestamp: " + value.getTimestamp() + "\n\n"));
            }

            @Override
            public void onError(Throwable t) {
                SwingUtilities.invokeLater(() -> outputArea.append("Error: " + t.getMessage() + "\n"));
            }

            @Override
            public void onCompleted() {
                SwingUtilities.invokeLater(() -> outputArea.append("Done receiving availability.\n\n"));
            }
        });
    }

    private void simulateSpaceStatus() {
        String zone = zoneIdField.getText().trim();
        ParkingSpaceStatusRequest request = ParkingSpaceStatusRequest.newBuilder().setParkingZoneId(zone).build();

        availabilityAsyncStub.getParkingSpaceStatus(request, new StreamObserver<ParkingSpaceStatusResponse>() {
            @Override
            public void onNext(ParkingSpaceStatusResponse value) {
                SwingUtilities.invokeLater(() -> outputArea.append("Spot " + value.getSpotId() + " - " + value.getStatus() +
                        " (Time: " + value.getTimestamp() + ")\n"));
            }

            @Override
            public void onError(Throwable t) {
                SwingUtilities.invokeLater(() -> outputArea.append("Error: " + t.getMessage() + "\n"));
            }

            @Override
            public void onCompleted() {
                SwingUtilities.invokeLater(() -> outputArea.append("Done receiving spot statuses.\n\n"));
            }
        });
    }

    private void simulateCalculateFee() {
        PaymentRequest request = PaymentRequest.newBuilder()
                .setUserId(userIdField.getText().trim())
                .setParkingZoneId(zoneIdField.getText().trim())
                .setParkingDuration(durationField.getText().trim())
                .build();

        new Thread(() -> {
            try {
                PaymentResponse response = paymentBlockingStub.getParkingFee(request);
                SwingUtilities.invokeLater(() -> outputArea.append("Fee: $" + response.getFeeAmount() + " " + response.getCurrency() +
                        " | Transaction ID: " + response.getTransactionId() + " | Status: " + response.getStatus() + "\n\n"));
            } catch (Exception e) {
                SwingUtilities.invokeLater(() -> outputArea.append("Error: " + e.getMessage() + "\n"));
            }
        }).start();
    }

    private void simulateHandlePayment() {
        StreamObserver<PaymentInfo> requestObserver = paymentAsyncStub.handlePayment(new StreamObserver<PaymentStatus>() {
            @Override
            public void onNext(PaymentStatus value) {
                SwingUtilities.invokeLater(() -> outputArea.append("Payment " + value.getStatus() +
                        " | Message: " + value.getMessage() + " | Transaction ID: " + value.getTransactionId() + "\n\n"));
            }

            @Override
            public void onError(Throwable t) {
                SwingUtilities.invokeLater(() -> outputArea.append("Payment Error: " + t.getMessage() + "\n"));
            }

            @Override
            public void onCompleted() {
                SwingUtilities.invokeLater(() -> outputArea.append("Payment stream completed.\n\n"));
            }
        });

        PaymentInfo info = PaymentInfo.newBuilder()
                .setUserId(userIdField.getText().trim())
                .setAmount(10.50)
                .build();

        requestObserver.onNext(info);
        requestObserver.onCompleted();
    }

    private void simulateReservation() {
        StreamObserver<ReservationResponse> responseObserver = new StreamObserver<ReservationResponse>() {
            @Override
            public void onNext(ReservationResponse response) {
                SwingUtilities.invokeLater(() -> outputArea.append("Reservation " +
                        (response.getSuccess() ? "Success" : "Failed") +
                        " | ID: " + response.getReservationId() + " | Message: " + response.getMessage() + "\n\n"));
            }

            @Override
            public void onError(Throwable t) {
                SwingUtilities.invokeLater(() -> outputArea.append("Reservation Error: " + t.getMessage() + "\n"));
            }

            @Override
            public void onCompleted() {
                SwingUtilities.invokeLater(() -> outputArea.append("Reservation stream completed.\n\n"));
            }
        };

        StreamObserver<ReservationRequest> requestObserver = reservationAsyncStub.reserveParkingSpace(responseObserver);

        ReservationRequest req = ReservationRequest.newBuilder()
                .setUserId(userIdField.getText().trim())
                .setParkingZoneId(zoneIdField.getText().trim())
                .setSpotId(spotIdField.getText().trim())
                .setStartTime(startTimeField.getText().trim())
                .setEndTime(endTimeField.getText().trim())
                .build();

        requestObserver.onNext(req);
        requestObserver.onCompleted();
    }

    private void simulateCancelReservation() {
        CancelRequest request = CancelRequest.newBuilder().setReservationId(reservationIdField.getText().trim()).build();

        new Thread(() -> {
            try {
                CancelResponse response = reservationBlockingStub.cancelReservation(request);
                SwingUtilities.invokeLater(() -> outputArea.append("Cancellation " +
                        (response.getSuccess() ? "Success" : "Failed") +
                        " | Message: " + response.getMessage() + "\n\n"));
            } catch (Exception e) {
                SwingUtilities.invokeLater(() -> outputArea.append("Error: " + e.getMessage() + "\n"));
            }
        }).start();
    }

    private void simulateCheckStatus() {
        CheckStatusRequest request = CheckStatusRequest.newBuilder()
                .setReservationId(reservationIdField.getText().trim())
                .build();

        new Thread(() -> {
            try {
                CheckStatusResponse res = reservationBlockingStub.checkReservationStatus(request);
                SwingUtilities.invokeLater(() -> outputArea.append(
                        "User: " + res.getUserId() + "\nSpot: " + res.getSpotId() +
                                "\nStart: " + res.getStartTime() + "\nEnd: " + res.getEndTime() +
                                "\nStatus: " + res.getStatus() + "\n\n"));
            } catch (Exception e) {
                SwingUtilities.invokeLater(() -> outputArea.append("Error: " + e.getMessage() + "\n"));
            }
        }).start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GrpcClientGUI gui = new GrpcClientGUI();
            gui.setVisible(true);
        });
    }
}

