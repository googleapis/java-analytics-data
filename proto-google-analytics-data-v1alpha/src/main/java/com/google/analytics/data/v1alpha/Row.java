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
 * Report data for each row.
 * For example if RunReportRequest contains:
 * ```none
 * "dimensions": [
 *   {
 *     "name": "eventName"
 *   },
 *   {
 *     "name": "countryId"
 *   }
 * ],
 * "metrics": [
 *   {
 *     "name": "eventCount"
 *   }
 * ]
 * ```
 * One row with 'in_app_purchase' as the eventName, 'JP' as the countryId, and
 * 15 as the eventCount, would be:
 * ```none
 * "dimensionValues": [
 *   {
 *     "value": "in_app_purchase"
 *   },
 *   {
 *     "value": "JP"
 *   }
 * ],
 * "metricValues": [
 *   {
 *     "value": "15"
 *   }
 * ]
 * ```
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.Row}
 */
public final class Row extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.Row)
    RowOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Row.newBuilder() to construct.
  private Row(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Row() {
    dimensionValues_ = java.util.Collections.emptyList();
    metricValues_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Row();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Row(
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
          case 18:
            {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                metricValues_ =
                    new java.util.ArrayList<com.google.analytics.data.v1alpha.MetricValue>();
                mutable_bitField0_ |= 0x00000002;
              }
              metricValues_.add(
                  input.readMessage(
                      com.google.analytics.data.v1alpha.MetricValue.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        metricValues_ = java.util.Collections.unmodifiableList(metricValues_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_Row_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_Row_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.Row.class,
            com.google.analytics.data.v1alpha.Row.Builder.class);
  }

  public static final int DIMENSION_VALUES_FIELD_NUMBER = 1;
  private java.util.List<com.google.analytics.data.v1alpha.DimensionValue> dimensionValues_;
  /**
   *
   *
   * <pre>
   * List of requested dimension values. In a PivotReport, dimension_values
   * are only listed for dimensions included in a pivot.
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
   * List of requested dimension values. In a PivotReport, dimension_values
   * are only listed for dimensions included in a pivot.
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
   * List of requested dimension values. In a PivotReport, dimension_values
   * are only listed for dimensions included in a pivot.
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
   * List of requested dimension values. In a PivotReport, dimension_values
   * are only listed for dimensions included in a pivot.
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
   * List of requested dimension values. In a PivotReport, dimension_values
   * are only listed for dimensions included in a pivot.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.DimensionValueOrBuilder getDimensionValuesOrBuilder(
      int index) {
    return dimensionValues_.get(index);
  }

  public static final int METRIC_VALUES_FIELD_NUMBER = 2;
  private java.util.List<com.google.analytics.data.v1alpha.MetricValue> metricValues_;
  /**
   *
   *
   * <pre>
   * List of requested visible metric values.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1alpha.MetricValue> getMetricValuesList() {
    return metricValues_;
  }
  /**
   *
   *
   * <pre>
   * List of requested visible metric values.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.data.v1alpha.MetricValueOrBuilder>
      getMetricValuesOrBuilderList() {
    return metricValues_;
  }
  /**
   *
   *
   * <pre>
   * List of requested visible metric values.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
   */
  @java.lang.Override
  public int getMetricValuesCount() {
    return metricValues_.size();
  }
  /**
   *
   *
   * <pre>
   * List of requested visible metric values.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.MetricValue getMetricValues(int index) {
    return metricValues_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of requested visible metric values.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.MetricValueOrBuilder getMetricValuesOrBuilder(
      int index) {
    return metricValues_.get(index);
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
    for (int i = 0; i < metricValues_.size(); i++) {
      output.writeMessage(2, metricValues_.get(i));
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
    for (int i = 0; i < metricValues_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, metricValues_.get(i));
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.Row)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.Row other = (com.google.analytics.data.v1alpha.Row) obj;

    if (!getDimensionValuesList().equals(other.getDimensionValuesList())) return false;
    if (!getMetricValuesList().equals(other.getMetricValuesList())) return false;
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
    if (getMetricValuesCount() > 0) {
      hash = (37 * hash) + METRIC_VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getMetricValuesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.Row parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.Row parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Row parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.Row parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Row parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.Row parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Row parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.Row parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Row parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.Row parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Row parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.Row parseFrom(
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

  public static Builder newBuilder(com.google.analytics.data.v1alpha.Row prototype) {
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
   * Report data for each row.
   * For example if RunReportRequest contains:
   * ```none
   * "dimensions": [
   *   {
   *     "name": "eventName"
   *   },
   *   {
   *     "name": "countryId"
   *   }
   * ],
   * "metrics": [
   *   {
   *     "name": "eventCount"
   *   }
   * ]
   * ```
   * One row with 'in_app_purchase' as the eventName, 'JP' as the countryId, and
   * 15 as the eventCount, would be:
   * ```none
   * "dimensionValues": [
   *   {
   *     "value": "in_app_purchase"
   *   },
   *   {
   *     "value": "JP"
   *   }
   * ],
   * "metricValues": [
   *   {
   *     "value": "15"
   *   }
   * ]
   * ```
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.Row}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.Row)
      com.google.analytics.data.v1alpha.RowOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_Row_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_Row_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.Row.class,
              com.google.analytics.data.v1alpha.Row.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.Row.newBuilder()
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
        getMetricValuesFieldBuilder();
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
      if (metricValuesBuilder_ == null) {
        metricValues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        metricValuesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_Row_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Row getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.Row.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Row build() {
      com.google.analytics.data.v1alpha.Row result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Row buildPartial() {
      com.google.analytics.data.v1alpha.Row result =
          new com.google.analytics.data.v1alpha.Row(this);
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
      if (metricValuesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          metricValues_ = java.util.Collections.unmodifiableList(metricValues_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.metricValues_ = metricValues_;
      } else {
        result.metricValues_ = metricValuesBuilder_.build();
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
      if (other instanceof com.google.analytics.data.v1alpha.Row) {
        return mergeFrom((com.google.analytics.data.v1alpha.Row) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.Row other) {
      if (other == com.google.analytics.data.v1alpha.Row.getDefaultInstance()) return this;
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
      if (metricValuesBuilder_ == null) {
        if (!other.metricValues_.isEmpty()) {
          if (metricValues_.isEmpty()) {
            metricValues_ = other.metricValues_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureMetricValuesIsMutable();
            metricValues_.addAll(other.metricValues_);
          }
          onChanged();
        }
      } else {
        if (!other.metricValues_.isEmpty()) {
          if (metricValuesBuilder_.isEmpty()) {
            metricValuesBuilder_.dispose();
            metricValuesBuilder_ = null;
            metricValues_ = other.metricValues_;
            bitField0_ = (bitField0_ & ~0x00000002);
            metricValuesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getMetricValuesFieldBuilder()
                    : null;
          } else {
            metricValuesBuilder_.addAllMessages(other.metricValues_);
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
      com.google.analytics.data.v1alpha.Row parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.analytics.data.v1alpha.Row) e.getUnfinishedMessage();
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
     * List of requested dimension values. In a PivotReport, dimension_values
     * are only listed for dimensions included in a pivot.
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
     * List of requested dimension values. In a PivotReport, dimension_values
     * are only listed for dimensions included in a pivot.
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
     * List of requested dimension values. In a PivotReport, dimension_values
     * are only listed for dimensions included in a pivot.
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
     * List of requested dimension values. In a PivotReport, dimension_values
     * are only listed for dimensions included in a pivot.
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
     * List of requested dimension values. In a PivotReport, dimension_values
     * are only listed for dimensions included in a pivot.
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
     * List of requested dimension values. In a PivotReport, dimension_values
     * are only listed for dimensions included in a pivot.
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
     * List of requested dimension values. In a PivotReport, dimension_values
     * are only listed for dimensions included in a pivot.
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
     * List of requested dimension values. In a PivotReport, dimension_values
     * are only listed for dimensions included in a pivot.
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
     * List of requested dimension values. In a PivotReport, dimension_values
     * are only listed for dimensions included in a pivot.
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
     * List of requested dimension values. In a PivotReport, dimension_values
     * are only listed for dimensions included in a pivot.
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
     * List of requested dimension values. In a PivotReport, dimension_values
     * are only listed for dimensions included in a pivot.
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
     * List of requested dimension values. In a PivotReport, dimension_values
     * are only listed for dimensions included in a pivot.
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
     * List of requested dimension values. In a PivotReport, dimension_values
     * are only listed for dimensions included in a pivot.
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
     * List of requested dimension values. In a PivotReport, dimension_values
     * are only listed for dimensions included in a pivot.
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
     * List of requested dimension values. In a PivotReport, dimension_values
     * are only listed for dimensions included in a pivot.
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
     * List of requested dimension values. In a PivotReport, dimension_values
     * are only listed for dimensions included in a pivot.
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
     * List of requested dimension values. In a PivotReport, dimension_values
     * are only listed for dimensions included in a pivot.
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
     * List of requested dimension values. In a PivotReport, dimension_values
     * are only listed for dimensions included in a pivot.
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

    private java.util.List<com.google.analytics.data.v1alpha.MetricValue> metricValues_ =
        java.util.Collections.emptyList();

    private void ensureMetricValuesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        metricValues_ =
            new java.util.ArrayList<com.google.analytics.data.v1alpha.MetricValue>(metricValues_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.MetricValue,
            com.google.analytics.data.v1alpha.MetricValue.Builder,
            com.google.analytics.data.v1alpha.MetricValueOrBuilder>
        metricValuesBuilder_;

    /**
     *
     *
     * <pre>
     * List of requested visible metric values.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.MetricValue> getMetricValuesList() {
      if (metricValuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(metricValues_);
      } else {
        return metricValuesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of requested visible metric values.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
     */
    public int getMetricValuesCount() {
      if (metricValuesBuilder_ == null) {
        return metricValues_.size();
      } else {
        return metricValuesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of requested visible metric values.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
     */
    public com.google.analytics.data.v1alpha.MetricValue getMetricValues(int index) {
      if (metricValuesBuilder_ == null) {
        return metricValues_.get(index);
      } else {
        return metricValuesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of requested visible metric values.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
     */
    public Builder setMetricValues(int index, com.google.analytics.data.v1alpha.MetricValue value) {
      if (metricValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricValuesIsMutable();
        metricValues_.set(index, value);
        onChanged();
      } else {
        metricValuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of requested visible metric values.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
     */
    public Builder setMetricValues(
        int index, com.google.analytics.data.v1alpha.MetricValue.Builder builderForValue) {
      if (metricValuesBuilder_ == null) {
        ensureMetricValuesIsMutable();
        metricValues_.set(index, builderForValue.build());
        onChanged();
      } else {
        metricValuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of requested visible metric values.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
     */
    public Builder addMetricValues(com.google.analytics.data.v1alpha.MetricValue value) {
      if (metricValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricValuesIsMutable();
        metricValues_.add(value);
        onChanged();
      } else {
        metricValuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of requested visible metric values.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
     */
    public Builder addMetricValues(int index, com.google.analytics.data.v1alpha.MetricValue value) {
      if (metricValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricValuesIsMutable();
        metricValues_.add(index, value);
        onChanged();
      } else {
        metricValuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of requested visible metric values.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
     */
    public Builder addMetricValues(
        com.google.analytics.data.v1alpha.MetricValue.Builder builderForValue) {
      if (metricValuesBuilder_ == null) {
        ensureMetricValuesIsMutable();
        metricValues_.add(builderForValue.build());
        onChanged();
      } else {
        metricValuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of requested visible metric values.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
     */
    public Builder addMetricValues(
        int index, com.google.analytics.data.v1alpha.MetricValue.Builder builderForValue) {
      if (metricValuesBuilder_ == null) {
        ensureMetricValuesIsMutable();
        metricValues_.add(index, builderForValue.build());
        onChanged();
      } else {
        metricValuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of requested visible metric values.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
     */
    public Builder addAllMetricValues(
        java.lang.Iterable<? extends com.google.analytics.data.v1alpha.MetricValue> values) {
      if (metricValuesBuilder_ == null) {
        ensureMetricValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, metricValues_);
        onChanged();
      } else {
        metricValuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of requested visible metric values.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
     */
    public Builder clearMetricValues() {
      if (metricValuesBuilder_ == null) {
        metricValues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        metricValuesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of requested visible metric values.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
     */
    public Builder removeMetricValues(int index) {
      if (metricValuesBuilder_ == null) {
        ensureMetricValuesIsMutable();
        metricValues_.remove(index);
        onChanged();
      } else {
        metricValuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of requested visible metric values.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
     */
    public com.google.analytics.data.v1alpha.MetricValue.Builder getMetricValuesBuilder(int index) {
      return getMetricValuesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of requested visible metric values.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
     */
    public com.google.analytics.data.v1alpha.MetricValueOrBuilder getMetricValuesOrBuilder(
        int index) {
      if (metricValuesBuilder_ == null) {
        return metricValues_.get(index);
      } else {
        return metricValuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of requested visible metric values.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
     */
    public java.util.List<? extends com.google.analytics.data.v1alpha.MetricValueOrBuilder>
        getMetricValuesOrBuilderList() {
      if (metricValuesBuilder_ != null) {
        return metricValuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(metricValues_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of requested visible metric values.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
     */
    public com.google.analytics.data.v1alpha.MetricValue.Builder addMetricValuesBuilder() {
      return getMetricValuesFieldBuilder()
          .addBuilder(com.google.analytics.data.v1alpha.MetricValue.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of requested visible metric values.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
     */
    public com.google.analytics.data.v1alpha.MetricValue.Builder addMetricValuesBuilder(int index) {
      return getMetricValuesFieldBuilder()
          .addBuilder(index, com.google.analytics.data.v1alpha.MetricValue.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of requested visible metric values.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.MetricValue.Builder>
        getMetricValuesBuilderList() {
      return getMetricValuesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.MetricValue,
            com.google.analytics.data.v1alpha.MetricValue.Builder,
            com.google.analytics.data.v1alpha.MetricValueOrBuilder>
        getMetricValuesFieldBuilder() {
      if (metricValuesBuilder_ == null) {
        metricValuesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.data.v1alpha.MetricValue,
                com.google.analytics.data.v1alpha.MetricValue.Builder,
                com.google.analytics.data.v1alpha.MetricValueOrBuilder>(
                metricValues_, ((bitField0_ & 0x00000002) != 0), getParentForChildren(), isClean());
        metricValues_ = null;
      }
      return metricValuesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.Row)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.Row)
  private static final com.google.analytics.data.v1alpha.Row DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.Row();
  }

  public static com.google.analytics.data.v1alpha.Row getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Row> PARSER =
      new com.google.protobuf.AbstractParser<Row>() {
        @java.lang.Override
        public Row parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Row(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Row> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Row> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.Row getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
