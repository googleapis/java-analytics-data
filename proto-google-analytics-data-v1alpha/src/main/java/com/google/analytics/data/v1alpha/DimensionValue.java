/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

/**
 *
 *
 * <pre>
 * The value of a dimension.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.DimensionValue}
 */
public final class DimensionValue extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.DimensionValue)
    DimensionValueOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DimensionValue.newBuilder() to construct.
  private DimensionValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DimensionValue() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DimensionValue();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private DimensionValue(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();
              oneValueCase_ = 1;
              oneValue_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_DimensionValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_DimensionValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.DimensionValue.class,
            com.google.analytics.data.v1alpha.DimensionValue.Builder.class);
  }

  private int oneValueCase_ = 0;
  private java.lang.Object oneValue_;

  public enum OneValueCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    VALUE(1),
    ONEVALUE_NOT_SET(0);
    private final int value;

    private OneValueCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OneValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static OneValueCase forNumber(int value) {
      switch (value) {
        case 1:
          return VALUE;
        case 0:
          return ONEVALUE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public OneValueCase getOneValueCase() {
    return OneValueCase.forNumber(oneValueCase_);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Value as a string if the dimension type is a string.
   * </pre>
   *
   * <code>string value = 1;</code>
   *
   * @return The value.
   */
  public java.lang.String getValue() {
    java.lang.Object ref = "";
    if (oneValueCase_ == 1) {
      ref = oneValue_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (oneValueCase_ == 1) {
        oneValue_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Value as a string if the dimension type is a string.
   * </pre>
   *
   * <code>string value = 1;</code>
   *
   * @return The bytes for value.
   */
  public com.google.protobuf.ByteString getValueBytes() {
    java.lang.Object ref = "";
    if (oneValueCase_ == 1) {
      ref = oneValue_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (oneValueCase_ == 1) {
        oneValue_ = b;
      }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (oneValueCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, oneValue_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (oneValueCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, oneValue_);
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.DimensionValue)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.DimensionValue other =
        (com.google.analytics.data.v1alpha.DimensionValue) obj;

    if (!getOneValueCase().equals(other.getOneValueCase())) return false;
    switch (oneValueCase_) {
      case 1:
        if (!getValue().equals(other.getValue())) return false;
        break;
      case 0:
      default:
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (oneValueCase_) {
      case 1:
        hash = (37 * hash) + VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getValue().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.DimensionValue parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.DimensionValue parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.DimensionValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.DimensionValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.DimensionValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.DimensionValue parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.DimensionValue parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.DimensionValue parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.DimensionValue parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.DimensionValue parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.DimensionValue parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.DimensionValue parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.analytics.data.v1alpha.DimensionValue prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The value of a dimension.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.DimensionValue}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.DimensionValue)
      com.google.analytics.data.v1alpha.DimensionValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_DimensionValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_DimensionValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.DimensionValue.class,
              com.google.analytics.data.v1alpha.DimensionValue.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.DimensionValue.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      oneValueCase_ = 0;
      oneValue_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_DimensionValue_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.DimensionValue getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.DimensionValue.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.DimensionValue build() {
      com.google.analytics.data.v1alpha.DimensionValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.DimensionValue buildPartial() {
      com.google.analytics.data.v1alpha.DimensionValue result =
          new com.google.analytics.data.v1alpha.DimensionValue(this);
      if (oneValueCase_ == 1) {
        result.oneValue_ = oneValue_;
      }
      result.oneValueCase_ = oneValueCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.analytics.data.v1alpha.DimensionValue) {
        return mergeFrom((com.google.analytics.data.v1alpha.DimensionValue) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.DimensionValue other) {
      if (other == com.google.analytics.data.v1alpha.DimensionValue.getDefaultInstance())
        return this;
      switch (other.getOneValueCase()) {
        case VALUE:
          {
            oneValueCase_ = 1;
            oneValue_ = other.oneValue_;
            onChanged();
            break;
          }
        case ONEVALUE_NOT_SET:
          {
            break;
          }
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
      com.google.analytics.data.v1alpha.DimensionValue parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.analytics.data.v1alpha.DimensionValue) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int oneValueCase_ = 0;
    private java.lang.Object oneValue_;

    public OneValueCase getOneValueCase() {
      return OneValueCase.forNumber(oneValueCase_);
    }

    public Builder clearOneValue() {
      oneValueCase_ = 0;
      oneValue_ = null;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Value as a string if the dimension type is a string.
     * </pre>
     *
     * <code>string value = 1;</code>
     *
     * @return The value.
     */
    @java.lang.Override
    public java.lang.String getValue() {
      java.lang.Object ref = "";
      if (oneValueCase_ == 1) {
        ref = oneValue_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (oneValueCase_ == 1) {
          oneValue_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Value as a string if the dimension type is a string.
     * </pre>
     *
     * <code>string value = 1;</code>
     *
     * @return The bytes for value.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getValueBytes() {
      java.lang.Object ref = "";
      if (oneValueCase_ == 1) {
        ref = oneValue_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (oneValueCase_ == 1) {
          oneValue_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Value as a string if the dimension type is a string.
     * </pre>
     *
     * <code>string value = 1;</code>
     *
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      oneValueCase_ = 1;
      oneValue_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Value as a string if the dimension type is a string.
     * </pre>
     *
     * <code>string value = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      if (oneValueCase_ == 1) {
        oneValueCase_ = 0;
        oneValue_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Value as a string if the dimension type is a string.
     * </pre>
     *
     * <code>string value = 1;</code>
     *
     * @param value The bytes for value to set.
     * @return This builder for chaining.
     */
    public Builder setValueBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      oneValueCase_ = 1;
      oneValue_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.DimensionValue)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.DimensionValue)
  private static final com.google.analytics.data.v1alpha.DimensionValue DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.DimensionValue();
  }

  public static com.google.analytics.data.v1alpha.DimensionValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DimensionValue> PARSER =
      new com.google.protobuf.AbstractParser<DimensionValue>() {
        @java.lang.Override
        public DimensionValue parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new DimensionValue(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<DimensionValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DimensionValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.DimensionValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
