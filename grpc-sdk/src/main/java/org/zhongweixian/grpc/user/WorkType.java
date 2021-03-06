// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: User.proto

package org.zhongweixian.grpc.user;

/**
 * Protobuf enum {@code org.zhongweixian.grpc.user.WorkType}
 */
public enum WorkType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>mobile = 0;</code>
   */
  mobile(0),
  /**
   * <code>webcall = 1;</code>
   */
  webcall(1),
  /**
   * <code>sip = 2;</code>
   */
  sip(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>mobile = 0;</code>
   */
  public static final int mobile_VALUE = 0;
  /**
   * <code>webcall = 1;</code>
   */
  public static final int webcall_VALUE = 1;
  /**
   * <code>sip = 2;</code>
   */
  public static final int sip_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @Deprecated
  public static WorkType valueOf(int value) {
    return forNumber(value);
  }

  public static WorkType forNumber(int value) {
    switch (value) {
      case 0: return mobile;
      case 1: return webcall;
      case 2: return sip;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<WorkType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      WorkType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<WorkType>() {
          public WorkType findValueByNumber(int number) {
            return WorkType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return UserServiceProto.getDescriptor()
        .getEnumTypes().get(1);
  }

  private static final WorkType[] VALUES = values();

  public static WorkType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private WorkType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:org.zhongweixian.grpc.user.WorkType)
}

