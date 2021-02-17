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
 * Describes the visible dimension columns and rows in the report response.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.Pivot}
 */
public final class Pivot extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.Pivot)
    PivotOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Pivot.newBuilder() to construct.
  private Pivot(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Pivot() {
    fieldNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    orderBys_ = java.util.Collections.emptyList();
    metricAggregations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Pivot();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Pivot(
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
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                fieldNames_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              fieldNames_.add(s);
              break;
            }
          case 18:
            {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                orderBys_ = new java.util.ArrayList<com.google.analytics.data.v1alpha.OrderBy>();
                mutable_bitField0_ |= 0x00000002;
              }
              orderBys_.add(
                  input.readMessage(
                      com.google.analytics.data.v1alpha.OrderBy.parser(), extensionRegistry));
              break;
            }
          case 24:
            {
              offset_ = input.readInt64();
              break;
            }
          case 32:
            {
              limit_ = input.readInt64();
              break;
            }
          case 40:
            {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000004) != 0)) {
                metricAggregations_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000004;
              }
              metricAggregations_.add(rawValue);
              break;
            }
          case 42:
            {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while (input.getBytesUntilLimit() > 0) {
                int rawValue = input.readEnum();
                if (!((mutable_bitField0_ & 0x00000004) != 0)) {
                  metricAggregations_ = new java.util.ArrayList<java.lang.Integer>();
                  mutable_bitField0_ |= 0x00000004;
                }
                metricAggregations_.add(rawValue);
              }
              input.popLimit(oldLimit);
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
        fieldNames_ = fieldNames_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        orderBys_ = java.util.Collections.unmodifiableList(orderBys_);
      }
      if (((mutable_bitField0_ & 0x00000004) != 0)) {
        metricAggregations_ = java.util.Collections.unmodifiableList(metricAggregations_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_Pivot_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_Pivot_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.Pivot.class,
            com.google.analytics.data.v1alpha.Pivot.Builder.class);
  }

  public static final int FIELD_NAMES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList fieldNames_;
  /**
   *
   *
   * <pre>
   * Dimension names for visible columns in the report response. Including
   * "dateRange" produces a date range column; for each row in the response,
   * dimension values in the date range column will indicate the corresponding
   * date range from the request.
   * </pre>
   *
   * <code>repeated string field_names = 1;</code>
   *
   * @return A list containing the fieldNames.
   */
  public com.google.protobuf.ProtocolStringList getFieldNamesList() {
    return fieldNames_;
  }
  /**
   *
   *
   * <pre>
   * Dimension names for visible columns in the report response. Including
   * "dateRange" produces a date range column; for each row in the response,
   * dimension values in the date range column will indicate the corresponding
   * date range from the request.
   * </pre>
   *
   * <code>repeated string field_names = 1;</code>
   *
   * @return The count of fieldNames.
   */
  public int getFieldNamesCount() {
    return fieldNames_.size();
  }
  /**
   *
   *
   * <pre>
   * Dimension names for visible columns in the report response. Including
   * "dateRange" produces a date range column; for each row in the response,
   * dimension values in the date range column will indicate the corresponding
   * date range from the request.
   * </pre>
   *
   * <code>repeated string field_names = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The fieldNames at the given index.
   */
  public java.lang.String getFieldNames(int index) {
    return fieldNames_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Dimension names for visible columns in the report response. Including
   * "dateRange" produces a date range column; for each row in the response,
   * dimension values in the date range column will indicate the corresponding
   * date range from the request.
   * </pre>
   *
   * <code>repeated string field_names = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the fieldNames at the given index.
   */
  public com.google.protobuf.ByteString getFieldNamesBytes(int index) {
    return fieldNames_.getByteString(index);
  }

  public static final int ORDER_BYS_FIELD_NUMBER = 2;
  private java.util.List<com.google.analytics.data.v1alpha.OrderBy> orderBys_;
  /**
   *
   *
   * <pre>
   * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
   * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
   * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
   * Dimensions specified in these OrderBys must be a subset of
   * Pivot.field_names.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1alpha.OrderBy> getOrderBysList() {
    return orderBys_;
  }
  /**
   *
   *
   * <pre>
   * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
   * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
   * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
   * Dimensions specified in these OrderBys must be a subset of
   * Pivot.field_names.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.data.v1alpha.OrderByOrBuilder>
      getOrderBysOrBuilderList() {
    return orderBys_;
  }
  /**
   *
   *
   * <pre>
   * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
   * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
   * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
   * Dimensions specified in these OrderBys must be a subset of
   * Pivot.field_names.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 2;</code>
   */
  @java.lang.Override
  public int getOrderBysCount() {
    return orderBys_.size();
  }
  /**
   *
   *
   * <pre>
   * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
   * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
   * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
   * Dimensions specified in these OrderBys must be a subset of
   * Pivot.field_names.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 2;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.OrderBy getOrderBys(int index) {
    return orderBys_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
   * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
   * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
   * Dimensions specified in these OrderBys must be a subset of
   * Pivot.field_names.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 2;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.OrderByOrBuilder getOrderBysOrBuilder(int index) {
    return orderBys_.get(index);
  }

  public static final int OFFSET_FIELD_NUMBER = 3;
  private long offset_;
  /**
   *
   *
   * <pre>
   * The row count of the start row. The first row is counted as row 0.
   * </pre>
   *
   * <code>int64 offset = 3;</code>
   *
   * @return The offset.
   */
  @java.lang.Override
  public long getOffset() {
    return offset_;
  }

  public static final int LIMIT_FIELD_NUMBER = 4;
  private long limit_;
  /**
   *
   *
   * <pre>
   * The number of rows to return in this pivot. If unspecified, 10 rows are
   * returned. If -1, all rows are returned.
   * </pre>
   *
   * <code>int64 limit = 4;</code>
   *
   * @return The limit.
   */
  @java.lang.Override
  public long getLimit() {
    return limit_;
  }

  public static final int METRIC_AGGREGATIONS_FIELD_NUMBER = 5;
  private java.util.List<java.lang.Integer> metricAggregations_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
          java.lang.Integer, com.google.analytics.data.v1alpha.MetricAggregation>
      metricAggregations_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.google.analytics.data.v1alpha.MetricAggregation>() {
            public com.google.analytics.data.v1alpha.MetricAggregation convert(
                java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              com.google.analytics.data.v1alpha.MetricAggregation result =
                  com.google.analytics.data.v1alpha.MetricAggregation.valueOf(from);
              return result == null
                  ? com.google.analytics.data.v1alpha.MetricAggregation.UNRECOGNIZED
                  : result;
            }
          };
  /**
   *
   *
   * <pre>
   * Aggregate the metrics by dimensions in this pivot using the specified
   * metric_aggregations.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 5;</code>
   *
   * @return A list containing the metricAggregations.
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1alpha.MetricAggregation>
      getMetricAggregationsList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.google.analytics.data.v1alpha.MetricAggregation>(
        metricAggregations_, metricAggregations_converter_);
  }
  /**
   *
   *
   * <pre>
   * Aggregate the metrics by dimensions in this pivot using the specified
   * metric_aggregations.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 5;</code>
   *
   * @return The count of metricAggregations.
   */
  @java.lang.Override
  public int getMetricAggregationsCount() {
    return metricAggregations_.size();
  }
  /**
   *
   *
   * <pre>
   * Aggregate the metrics by dimensions in this pivot using the specified
   * metric_aggregations.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The metricAggregations at the given index.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.MetricAggregation getMetricAggregations(int index) {
    return metricAggregations_converter_.convert(metricAggregations_.get(index));
  }
  /**
   *
   *
   * <pre>
   * Aggregate the metrics by dimensions in this pivot using the specified
   * metric_aggregations.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 5;</code>
   *
   * @return A list containing the enum numeric values on the wire for metricAggregations.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer> getMetricAggregationsValueList() {
    return metricAggregations_;
  }
  /**
   *
   *
   * <pre>
   * Aggregate the metrics by dimensions in this pivot using the specified
   * metric_aggregations.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 5;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of metricAggregations at the given index.
   */
  @java.lang.Override
  public int getMetricAggregationsValue(int index) {
    return metricAggregations_.get(index);
  }

  private int metricAggregationsMemoizedSerializedSize;

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
    getSerializedSize();
    for (int i = 0; i < fieldNames_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fieldNames_.getRaw(i));
    }
    for (int i = 0; i < orderBys_.size(); i++) {
      output.writeMessage(2, orderBys_.get(i));
    }
    if (offset_ != 0L) {
      output.writeInt64(3, offset_);
    }
    if (limit_ != 0L) {
      output.writeInt64(4, limit_);
    }
    if (getMetricAggregationsList().size() > 0) {
      output.writeUInt32NoTag(42);
      output.writeUInt32NoTag(metricAggregationsMemoizedSerializedSize);
    }
    for (int i = 0; i < metricAggregations_.size(); i++) {
      output.writeEnumNoTag(metricAggregations_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < fieldNames_.size(); i++) {
        dataSize += computeStringSizeNoTag(fieldNames_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getFieldNamesList().size();
    }
    for (int i = 0; i < orderBys_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, orderBys_.get(i));
    }
    if (offset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(3, offset_);
    }
    if (limit_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(4, limit_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < metricAggregations_.size(); i++) {
        dataSize +=
            com.google.protobuf.CodedOutputStream.computeEnumSizeNoTag(metricAggregations_.get(i));
      }
      size += dataSize;
      if (!getMetricAggregationsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(dataSize);
      }
      metricAggregationsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.Pivot)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.Pivot other = (com.google.analytics.data.v1alpha.Pivot) obj;

    if (!getFieldNamesList().equals(other.getFieldNamesList())) return false;
    if (!getOrderBysList().equals(other.getOrderBysList())) return false;
    if (getOffset() != other.getOffset()) return false;
    if (getLimit() != other.getLimit()) return false;
    if (!metricAggregations_.equals(other.metricAggregations_)) return false;
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
    if (getFieldNamesCount() > 0) {
      hash = (37 * hash) + FIELD_NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getFieldNamesList().hashCode();
    }
    if (getOrderBysCount() > 0) {
      hash = (37 * hash) + ORDER_BYS_FIELD_NUMBER;
      hash = (53 * hash) + getOrderBysList().hashCode();
    }
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getOffset());
    hash = (37 * hash) + LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getLimit());
    if (getMetricAggregationsCount() > 0) {
      hash = (37 * hash) + METRIC_AGGREGATIONS_FIELD_NUMBER;
      hash = (53 * hash) + metricAggregations_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.Pivot parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.Pivot parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Pivot parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.Pivot parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Pivot parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.Pivot parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Pivot parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.Pivot parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Pivot parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.Pivot parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Pivot parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.Pivot parseFrom(
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

  public static Builder newBuilder(com.google.analytics.data.v1alpha.Pivot prototype) {
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
   * Describes the visible dimension columns and rows in the report response.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.Pivot}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.Pivot)
      com.google.analytics.data.v1alpha.PivotOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_Pivot_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_Pivot_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.Pivot.class,
              com.google.analytics.data.v1alpha.Pivot.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.Pivot.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getOrderBysFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      fieldNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (orderBysBuilder_ == null) {
        orderBys_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        orderBysBuilder_.clear();
      }
      offset_ = 0L;

      limit_ = 0L;

      metricAggregations_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_Pivot_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Pivot getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.Pivot.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Pivot build() {
      com.google.analytics.data.v1alpha.Pivot result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Pivot buildPartial() {
      com.google.analytics.data.v1alpha.Pivot result =
          new com.google.analytics.data.v1alpha.Pivot(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        fieldNames_ = fieldNames_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.fieldNames_ = fieldNames_;
      if (orderBysBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          orderBys_ = java.util.Collections.unmodifiableList(orderBys_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.orderBys_ = orderBys_;
      } else {
        result.orderBys_ = orderBysBuilder_.build();
      }
      result.offset_ = offset_;
      result.limit_ = limit_;
      if (((bitField0_ & 0x00000004) != 0)) {
        metricAggregations_ = java.util.Collections.unmodifiableList(metricAggregations_);
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.metricAggregations_ = metricAggregations_;
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
      if (other instanceof com.google.analytics.data.v1alpha.Pivot) {
        return mergeFrom((com.google.analytics.data.v1alpha.Pivot) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.Pivot other) {
      if (other == com.google.analytics.data.v1alpha.Pivot.getDefaultInstance()) return this;
      if (!other.fieldNames_.isEmpty()) {
        if (fieldNames_.isEmpty()) {
          fieldNames_ = other.fieldNames_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureFieldNamesIsMutable();
          fieldNames_.addAll(other.fieldNames_);
        }
        onChanged();
      }
      if (orderBysBuilder_ == null) {
        if (!other.orderBys_.isEmpty()) {
          if (orderBys_.isEmpty()) {
            orderBys_ = other.orderBys_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureOrderBysIsMutable();
            orderBys_.addAll(other.orderBys_);
          }
          onChanged();
        }
      } else {
        if (!other.orderBys_.isEmpty()) {
          if (orderBysBuilder_.isEmpty()) {
            orderBysBuilder_.dispose();
            orderBysBuilder_ = null;
            orderBys_ = other.orderBys_;
            bitField0_ = (bitField0_ & ~0x00000002);
            orderBysBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getOrderBysFieldBuilder()
                    : null;
          } else {
            orderBysBuilder_.addAllMessages(other.orderBys_);
          }
        }
      }
      if (other.getOffset() != 0L) {
        setOffset(other.getOffset());
      }
      if (other.getLimit() != 0L) {
        setLimit(other.getLimit());
      }
      if (!other.metricAggregations_.isEmpty()) {
        if (metricAggregations_.isEmpty()) {
          metricAggregations_ = other.metricAggregations_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureMetricAggregationsIsMutable();
          metricAggregations_.addAll(other.metricAggregations_);
        }
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
      com.google.analytics.data.v1alpha.Pivot parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.analytics.data.v1alpha.Pivot) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.LazyStringList fieldNames_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureFieldNamesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fieldNames_ = new com.google.protobuf.LazyStringArrayList(fieldNames_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * Dimension names for visible columns in the report response. Including
     * "dateRange" produces a date range column; for each row in the response,
     * dimension values in the date range column will indicate the corresponding
     * date range from the request.
     * </pre>
     *
     * <code>repeated string field_names = 1;</code>
     *
     * @return A list containing the fieldNames.
     */
    public com.google.protobuf.ProtocolStringList getFieldNamesList() {
      return fieldNames_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Dimension names for visible columns in the report response. Including
     * "dateRange" produces a date range column; for each row in the response,
     * dimension values in the date range column will indicate the corresponding
     * date range from the request.
     * </pre>
     *
     * <code>repeated string field_names = 1;</code>
     *
     * @return The count of fieldNames.
     */
    public int getFieldNamesCount() {
      return fieldNames_.size();
    }
    /**
     *
     *
     * <pre>
     * Dimension names for visible columns in the report response. Including
     * "dateRange" produces a date range column; for each row in the response,
     * dimension values in the date range column will indicate the corresponding
     * date range from the request.
     * </pre>
     *
     * <code>repeated string field_names = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The fieldNames at the given index.
     */
    public java.lang.String getFieldNames(int index) {
      return fieldNames_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Dimension names for visible columns in the report response. Including
     * "dateRange" produces a date range column; for each row in the response,
     * dimension values in the date range column will indicate the corresponding
     * date range from the request.
     * </pre>
     *
     * <code>repeated string field_names = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the fieldNames at the given index.
     */
    public com.google.protobuf.ByteString getFieldNamesBytes(int index) {
      return fieldNames_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Dimension names for visible columns in the report response. Including
     * "dateRange" produces a date range column; for each row in the response,
     * dimension values in the date range column will indicate the corresponding
     * date range from the request.
     * </pre>
     *
     * <code>repeated string field_names = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The fieldNames to set.
     * @return This builder for chaining.
     */
    public Builder setFieldNames(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureFieldNamesIsMutable();
      fieldNames_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Dimension names for visible columns in the report response. Including
     * "dateRange" produces a date range column; for each row in the response,
     * dimension values in the date range column will indicate the corresponding
     * date range from the request.
     * </pre>
     *
     * <code>repeated string field_names = 1;</code>
     *
     * @param value The fieldNames to add.
     * @return This builder for chaining.
     */
    public Builder addFieldNames(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureFieldNamesIsMutable();
      fieldNames_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Dimension names for visible columns in the report response. Including
     * "dateRange" produces a date range column; for each row in the response,
     * dimension values in the date range column will indicate the corresponding
     * date range from the request.
     * </pre>
     *
     * <code>repeated string field_names = 1;</code>
     *
     * @param values The fieldNames to add.
     * @return This builder for chaining.
     */
    public Builder addAllFieldNames(java.lang.Iterable<java.lang.String> values) {
      ensureFieldNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, fieldNames_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Dimension names for visible columns in the report response. Including
     * "dateRange" produces a date range column; for each row in the response,
     * dimension values in the date range column will indicate the corresponding
     * date range from the request.
     * </pre>
     *
     * <code>repeated string field_names = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFieldNames() {
      fieldNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Dimension names for visible columns in the report response. Including
     * "dateRange" produces a date range column; for each row in the response,
     * dimension values in the date range column will indicate the corresponding
     * date range from the request.
     * </pre>
     *
     * <code>repeated string field_names = 1;</code>
     *
     * @param value The bytes of the fieldNames to add.
     * @return This builder for chaining.
     */
    public Builder addFieldNamesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureFieldNamesIsMutable();
      fieldNames_.add(value);
      onChanged();
      return this;
    }

    private java.util.List<com.google.analytics.data.v1alpha.OrderBy> orderBys_ =
        java.util.Collections.emptyList();

    private void ensureOrderBysIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        orderBys_ = new java.util.ArrayList<com.google.analytics.data.v1alpha.OrderBy>(orderBys_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.OrderBy,
            com.google.analytics.data.v1alpha.OrderBy.Builder,
            com.google.analytics.data.v1alpha.OrderByOrBuilder>
        orderBysBuilder_;

    /**
     *
     *
     * <pre>
     * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
     * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
     * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
     * Dimensions specified in these OrderBys must be a subset of
     * Pivot.field_names.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 2;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.OrderBy> getOrderBysList() {
      if (orderBysBuilder_ == null) {
        return java.util.Collections.unmodifiableList(orderBys_);
      } else {
        return orderBysBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
     * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
     * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
     * Dimensions specified in these OrderBys must be a subset of
     * Pivot.field_names.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 2;</code>
     */
    public int getOrderBysCount() {
      if (orderBysBuilder_ == null) {
        return orderBys_.size();
      } else {
        return orderBysBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
     * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
     * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
     * Dimensions specified in these OrderBys must be a subset of
     * Pivot.field_names.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 2;</code>
     */
    public com.google.analytics.data.v1alpha.OrderBy getOrderBys(int index) {
      if (orderBysBuilder_ == null) {
        return orderBys_.get(index);
      } else {
        return orderBysBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
     * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
     * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
     * Dimensions specified in these OrderBys must be a subset of
     * Pivot.field_names.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 2;</code>
     */
    public Builder setOrderBys(int index, com.google.analytics.data.v1alpha.OrderBy value) {
      if (orderBysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrderBysIsMutable();
        orderBys_.set(index, value);
        onChanged();
      } else {
        orderBysBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
     * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
     * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
     * Dimensions specified in these OrderBys must be a subset of
     * Pivot.field_names.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 2;</code>
     */
    public Builder setOrderBys(
        int index, com.google.analytics.data.v1alpha.OrderBy.Builder builderForValue) {
      if (orderBysBuilder_ == null) {
        ensureOrderBysIsMutable();
        orderBys_.set(index, builderForValue.build());
        onChanged();
      } else {
        orderBysBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
     * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
     * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
     * Dimensions specified in these OrderBys must be a subset of
     * Pivot.field_names.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 2;</code>
     */
    public Builder addOrderBys(com.google.analytics.data.v1alpha.OrderBy value) {
      if (orderBysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrderBysIsMutable();
        orderBys_.add(value);
        onChanged();
      } else {
        orderBysBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
     * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
     * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
     * Dimensions specified in these OrderBys must be a subset of
     * Pivot.field_names.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 2;</code>
     */
    public Builder addOrderBys(int index, com.google.analytics.data.v1alpha.OrderBy value) {
      if (orderBysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrderBysIsMutable();
        orderBys_.add(index, value);
        onChanged();
      } else {
        orderBysBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
     * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
     * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
     * Dimensions specified in these OrderBys must be a subset of
     * Pivot.field_names.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 2;</code>
     */
    public Builder addOrderBys(com.google.analytics.data.v1alpha.OrderBy.Builder builderForValue) {
      if (orderBysBuilder_ == null) {
        ensureOrderBysIsMutable();
        orderBys_.add(builderForValue.build());
        onChanged();
      } else {
        orderBysBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
     * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
     * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
     * Dimensions specified in these OrderBys must be a subset of
     * Pivot.field_names.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 2;</code>
     */
    public Builder addOrderBys(
        int index, com.google.analytics.data.v1alpha.OrderBy.Builder builderForValue) {
      if (orderBysBuilder_ == null) {
        ensureOrderBysIsMutable();
        orderBys_.add(index, builderForValue.build());
        onChanged();
      } else {
        orderBysBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
     * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
     * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
     * Dimensions specified in these OrderBys must be a subset of
     * Pivot.field_names.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 2;</code>
     */
    public Builder addAllOrderBys(
        java.lang.Iterable<? extends com.google.analytics.data.v1alpha.OrderBy> values) {
      if (orderBysBuilder_ == null) {
        ensureOrderBysIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, orderBys_);
        onChanged();
      } else {
        orderBysBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
     * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
     * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
     * Dimensions specified in these OrderBys must be a subset of
     * Pivot.field_names.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 2;</code>
     */
    public Builder clearOrderBys() {
      if (orderBysBuilder_ == null) {
        orderBys_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        orderBysBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
     * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
     * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
     * Dimensions specified in these OrderBys must be a subset of
     * Pivot.field_names.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 2;</code>
     */
    public Builder removeOrderBys(int index) {
      if (orderBysBuilder_ == null) {
        ensureOrderBysIsMutable();
        orderBys_.remove(index);
        onChanged();
      } else {
        orderBysBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
     * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
     * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
     * Dimensions specified in these OrderBys must be a subset of
     * Pivot.field_names.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 2;</code>
     */
    public com.google.analytics.data.v1alpha.OrderBy.Builder getOrderBysBuilder(int index) {
      return getOrderBysFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
     * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
     * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
     * Dimensions specified in these OrderBys must be a subset of
     * Pivot.field_names.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 2;</code>
     */
    public com.google.analytics.data.v1alpha.OrderByOrBuilder getOrderBysOrBuilder(int index) {
      if (orderBysBuilder_ == null) {
        return orderBys_.get(index);
      } else {
        return orderBysBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
     * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
     * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
     * Dimensions specified in these OrderBys must be a subset of
     * Pivot.field_names.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 2;</code>
     */
    public java.util.List<? extends com.google.analytics.data.v1alpha.OrderByOrBuilder>
        getOrderBysOrBuilderList() {
      if (orderBysBuilder_ != null) {
        return orderBysBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(orderBys_);
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
     * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
     * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
     * Dimensions specified in these OrderBys must be a subset of
     * Pivot.field_names.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 2;</code>
     */
    public com.google.analytics.data.v1alpha.OrderBy.Builder addOrderBysBuilder() {
      return getOrderBysFieldBuilder()
          .addBuilder(com.google.analytics.data.v1alpha.OrderBy.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
     * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
     * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
     * Dimensions specified in these OrderBys must be a subset of
     * Pivot.field_names.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 2;</code>
     */
    public com.google.analytics.data.v1alpha.OrderBy.Builder addOrderBysBuilder(int index) {
      return getOrderBysFieldBuilder()
          .addBuilder(index, com.google.analytics.data.v1alpha.OrderBy.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Specifies how dimensions are ordered in the pivot. In the first Pivot, the
     * OrderBys determine Row and PivotDimensionHeader ordering; in subsequent
     * Pivots, the OrderBys determine only PivotDimensionHeader ordering.
     * Dimensions specified in these OrderBys must be a subset of
     * Pivot.field_names.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 2;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.OrderBy.Builder>
        getOrderBysBuilderList() {
      return getOrderBysFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.OrderBy,
            com.google.analytics.data.v1alpha.OrderBy.Builder,
            com.google.analytics.data.v1alpha.OrderByOrBuilder>
        getOrderBysFieldBuilder() {
      if (orderBysBuilder_ == null) {
        orderBysBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.data.v1alpha.OrderBy,
                com.google.analytics.data.v1alpha.OrderBy.Builder,
                com.google.analytics.data.v1alpha.OrderByOrBuilder>(
                orderBys_, ((bitField0_ & 0x00000002) != 0), getParentForChildren(), isClean());
        orderBys_ = null;
      }
      return orderBysBuilder_;
    }

    private long offset_;
    /**
     *
     *
     * <pre>
     * The row count of the start row. The first row is counted as row 0.
     * </pre>
     *
     * <code>int64 offset = 3;</code>
     *
     * @return The offset.
     */
    @java.lang.Override
    public long getOffset() {
      return offset_;
    }
    /**
     *
     *
     * <pre>
     * The row count of the start row. The first row is counted as row 0.
     * </pre>
     *
     * <code>int64 offset = 3;</code>
     *
     * @param value The offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffset(long value) {

      offset_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The row count of the start row. The first row is counted as row 0.
     * </pre>
     *
     * <code>int64 offset = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOffset() {

      offset_ = 0L;
      onChanged();
      return this;
    }

    private long limit_;
    /**
     *
     *
     * <pre>
     * The number of rows to return in this pivot. If unspecified, 10 rows are
     * returned. If -1, all rows are returned.
     * </pre>
     *
     * <code>int64 limit = 4;</code>
     *
     * @return The limit.
     */
    @java.lang.Override
    public long getLimit() {
      return limit_;
    }
    /**
     *
     *
     * <pre>
     * The number of rows to return in this pivot. If unspecified, 10 rows are
     * returned. If -1, all rows are returned.
     * </pre>
     *
     * <code>int64 limit = 4;</code>
     *
     * @param value The limit to set.
     * @return This builder for chaining.
     */
    public Builder setLimit(long value) {

      limit_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The number of rows to return in this pivot. If unspecified, 10 rows are
     * returned. If -1, all rows are returned.
     * </pre>
     *
     * <code>int64 limit = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLimit() {

      limit_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> metricAggregations_ =
        java.util.Collections.emptyList();

    private void ensureMetricAggregationsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        metricAggregations_ = new java.util.ArrayList<java.lang.Integer>(metricAggregations_);
        bitField0_ |= 0x00000004;
      }
    }
    /**
     *
     *
     * <pre>
     * Aggregate the metrics by dimensions in this pivot using the specified
     * metric_aggregations.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 5;
     * </code>
     *
     * @return A list containing the metricAggregations.
     */
    public java.util.List<com.google.analytics.data.v1alpha.MetricAggregation>
        getMetricAggregationsList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.google.analytics.data.v1alpha.MetricAggregation>(
          metricAggregations_, metricAggregations_converter_);
    }
    /**
     *
     *
     * <pre>
     * Aggregate the metrics by dimensions in this pivot using the specified
     * metric_aggregations.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 5;
     * </code>
     *
     * @return The count of metricAggregations.
     */
    public int getMetricAggregationsCount() {
      return metricAggregations_.size();
    }
    /**
     *
     *
     * <pre>
     * Aggregate the metrics by dimensions in this pivot using the specified
     * metric_aggregations.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 5;
     * </code>
     *
     * @param index The index of the element to return.
     * @return The metricAggregations at the given index.
     */
    public com.google.analytics.data.v1alpha.MetricAggregation getMetricAggregations(int index) {
      return metricAggregations_converter_.convert(metricAggregations_.get(index));
    }
    /**
     *
     *
     * <pre>
     * Aggregate the metrics by dimensions in this pivot using the specified
     * metric_aggregations.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 5;
     * </code>
     *
     * @param index The index to set the value at.
     * @param value The metricAggregations to set.
     * @return This builder for chaining.
     */
    public Builder setMetricAggregations(
        int index, com.google.analytics.data.v1alpha.MetricAggregation value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureMetricAggregationsIsMutable();
      metricAggregations_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Aggregate the metrics by dimensions in this pivot using the specified
     * metric_aggregations.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 5;
     * </code>
     *
     * @param value The metricAggregations to add.
     * @return This builder for chaining.
     */
    public Builder addMetricAggregations(
        com.google.analytics.data.v1alpha.MetricAggregation value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureMetricAggregationsIsMutable();
      metricAggregations_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Aggregate the metrics by dimensions in this pivot using the specified
     * metric_aggregations.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 5;
     * </code>
     *
     * @param values The metricAggregations to add.
     * @return This builder for chaining.
     */
    public Builder addAllMetricAggregations(
        java.lang.Iterable<? extends com.google.analytics.data.v1alpha.MetricAggregation> values) {
      ensureMetricAggregationsIsMutable();
      for (com.google.analytics.data.v1alpha.MetricAggregation value : values) {
        metricAggregations_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Aggregate the metrics by dimensions in this pivot using the specified
     * metric_aggregations.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 5;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMetricAggregations() {
      metricAggregations_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Aggregate the metrics by dimensions in this pivot using the specified
     * metric_aggregations.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 5;
     * </code>
     *
     * @return A list containing the enum numeric values on the wire for metricAggregations.
     */
    public java.util.List<java.lang.Integer> getMetricAggregationsValueList() {
      return java.util.Collections.unmodifiableList(metricAggregations_);
    }
    /**
     *
     *
     * <pre>
     * Aggregate the metrics by dimensions in this pivot using the specified
     * metric_aggregations.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 5;
     * </code>
     *
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of metricAggregations at the given index.
     */
    public int getMetricAggregationsValue(int index) {
      return metricAggregations_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Aggregate the metrics by dimensions in this pivot using the specified
     * metric_aggregations.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 5;
     * </code>
     *
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of metricAggregations at the given index.
     * @return This builder for chaining.
     */
    public Builder setMetricAggregationsValue(int index, int value) {
      ensureMetricAggregationsIsMutable();
      metricAggregations_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Aggregate the metrics by dimensions in this pivot using the specified
     * metric_aggregations.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 5;
     * </code>
     *
     * @param value The enum numeric value on the wire for metricAggregations to add.
     * @return This builder for chaining.
     */
    public Builder addMetricAggregationsValue(int value) {
      ensureMetricAggregationsIsMutable();
      metricAggregations_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Aggregate the metrics by dimensions in this pivot using the specified
     * metric_aggregations.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 5;
     * </code>
     *
     * @param values The enum numeric values on the wire for metricAggregations to add.
     * @return This builder for chaining.
     */
    public Builder addAllMetricAggregationsValue(java.lang.Iterable<java.lang.Integer> values) {
      ensureMetricAggregationsIsMutable();
      for (int value : values) {
        metricAggregations_.add(value);
      }
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.Pivot)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.Pivot)
  private static final com.google.analytics.data.v1alpha.Pivot DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.Pivot();
  }

  public static com.google.analytics.data.v1alpha.Pivot getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Pivot> PARSER =
      new com.google.protobuf.AbstractParser<Pivot>() {
        @java.lang.Override
        public Pivot parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Pivot(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Pivot> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Pivot> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.Pivot getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
