package generated.smartparkinglot.ParkingAvailability;

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
    comments = "Source: ParkingAvailabilityService.proto")
public final class ParkingAvailabilityServiceGrpc {

  private ParkingAvailabilityServiceGrpc() {}

  public static final String SERVICE_NAME = "ParkingAvailabilityService.ParkingAvailabilityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.smartparkinglot.ParkingAvailability.AvailableSpotsRequest,
      generated.smartparkinglot.ParkingAvailability.AvailableSpotsResponse> getGetRealTimeAvailabilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRealTimeAvailability",
      requestType = generated.smartparkinglot.ParkingAvailability.AvailableSpotsRequest.class,
      responseType = generated.smartparkinglot.ParkingAvailability.AvailableSpotsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generated.smartparkinglot.ParkingAvailability.AvailableSpotsRequest,
      generated.smartparkinglot.ParkingAvailability.AvailableSpotsResponse> getGetRealTimeAvailabilityMethod() {
    io.grpc.MethodDescriptor<generated.smartparkinglot.ParkingAvailability.AvailableSpotsRequest, generated.smartparkinglot.ParkingAvailability.AvailableSpotsResponse> getGetRealTimeAvailabilityMethod;
    if ((getGetRealTimeAvailabilityMethod = ParkingAvailabilityServiceGrpc.getGetRealTimeAvailabilityMethod) == null) {
      synchronized (ParkingAvailabilityServiceGrpc.class) {
        if ((getGetRealTimeAvailabilityMethod = ParkingAvailabilityServiceGrpc.getGetRealTimeAvailabilityMethod) == null) {
          ParkingAvailabilityServiceGrpc.getGetRealTimeAvailabilityMethod = getGetRealTimeAvailabilityMethod = 
              io.grpc.MethodDescriptor.<generated.smartparkinglot.ParkingAvailability.AvailableSpotsRequest, generated.smartparkinglot.ParkingAvailability.AvailableSpotsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ParkingAvailabilityService.ParkingAvailabilityService", "GetRealTimeAvailability"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartparkinglot.ParkingAvailability.AvailableSpotsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartparkinglot.ParkingAvailability.AvailableSpotsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingAvailabilityServiceMethodDescriptorSupplier("GetRealTimeAvailability"))
                  .build();
          }
        }
     }
     return getGetRealTimeAvailabilityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusRequest,
      generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse> getGetParkingSpaceStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetParkingSpaceStatus",
      requestType = generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusRequest.class,
      responseType = generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusRequest,
      generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse> getGetParkingSpaceStatusMethod() {
    io.grpc.MethodDescriptor<generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusRequest, generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse> getGetParkingSpaceStatusMethod;
    if ((getGetParkingSpaceStatusMethod = ParkingAvailabilityServiceGrpc.getGetParkingSpaceStatusMethod) == null) {
      synchronized (ParkingAvailabilityServiceGrpc.class) {
        if ((getGetParkingSpaceStatusMethod = ParkingAvailabilityServiceGrpc.getGetParkingSpaceStatusMethod) == null) {
          ParkingAvailabilityServiceGrpc.getGetParkingSpaceStatusMethod = getGetParkingSpaceStatusMethod = 
              io.grpc.MethodDescriptor.<generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusRequest, generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ParkingAvailabilityService.ParkingAvailabilityService", "GetParkingSpaceStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingAvailabilityServiceMethodDescriptorSupplier("GetParkingSpaceStatus"))
                  .build();
          }
        }
     }
     return getGetParkingSpaceStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ParkingAvailabilityServiceStub newStub(io.grpc.Channel channel) {
    return new ParkingAvailabilityServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ParkingAvailabilityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ParkingAvailabilityServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ParkingAvailabilityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ParkingAvailabilityServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ParkingAvailabilityServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get real-time information about vacant parking spaces in a parking lot
     * </pre>
     */
    public void getRealTimeAvailability(generated.smartparkinglot.ParkingAvailability.AvailableSpotsRequest request,
        io.grpc.stub.StreamObserver<generated.smartparkinglot.ParkingAvailability.AvailableSpotsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRealTimeAvailabilityMethod(), responseObserver);
    }

    /**
     */
    public void getParkingSpaceStatus(generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusRequest request,
        io.grpc.stub.StreamObserver<generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetParkingSpaceStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRealTimeAvailabilityMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                generated.smartparkinglot.ParkingAvailability.AvailableSpotsRequest,
                generated.smartparkinglot.ParkingAvailability.AvailableSpotsResponse>(
                  this, METHODID_GET_REAL_TIME_AVAILABILITY)))
          .addMethod(
            getGetParkingSpaceStatusMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusRequest,
                generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse>(
                  this, METHODID_GET_PARKING_SPACE_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class ParkingAvailabilityServiceStub extends io.grpc.stub.AbstractStub<ParkingAvailabilityServiceStub> {
    private ParkingAvailabilityServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParkingAvailabilityServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingAvailabilityServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParkingAvailabilityServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get real-time information about vacant parking spaces in a parking lot
     * </pre>
     */
    public void getRealTimeAvailability(generated.smartparkinglot.ParkingAvailability.AvailableSpotsRequest request,
        io.grpc.stub.StreamObserver<generated.smartparkinglot.ParkingAvailability.AvailableSpotsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetRealTimeAvailabilityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getParkingSpaceStatus(generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusRequest request,
        io.grpc.stub.StreamObserver<generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetParkingSpaceStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ParkingAvailabilityServiceBlockingStub extends io.grpc.stub.AbstractStub<ParkingAvailabilityServiceBlockingStub> {
    private ParkingAvailabilityServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParkingAvailabilityServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingAvailabilityServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParkingAvailabilityServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get real-time information about vacant parking spaces in a parking lot
     * </pre>
     */
    public java.util.Iterator<generated.smartparkinglot.ParkingAvailability.AvailableSpotsResponse> getRealTimeAvailability(
        generated.smartparkinglot.ParkingAvailability.AvailableSpotsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetRealTimeAvailabilityMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse> getParkingSpaceStatus(
        generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetParkingSpaceStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ParkingAvailabilityServiceFutureStub extends io.grpc.stub.AbstractStub<ParkingAvailabilityServiceFutureStub> {
    private ParkingAvailabilityServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParkingAvailabilityServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingAvailabilityServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParkingAvailabilityServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_REAL_TIME_AVAILABILITY = 0;
  private static final int METHODID_GET_PARKING_SPACE_STATUS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ParkingAvailabilityServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ParkingAvailabilityServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_REAL_TIME_AVAILABILITY:
          serviceImpl.getRealTimeAvailability((generated.smartparkinglot.ParkingAvailability.AvailableSpotsRequest) request,
              (io.grpc.stub.StreamObserver<generated.smartparkinglot.ParkingAvailability.AvailableSpotsResponse>) responseObserver);
          break;
        case METHODID_GET_PARKING_SPACE_STATUS:
          serviceImpl.getParkingSpaceStatus((generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusRequest) request,
              (io.grpc.stub.StreamObserver<generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ParkingAvailabilityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ParkingAvailabilityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.smartparkinglot.ParkingAvailability.ParkingAvailabilityServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ParkingAvailabilityService");
    }
  }

  private static final class ParkingAvailabilityServiceFileDescriptorSupplier
      extends ParkingAvailabilityServiceBaseDescriptorSupplier {
    ParkingAvailabilityServiceFileDescriptorSupplier() {}
  }

  private static final class ParkingAvailabilityServiceMethodDescriptorSupplier
      extends ParkingAvailabilityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ParkingAvailabilityServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ParkingAvailabilityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ParkingAvailabilityServiceFileDescriptorSupplier())
              .addMethod(getGetRealTimeAvailabilityMethod())
              .addMethod(getGetParkingSpaceStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
