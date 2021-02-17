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
 * The request to generate a report.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.RunReportRequest}
 */
public final class RunReportRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.RunReportRequest)
    RunReportRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RunReportRequest.newBuilder() to construct.
  private RunReportRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RunReportRequest() {
    dimensions_ = java.util.Collections.emptyList();
    metrics_ = java.util.Collections.emptyList();
    dateRanges_ = java.util.Collections.emptyList();
    metricAggregations_ = java.util.Collections.emptyList();
    orderBys_ = java.util.Collections.emptyList();
    currencyCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RunReportRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private RunReportRequest(
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
              com.google.analytics.data.v1alpha.Entity.Builder subBuilder = null;
              if (entity_ != null) {
                subBuilder = entity_.toBuilder();
              }
              entity_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.Entity.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(entity_);
                entity_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                dimensions_ =
                    new java.util.ArrayList<com.google.analytics.data.v1alpha.Dimension>();
                mutable_bitField0_ |= 0x00000001;
              }
              dimensions_.add(
                  input.readMessage(
                      com.google.analytics.data.v1alpha.Dimension.parser(), extensionRegistry));
              break;
            }
          case 26:
            {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                metrics_ = new java.util.ArrayList<com.google.analytics.data.v1alpha.Metric>();
                mutable_bitField0_ |= 0x00000002;
              }
              metrics_.add(
                  input.readMessage(
                      com.google.analytics.data.v1alpha.Metric.parser(), extensionRegistry));
              break;
            }
          case 34:
            {
              if (!((mutable_bitField0_ & 0x00000004) != 0)) {
                dateRanges_ =
                    new java.util.ArrayList<com.google.analytics.data.v1alpha.DateRange>();
                mutable_bitField0_ |= 0x00000004;
              }
              dateRanges_.add(
                  input.readMessage(
                      com.google.analytics.data.v1alpha.DateRange.parser(), extensionRegistry));
              break;
            }
          case 40:
            {
              offset_ = input.readInt64();
              break;
            }
          case 48:
            {
              limit_ = input.readInt64();
              break;
            }
          case 56:
            {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000008) != 0)) {
                metricAggregations_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000008;
              }
              metricAggregations_.add(rawValue);
              break;
            }
          case 58:
            {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while (input.getBytesUntilLimit() > 0) {
                int rawValue = input.readEnum();
                if (!((mutable_bitField0_ & 0x00000008) != 0)) {
                  metricAggregations_ = new java.util.ArrayList<java.lang.Integer>();
                  mutable_bitField0_ |= 0x00000008;
                }
                metricAggregations_.add(rawValue);
              }
              input.popLimit(oldLimit);
              break;
            }
          case 66:
            {
              com.google.analytics.data.v1alpha.FilterExpression.Builder subBuilder = null;
              if (dimensionFilter_ != null) {
                subBuilder = dimensionFilter_.toBuilder();
              }
              dimensionFilter_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.FilterExpression.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(dimensionFilter_);
                dimensionFilter_ = subBuilder.buildPartial();
              }

              break;
            }
          case 74:
            {
              com.google.analytics.data.v1alpha.FilterExpression.Builder subBuilder = null;
              if (metricFilter_ != null) {
                subBuilder = metricFilter_.toBuilder();
              }
              metricFilter_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.FilterExpression.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(metricFilter_);
                metricFilter_ = subBuilder.buildPartial();
              }

              break;
            }
          case 82:
            {
              if (!((mutable_bitField0_ & 0x00000010) != 0)) {
                orderBys_ = new java.util.ArrayList<com.google.analytics.data.v1alpha.OrderBy>();
                mutable_bitField0_ |= 0x00000010;
              }
              orderBys_.add(
                  input.readMessage(
                      com.google.analytics.data.v1alpha.OrderBy.parser(), extensionRegistry));
              break;
            }
          case 90:
            {
              java.lang.String s = input.readStringRequireUtf8();

              currencyCode_ = s;
              break;
            }
          case 98:
            {
              com.google.analytics.data.v1alpha.CohortSpec.Builder subBuilder = null;
              if (cohortSpec_ != null) {
                subBuilder = cohortSpec_.toBuilder();
              }
              cohortSpec_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.CohortSpec.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(cohortSpec_);
                cohortSpec_ = subBuilder.buildPartial();
              }

              break;
            }
          case 104:
            {
              keepEmptyRows_ = input.readBool();
              break;
            }
          case 112:
            {
              returnPropertyQuota_ = input.readBool();
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
      if (((mutable_bitField0_ & 0x00000004) != 0)) {
        dateRanges_ = java.util.Collections.unmodifiableList(dateRanges_);
      }
      if (((mutable_bitField0_ & 0x00000008) != 0)) {
        metricAggregations_ = java.util.Collections.unmodifiableList(metricAggregations_);
      }
      if (((mutable_bitField0_ & 0x00000010) != 0)) {
        orderBys_ = java.util.Collections.unmodifiableList(orderBys_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
        .internal_static_google_analytics_data_v1alpha_RunReportRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
        .internal_static_google_analytics_data_v1alpha_RunReportRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.RunReportRequest.class,
            com.google.analytics.data.v1alpha.RunReportRequest.Builder.class);
  }

  public static final int ENTITY_FIELD_NUMBER = 1;
  private com.google.analytics.data.v1alpha.Entity entity_;
  /**
   *
   *
   * <pre>
   * A property whose events are tracked. Within a batch request, this entity
   * should either be unspecified or consistent with the batch-level entity.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Entity entity = 1;</code>
   *
   * @return Whether the entity field is set.
   */
  @java.lang.Override
  public boolean hasEntity() {
    return entity_ != null;
  }
  /**
   *
   *
   * <pre>
   * A property whose events are tracked. Within a batch request, this entity
   * should either be unspecified or consistent with the batch-level entity.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Entity entity = 1;</code>
   *
   * @return The entity.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.Entity getEntity() {
    return entity_ == null
        ? com.google.analytics.data.v1alpha.Entity.getDefaultInstance()
        : entity_;
  }
  /**
   *
   *
   * <pre>
   * A property whose events are tracked. Within a batch request, this entity
   * should either be unspecified or consistent with the batch-level entity.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Entity entity = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.EntityOrBuilder getEntityOrBuilder() {
    return getEntity();
  }

  public static final int DIMENSIONS_FIELD_NUMBER = 2;
  private java.util.List<com.google.analytics.data.v1alpha.Dimension> dimensions_;
  /**
   *
   *
   * <pre>
   * The dimensions requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Dimension dimensions = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1alpha.Dimension> getDimensionsList() {
    return dimensions_;
  }
  /**
   *
   *
   * <pre>
   * The dimensions requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Dimension dimensions = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.data.v1alpha.DimensionOrBuilder>
      getDimensionsOrBuilderList() {
    return dimensions_;
  }
  /**
   *
   *
   * <pre>
   * The dimensions requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Dimension dimensions = 2;</code>
   */
  @java.lang.Override
  public int getDimensionsCount() {
    return dimensions_.size();
  }
  /**
   *
   *
   * <pre>
   * The dimensions requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Dimension dimensions = 2;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.Dimension getDimensions(int index) {
    return dimensions_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The dimensions requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Dimension dimensions = 2;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.DimensionOrBuilder getDimensionsOrBuilder(int index) {
    return dimensions_.get(index);
  }

  public static final int METRICS_FIELD_NUMBER = 3;
  private java.util.List<com.google.analytics.data.v1alpha.Metric> metrics_;
  /**
   *
   *
   * <pre>
   * The metrics requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Metric metrics = 3;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1alpha.Metric> getMetricsList() {
    return metrics_;
  }
  /**
   *
   *
   * <pre>
   * The metrics requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Metric metrics = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.data.v1alpha.MetricOrBuilder>
      getMetricsOrBuilderList() {
    return metrics_;
  }
  /**
   *
   *
   * <pre>
   * The metrics requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Metric metrics = 3;</code>
   */
  @java.lang.Override
  public int getMetricsCount() {
    return metrics_.size();
  }
  /**
   *
   *
   * <pre>
   * The metrics requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Metric metrics = 3;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.Metric getMetrics(int index) {
    return metrics_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The metrics requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Metric metrics = 3;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.MetricOrBuilder getMetricsOrBuilder(int index) {
    return metrics_.get(index);
  }

  public static final int DATE_RANGES_FIELD_NUMBER = 4;
  private java.util.List<com.google.analytics.data.v1alpha.DateRange> dateRanges_;
  /**
   *
   *
   * <pre>
   * Date ranges of data to read. If multiple date ranges are requested, each
   * response row will contain a zero based date range index. If two date
   * ranges overlap, the event data for the overlapping days is included in the
   * response rows for both date ranges. In a cohort request, this `dateRanges`
   * must be unspecified.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 4;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1alpha.DateRange> getDateRangesList() {
    return dateRanges_;
  }
  /**
   *
   *
   * <pre>
   * Date ranges of data to read. If multiple date ranges are requested, each
   * response row will contain a zero based date range index. If two date
   * ranges overlap, the event data for the overlapping days is included in the
   * response rows for both date ranges. In a cohort request, this `dateRanges`
   * must be unspecified.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 4;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.data.v1alpha.DateRangeOrBuilder>
      getDateRangesOrBuilderList() {
    return dateRanges_;
  }
  /**
   *
   *
   * <pre>
   * Date ranges of data to read. If multiple date ranges are requested, each
   * response row will contain a zero based date range index. If two date
   * ranges overlap, the event data for the overlapping days is included in the
   * response rows for both date ranges. In a cohort request, this `dateRanges`
   * must be unspecified.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 4;</code>
   */
  @java.lang.Override
  public int getDateRangesCount() {
    return dateRanges_.size();
  }
  /**
   *
   *
   * <pre>
   * Date ranges of data to read. If multiple date ranges are requested, each
   * response row will contain a zero based date range index. If two date
   * ranges overlap, the event data for the overlapping days is included in the
   * response rows for both date ranges. In a cohort request, this `dateRanges`
   * must be unspecified.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 4;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.DateRange getDateRanges(int index) {
    return dateRanges_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Date ranges of data to read. If multiple date ranges are requested, each
   * response row will contain a zero based date range index. If two date
   * ranges overlap, the event data for the overlapping days is included in the
   * response rows for both date ranges. In a cohort request, this `dateRanges`
   * must be unspecified.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 4;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.DateRangeOrBuilder getDateRangesOrBuilder(int index) {
    return dateRanges_.get(index);
  }

  public static final int OFFSET_FIELD_NUMBER = 5;
  private long offset_;
  /**
   *
   *
   * <pre>
   * The row count of the start row. The first row is counted as row 0.
   * To learn more about this pagination parameter, see
   * [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
   * </pre>
   *
   * <code>int64 offset = 5;</code>
   *
   * @return The offset.
   */
  @java.lang.Override
  public long getOffset() {
    return offset_;
  }

  public static final int LIMIT_FIELD_NUMBER = 6;
  private long limit_;
  /**
   *
   *
   * <pre>
   * The number of rows to return. If unspecified, 10 rows are returned. If
   * -1, all rows are returned.
   * To learn more about this pagination parameter, see
   * [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
   * </pre>
   *
   * <code>int64 limit = 6;</code>
   *
   * @return The limit.
   */
  @java.lang.Override
  public long getLimit() {
    return limit_;
  }

  public static final int METRIC_AGGREGATIONS_FIELD_NUMBER = 7;
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
   * Aggregation of metrics. Aggregated metric values will be shown in rows
   * where the dimension_values are set to "RESERVED_(MetricAggregation)".
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 7;</code>
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
   * Aggregation of metrics. Aggregated metric values will be shown in rows
   * where the dimension_values are set to "RESERVED_(MetricAggregation)".
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 7;</code>
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
   * Aggregation of metrics. Aggregated metric values will be shown in rows
   * where the dimension_values are set to "RESERVED_(MetricAggregation)".
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 7;</code>
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
   * Aggregation of metrics. Aggregated metric values will be shown in rows
   * where the dimension_values are set to "RESERVED_(MetricAggregation)".
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 7;</code>
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
   * Aggregation of metrics. Aggregated metric values will be shown in rows
   * where the dimension_values are set to "RESERVED_(MetricAggregation)".
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 7;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of metricAggregations at the given index.
   */
  @java.lang.Override
  public int getMetricAggregationsValue(int index) {
    return metricAggregations_.get(index);
  }

  private int metricAggregationsMemoizedSerializedSize;

  public static final int DIMENSION_FILTER_FIELD_NUMBER = 8;
  private com.google.analytics.data.v1alpha.FilterExpression dimensionFilter_;
  /**
   *
   *
   * <pre>
   * The filter clause of dimensions. Dimensions must be requested to be used in
   * this filter. Metrics cannot be used in this filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpression dimension_filter = 8;</code>
   *
   * @return Whether the dimensionFilter field is set.
   */
  @java.lang.Override
  public boolean hasDimensionFilter() {
    return dimensionFilter_ != null;
  }
  /**
   *
   *
   * <pre>
   * The filter clause of dimensions. Dimensions must be requested to be used in
   * this filter. Metrics cannot be used in this filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpression dimension_filter = 8;</code>
   *
   * @return The dimensionFilter.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.FilterExpression getDimensionFilter() {
    return dimensionFilter_ == null
        ? com.google.analytics.data.v1alpha.FilterExpression.getDefaultInstance()
        : dimensionFilter_;
  }
  /**
   *
   *
   * <pre>
   * The filter clause of dimensions. Dimensions must be requested to be used in
   * this filter. Metrics cannot be used in this filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpression dimension_filter = 8;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.FilterExpressionOrBuilder getDimensionFilterOrBuilder() {
    return getDimensionFilter();
  }

  public static final int METRIC_FILTER_FIELD_NUMBER = 9;
  private com.google.analytics.data.v1alpha.FilterExpression metricFilter_;
  /**
   *
   *
   * <pre>
   * The filter clause of metrics. Applied at post aggregation phase, similar to
   * SQL having-clause. Metrics must be requested to be used in this filter.
   * Dimensions cannot be used in this filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpression metric_filter = 9;</code>
   *
   * @return Whether the metricFilter field is set.
   */
  @java.lang.Override
  public boolean hasMetricFilter() {
    return metricFilter_ != null;
  }
  /**
   *
   *
   * <pre>
   * The filter clause of metrics. Applied at post aggregation phase, similar to
   * SQL having-clause. Metrics must be requested to be used in this filter.
   * Dimensions cannot be used in this filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpression metric_filter = 9;</code>
   *
   * @return The metricFilter.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.FilterExpression getMetricFilter() {
    return metricFilter_ == null
        ? com.google.analytics.data.v1alpha.FilterExpression.getDefaultInstance()
        : metricFilter_;
  }
  /**
   *
   *
   * <pre>
   * The filter clause of metrics. Applied at post aggregation phase, similar to
   * SQL having-clause. Metrics must be requested to be used in this filter.
   * Dimensions cannot be used in this filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpression metric_filter = 9;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.FilterExpressionOrBuilder getMetricFilterOrBuilder() {
    return getMetricFilter();
  }

  public static final int ORDER_BYS_FIELD_NUMBER = 10;
  private java.util.List<com.google.analytics.data.v1alpha.OrderBy> orderBys_;
  /**
   *
   *
   * <pre>
   * Specifies how rows are ordered in the response.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 10;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1alpha.OrderBy> getOrderBysList() {
    return orderBys_;
  }
  /**
   *
   *
   * <pre>
   * Specifies how rows are ordered in the response.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 10;</code>
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
   * Specifies how rows are ordered in the response.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 10;</code>
   */
  @java.lang.Override
  public int getOrderBysCount() {
    return orderBys_.size();
  }
  /**
   *
   *
   * <pre>
   * Specifies how rows are ordered in the response.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 10;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.OrderBy getOrderBys(int index) {
    return orderBys_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Specifies how rows are ordered in the response.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 10;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.OrderByOrBuilder getOrderBysOrBuilder(int index) {
    return orderBys_.get(index);
  }

  public static final int CURRENCY_CODE_FIELD_NUMBER = 11;
  private volatile java.lang.Object currencyCode_;
  /**
   *
   *
   * <pre>
   * A currency code in ISO4217 format, such as "AED", "USD", "JPY".
   * If the field is empty, the report uses the entity's default currency.
   * </pre>
   *
   * <code>string currency_code = 11;</code>
   *
   * @return The currencyCode.
   */
  @java.lang.Override
  public java.lang.String getCurrencyCode() {
    java.lang.Object ref = currencyCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      currencyCode_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A currency code in ISO4217 format, such as "AED", "USD", "JPY".
   * If the field is empty, the report uses the entity's default currency.
   * </pre>
   *
   * <code>string currency_code = 11;</code>
   *
   * @return The bytes for currencyCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCurrencyCodeBytes() {
    java.lang.Object ref = currencyCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      currencyCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COHORT_SPEC_FIELD_NUMBER = 12;
  private com.google.analytics.data.v1alpha.CohortSpec cohortSpec_;
  /**
   *
   *
   * <pre>
   * Cohort group associated with this request. If there is a cohort group
   * in the request the 'cohort' dimension must be present.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.CohortSpec cohort_spec = 12;</code>
   *
   * @return Whether the cohortSpec field is set.
   */
  @java.lang.Override
  public boolean hasCohortSpec() {
    return cohortSpec_ != null;
  }
  /**
   *
   *
   * <pre>
   * Cohort group associated with this request. If there is a cohort group
   * in the request the 'cohort' dimension must be present.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.CohortSpec cohort_spec = 12;</code>
   *
   * @return The cohortSpec.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.CohortSpec getCohortSpec() {
    return cohortSpec_ == null
        ? com.google.analytics.data.v1alpha.CohortSpec.getDefaultInstance()
        : cohortSpec_;
  }
  /**
   *
   *
   * <pre>
   * Cohort group associated with this request. If there is a cohort group
   * in the request the 'cohort' dimension must be present.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.CohortSpec cohort_spec = 12;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.CohortSpecOrBuilder getCohortSpecOrBuilder() {
    return getCohortSpec();
  }

  public static final int KEEP_EMPTY_ROWS_FIELD_NUMBER = 13;
  private boolean keepEmptyRows_;
  /**
   *
   *
   * <pre>
   * If false or unspecified, each row with all metrics equal to 0 will not be
   * returned. If true, these rows will be returned if they are not separately
   * removed by a filter.
   * </pre>
   *
   * <code>bool keep_empty_rows = 13;</code>
   *
   * @return The keepEmptyRows.
   */
  @java.lang.Override
  public boolean getKeepEmptyRows() {
    return keepEmptyRows_;
  }

  public static final int RETURN_PROPERTY_QUOTA_FIELD_NUMBER = 14;
  private boolean returnPropertyQuota_;
  /**
   *
   *
   * <pre>
   * Toggles whether to return the current state of this Analytics Property's
   * quota. Quota is returned in [PropertyQuota](#PropertyQuota).
   * </pre>
   *
   * <code>bool return_property_quota = 14;</code>
   *
   * @return The returnPropertyQuota.
   */
  @java.lang.Override
  public boolean getReturnPropertyQuota() {
    return returnPropertyQuota_;
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
    getSerializedSize();
    if (entity_ != null) {
      output.writeMessage(1, getEntity());
    }
    for (int i = 0; i < dimensions_.size(); i++) {
      output.writeMessage(2, dimensions_.get(i));
    }
    for (int i = 0; i < metrics_.size(); i++) {
      output.writeMessage(3, metrics_.get(i));
    }
    for (int i = 0; i < dateRanges_.size(); i++) {
      output.writeMessage(4, dateRanges_.get(i));
    }
    if (offset_ != 0L) {
      output.writeInt64(5, offset_);
    }
    if (limit_ != 0L) {
      output.writeInt64(6, limit_);
    }
    if (getMetricAggregationsList().size() > 0) {
      output.writeUInt32NoTag(58);
      output.writeUInt32NoTag(metricAggregationsMemoizedSerializedSize);
    }
    for (int i = 0; i < metricAggregations_.size(); i++) {
      output.writeEnumNoTag(metricAggregations_.get(i));
    }
    if (dimensionFilter_ != null) {
      output.writeMessage(8, getDimensionFilter());
    }
    if (metricFilter_ != null) {
      output.writeMessage(9, getMetricFilter());
    }
    for (int i = 0; i < orderBys_.size(); i++) {
      output.writeMessage(10, orderBys_.get(i));
    }
    if (!getCurrencyCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 11, currencyCode_);
    }
    if (cohortSpec_ != null) {
      output.writeMessage(12, getCohortSpec());
    }
    if (keepEmptyRows_ != false) {
      output.writeBool(13, keepEmptyRows_);
    }
    if (returnPropertyQuota_ != false) {
      output.writeBool(14, returnPropertyQuota_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (entity_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getEntity());
    }
    for (int i = 0; i < dimensions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, dimensions_.get(i));
    }
    for (int i = 0; i < metrics_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, metrics_.get(i));
    }
    for (int i = 0; i < dateRanges_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, dateRanges_.get(i));
    }
    if (offset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(5, offset_);
    }
    if (limit_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(6, limit_);
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
    if (dimensionFilter_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(8, getDimensionFilter());
    }
    if (metricFilter_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(9, getMetricFilter());
    }
    for (int i = 0; i < orderBys_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(10, orderBys_.get(i));
    }
    if (!getCurrencyCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, currencyCode_);
    }
    if (cohortSpec_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(12, getCohortSpec());
    }
    if (keepEmptyRows_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(13, keepEmptyRows_);
    }
    if (returnPropertyQuota_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(14, returnPropertyQuota_);
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.RunReportRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.RunReportRequest other =
        (com.google.analytics.data.v1alpha.RunReportRequest) obj;

    if (hasEntity() != other.hasEntity()) return false;
    if (hasEntity()) {
      if (!getEntity().equals(other.getEntity())) return false;
    }
    if (!getDimensionsList().equals(other.getDimensionsList())) return false;
    if (!getMetricsList().equals(other.getMetricsList())) return false;
    if (!getDateRangesList().equals(other.getDateRangesList())) return false;
    if (getOffset() != other.getOffset()) return false;
    if (getLimit() != other.getLimit()) return false;
    if (!metricAggregations_.equals(other.metricAggregations_)) return false;
    if (hasDimensionFilter() != other.hasDimensionFilter()) return false;
    if (hasDimensionFilter()) {
      if (!getDimensionFilter().equals(other.getDimensionFilter())) return false;
    }
    if (hasMetricFilter() != other.hasMetricFilter()) return false;
    if (hasMetricFilter()) {
      if (!getMetricFilter().equals(other.getMetricFilter())) return false;
    }
    if (!getOrderBysList().equals(other.getOrderBysList())) return false;
    if (!getCurrencyCode().equals(other.getCurrencyCode())) return false;
    if (hasCohortSpec() != other.hasCohortSpec()) return false;
    if (hasCohortSpec()) {
      if (!getCohortSpec().equals(other.getCohortSpec())) return false;
    }
    if (getKeepEmptyRows() != other.getKeepEmptyRows()) return false;
    if (getReturnPropertyQuota() != other.getReturnPropertyQuota()) return false;
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
    if (hasEntity()) {
      hash = (37 * hash) + ENTITY_FIELD_NUMBER;
      hash = (53 * hash) + getEntity().hashCode();
    }
    if (getDimensionsCount() > 0) {
      hash = (37 * hash) + DIMENSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getDimensionsList().hashCode();
    }
    if (getMetricsCount() > 0) {
      hash = (37 * hash) + METRICS_FIELD_NUMBER;
      hash = (53 * hash) + getMetricsList().hashCode();
    }
    if (getDateRangesCount() > 0) {
      hash = (37 * hash) + DATE_RANGES_FIELD_NUMBER;
      hash = (53 * hash) + getDateRangesList().hashCode();
    }
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getOffset());
    hash = (37 * hash) + LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getLimit());
    if (getMetricAggregationsCount() > 0) {
      hash = (37 * hash) + METRIC_AGGREGATIONS_FIELD_NUMBER;
      hash = (53 * hash) + metricAggregations_.hashCode();
    }
    if (hasDimensionFilter()) {
      hash = (37 * hash) + DIMENSION_FILTER_FIELD_NUMBER;
      hash = (53 * hash) + getDimensionFilter().hashCode();
    }
    if (hasMetricFilter()) {
      hash = (37 * hash) + METRIC_FILTER_FIELD_NUMBER;
      hash = (53 * hash) + getMetricFilter().hashCode();
    }
    if (getOrderBysCount() > 0) {
      hash = (37 * hash) + ORDER_BYS_FIELD_NUMBER;
      hash = (53 * hash) + getOrderBysList().hashCode();
    }
    hash = (37 * hash) + CURRENCY_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCurrencyCode().hashCode();
    if (hasCohortSpec()) {
      hash = (37 * hash) + COHORT_SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getCohortSpec().hashCode();
    }
    hash = (37 * hash) + KEEP_EMPTY_ROWS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getKeepEmptyRows());
    hash = (37 * hash) + RETURN_PROPERTY_QUOTA_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getReturnPropertyQuota());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.RunReportRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.RunReportRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.RunReportRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.RunReportRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.RunReportRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.RunReportRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.RunReportRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.RunReportRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.RunReportRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.RunReportRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.RunReportRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.RunReportRequest parseFrom(
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

  public static Builder newBuilder(com.google.analytics.data.v1alpha.RunReportRequest prototype) {
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
   * The request to generate a report.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.RunReportRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.RunReportRequest)
      com.google.analytics.data.v1alpha.RunReportRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_RunReportRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_RunReportRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.RunReportRequest.class,
              com.google.analytics.data.v1alpha.RunReportRequest.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.RunReportRequest.newBuilder()
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
        getDateRangesFieldBuilder();
        getOrderBysFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (entityBuilder_ == null) {
        entity_ = null;
      } else {
        entity_ = null;
        entityBuilder_ = null;
      }
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
      if (dateRangesBuilder_ == null) {
        dateRanges_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        dateRangesBuilder_.clear();
      }
      offset_ = 0L;

      limit_ = 0L;

      metricAggregations_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000008);
      if (dimensionFilterBuilder_ == null) {
        dimensionFilter_ = null;
      } else {
        dimensionFilter_ = null;
        dimensionFilterBuilder_ = null;
      }
      if (metricFilterBuilder_ == null) {
        metricFilter_ = null;
      } else {
        metricFilter_ = null;
        metricFilterBuilder_ = null;
      }
      if (orderBysBuilder_ == null) {
        orderBys_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
      } else {
        orderBysBuilder_.clear();
      }
      currencyCode_ = "";

      if (cohortSpecBuilder_ == null) {
        cohortSpec_ = null;
      } else {
        cohortSpec_ = null;
        cohortSpecBuilder_ = null;
      }
      keepEmptyRows_ = false;

      returnPropertyQuota_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_RunReportRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.RunReportRequest getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.RunReportRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.RunReportRequest build() {
      com.google.analytics.data.v1alpha.RunReportRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.RunReportRequest buildPartial() {
      com.google.analytics.data.v1alpha.RunReportRequest result =
          new com.google.analytics.data.v1alpha.RunReportRequest(this);
      int from_bitField0_ = bitField0_;
      if (entityBuilder_ == null) {
        result.entity_ = entity_;
      } else {
        result.entity_ = entityBuilder_.build();
      }
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
      if (dateRangesBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          dateRanges_ = java.util.Collections.unmodifiableList(dateRanges_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.dateRanges_ = dateRanges_;
      } else {
        result.dateRanges_ = dateRangesBuilder_.build();
      }
      result.offset_ = offset_;
      result.limit_ = limit_;
      if (((bitField0_ & 0x00000008) != 0)) {
        metricAggregations_ = java.util.Collections.unmodifiableList(metricAggregations_);
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.metricAggregations_ = metricAggregations_;
      if (dimensionFilterBuilder_ == null) {
        result.dimensionFilter_ = dimensionFilter_;
      } else {
        result.dimensionFilter_ = dimensionFilterBuilder_.build();
      }
      if (metricFilterBuilder_ == null) {
        result.metricFilter_ = metricFilter_;
      } else {
        result.metricFilter_ = metricFilterBuilder_.build();
      }
      if (orderBysBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0)) {
          orderBys_ = java.util.Collections.unmodifiableList(orderBys_);
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.orderBys_ = orderBys_;
      } else {
        result.orderBys_ = orderBysBuilder_.build();
      }
      result.currencyCode_ = currencyCode_;
      if (cohortSpecBuilder_ == null) {
        result.cohortSpec_ = cohortSpec_;
      } else {
        result.cohortSpec_ = cohortSpecBuilder_.build();
      }
      result.keepEmptyRows_ = keepEmptyRows_;
      result.returnPropertyQuota_ = returnPropertyQuota_;
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
      if (other instanceof com.google.analytics.data.v1alpha.RunReportRequest) {
        return mergeFrom((com.google.analytics.data.v1alpha.RunReportRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.RunReportRequest other) {
      if (other == com.google.analytics.data.v1alpha.RunReportRequest.getDefaultInstance())
        return this;
      if (other.hasEntity()) {
        mergeEntity(other.getEntity());
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
      if (dateRangesBuilder_ == null) {
        if (!other.dateRanges_.isEmpty()) {
          if (dateRanges_.isEmpty()) {
            dateRanges_ = other.dateRanges_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureDateRangesIsMutable();
            dateRanges_.addAll(other.dateRanges_);
          }
          onChanged();
        }
      } else {
        if (!other.dateRanges_.isEmpty()) {
          if (dateRangesBuilder_.isEmpty()) {
            dateRangesBuilder_.dispose();
            dateRangesBuilder_ = null;
            dateRanges_ = other.dateRanges_;
            bitField0_ = (bitField0_ & ~0x00000004);
            dateRangesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDateRangesFieldBuilder()
                    : null;
          } else {
            dateRangesBuilder_.addAllMessages(other.dateRanges_);
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
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureMetricAggregationsIsMutable();
          metricAggregations_.addAll(other.metricAggregations_);
        }
        onChanged();
      }
      if (other.hasDimensionFilter()) {
        mergeDimensionFilter(other.getDimensionFilter());
      }
      if (other.hasMetricFilter()) {
        mergeMetricFilter(other.getMetricFilter());
      }
      if (orderBysBuilder_ == null) {
        if (!other.orderBys_.isEmpty()) {
          if (orderBys_.isEmpty()) {
            orderBys_ = other.orderBys_;
            bitField0_ = (bitField0_ & ~0x00000010);
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
            bitField0_ = (bitField0_ & ~0x00000010);
            orderBysBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getOrderBysFieldBuilder()
                    : null;
          } else {
            orderBysBuilder_.addAllMessages(other.orderBys_);
          }
        }
      }
      if (!other.getCurrencyCode().isEmpty()) {
        currencyCode_ = other.currencyCode_;
        onChanged();
      }
      if (other.hasCohortSpec()) {
        mergeCohortSpec(other.getCohortSpec());
      }
      if (other.getKeepEmptyRows() != false) {
        setKeepEmptyRows(other.getKeepEmptyRows());
      }
      if (other.getReturnPropertyQuota() != false) {
        setReturnPropertyQuota(other.getReturnPropertyQuota());
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
      com.google.analytics.data.v1alpha.RunReportRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.data.v1alpha.RunReportRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.analytics.data.v1alpha.Entity entity_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.Entity,
            com.google.analytics.data.v1alpha.Entity.Builder,
            com.google.analytics.data.v1alpha.EntityOrBuilder>
        entityBuilder_;
    /**
     *
     *
     * <pre>
     * A property whose events are tracked. Within a batch request, this entity
     * should either be unspecified or consistent with the batch-level entity.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Entity entity = 1;</code>
     *
     * @return Whether the entity field is set.
     */
    public boolean hasEntity() {
      return entityBuilder_ != null || entity_ != null;
    }
    /**
     *
     *
     * <pre>
     * A property whose events are tracked. Within a batch request, this entity
     * should either be unspecified or consistent with the batch-level entity.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Entity entity = 1;</code>
     *
     * @return The entity.
     */
    public com.google.analytics.data.v1alpha.Entity getEntity() {
      if (entityBuilder_ == null) {
        return entity_ == null
            ? com.google.analytics.data.v1alpha.Entity.getDefaultInstance()
            : entity_;
      } else {
        return entityBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * A property whose events are tracked. Within a batch request, this entity
     * should either be unspecified or consistent with the batch-level entity.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Entity entity = 1;</code>
     */
    public Builder setEntity(com.google.analytics.data.v1alpha.Entity value) {
      if (entityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entity_ = value;
        onChanged();
      } else {
        entityBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A property whose events are tracked. Within a batch request, this entity
     * should either be unspecified or consistent with the batch-level entity.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Entity entity = 1;</code>
     */
    public Builder setEntity(com.google.analytics.data.v1alpha.Entity.Builder builderForValue) {
      if (entityBuilder_ == null) {
        entity_ = builderForValue.build();
        onChanged();
      } else {
        entityBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A property whose events are tracked. Within a batch request, this entity
     * should either be unspecified or consistent with the batch-level entity.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Entity entity = 1;</code>
     */
    public Builder mergeEntity(com.google.analytics.data.v1alpha.Entity value) {
      if (entityBuilder_ == null) {
        if (entity_ != null) {
          entity_ =
              com.google.analytics.data.v1alpha.Entity.newBuilder(entity_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          entity_ = value;
        }
        onChanged();
      } else {
        entityBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A property whose events are tracked. Within a batch request, this entity
     * should either be unspecified or consistent with the batch-level entity.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Entity entity = 1;</code>
     */
    public Builder clearEntity() {
      if (entityBuilder_ == null) {
        entity_ = null;
        onChanged();
      } else {
        entity_ = null;
        entityBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A property whose events are tracked. Within a batch request, this entity
     * should either be unspecified or consistent with the batch-level entity.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Entity entity = 1;</code>
     */
    public com.google.analytics.data.v1alpha.Entity.Builder getEntityBuilder() {

      onChanged();
      return getEntityFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A property whose events are tracked. Within a batch request, this entity
     * should either be unspecified or consistent with the batch-level entity.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Entity entity = 1;</code>
     */
    public com.google.analytics.data.v1alpha.EntityOrBuilder getEntityOrBuilder() {
      if (entityBuilder_ != null) {
        return entityBuilder_.getMessageOrBuilder();
      } else {
        return entity_ == null
            ? com.google.analytics.data.v1alpha.Entity.getDefaultInstance()
            : entity_;
      }
    }
    /**
     *
     *
     * <pre>
     * A property whose events are tracked. Within a batch request, this entity
     * should either be unspecified or consistent with the batch-level entity.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Entity entity = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.Entity,
            com.google.analytics.data.v1alpha.Entity.Builder,
            com.google.analytics.data.v1alpha.EntityOrBuilder>
        getEntityFieldBuilder() {
      if (entityBuilder_ == null) {
        entityBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.Entity,
                com.google.analytics.data.v1alpha.Entity.Builder,
                com.google.analytics.data.v1alpha.EntityOrBuilder>(
                getEntity(), getParentForChildren(), isClean());
        entity_ = null;
      }
      return entityBuilder_;
    }

    private java.util.List<com.google.analytics.data.v1alpha.Dimension> dimensions_ =
        java.util.Collections.emptyList();

    private void ensureDimensionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dimensions_ =
            new java.util.ArrayList<com.google.analytics.data.v1alpha.Dimension>(dimensions_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.Dimension,
            com.google.analytics.data.v1alpha.Dimension.Builder,
            com.google.analytics.data.v1alpha.DimensionOrBuilder>
        dimensionsBuilder_;

    /**
     *
     *
     * <pre>
     * The dimensions requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Dimension dimensions = 2;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.Dimension> getDimensionsList() {
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
     * The dimensions requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Dimension dimensions = 2;</code>
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
     * The dimensions requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Dimension dimensions = 2;</code>
     */
    public com.google.analytics.data.v1alpha.Dimension getDimensions(int index) {
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
     * The dimensions requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Dimension dimensions = 2;</code>
     */
    public Builder setDimensions(int index, com.google.analytics.data.v1alpha.Dimension value) {
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
     * The dimensions requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Dimension dimensions = 2;</code>
     */
    public Builder setDimensions(
        int index, com.google.analytics.data.v1alpha.Dimension.Builder builderForValue) {
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
     * The dimensions requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Dimension dimensions = 2;</code>
     */
    public Builder addDimensions(com.google.analytics.data.v1alpha.Dimension value) {
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
     * The dimensions requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Dimension dimensions = 2;</code>
     */
    public Builder addDimensions(int index, com.google.analytics.data.v1alpha.Dimension value) {
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
     * The dimensions requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Dimension dimensions = 2;</code>
     */
    public Builder addDimensions(
        com.google.analytics.data.v1alpha.Dimension.Builder builderForValue) {
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
     * The dimensions requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Dimension dimensions = 2;</code>
     */
    public Builder addDimensions(
        int index, com.google.analytics.data.v1alpha.Dimension.Builder builderForValue) {
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
     * The dimensions requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Dimension dimensions = 2;</code>
     */
    public Builder addAllDimensions(
        java.lang.Iterable<? extends com.google.analytics.data.v1alpha.Dimension> values) {
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
     * The dimensions requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Dimension dimensions = 2;</code>
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
     * The dimensions requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Dimension dimensions = 2;</code>
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
     * The dimensions requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Dimension dimensions = 2;</code>
     */
    public com.google.analytics.data.v1alpha.Dimension.Builder getDimensionsBuilder(int index) {
      return getDimensionsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The dimensions requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Dimension dimensions = 2;</code>
     */
    public com.google.analytics.data.v1alpha.DimensionOrBuilder getDimensionsOrBuilder(int index) {
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
     * The dimensions requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Dimension dimensions = 2;</code>
     */
    public java.util.List<? extends com.google.analytics.data.v1alpha.DimensionOrBuilder>
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
     * The dimensions requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Dimension dimensions = 2;</code>
     */
    public com.google.analytics.data.v1alpha.Dimension.Builder addDimensionsBuilder() {
      return getDimensionsFieldBuilder()
          .addBuilder(com.google.analytics.data.v1alpha.Dimension.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The dimensions requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Dimension dimensions = 2;</code>
     */
    public com.google.analytics.data.v1alpha.Dimension.Builder addDimensionsBuilder(int index) {
      return getDimensionsFieldBuilder()
          .addBuilder(index, com.google.analytics.data.v1alpha.Dimension.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The dimensions requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Dimension dimensions = 2;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.Dimension.Builder>
        getDimensionsBuilderList() {
      return getDimensionsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.Dimension,
            com.google.analytics.data.v1alpha.Dimension.Builder,
            com.google.analytics.data.v1alpha.DimensionOrBuilder>
        getDimensionsFieldBuilder() {
      if (dimensionsBuilder_ == null) {
        dimensionsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.data.v1alpha.Dimension,
                com.google.analytics.data.v1alpha.Dimension.Builder,
                com.google.analytics.data.v1alpha.DimensionOrBuilder>(
                dimensions_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        dimensions_ = null;
      }
      return dimensionsBuilder_;
    }

    private java.util.List<com.google.analytics.data.v1alpha.Metric> metrics_ =
        java.util.Collections.emptyList();

    private void ensureMetricsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        metrics_ = new java.util.ArrayList<com.google.analytics.data.v1alpha.Metric>(metrics_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.Metric,
            com.google.analytics.data.v1alpha.Metric.Builder,
            com.google.analytics.data.v1alpha.MetricOrBuilder>
        metricsBuilder_;

    /**
     *
     *
     * <pre>
     * The metrics requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Metric metrics = 3;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.Metric> getMetricsList() {
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
     * The metrics requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Metric metrics = 3;</code>
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
     * The metrics requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Metric metrics = 3;</code>
     */
    public com.google.analytics.data.v1alpha.Metric getMetrics(int index) {
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
     * The metrics requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Metric metrics = 3;</code>
     */
    public Builder setMetrics(int index, com.google.analytics.data.v1alpha.Metric value) {
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
     * The metrics requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Metric metrics = 3;</code>
     */
    public Builder setMetrics(
        int index, com.google.analytics.data.v1alpha.Metric.Builder builderForValue) {
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
     * The metrics requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Metric metrics = 3;</code>
     */
    public Builder addMetrics(com.google.analytics.data.v1alpha.Metric value) {
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
     * The metrics requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Metric metrics = 3;</code>
     */
    public Builder addMetrics(int index, com.google.analytics.data.v1alpha.Metric value) {
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
     * The metrics requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Metric metrics = 3;</code>
     */
    public Builder addMetrics(com.google.analytics.data.v1alpha.Metric.Builder builderForValue) {
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
     * The metrics requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Metric metrics = 3;</code>
     */
    public Builder addMetrics(
        int index, com.google.analytics.data.v1alpha.Metric.Builder builderForValue) {
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
     * The metrics requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Metric metrics = 3;</code>
     */
    public Builder addAllMetrics(
        java.lang.Iterable<? extends com.google.analytics.data.v1alpha.Metric> values) {
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
     * The metrics requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Metric metrics = 3;</code>
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
     * The metrics requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Metric metrics = 3;</code>
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
     * The metrics requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Metric metrics = 3;</code>
     */
    public com.google.analytics.data.v1alpha.Metric.Builder getMetricsBuilder(int index) {
      return getMetricsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The metrics requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Metric metrics = 3;</code>
     */
    public com.google.analytics.data.v1alpha.MetricOrBuilder getMetricsOrBuilder(int index) {
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
     * The metrics requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Metric metrics = 3;</code>
     */
    public java.util.List<? extends com.google.analytics.data.v1alpha.MetricOrBuilder>
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
     * The metrics requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Metric metrics = 3;</code>
     */
    public com.google.analytics.data.v1alpha.Metric.Builder addMetricsBuilder() {
      return getMetricsFieldBuilder()
          .addBuilder(com.google.analytics.data.v1alpha.Metric.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The metrics requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Metric metrics = 3;</code>
     */
    public com.google.analytics.data.v1alpha.Metric.Builder addMetricsBuilder(int index) {
      return getMetricsFieldBuilder()
          .addBuilder(index, com.google.analytics.data.v1alpha.Metric.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The metrics requested and displayed.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Metric metrics = 3;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.Metric.Builder>
        getMetricsBuilderList() {
      return getMetricsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.Metric,
            com.google.analytics.data.v1alpha.Metric.Builder,
            com.google.analytics.data.v1alpha.MetricOrBuilder>
        getMetricsFieldBuilder() {
      if (metricsBuilder_ == null) {
        metricsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.data.v1alpha.Metric,
                com.google.analytics.data.v1alpha.Metric.Builder,
                com.google.analytics.data.v1alpha.MetricOrBuilder>(
                metrics_, ((bitField0_ & 0x00000002) != 0), getParentForChildren(), isClean());
        metrics_ = null;
      }
      return metricsBuilder_;
    }

    private java.util.List<com.google.analytics.data.v1alpha.DateRange> dateRanges_ =
        java.util.Collections.emptyList();

    private void ensureDateRangesIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        dateRanges_ =
            new java.util.ArrayList<com.google.analytics.data.v1alpha.DateRange>(dateRanges_);
        bitField0_ |= 0x00000004;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.DateRange,
            com.google.analytics.data.v1alpha.DateRange.Builder,
            com.google.analytics.data.v1alpha.DateRangeOrBuilder>
        dateRangesBuilder_;

    /**
     *
     *
     * <pre>
     * Date ranges of data to read. If multiple date ranges are requested, each
     * response row will contain a zero based date range index. If two date
     * ranges overlap, the event data for the overlapping days is included in the
     * response rows for both date ranges. In a cohort request, this `dateRanges`
     * must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 4;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.DateRange> getDateRangesList() {
      if (dateRangesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dateRanges_);
      } else {
        return dateRangesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Date ranges of data to read. If multiple date ranges are requested, each
     * response row will contain a zero based date range index. If two date
     * ranges overlap, the event data for the overlapping days is included in the
     * response rows for both date ranges. In a cohort request, this `dateRanges`
     * must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 4;</code>
     */
    public int getDateRangesCount() {
      if (dateRangesBuilder_ == null) {
        return dateRanges_.size();
      } else {
        return dateRangesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Date ranges of data to read. If multiple date ranges are requested, each
     * response row will contain a zero based date range index. If two date
     * ranges overlap, the event data for the overlapping days is included in the
     * response rows for both date ranges. In a cohort request, this `dateRanges`
     * must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 4;</code>
     */
    public com.google.analytics.data.v1alpha.DateRange getDateRanges(int index) {
      if (dateRangesBuilder_ == null) {
        return dateRanges_.get(index);
      } else {
        return dateRangesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Date ranges of data to read. If multiple date ranges are requested, each
     * response row will contain a zero based date range index. If two date
     * ranges overlap, the event data for the overlapping days is included in the
     * response rows for both date ranges. In a cohort request, this `dateRanges`
     * must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 4;</code>
     */
    public Builder setDateRanges(int index, com.google.analytics.data.v1alpha.DateRange value) {
      if (dateRangesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDateRangesIsMutable();
        dateRanges_.set(index, value);
        onChanged();
      } else {
        dateRangesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Date ranges of data to read. If multiple date ranges are requested, each
     * response row will contain a zero based date range index. If two date
     * ranges overlap, the event data for the overlapping days is included in the
     * response rows for both date ranges. In a cohort request, this `dateRanges`
     * must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 4;</code>
     */
    public Builder setDateRanges(
        int index, com.google.analytics.data.v1alpha.DateRange.Builder builderForValue) {
      if (dateRangesBuilder_ == null) {
        ensureDateRangesIsMutable();
        dateRanges_.set(index, builderForValue.build());
        onChanged();
      } else {
        dateRangesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Date ranges of data to read. If multiple date ranges are requested, each
     * response row will contain a zero based date range index. If two date
     * ranges overlap, the event data for the overlapping days is included in the
     * response rows for both date ranges. In a cohort request, this `dateRanges`
     * must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 4;</code>
     */
    public Builder addDateRanges(com.google.analytics.data.v1alpha.DateRange value) {
      if (dateRangesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDateRangesIsMutable();
        dateRanges_.add(value);
        onChanged();
      } else {
        dateRangesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Date ranges of data to read. If multiple date ranges are requested, each
     * response row will contain a zero based date range index. If two date
     * ranges overlap, the event data for the overlapping days is included in the
     * response rows for both date ranges. In a cohort request, this `dateRanges`
     * must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 4;</code>
     */
    public Builder addDateRanges(int index, com.google.analytics.data.v1alpha.DateRange value) {
      if (dateRangesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDateRangesIsMutable();
        dateRanges_.add(index, value);
        onChanged();
      } else {
        dateRangesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Date ranges of data to read. If multiple date ranges are requested, each
     * response row will contain a zero based date range index. If two date
     * ranges overlap, the event data for the overlapping days is included in the
     * response rows for both date ranges. In a cohort request, this `dateRanges`
     * must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 4;</code>
     */
    public Builder addDateRanges(
        com.google.analytics.data.v1alpha.DateRange.Builder builderForValue) {
      if (dateRangesBuilder_ == null) {
        ensureDateRangesIsMutable();
        dateRanges_.add(builderForValue.build());
        onChanged();
      } else {
        dateRangesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Date ranges of data to read. If multiple date ranges are requested, each
     * response row will contain a zero based date range index. If two date
     * ranges overlap, the event data for the overlapping days is included in the
     * response rows for both date ranges. In a cohort request, this `dateRanges`
     * must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 4;</code>
     */
    public Builder addDateRanges(
        int index, com.google.analytics.data.v1alpha.DateRange.Builder builderForValue) {
      if (dateRangesBuilder_ == null) {
        ensureDateRangesIsMutable();
        dateRanges_.add(index, builderForValue.build());
        onChanged();
      } else {
        dateRangesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Date ranges of data to read. If multiple date ranges are requested, each
     * response row will contain a zero based date range index. If two date
     * ranges overlap, the event data for the overlapping days is included in the
     * response rows for both date ranges. In a cohort request, this `dateRanges`
     * must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 4;</code>
     */
    public Builder addAllDateRanges(
        java.lang.Iterable<? extends com.google.analytics.data.v1alpha.DateRange> values) {
      if (dateRangesBuilder_ == null) {
        ensureDateRangesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, dateRanges_);
        onChanged();
      } else {
        dateRangesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Date ranges of data to read. If multiple date ranges are requested, each
     * response row will contain a zero based date range index. If two date
     * ranges overlap, the event data for the overlapping days is included in the
     * response rows for both date ranges. In a cohort request, this `dateRanges`
     * must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 4;</code>
     */
    public Builder clearDateRanges() {
      if (dateRangesBuilder_ == null) {
        dateRanges_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        dateRangesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Date ranges of data to read. If multiple date ranges are requested, each
     * response row will contain a zero based date range index. If two date
     * ranges overlap, the event data for the overlapping days is included in the
     * response rows for both date ranges. In a cohort request, this `dateRanges`
     * must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 4;</code>
     */
    public Builder removeDateRanges(int index) {
      if (dateRangesBuilder_ == null) {
        ensureDateRangesIsMutable();
        dateRanges_.remove(index);
        onChanged();
      } else {
        dateRangesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Date ranges of data to read. If multiple date ranges are requested, each
     * response row will contain a zero based date range index. If two date
     * ranges overlap, the event data for the overlapping days is included in the
     * response rows for both date ranges. In a cohort request, this `dateRanges`
     * must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 4;</code>
     */
    public com.google.analytics.data.v1alpha.DateRange.Builder getDateRangesBuilder(int index) {
      return getDateRangesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Date ranges of data to read. If multiple date ranges are requested, each
     * response row will contain a zero based date range index. If two date
     * ranges overlap, the event data for the overlapping days is included in the
     * response rows for both date ranges. In a cohort request, this `dateRanges`
     * must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 4;</code>
     */
    public com.google.analytics.data.v1alpha.DateRangeOrBuilder getDateRangesOrBuilder(int index) {
      if (dateRangesBuilder_ == null) {
        return dateRanges_.get(index);
      } else {
        return dateRangesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Date ranges of data to read. If multiple date ranges are requested, each
     * response row will contain a zero based date range index. If two date
     * ranges overlap, the event data for the overlapping days is included in the
     * response rows for both date ranges. In a cohort request, this `dateRanges`
     * must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 4;</code>
     */
    public java.util.List<? extends com.google.analytics.data.v1alpha.DateRangeOrBuilder>
        getDateRangesOrBuilderList() {
      if (dateRangesBuilder_ != null) {
        return dateRangesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dateRanges_);
      }
    }
    /**
     *
     *
     * <pre>
     * Date ranges of data to read. If multiple date ranges are requested, each
     * response row will contain a zero based date range index. If two date
     * ranges overlap, the event data for the overlapping days is included in the
     * response rows for both date ranges. In a cohort request, this `dateRanges`
     * must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 4;</code>
     */
    public com.google.analytics.data.v1alpha.DateRange.Builder addDateRangesBuilder() {
      return getDateRangesFieldBuilder()
          .addBuilder(com.google.analytics.data.v1alpha.DateRange.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Date ranges of data to read. If multiple date ranges are requested, each
     * response row will contain a zero based date range index. If two date
     * ranges overlap, the event data for the overlapping days is included in the
     * response rows for both date ranges. In a cohort request, this `dateRanges`
     * must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 4;</code>
     */
    public com.google.analytics.data.v1alpha.DateRange.Builder addDateRangesBuilder(int index) {
      return getDateRangesFieldBuilder()
          .addBuilder(index, com.google.analytics.data.v1alpha.DateRange.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Date ranges of data to read. If multiple date ranges are requested, each
     * response row will contain a zero based date range index. If two date
     * ranges overlap, the event data for the overlapping days is included in the
     * response rows for both date ranges. In a cohort request, this `dateRanges`
     * must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 4;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.DateRange.Builder>
        getDateRangesBuilderList() {
      return getDateRangesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.DateRange,
            com.google.analytics.data.v1alpha.DateRange.Builder,
            com.google.analytics.data.v1alpha.DateRangeOrBuilder>
        getDateRangesFieldBuilder() {
      if (dateRangesBuilder_ == null) {
        dateRangesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.data.v1alpha.DateRange,
                com.google.analytics.data.v1alpha.DateRange.Builder,
                com.google.analytics.data.v1alpha.DateRangeOrBuilder>(
                dateRanges_, ((bitField0_ & 0x00000004) != 0), getParentForChildren(), isClean());
        dateRanges_ = null;
      }
      return dateRangesBuilder_;
    }

    private long offset_;
    /**
     *
     *
     * <pre>
     * The row count of the start row. The first row is counted as row 0.
     * To learn more about this pagination parameter, see
     * [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
     * </pre>
     *
     * <code>int64 offset = 5;</code>
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
     * To learn more about this pagination parameter, see
     * [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
     * </pre>
     *
     * <code>int64 offset = 5;</code>
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
     * To learn more about this pagination parameter, see
     * [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
     * </pre>
     *
     * <code>int64 offset = 5;</code>
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
     * The number of rows to return. If unspecified, 10 rows are returned. If
     * -1, all rows are returned.
     * To learn more about this pagination parameter, see
     * [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
     * </pre>
     *
     * <code>int64 limit = 6;</code>
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
     * The number of rows to return. If unspecified, 10 rows are returned. If
     * -1, all rows are returned.
     * To learn more about this pagination parameter, see
     * [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
     * </pre>
     *
     * <code>int64 limit = 6;</code>
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
     * The number of rows to return. If unspecified, 10 rows are returned. If
     * -1, all rows are returned.
     * To learn more about this pagination parameter, see
     * [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
     * </pre>
     *
     * <code>int64 limit = 6;</code>
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
      if (!((bitField0_ & 0x00000008) != 0)) {
        metricAggregations_ = new java.util.ArrayList<java.lang.Integer>(metricAggregations_);
        bitField0_ |= 0x00000008;
      }
    }
    /**
     *
     *
     * <pre>
     * Aggregation of metrics. Aggregated metric values will be shown in rows
     * where the dimension_values are set to "RESERVED_(MetricAggregation)".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 7;
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
     * Aggregation of metrics. Aggregated metric values will be shown in rows
     * where the dimension_values are set to "RESERVED_(MetricAggregation)".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 7;
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
     * Aggregation of metrics. Aggregated metric values will be shown in rows
     * where the dimension_values are set to "RESERVED_(MetricAggregation)".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 7;
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
     * Aggregation of metrics. Aggregated metric values will be shown in rows
     * where the dimension_values are set to "RESERVED_(MetricAggregation)".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 7;
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
     * Aggregation of metrics. Aggregated metric values will be shown in rows
     * where the dimension_values are set to "RESERVED_(MetricAggregation)".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 7;
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
     * Aggregation of metrics. Aggregated metric values will be shown in rows
     * where the dimension_values are set to "RESERVED_(MetricAggregation)".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 7;
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
     * Aggregation of metrics. Aggregated metric values will be shown in rows
     * where the dimension_values are set to "RESERVED_(MetricAggregation)".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 7;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMetricAggregations() {
      metricAggregations_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Aggregation of metrics. Aggregated metric values will be shown in rows
     * where the dimension_values are set to "RESERVED_(MetricAggregation)".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 7;
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
     * Aggregation of metrics. Aggregated metric values will be shown in rows
     * where the dimension_values are set to "RESERVED_(MetricAggregation)".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 7;
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
     * Aggregation of metrics. Aggregated metric values will be shown in rows
     * where the dimension_values are set to "RESERVED_(MetricAggregation)".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 7;
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
     * Aggregation of metrics. Aggregated metric values will be shown in rows
     * where the dimension_values are set to "RESERVED_(MetricAggregation)".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 7;
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
     * Aggregation of metrics. Aggregated metric values will be shown in rows
     * where the dimension_values are set to "RESERVED_(MetricAggregation)".
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.MetricAggregation metric_aggregations = 7;
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

    private com.google.analytics.data.v1alpha.FilterExpression dimensionFilter_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.FilterExpression,
            com.google.analytics.data.v1alpha.FilterExpression.Builder,
            com.google.analytics.data.v1alpha.FilterExpressionOrBuilder>
        dimensionFilterBuilder_;
    /**
     *
     *
     * <pre>
     * The filter clause of dimensions. Dimensions must be requested to be used in
     * this filter. Metrics cannot be used in this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpression dimension_filter = 8;</code>
     *
     * @return Whether the dimensionFilter field is set.
     */
    public boolean hasDimensionFilter() {
      return dimensionFilterBuilder_ != null || dimensionFilter_ != null;
    }
    /**
     *
     *
     * <pre>
     * The filter clause of dimensions. Dimensions must be requested to be used in
     * this filter. Metrics cannot be used in this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpression dimension_filter = 8;</code>
     *
     * @return The dimensionFilter.
     */
    public com.google.analytics.data.v1alpha.FilterExpression getDimensionFilter() {
      if (dimensionFilterBuilder_ == null) {
        return dimensionFilter_ == null
            ? com.google.analytics.data.v1alpha.FilterExpression.getDefaultInstance()
            : dimensionFilter_;
      } else {
        return dimensionFilterBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The filter clause of dimensions. Dimensions must be requested to be used in
     * this filter. Metrics cannot be used in this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpression dimension_filter = 8;</code>
     */
    public Builder setDimensionFilter(com.google.analytics.data.v1alpha.FilterExpression value) {
      if (dimensionFilterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dimensionFilter_ = value;
        onChanged();
      } else {
        dimensionFilterBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The filter clause of dimensions. Dimensions must be requested to be used in
     * this filter. Metrics cannot be used in this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpression dimension_filter = 8;</code>
     */
    public Builder setDimensionFilter(
        com.google.analytics.data.v1alpha.FilterExpression.Builder builderForValue) {
      if (dimensionFilterBuilder_ == null) {
        dimensionFilter_ = builderForValue.build();
        onChanged();
      } else {
        dimensionFilterBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The filter clause of dimensions. Dimensions must be requested to be used in
     * this filter. Metrics cannot be used in this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpression dimension_filter = 8;</code>
     */
    public Builder mergeDimensionFilter(com.google.analytics.data.v1alpha.FilterExpression value) {
      if (dimensionFilterBuilder_ == null) {
        if (dimensionFilter_ != null) {
          dimensionFilter_ =
              com.google.analytics.data.v1alpha.FilterExpression.newBuilder(dimensionFilter_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          dimensionFilter_ = value;
        }
        onChanged();
      } else {
        dimensionFilterBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The filter clause of dimensions. Dimensions must be requested to be used in
     * this filter. Metrics cannot be used in this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpression dimension_filter = 8;</code>
     */
    public Builder clearDimensionFilter() {
      if (dimensionFilterBuilder_ == null) {
        dimensionFilter_ = null;
        onChanged();
      } else {
        dimensionFilter_ = null;
        dimensionFilterBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The filter clause of dimensions. Dimensions must be requested to be used in
     * this filter. Metrics cannot be used in this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpression dimension_filter = 8;</code>
     */
    public com.google.analytics.data.v1alpha.FilterExpression.Builder getDimensionFilterBuilder() {

      onChanged();
      return getDimensionFilterFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The filter clause of dimensions. Dimensions must be requested to be used in
     * this filter. Metrics cannot be used in this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpression dimension_filter = 8;</code>
     */
    public com.google.analytics.data.v1alpha.FilterExpressionOrBuilder
        getDimensionFilterOrBuilder() {
      if (dimensionFilterBuilder_ != null) {
        return dimensionFilterBuilder_.getMessageOrBuilder();
      } else {
        return dimensionFilter_ == null
            ? com.google.analytics.data.v1alpha.FilterExpression.getDefaultInstance()
            : dimensionFilter_;
      }
    }
    /**
     *
     *
     * <pre>
     * The filter clause of dimensions. Dimensions must be requested to be used in
     * this filter. Metrics cannot be used in this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpression dimension_filter = 8;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.FilterExpression,
            com.google.analytics.data.v1alpha.FilterExpression.Builder,
            com.google.analytics.data.v1alpha.FilterExpressionOrBuilder>
        getDimensionFilterFieldBuilder() {
      if (dimensionFilterBuilder_ == null) {
        dimensionFilterBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.FilterExpression,
                com.google.analytics.data.v1alpha.FilterExpression.Builder,
                com.google.analytics.data.v1alpha.FilterExpressionOrBuilder>(
                getDimensionFilter(), getParentForChildren(), isClean());
        dimensionFilter_ = null;
      }
      return dimensionFilterBuilder_;
    }

    private com.google.analytics.data.v1alpha.FilterExpression metricFilter_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.FilterExpression,
            com.google.analytics.data.v1alpha.FilterExpression.Builder,
            com.google.analytics.data.v1alpha.FilterExpressionOrBuilder>
        metricFilterBuilder_;
    /**
     *
     *
     * <pre>
     * The filter clause of metrics. Applied at post aggregation phase, similar to
     * SQL having-clause. Metrics must be requested to be used in this filter.
     * Dimensions cannot be used in this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpression metric_filter = 9;</code>
     *
     * @return Whether the metricFilter field is set.
     */
    public boolean hasMetricFilter() {
      return metricFilterBuilder_ != null || metricFilter_ != null;
    }
    /**
     *
     *
     * <pre>
     * The filter clause of metrics. Applied at post aggregation phase, similar to
     * SQL having-clause. Metrics must be requested to be used in this filter.
     * Dimensions cannot be used in this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpression metric_filter = 9;</code>
     *
     * @return The metricFilter.
     */
    public com.google.analytics.data.v1alpha.FilterExpression getMetricFilter() {
      if (metricFilterBuilder_ == null) {
        return metricFilter_ == null
            ? com.google.analytics.data.v1alpha.FilterExpression.getDefaultInstance()
            : metricFilter_;
      } else {
        return metricFilterBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The filter clause of metrics. Applied at post aggregation phase, similar to
     * SQL having-clause. Metrics must be requested to be used in this filter.
     * Dimensions cannot be used in this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpression metric_filter = 9;</code>
     */
    public Builder setMetricFilter(com.google.analytics.data.v1alpha.FilterExpression value) {
      if (metricFilterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metricFilter_ = value;
        onChanged();
      } else {
        metricFilterBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The filter clause of metrics. Applied at post aggregation phase, similar to
     * SQL having-clause. Metrics must be requested to be used in this filter.
     * Dimensions cannot be used in this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpression metric_filter = 9;</code>
     */
    public Builder setMetricFilter(
        com.google.analytics.data.v1alpha.FilterExpression.Builder builderForValue) {
      if (metricFilterBuilder_ == null) {
        metricFilter_ = builderForValue.build();
        onChanged();
      } else {
        metricFilterBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The filter clause of metrics. Applied at post aggregation phase, similar to
     * SQL having-clause. Metrics must be requested to be used in this filter.
     * Dimensions cannot be used in this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpression metric_filter = 9;</code>
     */
    public Builder mergeMetricFilter(com.google.analytics.data.v1alpha.FilterExpression value) {
      if (metricFilterBuilder_ == null) {
        if (metricFilter_ != null) {
          metricFilter_ =
              com.google.analytics.data.v1alpha.FilterExpression.newBuilder(metricFilter_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          metricFilter_ = value;
        }
        onChanged();
      } else {
        metricFilterBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The filter clause of metrics. Applied at post aggregation phase, similar to
     * SQL having-clause. Metrics must be requested to be used in this filter.
     * Dimensions cannot be used in this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpression metric_filter = 9;</code>
     */
    public Builder clearMetricFilter() {
      if (metricFilterBuilder_ == null) {
        metricFilter_ = null;
        onChanged();
      } else {
        metricFilter_ = null;
        metricFilterBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The filter clause of metrics. Applied at post aggregation phase, similar to
     * SQL having-clause. Metrics must be requested to be used in this filter.
     * Dimensions cannot be used in this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpression metric_filter = 9;</code>
     */
    public com.google.analytics.data.v1alpha.FilterExpression.Builder getMetricFilterBuilder() {

      onChanged();
      return getMetricFilterFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The filter clause of metrics. Applied at post aggregation phase, similar to
     * SQL having-clause. Metrics must be requested to be used in this filter.
     * Dimensions cannot be used in this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpression metric_filter = 9;</code>
     */
    public com.google.analytics.data.v1alpha.FilterExpressionOrBuilder getMetricFilterOrBuilder() {
      if (metricFilterBuilder_ != null) {
        return metricFilterBuilder_.getMessageOrBuilder();
      } else {
        return metricFilter_ == null
            ? com.google.analytics.data.v1alpha.FilterExpression.getDefaultInstance()
            : metricFilter_;
      }
    }
    /**
     *
     *
     * <pre>
     * The filter clause of metrics. Applied at post aggregation phase, similar to
     * SQL having-clause. Metrics must be requested to be used in this filter.
     * Dimensions cannot be used in this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpression metric_filter = 9;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.FilterExpression,
            com.google.analytics.data.v1alpha.FilterExpression.Builder,
            com.google.analytics.data.v1alpha.FilterExpressionOrBuilder>
        getMetricFilterFieldBuilder() {
      if (metricFilterBuilder_ == null) {
        metricFilterBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.FilterExpression,
                com.google.analytics.data.v1alpha.FilterExpression.Builder,
                com.google.analytics.data.v1alpha.FilterExpressionOrBuilder>(
                getMetricFilter(), getParentForChildren(), isClean());
        metricFilter_ = null;
      }
      return metricFilterBuilder_;
    }

    private java.util.List<com.google.analytics.data.v1alpha.OrderBy> orderBys_ =
        java.util.Collections.emptyList();

    private void ensureOrderBysIsMutable() {
      if (!((bitField0_ & 0x00000010) != 0)) {
        orderBys_ = new java.util.ArrayList<com.google.analytics.data.v1alpha.OrderBy>(orderBys_);
        bitField0_ |= 0x00000010;
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
     * Specifies how rows are ordered in the response.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 10;</code>
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
     * Specifies how rows are ordered in the response.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 10;</code>
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
     * Specifies how rows are ordered in the response.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 10;</code>
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
     * Specifies how rows are ordered in the response.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 10;</code>
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
     * Specifies how rows are ordered in the response.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 10;</code>
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
     * Specifies how rows are ordered in the response.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 10;</code>
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
     * Specifies how rows are ordered in the response.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 10;</code>
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
     * Specifies how rows are ordered in the response.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 10;</code>
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
     * Specifies how rows are ordered in the response.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 10;</code>
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
     * Specifies how rows are ordered in the response.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 10;</code>
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
     * Specifies how rows are ordered in the response.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 10;</code>
     */
    public Builder clearOrderBys() {
      if (orderBysBuilder_ == null) {
        orderBys_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
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
     * Specifies how rows are ordered in the response.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 10;</code>
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
     * Specifies how rows are ordered in the response.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 10;</code>
     */
    public com.google.analytics.data.v1alpha.OrderBy.Builder getOrderBysBuilder(int index) {
      return getOrderBysFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Specifies how rows are ordered in the response.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 10;</code>
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
     * Specifies how rows are ordered in the response.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 10;</code>
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
     * Specifies how rows are ordered in the response.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 10;</code>
     */
    public com.google.analytics.data.v1alpha.OrderBy.Builder addOrderBysBuilder() {
      return getOrderBysFieldBuilder()
          .addBuilder(com.google.analytics.data.v1alpha.OrderBy.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Specifies how rows are ordered in the response.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 10;</code>
     */
    public com.google.analytics.data.v1alpha.OrderBy.Builder addOrderBysBuilder(int index) {
      return getOrderBysFieldBuilder()
          .addBuilder(index, com.google.analytics.data.v1alpha.OrderBy.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Specifies how rows are ordered in the response.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.OrderBy order_bys = 10;</code>
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
                orderBys_, ((bitField0_ & 0x00000010) != 0), getParentForChildren(), isClean());
        orderBys_ = null;
      }
      return orderBysBuilder_;
    }

    private java.lang.Object currencyCode_ = "";
    /**
     *
     *
     * <pre>
     * A currency code in ISO4217 format, such as "AED", "USD", "JPY".
     * If the field is empty, the report uses the entity's default currency.
     * </pre>
     *
     * <code>string currency_code = 11;</code>
     *
     * @return The currencyCode.
     */
    public java.lang.String getCurrencyCode() {
      java.lang.Object ref = currencyCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        currencyCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A currency code in ISO4217 format, such as "AED", "USD", "JPY".
     * If the field is empty, the report uses the entity's default currency.
     * </pre>
     *
     * <code>string currency_code = 11;</code>
     *
     * @return The bytes for currencyCode.
     */
    public com.google.protobuf.ByteString getCurrencyCodeBytes() {
      java.lang.Object ref = currencyCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        currencyCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A currency code in ISO4217 format, such as "AED", "USD", "JPY".
     * If the field is empty, the report uses the entity's default currency.
     * </pre>
     *
     * <code>string currency_code = 11;</code>
     *
     * @param value The currencyCode to set.
     * @return This builder for chaining.
     */
    public Builder setCurrencyCode(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      currencyCode_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A currency code in ISO4217 format, such as "AED", "USD", "JPY".
     * If the field is empty, the report uses the entity's default currency.
     * </pre>
     *
     * <code>string currency_code = 11;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCurrencyCode() {

      currencyCode_ = getDefaultInstance().getCurrencyCode();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A currency code in ISO4217 format, such as "AED", "USD", "JPY".
     * If the field is empty, the report uses the entity's default currency.
     * </pre>
     *
     * <code>string currency_code = 11;</code>
     *
     * @param value The bytes for currencyCode to set.
     * @return This builder for chaining.
     */
    public Builder setCurrencyCodeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      currencyCode_ = value;
      onChanged();
      return this;
    }

    private com.google.analytics.data.v1alpha.CohortSpec cohortSpec_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.CohortSpec,
            com.google.analytics.data.v1alpha.CohortSpec.Builder,
            com.google.analytics.data.v1alpha.CohortSpecOrBuilder>
        cohortSpecBuilder_;
    /**
     *
     *
     * <pre>
     * Cohort group associated with this request. If there is a cohort group
     * in the request the 'cohort' dimension must be present.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.CohortSpec cohort_spec = 12;</code>
     *
     * @return Whether the cohortSpec field is set.
     */
    public boolean hasCohortSpec() {
      return cohortSpecBuilder_ != null || cohortSpec_ != null;
    }
    /**
     *
     *
     * <pre>
     * Cohort group associated with this request. If there is a cohort group
     * in the request the 'cohort' dimension must be present.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.CohortSpec cohort_spec = 12;</code>
     *
     * @return The cohortSpec.
     */
    public com.google.analytics.data.v1alpha.CohortSpec getCohortSpec() {
      if (cohortSpecBuilder_ == null) {
        return cohortSpec_ == null
            ? com.google.analytics.data.v1alpha.CohortSpec.getDefaultInstance()
            : cohortSpec_;
      } else {
        return cohortSpecBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Cohort group associated with this request. If there is a cohort group
     * in the request the 'cohort' dimension must be present.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.CohortSpec cohort_spec = 12;</code>
     */
    public Builder setCohortSpec(com.google.analytics.data.v1alpha.CohortSpec value) {
      if (cohortSpecBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cohortSpec_ = value;
        onChanged();
      } else {
        cohortSpecBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Cohort group associated with this request. If there is a cohort group
     * in the request the 'cohort' dimension must be present.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.CohortSpec cohort_spec = 12;</code>
     */
    public Builder setCohortSpec(
        com.google.analytics.data.v1alpha.CohortSpec.Builder builderForValue) {
      if (cohortSpecBuilder_ == null) {
        cohortSpec_ = builderForValue.build();
        onChanged();
      } else {
        cohortSpecBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Cohort group associated with this request. If there is a cohort group
     * in the request the 'cohort' dimension must be present.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.CohortSpec cohort_spec = 12;</code>
     */
    public Builder mergeCohortSpec(com.google.analytics.data.v1alpha.CohortSpec value) {
      if (cohortSpecBuilder_ == null) {
        if (cohortSpec_ != null) {
          cohortSpec_ =
              com.google.analytics.data.v1alpha.CohortSpec.newBuilder(cohortSpec_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          cohortSpec_ = value;
        }
        onChanged();
      } else {
        cohortSpecBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Cohort group associated with this request. If there is a cohort group
     * in the request the 'cohort' dimension must be present.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.CohortSpec cohort_spec = 12;</code>
     */
    public Builder clearCohortSpec() {
      if (cohortSpecBuilder_ == null) {
        cohortSpec_ = null;
        onChanged();
      } else {
        cohortSpec_ = null;
        cohortSpecBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Cohort group associated with this request. If there is a cohort group
     * in the request the 'cohort' dimension must be present.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.CohortSpec cohort_spec = 12;</code>
     */
    public com.google.analytics.data.v1alpha.CohortSpec.Builder getCohortSpecBuilder() {

      onChanged();
      return getCohortSpecFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Cohort group associated with this request. If there is a cohort group
     * in the request the 'cohort' dimension must be present.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.CohortSpec cohort_spec = 12;</code>
     */
    public com.google.analytics.data.v1alpha.CohortSpecOrBuilder getCohortSpecOrBuilder() {
      if (cohortSpecBuilder_ != null) {
        return cohortSpecBuilder_.getMessageOrBuilder();
      } else {
        return cohortSpec_ == null
            ? com.google.analytics.data.v1alpha.CohortSpec.getDefaultInstance()
            : cohortSpec_;
      }
    }
    /**
     *
     *
     * <pre>
     * Cohort group associated with this request. If there is a cohort group
     * in the request the 'cohort' dimension must be present.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.CohortSpec cohort_spec = 12;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.CohortSpec,
            com.google.analytics.data.v1alpha.CohortSpec.Builder,
            com.google.analytics.data.v1alpha.CohortSpecOrBuilder>
        getCohortSpecFieldBuilder() {
      if (cohortSpecBuilder_ == null) {
        cohortSpecBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.CohortSpec,
                com.google.analytics.data.v1alpha.CohortSpec.Builder,
                com.google.analytics.data.v1alpha.CohortSpecOrBuilder>(
                getCohortSpec(), getParentForChildren(), isClean());
        cohortSpec_ = null;
      }
      return cohortSpecBuilder_;
    }

    private boolean keepEmptyRows_;
    /**
     *
     *
     * <pre>
     * If false or unspecified, each row with all metrics equal to 0 will not be
     * returned. If true, these rows will be returned if they are not separately
     * removed by a filter.
     * </pre>
     *
     * <code>bool keep_empty_rows = 13;</code>
     *
     * @return The keepEmptyRows.
     */
    @java.lang.Override
    public boolean getKeepEmptyRows() {
      return keepEmptyRows_;
    }
    /**
     *
     *
     * <pre>
     * If false or unspecified, each row with all metrics equal to 0 will not be
     * returned. If true, these rows will be returned if they are not separately
     * removed by a filter.
     * </pre>
     *
     * <code>bool keep_empty_rows = 13;</code>
     *
     * @param value The keepEmptyRows to set.
     * @return This builder for chaining.
     */
    public Builder setKeepEmptyRows(boolean value) {

      keepEmptyRows_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If false or unspecified, each row with all metrics equal to 0 will not be
     * returned. If true, these rows will be returned if they are not separately
     * removed by a filter.
     * </pre>
     *
     * <code>bool keep_empty_rows = 13;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKeepEmptyRows() {

      keepEmptyRows_ = false;
      onChanged();
      return this;
    }

    private boolean returnPropertyQuota_;
    /**
     *
     *
     * <pre>
     * Toggles whether to return the current state of this Analytics Property's
     * quota. Quota is returned in [PropertyQuota](#PropertyQuota).
     * </pre>
     *
     * <code>bool return_property_quota = 14;</code>
     *
     * @return The returnPropertyQuota.
     */
    @java.lang.Override
    public boolean getReturnPropertyQuota() {
      return returnPropertyQuota_;
    }
    /**
     *
     *
     * <pre>
     * Toggles whether to return the current state of this Analytics Property's
     * quota. Quota is returned in [PropertyQuota](#PropertyQuota).
     * </pre>
     *
     * <code>bool return_property_quota = 14;</code>
     *
     * @param value The returnPropertyQuota to set.
     * @return This builder for chaining.
     */
    public Builder setReturnPropertyQuota(boolean value) {

      returnPropertyQuota_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Toggles whether to return the current state of this Analytics Property's
     * quota. Quota is returned in [PropertyQuota](#PropertyQuota).
     * </pre>
     *
     * <code>bool return_property_quota = 14;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearReturnPropertyQuota() {

      returnPropertyQuota_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.RunReportRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.RunReportRequest)
  private static final com.google.analytics.data.v1alpha.RunReportRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.RunReportRequest();
  }

  public static com.google.analytics.data.v1alpha.RunReportRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RunReportRequest> PARSER =
      new com.google.protobuf.AbstractParser<RunReportRequest>() {
        @java.lang.Override
        public RunReportRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new RunReportRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<RunReportRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RunReportRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.RunReportRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
