package generated.smartparkinglot.ParkingReservation;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ParkingReservationService.proto")
public final class ParkingReservationServiceGrpc {

  private ParkingReservationServiceGrpc() {}

  public static final String SERVICE_NAME = "ParkingReservationService.ParkingReservationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.smartparkinglot.ParkingReservation.ReservationRequest,
      generated.smartparkinglot.ParkingReservation.ReservationResponse> getReserveParkingSpaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReserveParkingSpace",
      requestType = generated.smartparkinglot.ParkingReservation.ReservationRequest.class,
      responseType = generated.smartparkinglot.ParkingReservation.ReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<generated.smartparkinglot.ParkingReservation.ReservationRequest,
      generated.smartparkinglot.ParkingReservation.ReservationResponse> getReserveParkingSpaceMethod() {
    io.grpc.MethodDescriptor<generated.smartparkinglot.ParkingReservation.ReservationRequest, generated.smartparkinglot.ParkingReservation.ReservationResponse> getReserveParkingSpaceMethod;
    if ((getReserveParkingSpaceMethod = ParkingReservationServiceGrpc.getReserveParkingSpaceMethod) == null) {
      synchronized (ParkingReservationServiceGrpc.class) {
        if ((getReserveParkingSpaceMethod = ParkingReservationServiceGrpc.getReserveParkingSpaceMethod) == null) {
          ParkingReservationServiceGrpc.getReserveParkingSpaceMethod = getReserveParkingSpaceMethod = 
              io.grpc.MethodDescriptor.<generated.smartparkinglot.ParkingReservation.ReservationRequest, generated.smartparkinglot.ParkingReservation.ReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ParkingReservationService.ParkingReservationService", "ReserveParkingSpace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartparkinglot.ParkingReservation.ReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartparkinglot.ParkingReservation.ReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingReservationServiceMethodDescriptorSupplier("ReserveParkingSpace"))
                  .build();
          }
        }
     }
     return getReserveParkingSpaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.smartparkinglot.ParkingReservation.CancelRequest,
      generated.smartparkinglot.ParkingReservation.CancelResponse> getCancelReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelReservation",
      requestType = generated.smartparkinglot.ParkingReservation.CancelRequest.class,
      responseType = generated.smartparkinglot.ParkingReservation.CancelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.smartparkinglot.ParkingReservation.CancelRequest,
      generated.smartparkinglot.ParkingReservation.CancelResponse> getCancelReservationMethod() {
    io.grpc.MethodDescriptor<generated.smartparkinglot.ParkingReservation.CancelRequest, generated.smartparkinglot.ParkingReservation.CancelResponse> getCancelReservationMethod;
    if ((getCancelReservationMethod = ParkingReservationServiceGrpc.getCancelReservationMethod) == null) {
      synchronized (ParkingReservationServiceGrpc.class) {
        if ((getCancelReservationMethod = ParkingReservationServiceGrpc.getCancelReservationMethod) == null) {
          ParkingReservationServiceGrpc.getCancelReservationMethod = getCancelReservationMethod = 
              io.grpc.MethodDescriptor.<generated.smartparkinglot.ParkingReservation.CancelRequest, generated.smartparkinglot.ParkingReservation.CancelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ParkingReservationService.ParkingReservationService", "CancelReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartparkinglot.ParkingReservation.CancelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartparkinglot.ParkingReservation.CancelResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingReservationServiceMethodDescriptorSupplier("CancelReservation"))
                  .build();
          }
        }
     }
     return getCancelReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.smartparkinglot.ParkingReservation.CheckStatusRequest,
      generated.smartparkinglot.ParkingReservation.CheckStatusResponse> getCheckReservationStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckReservationStatus",
      requestType = generated.smartparkinglot.ParkingReservation.CheckStatusRequest.class,
      responseType = generated.smartparkinglot.ParkingReservation.CheckStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.smartparkinglot.ParkingReservation.CheckStatusRequest,
      generated.smartparkinglot.ParkingReservation.CheckStatusResponse> getCheckReservationStatusMethod() {
    io.grpc.MethodDescriptor<generated.smartparkinglot.ParkingReservation.CheckStatusRequest, generated.smartparkinglot.ParkingReservation.CheckStatusResponse> getCheckReservationStatusMethod;
    if ((getCheckReservationStatusMethod = ParkingReservationServiceGrpc.getCheckReservationStatusMethod) == null) {
      synchronized (ParkingReservationServiceGrpc.class) {
        if ((getCheckReservationStatusMethod = ParkingReservationServiceGrpc.getCheckReservationStatusMethod) == null) {
          ParkingReservationServiceGrpc.getCheckReservationStatusMethod = getCheckReservationStatusMethod = 
              io.grpc.MethodDescriptor.<generated.smartparkinglot.ParkingReservation.CheckStatusRequest, generated.smartparkinglot.ParkingReservation.CheckStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ParkingReservationService.ParkingReservationService", "CheckReservationStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartparkinglot.ParkingReservation.CheckStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartparkinglot.ParkingReservation.CheckStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingReservationServiceMethodDescriptorSupplier("CheckReservationStatus"))
                  .build();
          }
        }
     }
     return getCheckReservationStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ParkingReservationServiceStub newStub(io.grpc.Channel channel) {
    return new ParkingReservationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ParkingReservationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ParkingReservationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ParkingReservationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ParkingReservationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ParkingReservationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Users can send multiple parking reservation requests in a row
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.smartparkinglot.ParkingReservation.ReservationRequest> reserveParkingSpace(
        io.grpc.stub.StreamObserver<generated.smartparkinglot.ParkingReservation.ReservationResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getReserveParkingSpaceMethod(), responseObserver);
    }

    /**
     */
    public void cancelReservation(generated.smartparkinglot.ParkingReservation.CancelRequest request,
        io.grpc.stub.StreamObserver<generated.smartparkinglot.ParkingReservation.CancelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelReservationMethod(), responseObserver);
    }

    /**
     */
    public void checkReservationStatus(generated.smartparkinglot.ParkingReservation.CheckStatusRequest request,
        io.grpc.stub.StreamObserver<generated.smartparkinglot.ParkingReservation.CheckStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckReservationStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReserveParkingSpaceMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                generated.smartparkinglot.ParkingReservation.ReservationRequest,
                generated.smartparkinglot.ParkingReservation.ReservationResponse>(
                  this, METHODID_RESERVE_PARKING_SPACE)))
          .addMethod(
            getCancelReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.smartparkinglot.ParkingReservation.CancelRequest,
                generated.smartparkinglot.ParkingReservation.CancelResponse>(
                  this, METHODID_CANCEL_RESERVATION)))
          .addMethod(
            getCheckReservationStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.smartparkinglot.ParkingReservation.CheckStatusRequest,
                generated.smartparkinglot.ParkingReservation.CheckStatusResponse>(
                  this, METHODID_CHECK_RESERVATION_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class ParkingReservationServiceStub extends io.grpc.stub.AbstractStub<ParkingReservationServiceStub> {
    private ParkingReservationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParkingReservationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingReservationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParkingReservationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Users can send multiple parking reservation requests in a row
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.smartparkinglot.ParkingReservation.ReservationRequest> reserveParkingSpace(
        io.grpc.stub.StreamObserver<generated.smartparkinglot.ParkingReservation.ReservationResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getReserveParkingSpaceMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void cancelReservation(generated.smartparkinglot.ParkingReservation.CancelRequest request,
        io.grpc.stub.StreamObserver<generated.smartparkinglot.ParkingReservation.CancelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkReservationStatus(generated.smartparkinglot.ParkingReservation.CheckStatusRequest request,
        io.grpc.stub.StreamObserver<generated.smartparkinglot.ParkingReservation.CheckStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckReservationStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ParkingReservationServiceBlockingStub extends io.grpc.stub.AbstractStub<ParkingReservationServiceBlockingStub> {
    private ParkingReservationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParkingReservationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingReservationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParkingReservationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public generated.smartparkinglot.ParkingReservation.CancelResponse cancelReservation(generated.smartparkinglot.ParkingReservation.CancelRequest request) {
      return blockingUnaryCall(
          getChannel(), getCancelReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.smartparkinglot.ParkingReservation.CheckStatusResponse checkReservationStatus(generated.smartparkinglot.ParkingReservation.CheckStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckReservationStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ParkingReservationServiceFutureStub extends io.grpc.stub.AbstractStub<ParkingReservationServiceFutureStub> {
    private ParkingReservationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParkingReservationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingReservationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParkingReservationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.smartparkinglot.ParkingReservation.CancelResponse> cancelReservation(
        generated.smartparkinglot.ParkingReservation.CancelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.smartparkinglot.ParkingReservation.CheckStatusResponse> checkReservationStatus(
        generated.smartparkinglot.ParkingReservation.CheckStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckReservationStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CANCEL_RESERVATION = 0;
  private static final int METHODID_CHECK_RESERVATION_STATUS = 1;
  private static final int METHODID_RESERVE_PARKING_SPACE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ParkingReservationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ParkingReservationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CANCEL_RESERVATION:
          serviceImpl.cancelReservation((generated.smartparkinglot.ParkingReservation.CancelRequest) request,
              (io.grpc.stub.StreamObserver<generated.smartparkinglot.ParkingReservation.CancelResponse>) responseObserver);
          break;
        case METHODID_CHECK_RESERVATION_STATUS:
          serviceImpl.checkReservationStatus((generated.smartparkinglot.ParkingReservation.CheckStatusRequest) request,
              (io.grpc.stub.StreamObserver<generated.smartparkinglot.ParkingReservation.CheckStatusResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RESERVE_PARKING_SPACE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.reserveParkingSpace(
              (io.grpc.stub.StreamObserver<generated.smartparkinglot.ParkingReservation.ReservationResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ParkingReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ParkingReservationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.smartparkinglot.ParkingReservation.ParkingReservationServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ParkingReservationService");
    }
  }

  private static final class ParkingReservationServiceFileDescriptorSupplier
      extends ParkingReservationServiceBaseDescriptorSupplier {
    ParkingReservationServiceFileDescriptorSupplier() {}
  }

  private static final class ParkingReservationServiceMethodDescriptorSupplier
      extends ParkingReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ParkingReservationServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ParkingReservationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ParkingReservationServiceFileDescriptorSupplier())
              .addMethod(getReserveParkingSpaceMethod())
              .addMethod(getCancelReservationMethod())
              .addMethod(getCheckReservationStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
