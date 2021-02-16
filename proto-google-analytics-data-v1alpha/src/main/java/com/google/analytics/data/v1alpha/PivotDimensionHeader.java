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
 * Summarizes dimension values from a row for this pivot.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.PivotDimensionHeader}
 */
public final class PivotDimensionHeader extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.PivotDimensionHeader)
    PivotDimensionHeaderOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PivotDimensionHeader.newBuilder() to construct.
  private PivotDimensionHeader(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PivotDimensionHeader() {
    dimensionValues_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PivotDimensionHeader();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private PivotDimensionHeader(
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                dimensionValues_ =
                    new java.util.ArrayList<com.google.analytics.data.v1alpha.DimensionValue>();
                mutable_bitField0_ |= 0x00000001;
              }
              dimensionValues_.add(
                  input.readMessage(
                      com.google.analytics.data.v1alpha.DimensionValue.parser(),
                      extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        dimensionValues_ = java.util.Collections.unmodifiableList(dimensionValues_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_PivotDimensionHeader_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_PivotDimensionHeader_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.PivotDimensionHeader.class,
            com.google.analytics.data.v1alpha.PivotDimensionHeader.Builder.class);
  }

  public static final int DIMENSION_VALUES_FIELD_NUMBER = 1;
  private java.util.List<com.google.analytics.data.v1alpha.DimensionValue> dimensionValues_;
  /**
   *
   *
   * <pre>
   * Values of multiple dimensions in a pivot.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1alpha.DimensionValue> getDimensionValuesList() {
    return dimensionValues_;
  }
  /**
   *
   *
   * <pre>
   * Values of multiple dimensions in a pivot.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.data.v1alpha.DimensionValueOrBuilder>
      getDimensionValuesOrBuilderList() {
    return dimensionValues_;
  }
  /**
   *
   *
   * <pre>
   * Values of multiple dimensions in a pivot.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
   */
  @java.lang.Override
  public int getDimensionValuesCount() {
    return dimensionValues_.size();
  }
  /**
   *
   *
   * <pre>
   * Values of multiple dimensions in a pivot.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.DimensionValue getDimensionValues(int index) {
    return dimensionValues_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Values of multiple dimensions in a pivot.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.DimensionValueOrBuilder getDimensionValuesOrBuilder(
      int index) {
    return dimensionValues_.get(index);
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
    for (int i = 0; i < dimensionValues_.size(); i++) {
      output.writeMessage(1, dimensionValues_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < dimensionValues_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, dimensionValues_.get(i));
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.PivotDimensionHeader)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.PivotDimensionHeader other =
        (com.google.analytics.data.v1alpha.PivotDimensionHeader) obj;

    if (!getDimensionValuesList().equals(other.getDimensionValuesList())) return false;
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
    if (getDimensionValuesCount() > 0) {
      hash = (37 * hash) + DIMENSION_VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getDimensionValuesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.PivotDimensionHeader parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.PivotDimensionHeader parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.PivotDimensionHeader parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.PivotDimensionHeader parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.PivotDimensionHeader parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.PivotDimensionHeader parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.PivotDimensionHeader parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.PivotDimensionHeader parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.PivotDimensionHeader parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.PivotDimensionHeader parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.PivotDimensionHeader parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.PivotDimensionHeader parseFrom(
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

  public static Builder newBuilder(
      com.google.analytics.data.v1alpha.PivotDimensionHeader prototype) {
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
   * Summarizes dimension values from a row for this pivot.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.PivotDimensionHeader}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.PivotDimensionHeader)
      com.google.analytics.data.v1alpha.PivotDimensionHeaderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_PivotDimensionHeader_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_PivotDimensionHeader_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.PivotDimensionHeader.class,
              com.google.analytics.data.v1alpha.PivotDimensionHeader.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.PivotDimensionHeader.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDimensionValuesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (dimensionValuesBuilder_ == null) {
        dimensionValues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        dimensionValuesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_PivotDimensionHeader_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.PivotDimensionHeader getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.PivotDimensionHeader.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.PivotDimensionHeader build() {
      com.google.analytics.data.v1alpha.PivotDimensionHeader result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.PivotDimensionHeader buildPartial() {
      com.google.analytics.data.v1alpha.PivotDimensionHeader result =
          new com.google.analytics.data.v1alpha.PivotDimensionHeader(this);
      int from_bitField0_ = bitField0_;
      if (dimensionValuesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dimensionValues_ = java.util.Collections.unmodifiableList(dimensionValues_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dimensionValues_ = dimensionValues_;
      } else {
        result.dimensionValues_ = dimensionValuesBuilder_.build();
      }
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
      if (other instanceof com.google.analytics.data.v1alpha.PivotDimensionHeader) {
        return mergeFrom((com.google.analytics.data.v1alpha.PivotDimensionHeader) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.PivotDimensionHeader other) {
      if (other == com.google.analytics.data.v1alpha.PivotDimensionHeader.getDefaultInstance())
        return this;
      if (dimensionValuesBuilder_ == null) {
        if (!other.dimensionValues_.isEmpty()) {
          if (dimensionValues_.isEmpty()) {
            dimensionValues_ = other.dimensionValues_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDimensionValuesIsMutable();
            dimensionValues_.addAll(other.dimensionValues_);
          }
          onChanged();
        }
      } else {
        if (!other.dimensionValues_.isEmpty()) {
          if (dimensionValuesBuilder_.isEmpty()) {
            dimensionValuesBuilder_.dispose();
            dimensionValuesBuilder_ = null;
            dimensionValues_ = other.dimensionValues_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dimensionValuesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDimensionValuesFieldBuilder()
                    : null;
          } else {
            dimensionValuesBuilder_.addAllMessages(other.dimensionValues_);
          }
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
      com.google.analytics.data.v1alpha.PivotDimensionHeader parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.data.v1alpha.PivotDimensionHeader) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.analytics.data.v1alpha.DimensionValue> dimensionValues_ =
        java.util.Collections.emptyList();

    private void ensureDimensionValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dimensionValues_ =
            new java.util.ArrayList<com.google.analytics.data.v1alpha.DimensionValue>(
                dimensionValues_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.DimensionValue,
            com.google.analytics.data.v1alpha.DimensionValue.Builder,
            com.google.analytics.data.v1alpha.DimensionValueOrBuilder>
        dimensionValuesBuilder_;

    /**
     *
     *
     * <pre>
     * Values of multiple dimensions in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.DimensionValue>
        getDimensionValuesList() {
      if (dimensionValuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dimensionValues_);
      } else {
        return dimensionValuesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Values of multiple dimensions in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
     */
    public int getDimensionValuesCount() {
      if (dimensionValuesBuilder_ == null) {
        return dimensionValues_.size();
      } else {
        return dimensionValuesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Values of multiple dimensions in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
     */
    public com.google.analytics.data.v1alpha.DimensionValue getDimensionValues(int index) {
      if (dimensionValuesBuilder_ == null) {
        return dimensionValues_.get(index);
      } else {
        return dimensionValuesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Values of multiple dimensions in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
     */
    public Builder setDimensionValues(
        int index, com.google.analytics.data.v1alpha.DimensionValue value) {
      if (dimensionValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDimensionValuesIsMutable();
        dimensionValues_.set(index, value);
        onChanged();
      } else {
        dimensionValuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Values of multiple dimensions in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
     */
    public Builder setDimensionValues(
        int index, com.google.analytics.data.v1alpha.DimensionValue.Builder builderForValue) {
      if (dimensionValuesBuilder_ == null) {
        ensureDimensionValuesIsMutable();
        dimensionValues_.set(index, builderForValue.build());
        onChanged();
      } else {
        dimensionValuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Values of multiple dimensions in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
     */
    public Builder addDimensionValues(com.google.analytics.data.v1alpha.DimensionValue value) {
      if (dimensionValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDimensionValuesIsMutable();
        dimensionValues_.add(value);
        onChanged();
      } else {
        dimensionValuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Values of multiple dimensions in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
     */
    public Builder addDimensionValues(
        int index, com.google.analytics.data.v1alpha.DimensionValue value) {
      if (dimensionValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDimensionValuesIsMutable();
        dimensionValues_.add(index, value);
        onChanged();
      } else {
        dimensionValuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Values of multiple dimensions in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
     */
    public Builder addDimensionValues(
        com.google.analytics.data.v1alpha.DimensionValue.Builder builderForValue) {
      if (dimensionValuesBuilder_ == null) {
        ensureDimensionValuesIsMutable();
        dimensionValues_.add(builderForValue.build());
        onChanged();
      } else {
        dimensionValuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Values of multiple dimensions in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
     */
    public Builder addDimensionValues(
        int index, com.google.analytics.data.v1alpha.DimensionValue.Builder builderForValue) {
      if (dimensionValuesBuilder_ == null) {
        ensureDimensionValuesIsMutable();
        dimensionValues_.add(index, builderForValue.build());
        onChanged();
      } else {
        dimensionValuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Values of multiple dimensions in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
     */
    public Builder addAllDimensionValues(
        java.lang.Iterable<? extends com.google.analytics.data.v1alpha.DimensionValue> values) {
      if (dimensionValuesBuilder_ == null) {
        ensureDimensionValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, dimensionValues_);
        onChanged();
      } else {
        dimensionValuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Values of multiple dimensions in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
     */
    public Builder clearDimensionValues() {
      if (dimensionValuesBuilder_ == null) {
        dimensionValues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dimensionValuesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Values of multiple dimensions in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
     */
    public Builder removeDimensionValues(int index) {
      if (dimensionValuesBuilder_ == null) {
        ensureDimensionValuesIsMutable();
        dimensionValues_.remove(index);
        onChanged();
      } else {
        dimensionValuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Values of multiple dimensions in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
     */
    public com.google.analytics.data.v1alpha.DimensionValue.Builder getDimensionValuesBuilder(
        int index) {
      return getDimensionValuesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Values of multiple dimensions in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
     */
    public com.google.analytics.data.v1alpha.DimensionValueOrBuilder getDimensionValuesOrBuilder(
        int index) {
      if (dimensionValuesBuilder_ == null) {
        return dimensionValues_.get(index);
      } else {
        return dimensionValuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Values of multiple dimensions in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
     */
    public java.util.List<? extends com.google.analytics.data.v1alpha.DimensionValueOrBuilder>
        getDimensionValuesOrBuilderList() {
      if (dimensionValuesBuilder_ != null) {
        return dimensionValuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dimensionValues_);
      }
    }
    /**
     *
     *
     * <pre>
     * Values of multiple dimensions in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
     */
    public com.google.analytics.data.v1alpha.DimensionValue.Builder addDimensionValuesBuilder() {
      return getDimensionValuesFieldBuilder()
          .addBuilder(com.google.analytics.data.v1alpha.DimensionValue.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Values of multiple dimensions in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
     */
    public com.google.analytics.data.v1alpha.DimensionValue.Builder addDimensionValuesBuilder(
        int index) {
      return getDimensionValuesFieldBuilder()
          .addBuilder(index, com.google.analytics.data.v1alpha.DimensionValue.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Values of multiple dimensions in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.DimensionValue.Builder>
        getDimensionValuesBuilderList() {
      return getDimensionValuesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.DimensionValue,
            com.google.analytics.data.v1alpha.DimensionValue.Builder,
            com.google.analytics.data.v1alpha.DimensionValueOrBuilder>
        getDimensionValuesFieldBuilder() {
      if (dimensionValuesBuilder_ == null) {
        dimensionValuesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.data.v1alpha.DimensionValue,
                com.google.analytics.data.v1alpha.DimensionValue.Builder,
                com.google.analytics.data.v1alpha.DimensionValueOrBuilder>(
                dimensionValues_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        dimensionValues_ = null;
      }
      return dimensionValuesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.PivotDimensionHeader)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.PivotDimensionHeader)
  private static final com.google.analytics.data.v1alpha.PivotDimensionHeader DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.PivotDimensionHeader();
  }

  public static com.google.analytics.data.v1alpha.PivotDimensionHeader getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PivotDimensionHeader> PARSER =
      new com.google.protobuf.AbstractParser<PivotDimensionHeader>() {
        @java.lang.Override
        public PivotDimensionHeader parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new PivotDimensionHeader(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<PivotDimensionHeader> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PivotDimensionHeader> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.PivotDimensionHeader getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
