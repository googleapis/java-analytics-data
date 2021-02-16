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
// source: google/analytics/data/v1alpha/analytics_data_api.proto

package com.google.analytics.data.v1alpha;

/**
 *
 *
 * <pre>
 * The dimensions and metrics currently accepted in reporting methods.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.Metadata}
 */
public final class Metadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.Metadata)
    MetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Metadata.newBuilder() to construct.
  private Metadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Metadata() {
    name_ = "";
    dimensions_ = java.util.Collections.emptyList();
    metrics_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Metadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Metadata(
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
                dimensions_ =
                    new java.util.ArrayList<com.google.analytics.data.v1alpha.DimensionMetadata>();
                mutable_bitField0_ |= 0x00000001;
              }
              dimensions_.add(
                  input.readMessage(
                      com.google.analytics.data.v1alpha.DimensionMetadata.parser(),
                      extensionRegistry));
              break;
            }
          case 18:
            {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                metrics_ =
                    new java.util.ArrayList<com.google.analytics.data.v1alpha.MetricMetadata>();
                mutable_bitField0_ |= 0x00000002;
              }
              metrics_.add(
                  input.readMessage(
                      com.google.analytics.data.v1alpha.MetricMetadata.parser(),
                      extensionRegistry));
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
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
        dimensions_ = java.util.Collections.unmodifiableList(dimensions_);
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        metrics_ = java.util.Collections.unmodifiableList(metrics_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
        .internal_static_google_analytics_data_v1alpha_Metadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
        .internal_static_google_analytics_data_v1alpha_Metadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.Metadata.class,
            com.google.analytics.data.v1alpha.Metadata.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Resource name of this metadata.
   * </pre>
   *
   * <code>string name = 3;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Resource name of this metadata.
   * </pre>
   *
   * <code>string name = 3;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DIMENSIONS_FIELD_NUMBER = 1;
  private java.util.List<com.google.analytics.data.v1alpha.DimensionMetadata> dimensions_;
  /**
   *
   *
   * <pre>
   * The dimension descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1alpha.DimensionMetadata> getDimensionsList() {
    return dimensions_;
  }
  /**
   *
   *
   * <pre>
   * The dimension descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.data.v1alpha.DimensionMetadataOrBuilder>
      getDimensionsOrBuilderList() {
    return dimensions_;
  }
  /**
   *
   *
   * <pre>
   * The dimension descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
   */
  @java.lang.Override
  public int getDimensionsCount() {
    return dimensions_.size();
  }
  /**
   *
   *
   * <pre>
   * The dimension descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.DimensionMetadata getDimensions(int index) {
    return dimensions_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The dimension descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.DimensionMetadataOrBuilder getDimensionsOrBuilder(
      int index) {
    return dimensions_.get(index);
  }

  public static final int METRICS_FIELD_NUMBER = 2;
  private java.util.List<com.google.analytics.data.v1alpha.MetricMetadata> metrics_;
  /**
   *
   *
   * <pre>
   * The metric descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1alpha.MetricMetadata> getMetricsList() {
    return metrics_;
  }
  /**
   *
   *
   * <pre>
   * The metric descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.data.v1alpha.MetricMetadataOrBuilder>
      getMetricsOrBuilderList() {
    return metrics_;
  }
  /**
   *
   *
   * <pre>
   * The metric descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
   */
  @java.lang.Override
  public int getMetricsCount() {
    return metrics_.size();
  }
  /**
   *
   *
   * <pre>
   * The metric descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.MetricMetadata getMetrics(int index) {
    return metrics_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The metric descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.MetricMetadataOrBuilder getMetricsOrBuilder(int index) {
    return metrics_.get(index);
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
    for (int i = 0; i < dimensions_.size(); i++) {
      output.writeMessage(1, dimensions_.get(i));
    }
    for (int i = 0; i < metrics_.size(); i++) {
      output.writeMessage(2, metrics_.get(i));
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < dimensions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, dimensions_.get(i));
    }
    for (int i = 0; i < metrics_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, metrics_.get(i));
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.Metadata)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.Metadata other =
        (com.google.analytics.data.v1alpha.Metadata) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getDimensionsList().equals(other.getDimensionsList())) return false;
    if (!getMetricsList().equals(other.getMetricsList())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getDimensionsCount() > 0) {
      hash = (37 * hash) + DIMENSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getDimensionsList().hashCode();
    }
    if (getMetricsCount() > 0) {
      hash = (37 * hash) + METRICS_FIELD_NUMBER;
      hash = (53 * hash) + getMetricsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.Metadata parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.Metadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Metadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.Metadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Metadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.Metadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Metadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.Metadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Metadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.Metadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Metadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.Metadata parseFrom(
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

  public static Builder newBuilder(com.google.analytics.data.v1alpha.Metadata prototype) {
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
   * The dimensions and metrics currently accepted in reporting methods.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.Metadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.Metadata)
      com.google.analytics.data.v1alpha.MetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_Metadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_Metadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.Metadata.class,
              com.google.analytics.data.v1alpha.Metadata.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.Metadata.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDimensionsFieldBuilder();
        getMetricsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (dimensionsBuilder_ == null) {
        dimensions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        dimensionsBuilder_.clear();
      }
      if (metricsBuilder_ == null) {
        metrics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        metricsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_Metadata_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Metadata getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.Metadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Metadata build() {
      com.google.analytics.data.v1alpha.Metadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Metadata buildPartial() {
      com.google.analytics.data.v1alpha.Metadata result =
          new com.google.analytics.data.v1alpha.Metadata(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      if (dimensionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dimensions_ = java.util.Collections.unmodifiableList(dimensions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dimensions_ = dimensions_;
      } else {
        result.dimensions_ = dimensionsBuilder_.build();
      }
      if (metricsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          metrics_ = java.util.Collections.unmodifiableList(metrics_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.metrics_ = metrics_;
      } else {
        result.metrics_ = metricsBuilder_.build();
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
      if (other instanceof com.google.analytics.data.v1alpha.Metadata) {
        return mergeFrom((com.google.analytics.data.v1alpha.Metadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.Metadata other) {
      if (other == com.google.analytics.data.v1alpha.Metadata.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (dimensionsBuilder_ == null) {
        if (!other.dimensions_.isEmpty()) {
          if (dimensions_.isEmpty()) {
            dimensions_ = other.dimensions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDimensionsIsMutable();
            dimensions_.addAll(other.dimensions_);
          }
          onChanged();
        }
      } else {
        if (!other.dimensions_.isEmpty()) {
          if (dimensionsBuilder_.isEmpty()) {
            dimensionsBuilder_.dispose();
            dimensionsBuilder_ = null;
            dimensions_ = other.dimensions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dimensionsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDimensionsFieldBuilder()
                    : null;
          } else {
            dimensionsBuilder_.addAllMessages(other.dimensions_);
          }
        }
      }
      if (metricsBuilder_ == null) {
        if (!other.metrics_.isEmpty()) {
          if (metrics_.isEmpty()) {
            metrics_ = other.metrics_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureMetricsIsMutable();
            metrics_.addAll(other.metrics_);
          }
          onChanged();
        }
      } else {
        if (!other.metrics_.isEmpty()) {
          if (metricsBuilder_.isEmpty()) {
            metricsBuilder_.dispose();
            metricsBuilder_ = null;
            metrics_ = other.metrics_;
            bitField0_ = (bitField0_ & ~0x00000002);
            metricsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getMetricsFieldBuilder()
                    : null;
          } else {
            metricsBuilder_.addAllMessages(other.metrics_);
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
      com.google.analytics.data.v1alpha.Metadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.analytics.data.v1alpha.Metadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Resource name of this metadata.
     * </pre>
     *
     * <code>string name = 3;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource name of this metadata.
     * </pre>
     *
     * <code>string name = 3;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource name of this metadata.
     * </pre>
     *
     * <code>string name = 3;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource name of this metadata.
     * </pre>
     *
     * <code>string name = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource name of this metadata.
     * </pre>
     *
     * <code>string name = 3;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.google.analytics.data.v1alpha.DimensionMetadata> dimensions_ =
        java.util.Collections.emptyList();

    private void ensureDimensionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dimensions_ =
            new java.util.ArrayList<com.google.analytics.data.v1alpha.DimensionMetadata>(
                dimensions_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.DimensionMetadata,
            com.google.analytics.data.v1alpha.DimensionMetadata.Builder,
            com.google.analytics.data.v1alpha.DimensionMetadataOrBuilder>
        dimensionsBuilder_;

    /**
     *
     *
     * <pre>
     * The dimension descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.DimensionMetadata> getDimensionsList() {
      if (dimensionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dimensions_);
      } else {
        return dimensionsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The dimension descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
     */
    public int getDimensionsCount() {
      if (dimensionsBuilder_ == null) {
        return dimensions_.size();
      } else {
        return dimensionsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The dimension descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
     */
    public com.google.analytics.data.v1alpha.DimensionMetadata getDimensions(int index) {
      if (dimensionsBuilder_ == null) {
        return dimensions_.get(index);
      } else {
        return dimensionsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The dimension descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
     */
    public Builder setDimensions(
        int index, com.google.analytics.data.v1alpha.DimensionMetadata value) {
      if (dimensionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDimensionsIsMutable();
        dimensions_.set(index, value);
        onChanged();
      } else {
        dimensionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The dimension descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
     */
    public Builder setDimensions(
        int index, com.google.analytics.data.v1alpha.DimensionMetadata.Builder builderForValue) {
      if (dimensionsBuilder_ == null) {
        ensureDimensionsIsMutable();
        dimensions_.set(index, builderForValue.build());
        onChanged();
      } else {
        dimensionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The dimension descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
     */
    public Builder addDimensions(com.google.analytics.data.v1alpha.DimensionMetadata value) {
      if (dimensionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDimensionsIsMutable();
        dimensions_.add(value);
        onChanged();
      } else {
        dimensionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The dimension descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
     */
    public Builder addDimensions(
        int index, com.google.analytics.data.v1alpha.DimensionMetadata value) {
      if (dimensionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDimensionsIsMutable();
        dimensions_.add(index, value);
        onChanged();
      } else {
        dimensionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The dimension descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
     */
    public Builder addDimensions(
        com.google.analytics.data.v1alpha.DimensionMetadata.Builder builderForValue) {
      if (dimensionsBuilder_ == null) {
        ensureDimensionsIsMutable();
        dimensions_.add(builderForValue.build());
        onChanged();
      } else {
        dimensionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The dimension descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
     */
    public Builder addDimensions(
        int index, com.google.analytics.data.v1alpha.DimensionMetadata.Builder builderForValue) {
      if (dimensionsBuilder_ == null) {
        ensureDimensionsIsMutable();
        dimensions_.add(index, builderForValue.build());
        onChanged();
      } else {
        dimensionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The dimension descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
     */
    public Builder addAllDimensions(
        java.lang.Iterable<? extends com.google.analytics.data.v1alpha.DimensionMetadata> values) {
      if (dimensionsBuilder_ == null) {
        ensureDimensionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, dimensions_);
        onChanged();
      } else {
        dimensionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The dimension descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
     */
    public Builder clearDimensions() {
      if (dimensionsBuilder_ == null) {
        dimensions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dimensionsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The dimension descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
     */
    public Builder removeDimensions(int index) {
      if (dimensionsBuilder_ == null) {
        ensureDimensionsIsMutable();
        dimensions_.remove(index);
        onChanged();
      } else {
        dimensionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The dimension descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
     */
    public com.google.analytics.data.v1alpha.DimensionMetadata.Builder getDimensionsBuilder(
        int index) {
      return getDimensionsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The dimension descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
     */
    public com.google.analytics.data.v1alpha.DimensionMetadataOrBuilder getDimensionsOrBuilder(
        int index) {
      if (dimensionsBuilder_ == null) {
        return dimensions_.get(index);
      } else {
        return dimensionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The dimension descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
     */
    public java.util.List<? extends com.google.analytics.data.v1alpha.DimensionMetadataOrBuilder>
        getDimensionsOrBuilderList() {
      if (dimensionsBuilder_ != null) {
        return dimensionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dimensions_);
      }
    }
    /**
     *
     *
     * <pre>
     * The dimension descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
     */
    public com.google.analytics.data.v1alpha.DimensionMetadata.Builder addDimensionsBuilder() {
      return getDimensionsFieldBuilder()
          .addBuilder(com.google.analytics.data.v1alpha.DimensionMetadata.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The dimension descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
     */
    public com.google.analytics.data.v1alpha.DimensionMetadata.Builder addDimensionsBuilder(
        int index) {
      return getDimensionsFieldBuilder()
          .addBuilder(
              index, com.google.analytics.data.v1alpha.DimensionMetadata.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The dimension descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.DimensionMetadata.Builder>
        getDimensionsBuilderList() {
      return getDimensionsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.DimensionMetadata,
            com.google.analytics.data.v1alpha.DimensionMetadata.Builder,
            com.google.analytics.data.v1alpha.DimensionMetadataOrBuilder>
        getDimensionsFieldBuilder() {
      if (dimensionsBuilder_ == null) {
        dimensionsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.data.v1alpha.DimensionMetadata,
                com.google.analytics.data.v1alpha.DimensionMetadata.Builder,
                com.google.analytics.data.v1alpha.DimensionMetadataOrBuilder>(
                dimensions_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        dimensions_ = null;
      }
      return dimensionsBuilder_;
    }

    private java.util.List<com.google.analytics.data.v1alpha.MetricMetadata> metrics_ =
        java.util.Collections.emptyList();

    private void ensureMetricsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        metrics_ =
            new java.util.ArrayList<com.google.analytics.data.v1alpha.MetricMetadata>(metrics_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.MetricMetadata,
            com.google.analytics.data.v1alpha.MetricMetadata.Builder,
            com.google.analytics.data.v1alpha.MetricMetadataOrBuilder>
        metricsBuilder_;

    /**
     *
     *
     * <pre>
     * The metric descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.MetricMetadata> getMetricsList() {
      if (metricsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(metrics_);
      } else {
        return metricsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The metric descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
     */
    public int getMetricsCount() {
      if (metricsBuilder_ == null) {
        return metrics_.size();
      } else {
        return metricsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The metric descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
     */
    public com.google.analytics.data.v1alpha.MetricMetadata getMetrics(int index) {
      if (metricsBuilder_ == null) {
        return metrics_.get(index);
      } else {
        return metricsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The metric descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
     */
    public Builder setMetrics(int index, com.google.analytics.data.v1alpha.MetricMetadata value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.set(index, value);
        onChanged();
      } else {
        metricsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The metric descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
     */
    public Builder setMetrics(
        int index, com.google.analytics.data.v1alpha.MetricMetadata.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.set(index, builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The metric descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
     */
    public Builder addMetrics(com.google.analytics.data.v1alpha.MetricMetadata value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.add(value);
        onChanged();
      } else {
        metricsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The metric descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
     */
    public Builder addMetrics(int index, com.google.analytics.data.v1alpha.MetricMetadata value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.add(index, value);
        onChanged();
      } else {
        metricsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The metric descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
     */
    public Builder addMetrics(
        com.google.analytics.data.v1alpha.MetricMetadata.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.add(builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The metric descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
     */
    public Builder addMetrics(
        int index, com.google.analytics.data.v1alpha.MetricMetadata.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.add(index, builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The metric descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
     */
    public Builder addAllMetrics(
        java.lang.Iterable<? extends com.google.analytics.data.v1alpha.MetricMetadata> values) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, metrics_);
        onChanged();
      } else {
        metricsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The metric descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
     */
    public Builder clearMetrics() {
      if (metricsBuilder_ == null) {
        metrics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        metricsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The metric descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
     */
    public Builder removeMetrics(int index) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.remove(index);
        onChanged();
      } else {
        metricsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The metric descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
     */
    public com.google.analytics.data.v1alpha.MetricMetadata.Builder getMetricsBuilder(int index) {
      return getMetricsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The metric descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
     */
    public com.google.analytics.data.v1alpha.MetricMetadataOrBuilder getMetricsOrBuilder(
        int index) {
      if (metricsBuilder_ == null) {
        return metrics_.get(index);
      } else {
        return metricsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The metric descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
     */
    public java.util.List<? extends com.google.analytics.data.v1alpha.MetricMetadataOrBuilder>
        getMetricsOrBuilderList() {
      if (metricsBuilder_ != null) {
        return metricsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(metrics_);
      }
    }
    /**
     *
     *
     * <pre>
     * The metric descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
     */
    public com.google.analytics.data.v1alpha.MetricMetadata.Builder addMetricsBuilder() {
      return getMetricsFieldBuilder()
          .addBuilder(com.google.analytics.data.v1alpha.MetricMetadata.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The metric descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
     */
    public com.google.analytics.data.v1alpha.MetricMetadata.Builder addMetricsBuilder(int index) {
      return getMetricsFieldBuilder()
          .addBuilder(index, com.google.analytics.data.v1alpha.MetricMetadata.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The metric descriptions.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.MetricMetadata.Builder>
        getMetricsBuilderList() {
      return getMetricsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.MetricMetadata,
            com.google.analytics.data.v1alpha.MetricMetadata.Builder,
            com.google.analytics.data.v1alpha.MetricMetadataOrBuilder>
        getMetricsFieldBuilder() {
      if (metricsBuilder_ == null) {
        metricsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.data.v1alpha.MetricMetadata,
                com.google.analytics.data.v1alpha.MetricMetadata.Builder,
                com.google.analytics.data.v1alpha.MetricMetadataOrBuilder>(
                metrics_, ((bitField0_ & 0x00000002) != 0), getParentForChildren(), isClean());
        metrics_ = null;
      }
      return metricsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.Metadata)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.Metadata)
  private static final com.google.analytics.data.v1alpha.Metadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.Metadata();
  }

  public static com.google.analytics.data.v1alpha.Metadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Metadata> PARSER =
      new com.google.protobuf.AbstractParser<Metadata>() {
        @java.lang.Override
        public Metadata parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Metadata(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Metadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Metadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.Metadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
