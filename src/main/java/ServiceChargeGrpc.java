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
 * <pre>
 * Service definition for GExchange
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: price.proto")
public final class ServiceChargeGrpc {

  private ServiceChargeGrpc() {}

  public static final String SERVICE_NAME = "ServiceCharge";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Price.hospitalprice,
      Price.service_price> getGetPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get_price",
      requestType = Price.hospitalprice.class,
      responseType = Price.service_price.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Price.hospitalprice,
      Price.service_price> getGetPriceMethod() {
    io.grpc.MethodDescriptor<Price.hospitalprice, Price.service_price> getGetPriceMethod;
    if ((getGetPriceMethod = ServiceChargeGrpc.getGetPriceMethod) == null) {
      synchronized (ServiceChargeGrpc.class) {
        if ((getGetPriceMethod = ServiceChargeGrpc.getGetPriceMethod) == null) {
          ServiceChargeGrpc.getGetPriceMethod = getGetPriceMethod = 
              io.grpc.MethodDescriptor.<Price.hospitalprice, Price.service_price>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ServiceCharge", "get_price"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Price.hospitalprice.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Price.service_price.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceChargeMethodDescriptorSupplier("get_price"))
                  .build();
          }
        }
     }
     return getGetPriceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceChargeStub newStub(io.grpc.Channel channel) {
    return new ServiceChargeStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceChargeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServiceChargeBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceChargeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServiceChargeFutureStub(channel);
  }

  /**
   * <pre>
   * Service definition for GExchange
   * </pre>
   */
  public static abstract class ServiceChargeImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * get_price method definition
     * </pre>
     */
    public void getPrice(Price.hospitalprice request,
        io.grpc.stub.StreamObserver<Price.service_price> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPriceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPriceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Price.hospitalprice,
                Price.service_price>(
                  this, METHODID_GET_PRICE)))
          .build();
    }
  }

  /**
   * <pre>
   * Service definition for GExchange
   * </pre>
   */
  public static final class ServiceChargeStub extends io.grpc.stub.AbstractStub<ServiceChargeStub> {
    private ServiceChargeStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceChargeStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceChargeStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceChargeStub(channel, callOptions);
    }

    /**
     * <pre>
     * get_price method definition
     * </pre>
     */
    public void getPrice(Price.hospitalprice request,
        io.grpc.stub.StreamObserver<Price.service_price> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPriceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service definition for GExchange
   * </pre>
   */
  public static final class ServiceChargeBlockingStub extends io.grpc.stub.AbstractStub<ServiceChargeBlockingStub> {
    private ServiceChargeBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceChargeBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceChargeBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceChargeBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * get_price method definition
     * </pre>
     */
    public Price.service_price getPrice(Price.hospitalprice request) {
      return blockingUnaryCall(
          getChannel(), getGetPriceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service definition for GExchange
   * </pre>
   */
  public static final class ServiceChargeFutureStub extends io.grpc.stub.AbstractStub<ServiceChargeFutureStub> {
    private ServiceChargeFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceChargeFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceChargeFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceChargeFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * get_price method definition
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Price.service_price> getPrice(
        Price.hospitalprice request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPriceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRICE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServiceChargeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServiceChargeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PRICE:
          serviceImpl.getPrice((Price.hospitalprice) request,
              (io.grpc.stub.StreamObserver<Price.service_price>) responseObserver);
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

  private static abstract class ServiceChargeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceChargeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Price.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServiceCharge");
    }
  }

  private static final class ServiceChargeFileDescriptorSupplier
      extends ServiceChargeBaseDescriptorSupplier {
    ServiceChargeFileDescriptorSupplier() {}
  }

  private static final class ServiceChargeMethodDescriptorSupplier
      extends ServiceChargeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceChargeMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServiceChargeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceChargeFileDescriptorSupplier())
              .addMethod(getGetPriceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
