// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: beds.proto

package com.proto.beds;

public final class BedsServiceImpl {
  private BedsServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hostpitalservicesbeds_WelcomeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hostpitalservicesbeds_WelcomeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hostpitalservicesbeds_BedsAvailableResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hostpitalservicesbeds_BedsAvailableResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nbeds.proto\022\025hostpitalservicesbeds\".\n\016W" +
      "elcomeRequest\022\014\n\004name\030\001 \001(\t\022\016\n\006number\030\002 " +
      "\001(\005\"(\n\025BedsAvailableResponse\022\017\n\007message\030" +
      "\001 \001(\t2{\n\024BedsAvailableRequest\022c\n\nsayWelc" +
      "ome\022%.hostpitalservicesbeds.WelcomeReque" +
      "st\032,.hostpitalservicesbeds.BedsAvailable" +
      "Response\"\000B#\n\016com.proto.bedsB\017BedsServic" +
      "eImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_hostpitalservicesbeds_WelcomeRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hostpitalservicesbeds_WelcomeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hostpitalservicesbeds_WelcomeRequest_descriptor,
        new java.lang.String[] { "Name", "Number", });
    internal_static_hostpitalservicesbeds_BedsAvailableResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hostpitalservicesbeds_BedsAvailableResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hostpitalservicesbeds_BedsAvailableResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
