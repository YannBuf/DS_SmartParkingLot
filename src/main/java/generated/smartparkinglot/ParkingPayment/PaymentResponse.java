// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ParkingPaymentService.proto

package generated.smartparkinglot.ParkingPayment;

/**
 * Protobuf type {@code ParkingPaymentService.PaymentResponse}
 */
public  final class PaymentResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ParkingPaymentService.PaymentResponse)
    PaymentResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PaymentResponse.newBuilder() to construct.
  private PaymentResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PaymentResponse() {
    feeAmount_ = 0D;
    currency_ = "";
    transactionId_ = "";
    status_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PaymentResponse(
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
          case 9: {

            feeAmount_ = input.readDouble();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            currency_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            transactionId_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            status_ = s;
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
    return generated.smartparkinglot.ParkingPayment.ParkingPaymentServiceImpl.internal_static_ParkingPaymentService_PaymentResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return generated.smartparkinglot.ParkingPayment.ParkingPaymentServiceImpl.internal_static_ParkingPaymentService_PaymentResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            generated.smartparkinglot.ParkingPayment.PaymentResponse.class, generated.smartparkinglot.ParkingPayment.PaymentResponse.Builder.class);
  }

  public static final int FEEAMOUNT_FIELD_NUMBER = 1;
  private double feeAmount_;
  /**
   * <code>double feeAmount = 1;</code>
   */
  public double getFeeAmount() {
    return feeAmount_;
  }

  public static final int CURRENCY_FIELD_NUMBER = 2;
  private volatile java.lang.Object currency_;
  /**
   * <code>string currency = 2;</code>
   */
  public java.lang.String getCurrency() {
    java.lang.Object ref = currency_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      currency_ = s;
      return s;
    }
  }
  /**
   * <code>string currency = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCurrencyBytes() {
    java.lang.Object ref = currency_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      currency_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRANSACTIONID_FIELD_NUMBER = 3;
  private volatile java.lang.Object transactionId_;
  /**
   * <code>string transactionId = 3;</code>
   */
  public java.lang.String getTransactionId() {
    java.lang.Object ref = transactionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      transactionId_ = s;
      return s;
    }
  }
  /**
   * <code>string transactionId = 3;</code>
   */
  public com.google.protobuf.ByteString
      getTransactionIdBytes() {
    java.lang.Object ref = transactionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      transactionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 4;
  private volatile java.lang.Object status_;
  /**
   * <pre>
   * for example: PENDING、FAILED、COMPLETED
   * </pre>
   *
   * <code>string status = 4;</code>
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
   * for example: PENDING、FAILED、COMPLETED
   * </pre>
   *
   * <code>string status = 4;</code>
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
    if (feeAmount_ != 0D) {
      output.writeDouble(1, feeAmount_);
    }
    if (!getCurrencyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, currency_);
    }
    if (!getTransactionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, transactionId_);
    }
    if (!getStatusBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, status_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (feeAmount_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, feeAmount_);
    }
    if (!getCurrencyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, currency_);
    }
    if (!getTransactionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, transactionId_);
    }
    if (!getStatusBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, status_);
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
    if (!(obj instanceof generated.smartparkinglot.ParkingPayment.PaymentResponse)) {
      return super.equals(obj);
    }
    generated.smartparkinglot.ParkingPayment.PaymentResponse other = (generated.smartparkinglot.ParkingPayment.PaymentResponse) obj;

    boolean result = true;
    result = result && (
        java.lang.Double.doubleToLongBits(getFeeAmount())
        == java.lang.Double.doubleToLongBits(
            other.getFeeAmount()));
    result = result && getCurrency()
        .equals(other.getCurrency());
    result = result && getTransactionId()
        .equals(other.getTransactionId());
    result = result && getStatus()
        .equals(other.getStatus());
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
    hash = (37 * hash) + FEEAMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getFeeAmount()));
    hash = (37 * hash) + CURRENCY_FIELD_NUMBER;
    hash = (53 * hash) + getCurrency().hashCode();
    hash = (37 * hash) + TRANSACTIONID_FIELD_NUMBER;
    hash = (53 * hash) + getTransactionId().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static generated.smartparkinglot.ParkingPayment.PaymentResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.smartparkinglot.ParkingPayment.PaymentResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.smartparkinglot.ParkingPayment.PaymentResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.smartparkinglot.ParkingPayment.PaymentResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.smartparkinglot.ParkingPayment.PaymentResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.smartparkinglot.ParkingPayment.PaymentResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.smartparkinglot.ParkingPayment.PaymentResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.smartparkinglot.ParkingPayment.PaymentResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.smartparkinglot.ParkingPayment.PaymentResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static generated.smartparkinglot.ParkingPayment.PaymentResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.smartparkinglot.ParkingPayment.PaymentResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.smartparkinglot.ParkingPayment.PaymentResponse parseFrom(
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
  public static Builder newBuilder(generated.smartparkinglot.ParkingPayment.PaymentResponse prototype) {
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
   * Protobuf type {@code ParkingPaymentService.PaymentResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ParkingPaymentService.PaymentResponse)
      generated.smartparkinglot.ParkingPayment.PaymentResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.smartparkinglot.ParkingPayment.ParkingPaymentServiceImpl.internal_static_ParkingPaymentService_PaymentResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.smartparkinglot.ParkingPayment.ParkingPaymentServiceImpl.internal_static_ParkingPaymentService_PaymentResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.smartparkinglot.ParkingPayment.PaymentResponse.class, generated.smartparkinglot.ParkingPayment.PaymentResponse.Builder.class);
    }

    // Construct using generated.smartparkinglot.ParkingPayment.PaymentResponse.newBuilder()
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
      feeAmount_ = 0D;

      currency_ = "";

      transactionId_ = "";

      status_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return generated.smartparkinglot.ParkingPayment.ParkingPaymentServiceImpl.internal_static_ParkingPaymentService_PaymentResponse_descriptor;
    }

    @java.lang.Override
    public generated.smartparkinglot.ParkingPayment.PaymentResponse getDefaultInstanceForType() {
      return generated.smartparkinglot.ParkingPayment.PaymentResponse.getDefaultInstance();
    }

    @java.lang.Override
    public generated.smartparkinglot.ParkingPayment.PaymentResponse build() {
      generated.smartparkinglot.ParkingPayment.PaymentResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public generated.smartparkinglot.ParkingPayment.PaymentResponse buildPartial() {
      generated.smartparkinglot.ParkingPayment.PaymentResponse result = new generated.smartparkinglot.ParkingPayment.PaymentResponse(this);
      result.feeAmount_ = feeAmount_;
      result.currency_ = currency_;
      result.transactionId_ = transactionId_;
      result.status_ = status_;
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
      if (other instanceof generated.smartparkinglot.ParkingPayment.PaymentResponse) {
        return mergeFrom((generated.smartparkinglot.ParkingPayment.PaymentResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(generated.smartparkinglot.ParkingPayment.PaymentResponse other) {
      if (other == generated.smartparkinglot.ParkingPayment.PaymentResponse.getDefaultInstance()) return this;
      if (other.getFeeAmount() != 0D) {
        setFeeAmount(other.getFeeAmount());
      }
      if (!other.getCurrency().isEmpty()) {
        currency_ = other.currency_;
        onChanged();
      }
      if (!other.getTransactionId().isEmpty()) {
        transactionId_ = other.transactionId_;
        onChanged();
      }
      if (!other.getStatus().isEmpty()) {
        status_ = other.status_;
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
      generated.smartparkinglot.ParkingPayment.PaymentResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (generated.smartparkinglot.ParkingPayment.PaymentResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double feeAmount_ ;
    /**
     * <code>double feeAmount = 1;</code>
     */
    public double getFeeAmount() {
      return feeAmount_;
    }
    /**
     * <code>double feeAmount = 1;</code>
     */
    public Builder setFeeAmount(double value) {
      
      feeAmount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double feeAmount = 1;</code>
     */
    public Builder clearFeeAmount() {
      
      feeAmount_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object currency_ = "";
    /**
     * <code>string currency = 2;</code>
     */
    public java.lang.String getCurrency() {
      java.lang.Object ref = currency_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        currency_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string currency = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCurrencyBytes() {
      java.lang.Object ref = currency_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        currency_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string currency = 2;</code>
     */
    public Builder setCurrency(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      currency_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string currency = 2;</code>
     */
    public Builder clearCurrency() {
      
      currency_ = getDefaultInstance().getCurrency();
      onChanged();
      return this;
    }
    /**
     * <code>string currency = 2;</code>
     */
    public Builder setCurrencyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      currency_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object transactionId_ = "";
    /**
     * <code>string transactionId = 3;</code>
     */
    public java.lang.String getTransactionId() {
      java.lang.Object ref = transactionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        transactionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string transactionId = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTransactionIdBytes() {
      java.lang.Object ref = transactionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        transactionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string transactionId = 3;</code>
     */
    public Builder setTransactionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      transactionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string transactionId = 3;</code>
     */
    public Builder clearTransactionId() {
      
      transactionId_ = getDefaultInstance().getTransactionId();
      onChanged();
      return this;
    }
    /**
     * <code>string transactionId = 3;</code>
     */
    public Builder setTransactionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      transactionId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object status_ = "";
    /**
     * <pre>
     * for example: PENDING、FAILED、COMPLETED
     * </pre>
     *
     * <code>string status = 4;</code>
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
     * for example: PENDING、FAILED、COMPLETED
     * </pre>
     *
     * <code>string status = 4;</code>
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
     * for example: PENDING、FAILED、COMPLETED
     * </pre>
     *
     * <code>string status = 4;</code>
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
     * for example: PENDING、FAILED、COMPLETED
     * </pre>
     *
     * <code>string status = 4;</code>
     */
    public Builder clearStatus() {
      
      status_ = getDefaultInstance().getStatus();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * for example: PENDING、FAILED、COMPLETED
     * </pre>
     *
     * <code>string status = 4;</code>
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


    // @@protoc_insertion_point(builder_scope:ParkingPaymentService.PaymentResponse)
  }

  // @@protoc_insertion_point(class_scope:ParkingPaymentService.PaymentResponse)
  private static final generated.smartparkinglot.ParkingPayment.PaymentResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new generated.smartparkinglot.ParkingPayment.PaymentResponse();
  }

  public static generated.smartparkinglot.ParkingPayment.PaymentResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PaymentResponse>
      PARSER = new com.google.protobuf.AbstractParser<PaymentResponse>() {
    @java.lang.Override
    public PaymentResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PaymentResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PaymentResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PaymentResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public generated.smartparkinglot.ParkingPayment.PaymentResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

