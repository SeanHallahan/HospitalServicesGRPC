package com.proto.patients;

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
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: patients.proto")
public final class PatientsServiceGrpc {

  private PatientsServiceGrpc() {}

  public static final String SERVICE_NAME = "hostpitalservicespatients.PatientsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.patients.CalculateRequest,
      com.proto.patients.CalculateResponse> getCalculateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "calculate",
      requestType = com.proto.patients.CalculateRequest.class,
      responseType = com.proto.patients.CalculateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.patients.CalculateRequest,
      com.proto.patients.CalculateResponse> getCalculateMethod() {
    io.grpc.MethodDescriptor<com.proto.patients.CalculateRequest, com.proto.patients.CalculateResponse> getCalculateMethod;
    if ((getCalculateMethod = PatientsServiceGrpc.getCalculateMethod) == null) {
      synchronized (PatientsServiceGrpc.class) {
        if ((getCalculateMethod = PatientsServiceGrpc.getCalculateMethod) == null) {
          PatientsServiceGrpc.getCalculateMethod = getCalculateMethod = 
              io.grpc.MethodDescriptor.<com.proto.patients.CalculateRequest, com.proto.patients.CalculateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "hostpitalservicespatients.PatientsService", "calculate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.patients.CalculateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.patients.CalculateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PatientsServiceMethodDescriptorSupplier("calculate"))
                  .build();
          }
        }
     }
     return getCalculateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.patients.RandomRequest,
      com.proto.patients.NumberResponse> getGenerateRandomNumbersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "generateRandomNumbers",
      requestType = com.proto.patients.RandomRequest.class,
      responseType = com.proto.patients.NumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.patients.RandomRequest,
      com.proto.patients.NumberResponse> getGenerateRandomNumbersMethod() {
    io.grpc.MethodDescriptor<com.proto.patients.RandomRequest, com.proto.patients.NumberResponse> getGenerateRandomNumbersMethod;
    if ((getGenerateRandomNumbersMethod = PatientsServiceGrpc.getGenerateRandomNumbersMethod) == null) {
      synchronized (PatientsServiceGrpc.class) {
        if ((getGenerateRandomNumbersMethod = PatientsServiceGrpc.getGenerateRandomNumbersMethod) == null) {
          PatientsServiceGrpc.getGenerateRandomNumbersMethod = getGenerateRandomNumbersMethod = 
              io.grpc.MethodDescriptor.<com.proto.patients.RandomRequest, com.proto.patients.NumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "hostpitalservicespatients.PatientsService", "generateRandomNumbers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.patients.RandomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.patients.NumberResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PatientsServiceMethodDescriptorSupplier("generateRandomNumbers"))
                  .build();
          }
        }
     }
     return getGenerateRandomNumbersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.patients.NumberMessage,
      com.proto.patients.CalculateResponse> getAverageValuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "averageValues",
      requestType = com.proto.patients.NumberMessage.class,
      responseType = com.proto.patients.CalculateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.patients.NumberMessage,
      com.proto.patients.CalculateResponse> getAverageValuesMethod() {
    io.grpc.MethodDescriptor<com.proto.patients.NumberMessage, com.proto.patients.CalculateResponse> getAverageValuesMethod;
    if ((getAverageValuesMethod = PatientsServiceGrpc.getAverageValuesMethod) == null) {
      synchronized (PatientsServiceGrpc.class) {
        if ((getAverageValuesMethod = PatientsServiceGrpc.getAverageValuesMethod) == null) {
          PatientsServiceGrpc.getAverageValuesMethod = getAverageValuesMethod = 
              io.grpc.MethodDescriptor.<com.proto.patients.NumberMessage, com.proto.patients.CalculateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "hostpitalservicespatients.PatientsService", "averageValues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.patients.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.patients.CalculateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PatientsServiceMethodDescriptorSupplier("averageValues"))
                  .build();
          }
        }
     }
     return getAverageValuesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.patients.ConvertMessage,
      com.proto.patients.ConvertResponse> getConvertBaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convertBase",
      requestType = com.proto.patients.ConvertMessage.class,
      responseType = com.proto.patients.ConvertResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.patients.ConvertMessage,
      com.proto.patients.ConvertResponse> getConvertBaseMethod() {
    io.grpc.MethodDescriptor<com.proto.patients.ConvertMessage, com.proto.patients.ConvertResponse> getConvertBaseMethod;
    if ((getConvertBaseMethod = PatientsServiceGrpc.getConvertBaseMethod) == null) {
      synchronized (PatientsServiceGrpc.class) {
        if ((getConvertBaseMethod = PatientsServiceGrpc.getConvertBaseMethod) == null) {
          PatientsServiceGrpc.getConvertBaseMethod = getConvertBaseMethod = 
              io.grpc.MethodDescriptor.<com.proto.patients.ConvertMessage, com.proto.patients.ConvertResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "hostpitalservicespatients.PatientsService", "convertBase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.patients.ConvertMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.patients.ConvertResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PatientsServiceMethodDescriptorSupplier("convertBase"))
                  .build();
          }
        }
     }
     return getConvertBaseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PatientsServiceStub newStub(io.grpc.Channel channel) {
    return new PatientsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PatientsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PatientsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PatientsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PatientsServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class PatientsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void calculate(com.proto.patients.CalculateRequest request,
        io.grpc.stub.StreamObserver<com.proto.patients.CalculateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCalculateMethod(), responseObserver);
    }

    /**
     */
    public void generateRandomNumbers(com.proto.patients.RandomRequest request,
        io.grpc.stub.StreamObserver<com.proto.patients.NumberResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateRandomNumbersMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.patients.NumberMessage> averageValues(
        io.grpc.stub.StreamObserver<com.proto.patients.CalculateResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAverageValuesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.patients.ConvertMessage> convertBase(
        io.grpc.stub.StreamObserver<com.proto.patients.ConvertResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getConvertBaseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCalculateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.patients.CalculateRequest,
                com.proto.patients.CalculateResponse>(
                  this, METHODID_CALCULATE)))
          .addMethod(
            getGenerateRandomNumbersMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.patients.RandomRequest,
                com.proto.patients.NumberResponse>(
                  this, METHODID_GENERATE_RANDOM_NUMBERS)))
          .addMethod(
            getAverageValuesMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.patients.NumberMessage,
                com.proto.patients.CalculateResponse>(
                  this, METHODID_AVERAGE_VALUES)))
          .addMethod(
            getConvertBaseMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.patients.ConvertMessage,
                com.proto.patients.ConvertResponse>(
                  this, METHODID_CONVERT_BASE)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class PatientsServiceStub extends io.grpc.stub.AbstractStub<PatientsServiceStub> {
    private PatientsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PatientsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PatientsServiceStub(channel, callOptions);
    }

    /**
     */
    public void calculate(com.proto.patients.CalculateRequest request,
        io.grpc.stub.StreamObserver<com.proto.patients.CalculateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCalculateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generateRandomNumbers(com.proto.patients.RandomRequest request,
        io.grpc.stub.StreamObserver<com.proto.patients.NumberResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGenerateRandomNumbersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.patients.NumberMessage> averageValues(
        io.grpc.stub.StreamObserver<com.proto.patients.CalculateResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAverageValuesMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.patients.ConvertMessage> convertBase(
        io.grpc.stub.StreamObserver<com.proto.patients.ConvertResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getConvertBaseMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class PatientsServiceBlockingStub extends io.grpc.stub.AbstractStub<PatientsServiceBlockingStub> {
    private PatientsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PatientsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PatientsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.patients.CalculateResponse calculate(com.proto.patients.CalculateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCalculateMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.proto.patients.NumberResponse> generateRandomNumbers(
        com.proto.patients.RandomRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGenerateRandomNumbersMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class PatientsServiceFutureStub extends io.grpc.stub.AbstractStub<PatientsServiceFutureStub> {
    private PatientsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PatientsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PatientsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.patients.CalculateResponse> calculate(
        com.proto.patients.CalculateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCalculateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALCULATE = 0;
  private static final int METHODID_GENERATE_RANDOM_NUMBERS = 1;
  private static final int METHODID_AVERAGE_VALUES = 2;
  private static final int METHODID_CONVERT_BASE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PatientsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PatientsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALCULATE:
          serviceImpl.calculate((com.proto.patients.CalculateRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.patients.CalculateResponse>) responseObserver);
          break;
        case METHODID_GENERATE_RANDOM_NUMBERS:
          serviceImpl.generateRandomNumbers((com.proto.patients.RandomRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.patients.NumberResponse>) responseObserver);
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
        case METHODID_AVERAGE_VALUES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.averageValues(
              (io.grpc.stub.StreamObserver<com.proto.patients.CalculateResponse>) responseObserver);
        case METHODID_CONVERT_BASE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.convertBase(
              (io.grpc.stub.StreamObserver<com.proto.patients.ConvertResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PatientsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PatientsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.patients.PatientsServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PatientsService");
    }
  }

  private static final class PatientsServiceFileDescriptorSupplier
      extends PatientsServiceBaseDescriptorSupplier {
    PatientsServiceFileDescriptorSupplier() {}
  }

  private static final class PatientsServiceMethodDescriptorSupplier
      extends PatientsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PatientsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PatientsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PatientsServiceFileDescriptorSupplier())
              .addMethod(getCalculateMethod())
              .addMethod(getGenerateRandomNumbersMethod())
              .addMethod(getAverageValuesMethod())
              .addMethod(getConvertBaseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
