package generated.smartparkinglot.ParkingPayment;

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
    comments = "Source: ParkingPaymentService.proto")
public final class ParkingPaymentServiceGrpc {

  private ParkingPaymentServiceGrpc() {}

  public static final String SERVICE_NAME = "ParkingPaymentService.ParkingPaymentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.smartparkinglot.ParkingPayment.PaymentRequest,
      generated.smartparkinglot.ParkingPayment.PaymentResponse> getGetParkingFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetParkingFee",
      requestType = generated.smartparkinglot.ParkingPayment.PaymentRequest.class,
      responseType = generated.smartparkinglot.ParkingPayment.PaymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.smartparkinglot.ParkingPayment.PaymentRequest,
      generated.smartparkinglot.ParkingPayment.PaymentResponse> getGetParkingFeeMethod() {
    io.grpc.MethodDescriptor<generated.smartparkinglot.ParkingPayment.PaymentRequest, generated.smartparkinglot.ParkingPayment.PaymentResponse> getGetParkingFeeMethod;
    if ((getGetParkingFeeMethod = ParkingPaymentServiceGrpc.getGetParkingFeeMethod) == null) {
      synchronized (ParkingPaymentServiceGrpc.class) {
        if ((getGetParkingFeeMethod = ParkingPaymentServiceGrpc.getGetParkingFeeMethod) == null) {
          ParkingPaymentServiceGrpc.getGetParkingFeeMethod = getGetParkingFeeMethod = 
              io.grpc.MethodDescriptor.<generated.smartparkinglot.ParkingPayment.PaymentRequest, generated.smartparkinglot.ParkingPayment.PaymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ParkingPaymentService.ParkingPaymentService", "GetParkingFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartparkinglot.ParkingPayment.PaymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartparkinglot.ParkingPayment.PaymentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingPaymentServiceMethodDescriptorSupplier("GetParkingFee"))
                  .build();
          }
        }
     }
     return getGetParkingFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.smartparkinglot.ParkingPayment.PaymentInfo,
      generated.smartparkinglot.ParkingPayment.PaymentStatus> getHandlePaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandlePayment",
      requestType = generated.smartparkinglot.ParkingPayment.PaymentInfo.class,
      responseType = generated.smartparkinglot.ParkingPayment.PaymentStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<generated.smartparkinglot.ParkingPayment.PaymentInfo,
      generated.smartparkinglot.ParkingPayment.PaymentStatus> getHandlePaymentMethod() {
    io.grpc.MethodDescriptor<generated.smartparkinglot.ParkingPayment.PaymentInfo, generated.smartparkinglot.ParkingPayment.PaymentStatus> getHandlePaymentMethod;
    if ((getHandlePaymentMethod = ParkingPaymentServiceGrpc.getHandlePaymentMethod) == null) {
      synchronized (ParkingPaymentServiceGrpc.class) {
        if ((getHandlePaymentMethod = ParkingPaymentServiceGrpc.getHandlePaymentMethod) == null) {
          ParkingPaymentServiceGrpc.getHandlePaymentMethod = getHandlePaymentMethod = 
              io.grpc.MethodDescriptor.<generated.smartparkinglot.ParkingPayment.PaymentInfo, generated.smartparkinglot.ParkingPayment.PaymentStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ParkingPaymentService.ParkingPaymentService", "HandlePayment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartparkinglot.ParkingPayment.PaymentInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.smartparkinglot.ParkingPayment.PaymentStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingPaymentServiceMethodDescriptorSupplier("HandlePayment"))
                  .build();
          }
        }
     }
     return getHandlePaymentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ParkingPaymentServiceStub newStub(io.grpc.Channel channel) {
    return new ParkingPaymentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ParkingPaymentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ParkingPaymentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ParkingPaymentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ParkingPaymentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ParkingPaymentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getParkingFee(generated.smartparkinglot.ParkingPayment.PaymentRequest request,
        io.grpc.stub.StreamObserver<generated.smartparkinglot.ParkingPayment.PaymentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetParkingFeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Handles the exchange of information at multiple steps in the payment process
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.smartparkinglot.ParkingPayment.PaymentInfo> handlePayment(
        io.grpc.stub.StreamObserver<generated.smartparkinglot.ParkingPayment.PaymentStatus> responseObserver) {
      return asyncUnimplementedStreamingCall(getHandlePaymentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetParkingFeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.smartparkinglot.ParkingPayment.PaymentRequest,
                generated.smartparkinglot.ParkingPayment.PaymentResponse>(
                  this, METHODID_GET_PARKING_FEE)))
          .addMethod(
            getHandlePaymentMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                generated.smartparkinglot.ParkingPayment.PaymentInfo,
                generated.smartparkinglot.ParkingPayment.PaymentStatus>(
                  this, METHODID_HANDLE_PAYMENT)))
          .build();
    }
  }

  /**
   */
  public static final class ParkingPaymentServiceStub extends io.grpc.stub.AbstractStub<ParkingPaymentServiceStub> {
    private ParkingPaymentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParkingPaymentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingPaymentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParkingPaymentServiceStub(channel, callOptions);
    }

    /**
     */
    public void getParkingFee(generated.smartparkinglot.ParkingPayment.PaymentRequest request,
        io.grpc.stub.StreamObserver<generated.smartparkinglot.ParkingPayment.PaymentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetParkingFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Handles the exchange of information at multiple steps in the payment process
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.smartparkinglot.ParkingPayment.PaymentInfo> handlePayment(
        io.grpc.stub.StreamObserver<generated.smartparkinglot.ParkingPayment.PaymentStatus> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getHandlePaymentMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ParkingPaymentServiceBlockingStub extends io.grpc.stub.AbstractStub<ParkingPaymentServiceBlockingStub> {
    private ParkingPaymentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParkingPaymentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingPaymentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParkingPaymentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public generated.smartparkinglot.ParkingPayment.PaymentResponse getParkingFee(generated.smartparkinglot.ParkingPayment.PaymentRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetParkingFeeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ParkingPaymentServiceFutureStub extends io.grpc.stub.AbstractStub<ParkingPaymentServiceFutureStub> {
    private ParkingPaymentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParkingPaymentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingPaymentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParkingPaymentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.smartparkinglot.ParkingPayment.PaymentResponse> getParkingFee(
        generated.smartparkinglot.ParkingPayment.PaymentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetParkingFeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PARKING_FEE = 0;
  private static final int METHODID_HANDLE_PAYMENT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ParkingPaymentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ParkingPaymentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PARKING_FEE:
          serviceImpl.getParkingFee((generated.smartparkinglot.ParkingPayment.PaymentRequest) request,
              (io.grpc.stub.StreamObserver<generated.smartparkinglot.ParkingPayment.PaymentResponse>) responseObserver);
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
        case METHODID_HANDLE_PAYMENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.handlePayment(
              (io.grpc.stub.StreamObserver<generated.smartparkinglot.ParkingPayment.PaymentStatus>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ParkingPaymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ParkingPaymentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.smartparkinglot.ParkingPayment.ParkingPaymentServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ParkingPaymentService");
    }
  }

  private static final class ParkingPaymentServiceFileDescriptorSupplier
      extends ParkingPaymentServiceBaseDescriptorSupplier {
    ParkingPaymentServiceFileDescriptorSupplier() {}
  }

  private static final class ParkingPaymentServiceMethodDescriptorSupplier
      extends ParkingPaymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ParkingPaymentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ParkingPaymentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ParkingPaymentServiceFileDescriptorSupplier())
              .addMethod(getGetParkingFeeMethod())
              .addMethod(getHandlePaymentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
