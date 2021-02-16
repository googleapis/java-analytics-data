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
 * The response pivot report table corresponding to a pivot request.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.RunPivotReportResponse}
 */
public final class RunPivotReportResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.RunPivotReportResponse)
    RunPivotReportResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RunPivotReportResponse.newBuilder() to construct.
  private RunPivotReportResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RunPivotReportResponse() {
    pivotHeaders_ = java.util.Collections.emptyList();
    dimensionHeaders_ = java.util.Collections.emptyList();
    metricHeaders_ = java.util.Collections.emptyList();
    rows_ = java.util.Collections.emptyList();
    aggregates_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RunPivotReportResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private RunPivotReportResponse(
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
                pivotHeaders_ =
                    new java.util.ArrayList<com.google.analytics.data.v1alpha.PivotHeader>();
                mutable_bitField0_ |= 0x00000001;
              }
              pivotHeaders_.add(
                  input.readMessage(
                      com.google.analytics.data.v1alpha.PivotHeader.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              if (!((mutable_bitField0_ & 0x00000004) != 0)) {
                metricHeaders_ =
                    new java.util.ArrayList<com.google.analytics.data.v1alpha.MetricHeader>();
                mutable_bitField0_ |= 0x00000004;
              }
              metricHeaders_.add(
                  input.readMessage(
                      com.google.analytics.data.v1alpha.MetricHeader.parser(), extensionRegistry));
              break;
            }
          case 26:
            {
              if (!((mutable_bitField0_ & 0x00000008) != 0)) {
                rows_ = new java.util.ArrayList<com.google.analytics.data.v1alpha.Row>();
                mutable_bitField0_ |= 0x00000008;
              }
              rows_.add(
                  input.readMessage(
                      com.google.analytics.data.v1alpha.Row.parser(), extensionRegistry));
              break;
            }
          case 34:
            {
              if (!((mutable_bitField0_ & 0x00000010) != 0)) {
                aggregates_ = new java.util.ArrayList<com.google.analytics.data.v1alpha.Row>();
                mutable_bitField0_ |= 0x00000010;
              }
              aggregates_.add(
                  input.readMessage(
                      com.google.analytics.data.v1alpha.Row.parser(), extensionRegistry));
              break;
            }
          case 42:
            {
              com.google.analytics.data.v1alpha.ResponseMetaData.Builder subBuilder = null;
              if (metadata_ != null) {
                subBuilder = metadata_.toBuilder();
              }
              metadata_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.ResponseMetaData.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(metadata_);
                metadata_ = subBuilder.buildPartial();
              }

              break;
            }
          case 50:
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
          case 58:
            {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                dimensionHeaders_ =
                    new java.util.ArrayList<com.google.analytics.data.v1alpha.DimensionHeader>();
                mutable_bitField0_ |= 0x00000002;
              }
              dimensionHeaders_.add(
                  input.readMessage(
                      com.google.analytics.data.v1alpha.DimensionHeader.parser(),
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
        pivotHeaders_ = java.util.Collections.unmodifiableList(pivotHeaders_);
      }
      if (((mutable_bitField0_ & 0x00000004) != 0)) {
        metricHeaders_ = java.util.Collections.unmodifiableList(metricHeaders_);
      }
      if (((mutable_bitField0_ & 0x00000008) != 0)) {
        rows_ = java.util.Collections.unmodifiableList(rows_);
      }
      if (((mutable_bitField0_ & 0x00000010) != 0)) {
        aggregates_ = java.util.Collections.unmodifiableList(aggregates_);
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        dimensionHeaders_ = java.util.Collections.unmodifiableList(dimensionHeaders_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
        .internal_static_google_analytics_data_v1alpha_RunPivotReportResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
        .internal_static_google_analytics_data_v1alpha_RunPivotReportResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.RunPivotReportResponse.class,
            com.google.analytics.data.v1alpha.RunPivotReportResponse.Builder.class);
  }

  public static final int PIVOT_HEADERS_FIELD_NUMBER = 1;
  private java.util.List<com.google.analytics.data.v1alpha.PivotHeader> pivotHeaders_;
  /**
   *
   *
   * <pre>
   * Summarizes the columns and rows created by a pivot. Each pivot in the
   * request produces one header in the response. If we have a request like
   * this:
   *     "pivots": [{
   *       "fieldNames": ["country",
   *         "city"]
   *     },
   *     {
   *       "fieldNames": "eventName"
   *     }]
   * We will have the following `pivotHeaders` in the response:
   *     "pivotHeaders" : [{
   *       "dimensionHeaders": [{
   *         "dimensionValues": [
   *            { "value": "United Kingdom" },
   *            { "value": "London" }
   *          ]
   *       },
   *       {
   *         "dimensionValues": [
   *         { "value": "Japan" },
   *         { "value": "Osaka" }
   *         ]
   *       }]
   *     },
   *     {
   *       "dimensionHeaders": [{
   *         "dimensionValues": [{ "value": "session_start" }]
   *       },
   *       {
   *         "dimensionValues": [{ "value": "scroll" }]
   *       }]
   *     }]
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.PivotHeader pivot_headers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1alpha.PivotHeader> getPivotHeadersList() {
    return pivotHeaders_;
  }
  /**
   *
   *
   * <pre>
   * Summarizes the columns and rows created by a pivot. Each pivot in the
   * request produces one header in the response. If we have a request like
   * this:
   *     "pivots": [{
   *       "fieldNames": ["country",
   *         "city"]
   *     },
   *     {
   *       "fieldNames": "eventName"
   *     }]
   * We will have the following `pivotHeaders` in the response:
   *     "pivotHeaders" : [{
   *       "dimensionHeaders": [{
   *         "dimensionValues": [
   *            { "value": "United Kingdom" },
   *            { "value": "London" }
   *          ]
   *       },
   *       {
   *         "dimensionValues": [
   *         { "value": "Japan" },
   *         { "value": "Osaka" }
   *         ]
   *       }]
   *     },
   *     {
   *       "dimensionHeaders": [{
   *         "dimensionValues": [{ "value": "session_start" }]
   *       },
   *       {
   *         "dimensionValues": [{ "value": "scroll" }]
   *       }]
   *     }]
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.PivotHeader pivot_headers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.data.v1alpha.PivotHeaderOrBuilder>
      getPivotHeadersOrBuilderList() {
    return pivotHeaders_;
  }
  /**
   *
   *
   * <pre>
   * Summarizes the columns and rows created by a pivot. Each pivot in the
   * request produces one header in the response. If we have a request like
   * this:
   *     "pivots": [{
   *       "fieldNames": ["country",
   *         "city"]
   *     },
   *     {
   *       "fieldNames": "eventName"
   *     }]
   * We will have the following `pivotHeaders` in the response:
   *     "pivotHeaders" : [{
   *       "dimensionHeaders": [{
   *         "dimensionValues": [
   *            { "value": "United Kingdom" },
   *            { "value": "London" }
   *          ]
   *       },
   *       {
   *         "dimensionValues": [
   *         { "value": "Japan" },
   *         { "value": "Osaka" }
   *         ]
   *       }]
   *     },
   *     {
   *       "dimensionHeaders": [{
   *         "dimensionValues": [{ "value": "session_start" }]
   *       },
   *       {
   *         "dimensionValues": [{ "value": "scroll" }]
   *       }]
   *     }]
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.PivotHeader pivot_headers = 1;</code>
   */
  @java.lang.Override
  public int getPivotHeadersCount() {
    return pivotHeaders_.size();
  }
  /**
   *
   *
   * <pre>
   * Summarizes the columns and rows created by a pivot. Each pivot in the
   * request produces one header in the response. If we have a request like
   * this:
   *     "pivots": [{
   *       "fieldNames": ["country",
   *         "city"]
   *     },
   *     {
   *       "fieldNames": "eventName"
   *     }]
   * We will have the following `pivotHeaders` in the response:
   *     "pivotHeaders" : [{
   *       "dimensionHeaders": [{
   *         "dimensionValues": [
   *            { "value": "United Kingdom" },
   *            { "value": "London" }
   *          ]
   *       },
   *       {
   *         "dimensionValues": [
   *         { "value": "Japan" },
   *         { "value": "Osaka" }
   *         ]
   *       }]
   *     },
   *     {
   *       "dimensionHeaders": [{
   *         "dimensionValues": [{ "value": "session_start" }]
   *       },
   *       {
   *         "dimensionValues": [{ "value": "scroll" }]
   *       }]
   *     }]
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.PivotHeader pivot_headers = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.PivotHeader getPivotHeaders(int index) {
    return pivotHeaders_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Summarizes the columns and rows created by a pivot. Each pivot in the
   * request produces one header in the response. If we have a request like
   * this:
   *     "pivots": [{
   *       "fieldNames": ["country",
   *         "city"]
   *     },
   *     {
   *       "fieldNames": "eventName"
   *     }]
   * We will have the following `pivotHeaders` in the response:
   *     "pivotHeaders" : [{
   *       "dimensionHeaders": [{
   *         "dimensionValues": [
   *            { "value": "United Kingdom" },
   *            { "value": "London" }
   *          ]
   *       },
   *       {
   *         "dimensionValues": [
   *         { "value": "Japan" },
   *         { "value": "Osaka" }
   *         ]
   *       }]
   *     },
   *     {
   *       "dimensionHeaders": [{
   *         "dimensionValues": [{ "value": "session_start" }]
   *       },
   *       {
   *         "dimensionValues": [{ "value": "scroll" }]
   *       }]
   *     }]
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.PivotHeader pivot_headers = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.PivotHeaderOrBuilder getPivotHeadersOrBuilder(
      int index) {
    return pivotHeaders_.get(index);
  }

  public static final int DIMENSION_HEADERS_FIELD_NUMBER = 7;
  private java.util.List<com.google.analytics.data.v1alpha.DimensionHeader> dimensionHeaders_;
  /**
   *
   *
   * <pre>
   * Describes dimension columns. The number of DimensionHeaders and ordering of
   * DimensionHeaders matches the dimensions present in rows.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 7;</code>
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
   * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 7;</code>
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
   * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 7;</code>
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
   * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 7;</code>
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
   * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 7;</code>
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

  public static final int AGGREGATES_FIELD_NUMBER = 4;
  private java.util.List<com.google.analytics.data.v1alpha.Row> aggregates_;
  /**
   *
   *
   * <pre>
   * Aggregation of metric values. Can be totals, minimums, or maximums. The
   * returned aggregations are controlled by the metric_aggregations in the
   * pivot. The type of aggregation returned in each row is shown by the
   * dimension_values which are set to "RESERVED_&lt;MetricAggregation&gt;".
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row aggregates = 4;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1alpha.Row> getAggregatesList() {
    return aggregates_;
  }
  /**
   *
   *
   * <pre>
   * Aggregation of metric values. Can be totals, minimums, or maximums. The
   * returned aggregations are controlled by the metric_aggregations in the
   * pivot. The type of aggregation returned in each row is shown by the
   * dimension_values which are set to "RESERVED_&lt;MetricAggregation&gt;".
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row aggregates = 4;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.data.v1alpha.RowOrBuilder>
      getAggregatesOrBuilderList() {
    return aggregates_;
  }
  /**
   *
   *
   * <pre>
   * Aggregation of metric values. Can be totals, minimums, or maximums. The
   * returned aggregations are controlled by the metric_aggregations in the
   * pivot. The type of aggregation returned in each row is shown by the
   * dimension_values which are set to "RESERVED_&lt;MetricAggregation&gt;".
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row aggregates = 4;</code>
   */
  @java.lang.Override
  public int getAggregatesCount() {
    return aggregates_.size();
  }
  /**
   *
   *
   * <pre>
   * Aggregation of metric values. Can be totals, minimums, or maximums. The
   * returned aggregations are controlled by the metric_aggregations in the
   * pivot. The type of aggregation returned in each row is shown by the
   * dimension_values which are set to "RESERVED_&lt;MetricAggregation&gt;".
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row aggregates = 4;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.Row getAggregates(int index) {
    return aggregates_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Aggregation of metric values. Can be totals, minimums, or maximums. The
   * returned aggregations are controlled by the metric_aggregations in the
   * pivot. The type of aggregation returned in each row is shown by the
   * dimension_values which are set to "RESERVED_&lt;MetricAggregation&gt;".
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row aggregates = 4;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.RowOrBuilder getAggregatesOrBuilder(int index) {
    return aggregates_.get(index);
  }

  public static final int METADATA_FIELD_NUMBER = 5;
  private com.google.analytics.data.v1alpha.ResponseMetaData metadata_;
  /**
   *
   *
   * <pre>
   * Metadata for the report.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.ResponseMetaData metadata = 5;</code>
   *
   * @return Whether the metadata field is set.
   */
  @java.lang.Override
  public boolean hasMetadata() {
    return metadata_ != null;
  }
  /**
   *
   *
   * <pre>
   * Metadata for the report.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.ResponseMetaData metadata = 5;</code>
   *
   * @return The metadata.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.ResponseMetaData getMetadata() {
    return metadata_ == null
        ? com.google.analytics.data.v1alpha.ResponseMetaData.getDefaultInstance()
        : metadata_;
  }
  /**
   *
   *
   * <pre>
   * Metadata for the report.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.ResponseMetaData metadata = 5;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.ResponseMetaDataOrBuilder getMetadataOrBuilder() {
    return getMetadata();
  }

  public static final int PROPERTY_QUOTA_FIELD_NUMBER = 6;
  private com.google.analytics.data.v1alpha.PropertyQuota propertyQuota_;
  /**
   *
   *
   * <pre>
   * This Analytics Property's quota state including this request.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 6;</code>
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
   * This Analytics Property's quota state including this request.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 6;</code>
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
   * This Analytics Property's quota state including this request.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 6;</code>
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
    for (int i = 0; i < pivotHeaders_.size(); i++) {
      output.writeMessage(1, pivotHeaders_.get(i));
    }
    for (int i = 0; i < metricHeaders_.size(); i++) {
      output.writeMessage(2, metricHeaders_.get(i));
    }
    for (int i = 0; i < rows_.size(); i++) {
      output.writeMessage(3, rows_.get(i));
    }
    for (int i = 0; i < aggregates_.size(); i++) {
      output.writeMessage(4, aggregates_.get(i));
    }
    if (metadata_ != null) {
      output.writeMessage(5, getMetadata());
    }
    if (propertyQuota_ != null) {
      output.writeMessage(6, getPropertyQuota());
    }
    for (int i = 0; i < dimensionHeaders_.size(); i++) {
      output.writeMessage(7, dimensionHeaders_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < pivotHeaders_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, pivotHeaders_.get(i));
    }
    for (int i = 0; i < metricHeaders_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, metricHeaders_.get(i));
    }
    for (int i = 0; i < rows_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, rows_.get(i));
    }
    for (int i = 0; i < aggregates_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, aggregates_.get(i));
    }
    if (metadata_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, getMetadata());
    }
    if (propertyQuota_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(6, getPropertyQuota());
    }
    for (int i = 0; i < dimensionHeaders_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(7, dimensionHeaders_.get(i));
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.RunPivotReportResponse)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.RunPivotReportResponse other =
        (com.google.analytics.data.v1alpha.RunPivotReportResponse) obj;

    if (!getPivotHeadersList().equals(other.getPivotHeadersList())) return false;
    if (!getDimensionHeadersList().equals(other.getDimensionHeadersList())) return false;
    if (!getMetricHeadersList().equals(other.getMetricHeadersList())) return false;
    if (!getRowsList().equals(other.getRowsList())) return false;
    if (!getAggregatesList().equals(other.getAggregatesList())) return false;
    if (hasMetadata() != other.hasMetadata()) return false;
    if (hasMetadata()) {
      if (!getMetadata().equals(other.getMetadata())) return false;
    }
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
    if (getPivotHeadersCount() > 0) {
      hash = (37 * hash) + PIVOT_HEADERS_FIELD_NUMBER;
      hash = (53 * hash) + getPivotHeadersList().hashCode();
    }
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
    if (getAggregatesCount() > 0) {
      hash = (37 * hash) + AGGREGATES_FIELD_NUMBER;
      hash = (53 * hash) + getAggregatesList().hashCode();
    }
    if (hasMetadata()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadata().hashCode();
    }
    if (hasPropertyQuota()) {
      hash = (37 * hash) + PROPERTY_QUOTA_FIELD_NUMBER;
      hash = (53 * hash) + getPropertyQuota().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.RunPivotReportResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.RunPivotReportResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.RunPivotReportResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.RunPivotReportResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.RunPivotReportResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.RunPivotReportResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.RunPivotReportResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.RunPivotReportResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.RunPivotReportResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.RunPivotReportResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.RunPivotReportResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.RunPivotReportResponse parseFrom(
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
      com.google.analytics.data.v1alpha.RunPivotReportResponse prototype) {
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
   * The response pivot report table corresponding to a pivot request.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.RunPivotReportResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.RunPivotReportResponse)
      com.google.analytics.data.v1alpha.RunPivotReportResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_RunPivotReportResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_RunPivotReportResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.RunPivotReportResponse.class,
              com.google.analytics.data.v1alpha.RunPivotReportResponse.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.RunPivotReportResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getPivotHeadersFieldBuilder();
        getDimensionHeadersFieldBuilder();
        getMetricHeadersFieldBuilder();
        getRowsFieldBuilder();
        getAggregatesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (pivotHeadersBuilder_ == null) {
        pivotHeaders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        pivotHeadersBuilder_.clear();
      }
      if (dimensionHeadersBuilder_ == null) {
        dimensionHeaders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        dimensionHeadersBuilder_.clear();
      }
      if (metricHeadersBuilder_ == null) {
        metricHeaders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        metricHeadersBuilder_.clear();
      }
      if (rowsBuilder_ == null) {
        rows_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        rowsBuilder_.clear();
      }
      if (aggregatesBuilder_ == null) {
        aggregates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
      } else {
        aggregatesBuilder_.clear();
      }
      if (metadataBuilder_ == null) {
        metadata_ = null;
      } else {
        metadata_ = null;
        metadataBuilder_ = null;
      }
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
          .internal_static_google_analytics_data_v1alpha_RunPivotReportResponse_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.RunPivotReportResponse getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.RunPivotReportResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.RunPivotReportResponse build() {
      com.google.analytics.data.v1alpha.RunPivotReportResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.RunPivotReportResponse buildPartial() {
      com.google.analytics.data.v1alpha.RunPivotReportResponse result =
          new com.google.analytics.data.v1alpha.RunPivotReportResponse(this);
      int from_bitField0_ = bitField0_;
      if (pivotHeadersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          pivotHeaders_ = java.util.Collections.unmodifiableList(pivotHeaders_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.pivotHeaders_ = pivotHeaders_;
      } else {
        result.pivotHeaders_ = pivotHeadersBuilder_.build();
      }
      if (dimensionHeadersBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          dimensionHeaders_ = java.util.Collections.unmodifiableList(dimensionHeaders_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.dimensionHeaders_ = dimensionHeaders_;
      } else {
        result.dimensionHeaders_ = dimensionHeadersBuilder_.build();
      }
      if (metricHeadersBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          metricHeaders_ = java.util.Collections.unmodifiableList(metricHeaders_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.metricHeaders_ = metricHeaders_;
      } else {
        result.metricHeaders_ = metricHeadersBuilder_.build();
      }
      if (rowsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0)) {
          rows_ = java.util.Collections.unmodifiableList(rows_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.rows_ = rows_;
      } else {
        result.rows_ = rowsBuilder_.build();
      }
      if (aggregatesBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0)) {
          aggregates_ = java.util.Collections.unmodifiableList(aggregates_);
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.aggregates_ = aggregates_;
      } else {
        result.aggregates_ = aggregatesBuilder_.build();
      }
      if (metadataBuilder_ == null) {
        result.metadata_ = metadata_;
      } else {
        result.metadata_ = metadataBuilder_.build();
      }
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
      if (other instanceof com.google.analytics.data.v1alpha.RunPivotReportResponse) {
        return mergeFrom((com.google.analytics.data.v1alpha.RunPivotReportResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.RunPivotReportResponse other) {
      if (other == com.google.analytics.data.v1alpha.RunPivotReportResponse.getDefaultInstance())
        return this;
      if (pivotHeadersBuilder_ == null) {
        if (!other.pivotHeaders_.isEmpty()) {
          if (pivotHeaders_.isEmpty()) {
            pivotHeaders_ = other.pivotHeaders_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePivotHeadersIsMutable();
            pivotHeaders_.addAll(other.pivotHeaders_);
          }
          onChanged();
        }
      } else {
        if (!other.pivotHeaders_.isEmpty()) {
          if (pivotHeadersBuilder_.isEmpty()) {
            pivotHeadersBuilder_.dispose();
            pivotHeadersBuilder_ = null;
            pivotHeaders_ = other.pivotHeaders_;
            bitField0_ = (bitField0_ & ~0x00000001);
            pivotHeadersBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getPivotHeadersFieldBuilder()
                    : null;
          } else {
            pivotHeadersBuilder_.addAllMessages(other.pivotHeaders_);
          }
        }
      }
      if (dimensionHeadersBuilder_ == null) {
        if (!other.dimensionHeaders_.isEmpty()) {
          if (dimensionHeaders_.isEmpty()) {
            dimensionHeaders_ = other.dimensionHeaders_;
            bitField0_ = (bitField0_ & ~0x00000002);
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
            bitField0_ = (bitField0_ & ~0x00000002);
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
            bitField0_ = (bitField0_ & ~0x00000004);
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
            bitField0_ = (bitField0_ & ~0x00000004);
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
            bitField0_ = (bitField0_ & ~0x00000008);
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
            bitField0_ = (bitField0_ & ~0x00000008);
            rowsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getRowsFieldBuilder()
                    : null;
          } else {
            rowsBuilder_.addAllMessages(other.rows_);
          }
        }
      }
      if (aggregatesBuilder_ == null) {
        if (!other.aggregates_.isEmpty()) {
          if (aggregates_.isEmpty()) {
            aggregates_ = other.aggregates_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensureAggregatesIsMutable();
            aggregates_.addAll(other.aggregates_);
          }
          onChanged();
        }
      } else {
        if (!other.aggregates_.isEmpty()) {
          if (aggregatesBuilder_.isEmpty()) {
            aggregatesBuilder_.dispose();
            aggregatesBuilder_ = null;
            aggregates_ = other.aggregates_;
            bitField0_ = (bitField0_ & ~0x00000010);
            aggregatesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getAggregatesFieldBuilder()
                    : null;
          } else {
            aggregatesBuilder_.addAllMessages(other.aggregates_);
          }
        }
      }
      if (other.hasMetadata()) {
        mergeMetadata(other.getMetadata());
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
      com.google.analytics.data.v1alpha.RunPivotReportResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.data.v1alpha.RunPivotReportResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.analytics.data.v1alpha.PivotHeader> pivotHeaders_ =
        java.util.Collections.emptyList();

    private void ensurePivotHeadersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        pivotHeaders_ =
            new java.util.ArrayList<com.google.analytics.data.v1alpha.PivotHeader>(pivotHeaders_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.PivotHeader,
            com.google.analytics.data.v1alpha.PivotHeader.Builder,
            com.google.analytics.data.v1alpha.PivotHeaderOrBuilder>
        pivotHeadersBuilder_;

    /**
     *
     *
     * <pre>
     * Summarizes the columns and rows created by a pivot. Each pivot in the
     * request produces one header in the response. If we have a request like
     * this:
     *     "pivots": [{
     *       "fieldNames": ["country",
     *         "city"]
     *     },
     *     {
     *       "fieldNames": "eventName"
     *     }]
     * We will have the following `pivotHeaders` in the response:
     *     "pivotHeaders" : [{
     *       "dimensionHeaders": [{
     *         "dimensionValues": [
     *            { "value": "United Kingdom" },
     *            { "value": "London" }
     *          ]
     *       },
     *       {
     *         "dimensionValues": [
     *         { "value": "Japan" },
     *         { "value": "Osaka" }
     *         ]
     *       }]
     *     },
     *     {
     *       "dimensionHeaders": [{
     *         "dimensionValues": [{ "value": "session_start" }]
     *       },
     *       {
     *         "dimensionValues": [{ "value": "scroll" }]
     *       }]
     *     }]
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.PivotHeader pivot_headers = 1;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.PivotHeader> getPivotHeadersList() {
      if (pivotHeadersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(pivotHeaders_);
      } else {
        return pivotHeadersBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Summarizes the columns and rows created by a pivot. Each pivot in the
     * request produces one header in the response. If we have a request like
     * this:
     *     "pivots": [{
     *       "fieldNames": ["country",
     *         "city"]
     *     },
     *     {
     *       "fieldNames": "eventName"
     *     }]
     * We will have the following `pivotHeaders` in the response:
     *     "pivotHeaders" : [{
     *       "dimensionHeaders": [{
     *         "dimensionValues": [
     *            { "value": "United Kingdom" },
     *            { "value": "London" }
     *          ]
     *       },
     *       {
     *         "dimensionValues": [
     *         { "value": "Japan" },
     *         { "value": "Osaka" }
     *         ]
     *       }]
     *     },
     *     {
     *       "dimensionHeaders": [{
     *         "dimensionValues": [{ "value": "session_start" }]
     *       },
     *       {
     *         "dimensionValues": [{ "value": "scroll" }]
     *       }]
     *     }]
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.PivotHeader pivot_headers = 1;</code>
     */
    public int getPivotHeadersCount() {
      if (pivotHeadersBuilder_ == null) {
        return pivotHeaders_.size();
      } else {
        return pivotHeadersBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Summarizes the columns and rows created by a pivot. Each pivot in the
     * request produces one header in the response. If we have a request like
     * this:
     *     "pivots": [{
     *       "fieldNames": ["country",
     *         "city"]
     *     },
     *     {
     *       "fieldNames": "eventName"
     *     }]
     * We will have the following `pivotHeaders` in the response:
     *     "pivotHeaders" : [{
     *       "dimensionHeaders": [{
     *         "dimensionValues": [
     *            { "value": "United Kingdom" },
     *            { "value": "London" }
     *          ]
     *       },
     *       {
     *         "dimensionValues": [
     *         { "value": "Japan" },
     *         { "value": "Osaka" }
     *         ]
     *       }]
     *     },
     *     {
     *       "dimensionHeaders": [{
     *         "dimensionValues": [{ "value": "session_start" }]
     *       },
     *       {
     *         "dimensionValues": [{ "value": "scroll" }]
     *       }]
     *     }]
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.PivotHeader pivot_headers = 1;</code>
     */
    public com.google.analytics.data.v1alpha.PivotHeader getPivotHeaders(int index) {
      if (pivotHeadersBuilder_ == null) {
        return pivotHeaders_.get(index);
      } else {
        return pivotHeadersBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Summarizes the columns and rows created by a pivot. Each pivot in the
     * request produces one header in the response. If we have a request like
     * this:
     *     "pivots": [{
     *       "fieldNames": ["country",
     *         "city"]
     *     },
     *     {
     *       "fieldNames": "eventName"
     *     }]
     * We will have the following `pivotHeaders` in the response:
     *     "pivotHeaders" : [{
     *       "dimensionHeaders": [{
     *         "dimensionValues": [
     *            { "value": "United Kingdom" },
     *            { "value": "London" }
     *          ]
     *       },
     *       {
     *         "dimensionValues": [
     *         { "value": "Japan" },
     *         { "value": "Osaka" }
     *         ]
     *       }]
     *     },
     *     {
     *       "dimensionHeaders": [{
     *         "dimensionValues": [{ "value": "session_start" }]
     *       },
     *       {
     *         "dimensionValues": [{ "value": "scroll" }]
     *       }]
     *     }]
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.PivotHeader pivot_headers = 1;</code>
     */
    public Builder setPivotHeaders(int index, com.google.analytics.data.v1alpha.PivotHeader value) {
      if (pivotHeadersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePivotHeadersIsMutable();
        pivotHeaders_.set(index, value);
        onChanged();
      } else {
        pivotHeadersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Summarizes the columns and rows created by a pivot. Each pivot in the
     * request produces one header in the response. If we have a request like
     * this:
     *     "pivots": [{
     *       "fieldNames": ["country",
     *         "city"]
     *     },
     *     {
     *       "fieldNames": "eventName"
     *     }]
     * We will have the following `pivotHeaders` in the response:
     *     "pivotHeaders" : [{
     *       "dimensionHeaders": [{
     *         "dimensionValues": [
     *            { "value": "United Kingdom" },
     *            { "value": "London" }
     *          ]
     *       },
     *       {
     *         "dimensionValues": [
     *         { "value": "Japan" },
     *         { "value": "Osaka" }
     *         ]
     *       }]
     *     },
     *     {
     *       "dimensionHeaders": [{
     *         "dimensionValues": [{ "value": "session_start" }]
     *       },
     *       {
     *         "dimensionValues": [{ "value": "scroll" }]
     *       }]
     *     }]
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.PivotHeader pivot_headers = 1;</code>
     */
    public Builder setPivotHeaders(
        int index, com.google.analytics.data.v1alpha.PivotHeader.Builder builderForValue) {
      if (pivotHeadersBuilder_ == null) {
        ensurePivotHeadersIsMutable();
        pivotHeaders_.set(index, builderForValue.build());
        onChanged();
      } else {
        pivotHeadersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Summarizes the columns and rows created by a pivot. Each pivot in the
     * request produces one header in the response. If we have a request like
     * this:
     *     "pivots": [{
     *       "fieldNames": ["country",
     *         "city"]
     *     },
     *     {
     *       "fieldNames": "eventName"
     *     }]
     * We will have the following `pivotHeaders` in the response:
     *     "pivotHeaders" : [{
     *       "dimensionHeaders": [{
     *         "dimensionValues": [
     *            { "value": "United Kingdom" },
     *            { "value": "London" }
     *          ]
     *       },
     *       {
     *         "dimensionValues": [
     *         { "value": "Japan" },
     *         { "value": "Osaka" }
     *         ]
     *       }]
     *     },
     *     {
     *       "dimensionHeaders": [{
     *         "dimensionValues": [{ "value": "session_start" }]
     *       },
     *       {
     *         "dimensionValues": [{ "value": "scroll" }]
     *       }]
     *     }]
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.PivotHeader pivot_headers = 1;</code>
     */
    public Builder addPivotHeaders(com.google.analytics.data.v1alpha.PivotHeader value) {
      if (pivotHeadersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePivotHeadersIsMutable();
        pivotHeaders_.add(value);
        onChanged();
      } else {
        pivotHeadersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Summarizes the columns and rows created by a pivot. Each pivot in the
     * request produces one header in the response. If we have a request like
     * this:
     *     "pivots": [{
     *       "fieldNames": ["country",
     *         "city"]
     *     },
     *     {
     *       "fieldNames": "eventName"
     *     }]
     * We will have the following `pivotHeaders` in the response:
     *     "pivotHeaders" : [{
     *       "dimensionHeaders": [{
     *         "dimensionValues": [
     *            { "value": "United Kingdom" },
     *            { "value": "London" }
     *          ]
     *       },
     *       {
     *         "dimensionValues": [
     *         { "value": "Japan" },
     *         { "value": "Osaka" }
     *         ]
     *       }]
     *     },
     *     {
     *       "dimensionHeaders": [{
     *         "dimensionValues": [{ "value": "session_start" }]
     *       },
     *       {
     *         "dimensionValues": [{ "value": "scroll" }]
     *       }]
     *     }]
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.PivotHeader pivot_headers = 1;</code>
     */
    public Builder addPivotHeaders(int index, com.google.analytics.data.v1alpha.PivotHeader value) {
      if (pivotHeadersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePivotHeadersIsMutable();
        pivotHeaders_.add(index, value);
        onChanged();
      } else {
        pivotHeadersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Summarizes the columns and rows created by a pivot. Each pivot in the
     * request produces one header in the response. If we have a request like
     * this:
     *     "pivots": [{
     *       "fieldNames": ["country",
     *         "city"]
     *     },
     *     {
     *       "fieldNames": "eventName"
     *     }]
     * We will have the following `pivotHeaders` in the response:
     *     "pivotHeaders" : [{
     *       "dimensionHeaders": [{
     *         "dimensionValues": [
     *            { "value": "United Kingdom" },
     *            { "value": "London" }
     *          ]
     *       },
     *       {
     *         "dimensionValues": [
     *         { "value": "Japan" },
     *         { "value": "Osaka" }
     *         ]
     *       }]
     *     },
     *     {
     *       "dimensionHeaders": [{
     *         "dimensionValues": [{ "value": "session_start" }]
     *       },
     *       {
     *         "dimensionValues": [{ "value": "scroll" }]
     *       }]
     *     }]
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.PivotHeader pivot_headers = 1;</code>
     */
    public Builder addPivotHeaders(
        com.google.analytics.data.v1alpha.PivotHeader.Builder builderForValue) {
      if (pivotHeadersBuilder_ == null) {
        ensurePivotHeadersIsMutable();
        pivotHeaders_.add(builderForValue.build());
        onChanged();
      } else {
        pivotHeadersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Summarizes the columns and rows created by a pivot. Each pivot in the
     * request produces one header in the response. If we have a request like
     * this:
     *     "pivots": [{
     *       "fieldNames": ["country",
     *         "city"]
     *     },
     *     {
     *       "fieldNames": "eventName"
     *     }]
     * We will have the following `pivotHeaders` in the response:
     *     "pivotHeaders" : [{
     *       "dimensionHeaders": [{
     *         "dimensionValues": [
     *            { "value": "United Kingdom" },
     *            { "value": "London" }
     *          ]
     *       },
     *       {
     *         "dimensionValues": [
     *         { "value": "Japan" },
     *         { "value": "Osaka" }
     *         ]
     *       }]
     *     },
     *     {
     *       "dimensionHeaders": [{
     *         "dimensionValues": [{ "value": "session_start" }]
     *       },
     *       {
     *         "dimensionValues": [{ "value": "scroll" }]
     *       }]
     *     }]
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.PivotHeader pivot_headers = 1;</code>
     */
    public Builder addPivotHeaders(
        int index, com.google.analytics.data.v1alpha.PivotHeader.Builder builderForValue) {
      if (pivotHeadersBuilder_ == null) {
        ensurePivotHeadersIsMutable();
        pivotHeaders_.add(index, builderForValue.build());
        onChanged();
      } else {
        pivotHeadersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Summarizes the columns and rows created by a pivot. Each pivot in the
     * request produces one header in the response. If we have a request like
     * this:
     *     "pivots": [{
     *       "fieldNames": ["country",
     *         "city"]
     *     },
     *     {
     *       "fieldNames": "eventName"
     *     }]
     * We will have the following `pivotHeaders` in the response:
     *     "pivotHeaders" : [{
     *       "dimensionHeaders": [{
     *         "dimensionValues": [
     *            { "value": "United Kingdom" },
     *            { "value": "London" }
     *          ]
     *       },
     *       {
     *         "dimensionValues": [
     *         { "value": "Japan" },
     *         { "value": "Osaka" }
     *         ]
     *       }]
     *     },
     *     {
     *       "dimensionHeaders": [{
     *         "dimensionValues": [{ "value": "session_start" }]
     *       },
     *       {
     *         "dimensionValues": [{ "value": "scroll" }]
     *       }]
     *     }]
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.PivotHeader pivot_headers = 1;</code>
     */
    public Builder addAllPivotHeaders(
        java.lang.Iterable<? extends com.google.analytics.data.v1alpha.PivotHeader> values) {
      if (pivotHeadersBuilder_ == null) {
        ensurePivotHeadersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, pivotHeaders_);
        onChanged();
      } else {
        pivotHeadersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Summarizes the columns and rows created by a pivot. Each pivot in the
     * request produces one header in the response. If we have a request like
     * this:
     *     "pivots": [{
     *       "fieldNames": ["country",
     *         "city"]
     *     },
     *     {
     *       "fieldNames": "eventName"
     *     }]
     * We will have the following `pivotHeaders` in the response:
     *     "pivotHeaders" : [{
     *       "dimensionHeaders": [{
     *         "dimensionValues": [
     *            { "value": "United Kingdom" },
     *            { "value": "London" }
     *          ]
     *       },
     *       {
     *         "dimensionValues": [
     *         { "value": "Japan" },
     *         { "value": "Osaka" }
     *         ]
     *       }]
     *     },
     *     {
     *       "dimensionHeaders": [{
     *         "dimensionValues": [{ "value": "session_start" }]
     *       },
     *       {
     *         "dimensionValues": [{ "value": "scroll" }]
     *       }]
     *     }]
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.PivotHeader pivot_headers = 1;</code>
     */
    public Builder clearPivotHeaders() {
      if (pivotHeadersBuilder_ == null) {
        pivotHeaders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        pivotHeadersBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Summarizes the columns and rows created by a pivot. Each pivot in the
     * request produces one header in the response. If we have a request like
     * this:
     *     "pivots": [{
     *       "fieldNames": ["country",
     *         "city"]
     *     },
     *     {
     *       "fieldNames": "eventName"
     *     }]
     * We will have the following `pivotHeaders` in the response:
     *     "pivotHeaders" : [{
     *       "dimensionHeaders": [{
     *         "dimensionValues": [
     *            { "value": "United Kingdom" },
     *            { "value": "London" }
     *          ]
     *       },
     *       {
     *         "dimensionValues": [
     *         { "value": "Japan" },
     *         { "value": "Osaka" }
     *         ]
     *       }]
     *     },
     *     {
     *       "dimensionHeaders": [{
     *         "dimensionValues": [{ "value": "session_start" }]
     *       },
     *       {
     *         "dimensionValues": [{ "value": "scroll" }]
     *       }]
     *     }]
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.PivotHeader pivot_headers = 1;</code>
     */
    public Builder removePivotHeaders(int index) {
      if (pivotHeadersBuilder_ == null) {
        ensurePivotHeadersIsMutable();
        pivotHeaders_.remove(index);
        onChanged();
      } else {
        pivotHeadersBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Summarizes the columns and rows created by a pivot. Each pivot in the
     * request produces one header in the response. If we have a request like
     * this:
     *     "pivots": [{
     *       "fieldNames": ["country",
     *         "city"]
     *     },
     *     {
     *       "fieldNames": "eventName"
     *     }]
     * We will have the following `pivotHeaders` in the response:
     *     "pivotHeaders" : [{
     *       "dimensionHeaders": [{
     *         "dimensionValues": [
     *            { "value": "United Kingdom" },
     *            { "value": "London" }
     *          ]
     *       },
     *       {
     *         "dimensionValues": [
     *         { "value": "Japan" },
     *         { "value": "Osaka" }
     *         ]
     *       }]
     *     },
     *     {
     *       "dimensionHeaders": [{
     *         "dimensionValues": [{ "value": "session_start" }]
     *       },
     *       {
     *         "dimensionValues": [{ "value": "scroll" }]
     *       }]
     *     }]
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.PivotHeader pivot_headers = 1;</code>
     */
    public com.google.analytics.data.v1alpha.PivotHeader.Builder getPivotHeadersBuilder(int index) {
      return getPivotHeadersFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Summarizes the columns and rows created by a pivot. Each pivot in the
     * request produces one header in the response. If we have a request like
     * this:
     *     "pivots": [{
     *       "fieldNames": ["country",
     *         "city"]
     *     },
     *     {
     *       "fieldNames": "eventName"
     *     }]
     * We will have the following `pivotHeaders` in the response:
     *     "pivotHeaders" : [{
     *       "dimensionHeaders": [{
     *         "dimensionValues": [
     *            { "value": "United Kingdom" },
     *            { "value": "London" }
     *          ]
     *       },
     *       {
     *         "dimensionValues": [
     *         { "value": "Japan" },
     *         { "value": "Osaka" }
     *         ]
     *       }]
     *     },
     *     {
     *       "dimensionHeaders": [{
     *         "dimensionValues": [{ "value": "session_start" }]
     *       },
     *       {
     *         "dimensionValues": [{ "value": "scroll" }]
     *       }]
     *     }]
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.PivotHeader pivot_headers = 1;</code>
     */
    public com.google.analytics.data.v1alpha.PivotHeaderOrBuilder getPivotHeadersOrBuilder(
        int index) {
      if (pivotHeadersBuilder_ == null) {
        return pivotHeaders_.get(index);
      } else {
        return pivotHeadersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Summarizes the columns and rows created by a pivot. Each pivot in the
     * request produces one header in the response. If we have a request like
     * this:
     *     "pivots": [{
     *       "fieldNames": ["country",
     *         "city"]
     *     },
     *     {
     *       "fieldNames": "eventName"
     *     }]
     * We will have the following `pivotHeaders` in the response:
     *     "pivotHeaders" : [{
     *       "dimensionHeaders": [{
     *         "dimensionValues": [
     *            { "value": "United Kingdom" },
     *            { "value": "London" }
     *          ]
     *       },
     *       {
     *         "dimensionValues": [
     *         { "value": "Japan" },
     *         { "value": "Osaka" }
     *         ]
     *       }]
     *     },
     *     {
     *       "dimensionHeaders": [{
     *         "dimensionValues": [{ "value": "session_start" }]
     *       },
     *       {
     *         "dimensionValues": [{ "value": "scroll" }]
     *       }]
     *     }]
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.PivotHeader pivot_headers = 1;</code>
     */
    public java.util.List<? extends com.google.analytics.data.v1alpha.PivotHeaderOrBuilder>
        getPivotHeadersOrBuilderList() {
      if (pivotHeadersBuilder_ != null) {
        return pivotHeadersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(pivotHeaders_);
      }
    }
    /**
     *
     *
     * <pre>
     * Summarizes the columns and rows created by a pivot. Each pivot in the
     * request produces one header in the response. If we have a request like
     * this:
     *     "pivots": [{
     *       "fieldNames": ["country",
     *         "city"]
     *     },
     *     {
     *       "fieldNames": "eventName"
     *     }]
     * We will have the following `pivotHeaders` in the response:
     *     "pivotHeaders" : [{
     *       "dimensionHeaders": [{
     *         "dimensionValues": [
     *            { "value": "United Kingdom" },
     *            { "value": "London" }
     *          ]
     *       },
     *       {
     *         "dimensionValues": [
     *         { "value": "Japan" },
     *         { "value": "Osaka" }
     *         ]
     *       }]
     *     },
     *     {
     *       "dimensionHeaders": [{
     *         "dimensionValues": [{ "value": "session_start" }]
     *       },
     *       {
     *         "dimensionValues": [{ "value": "scroll" }]
     *       }]
     *     }]
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.PivotHeader pivot_headers = 1;</code>
     */
    public com.google.analytics.data.v1alpha.PivotHeader.Builder addPivotHeadersBuilder() {
      return getPivotHeadersFieldBuilder()
          .addBuilder(com.google.analytics.data.v1alpha.PivotHeader.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Summarizes the columns and rows created by a pivot. Each pivot in the
     * request produces one header in the response. If we have a request like
     * this:
     *     "pivots": [{
     *       "fieldNames": ["country",
     *         "city"]
     *     },
     *     {
     *       "fieldNames": "eventName"
     *     }]
     * We will have the following `pivotHeaders` in the response:
     *     "pivotHeaders" : [{
     *       "dimensionHeaders": [{
     *         "dimensionValues": [
     *            { "value": "United Kingdom" },
     *            { "value": "London" }
     *          ]
     *       },
     *       {
     *         "dimensionValues": [
     *         { "value": "Japan" },
     *         { "value": "Osaka" }
     *         ]
     *       }]
     *     },
     *     {
     *       "dimensionHeaders": [{
     *         "dimensionValues": [{ "value": "session_start" }]
     *       },
     *       {
     *         "dimensionValues": [{ "value": "scroll" }]
     *       }]
     *     }]
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.PivotHeader pivot_headers = 1;</code>
     */
    public com.google.analytics.data.v1alpha.PivotHeader.Builder addPivotHeadersBuilder(int index) {
      return getPivotHeadersFieldBuilder()
          .addBuilder(index, com.google.analytics.data.v1alpha.PivotHeader.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Summarizes the columns and rows created by a pivot. Each pivot in the
     * request produces one header in the response. If we have a request like
     * this:
     *     "pivots": [{
     *       "fieldNames": ["country",
     *         "city"]
     *     },
     *     {
     *       "fieldNames": "eventName"
     *     }]
     * We will have the following `pivotHeaders` in the response:
     *     "pivotHeaders" : [{
     *       "dimensionHeaders": [{
     *         "dimensionValues": [
     *            { "value": "United Kingdom" },
     *            { "value": "London" }
     *          ]
     *       },
     *       {
     *         "dimensionValues": [
     *         { "value": "Japan" },
     *         { "value": "Osaka" }
     *         ]
     *       }]
     *     },
     *     {
     *       "dimensionHeaders": [{
     *         "dimensionValues": [{ "value": "session_start" }]
     *       },
     *       {
     *         "dimensionValues": [{ "value": "scroll" }]
     *       }]
     *     }]
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.PivotHeader pivot_headers = 1;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.PivotHeader.Builder>
        getPivotHeadersBuilderList() {
      return getPivotHeadersFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.PivotHeader,
            com.google.analytics.data.v1alpha.PivotHeader.Builder,
            com.google.analytics.data.v1alpha.PivotHeaderOrBuilder>
        getPivotHeadersFieldBuilder() {
      if (pivotHeadersBuilder_ == null) {
        pivotHeadersBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.data.v1alpha.PivotHeader,
                com.google.analytics.data.v1alpha.PivotHeader.Builder,
                com.google.analytics.data.v1alpha.PivotHeaderOrBuilder>(
                pivotHeaders_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        pivotHeaders_ = null;
      }
      return pivotHeadersBuilder_;
    }

    private java.util.List<com.google.analytics.data.v1alpha.DimensionHeader> dimensionHeaders_ =
        java.util.Collections.emptyList();

    private void ensureDimensionHeadersIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        dimensionHeaders_ =
            new java.util.ArrayList<com.google.analytics.data.v1alpha.DimensionHeader>(
                dimensionHeaders_);
        bitField0_ |= 0x00000002;
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
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 7;</code>
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
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 7;</code>
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
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 7;</code>
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
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 7;</code>
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
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 7;</code>
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
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 7;</code>
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
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 7;</code>
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
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 7;</code>
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
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 7;</code>
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
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 7;</code>
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
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 7;</code>
     */
    public Builder clearDimensionHeaders() {
      if (dimensionHeadersBuilder_ == null) {
        dimensionHeaders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
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
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 7;</code>
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
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 7;</code>
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
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 7;</code>
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
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 7;</code>
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
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 7;</code>
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
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 7;</code>
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
     * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 7;</code>
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
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        dimensionHeaders_ = null;
      }
      return dimensionHeadersBuilder_;
    }

    private java.util.List<com.google.analytics.data.v1alpha.MetricHeader> metricHeaders_ =
        java.util.Collections.emptyList();

    private void ensureMetricHeadersIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        metricHeaders_ =
            new java.util.ArrayList<com.google.analytics.data.v1alpha.MetricHeader>(metricHeaders_);
        bitField0_ |= 0x00000004;
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
        bitField0_ = (bitField0_ & ~0x00000004);
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
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        metricHeaders_ = null;
      }
      return metricHeadersBuilder_;
    }

    private java.util.List<com.google.analytics.data.v1alpha.Row> rows_ =
        java.util.Collections.emptyList();

    private void ensureRowsIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        rows_ = new java.util.ArrayList<com.google.analytics.data.v1alpha.Row>(rows_);
        bitField0_ |= 0x00000008;
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
        bitField0_ = (bitField0_ & ~0x00000008);
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
                rows_, ((bitField0_ & 0x00000008) != 0), getParentForChildren(), isClean());
        rows_ = null;
      }
      return rowsBuilder_;
    }

    private java.util.List<com.google.analytics.data.v1alpha.Row> aggregates_ =
        java.util.Collections.emptyList();

    private void ensureAggregatesIsMutable() {
      if (!((bitField0_ & 0x00000010) != 0)) {
        aggregates_ = new java.util.ArrayList<com.google.analytics.data.v1alpha.Row>(aggregates_);
        bitField0_ |= 0x00000010;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.Row,
            com.google.analytics.data.v1alpha.Row.Builder,
            com.google.analytics.data.v1alpha.RowOrBuilder>
        aggregatesBuilder_;

    /**
     *
     *
     * <pre>
     * Aggregation of metric values. Can be totals, minimums, or maximums. The
     * returned aggregations are controlled by the metric_aggregations in the
     * pivot. The type of aggregation returned in each row is shown by the
     * dimension_values which are set to "RESERVED_&lt;MetricAggregation&gt;".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row aggregates = 4;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.Row> getAggregatesList() {
      if (aggregatesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(aggregates_);
      } else {
        return aggregatesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Aggregation of metric values. Can be totals, minimums, or maximums. The
     * returned aggregations are controlled by the metric_aggregations in the
     * pivot. The type of aggregation returned in each row is shown by the
     * dimension_values which are set to "RESERVED_&lt;MetricAggregation&gt;".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row aggregates = 4;</code>
     */
    public int getAggregatesCount() {
      if (aggregatesBuilder_ == null) {
        return aggregates_.size();
      } else {
        return aggregatesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Aggregation of metric values. Can be totals, minimums, or maximums. The
     * returned aggregations are controlled by the metric_aggregations in the
     * pivot. The type of aggregation returned in each row is shown by the
     * dimension_values which are set to "RESERVED_&lt;MetricAggregation&gt;".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row aggregates = 4;</code>
     */
    public com.google.analytics.data.v1alpha.Row getAggregates(int index) {
      if (aggregatesBuilder_ == null) {
        return aggregates_.get(index);
      } else {
        return aggregatesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Aggregation of metric values. Can be totals, minimums, or maximums. The
     * returned aggregations are controlled by the metric_aggregations in the
     * pivot. The type of aggregation returned in each row is shown by the
     * dimension_values which are set to "RESERVED_&lt;MetricAggregation&gt;".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row aggregates = 4;</code>
     */
    public Builder setAggregates(int index, com.google.analytics.data.v1alpha.Row value) {
      if (aggregatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAggregatesIsMutable();
        aggregates_.set(index, value);
        onChanged();
      } else {
        aggregatesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Aggregation of metric values. Can be totals, minimums, or maximums. The
     * returned aggregations are controlled by the metric_aggregations in the
     * pivot. The type of aggregation returned in each row is shown by the
     * dimension_values which are set to "RESERVED_&lt;MetricAggregation&gt;".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row aggregates = 4;</code>
     */
    public Builder setAggregates(
        int index, com.google.analytics.data.v1alpha.Row.Builder builderForValue) {
      if (aggregatesBuilder_ == null) {
        ensureAggregatesIsMutable();
        aggregates_.set(index, builderForValue.build());
        onChanged();
      } else {
        aggregatesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Aggregation of metric values. Can be totals, minimums, or maximums. The
     * returned aggregations are controlled by the metric_aggregations in the
     * pivot. The type of aggregation returned in each row is shown by the
     * dimension_values which are set to "RESERVED_&lt;MetricAggregation&gt;".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row aggregates = 4;</code>
     */
    public Builder addAggregates(com.google.analytics.data.v1alpha.Row value) {
      if (aggregatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAggregatesIsMutable();
        aggregates_.add(value);
        onChanged();
      } else {
        aggregatesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Aggregation of metric values. Can be totals, minimums, or maximums. The
     * returned aggregations are controlled by the metric_aggregations in the
     * pivot. The type of aggregation returned in each row is shown by the
     * dimension_values which are set to "RESERVED_&lt;MetricAggregation&gt;".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row aggregates = 4;</code>
     */
    public Builder addAggregates(int index, com.google.analytics.data.v1alpha.Row value) {
      if (aggregatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAggregatesIsMutable();
        aggregates_.add(index, value);
        onChanged();
      } else {
        aggregatesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Aggregation of metric values. Can be totals, minimums, or maximums. The
     * returned aggregations are controlled by the metric_aggregations in the
     * pivot. The type of aggregation returned in each row is shown by the
     * dimension_values which are set to "RESERVED_&lt;MetricAggregation&gt;".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row aggregates = 4;</code>
     */
    public Builder addAggregates(com.google.analytics.data.v1alpha.Row.Builder builderForValue) {
      if (aggregatesBuilder_ == null) {
        ensureAggregatesIsMutable();
        aggregates_.add(builderForValue.build());
        onChanged();
      } else {
        aggregatesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Aggregation of metric values. Can be totals, minimums, or maximums. The
     * returned aggregations are controlled by the metric_aggregations in the
     * pivot. The type of aggregation returned in each row is shown by the
     * dimension_values which are set to "RESERVED_&lt;MetricAggregation&gt;".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row aggregates = 4;</code>
     */
    public Builder addAggregates(
        int index, com.google.analytics.data.v1alpha.Row.Builder builderForValue) {
      if (aggregatesBuilder_ == null) {
        ensureAggregatesIsMutable();
        aggregates_.add(index, builderForValue.build());
        onChanged();
      } else {
        aggregatesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Aggregation of metric values. Can be totals, minimums, or maximums. The
     * returned aggregations are controlled by the metric_aggregations in the
     * pivot. The type of aggregation returned in each row is shown by the
     * dimension_values which are set to "RESERVED_&lt;MetricAggregation&gt;".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row aggregates = 4;</code>
     */
    public Builder addAllAggregates(
        java.lang.Iterable<? extends com.google.analytics.data.v1alpha.Row> values) {
      if (aggregatesBuilder_ == null) {
        ensureAggregatesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, aggregates_);
        onChanged();
      } else {
        aggregatesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Aggregation of metric values. Can be totals, minimums, or maximums. The
     * returned aggregations are controlled by the metric_aggregations in the
     * pivot. The type of aggregation returned in each row is shown by the
     * dimension_values which are set to "RESERVED_&lt;MetricAggregation&gt;".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row aggregates = 4;</code>
     */
    public Builder clearAggregates() {
      if (aggregatesBuilder_ == null) {
        aggregates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
      } else {
        aggregatesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Aggregation of metric values. Can be totals, minimums, or maximums. The
     * returned aggregations are controlled by the metric_aggregations in the
     * pivot. The type of aggregation returned in each row is shown by the
     * dimension_values which are set to "RESERVED_&lt;MetricAggregation&gt;".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row aggregates = 4;</code>
     */
    public Builder removeAggregates(int index) {
      if (aggregatesBuilder_ == null) {
        ensureAggregatesIsMutable();
        aggregates_.remove(index);
        onChanged();
      } else {
        aggregatesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Aggregation of metric values. Can be totals, minimums, or maximums. The
     * returned aggregations are controlled by the metric_aggregations in the
     * pivot. The type of aggregation returned in each row is shown by the
     * dimension_values which are set to "RESERVED_&lt;MetricAggregation&gt;".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row aggregates = 4;</code>
     */
    public com.google.analytics.data.v1alpha.Row.Builder getAggregatesBuilder(int index) {
      return getAggregatesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Aggregation of metric values. Can be totals, minimums, or maximums. The
     * returned aggregations are controlled by the metric_aggregations in the
     * pivot. The type of aggregation returned in each row is shown by the
     * dimension_values which are set to "RESERVED_&lt;MetricAggregation&gt;".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row aggregates = 4;</code>
     */
    public com.google.analytics.data.v1alpha.RowOrBuilder getAggregatesOrBuilder(int index) {
      if (aggregatesBuilder_ == null) {
        return aggregates_.get(index);
      } else {
        return aggregatesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Aggregation of metric values. Can be totals, minimums, or maximums. The
     * returned aggregations are controlled by the metric_aggregations in the
     * pivot. The type of aggregation returned in each row is shown by the
     * dimension_values which are set to "RESERVED_&lt;MetricAggregation&gt;".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row aggregates = 4;</code>
     */
    public java.util.List<? extends com.google.analytics.data.v1alpha.RowOrBuilder>
        getAggregatesOrBuilderList() {
      if (aggregatesBuilder_ != null) {
        return aggregatesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(aggregates_);
      }
    }
    /**
     *
     *
     * <pre>
     * Aggregation of metric values. Can be totals, minimums, or maximums. The
     * returned aggregations are controlled by the metric_aggregations in the
     * pivot. The type of aggregation returned in each row is shown by the
     * dimension_values which are set to "RESERVED_&lt;MetricAggregation&gt;".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row aggregates = 4;</code>
     */
    public com.google.analytics.data.v1alpha.Row.Builder addAggregatesBuilder() {
      return getAggregatesFieldBuilder()
          .addBuilder(com.google.analytics.data.v1alpha.Row.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Aggregation of metric values. Can be totals, minimums, or maximums. The
     * returned aggregations are controlled by the metric_aggregations in the
     * pivot. The type of aggregation returned in each row is shown by the
     * dimension_values which are set to "RESERVED_&lt;MetricAggregation&gt;".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row aggregates = 4;</code>
     */
    public com.google.analytics.data.v1alpha.Row.Builder addAggregatesBuilder(int index) {
      return getAggregatesFieldBuilder()
          .addBuilder(index, com.google.analytics.data.v1alpha.Row.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Aggregation of metric values. Can be totals, minimums, or maximums. The
     * returned aggregations are controlled by the metric_aggregations in the
     * pivot. The type of aggregation returned in each row is shown by the
     * dimension_values which are set to "RESERVED_&lt;MetricAggregation&gt;".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Row aggregates = 4;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.Row.Builder>
        getAggregatesBuilderList() {
      return getAggregatesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.Row,
            com.google.analytics.data.v1alpha.Row.Builder,
            com.google.analytics.data.v1alpha.RowOrBuilder>
        getAggregatesFieldBuilder() {
      if (aggregatesBuilder_ == null) {
        aggregatesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.data.v1alpha.Row,
                com.google.analytics.data.v1alpha.Row.Builder,
                com.google.analytics.data.v1alpha.RowOrBuilder>(
                aggregates_, ((bitField0_ & 0x00000010) != 0), getParentForChildren(), isClean());
        aggregates_ = null;
      }
      return aggregatesBuilder_;
    }

    private com.google.analytics.data.v1alpha.ResponseMetaData metadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.ResponseMetaData,
            com.google.analytics.data.v1alpha.ResponseMetaData.Builder,
            com.google.analytics.data.v1alpha.ResponseMetaDataOrBuilder>
        metadataBuilder_;
    /**
     *
     *
     * <pre>
     * Metadata for the report.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.ResponseMetaData metadata = 5;</code>
     *
     * @return Whether the metadata field is set.
     */
    public boolean hasMetadata() {
      return metadataBuilder_ != null || metadata_ != null;
    }
    /**
     *
     *
     * <pre>
     * Metadata for the report.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.ResponseMetaData metadata = 5;</code>
     *
     * @return The metadata.
     */
    public com.google.analytics.data.v1alpha.ResponseMetaData getMetadata() {
      if (metadataBuilder_ == null) {
        return metadata_ == null
            ? com.google.analytics.data.v1alpha.ResponseMetaData.getDefaultInstance()
            : metadata_;
      } else {
        return metadataBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Metadata for the report.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.ResponseMetaData metadata = 5;</code>
     */
    public Builder setMetadata(com.google.analytics.data.v1alpha.ResponseMetaData value) {
      if (metadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadata_ = value;
        onChanged();
      } else {
        metadataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Metadata for the report.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.ResponseMetaData metadata = 5;</code>
     */
    public Builder setMetadata(
        com.google.analytics.data.v1alpha.ResponseMetaData.Builder builderForValue) {
      if (metadataBuilder_ == null) {
        metadata_ = builderForValue.build();
        onChanged();
      } else {
        metadataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Metadata for the report.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.ResponseMetaData metadata = 5;</code>
     */
    public Builder mergeMetadata(com.google.analytics.data.v1alpha.ResponseMetaData value) {
      if (metadataBuilder_ == null) {
        if (metadata_ != null) {
          metadata_ =
              com.google.analytics.data.v1alpha.ResponseMetaData.newBuilder(metadata_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          metadata_ = value;
        }
        onChanged();
      } else {
        metadataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Metadata for the report.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.ResponseMetaData metadata = 5;</code>
     */
    public Builder clearMetadata() {
      if (metadataBuilder_ == null) {
        metadata_ = null;
        onChanged();
      } else {
        metadata_ = null;
        metadataBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Metadata for the report.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.ResponseMetaData metadata = 5;</code>
     */
    public com.google.analytics.data.v1alpha.ResponseMetaData.Builder getMetadataBuilder() {

      onChanged();
      return getMetadataFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Metadata for the report.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.ResponseMetaData metadata = 5;</code>
     */
    public com.google.analytics.data.v1alpha.ResponseMetaDataOrBuilder getMetadataOrBuilder() {
      if (metadataBuilder_ != null) {
        return metadataBuilder_.getMessageOrBuilder();
      } else {
        return metadata_ == null
            ? com.google.analytics.data.v1alpha.ResponseMetaData.getDefaultInstance()
            : metadata_;
      }
    }
    /**
     *
     *
     * <pre>
     * Metadata for the report.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.ResponseMetaData metadata = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.ResponseMetaData,
            com.google.analytics.data.v1alpha.ResponseMetaData.Builder,
            com.google.analytics.data.v1alpha.ResponseMetaDataOrBuilder>
        getMetadataFieldBuilder() {
      if (metadataBuilder_ == null) {
        metadataBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.ResponseMetaData,
                com.google.analytics.data.v1alpha.ResponseMetaData.Builder,
                com.google.analytics.data.v1alpha.ResponseMetaDataOrBuilder>(
                getMetadata(), getParentForChildren(), isClean());
        metadata_ = null;
      }
      return metadataBuilder_;
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
     * This Analytics Property's quota state including this request.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 6;</code>
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
     * This Analytics Property's quota state including this request.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 6;</code>
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
     * This Analytics Property's quota state including this request.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 6;</code>
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
     * This Analytics Property's quota state including this request.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 6;</code>
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
     * This Analytics Property's quota state including this request.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 6;</code>
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
     * This Analytics Property's quota state including this request.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 6;</code>
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
     * This Analytics Property's quota state including this request.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 6;</code>
     */
    public com.google.analytics.data.v1alpha.PropertyQuota.Builder getPropertyQuotaBuilder() {

      onChanged();
      return getPropertyQuotaFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * This Analytics Property's quota state including this request.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 6;</code>
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
     * This Analytics Property's quota state including this request.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 6;</code>
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.RunPivotReportResponse)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.RunPivotReportResponse)
  private static final com.google.analytics.data.v1alpha.RunPivotReportResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.RunPivotReportResponse();
  }

  public static com.google.analytics.data.v1alpha.RunPivotReportResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RunPivotReportResponse> PARSER =
      new com.google.protobuf.AbstractParser<RunPivotReportResponse>() {
        @java.lang.Override
        public RunPivotReportResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new RunPivotReportResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<RunPivotReportResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RunPivotReportResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.RunPivotReportResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
