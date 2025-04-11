// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ParkingAvailabilityService.proto

package generated.smartparkinglot.ParkingAvailability;

/**
 * Protobuf type {@code ParkingAvailabilityService.ParkingSpaceStatusResponse}
 */
public  final class ParkingSpaceStatusResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ParkingAvailabilityService.ParkingSpaceStatusResponse)
    ParkingSpaceStatusResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ParkingSpaceStatusResponse.newBuilder() to construct.
  private ParkingSpaceStatusResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ParkingSpaceStatusResponse() {
    spotId_ = "";
    status_ = "";
    timestamp_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ParkingSpaceStatusResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            spotId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            status_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            timestamp_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return generated.smartparkinglot.ParkingAvailability.ParkingAvailabilityServiceImpl.internal_static_ParkingAvailabilityService_ParkingSpaceStatusResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return generated.smartparkinglot.ParkingAvailability.ParkingAvailabilityServiceImpl.internal_static_ParkingAvailabilityService_ParkingSpaceStatusResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse.class, generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse.Builder.class);
  }

  public static final int SPOTID_FIELD_NUMBER = 1;
  private volatile java.lang.Object spotId_;
  /**
   * <code>string spotId = 1;</code>
   */
  public java.lang.String getSpotId() {
    java.lang.Object ref = spotId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      spotId_ = s;
      return s;
    }
  }
  /**
   * <code>string spotId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSpotIdBytes() {
    java.lang.Object ref = spotId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      spotId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private volatile java.lang.Object status_;
  /**
   * <pre>
   * for example  "available", "occupied", "maintenance"
   * </pre>
   *
   * <code>string status = 2;</code>
   */
  public java.lang.String getStatus() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      status_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * for example  "available", "occupied", "maintenance"
   * </pre>
   *
   * <code>string status = 2;</code>
   */
  public com.google.protobuf.ByteString
      getStatusBytes() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      status_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 3;
  private volatile java.lang.Object timestamp_;
  /**
   * <pre>
   * Timing of information update
   * </pre>
   *
   * <code>string timestamp = 3;</code>
   */
  public java.lang.String getTimestamp() {
    java.lang.Object ref = timestamp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      timestamp_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Timing of information update
   * </pre>
   *
   * <code>string timestamp = 3;</code>
   */
  public com.google.protobuf.ByteString
      getTimestampBytes() {
    java.lang.Object ref = timestamp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      timestamp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getSpotIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, spotId_);
    }
    if (!getStatusBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, status_);
    }
    if (!getTimestampBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, timestamp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSpotIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, spotId_);
    }
    if (!getStatusBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, status_);
    }
    if (!getTimestampBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, timestamp_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse)) {
      return super.equals(obj);
    }
    generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse other = (generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse) obj;

    boolean result = true;
    result = result && getSpotId()
        .equals(other.getSpotId());
    result = result && getStatus()
        .equals(other.getStatus());
    result = result && getTimestamp()
        .equals(other.getTimestamp());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SPOTID_FIELD_NUMBER;
    hash = (53 * hash) + getSpotId().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + getTimestamp().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ParkingAvailabilityService.ParkingSpaceStatusResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ParkingAvailabilityService.ParkingSpaceStatusResponse)
      generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.smartparkinglot.ParkingAvailability.ParkingAvailabilityServiceImpl.internal_static_ParkingAvailabilityService_ParkingSpaceStatusResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.smartparkinglot.ParkingAvailability.ParkingAvailabilityServiceImpl.internal_static_ParkingAvailabilityService_ParkingSpaceStatusResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse.class, generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse.Builder.class);
    }

    // Construct using generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      spotId_ = "";

      status_ = "";

      timestamp_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return generated.smartparkinglot.ParkingAvailability.ParkingAvailabilityServiceImpl.internal_static_ParkingAvailabilityService_ParkingSpaceStatusResponse_descriptor;
    }

    @java.lang.Override
    public generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse getDefaultInstanceForType() {
      return generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse.getDefaultInstance();
    }

    @java.lang.Override
    public generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse build() {
      generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse buildPartial() {
      generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse result = new generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse(this);
      result.spotId_ = spotId_;
      result.status_ = status_;
      result.timestamp_ = timestamp_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse) {
        return mergeFrom((generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse other) {
      if (other == generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse.getDefaultInstance()) return this;
      if (!other.getSpotId().isEmpty()) {
        spotId_ = other.spotId_;
        onChanged();
      }
      if (!other.getStatus().isEmpty()) {
        status_ = other.status_;
        onChanged();
      }
      if (!other.getTimestamp().isEmpty()) {
        timestamp_ = other.timestamp_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object spotId_ = "";
    /**
     * <code>string spotId = 1;</code>
     */
    public java.lang.String getSpotId() {
      java.lang.Object ref = spotId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        spotId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string spotId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSpotIdBytes() {
      java.lang.Object ref = spotId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        spotId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string spotId = 1;</code>
     */
    public Builder setSpotId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      spotId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string spotId = 1;</code>
     */
    public Builder clearSpotId() {
      
      spotId_ = getDefaultInstance().getSpotId();
      onChanged();
      return this;
    }
    /**
     * <code>string spotId = 1;</code>
     */
    public Builder setSpotIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      spotId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object status_ = "";
    /**
     * <pre>
     * for example  "available", "occupied", "maintenance"
     * </pre>
     *
     * <code>string status = 2;</code>
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        status_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * for example  "available", "occupied", "maintenance"
     * </pre>
     *
     * <code>string status = 2;</code>
     */
    public com.google.protobuf.ByteString
        getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * for example  "available", "occupied", "maintenance"
     * </pre>
     *
     * <code>string status = 2;</code>
     */
    public Builder setStatus(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * for example  "available", "occupied", "maintenance"
     * </pre>
     *
     * <code>string status = 2;</code>
     */
    public Builder clearStatus() {
      
      status_ = getDefaultInstance().getStatus();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * for example  "available", "occupied", "maintenance"
     * </pre>
     *
     * <code>string status = 2;</code>
     */
    public Builder setStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      status_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object timestamp_ = "";
    /**
     * <pre>
     * Timing of information update
     * </pre>
     *
     * <code>string timestamp = 3;</code>
     */
    public java.lang.String getTimestamp() {
      java.lang.Object ref = timestamp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        timestamp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Timing of information update
     * </pre>
     *
     * <code>string timestamp = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTimestampBytes() {
      java.lang.Object ref = timestamp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        timestamp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Timing of information update
     * </pre>
     *
     * <code>string timestamp = 3;</code>
     */
    public Builder setTimestamp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Timing of information update
     * </pre>
     *
     * <code>string timestamp = 3;</code>
     */
    public Builder clearTimestamp() {
      
      timestamp_ = getDefaultInstance().getTimestamp();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Timing of information update
     * </pre>
     *
     * <code>string timestamp = 3;</code>
     */
    public Builder setTimestampBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ParkingAvailabilityService.ParkingSpaceStatusResponse)
  }

  // @@protoc_insertion_point(class_scope:ParkingAvailabilityService.ParkingSpaceStatusResponse)
  private static final generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse();
  }

  public static generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ParkingSpaceStatusResponse>
      PARSER = new com.google.protobuf.AbstractParser<ParkingSpaceStatusResponse>() {
    @java.lang.Override
    public ParkingSpaceStatusResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ParkingSpaceStatusResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ParkingSpaceStatusResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ParkingSpaceStatusResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public generated.smartparkinglot.ParkingAvailability.ParkingSpaceStatusResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

