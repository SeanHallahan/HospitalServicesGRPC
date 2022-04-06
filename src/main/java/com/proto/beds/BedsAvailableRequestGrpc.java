package com.proto.beds;

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
 *Remote procedure code within
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: beds.proto")
public final class BedsAvailableRequestGrpc {

  private BedsAvailableRequestGrpc() {}

  public static final String SERVICE_NAME = "hostpitalservicesbeds.BedsAvailableRequest";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.beds.WelcomeRequest,
      com.proto.beds.BedsAvailableResponse> getSayWelcomeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sayWelcome",
      requestType = com.proto.beds.WelcomeRequest.class,
      responseType = com.proto.beds.BedsAvailableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.beds.WelcomeRequest,
      com.proto.beds.BedsAvailableResponse> getSayWelcomeMethod() {
    io.grpc.MethodDescriptor<com.proto.beds.WelcomeRequest, com.proto.beds.BedsAvailableResponse> getSayWelcomeMethod;
    if ((getSayWelcomeMethod = BedsAvailableRequestGrpc.getSayWelcomeMethod) == null) {
      synchronized (BedsAvailableRequestGrpc.class) {
        if ((getSayWelcomeMethod = BedsAvailableRequestGrpc.getSayWelcomeMethod) == null) {
          BedsAvailableRequestGrpc.getSayWelcomeMethod = getSayWelcomeMethod = 
              io.grpc.MethodDescriptor.<com.proto.beds.WelcomeRequest, com.proto.beds.BedsAvailableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "hostpitalservicesbeds.BedsAvailableRequest", "sayWelcome"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.beds.WelcomeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.beds.BedsAvailableResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BedsAvailableRequestMethodDescriptorSupplier("sayWelcome"))
                  .build();
          }
        }
     }
     return getSayWelcomeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BedsAvailableRequestStub newStub(io.grpc.Channel channel) {
    return new BedsAvailableRequestStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BedsAvailableRequestBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BedsAvailableRequestBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BedsAvailableRequestFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BedsAvailableRequestFutureStub(channel);
  }

  /**
   * <pre>
   *Remote procedure code within
   * </pre>
   */
  public static abstract class BedsAvailableRequestImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Simple/Unary RPC
     * </pre>
     */
    public void sayWelcome(com.proto.beds.WelcomeRequest request,
        io.grpc.stub.StreamObserver<com.proto.beds.BedsAvailableResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSayWelcomeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayWelcomeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.beds.WelcomeRequest,
                com.proto.beds.BedsAvailableResponse>(
                  this, METHODID_SAY_WELCOME)))
          .build();
    }
  }

  /**
   * <pre>
   *Remote procedure code within
   * </pre>
   */
  public static final class BedsAvailableRequestStub extends io.grpc.stub.AbstractStub<BedsAvailableRequestStub> {
    private BedsAvailableRequestStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BedsAvailableRequestStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BedsAvailableRequestStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BedsAvailableRequestStub(channel, callOptions);
    }

    /**
     * <pre>
     *Simple/Unary RPC
     * </pre>
     */
    public void sayWelcome(com.proto.beds.WelcomeRequest request,
        io.grpc.stub.StreamObserver<com.proto.beds.BedsAvailableResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayWelcomeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *Remote procedure code within
   * </pre>
   */
  public static final class BedsAvailableRequestBlockingStub extends io.grpc.stub.AbstractStub<BedsAvailableRequestBlockingStub> {
    private BedsAvailableRequestBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BedsAvailableRequestBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BedsAvailableRequestBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BedsAvailableRequestBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Simple/Unary RPC
     * </pre>
     */
    public com.proto.beds.BedsAvailableResponse sayWelcome(com.proto.beds.WelcomeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayWelcomeMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Remote procedure code within
   * </pre>
   */
  public static final class BedsAvailableRequestFutureStub extends io.grpc.stub.AbstractStub<BedsAvailableRequestFutureStub> {
    private BedsAvailableRequestFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BedsAvailableRequestFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BedsAvailableRequestFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BedsAvailableRequestFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Simple/Unary RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.beds.BedsAvailableResponse> sayWelcome(
        com.proto.beds.WelcomeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayWelcomeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_WELCOME = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BedsAvailableRequestImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BedsAvailableRequestImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_WELCOME:
          serviceImpl.sayWelcome((com.proto.beds.WelcomeRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.beds.BedsAvailableResponse>) responseObserver);
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

  private static abstract class BedsAvailableRequestBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BedsAvailableRequestBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.beds.BedsServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BedsAvailableRequest");
    }
  }

  private static final class BedsAvailableRequestFileDescriptorSupplier
      extends BedsAvailableRequestBaseDescriptorSupplier {
    BedsAvailableRequestFileDescriptorSupplier() {}
  }

  private static final class BedsAvailableRequestMethodDescriptorSupplier
      extends BedsAvailableRequestBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BedsAvailableRequestMethodDescriptorSupplier(String methodName) {
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
      synchronized (BedsAvailableRequestGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BedsAvailableRequestFileDescriptorSupplier())
              .addMethod(getSayWelcomeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
