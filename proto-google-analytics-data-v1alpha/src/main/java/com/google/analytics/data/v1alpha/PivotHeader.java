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
 * Dimensions' values in a single pivot.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.PivotHeader}
 */
public final class PivotHeader extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.PivotHeader)
    PivotHeaderOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PivotHeader.newBuilder() to construct.
  private PivotHeader(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PivotHeader() {
    pivotDimensionHeaders_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PivotHeader();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private PivotHeader(
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
                pivotDimensionHeaders_ =
                    new java.util.ArrayList<
                        com.google.analytics.data.v1alpha.PivotDimensionHeader>();
                mutable_bitField0_ |= 0x00000001;
              }
              pivotDimensionHeaders_.add(
                  input.readMessage(
                      com.google.analytics.data.v1alpha.PivotDimensionHeader.parser(),
                      extensionRegistry));
              break;
            }
          case 16:
            {
              rowCount_ = input.readInt32();
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
        pivotDimensionHeaders_ = java.util.Collections.unmodifiableList(pivotDimensionHeaders_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_PivotHeader_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_PivotHeader_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.PivotHeader.class,
            com.google.analytics.data.v1alpha.PivotHeader.Builder.class);
  }

  public static final int PIVOT_DIMENSION_HEADERS_FIELD_NUMBER = 1;
  private java.util.List<com.google.analytics.data.v1alpha.PivotDimensionHeader>
      pivotDimensionHeaders_;
  /**
   *
   *
   * <pre>
   * The size is the same as the cardinality of the corresponding dimension
   * combinations.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.PivotDimensionHeader pivot_dimension_headers = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1alpha.PivotDimensionHeader>
      getPivotDimensionHeadersList() {
    return pivotDimensionHeaders_;
  }
  /**
   *
   *
   * <pre>
   * The size is the same as the cardinality of the corresponding dimension
   * combinations.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.PivotDimensionHeader pivot_dimension_headers = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.data.v1alpha.PivotDimensionHeaderOrBuilder>
      getPivotDimensionHeadersOrBuilderList() {
    return pivotDimensionHeaders_;
  }
  /**
   *
   *
   * <pre>
   * The size is the same as the cardinality of the corresponding dimension
   * combinations.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.PivotDimensionHeader pivot_dimension_headers = 1;
   * </code>
   */
  @java.lang.Override
  public int getPivotDimensionHeadersCount() {
    return pivotDimensionHeaders_.size();
  }
  /**
   *
   *
   * <pre>
   * The size is the same as the cardinality of the corresponding dimension
   * combinations.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.PivotDimensionHeader pivot_dimension_headers = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.PivotDimensionHeader getPivotDimensionHeaders(
      int index) {
    return pivotDimensionHeaders_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The size is the same as the cardinality of the corresponding dimension
   * combinations.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.PivotDimensionHeader pivot_dimension_headers = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.PivotDimensionHeaderOrBuilder
      getPivotDimensionHeadersOrBuilder(int index) {
    return pivotDimensionHeaders_.get(index);
  }

  public static final int ROW_COUNT_FIELD_NUMBER = 2;
  private int rowCount_;
  /**
   *
   *
   * <pre>
   * The cardinality of the pivot as if offset = 0 and limit = -1. The total
   * number of rows for this pivot's fields regardless of how the parameters
   * offset and limit are specified in the request.
   * </pre>
   *
   * <code>int32 row_count = 2;</code>
   *
   * @return The rowCount.
   */
  @java.lang.Override
  public int getRowCount() {
    return rowCount_;
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
    for (int i = 0; i < pivotDimensionHeaders_.size(); i++) {
      output.writeMessage(1, pivotDimensionHeaders_.get(i));
    }
    if (rowCount_ != 0) {
      output.writeInt32(2, rowCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < pivotDimensionHeaders_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, pivotDimensionHeaders_.get(i));
    }
    if (rowCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, rowCount_);
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.PivotHeader)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.PivotHeader other =
        (com.google.analytics.data.v1alpha.PivotHeader) obj;

    if (!getPivotDimensionHeadersList().equals(other.getPivotDimensionHeadersList())) return false;
    if (getRowCount() != other.getRowCount()) return false;
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
    if (getPivotDimensionHeadersCount() > 0) {
      hash = (37 * hash) + PIVOT_DIMENSION_HEADERS_FIELD_NUMBER;
      hash = (53 * hash) + getPivotDimensionHeadersList().hashCode();
    }
    hash = (37 * hash) + ROW_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getRowCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.PivotHeader parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.PivotHeader parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.PivotHeader parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.PivotHeader parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.PivotHeader parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.PivotHeader parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.PivotHeader parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.PivotHeader parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.PivotHeader parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.PivotHeader parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.PivotHeader parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.PivotHeader parseFrom(
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

  public static Builder newBuilder(com.google.analytics.data.v1alpha.PivotHeader prototype) {
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
   * Dimensions' values in a single pivot.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.PivotHeader}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.PivotHeader)
      com.google.analytics.data.v1alpha.PivotHeaderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_PivotHeader_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_PivotHeader_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.PivotHeader.class,
              com.google.analytics.data.v1alpha.PivotHeader.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.PivotHeader.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getPivotDimensionHeadersFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (pivotDimensionHeadersBuilder_ == null) {
        pivotDimensionHeaders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        pivotDimensionHeadersBuilder_.clear();
      }
      rowCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_PivotHeader_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.PivotHeader getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.PivotHeader.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.PivotHeader build() {
      com.google.analytics.data.v1alpha.PivotHeader result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.PivotHeader buildPartial() {
      com.google.analytics.data.v1alpha.PivotHeader result =
          new com.google.analytics.data.v1alpha.PivotHeader(this);
      int from_bitField0_ = bitField0_;
      if (pivotDimensionHeadersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          pivotDimensionHeaders_ = java.util.Collections.unmodifiableList(pivotDimensionHeaders_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.pivotDimensionHeaders_ = pivotDimensionHeaders_;
      } else {
        result.pivotDimensionHeaders_ = pivotDimensionHeadersBuilder_.build();
      }
      result.rowCount_ = rowCount_;
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
      if (other instanceof com.google.analytics.data.v1alpha.PivotHeader) {
        return mergeFrom((com.google.analytics.data.v1alpha.PivotHeader) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.PivotHeader other) {
      if (other == com.google.analytics.data.v1alpha.PivotHeader.getDefaultInstance()) return this;
      if (pivotDimensionHeadersBuilder_ == null) {
        if (!other.pivotDimensionHeaders_.isEmpty()) {
          if (pivotDimensionHeaders_.isEmpty()) {
            pivotDimensionHeaders_ = other.pivotDimensionHeaders_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePivotDimensionHeadersIsMutable();
            pivotDimensionHeaders_.addAll(other.pivotDimensionHeaders_);
          }
          onChanged();
        }
      } else {
        if (!other.pivotDimensionHeaders_.isEmpty()) {
          if (pivotDimensionHeadersBuilder_.isEmpty()) {
            pivotDimensionHeadersBuilder_.dispose();
            pivotDimensionHeadersBuilder_ = null;
            pivotDimensionHeaders_ = other.pivotDimensionHeaders_;
            bitField0_ = (bitField0_ & ~0x00000001);
            pivotDimensionHeadersBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getPivotDimensionHeadersFieldBuilder()
                    : null;
          } else {
            pivotDimensionHeadersBuilder_.addAllMessages(other.pivotDimensionHeaders_);
          }
        }
      }
      if (other.getRowCount() != 0) {
        setRowCount(other.getRowCount());
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
      com.google.analytics.data.v1alpha.PivotHeader parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.analytics.data.v1alpha.PivotHeader) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.analytics.data.v1alpha.PivotDimensionHeader>
        pivotDimensionHeaders_ = java.util.Collections.emptyList();

    private void ensurePivotDimensionHeadersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        pivotDimensionHeaders_ =
            new java.util.ArrayList<com.google.analytics.data.v1alpha.PivotDimensionHeader>(
                pivotDimensionHeaders_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.PivotDimensionHeader,
            com.google.analytics.data.v1alpha.PivotDimensionHeader.Builder,
            com.google.analytics.data.v1alpha.PivotDimensionHeaderOrBuilder>
        pivotDimensionHeadersBuilder_;

    /**
     *
     *
     * <pre>
     * The size is the same as the cardinality of the corresponding dimension
     * combinations.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.PivotDimensionHeader pivot_dimension_headers = 1;
     * </code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.PivotDimensionHeader>
        getPivotDimensionHeadersList() {
      if (pivotDimensionHeadersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(pivotDimensionHeaders_);
      } else {
        return pivotDimensionHeadersBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The size is the same as the cardinality of the corresponding dimension
     * combinations.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.PivotDimensionHeader pivot_dimension_headers = 1;
     * </code>
     */
    public int getPivotDimensionHeadersCount() {
      if (pivotDimensionHeadersBuilder_ == null) {
        return pivotDimensionHeaders_.size();
      } else {
        return pivotDimensionHeadersBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The size is the same as the cardinality of the corresponding dimension
     * combinations.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.PivotDimensionHeader pivot_dimension_headers = 1;
     * </code>
     */
    public com.google.analytics.data.v1alpha.PivotDimensionHeader getPivotDimensionHeaders(
        int index) {
      if (pivotDimensionHeadersBuilder_ == null) {
        return pivotDimensionHeaders_.get(index);
      } else {
        return pivotDimensionHeadersBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The size is the same as the cardinality of the corresponding dimension
     * combinations.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.PivotDimensionHeader pivot_dimension_headers = 1;
     * </code>
     */
    public Builder setPivotDimensionHeaders(
        int index, com.google.analytics.data.v1alpha.PivotDimensionHeader value) {
      if (pivotDimensionHeadersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePivotDimensionHeadersIsMutable();
        pivotDimensionHeaders_.set(index, value);
        onChanged();
      } else {
        pivotDimensionHeadersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The size is the same as the cardinality of the corresponding dimension
     * combinations.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.PivotDimensionHeader pivot_dimension_headers = 1;
     * </code>
     */
    public Builder setPivotDimensionHeaders(
        int index, com.google.analytics.data.v1alpha.PivotDimensionHeader.Builder builderForValue) {
      if (pivotDimensionHeadersBuilder_ == null) {
        ensurePivotDimensionHeadersIsMutable();
        pivotDimensionHeaders_.set(index, builderForValue.build());
        onChanged();
      } else {
        pivotDimensionHeadersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The size is the same as the cardinality of the corresponding dimension
     * combinations.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.PivotDimensionHeader pivot_dimension_headers = 1;
     * </code>
     */
    public Builder addPivotDimensionHeaders(
        com.google.analytics.data.v1alpha.PivotDimensionHeader value) {
      if (pivotDimensionHeadersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePivotDimensionHeadersIsMutable();
        pivotDimensionHeaders_.add(value);
        onChanged();
      } else {
        pivotDimensionHeadersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The size is the same as the cardinality of the corresponding dimension
     * combinations.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.PivotDimensionHeader pivot_dimension_headers = 1;
     * </code>
     */
    public Builder addPivotDimensionHeaders(
        int index, com.google.analytics.data.v1alpha.PivotDimensionHeader value) {
      if (pivotDimensionHeadersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePivotDimensionHeadersIsMutable();
        pivotDimensionHeaders_.add(index, value);
        onChanged();
      } else {
        pivotDimensionHeadersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The size is the same as the cardinality of the corresponding dimension
     * combinations.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.PivotDimensionHeader pivot_dimension_headers = 1;
     * </code>
     */
    public Builder addPivotDimensionHeaders(
        com.google.analytics.data.v1alpha.PivotDimensionHeader.Builder builderForValue) {
      if (pivotDimensionHeadersBuilder_ == null) {
        ensurePivotDimensionHeadersIsMutable();
        pivotDimensionHeaders_.add(builderForValue.build());
        onChanged();
      } else {
        pivotDimensionHeadersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The size is the same as the cardinality of the corresponding dimension
     * combinations.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.PivotDimensionHeader pivot_dimension_headers = 1;
     * </code>
     */
    public Builder addPivotDimensionHeaders(
        int index, com.google.analytics.data.v1alpha.PivotDimensionHeader.Builder builderForValue) {
      if (pivotDimensionHeadersBuilder_ == null) {
        ensurePivotDimensionHeadersIsMutable();
        pivotDimensionHeaders_.add(index, builderForValue.build());
        onChanged();
      } else {
        pivotDimensionHeadersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The size is the same as the cardinality of the corresponding dimension
     * combinations.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.PivotDimensionHeader pivot_dimension_headers = 1;
     * </code>
     */
    public Builder addAllPivotDimensionHeaders(
        java.lang.Iterable<? extends com.google.analytics.data.v1alpha.PivotDimensionHeader>
            values) {
      if (pivotDimensionHeadersBuilder_ == null) {
        ensurePivotDimensionHeadersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, pivotDimensionHeaders_);
        onChanged();
      } else {
        pivotDimensionHeadersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The size is the same as the cardinality of the corresponding dimension
     * combinations.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.PivotDimensionHeader pivot_dimension_headers = 1;
     * </code>
     */
    public Builder clearPivotDimensionHeaders() {
      if (pivotDimensionHeadersBuilder_ == null) {
        pivotDimensionHeaders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        pivotDimensionHeadersBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The size is the same as the cardinality of the corresponding dimension
     * combinations.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.PivotDimensionHeader pivot_dimension_headers = 1;
     * </code>
     */
    public Builder removePivotDimensionHeaders(int index) {
      if (pivotDimensionHeadersBuilder_ == null) {
        ensurePivotDimensionHeadersIsMutable();
        pivotDimensionHeaders_.remove(index);
        onChanged();
      } else {
        pivotDimensionHeadersBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The size is the same as the cardinality of the corresponding dimension
     * combinations.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.PivotDimensionHeader pivot_dimension_headers = 1;
     * </code>
     */
    public com.google.analytics.data.v1alpha.PivotDimensionHeader.Builder
        getPivotDimensionHeadersBuilder(int index) {
      return getPivotDimensionHeadersFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The size is the same as the cardinality of the corresponding dimension
     * combinations.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.PivotDimensionHeader pivot_dimension_headers = 1;
     * </code>
     */
    public com.google.analytics.data.v1alpha.PivotDimensionHeaderOrBuilder
        getPivotDimensionHeadersOrBuilder(int index) {
      if (pivotDimensionHeadersBuilder_ == null) {
        return pivotDimensionHeaders_.get(index);
      } else {
        return pivotDimensionHeadersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The size is the same as the cardinality of the corresponding dimension
     * combinations.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.PivotDimensionHeader pivot_dimension_headers = 1;
     * </code>
     */
    public java.util.List<? extends com.google.analytics.data.v1alpha.PivotDimensionHeaderOrBuilder>
        getPivotDimensionHeadersOrBuilderList() {
      if (pivotDimensionHeadersBuilder_ != null) {
        return pivotDimensionHeadersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(pivotDimensionHeaders_);
      }
    }
    /**
     *
     *
     * <pre>
     * The size is the same as the cardinality of the corresponding dimension
     * combinations.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.PivotDimensionHeader pivot_dimension_headers = 1;
     * </code>
     */
    public com.google.analytics.data.v1alpha.PivotDimensionHeader.Builder
        addPivotDimensionHeadersBuilder() {
      return getPivotDimensionHeadersFieldBuilder()
          .addBuilder(com.google.analytics.data.v1alpha.PivotDimensionHeader.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The size is the same as the cardinality of the corresponding dimension
     * combinations.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.PivotDimensionHeader pivot_dimension_headers = 1;
     * </code>
     */
    public com.google.analytics.data.v1alpha.PivotDimensionHeader.Builder
        addPivotDimensionHeadersBuilder(int index) {
      return getPivotDimensionHeadersFieldBuilder()
          .addBuilder(
              index, com.google.analytics.data.v1alpha.PivotDimensionHeader.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The size is the same as the cardinality of the corresponding dimension
     * combinations.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.PivotDimensionHeader pivot_dimension_headers = 1;
     * </code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.PivotDimensionHeader.Builder>
        getPivotDimensionHeadersBuilderList() {
      return getPivotDimensionHeadersFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.PivotDimensionHeader,
            com.google.analytics.data.v1alpha.PivotDimensionHeader.Builder,
            com.google.analytics.data.v1alpha.PivotDimensionHeaderOrBuilder>
        getPivotDimensionHeadersFieldBuilder() {
      if (pivotDimensionHeadersBuilder_ == null) {
        pivotDimensionHeadersBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.data.v1alpha.PivotDimensionHeader,
                com.google.analytics.data.v1alpha.PivotDimensionHeader.Builder,
                com.google.analytics.data.v1alpha.PivotDimensionHeaderOrBuilder>(
                pivotDimensionHeaders_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        pivotDimensionHeaders_ = null;
      }
      return pivotDimensionHeadersBuilder_;
    }

    private int rowCount_;
    /**
     *
     *
     * <pre>
     * The cardinality of the pivot as if offset = 0 and limit = -1. The total
     * number of rows for this pivot's fields regardless of how the parameters
     * offset and limit are specified in the request.
     * </pre>
     *
     * <code>int32 row_count = 2;</code>
     *
     * @return The rowCount.
     */
    @java.lang.Override
    public int getRowCount() {
      return rowCount_;
    }
    /**
     *
     *
     * <pre>
     * The cardinality of the pivot as if offset = 0 and limit = -1. The total
     * number of rows for this pivot's fields regardless of how the parameters
     * offset and limit are specified in the request.
     * </pre>
     *
     * <code>int32 row_count = 2;</code>
     *
     * @param value The rowCount to set.
     * @return This builder for chaining.
     */
    public Builder setRowCount(int value) {

      rowCount_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The cardinality of the pivot as if offset = 0 and limit = -1. The total
     * number of rows for this pivot's fields regardless of how the parameters
     * offset and limit are specified in the request.
     * </pre>
     *
     * <code>int32 row_count = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRowCount() {

      rowCount_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.PivotHeader)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.PivotHeader)
  private static final com.google.analytics.data.v1alpha.PivotHeader DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.PivotHeader();
  }

  public static com.google.analytics.data.v1alpha.PivotHeader getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PivotHeader> PARSER =
      new com.google.protobuf.AbstractParser<PivotHeader>() {
        @java.lang.Override
        public PivotHeader parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new PivotHeader(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<PivotHeader> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PivotHeader> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.PivotHeader getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
