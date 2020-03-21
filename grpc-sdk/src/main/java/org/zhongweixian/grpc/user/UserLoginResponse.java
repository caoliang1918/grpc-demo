// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: User.proto

package org.zhongweixian.grpc.user;

/**
 * Protobuf type {@code org.zhongweixian.grpc.user.UserLoginResponse}
 */
public  final class UserLoginResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.zhongweixian.grpc.user.UserLoginResponse)
    UserLoginResponseOrBuilder {
  // Use UserLoginResponse.newBuilder() to construct.
  private UserLoginResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserLoginResponse() {
    uid_ = 0;
    username_ = "";
    role_ = 0;
    workType_ = 0;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UserLoginResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            uid_ = input.readInt32();
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            username_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            role_ = rawValue;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            workType_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return UserServiceProto.internal_static_org_zhongweixian_grpc_user_UserLoginResponse_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return UserServiceProto.internal_static_org_zhongweixian_grpc_user_UserLoginResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            UserLoginResponse.class, Builder.class);
  }

  public static final int UID_FIELD_NUMBER = 1;
  private int uid_;
  /**
   * <code>optional int32 uid = 1;</code>
   */
  public int getUid() {
    return uid_;
  }

  public static final int USERNAME_FIELD_NUMBER = 2;
  private volatile Object username_;
  /**
   * <code>optional string username = 2;</code>
   */
  public String getUsername() {
    Object ref = username_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      username_ = s;
      return s;
    }
  }
  /**
   * <code>optional string username = 2;</code>
   */
  public com.google.protobuf.ByteString
      getUsernameBytes() {
    Object ref = username_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      username_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROLE_FIELD_NUMBER = 3;
  private int role_;
  /**
   * <code>optional .org.zhongweixian.grpc.user.Role role = 3;</code>
   */
  public int getRoleValue() {
    return role_;
  }
  /**
   * <code>optional .org.zhongweixian.grpc.user.Role role = 3;</code>
   */
  public Role getRole() {
    Role result = Role.valueOf(role_);
    return result == null ? Role.UNRECOGNIZED : result;
  }

  public static final int WORKTYPE_FIELD_NUMBER = 4;
  private int workType_;
  /**
   * <code>optional .org.zhongweixian.grpc.user.WorkType workType = 4;</code>
   */
  public int getWorkTypeValue() {
    return workType_;
  }
  /**
   * <code>optional .org.zhongweixian.grpc.user.WorkType workType = 4;</code>
   */
  public WorkType getWorkType() {
    WorkType result = WorkType.valueOf(workType_);
    return result == null ? WorkType.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (uid_ != 0) {
      output.writeInt32(1, uid_);
    }
    if (!getUsernameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, username_);
    }
    if (role_ != Role.admin.getNumber()) {
      output.writeEnum(3, role_);
    }
    if (workType_ != WorkType.mobile.getNumber()) {
      output.writeEnum(4, workType_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (uid_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, uid_);
    }
    if (!getUsernameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, username_);
    }
    if (role_ != Role.admin.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, role_);
    }
    if (workType_ != WorkType.mobile.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, workType_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof UserLoginResponse)) {
      return super.equals(obj);
    }
    UserLoginResponse other = (UserLoginResponse) obj;

    boolean result = true;
    result = result && (getUid()
        == other.getUid());
    result = result && getUsername()
        .equals(other.getUsername());
    result = result && role_ == other.role_;
    result = result && workType_ == other.workType_;
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + UID_FIELD_NUMBER;
    hash = (53 * hash) + getUid();
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUsername().hashCode();
    hash = (37 * hash) + ROLE_FIELD_NUMBER;
    hash = (53 * hash) + role_;
    hash = (37 * hash) + WORKTYPE_FIELD_NUMBER;
    hash = (53 * hash) + workType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static UserLoginResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UserLoginResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UserLoginResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UserLoginResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UserLoginResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static UserLoginResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static UserLoginResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static UserLoginResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static UserLoginResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static UserLoginResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(UserLoginResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.zhongweixian.grpc.user.UserLoginResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.zhongweixian.grpc.user.UserLoginResponse)
      UserLoginResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return UserServiceProto.internal_static_org_zhongweixian_grpc_user_UserLoginResponse_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return UserServiceProto.internal_static_org_zhongweixian_grpc_user_UserLoginResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              UserLoginResponse.class, Builder.class);
    }

    // Construct using org.zhongweixian.grpc.user.UserLoginResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      uid_ = 0;

      username_ = "";

      role_ = 0;

      workType_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return UserServiceProto.internal_static_org_zhongweixian_grpc_user_UserLoginResponse_descriptor;
    }

    public UserLoginResponse getDefaultInstanceForType() {
      return UserLoginResponse.getDefaultInstance();
    }

    public UserLoginResponse build() {
      UserLoginResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public UserLoginResponse buildPartial() {
      UserLoginResponse result = new UserLoginResponse(this);
      result.uid_ = uid_;
      result.username_ = username_;
      result.role_ = role_;
      result.workType_ = workType_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof UserLoginResponse) {
        return mergeFrom((UserLoginResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(UserLoginResponse other) {
      if (other == UserLoginResponse.getDefaultInstance()) return this;
      if (other.getUid() != 0) {
        setUid(other.getUid());
      }
      if (!other.getUsername().isEmpty()) {
        username_ = other.username_;
        onChanged();
      }
      if (other.role_ != 0) {
        setRoleValue(other.getRoleValue());
      }
      if (other.workType_ != 0) {
        setWorkTypeValue(other.getWorkTypeValue());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      UserLoginResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (UserLoginResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int uid_ ;
    /**
     * <code>optional int32 uid = 1;</code>
     */
    public int getUid() {
      return uid_;
    }
    /**
     * <code>optional int32 uid = 1;</code>
     */
    public Builder setUid(int value) {
      
      uid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 uid = 1;</code>
     */
    public Builder clearUid() {
      
      uid_ = 0;
      onChanged();
      return this;
    }

    private Object username_ = "";
    /**
     * <code>optional string username = 2;</code>
     */
    public String getUsername() {
      Object ref = username_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        username_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string username = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string username = 2;</code>
     */
    public Builder setUsername(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      username_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string username = 2;</code>
     */
    public Builder clearUsername() {
      
      username_ = getDefaultInstance().getUsername();
      onChanged();
      return this;
    }
    /**
     * <code>optional string username = 2;</code>
     */
    public Builder setUsernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      username_ = value;
      onChanged();
      return this;
    }

    private int role_ = 0;
    /**
     * <code>optional .org.zhongweixian.grpc.user.Role role = 3;</code>
     */
    public int getRoleValue() {
      return role_;
    }
    /**
     * <code>optional .org.zhongweixian.grpc.user.Role role = 3;</code>
     */
    public Builder setRoleValue(int value) {
      role_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .org.zhongweixian.grpc.user.Role role = 3;</code>
     */
    public Role getRole() {
      Role result = Role.valueOf(role_);
      return result == null ? Role.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .org.zhongweixian.grpc.user.Role role = 3;</code>
     */
    public Builder setRole(Role value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      role_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .org.zhongweixian.grpc.user.Role role = 3;</code>
     */
    public Builder clearRole() {
      
      role_ = 0;
      onChanged();
      return this;
    }

    private int workType_ = 0;
    /**
     * <code>optional .org.zhongweixian.grpc.user.WorkType workType = 4;</code>
     */
    public int getWorkTypeValue() {
      return workType_;
    }
    /**
     * <code>optional .org.zhongweixian.grpc.user.WorkType workType = 4;</code>
     */
    public Builder setWorkTypeValue(int value) {
      workType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .org.zhongweixian.grpc.user.WorkType workType = 4;</code>
     */
    public WorkType getWorkType() {
      WorkType result = WorkType.valueOf(workType_);
      return result == null ? WorkType.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .org.zhongweixian.grpc.user.WorkType workType = 4;</code>
     */
    public Builder setWorkType(WorkType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      workType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .org.zhongweixian.grpc.user.WorkType workType = 4;</code>
     */
    public Builder clearWorkType() {
      
      workType_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:org.zhongweixian.grpc.user.UserLoginResponse)
  }

  // @@protoc_insertion_point(class_scope:org.zhongweixian.grpc.user.UserLoginResponse)
  private static final UserLoginResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new UserLoginResponse();
  }

  public static UserLoginResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserLoginResponse>
      PARSER = new com.google.protobuf.AbstractParser<UserLoginResponse>() {
    public UserLoginResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new UserLoginResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserLoginResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<UserLoginResponse> getParserForType() {
    return PARSER;
  }

  public UserLoginResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

