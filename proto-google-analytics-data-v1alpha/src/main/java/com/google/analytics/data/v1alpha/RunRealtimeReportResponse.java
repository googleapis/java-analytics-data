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
 * The response realtime report table corresponding to a request.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.RunRealtimeReportResponse}
 */
public final class RunRealtimeReportResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.RunRealtimeReportResponse)
    RunRealtimeReportResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RunRealtimeReportResponse.newBuilder() to construct.
  private RunRealtimeReportResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RunRealtimeReportResponse() {
    dimensionHeaders_ = java.util.Collections.emptyList();
    metricHeaders_ = java.util.Collections.emptyList();
    rows_ = java.util.Collections.emptyList();
    totals_ = java.util.Collections.emptyList();
    maximums_ = java.util.Collections.emptyList();
    minimums_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RunRealtimeReportResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private RunRealtimeReportResponse(
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
                dimensionHeaders_ =
                    new java.util.ArrayList<com.google.analytics.data.v1alpha.DimensionHeader>();
                mutable_bitField0_ |= 0x00000001;
              }
              dimensionHeaders_.add(
                  input.readMessage(
                      com.google.analytics.data.v1alpha.DimensionHeader.parser(),
                      extensionRegistry));
              break;
            }
          case 18:
            {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                metricHeaders_ =
                    new java.util.ArrayList<com.google.analytics.data.v1alpha.MetricHeader>();
                mutable_bitField0_ |= 0x00000002;
              }
              metricHeaders_.add(
                  input.readMessage(
                      com.google.analytics.data.v1alpha.MetricHeader.parser(), extensionRegistry));
              break;
            }
          case 26:
            {
              if (!((mutable_bitField0_ & 0x00000004) != 0)) {
                rows_ = new java.util.ArrayList<com.google.analytics.data.v1alpha.Row>();
                mutable_bitField0_ |= 0x00000004;
              }
              rows_.add(
                  input.readMessage(
                      com.google.analytics.data.v1alpha.Row.parser(), extensionRegistry));
              break;
            }
          case 34:
            {
              if (!((mutable_bitField0_ & 0x00000008) != 0)) {
                totals_ = new java.util.ArrayList<com.google.analytics.data.v1alpha.Row>();
                mutable_bitField0_ |= 0x00000008;
              }
              totals_.add(
                  input.readMessage(
                      com.google.analytics.data.v1alpha.Row.parser(), extensionRegistry));
              break;
            }
          case 42:
            {
              if (!((mutable_bitField0_ & 0x00000010) != 0)) {
                maximums_ = new java.util.ArrayList<com.google.analytics.data.v1alpha.Row>();
                mutable_bitField0_ |= 0x00000010;
              }
              maximums_.add(
                  input.readMessage(
                      com.google.analytics.data.v1alpha.Row.parser(), extensionRegistry));
              break;
            }
          case 50:
            {
              if (!((mutable_bitField0_ & 0x00000020) != 0)) {
                minimums_ = new java.util.ArrayList<com.google.analytics.data.v1alpha.Row>();
                mutable_bitField0_ |= 0x00000020;
              }
              minimums_.add(
                  input.readMessage(
                      com.google.analytics.data.v1alpha.Row.parser(), extensionRegistry));
              break;
            }
          case 56:
            {
              rowCount_ = input.readInt32();
              break;
            }
          case 66:
            {
              com.google.analytics.data.v1alpha.PropertyQuota.Builder subBuilder = null;
              if (propertyQuota_ != null) {
                subBuilder = propertyQuota_.toBuilder();
              }
              propertyQuota_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.PropertyQuota.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(propertyQuota_);
                propertyQuota_ = subBuilder.buildPartial();
              }

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
        dimensionHeaders_ = java.util.Collections.unmodifiableList(dimensionHeaders_);
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        metricHeaders_ = java.util.Collections.unmodifiableList(metricHeaders_);
      }
      if (((mutable_bitField0_ & 0x00000004) != 0)) {
        rows_ = java.util.Collections.unmodifiableList(rows_);
      }
      if (((mutable_bitField0_ & 0x00000008) != 0)) {
        totals_ = java.util.Collections.unmodifiableList(totals_);
      }
      if (((mutable_bitField0_ & 0x00000010) != 0)) {
        maximums_ = java.util.Collections.unmodifiableList(maximums_);
      }
      if (((mutable_bitField0_ & 0x00000020) != 0)) {
        minimums_ = java.util.Collections.unmodifiableList(minimums_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
        .internal_static_google_analytics_data_v1alpha_RunRealtimeReportResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
        .internal_static_google_analytics_data_v1alpha_RunRealtimeReportResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.RunRealtimeReportResponse.class,
            com.google.analytics.data.v1alpha.RunRealtimeReportResponse.Builder.class);
  }

  public static final int DIMENSION_HEADERS_FIELD_NUMBER = 1;
  private java.util.List<com.google.analytics.data.v1alpha.DimensionHeader> dimensionHeaders_;
  /**
   *
   *
   * <pre>
   * Describes dimension columns. The number of DimensionHeaders and ordering of
   * DimensionHeaders matches the dimensions present in rows.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1alpha.DimensionHeader>
      getDimensionHeadersList() {
    return dimensionHeaders_;
  }
  /**
   *
   *
   * <pre>
   * Describes dimension columns. The number of DimensionHeaders and ordering of
   * DimensionHeaders matches the dimensions present in rows.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.data.v1alpha.DimensionHeaderOrBuilder>
      getDimensionHeadersOrBuilderList() {
    return dimensionHeaders_;
  }
  /**
   *
   *
   * <pre>
   * Describes dimension columns. The number of DimensionHeaders and ordering of
   * DimensionHeaders matches the dimensions present in rows.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 1;</code>
   */
  @java.lang.Override
  public int getDimensionHeadersCount() {
    return dimensionHeaders_.size();
  }
  /**
   *
   *
   * <pre>
   * Describes dimension columns. The number of DimensionHeaders and ordering of
   * DimensionHeaders matches the dimensions present in rows.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.DimensionHeader getDimensionHeaders(int index) {
    return dimensionHeaders_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Describes dimension columns. The number of DimensionHeaders and ordering of
   * DimensionHeaders matches the dimensions present in rows.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.DimensionHeaderOrBuilder getDimensionHeadersOrBuilder(
      int index) {
    return dimensionHeaders_.get(index);
  }

  public static final int METRIC_HEADERS_FIELD_NUMBER = 2;
  private java.util.List<com.google.analytics.data.v1alpha.MetricHeader> metricHeaders_;
  /**
   *
   *
   * <pre>
   * Describes metric columns. The number of MetricHeaders and ordering of
   * MetricHeaders matches the metrics present in rows.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1alpha.MetricHeader> getMetricHeadersList() {
    return metricHeaders_;
  }
  /**
   *
   *
   * <pre>
   * Describes metric columns. The number of MetricHeaders and ordering of
   * MetricHeaders matches the metrics present in rows.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.data.v1alpha.MetricHeaderOrBuilder>
      getMetricHeadersOrBuilderList() {
    return metricHeaders_;
  }
  /**
   *
   *
   * <pre>
   * Describes metric columns. The number of MetricHeaders and ordering of
   * MetricHeaders matches the metrics present in rows.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 2;</code>
   */
  @java.lang.Override
  public int getMetricHeadersCount() {
    return metricHeaders_.size();
  }
  /**
   *
   *
   * <pre>
   * Describes metric columns. The number of MetricHeaders and ordering of
   * MetricHeaders matches the metrics present in rows.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 2;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.MetricHeader getMetricHeaders(int index) {
    return metricHeaders_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Describes metric columns. The number of MetricHeaders and ordering of
   * MetricHeaders matches the metrics present in rows.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 2;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.MetricHeaderOrBuilder getMetricHeadersOrBuilder(
      int index) {
    return metricHeaders_.get(index);
  }

  public static final int ROWS_FIELD_NUMBER = 3;
  private java.util.List<com.google.analytics.data.v1alpha.Row> rows_;
  /**
   *
   *
   * <pre>
   * Rows of dimension value combinations and metric values in the report.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1alpha.Row> getRowsList() {
    return rows_;
  }
  /**
   *
   *
   * <pre>
   * Rows of dimension value combinations and metric values in the report.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.data.v1alpha.RowOrBuilder>
      getRowsOrBuilderList() {
    return rows_;
  }
  /**
   *
   *
   * <pre>
   * Rows of dimension value combinations and metric values in the report.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
   */
  @java.lang.Override
  public int getRowsCount() {
    return rows_.size();
  }
  /**
   *
   *
   * <pre>
   * Rows of dimension value combinations and metric values in the report.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.Row getRows(int index) {
    return rows_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Rows of dimension value combinations and metric values in the report.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.RowOrBuilder getRowsOrBuilder(int index) {
    return rows_.get(index);
  }

  public static final int TOTALS_FIELD_NUMBER = 4;
  private java.util.List<com.google.analytics.data.v1alpha.Row> totals_;
  /**
   *
   *
   * <pre>
   * If requested, the totaled values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row totals = 4;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1alpha.Row> getTotalsList() {
    return totals_;
  }
  /**
   *
   *
   * <pre>
   * If requested, the totaled values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row totals = 4;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.data.v1alpha.RowOrBuilder>
      getTotalsOrBuilderList() {
    return totals_;
  }
  /**
   *
   *
   * <pre>
   * If requested, the totaled values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row totals = 4;</code>
   */
  @java.lang.Override
  public int getTotalsCount() {
    return totals_.size();
  }
  /**
   *
   *
   * <pre>
   * If requested, the totaled values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row totals = 4;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.Row getTotals(int index) {
    return totals_.get(index);
  }
  /**
   *
   *
   * <pre>
   * If requested, the totaled values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row totals = 4;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.RowOrBuilder getTotalsOrBuilder(int index) {
    return totals_.get(index);
  }

  public static final int MAXIMUMS_FIELD_NUMBER = 5;
  private java.util.List<com.google.analytics.data.v1alpha.Row> maximums_;
  /**
   *
   *
   * <pre>
   * If requested, the maximum values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row maximums = 5;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1alpha.Row> getMaximumsList() {
    return maximums_;
  }
  /**
   *
   *
   * <pre>
   * If requested, the maximum values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row maximums = 5;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.data.v1alpha.RowOrBuilder>
      getMaximumsOrBuilderList() {
    return maximums_;
  }
  /**
   *
   *
   * <pre>
   * If requested, the maximum values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row maximums = 5;</code>
   */
  @java.lang.Override
  public int getMaximumsCount() {
    return maximums_.size();
  }
  /**
   *
   *
   * <pre>
   * If requested, the maximum values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row maximums = 5;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.Row getMaximums(int index) {
    return maximums_.get(index);
  }
  /**
   *
   *
   * <pre>
   * If requested, the maximum values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row maximums = 5;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.RowOrBuilder getMaximumsOrBuilder(int index) {
    return maximums_.get(index);
  }

  public static final int MINIMUMS_FIELD_NUMBER = 6;
  private java.util.List<com.google.analytics.data.v1alpha.Row> minimums_;
  /**
   *
   *
   * <pre>
   * If requested, the minimum values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row minimums = 6;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1alpha.Row> getMinimumsList() {
    return minimums_;
  }
  /**
   *
   *
   * <pre>
   * If requested, the minimum values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row minimums = 6;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.data.v1alpha.RowOrBuilder>
      getMinimumsOrBuilderList() {
    return minimums_;
  }
  /**
   *
   *
   * <pre>
   * If requested, the minimum values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row minimums = 6;</code>
   */
  @java.lang.Override
  public int getMinimumsCount() {
    return minimums_.size();
  }
  /**
   *
   *
   * <pre>
   * If requested, the minimum values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row minimums = 6;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.Row getMinimums(int index) {
    return minimums_.get(index);
  }
  /**
   *
   *
   * <pre>
   * If requested, the minimum values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row minimums = 6;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.RowOrBuilder getMinimumsOrBuilder(int index) {
    return minimums_.get(index);
  }

  public static final int ROW_COUNT_FIELD_NUMBER = 7;
  private int rowCount_;
  /**
   *
   *
   * <pre>
   * The total number of rows in the query result, regardless of the number of
   * rows returned in the response. For example if a query returns 175 rows and
   * includes limit = 50 in the API request, the response will contain row_count
   * = 175 but only 50 rows.
   * </pre>
   *
   * <code>int32 row_count = 7;</code>
   *
   * @return The rowCount.
   */
  @java.lang.Override
  public int getRowCount() {
    return rowCount_;
  }

  public static final int PROPERTY_QUOTA_FIELD_NUMBER = 8;
  private com.google.analytics.data.v1alpha.PropertyQuota propertyQuota_;
  /**
   *
   *
   * <pre>
   * This Analytics Property's Realtime quota state including this request.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 8;</code>
   *
   * @return Whether the propertyQuota field is set.
   */
  @java.lang.Override
  public boolean hasPropertyQuota() {
    return propertyQuota_ != null;
  }
  /**
   *
   *
   * <pre>
   * This Analytics Property's Realtime quota state including this request.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 8;</code>
   *
   * @return The propertyQuota.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.PropertyQuota getPropertyQuota() {
    return propertyQuota_ == null
        ? com.google.analytics.data.v1alpha.PropertyQuota.getDefaultInstance()
        : propertyQuota_;
  }
  /**
   *
   *
   * <pre>
   * This Analytics Property's Realtime quota state including this request.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 8;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.PropertyQuotaOrBuilder getPropertyQuotaOrBuilder() {
    return getPropertyQuota();
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
    for (int i = 0; i < dimensionHeaders_.size(); i++) {
      output.writeMessage(1, dimensionHeaders_.get(i));
    }
    for (int i = 0; i < metricHeaders_.size(); i++) {
      output.writeMessage(2, metricHeaders_.get(i));
    }
    for (int i = 0; i < rows_.size(); i++) {
      output.writeMessage(3, rows_.get(i));
    }
    for (int i = 0; i < totals_.size(); i++) {
      output.writeMessage(4, totals_.get(i));
    }
    for (int i = 0; i < maximums_.size(); i++) {
      output.writeMessage(5, maximums_.get(i));
    }
    for (int i = 0; i < minimums_.size(); i++) {
      output.writeMessage(6, minimums_.get(i));
    }
    if (rowCount_ != 0) {
      output.writeInt32(7, rowCount_);
    }
    if (propertyQuota_ != null) {
      output.writeMessage(8, getPropertyQuota());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < dimensionHeaders_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, dimensionHeaders_.get(i));
    }
    for (int i = 0; i < metricHeaders_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, metricHeaders_.get(i));
    }
    for (int i = 0; i < rows_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, rows_.get(i));
    }
    for (int i = 0; i < totals_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, totals_.get(i));
    }
    for (int i = 0; i < maximums_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, maximums_.get(i));
    }
    for (int i = 0; i < minimums_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(6, minimums_.get(i));
    }
    if (rowCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(7, rowCount_);
    }
    if (propertyQuota_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(8, getPropertyQuota());
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.RunRealtimeReportResponse)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.RunRealtimeReportResponse other =
        (com.google.analytics.data.v1alpha.RunRealtimeReportResponse) obj;

    if (!getDimensionHeadersList().equals(other.getDimensionHeadersList())) return false;
    if (!getMetricHeadersList().equals(other.getMetricHeadersList())) return false;
    if (!getRowsList().equals(other.getRowsList())) return false;
    if (!getTotalsList().equals(other.getTotalsList())) return false;
    if (!getMaximumsList().equals(other.getMaximumsList())) return false;
    if (!getMinimumsList().equals(other.getMinimumsList())) return false;
    if (getRowCount() != other.getRowCount()) return false;
    if (hasPropertyQuota() != other.hasPropertyQuota()) return false;
    if (hasPropertyQuota()) {
      if (!getPropertyQuota().equals(other.getPropertyQuota())) return false;
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
    if (getDimensionHeadersCount() > 0) {
      hash = (37 * hash) + DIMENSION_HEADERS_FIELD_NUMBER;
      hash = (53 * hash) + getDimensionHeadersList().hashCode();
    }
    if (getMetricHeadersCount() > 0) {
      hash = (37 * hash) + METRIC_HEADERS_FIELD_NUMBER;
      hash = (53 * hash) + getMetricHeadersList().hashCode();
    }
    if (getRowsCount() > 0) {
      hash = (37 * hash) + ROWS_FIELD_NUMBER;
      hash = (53 * hash) + getRowsList().hashCode();
    }
    if (getTotalsCount() > 0) {
      hash = (37 * hash) + TOTALS_FIELD_NUMBER;
      hash = (53 * hash) + getTotalsList().hashCode();
    }
    if (getMaximumsCount() > 0) {
      hash = (37 * hash) + MAXIMUMS_FIELD_NUMBER;
      hash = (53 * hash) + getMaximumsList().hashCode();
    }
    if (getMinimumsCount() > 0) {
      hash = (37 * hash) + MINIMUMS_FIELD_NUMBER;
      hash = (53 * hash) + getMinimumsList().hashCode();
    }
    hash = (37 * hash) + ROW_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getRowCount();
    if (hasPropertyQuota()) {
      hash = (37 * hash) + PROPERTY_QUOTA_FIELD_NUMBER;
      hash = (53 * hash) + getPropertyQuota().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.RunRealtimeReportResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.RunRealtimeReportResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.RunRealtimeReportResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.RunRealtimeReportResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.RunRealtimeReportResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.RunRealtimeReportResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.RunRealtimeReportResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.RunRealtimeReportResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.RunRealtimeReportResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.RunRealtimeReportResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.RunRealtimeReportResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.RunRealtimeReportResponse parseFrom(
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
      com.google.analytics.data.v1alpha.RunRealtimeReportResponse prototype) {
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
   * The response realtime report table corresponding to a request.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.RunRealtimeReportResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.RunRealtimeReportResponse)
      com.google.analytics.data.v1alpha.RunRealtimeReportResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_RunRealtimeReportResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_RunRealtimeReportResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.RunRealtimeReportResponse.class,
              com.google.analytics.data.v1alpha.RunRealtimeReportResponse.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.RunRealtimeReportResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDimensionHeadersFieldBuilder();
        getMetricHeadersFieldBuilder();
        getRowsFieldBuilder();
        getTotalsFieldBuilder();
        getMaximumsFieldBuilder();
        getMinimumsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (dimensionHeadersBuilder_ == null) {
        dimensionHeaders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        dimensionHeadersBuilder_.clear();
      }
      if (metricHeadersBuilder_ == null) {
        metricHeaders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        metricHeadersBuilder_.clear();
      }
      if (rowsBuilder_ == null) {
        rows_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        rowsBuilder_.clear();
      }
      if (totalsBuilder_ == null) {
        totals_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        totalsBuilder_.clear();
      }
      if (maximumsBuilder_ == null) {
        maximums_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
      } else {
        maximumsBuilder_.clear();
      }
      if (minimumsBuilder_ == null) {
        minimums_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000020);
      } else {
        minimumsBuilder_.clear();
      }
      rowCount_ = 0;

      if (propertyQuotaBuilder_ == null) {
        propertyQuota_ = null;
      } else {
        propertyQuota_ = null;
        propertyQuotaBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_RunRealtimeReportResponse_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.RunRealtimeReportResponse getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.RunRealtimeReportResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.RunRealtimeReportResponse build() {
      com.google.analytics.data.v1alpha.RunRealtimeReportResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.RunRealtimeReportResponse buildPartial() {
      com.google.analytics.data.v1alpha.RunRealtimeReportResponse result =
          new com.google.analytics.data.v1alpha.RunRealtimeReportResponse(this);
      int from_bitField0_ = bitField0_;
      if (dimensionHeadersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dimensionHeaders_ = java.util.Collections.unmodifiableList(dimensionHeaders_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dimensionHeaders_ = dimensionHeaders_;
      } else {
        result.dimensionHeaders_ = dimensionHeadersBuilder_.build();
      }
      if (metricHeadersBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          metricHeaders_ = java.util.Collections.unmodifiableList(metricHeaders_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.metricHeaders_ = metricHeaders_;
      } else {
        result.metricHeaders_ = metricHeadersBuilder_.build();
      }
      if (rowsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          rows_ = java.util.Collections.unmodifiableList(rows_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.rows_ = rows_;
      } else {
        result.rows_ = rowsBuilder_.build();
      }
      if (totalsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0)) {
          totals_ = java.util.Collections.unmodifiableList(totals_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.totals_ = totals_;
      } else {
        result.totals_ = totalsBuilder_.build();
      }
      if (maximumsBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0)) {
          maximums_ = java.util.Collections.unmodifiableList(maximums_);
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.maximums_ = maximums_;
      } else {
        result.maximums_ = maximumsBuilder_.build();
      }
      if (minimumsBuilder_ == null) {
        if (((bitField0_ & 0x00000020) != 0)) {
          minimums_ = java.util.Collections.unmodifiableList(minimums_);
          bitField0_ = (bitField0_ & ~0x00000020);
        }
        result.minimums_ = minimums_;
      } else {
        result.minimums_ = minimumsBuilder_.build();
      }
      result.rowCount_ = rowCount_;
      if (propertyQuotaBuilder_ == null) {
        result.propertyQuota_ = propertyQuota_;
      } else {
        result.propertyQuota_ = propertyQuotaBuilder_.build();
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
      if (other instanceof com.google.analytics.data.v1alpha.RunRealtimeReportResponse) {
        return mergeFrom((com.google.analytics.data.v1alpha.RunRealtimeReportResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.RunRealtimeReportResponse other) {
      if (other == com.google.analytics.data.v1alpha.RunRealtimeReportResponse.getDefaultInstance())
        return this;
      if (dimensionHeadersBuilder_ == null) {
        if (!other.dimensionHeaders_.isEmpty()) {
          if (dimensionHeaders_.isEmpty()) {
            dimensionHeaders_ = other.dimensionHeaders_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDimensionHeadersIsMutable();
            dimensionHeaders_.addAll(other.dimensionHeaders_);
          }
          onChanged();
        }
      } else {
        if (!other.dimensionHeaders_.isEmpty()) {
          if (dimensionHeadersBuilder_.isEmpty()) {
            dimensionHeadersBuilder_.dispose();
            dimensionHeadersBuilder_ = null;
            dimensionHeaders_ = other.dimensionHeaders_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dimensionHeadersBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDimensionHeadersFieldBuilder()
                    : null;
          } else {
            dimensionHeadersBuilder_.addAllMessages(other.dimensionHeaders_);
          }
        }
      }
      if (metricHeadersBuilder_ == null) {
        if (!other.metricHeaders_.isEmpty()) {
          if (metricHeaders_.isEmpty()) {
            metricHeaders_ = other.metricHeaders_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureMetricHeadersIsMutable();
            metricHeaders_.addAll(other.metricHeaders_);
          }
          onChanged();
        }
      } else {
        if (!other.metricHeaders_.isEmpty()) {
          if (metricHeadersBuilder_.isEmpty()) {
            metricHeadersBuilder_.dispose();
            metricHeadersBuilder_ = null;
            metricHeaders_ = other.metricHeaders_;
            bitField0_ = (bitField0_ & ~0x00000002);
            metricHeadersBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getMetricHeadersFieldBuilder()
                    : null;
          } else {
            metricHeadersBuilder_.addAllMessages(other.metricHeaders_);
          }
        }
      }
      if (rowsBuilder_ == null) {
        if (!other.rows_.isEmpty()) {
          if (rows_.isEmpty()) {
            rows_ = other.rows_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureRowsIsMutable();
            rows_.addAll(other.rows_);
          }
          onChanged();
        }
      } else {
        if (!other.rows_.isEmpty()) {
          if (rowsBuilder_.isEmpty()) {
            rowsBuilder_.dispose();
            rowsBuilder_ = null;
            rows_ = other.rows_;
            bitField0_ = (bitField0_ & ~0x00000004);
            rowsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getRowsFieldBuilder()
                    : null;
          } else {
            rowsBuilder_.addAllMessages(other.rows_);
          }
        }
      }
      if (totalsBuilder_ == null) {
        if (!other.totals_.isEmpty()) {
          if (totals_.isEmpty()) {
            totals_ = other.totals_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureTotalsIsMutable();
            totals_.addAll(other.totals_);
          }
          onChanged();
        }
      } else {
        if (!other.totals_.isEmpty()) {
          if (totalsBuilder_.isEmpty()) {
            totalsBuilder_.dispose();
            totalsBuilder_ = null;
            totals_ = other.totals_;
            bitField0_ = (bitField0_ & ~0x00000008);
            totalsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getTotalsFieldBuilder()
                    : null;
          } else {
            totalsBuilder_.addAllMessages(other.totals_);
          }
        }
      }
      if (maximumsBuilder_ == null) {
        if (!other.maximums_.isEmpty()) {
          if (maximums_.isEmpty()) {
            maximums_ = other.maximums_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensureMaximumsIsMutable();
            maximums_.addAll(other.maximums_);
          }
          onChanged();
        }
      } else {
        if (!other.maximums_.isEmpty()) {
          if (maximumsBuilder_.isEmpty()) {
            maximumsBuilder_.dispose();
            maximumsBuilder_ = null;
            maximums_ = other.maximums_;
            bitField0_ = (bitField0_ & ~0x00000010);
            maximumsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getMaximumsFieldBuilder()
                    : null;
          } else {
            maximumsBuilder_.addAllMessages(other.maximums_);
          }
        }
      }
      if (minimumsBuilder_ == null) {
        if (!other.minimums_.isEmpty()) {
          if (minimums_.isEmpty()) {
            minimums_ = other.minimums_;
            bitField0_ = (bitField0_ & ~0x00000020);
          } else {
            ensureMinimumsIsMutable();
            minimums_.addAll(other.minimums_);
          }
          onChanged();
        }
      } else {
        if (!other.minimums_.isEmpty()) {
          if (minimumsBuilder_.isEmpty()) {
            minimumsBuilder_.dispose();
            minimumsBuilder_ = null;
            minimums_ = other.minimums_;
            bitField0_ = (bitField0_ & ~0x00000020);
            minimumsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getMinimumsFieldBuilder()
                    : null;
          } else {
            minimumsBuilder_.addAllMessages(other.minimums_);
          }
        }
      }
      if (other.getRowCount() != 0) {
        setRowCount(other.getRowCount());
      }
      if (other.hasPropertyQuota()) {
        mergePropertyQuota(other.getPropertyQuota());
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
      com.google.analytics.data.v1alpha.RunRealtimeReportResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.data.v1alpha.RunRealtimeReportResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.analytics.data.v1alpha.DimensionHeader> dimensionHeaders_ =
        java.util.Collections.emptyList();

    private void ensureDimensionHeadersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dimensionHeaders_ =
            new java.util.ArrayList<com.google.analytics.data.v1alpha.DimensionHeader>(
                dimensionHeaders_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.DimensionHeader,
            com.google.analytics.data.v1alpha.DimensionHeader.Builder,
            com.google.analytics.data.v1alpha.DimensionHeaderOrBuilder>
        dimensionHeadersBuilder_;

    /**
     *
     *
     * <pre>
     * Describes dimension columns. The number of DimensionHeaders and ordering of
     * DimensionHeaders matches the dimensions present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 1;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.DimensionHeader>
        getDimensionHeadersList() {
      if (dimensionHeadersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dimensionHeaders_);
      } else {
        return dimensionHeadersBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Describes dimension columns. The number of DimensionHeaders and ordering of
     * DimensionHeaders matches the dimensions present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 1;</code>
     */
    public int getDimensionHeadersCount() {
      if (dimensionHeadersBuilder_ == null) {
        return dimensionHeaders_.size();
      } else {
        return dimensionHeadersBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Describes dimension columns. The number of DimensionHeaders and ordering of
     * DimensionHeaders matches the dimensions present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 1;</code>
     */
    public com.google.analytics.data.v1alpha.DimensionHeader getDimensionHeaders(int index) {
      if (dimensionHeadersBuilder_ == null) {
        return dimensionHeaders_.get(index);
      } else {
        return dimensionHeadersBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Describes dimension columns. The number of DimensionHeaders and ordering of
     * DimensionHeaders matches the dimensions present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 1;</code>
     */
    public Builder setDimensionHeaders(
        int index, com.google.analytics.data.v1alpha.DimensionHeader value) {
      if (dimensionHeadersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDimensionHeadersIsMutable();
        dimensionHeaders_.set(index, value);
        onChanged();
      } else {
        dimensionHeadersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes dimension columns. The number of DimensionHeaders and ordering of
     * DimensionHeaders matches the dimensions present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 1;</code>
     */
    public Builder setDimensionHeaders(
        int index, com.google.analytics.data.v1alpha.DimensionHeader.Builder builderForValue) {
      if (dimensionHeadersBuilder_ == null) {
        ensureDimensionHeadersIsMutable();
        dimensionHeaders_.set(index, builderForValue.build());
        onChanged();
      } else {
        dimensionHeadersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes dimension columns. The number of DimensionHeaders and ordering of
     * DimensionHeaders matches the dimensions present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 1;</code>
     */
    public Builder addDimensionHeaders(com.google.analytics.data.v1alpha.DimensionHeader value) {
      if (dimensionHeadersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDimensionHeadersIsMutable();
        dimensionHeaders_.add(value);
        onChanged();
      } else {
        dimensionHeadersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes dimension columns. The number of DimensionHeaders and ordering of
     * DimensionHeaders matches the dimensions present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 1;</code>
     */
    public Builder addDimensionHeaders(
        int index, com.google.analytics.data.v1alpha.DimensionHeader value) {
      if (dimensionHeadersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDimensionHeadersIsMutable();
        dimensionHeaders_.add(index, value);
        onChanged();
      } else {
        dimensionHeadersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes dimension columns. The number of DimensionHeaders and ordering of
     * DimensionHeaders matches the dimensions present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 1;</code>
     */
    public Builder addDimensionHeaders(
        com.google.analytics.data.v1alpha.DimensionHeader.Builder builderForValue) {
      if (dimensionHeadersBuilder_ == null) {
        ensureDimensionHeadersIsMutable();
        dimensionHeaders_.add(builderForValue.build());
        onChanged();
      } else {
        dimensionHeadersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes dimension columns. The number of DimensionHeaders and ordering of
     * DimensionHeaders matches the dimensions present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 1;</code>
     */
    public Builder addDimensionHeaders(
        int index, com.google.analytics.data.v1alpha.DimensionHeader.Builder builderForValue) {
      if (dimensionHeadersBuilder_ == null) {
        ensureDimensionHeadersIsMutable();
        dimensionHeaders_.add(index, builderForValue.build());
        onChanged();
      } else {
        dimensionHeadersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes dimension columns. The number of DimensionHeaders and ordering of
     * DimensionHeaders matches the dimensions present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 1;</code>
     */
    public Builder addAllDimensionHeaders(
        java.lang.Iterable<? extends com.google.analytics.data.v1alpha.DimensionHeader> values) {
      if (dimensionHeadersBuilder_ == null) {
        ensureDimensionHeadersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, dimensionHeaders_);
        onChanged();
      } else {
        dimensionHeadersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes dimension columns. The number of DimensionHeaders and ordering of
     * DimensionHeaders matches the dimensions present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 1;</code>
     */
    public Builder clearDimensionHeaders() {
      if (dimensionHeadersBuilder_ == null) {
        dimensionHeaders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dimensionHeadersBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes dimension columns. The number of DimensionHeaders and ordering of
     * DimensionHeaders matches the dimensions present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 1;</code>
     */
    public Builder removeDimensionHeaders(int index) {
      if (dimensionHeadersBuilder_ == null) {
        ensureDimensionHeadersIsMutable();
        dimensionHeaders_.remove(index);
        onChanged();
      } else {
        dimensionHeadersBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes dimension columns. The number of DimensionHeaders and ordering of
     * DimensionHeaders matches the dimensions present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 1;</code>
     */
    public com.google.analytics.data.v1alpha.DimensionHeader.Builder getDimensionHeadersBuilder(
        int index) {
      return getDimensionHeadersFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Describes dimension columns. The number of DimensionHeaders and ordering of
     * DimensionHeaders matches the dimensions present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 1;</code>
     */
    public com.google.analytics.data.v1alpha.DimensionHeaderOrBuilder getDimensionHeadersOrBuilder(
        int index) {
      if (dimensionHeadersBuilder_ == null) {
        return dimensionHeaders_.get(index);
      } else {
        return dimensionHeadersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Describes dimension columns. The number of DimensionHeaders and ordering of
     * DimensionHeaders matches the dimensions present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 1;</code>
     */
    public java.util.List<? extends com.google.analytics.data.v1alpha.DimensionHeaderOrBuilder>
        getDimensionHeadersOrBuilderList() {
      if (dimensionHeadersBuilder_ != null) {
        return dimensionHeadersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dimensionHeaders_);
      }
    }
    /**
     *
     *
     * <pre>
     * Describes dimension columns. The number of DimensionHeaders and ordering of
     * DimensionHeaders matches the dimensions present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 1;</code>
     */
    public com.google.analytics.data.v1alpha.DimensionHeader.Builder addDimensionHeadersBuilder() {
      return getDimensionHeadersFieldBuilder()
          .addBuilder(com.google.analytics.data.v1alpha.DimensionHeader.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Describes dimension columns. The number of DimensionHeaders and ordering of
     * DimensionHeaders matches the dimensions present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 1;</code>
     */
    public com.google.analytics.data.v1alpha.DimensionHeader.Builder addDimensionHeadersBuilder(
        int index) {
      return getDimensionHeadersFieldBuilder()
          .addBuilder(
              index, com.google.analytics.data.v1alpha.DimensionHeader.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Describes dimension columns. The number of DimensionHeaders and ordering of
     * DimensionHeaders matches the dimensions present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 1;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.DimensionHeader.Builder>
        getDimensionHeadersBuilderList() {
      return getDimensionHeadersFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.DimensionHeader,
            com.google.analytics.data.v1alpha.DimensionHeader.Builder,
            com.google.analytics.data.v1alpha.DimensionHeaderOrBuilder>
        getDimensionHeadersFieldBuilder() {
      if (dimensionHeadersBuilder_ == null) {
        dimensionHeadersBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.data.v1alpha.DimensionHeader,
                com.google.analytics.data.v1alpha.DimensionHeader.Builder,
                com.google.analytics.data.v1alpha.DimensionHeaderOrBuilder>(
                dimensionHeaders_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        dimensionHeaders_ = null;
      }
      return dimensionHeadersBuilder_;
    }

    private java.util.List<com.google.analytics.data.v1alpha.MetricHeader> metricHeaders_ =
        java.util.Collections.emptyList();

    private void ensureMetricHeadersIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        metricHeaders_ =
            new java.util.ArrayList<com.google.analytics.data.v1alpha.MetricHeader>(metricHeaders_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.MetricHeader,
            com.google.analytics.data.v1alpha.MetricHeader.Builder,
            com.google.analytics.data.v1alpha.MetricHeaderOrBuilder>
        metricHeadersBuilder_;

    /**
     *
     *
     * <pre>
     * Describes metric columns. The number of MetricHeaders and ordering of
     * MetricHeaders matches the metrics present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 2;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.MetricHeader> getMetricHeadersList() {
      if (metricHeadersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(metricHeaders_);
      } else {
        return metricHeadersBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Describes metric columns. The number of MetricHeaders and ordering of
     * MetricHeaders matches the metrics present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 2;</code>
     */
    public int getMetricHeadersCount() {
      if (metricHeadersBuilder_ == null) {
        return metricHeaders_.size();
      } else {
        return metricHeadersBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Describes metric columns. The number of MetricHeaders and ordering of
     * MetricHeaders matches the metrics present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 2;</code>
     */
    public com.google.analytics.data.v1alpha.MetricHeader getMetricHeaders(int index) {
      if (metricHeadersBuilder_ == null) {
        return metricHeaders_.get(index);
      } else {
        return metricHeadersBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Describes metric columns. The number of MetricHeaders and ordering of
     * MetricHeaders matches the metrics present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 2;</code>
     */
    public Builder setMetricHeaders(
        int index, com.google.analytics.data.v1alpha.MetricHeader value) {
      if (metricHeadersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricHeadersIsMutable();
        metricHeaders_.set(index, value);
        onChanged();
      } else {
        metricHeadersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes metric columns. The number of MetricHeaders and ordering of
     * MetricHeaders matches the metrics present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 2;</code>
     */
    public Builder setMetricHeaders(
        int index, com.google.analytics.data.v1alpha.MetricHeader.Builder builderForValue) {
      if (metricHeadersBuilder_ == null) {
        ensureMetricHeadersIsMutable();
        metricHeaders_.set(index, builderForValue.build());
        onChanged();
      } else {
        metricHeadersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes metric columns. The number of MetricHeaders and ordering of
     * MetricHeaders matches the metrics present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 2;</code>
     */
    public Builder addMetricHeaders(com.google.analytics.data.v1alpha.MetricHeader value) {
      if (metricHeadersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricHeadersIsMutable();
        metricHeaders_.add(value);
        onChanged();
      } else {
        metricHeadersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes metric columns. The number of MetricHeaders and ordering of
     * MetricHeaders matches the metrics present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 2;</code>
     */
    public Builder addMetricHeaders(
        int index, com.google.analytics.data.v1alpha.MetricHeader value) {
      if (metricHeadersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricHeadersIsMutable();
        metricHeaders_.add(index, value);
        onChanged();
      } else {
        metricHeadersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes metric columns. The number of MetricHeaders and ordering of
     * MetricHeaders matches the metrics present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 2;</code>
     */
    public Builder addMetricHeaders(
        com.google.analytics.data.v1alpha.MetricHeader.Builder builderForValue) {
      if (metricHeadersBuilder_ == null) {
        ensureMetricHeadersIsMutable();
        metricHeaders_.add(builderForValue.build());
        onChanged();
      } else {
        metricHeadersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes metric columns. The number of MetricHeaders and ordering of
     * MetricHeaders matches the metrics present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 2;</code>
     */
    public Builder addMetricHeaders(
        int index, com.google.analytics.data.v1alpha.MetricHeader.Builder builderForValue) {
      if (metricHeadersBuilder_ == null) {
        ensureMetricHeadersIsMutable();
        metricHeaders_.add(index, builderForValue.build());
        onChanged();
      } else {
        metricHeadersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes metric columns. The number of MetricHeaders and ordering of
     * MetricHeaders matches the metrics present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 2;</code>
     */
    public Builder addAllMetricHeaders(
        java.lang.Iterable<? extends com.google.analytics.data.v1alpha.MetricHeader> values) {
      if (metricHeadersBuilder_ == null) {
        ensureMetricHeadersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, metricHeaders_);
        onChanged();
      } else {
        metricHeadersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes metric columns. The number of MetricHeaders and ordering of
     * MetricHeaders matches the metrics present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 2;</code>
     */
    public Builder clearMetricHeaders() {
      if (metricHeadersBuilder_ == null) {
        metricHeaders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        metricHeadersBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes metric columns. The number of MetricHeaders and ordering of
     * MetricHeaders matches the metrics present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 2;</code>
     */
    public Builder removeMetricHeaders(int index) {
      if (metricHeadersBuilder_ == null) {
        ensureMetricHeadersIsMutable();
        metricHeaders_.remove(index);
        onChanged();
      } else {
        metricHeadersBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes metric columns. The number of MetricHeaders and ordering of
     * MetricHeaders matches the metrics present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 2;</code>
     */
    public com.google.analytics.data.v1alpha.MetricHeader.Builder getMetricHeadersBuilder(
        int index) {
      return getMetricHeadersFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Describes metric columns. The number of MetricHeaders and ordering of
     * MetricHeaders matches the metrics present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 2;</code>
     */
    public com.google.analytics.data.v1alpha.MetricHeaderOrBuilder getMetricHeadersOrBuilder(
        int index) {
      if (metricHeadersBuilder_ == null) {
        return metricHeaders_.get(index);
      } else {
        return metricHeadersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Describes metric columns. The number of MetricHeaders and ordering of
     * MetricHeaders matches the metrics present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 2;</code>
     */
    public java.util.List<? extends com.google.analytics.data.v1alpha.MetricHeaderOrBuilder>
        getMetricHeadersOrBuilderList() {
      if (metricHeadersBuilder_ != null) {
        return metricHeadersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(metricHeaders_);
      }
    }
    /**
     *
     *
     * <pre>
     * Describes metric columns. The number of MetricHeaders and ordering of
     * MetricHeaders matches the metrics present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 2;</code>
     */
    public com.google.analytics.data.v1alpha.MetricHeader.Builder addMetricHeadersBuilder() {
      return getMetricHeadersFieldBuilder()
          .addBuilder(com.google.analytics.data.v1alpha.MetricHeader.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Describes metric columns. The number of MetricHeaders and ordering of
     * MetricHeaders matches the metrics present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 2;</code>
     */
    public com.google.analytics.data.v1alpha.MetricHeader.Builder addMetricHeadersBuilder(
        int index) {
      return getMetricHeadersFieldBuilder()
          .addBuilder(index, com.google.analytics.data.v1alpha.MetricHeader.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Describes metric columns. The number of MetricHeaders and ordering of
     * MetricHeaders matches the metrics present in rows.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 2;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.MetricHeader.Builder>
        getMetricHeadersBuilderList() {
      return getMetricHeadersFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.MetricHeader,
            com.google.analytics.data.v1alpha.MetricHeader.Builder,
            com.google.analytics.data.v1alpha.MetricHeaderOrBuilder>
        getMetricHeadersFieldBuilder() {
      if (metricHeadersBuilder_ == null) {
        metricHeadersBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.data.v1alpha.MetricHeader,
                com.google.analytics.data.v1alpha.MetricHeader.Builder,
                com.google.analytics.data.v1alpha.MetricHeaderOrBuilder>(
                metricHeaders_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        metricHeaders_ = null;
      }
      return metricHeadersBuilder_;
    }

    private java.util.List<com.google.analytics.data.v1alpha.Row> rows_ =
        java.util.Collections.emptyList();

    private void ensureRowsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        rows_ = new java.util.ArrayList<com.google.analytics.data.v1alpha.Row>(rows_);
        bitField0_ |= 0x00000004;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.Row,
            com.google.analytics.data.v1alpha.Row.Builder,
            com.google.analytics.data.v1alpha.RowOrBuilder>
        rowsBuilder_;

    /**
     *
     *
     * <pre>
     * Rows of dimension value combinations and metric values in the report.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.Row> getRowsList() {
      if (rowsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rows_);
      } else {
        return rowsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Rows of dimension value combinations and metric values in the report.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
     */
    public int getRowsCount() {
      if (rowsBuilder_ == null) {
        return rows_.size();
      } else {
        return rowsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Rows of dimension value combinations and metric values in the report.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
     */
    public com.google.analytics.data.v1alpha.Row getRows(int index) {
      if (rowsBuilder_ == null) {
        return rows_.get(index);
      } else {
        return rowsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Rows of dimension value combinations and metric values in the report.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
     */
    public Builder setRows(int index, com.google.analytics.data.v1alpha.Row value) {
      if (rowsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRowsIsMutable();
        rows_.set(index, value);
        onChanged();
      } else {
        rowsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Rows of dimension value combinations and metric values in the report.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
     */
    public Builder setRows(
        int index, com.google.analytics.data.v1alpha.Row.Builder builderForValue) {
      if (rowsBuilder_ == null) {
        ensureRowsIsMutable();
        rows_.set(index, builderForValue.build());
        onChanged();
      } else {
        rowsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Rows of dimension value combinations and metric values in the report.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
     */
    public Builder addRows(com.google.analytics.data.v1alpha.Row value) {
      if (rowsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRowsIsMutable();
        rows_.add(value);
        onChanged();
      } else {
        rowsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Rows of dimension value combinations and metric values in the report.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
     */
    public Builder addRows(int index, com.google.analytics.data.v1alpha.Row value) {
      if (rowsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRowsIsMutable();
        rows_.add(index, value);
        onChanged();
      } else {
        rowsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Rows of dimension value combinations and metric values in the report.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
     */
    public Builder addRows(com.google.analytics.data.v1alpha.Row.Builder builderForValue) {
      if (rowsBuilder_ == null) {
        ensureRowsIsMutable();
        rows_.add(builderForValue.build());
        onChanged();
      } else {
        rowsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Rows of dimension value combinations and metric values in the report.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
     */
    public Builder addRows(
        int index, com.google.analytics.data.v1alpha.Row.Builder builderForValue) {
      if (rowsBuilder_ == null) {
        ensureRowsIsMutable();
        rows_.add(index, builderForValue.build());
        onChanged();
      } else {
        rowsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Rows of dimension value combinations and metric values in the report.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
     */
    public Builder addAllRows(
        java.lang.Iterable<? extends com.google.analytics.data.v1alpha.Row> values) {
      if (rowsBuilder_ == null) {
        ensureRowsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, rows_);
        onChanged();
      } else {
        rowsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Rows of dimension value combinations and metric values in the report.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
     */
    public Builder clearRows() {
      if (rowsBuilder_ == null) {
        rows_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        rowsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Rows of dimension value combinations and metric values in the report.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
     */
    public Builder removeRows(int index) {
      if (rowsBuilder_ == null) {
        ensureRowsIsMutable();
        rows_.remove(index);
        onChanged();
      } else {
        rowsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Rows of dimension value combinations and metric values in the report.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
     */
    public com.google.analytics.data.v1alpha.Row.Builder getRowsBuilder(int index) {
      return getRowsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Rows of dimension value combinations and metric values in the report.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
     */
    public com.google.analytics.data.v1alpha.RowOrBuilder getRowsOrBuilder(int index) {
      if (rowsBuilder_ == null) {
        return rows_.get(index);
      } else {
        return rowsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Rows of dimension value combinations and metric values in the report.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
     */
    public java.util.List<? extends com.google.analytics.data.v1alpha.RowOrBuilder>
        getRowsOrBuilderList() {
      if (rowsBuilder_ != null) {
        return rowsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rows_);
      }
    }
    /**
     *
     *
     * <pre>
     * Rows of dimension value combinations and metric values in the report.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
     */
    public com.google.analytics.data.v1alpha.Row.Builder addRowsBuilder() {
      return getRowsFieldBuilder()
          .addBuilder(com.google.analytics.data.v1alpha.Row.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Rows of dimension value combinations and metric values in the report.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
     */
    public com.google.analytics.data.v1alpha.Row.Builder addRowsBuilder(int index) {
      return getRowsFieldBuilder()
          .addBuilder(index, com.google.analytics.data.v1alpha.Row.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Rows of dimension value combinations and metric values in the report.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.Row.Builder> getRowsBuilderList() {
      return getRowsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.Row,
            com.google.analytics.data.v1alpha.Row.Builder,
            com.google.analytics.data.v1alpha.RowOrBuilder>
        getRowsFieldBuilder() {
      if (rowsBuilder_ == null) {
        rowsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.data.v1alpha.Row,
                com.google.analytics.data.v1alpha.Row.Builder,
                com.google.analytics.data.v1alpha.RowOrBuilder>(
                rows_, ((bitField0_ & 0x00000004) != 0), getParentForChildren(), isClean());
        rows_ = null;
      }
      return rowsBuilder_;
    }

    private java.util.List<com.google.analytics.data.v1alpha.Row> totals_ =
        java.util.Collections.emptyList();

    private void ensureTotalsIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        totals_ = new java.util.ArrayList<com.google.analytics.data.v1alpha.Row>(totals_);
        bitField0_ |= 0x00000008;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.Row,
            com.google.analytics.data.v1alpha.Row.Builder,
            com.google.analytics.data.v1alpha.RowOrBuilder>
        totalsBuilder_;

    /**
     *
     *
     * <pre>
     * If requested, the totaled values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row totals = 4;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.Row> getTotalsList() {
      if (totalsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(totals_);
      } else {
        return totalsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * If requested, the totaled values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row totals = 4;</code>
     */
    public int getTotalsCount() {
      if (totalsBuilder_ == null) {
        return totals_.size();
      } else {
        return totalsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * If requested, the totaled values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row totals = 4;</code>
     */
    public com.google.analytics.data.v1alpha.Row getTotals(int index) {
      if (totalsBuilder_ == null) {
        return totals_.get(index);
      } else {
        return totalsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * If requested, the totaled values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row totals = 4;</code>
     */
    public Builder setTotals(int index, com.google.analytics.data.v1alpha.Row value) {
      if (totalsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTotalsIsMutable();
        totals_.set(index, value);
        onChanged();
      } else {
        totalsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If requested, the totaled values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row totals = 4;</code>
     */
    public Builder setTotals(
        int index, com.google.analytics.data.v1alpha.Row.Builder builderForValue) {
      if (totalsBuilder_ == null) {
        ensureTotalsIsMutable();
        totals_.set(index, builderForValue.build());
        onChanged();
      } else {
        totalsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If requested, the totaled values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row totals = 4;</code>
     */
    public Builder addTotals(com.google.analytics.data.v1alpha.Row value) {
      if (totalsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTotalsIsMutable();
        totals_.add(value);
        onChanged();
      } else {
        totalsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If requested, the totaled values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row totals = 4;</code>
     */
    public Builder addTotals(int index, com.google.analytics.data.v1alpha.Row value) {
      if (totalsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTotalsIsMutable();
        totals_.add(index, value);
        onChanged();
      } else {
        totalsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If requested, the totaled values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row totals = 4;</code>
     */
    public Builder addTotals(com.google.analytics.data.v1alpha.Row.Builder builderForValue) {
      if (totalsBuilder_ == null) {
        ensureTotalsIsMutable();
        totals_.add(builderForValue.build());
        onChanged();
      } else {
        totalsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If requested, the totaled values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row totals = 4;</code>
     */
    public Builder addTotals(
        int index, com.google.analytics.data.v1alpha.Row.Builder builderForValue) {
      if (totalsBuilder_ == null) {
        ensureTotalsIsMutable();
        totals_.add(index, builderForValue.build());
        onChanged();
      } else {
        totalsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If requested, the totaled values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row totals = 4;</code>
     */
    public Builder addAllTotals(
        java.lang.Iterable<? extends com.google.analytics.data.v1alpha.Row> values) {
      if (totalsBuilder_ == null) {
        ensureTotalsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, totals_);
        onChanged();
      } else {
        totalsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If requested, the totaled values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row totals = 4;</code>
     */
    public Builder clearTotals() {
      if (totalsBuilder_ == null) {
        totals_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        totalsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If requested, the totaled values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row totals = 4;</code>
     */
    public Builder removeTotals(int index) {
      if (totalsBuilder_ == null) {
        ensureTotalsIsMutable();
        totals_.remove(index);
        onChanged();
      } else {
        totalsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If requested, the totaled values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row totals = 4;</code>
     */
    public com.google.analytics.data.v1alpha.Row.Builder getTotalsBuilder(int index) {
      return getTotalsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * If requested, the totaled values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row totals = 4;</code>
     */
    public com.google.analytics.data.v1alpha.RowOrBuilder getTotalsOrBuilder(int index) {
      if (totalsBuilder_ == null) {
        return totals_.get(index);
      } else {
        return totalsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * If requested, the totaled values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row totals = 4;</code>
     */
    public java.util.List<? extends com.google.analytics.data.v1alpha.RowOrBuilder>
        getTotalsOrBuilderList() {
      if (totalsBuilder_ != null) {
        return totalsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(totals_);
      }
    }
    /**
     *
     *
     * <pre>
     * If requested, the totaled values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row totals = 4;</code>
     */
    public com.google.analytics.data.v1alpha.Row.Builder addTotalsBuilder() {
      return getTotalsFieldBuilder()
          .addBuilder(com.google.analytics.data.v1alpha.Row.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * If requested, the totaled values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row totals = 4;</code>
     */
    public com.google.analytics.data.v1alpha.Row.Builder addTotalsBuilder(int index) {
      return getTotalsFieldBuilder()
          .addBuilder(index, com.google.analytics.data.v1alpha.Row.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * If requested, the totaled values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row totals = 4;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.Row.Builder> getTotalsBuilderList() {
      return getTotalsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.Row,
            com.google.analytics.data.v1alpha.Row.Builder,
            com.google.analytics.data.v1alpha.RowOrBuilder>
        getTotalsFieldBuilder() {
      if (totalsBuilder_ == null) {
        totalsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.data.v1alpha.Row,
                com.google.analytics.data.v1alpha.Row.Builder,
                com.google.analytics.data.v1alpha.RowOrBuilder>(
                totals_, ((bitField0_ & 0x00000008) != 0), getParentForChildren(), isClean());
        totals_ = null;
      }
      return totalsBuilder_;
    }

    private java.util.List<com.google.analytics.data.v1alpha.Row> maximums_ =
        java.util.Collections.emptyList();

    private void ensureMaximumsIsMutable() {
      if (!((bitField0_ & 0x00000010) != 0)) {
        maximums_ = new java.util.ArrayList<com.google.analytics.data.v1alpha.Row>(maximums_);
        bitField0_ |= 0x00000010;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.Row,
            com.google.analytics.data.v1alpha.Row.Builder,
            com.google.analytics.data.v1alpha.RowOrBuilder>
        maximumsBuilder_;

    /**
     *
     *
     * <pre>
     * If requested, the maximum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row maximums = 5;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.Row> getMaximumsList() {
      if (maximumsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(maximums_);
      } else {
        return maximumsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * If requested, the maximum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row maximums = 5;</code>
     */
    public int getMaximumsCount() {
      if (maximumsBuilder_ == null) {
        return maximums_.size();
      } else {
        return maximumsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * If requested, the maximum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row maximums = 5;</code>
     */
    public com.google.analytics.data.v1alpha.Row getMaximums(int index) {
      if (maximumsBuilder_ == null) {
        return maximums_.get(index);
      } else {
        return maximumsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * If requested, the maximum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row maximums = 5;</code>
     */
    public Builder setMaximums(int index, com.google.analytics.data.v1alpha.Row value) {
      if (maximumsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMaximumsIsMutable();
        maximums_.set(index, value);
        onChanged();
      } else {
        maximumsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If requested, the maximum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row maximums = 5;</code>
     */
    public Builder setMaximums(
        int index, com.google.analytics.data.v1alpha.Row.Builder builderForValue) {
      if (maximumsBuilder_ == null) {
        ensureMaximumsIsMutable();
        maximums_.set(index, builderForValue.build());
        onChanged();
      } else {
        maximumsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If requested, the maximum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row maximums = 5;</code>
     */
    public Builder addMaximums(com.google.analytics.data.v1alpha.Row value) {
      if (maximumsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMaximumsIsMutable();
        maximums_.add(value);
        onChanged();
      } else {
        maximumsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If requested, the maximum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row maximums = 5;</code>
     */
    public Builder addMaximums(int index, com.google.analytics.data.v1alpha.Row value) {
      if (maximumsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMaximumsIsMutable();
        maximums_.add(index, value);
        onChanged();
      } else {
        maximumsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If requested, the maximum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row maximums = 5;</code>
     */
    public Builder addMaximums(com.google.analytics.data.v1alpha.Row.Builder builderForValue) {
      if (maximumsBuilder_ == null) {
        ensureMaximumsIsMutable();
        maximums_.add(builderForValue.build());
        onChanged();
      } else {
        maximumsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If requested, the maximum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row maximums = 5;</code>
     */
    public Builder addMaximums(
        int index, com.google.analytics.data.v1alpha.Row.Builder builderForValue) {
      if (maximumsBuilder_ == null) {
        ensureMaximumsIsMutable();
        maximums_.add(index, builderForValue.build());
        onChanged();
      } else {
        maximumsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If requested, the maximum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row maximums = 5;</code>
     */
    public Builder addAllMaximums(
        java.lang.Iterable<? extends com.google.analytics.data.v1alpha.Row> values) {
      if (maximumsBuilder_ == null) {
        ensureMaximumsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, maximums_);
        onChanged();
      } else {
        maximumsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If requested, the maximum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row maximums = 5;</code>
     */
    public Builder clearMaximums() {
      if (maximumsBuilder_ == null) {
        maximums_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
      } else {
        maximumsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If requested, the maximum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row maximums = 5;</code>
     */
    public Builder removeMaximums(int index) {
      if (maximumsBuilder_ == null) {
        ensureMaximumsIsMutable();
        maximums_.remove(index);
        onChanged();
      } else {
        maximumsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If requested, the maximum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row maximums = 5;</code>
     */
    public com.google.analytics.data.v1alpha.Row.Builder getMaximumsBuilder(int index) {
      return getMaximumsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * If requested, the maximum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row maximums = 5;</code>
     */
    public com.google.analytics.data.v1alpha.RowOrBuilder getMaximumsOrBuilder(int index) {
      if (maximumsBuilder_ == null) {
        return maximums_.get(index);
      } else {
        return maximumsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * If requested, the maximum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row maximums = 5;</code>
     */
    public java.util.List<? extends com.google.analytics.data.v1alpha.RowOrBuilder>
        getMaximumsOrBuilderList() {
      if (maximumsBuilder_ != null) {
        return maximumsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(maximums_);
      }
    }
    /**
     *
     *
     * <pre>
     * If requested, the maximum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row maximums = 5;</code>
     */
    public com.google.analytics.data.v1alpha.Row.Builder addMaximumsBuilder() {
      return getMaximumsFieldBuilder()
          .addBuilder(com.google.analytics.data.v1alpha.Row.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * If requested, the maximum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row maximums = 5;</code>
     */
    public com.google.analytics.data.v1alpha.Row.Builder addMaximumsBuilder(int index) {
      return getMaximumsFieldBuilder()
          .addBuilder(index, com.google.analytics.data.v1alpha.Row.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * If requested, the maximum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row maximums = 5;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.Row.Builder> getMaximumsBuilderList() {
      return getMaximumsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.Row,
            com.google.analytics.data.v1alpha.Row.Builder,
            com.google.analytics.data.v1alpha.RowOrBuilder>
        getMaximumsFieldBuilder() {
      if (maximumsBuilder_ == null) {
        maximumsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.data.v1alpha.Row,
                com.google.analytics.data.v1alpha.Row.Builder,
                com.google.analytics.data.v1alpha.RowOrBuilder>(
                maximums_, ((bitField0_ & 0x00000010) != 0), getParentForChildren(), isClean());
        maximums_ = null;
      }
      return maximumsBuilder_;
    }

    private java.util.List<com.google.analytics.data.v1alpha.Row> minimums_ =
        java.util.Collections.emptyList();

    private void ensureMinimumsIsMutable() {
      if (!((bitField0_ & 0x00000020) != 0)) {
        minimums_ = new java.util.ArrayList<com.google.analytics.data.v1alpha.Row>(minimums_);
        bitField0_ |= 0x00000020;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.Row,
            com.google.analytics.data.v1alpha.Row.Builder,
            com.google.analytics.data.v1alpha.RowOrBuilder>
        minimumsBuilder_;

    /**
     *
     *
     * <pre>
     * If requested, the minimum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row minimums = 6;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.Row> getMinimumsList() {
      if (minimumsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(minimums_);
      } else {
        return minimumsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * If requested, the minimum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row minimums = 6;</code>
     */
    public int getMinimumsCount() {
      if (minimumsBuilder_ == null) {
        return minimums_.size();
      } else {
        return minimumsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * If requested, the minimum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row minimums = 6;</code>
     */
    public com.google.analytics.data.v1alpha.Row getMinimums(int index) {
      if (minimumsBuilder_ == null) {
        return minimums_.get(index);
      } else {
        return minimumsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * If requested, the minimum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row minimums = 6;</code>
     */
    public Builder setMinimums(int index, com.google.analytics.data.v1alpha.Row value) {
      if (minimumsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMinimumsIsMutable();
        minimums_.set(index, value);
        onChanged();
      } else {
        minimumsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If requested, the minimum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row minimums = 6;</code>
     */
    public Builder setMinimums(
        int index, com.google.analytics.data.v1alpha.Row.Builder builderForValue) {
      if (minimumsBuilder_ == null) {
        ensureMinimumsIsMutable();
        minimums_.set(index, builderForValue.build());
        onChanged();
      } else {
        minimumsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If requested, the minimum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row minimums = 6;</code>
     */
    public Builder addMinimums(com.google.analytics.data.v1alpha.Row value) {
      if (minimumsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMinimumsIsMutable();
        minimums_.add(value);
        onChanged();
      } else {
        minimumsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If requested, the minimum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row minimums = 6;</code>
     */
    public Builder addMinimums(int index, com.google.analytics.data.v1alpha.Row value) {
      if (minimumsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMinimumsIsMutable();
        minimums_.add(index, value);
        onChanged();
      } else {
        minimumsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If requested, the minimum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row minimums = 6;</code>
     */
    public Builder addMinimums(com.google.analytics.data.v1alpha.Row.Builder builderForValue) {
      if (minimumsBuilder_ == null) {
        ensureMinimumsIsMutable();
        minimums_.add(builderForValue.build());
        onChanged();
      } else {
        minimumsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If requested, the minimum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row minimums = 6;</code>
     */
    public Builder addMinimums(
        int index, com.google.analytics.data.v1alpha.Row.Builder builderForValue) {
      if (minimumsBuilder_ == null) {
        ensureMinimumsIsMutable();
        minimums_.add(index, builderForValue.build());
        onChanged();
      } else {
        minimumsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If requested, the minimum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row minimums = 6;</code>
     */
    public Builder addAllMinimums(
        java.lang.Iterable<? extends com.google.analytics.data.v1alpha.Row> values) {
      if (minimumsBuilder_ == null) {
        ensureMinimumsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, minimums_);
        onChanged();
      } else {
        minimumsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If requested, the minimum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row minimums = 6;</code>
     */
    public Builder clearMinimums() {
      if (minimumsBuilder_ == null) {
        minimums_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000020);
        onChanged();
      } else {
        minimumsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If requested, the minimum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row minimums = 6;</code>
     */
    public Builder removeMinimums(int index) {
      if (minimumsBuilder_ == null) {
        ensureMinimumsIsMutable();
        minimums_.remove(index);
        onChanged();
      } else {
        minimumsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * If requested, the minimum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row minimums = 6;</code>
     */
    public com.google.analytics.data.v1alpha.Row.Builder getMinimumsBuilder(int index) {
      return getMinimumsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * If requested, the minimum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row minimums = 6;</code>
     */
    public com.google.analytics.data.v1alpha.RowOrBuilder getMinimumsOrBuilder(int index) {
      if (minimumsBuilder_ == null) {
        return minimums_.get(index);
      } else {
        return minimumsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * If requested, the minimum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row minimums = 6;</code>
     */
    public java.util.List<? extends com.google.analytics.data.v1alpha.RowOrBuilder>
        getMinimumsOrBuilderList() {
      if (minimumsBuilder_ != null) {
        return minimumsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(minimums_);
      }
    }
    /**
     *
     *
     * <pre>
     * If requested, the minimum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row minimums = 6;</code>
     */
    public com.google.analytics.data.v1alpha.Row.Builder addMinimumsBuilder() {
      return getMinimumsFieldBuilder()
          .addBuilder(com.google.analytics.data.v1alpha.Row.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * If requested, the minimum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row minimums = 6;</code>
     */
    public com.google.analytics.data.v1alpha.Row.Builder addMinimumsBuilder(int index) {
      return getMinimumsFieldBuilder()
          .addBuilder(index, com.google.analytics.data.v1alpha.Row.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * If requested, the minimum values of metrics.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row minimums = 6;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.Row.Builder> getMinimumsBuilderList() {
      return getMinimumsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.Row,
            com.google.analytics.data.v1alpha.Row.Builder,
            com.google.analytics.data.v1alpha.RowOrBuilder>
        getMinimumsFieldBuilder() {
      if (minimumsBuilder_ == null) {
        minimumsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.data.v1alpha.Row,
                com.google.analytics.data.v1alpha.Row.Builder,
                com.google.analytics.data.v1alpha.RowOrBuilder>(
                minimums_, ((bitField0_ & 0x00000020) != 0), getParentForChildren(), isClean());
        minimums_ = null;
      }
      return minimumsBuilder_;
    }

    private int rowCount_;
    /**
     *
     *
     * <pre>
     * The total number of rows in the query result, regardless of the number of
     * rows returned in the response. For example if a query returns 175 rows and
     * includes limit = 50 in the API request, the response will contain row_count
     * = 175 but only 50 rows.
     * </pre>
     *
     * <code>int32 row_count = 7;</code>
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
     * The total number of rows in the query result, regardless of the number of
     * rows returned in the response. For example if a query returns 175 rows and
     * includes limit = 50 in the API request, the response will contain row_count
     * = 175 but only 50 rows.
     * </pre>
     *
     * <code>int32 row_count = 7;</code>
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
     * The total number of rows in the query result, regardless of the number of
     * rows returned in the response. For example if a query returns 175 rows and
     * includes limit = 50 in the API request, the response will contain row_count
     * = 175 but only 50 rows.
     * </pre>
     *
     * <code>int32 row_count = 7;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRowCount() {

      rowCount_ = 0;
      onChanged();
      return this;
    }

    private com.google.analytics.data.v1alpha.PropertyQuota propertyQuota_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.PropertyQuota,
            com.google.analytics.data.v1alpha.PropertyQuota.Builder,
            com.google.analytics.data.v1alpha.PropertyQuotaOrBuilder>
        propertyQuotaBuilder_;
    /**
     *
     *
     * <pre>
     * This Analytics Property's Realtime quota state including this request.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 8;</code>
     *
     * @return Whether the propertyQuota field is set.
     */
    public boolean hasPropertyQuota() {
      return propertyQuotaBuilder_ != null || propertyQuota_ != null;
    }
    /**
     *
     *
     * <pre>
     * This Analytics Property's Realtime quota state including this request.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 8;</code>
     *
     * @return The propertyQuota.
     */
    public com.google.analytics.data.v1alpha.PropertyQuota getPropertyQuota() {
      if (propertyQuotaBuilder_ == null) {
        return propertyQuota_ == null
            ? com.google.analytics.data.v1alpha.PropertyQuota.getDefaultInstance()
            : propertyQuota_;
      } else {
        return propertyQuotaBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * This Analytics Property's Realtime quota state including this request.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 8;</code>
     */
    public Builder setPropertyQuota(com.google.analytics.data.v1alpha.PropertyQuota value) {
      if (propertyQuotaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        propertyQuota_ = value;
        onChanged();
      } else {
        propertyQuotaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * This Analytics Property's Realtime quota state including this request.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 8;</code>
     */
    public Builder setPropertyQuota(
        com.google.analytics.data.v1alpha.PropertyQuota.Builder builderForValue) {
      if (propertyQuotaBuilder_ == null) {
        propertyQuota_ = builderForValue.build();
        onChanged();
      } else {
        propertyQuotaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * This Analytics Property's Realtime quota state including this request.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 8;</code>
     */
    public Builder mergePropertyQuota(com.google.analytics.data.v1alpha.PropertyQuota value) {
      if (propertyQuotaBuilder_ == null) {
        if (propertyQuota_ != null) {
          propertyQuota_ =
              com.google.analytics.data.v1alpha.PropertyQuota.newBuilder(propertyQuota_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          propertyQuota_ = value;
        }
        onChanged();
      } else {
        propertyQuotaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * This Analytics Property's Realtime quota state including this request.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 8;</code>
     */
    public Builder clearPropertyQuota() {
      if (propertyQuotaBuilder_ == null) {
        propertyQuota_ = null;
        onChanged();
      } else {
        propertyQuota_ = null;
        propertyQuotaBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * This Analytics Property's Realtime quota state including this request.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 8;</code>
     */
    public com.google.analytics.data.v1alpha.PropertyQuota.Builder getPropertyQuotaBuilder() {

      onChanged();
      return getPropertyQuotaFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * This Analytics Property's Realtime quota state including this request.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 8;</code>
     */
    public com.google.analytics.data.v1alpha.PropertyQuotaOrBuilder getPropertyQuotaOrBuilder() {
      if (propertyQuotaBuilder_ != null) {
        return propertyQuotaBuilder_.getMessageOrBuilder();
      } else {
        return propertyQuota_ == null
            ? com.google.analytics.data.v1alpha.PropertyQuota.getDefaultInstance()
            : propertyQuota_;
      }
    }
    /**
     *
     *
     * <pre>
     * This Analytics Property's Realtime quota state including this request.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 8;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.PropertyQuota,
            com.google.analytics.data.v1alpha.PropertyQuota.Builder,
            com.google.analytics.data.v1alpha.PropertyQuotaOrBuilder>
        getPropertyQuotaFieldBuilder() {
      if (propertyQuotaBuilder_ == null) {
        propertyQuotaBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.PropertyQuota,
                com.google.analytics.data.v1alpha.PropertyQuota.Builder,
                com.google.analytics.data.v1alpha.PropertyQuotaOrBuilder>(
                getPropertyQuota(), getParentForChildren(), isClean());
        propertyQuota_ = null;
      }
      return propertyQuotaBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.RunRealtimeReportResponse)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.RunRealtimeReportResponse)
  private static final com.google.analytics.data.v1alpha.RunRealtimeReportResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.RunRealtimeReportResponse();
  }

  public static com.google.analytics.data.v1alpha.RunRealtimeReportResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RunRealtimeReportResponse> PARSER =
      new com.google.protobuf.AbstractParser<RunRealtimeReportResponse>() {
        @java.lang.Override
        public RunRealtimeReportResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new RunRealtimeReportResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<RunRealtimeReportResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RunRealtimeReportResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.RunRealtimeReportResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
