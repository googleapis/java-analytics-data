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
 * The request to generate a pivot report.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.RunPivotReportRequest}
 */
public final class RunPivotReportRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.RunPivotReportRequest)
    RunPivotReportRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RunPivotReportRequest.newBuilder() to construct.
  private RunPivotReportRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RunPivotReportRequest() {
    dimensions_ = java.util.Collections.emptyList();
    metrics_ = java.util.Collections.emptyList();
    pivots_ = java.util.Collections.emptyList();
    dateRanges_ = java.util.Collections.emptyList();
    currencyCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RunPivotReportRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private RunPivotReportRequest(
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
          case 42:
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
          case 50:
            {
              if (!((mutable_bitField0_ & 0x00000004) != 0)) {
                pivots_ = new java.util.ArrayList<com.google.analytics.data.v1alpha.Pivot>();
                mutable_bitField0_ |= 0x00000004;
              }
              pivots_.add(
                  input.readMessage(
                      com.google.analytics.data.v1alpha.Pivot.parser(), extensionRegistry));
              break;
            }
          case 58:
            {
              if (!((mutable_bitField0_ & 0x00000008) != 0)) {
                dateRanges_ =
                    new java.util.ArrayList<com.google.analytics.data.v1alpha.DateRange>();
                mutable_bitField0_ |= 0x00000008;
              }
              dateRanges_.add(
                  input.readMessage(
                      com.google.analytics.data.v1alpha.DateRange.parser(), extensionRegistry));
              break;
            }
          case 66:
            {
              java.lang.String s = input.readStringRequireUtf8();

              currencyCode_ = s;
              break;
            }
          case 74:
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
          case 80:
            {
              keepEmptyRows_ = input.readBool();
              break;
            }
          case 88:
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
        pivots_ = java.util.Collections.unmodifiableList(pivots_);
      }
      if (((mutable_bitField0_ & 0x00000008) != 0)) {
        dateRanges_ = java.util.Collections.unmodifiableList(dateRanges_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
        .internal_static_google_analytics_data_v1alpha_RunPivotReportRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
        .internal_static_google_analytics_data_v1alpha_RunPivotReportRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.RunPivotReportRequest.class,
            com.google.analytics.data.v1alpha.RunPivotReportRequest.Builder.class);
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
   * The dimensions requested. All defined dimensions must be used by one of the
   * following: dimension_expression, dimension_filter, pivots, order_bys.
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
   * The dimensions requested. All defined dimensions must be used by one of the
   * following: dimension_expression, dimension_filter, pivots, order_bys.
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
   * The dimensions requested. All defined dimensions must be used by one of the
   * following: dimension_expression, dimension_filter, pivots, order_bys.
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
   * The dimensions requested. All defined dimensions must be used by one of the
   * following: dimension_expression, dimension_filter, pivots, order_bys.
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
   * The dimensions requested. All defined dimensions must be used by one of the
   * following: dimension_expression, dimension_filter, pivots, order_bys.
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
   * The metrics requested, at least one metric needs to be specified. All
   * defined metrics must be used by one of the following: metric_expression,
   * metric_filter, order_bys.
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
   * The metrics requested, at least one metric needs to be specified. All
   * defined metrics must be used by one of the following: metric_expression,
   * metric_filter, order_bys.
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
   * The metrics requested, at least one metric needs to be specified. All
   * defined metrics must be used by one of the following: metric_expression,
   * metric_filter, order_bys.
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
   * The metrics requested, at least one metric needs to be specified. All
   * defined metrics must be used by one of the following: metric_expression,
   * metric_filter, order_bys.
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
   * The metrics requested, at least one metric needs to be specified. All
   * defined metrics must be used by one of the following: metric_expression,
   * metric_filter, order_bys.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Metric metrics = 3;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.MetricOrBuilder getMetricsOrBuilder(int index) {
    return metrics_.get(index);
  }

  public static final int DIMENSION_FILTER_FIELD_NUMBER = 4;
  private com.google.analytics.data.v1alpha.FilterExpression dimensionFilter_;
  /**
   *
   *
   * <pre>
   * The filter clause of dimensions. Dimensions must be requested to be used in
   * this filter. Metrics cannot be used in this filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpression dimension_filter = 4;</code>
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
   * <code>.google.analytics.data.v1alpha.FilterExpression dimension_filter = 4;</code>
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
   * <code>.google.analytics.data.v1alpha.FilterExpression dimension_filter = 4;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.FilterExpressionOrBuilder getDimensionFilterOrBuilder() {
    return getDimensionFilter();
  }

  public static final int METRIC_FILTER_FIELD_NUMBER = 5;
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
   * <code>.google.analytics.data.v1alpha.FilterExpression metric_filter = 5;</code>
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
   * <code>.google.analytics.data.v1alpha.FilterExpression metric_filter = 5;</code>
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
   * <code>.google.analytics.data.v1alpha.FilterExpression metric_filter = 5;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.FilterExpressionOrBuilder getMetricFilterOrBuilder() {
    return getMetricFilter();
  }

  public static final int PIVOTS_FIELD_NUMBER = 6;
  private java.util.List<com.google.analytics.data.v1alpha.Pivot> pivots_;
  /**
   *
   *
   * <pre>
   * Describes the visual format of the report's dimensions in columns or rows.
   * The union of the fieldNames (dimension names) in all pivots must be a
   * subset of dimension names defined in Dimensions. No two pivots can share a
   * dimension. A dimension is only visible if it appears in a pivot.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Pivot pivots = 6;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1alpha.Pivot> getPivotsList() {
    return pivots_;
  }
  /**
   *
   *
   * <pre>
   * Describes the visual format of the report's dimensions in columns or rows.
   * The union of the fieldNames (dimension names) in all pivots must be a
   * subset of dimension names defined in Dimensions. No two pivots can share a
   * dimension. A dimension is only visible if it appears in a pivot.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Pivot pivots = 6;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.data.v1alpha.PivotOrBuilder>
      getPivotsOrBuilderList() {
    return pivots_;
  }
  /**
   *
   *
   * <pre>
   * Describes the visual format of the report's dimensions in columns or rows.
   * The union of the fieldNames (dimension names) in all pivots must be a
   * subset of dimension names defined in Dimensions. No two pivots can share a
   * dimension. A dimension is only visible if it appears in a pivot.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Pivot pivots = 6;</code>
   */
  @java.lang.Override
  public int getPivotsCount() {
    return pivots_.size();
  }
  /**
   *
   *
   * <pre>
   * Describes the visual format of the report's dimensions in columns or rows.
   * The union of the fieldNames (dimension names) in all pivots must be a
   * subset of dimension names defined in Dimensions. No two pivots can share a
   * dimension. A dimension is only visible if it appears in a pivot.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Pivot pivots = 6;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.Pivot getPivots(int index) {
    return pivots_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Describes the visual format of the report's dimensions in columns or rows.
   * The union of the fieldNames (dimension names) in all pivots must be a
   * subset of dimension names defined in Dimensions. No two pivots can share a
   * dimension. A dimension is only visible if it appears in a pivot.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Pivot pivots = 6;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.PivotOrBuilder getPivotsOrBuilder(int index) {
    return pivots_.get(index);
  }

  public static final int DATE_RANGES_FIELD_NUMBER = 7;
  private java.util.List<com.google.analytics.data.v1alpha.DateRange> dateRanges_;
  /**
   *
   *
   * <pre>
   * The date range to retrieve event data for the report. If multiple date
   * ranges are specified, event data from each date range is used in the
   * report. A special dimension with field name "dateRange" can be included in
   * a Pivot's field names; if included, the report compares between date
   * ranges. In a cohort request, this `dateRanges` must be unspecified.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 7;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1alpha.DateRange> getDateRangesList() {
    return dateRanges_;
  }
  /**
   *
   *
   * <pre>
   * The date range to retrieve event data for the report. If multiple date
   * ranges are specified, event data from each date range is used in the
   * report. A special dimension with field name "dateRange" can be included in
   * a Pivot's field names; if included, the report compares between date
   * ranges. In a cohort request, this `dateRanges` must be unspecified.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 7;</code>
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
   * The date range to retrieve event data for the report. If multiple date
   * ranges are specified, event data from each date range is used in the
   * report. A special dimension with field name "dateRange" can be included in
   * a Pivot's field names; if included, the report compares between date
   * ranges. In a cohort request, this `dateRanges` must be unspecified.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 7;</code>
   */
  @java.lang.Override
  public int getDateRangesCount() {
    return dateRanges_.size();
  }
  /**
   *
   *
   * <pre>
   * The date range to retrieve event data for the report. If multiple date
   * ranges are specified, event data from each date range is used in the
   * report. A special dimension with field name "dateRange" can be included in
   * a Pivot's field names; if included, the report compares between date
   * ranges. In a cohort request, this `dateRanges` must be unspecified.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 7;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.DateRange getDateRanges(int index) {
    return dateRanges_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The date range to retrieve event data for the report. If multiple date
   * ranges are specified, event data from each date range is used in the
   * report. A special dimension with field name "dateRange" can be included in
   * a Pivot's field names; if included, the report compares between date
   * ranges. In a cohort request, this `dateRanges` must be unspecified.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 7;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.DateRangeOrBuilder getDateRangesOrBuilder(int index) {
    return dateRanges_.get(index);
  }

  public static final int CURRENCY_CODE_FIELD_NUMBER = 8;
  private volatile java.lang.Object currencyCode_;
  /**
   *
   *
   * <pre>
   * A currency code in ISO4217 format, such as "AED", "USD", "JPY".
   * If the field is empty, the report uses the entity's default currency.
   * </pre>
   *
   * <code>string currency_code = 8;</code>
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
   * <code>string currency_code = 8;</code>
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

  public static final int COHORT_SPEC_FIELD_NUMBER = 9;
  private com.google.analytics.data.v1alpha.CohortSpec cohortSpec_;
  /**
   *
   *
   * <pre>
   * Cohort group associated with this request. If there is a cohort group
   * in the request the 'cohort' dimension must be present.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.CohortSpec cohort_spec = 9;</code>
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
   * <code>.google.analytics.data.v1alpha.CohortSpec cohort_spec = 9;</code>
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
   * <code>.google.analytics.data.v1alpha.CohortSpec cohort_spec = 9;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.CohortSpecOrBuilder getCohortSpecOrBuilder() {
    return getCohortSpec();
  }

  public static final int KEEP_EMPTY_ROWS_FIELD_NUMBER = 10;
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
   * <code>bool keep_empty_rows = 10;</code>
   *
   * @return The keepEmptyRows.
   */
  @java.lang.Override
  public boolean getKeepEmptyRows() {
    return keepEmptyRows_;
  }

  public static final int RETURN_PROPERTY_QUOTA_FIELD_NUMBER = 11;
  private boolean returnPropertyQuota_;
  /**
   *
   *
   * <pre>
   * Toggles whether to return the current state of this Analytics Property's
   * quota. Quota is returned in [PropertyQuota](#PropertyQuota).
   * </pre>
   *
   * <code>bool return_property_quota = 11;</code>
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
    if (entity_ != null) {
      output.writeMessage(1, getEntity());
    }
    for (int i = 0; i < dimensions_.size(); i++) {
      output.writeMessage(2, dimensions_.get(i));
    }
    for (int i = 0; i < metrics_.size(); i++) {
      output.writeMessage(3, metrics_.get(i));
    }
    if (dimensionFilter_ != null) {
      output.writeMessage(4, getDimensionFilter());
    }
    if (metricFilter_ != null) {
      output.writeMessage(5, getMetricFilter());
    }
    for (int i = 0; i < pivots_.size(); i++) {
      output.writeMessage(6, pivots_.get(i));
    }
    for (int i = 0; i < dateRanges_.size(); i++) {
      output.writeMessage(7, dateRanges_.get(i));
    }
    if (!getCurrencyCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, currencyCode_);
    }
    if (cohortSpec_ != null) {
      output.writeMessage(9, getCohortSpec());
    }
    if (keepEmptyRows_ != false) {
      output.writeBool(10, keepEmptyRows_);
    }
    if (returnPropertyQuota_ != false) {
      output.writeBool(11, returnPropertyQuota_);
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
    if (dimensionFilter_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getDimensionFilter());
    }
    if (metricFilter_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, getMetricFilter());
    }
    for (int i = 0; i < pivots_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(6, pivots_.get(i));
    }
    for (int i = 0; i < dateRanges_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(7, dateRanges_.get(i));
    }
    if (!getCurrencyCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, currencyCode_);
    }
    if (cohortSpec_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(9, getCohortSpec());
    }
    if (keepEmptyRows_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(10, keepEmptyRows_);
    }
    if (returnPropertyQuota_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(11, returnPropertyQuota_);
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.RunPivotReportRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.RunPivotReportRequest other =
        (com.google.analytics.data.v1alpha.RunPivotReportRequest) obj;

    if (hasEntity() != other.hasEntity()) return false;
    if (hasEntity()) {
      if (!getEntity().equals(other.getEntity())) return false;
    }
    if (!getDimensionsList().equals(other.getDimensionsList())) return false;
    if (!getMetricsList().equals(other.getMetricsList())) return false;
    if (hasDimensionFilter() != other.hasDimensionFilter()) return false;
    if (hasDimensionFilter()) {
      if (!getDimensionFilter().equals(other.getDimensionFilter())) return false;
    }
    if (hasMetricFilter() != other.hasMetricFilter()) return false;
    if (hasMetricFilter()) {
      if (!getMetricFilter().equals(other.getMetricFilter())) return false;
    }
    if (!getPivotsList().equals(other.getPivotsList())) return false;
    if (!getDateRangesList().equals(other.getDateRangesList())) return false;
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
    if (hasDimensionFilter()) {
      hash = (37 * hash) + DIMENSION_FILTER_FIELD_NUMBER;
      hash = (53 * hash) + getDimensionFilter().hashCode();
    }
    if (hasMetricFilter()) {
      hash = (37 * hash) + METRIC_FILTER_FIELD_NUMBER;
      hash = (53 * hash) + getMetricFilter().hashCode();
    }
    if (getPivotsCount() > 0) {
      hash = (37 * hash) + PIVOTS_FIELD_NUMBER;
      hash = (53 * hash) + getPivotsList().hashCode();
    }
    if (getDateRangesCount() > 0) {
      hash = (37 * hash) + DATE_RANGES_FIELD_NUMBER;
      hash = (53 * hash) + getDateRangesList().hashCode();
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

  public static com.google.analytics.data.v1alpha.RunPivotReportRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.RunPivotReportRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.RunPivotReportRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.RunPivotReportRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.RunPivotReportRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.RunPivotReportRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.RunPivotReportRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.RunPivotReportRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.RunPivotReportRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.RunPivotReportRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.RunPivotReportRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.RunPivotReportRequest parseFrom(
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
      com.google.analytics.data.v1alpha.RunPivotReportRequest prototype) {
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
   * The request to generate a pivot report.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.RunPivotReportRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.RunPivotReportRequest)
      com.google.analytics.data.v1alpha.RunPivotReportRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_RunPivotReportRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_RunPivotReportRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.RunPivotReportRequest.class,
              com.google.analytics.data.v1alpha.RunPivotReportRequest.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.RunPivotReportRequest.newBuilder()
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
        getPivotsFieldBuilder();
        getDateRangesFieldBuilder();
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
      if (pivotsBuilder_ == null) {
        pivots_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        pivotsBuilder_.clear();
      }
      if (dateRangesBuilder_ == null) {
        dateRanges_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        dateRangesBuilder_.clear();
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
          .internal_static_google_analytics_data_v1alpha_RunPivotReportRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.RunPivotReportRequest getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.RunPivotReportRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.RunPivotReportRequest build() {
      com.google.analytics.data.v1alpha.RunPivotReportRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.RunPivotReportRequest buildPartial() {
      com.google.analytics.data.v1alpha.RunPivotReportRequest result =
          new com.google.analytics.data.v1alpha.RunPivotReportRequest(this);
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
      if (pivotsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          pivots_ = java.util.Collections.unmodifiableList(pivots_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.pivots_ = pivots_;
      } else {
        result.pivots_ = pivotsBuilder_.build();
      }
      if (dateRangesBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0)) {
          dateRanges_ = java.util.Collections.unmodifiableList(dateRanges_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.dateRanges_ = dateRanges_;
      } else {
        result.dateRanges_ = dateRangesBuilder_.build();
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
      if (other instanceof com.google.analytics.data.v1alpha.RunPivotReportRequest) {
        return mergeFrom((com.google.analytics.data.v1alpha.RunPivotReportRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.RunPivotReportRequest other) {
      if (other == com.google.analytics.data.v1alpha.RunPivotReportRequest.getDefaultInstance())
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
      if (other.hasDimensionFilter()) {
        mergeDimensionFilter(other.getDimensionFilter());
      }
      if (other.hasMetricFilter()) {
        mergeMetricFilter(other.getMetricFilter());
      }
      if (pivotsBuilder_ == null) {
        if (!other.pivots_.isEmpty()) {
          if (pivots_.isEmpty()) {
            pivots_ = other.pivots_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensurePivotsIsMutable();
            pivots_.addAll(other.pivots_);
          }
          onChanged();
        }
      } else {
        if (!other.pivots_.isEmpty()) {
          if (pivotsBuilder_.isEmpty()) {
            pivotsBuilder_.dispose();
            pivotsBuilder_ = null;
            pivots_ = other.pivots_;
            bitField0_ = (bitField0_ & ~0x00000004);
            pivotsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getPivotsFieldBuilder()
                    : null;
          } else {
            pivotsBuilder_.addAllMessages(other.pivots_);
          }
        }
      }
      if (dateRangesBuilder_ == null) {
        if (!other.dateRanges_.isEmpty()) {
          if (dateRanges_.isEmpty()) {
            dateRanges_ = other.dateRanges_;
            bitField0_ = (bitField0_ & ~0x00000008);
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
            bitField0_ = (bitField0_ & ~0x00000008);
            dateRangesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDateRangesFieldBuilder()
                    : null;
          } else {
            dateRangesBuilder_.addAllMessages(other.dateRanges_);
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
      com.google.analytics.data.v1alpha.RunPivotReportRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.data.v1alpha.RunPivotReportRequest) e.getUnfinishedMessage();
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
     * The dimensions requested. All defined dimensions must be used by one of the
     * following: dimension_expression, dimension_filter, pivots, order_bys.
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
     * The dimensions requested. All defined dimensions must be used by one of the
     * following: dimension_expression, dimension_filter, pivots, order_bys.
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
     * The dimensions requested. All defined dimensions must be used by one of the
     * following: dimension_expression, dimension_filter, pivots, order_bys.
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
     * The dimensions requested. All defined dimensions must be used by one of the
     * following: dimension_expression, dimension_filter, pivots, order_bys.
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
     * The dimensions requested. All defined dimensions must be used by one of the
     * following: dimension_expression, dimension_filter, pivots, order_bys.
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
     * The dimensions requested. All defined dimensions must be used by one of the
     * following: dimension_expression, dimension_filter, pivots, order_bys.
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
     * The dimensions requested. All defined dimensions must be used by one of the
     * following: dimension_expression, dimension_filter, pivots, order_bys.
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
     * The dimensions requested. All defined dimensions must be used by one of the
     * following: dimension_expression, dimension_filter, pivots, order_bys.
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
     * The dimensions requested. All defined dimensions must be used by one of the
     * following: dimension_expression, dimension_filter, pivots, order_bys.
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
     * The dimensions requested. All defined dimensions must be used by one of the
     * following: dimension_expression, dimension_filter, pivots, order_bys.
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
     * The dimensions requested. All defined dimensions must be used by one of the
     * following: dimension_expression, dimension_filter, pivots, order_bys.
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
     * The dimensions requested. All defined dimensions must be used by one of the
     * following: dimension_expression, dimension_filter, pivots, order_bys.
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
     * The dimensions requested. All defined dimensions must be used by one of the
     * following: dimension_expression, dimension_filter, pivots, order_bys.
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
     * The dimensions requested. All defined dimensions must be used by one of the
     * following: dimension_expression, dimension_filter, pivots, order_bys.
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
     * The dimensions requested. All defined dimensions must be used by one of the
     * following: dimension_expression, dimension_filter, pivots, order_bys.
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
     * The dimensions requested. All defined dimensions must be used by one of the
     * following: dimension_expression, dimension_filter, pivots, order_bys.
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
     * The dimensions requested. All defined dimensions must be used by one of the
     * following: dimension_expression, dimension_filter, pivots, order_bys.
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
     * The dimensions requested. All defined dimensions must be used by one of the
     * following: dimension_expression, dimension_filter, pivots, order_bys.
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
     * The metrics requested, at least one metric needs to be specified. All
     * defined metrics must be used by one of the following: metric_expression,
     * metric_filter, order_bys.
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
     * The metrics requested, at least one metric needs to be specified. All
     * defined metrics must be used by one of the following: metric_expression,
     * metric_filter, order_bys.
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
     * The metrics requested, at least one metric needs to be specified. All
     * defined metrics must be used by one of the following: metric_expression,
     * metric_filter, order_bys.
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
     * The metrics requested, at least one metric needs to be specified. All
     * defined metrics must be used by one of the following: metric_expression,
     * metric_filter, order_bys.
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
     * The metrics requested, at least one metric needs to be specified. All
     * defined metrics must be used by one of the following: metric_expression,
     * metric_filter, order_bys.
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
     * The metrics requested, at least one metric needs to be specified. All
     * defined metrics must be used by one of the following: metric_expression,
     * metric_filter, order_bys.
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
     * The metrics requested, at least one metric needs to be specified. All
     * defined metrics must be used by one of the following: metric_expression,
     * metric_filter, order_bys.
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
     * The metrics requested, at least one metric needs to be specified. All
     * defined metrics must be used by one of the following: metric_expression,
     * metric_filter, order_bys.
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
     * The metrics requested, at least one metric needs to be specified. All
     * defined metrics must be used by one of the following: metric_expression,
     * metric_filter, order_bys.
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
     * The metrics requested, at least one metric needs to be specified. All
     * defined metrics must be used by one of the following: metric_expression,
     * metric_filter, order_bys.
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
     * The metrics requested, at least one metric needs to be specified. All
     * defined metrics must be used by one of the following: metric_expression,
     * metric_filter, order_bys.
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
     * The metrics requested, at least one metric needs to be specified. All
     * defined metrics must be used by one of the following: metric_expression,
     * metric_filter, order_bys.
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
     * The metrics requested, at least one metric needs to be specified. All
     * defined metrics must be used by one of the following: metric_expression,
     * metric_filter, order_bys.
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
     * The metrics requested, at least one metric needs to be specified. All
     * defined metrics must be used by one of the following: metric_expression,
     * metric_filter, order_bys.
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
     * The metrics requested, at least one metric needs to be specified. All
     * defined metrics must be used by one of the following: metric_expression,
     * metric_filter, order_bys.
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
     * The metrics requested, at least one metric needs to be specified. All
     * defined metrics must be used by one of the following: metric_expression,
     * metric_filter, order_bys.
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
     * The metrics requested, at least one metric needs to be specified. All
     * defined metrics must be used by one of the following: metric_expression,
     * metric_filter, order_bys.
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
     * The metrics requested, at least one metric needs to be specified. All
     * defined metrics must be used by one of the following: metric_expression,
     * metric_filter, order_bys.
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
     * <code>.google.analytics.data.v1alpha.FilterExpression dimension_filter = 4;</code>
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
     * <code>.google.analytics.data.v1alpha.FilterExpression dimension_filter = 4;</code>
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
     * <code>.google.analytics.data.v1alpha.FilterExpression dimension_filter = 4;</code>
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
     * <code>.google.analytics.data.v1alpha.FilterExpression dimension_filter = 4;</code>
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
     * <code>.google.analytics.data.v1alpha.FilterExpression dimension_filter = 4;</code>
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
     * <code>.google.analytics.data.v1alpha.FilterExpression dimension_filter = 4;</code>
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
     * <code>.google.analytics.data.v1alpha.FilterExpression dimension_filter = 4;</code>
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
     * <code>.google.analytics.data.v1alpha.FilterExpression dimension_filter = 4;</code>
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
     * <code>.google.analytics.data.v1alpha.FilterExpression dimension_filter = 4;</code>
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
     * <code>.google.analytics.data.v1alpha.FilterExpression metric_filter = 5;</code>
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
     * <code>.google.analytics.data.v1alpha.FilterExpression metric_filter = 5;</code>
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
     * <code>.google.analytics.data.v1alpha.FilterExpression metric_filter = 5;</code>
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
     * <code>.google.analytics.data.v1alpha.FilterExpression metric_filter = 5;</code>
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
     * <code>.google.analytics.data.v1alpha.FilterExpression metric_filter = 5;</code>
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
     * <code>.google.analytics.data.v1alpha.FilterExpression metric_filter = 5;</code>
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
     * <code>.google.analytics.data.v1alpha.FilterExpression metric_filter = 5;</code>
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
     * <code>.google.analytics.data.v1alpha.FilterExpression metric_filter = 5;</code>
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
     * <code>.google.analytics.data.v1alpha.FilterExpression metric_filter = 5;</code>
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

    private java.util.List<com.google.analytics.data.v1alpha.Pivot> pivots_ =
        java.util.Collections.emptyList();

    private void ensurePivotsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        pivots_ = new java.util.ArrayList<com.google.analytics.data.v1alpha.Pivot>(pivots_);
        bitField0_ |= 0x00000004;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.Pivot,
            com.google.analytics.data.v1alpha.Pivot.Builder,
            com.google.analytics.data.v1alpha.PivotOrBuilder>
        pivotsBuilder_;

    /**
     *
     *
     * <pre>
     * Describes the visual format of the report's dimensions in columns or rows.
     * The union of the fieldNames (dimension names) in all pivots must be a
     * subset of dimension names defined in Dimensions. No two pivots can share a
     * dimension. A dimension is only visible if it appears in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Pivot pivots = 6;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.Pivot> getPivotsList() {
      if (pivotsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(pivots_);
      } else {
        return pivotsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Describes the visual format of the report's dimensions in columns or rows.
     * The union of the fieldNames (dimension names) in all pivots must be a
     * subset of dimension names defined in Dimensions. No two pivots can share a
     * dimension. A dimension is only visible if it appears in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Pivot pivots = 6;</code>
     */
    public int getPivotsCount() {
      if (pivotsBuilder_ == null) {
        return pivots_.size();
      } else {
        return pivotsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Describes the visual format of the report's dimensions in columns or rows.
     * The union of the fieldNames (dimension names) in all pivots must be a
     * subset of dimension names defined in Dimensions. No two pivots can share a
     * dimension. A dimension is only visible if it appears in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Pivot pivots = 6;</code>
     */
    public com.google.analytics.data.v1alpha.Pivot getPivots(int index) {
      if (pivotsBuilder_ == null) {
        return pivots_.get(index);
      } else {
        return pivotsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Describes the visual format of the report's dimensions in columns or rows.
     * The union of the fieldNames (dimension names) in all pivots must be a
     * subset of dimension names defined in Dimensions. No two pivots can share a
     * dimension. A dimension is only visible if it appears in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Pivot pivots = 6;</code>
     */
    public Builder setPivots(int index, com.google.analytics.data.v1alpha.Pivot value) {
      if (pivotsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePivotsIsMutable();
        pivots_.set(index, value);
        onChanged();
      } else {
        pivotsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes the visual format of the report's dimensions in columns or rows.
     * The union of the fieldNames (dimension names) in all pivots must be a
     * subset of dimension names defined in Dimensions. No two pivots can share a
     * dimension. A dimension is only visible if it appears in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Pivot pivots = 6;</code>
     */
    public Builder setPivots(
        int index, com.google.analytics.data.v1alpha.Pivot.Builder builderForValue) {
      if (pivotsBuilder_ == null) {
        ensurePivotsIsMutable();
        pivots_.set(index, builderForValue.build());
        onChanged();
      } else {
        pivotsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes the visual format of the report's dimensions in columns or rows.
     * The union of the fieldNames (dimension names) in all pivots must be a
     * subset of dimension names defined in Dimensions. No two pivots can share a
     * dimension. A dimension is only visible if it appears in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Pivot pivots = 6;</code>
     */
    public Builder addPivots(com.google.analytics.data.v1alpha.Pivot value) {
      if (pivotsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePivotsIsMutable();
        pivots_.add(value);
        onChanged();
      } else {
        pivotsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes the visual format of the report's dimensions in columns or rows.
     * The union of the fieldNames (dimension names) in all pivots must be a
     * subset of dimension names defined in Dimensions. No two pivots can share a
     * dimension. A dimension is only visible if it appears in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Pivot pivots = 6;</code>
     */
    public Builder addPivots(int index, com.google.analytics.data.v1alpha.Pivot value) {
      if (pivotsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePivotsIsMutable();
        pivots_.add(index, value);
        onChanged();
      } else {
        pivotsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes the visual format of the report's dimensions in columns or rows.
     * The union of the fieldNames (dimension names) in all pivots must be a
     * subset of dimension names defined in Dimensions. No two pivots can share a
     * dimension. A dimension is only visible if it appears in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Pivot pivots = 6;</code>
     */
    public Builder addPivots(com.google.analytics.data.v1alpha.Pivot.Builder builderForValue) {
      if (pivotsBuilder_ == null) {
        ensurePivotsIsMutable();
        pivots_.add(builderForValue.build());
        onChanged();
      } else {
        pivotsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes the visual format of the report's dimensions in columns or rows.
     * The union of the fieldNames (dimension names) in all pivots must be a
     * subset of dimension names defined in Dimensions. No two pivots can share a
     * dimension. A dimension is only visible if it appears in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Pivot pivots = 6;</code>
     */
    public Builder addPivots(
        int index, com.google.analytics.data.v1alpha.Pivot.Builder builderForValue) {
      if (pivotsBuilder_ == null) {
        ensurePivotsIsMutable();
        pivots_.add(index, builderForValue.build());
        onChanged();
      } else {
        pivotsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes the visual format of the report's dimensions in columns or rows.
     * The union of the fieldNames (dimension names) in all pivots must be a
     * subset of dimension names defined in Dimensions. No two pivots can share a
     * dimension. A dimension is only visible if it appears in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Pivot pivots = 6;</code>
     */
    public Builder addAllPivots(
        java.lang.Iterable<? extends com.google.analytics.data.v1alpha.Pivot> values) {
      if (pivotsBuilder_ == null) {
        ensurePivotsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, pivots_);
        onChanged();
      } else {
        pivotsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes the visual format of the report's dimensions in columns or rows.
     * The union of the fieldNames (dimension names) in all pivots must be a
     * subset of dimension names defined in Dimensions. No two pivots can share a
     * dimension. A dimension is only visible if it appears in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Pivot pivots = 6;</code>
     */
    public Builder clearPivots() {
      if (pivotsBuilder_ == null) {
        pivots_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        pivotsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes the visual format of the report's dimensions in columns or rows.
     * The union of the fieldNames (dimension names) in all pivots must be a
     * subset of dimension names defined in Dimensions. No two pivots can share a
     * dimension. A dimension is only visible if it appears in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Pivot pivots = 6;</code>
     */
    public Builder removePivots(int index) {
      if (pivotsBuilder_ == null) {
        ensurePivotsIsMutable();
        pivots_.remove(index);
        onChanged();
      } else {
        pivotsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Describes the visual format of the report's dimensions in columns or rows.
     * The union of the fieldNames (dimension names) in all pivots must be a
     * subset of dimension names defined in Dimensions. No two pivots can share a
     * dimension. A dimension is only visible if it appears in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Pivot pivots = 6;</code>
     */
    public com.google.analytics.data.v1alpha.Pivot.Builder getPivotsBuilder(int index) {
      return getPivotsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Describes the visual format of the report's dimensions in columns or rows.
     * The union of the fieldNames (dimension names) in all pivots must be a
     * subset of dimension names defined in Dimensions. No two pivots can share a
     * dimension. A dimension is only visible if it appears in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Pivot pivots = 6;</code>
     */
    public com.google.analytics.data.v1alpha.PivotOrBuilder getPivotsOrBuilder(int index) {
      if (pivotsBuilder_ == null) {
        return pivots_.get(index);
      } else {
        return pivotsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Describes the visual format of the report's dimensions in columns or rows.
     * The union of the fieldNames (dimension names) in all pivots must be a
     * subset of dimension names defined in Dimensions. No two pivots can share a
     * dimension. A dimension is only visible if it appears in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Pivot pivots = 6;</code>
     */
    public java.util.List<? extends com.google.analytics.data.v1alpha.PivotOrBuilder>
        getPivotsOrBuilderList() {
      if (pivotsBuilder_ != null) {
        return pivotsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(pivots_);
      }
    }
    /**
     *
     *
     * <pre>
     * Describes the visual format of the report's dimensions in columns or rows.
     * The union of the fieldNames (dimension names) in all pivots must be a
     * subset of dimension names defined in Dimensions. No two pivots can share a
     * dimension. A dimension is only visible if it appears in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Pivot pivots = 6;</code>
     */
    public com.google.analytics.data.v1alpha.Pivot.Builder addPivotsBuilder() {
      return getPivotsFieldBuilder()
          .addBuilder(com.google.analytics.data.v1alpha.Pivot.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Describes the visual format of the report's dimensions in columns or rows.
     * The union of the fieldNames (dimension names) in all pivots must be a
     * subset of dimension names defined in Dimensions. No two pivots can share a
     * dimension. A dimension is only visible if it appears in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Pivot pivots = 6;</code>
     */
    public com.google.analytics.data.v1alpha.Pivot.Builder addPivotsBuilder(int index) {
      return getPivotsFieldBuilder()
          .addBuilder(index, com.google.analytics.data.v1alpha.Pivot.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Describes the visual format of the report's dimensions in columns or rows.
     * The union of the fieldNames (dimension names) in all pivots must be a
     * subset of dimension names defined in Dimensions. No two pivots can share a
     * dimension. A dimension is only visible if it appears in a pivot.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Pivot pivots = 6;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.Pivot.Builder> getPivotsBuilderList() {
      return getPivotsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.Pivot,
            com.google.analytics.data.v1alpha.Pivot.Builder,
            com.google.analytics.data.v1alpha.PivotOrBuilder>
        getPivotsFieldBuilder() {
      if (pivotsBuilder_ == null) {
        pivotsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.data.v1alpha.Pivot,
                com.google.analytics.data.v1alpha.Pivot.Builder,
                com.google.analytics.data.v1alpha.PivotOrBuilder>(
                pivots_, ((bitField0_ & 0x00000004) != 0), getParentForChildren(), isClean());
        pivots_ = null;
      }
      return pivotsBuilder_;
    }

    private java.util.List<com.google.analytics.data.v1alpha.DateRange> dateRanges_ =
        java.util.Collections.emptyList();

    private void ensureDateRangesIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        dateRanges_ =
            new java.util.ArrayList<com.google.analytics.data.v1alpha.DateRange>(dateRanges_);
        bitField0_ |= 0x00000008;
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
     * The date range to retrieve event data for the report. If multiple date
     * ranges are specified, event data from each date range is used in the
     * report. A special dimension with field name "dateRange" can be included in
     * a Pivot's field names; if included, the report compares between date
     * ranges. In a cohort request, this `dateRanges` must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 7;</code>
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
     * The date range to retrieve event data for the report. If multiple date
     * ranges are specified, event data from each date range is used in the
     * report. A special dimension with field name "dateRange" can be included in
     * a Pivot's field names; if included, the report compares between date
     * ranges. In a cohort request, this `dateRanges` must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 7;</code>
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
     * The date range to retrieve event data for the report. If multiple date
     * ranges are specified, event data from each date range is used in the
     * report. A special dimension with field name "dateRange" can be included in
     * a Pivot's field names; if included, the report compares between date
     * ranges. In a cohort request, this `dateRanges` must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 7;</code>
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
     * The date range to retrieve event data for the report. If multiple date
     * ranges are specified, event data from each date range is used in the
     * report. A special dimension with field name "dateRange" can be included in
     * a Pivot's field names; if included, the report compares between date
     * ranges. In a cohort request, this `dateRanges` must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 7;</code>
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
     * The date range to retrieve event data for the report. If multiple date
     * ranges are specified, event data from each date range is used in the
     * report. A special dimension with field name "dateRange" can be included in
     * a Pivot's field names; if included, the report compares between date
     * ranges. In a cohort request, this `dateRanges` must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 7;</code>
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
     * The date range to retrieve event data for the report. If multiple date
     * ranges are specified, event data from each date range is used in the
     * report. A special dimension with field name "dateRange" can be included in
     * a Pivot's field names; if included, the report compares between date
     * ranges. In a cohort request, this `dateRanges` must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 7;</code>
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
     * The date range to retrieve event data for the report. If multiple date
     * ranges are specified, event data from each date range is used in the
     * report. A special dimension with field name "dateRange" can be included in
     * a Pivot's field names; if included, the report compares between date
     * ranges. In a cohort request, this `dateRanges` must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 7;</code>
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
     * The date range to retrieve event data for the report. If multiple date
     * ranges are specified, event data from each date range is used in the
     * report. A special dimension with field name "dateRange" can be included in
     * a Pivot's field names; if included, the report compares between date
     * ranges. In a cohort request, this `dateRanges` must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 7;</code>
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
     * The date range to retrieve event data for the report. If multiple date
     * ranges are specified, event data from each date range is used in the
     * report. A special dimension with field name "dateRange" can be included in
     * a Pivot's field names; if included, the report compares between date
     * ranges. In a cohort request, this `dateRanges` must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 7;</code>
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
     * The date range to retrieve event data for the report. If multiple date
     * ranges are specified, event data from each date range is used in the
     * report. A special dimension with field name "dateRange" can be included in
     * a Pivot's field names; if included, the report compares between date
     * ranges. In a cohort request, this `dateRanges` must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 7;</code>
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
     * The date range to retrieve event data for the report. If multiple date
     * ranges are specified, event data from each date range is used in the
     * report. A special dimension with field name "dateRange" can be included in
     * a Pivot's field names; if included, the report compares between date
     * ranges. In a cohort request, this `dateRanges` must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 7;</code>
     */
    public Builder clearDateRanges() {
      if (dateRangesBuilder_ == null) {
        dateRanges_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
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
     * The date range to retrieve event data for the report. If multiple date
     * ranges are specified, event data from each date range is used in the
     * report. A special dimension with field name "dateRange" can be included in
     * a Pivot's field names; if included, the report compares between date
     * ranges. In a cohort request, this `dateRanges` must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 7;</code>
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
     * The date range to retrieve event data for the report. If multiple date
     * ranges are specified, event data from each date range is used in the
     * report. A special dimension with field name "dateRange" can be included in
     * a Pivot's field names; if included, the report compares between date
     * ranges. In a cohort request, this `dateRanges` must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 7;</code>
     */
    public com.google.analytics.data.v1alpha.DateRange.Builder getDateRangesBuilder(int index) {
      return getDateRangesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The date range to retrieve event data for the report. If multiple date
     * ranges are specified, event data from each date range is used in the
     * report. A special dimension with field name "dateRange" can be included in
     * a Pivot's field names; if included, the report compares between date
     * ranges. In a cohort request, this `dateRanges` must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 7;</code>
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
     * The date range to retrieve event data for the report. If multiple date
     * ranges are specified, event data from each date range is used in the
     * report. A special dimension with field name "dateRange" can be included in
     * a Pivot's field names; if included, the report compares between date
     * ranges. In a cohort request, this `dateRanges` must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 7;</code>
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
     * The date range to retrieve event data for the report. If multiple date
     * ranges are specified, event data from each date range is used in the
     * report. A special dimension with field name "dateRange" can be included in
     * a Pivot's field names; if included, the report compares between date
     * ranges. In a cohort request, this `dateRanges` must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 7;</code>
     */
    public com.google.analytics.data.v1alpha.DateRange.Builder addDateRangesBuilder() {
      return getDateRangesFieldBuilder()
          .addBuilder(com.google.analytics.data.v1alpha.DateRange.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The date range to retrieve event data for the report. If multiple date
     * ranges are specified, event data from each date range is used in the
     * report. A special dimension with field name "dateRange" can be included in
     * a Pivot's field names; if included, the report compares between date
     * ranges. In a cohort request, this `dateRanges` must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 7;</code>
     */
    public com.google.analytics.data.v1alpha.DateRange.Builder addDateRangesBuilder(int index) {
      return getDateRangesFieldBuilder()
          .addBuilder(index, com.google.analytics.data.v1alpha.DateRange.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The date range to retrieve event data for the report. If multiple date
     * ranges are specified, event data from each date range is used in the
     * report. A special dimension with field name "dateRange" can be included in
     * a Pivot's field names; if included, the report compares between date
     * ranges. In a cohort request, this `dateRanges` must be unspecified.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 7;</code>
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
                dateRanges_, ((bitField0_ & 0x00000008) != 0), getParentForChildren(), isClean());
        dateRanges_ = null;
      }
      return dateRangesBuilder_;
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
     * <code>string currency_code = 8;</code>
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
     * <code>string currency_code = 8;</code>
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
     * <code>string currency_code = 8;</code>
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
     * <code>string currency_code = 8;</code>
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
     * <code>string currency_code = 8;</code>
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
     * <code>.google.analytics.data.v1alpha.CohortSpec cohort_spec = 9;</code>
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
     * <code>.google.analytics.data.v1alpha.CohortSpec cohort_spec = 9;</code>
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
     * <code>.google.analytics.data.v1alpha.CohortSpec cohort_spec = 9;</code>
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
     * <code>.google.analytics.data.v1alpha.CohortSpec cohort_spec = 9;</code>
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
     * <code>.google.analytics.data.v1alpha.CohortSpec cohort_spec = 9;</code>
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
     * <code>.google.analytics.data.v1alpha.CohortSpec cohort_spec = 9;</code>
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
     * <code>.google.analytics.data.v1alpha.CohortSpec cohort_spec = 9;</code>
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
     * <code>.google.analytics.data.v1alpha.CohortSpec cohort_spec = 9;</code>
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
     * <code>.google.analytics.data.v1alpha.CohortSpec cohort_spec = 9;</code>
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
     * <code>bool keep_empty_rows = 10;</code>
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
     * <code>bool keep_empty_rows = 10;</code>
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
     * <code>bool keep_empty_rows = 10;</code>
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
     * <code>bool return_property_quota = 11;</code>
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
     * <code>bool return_property_quota = 11;</code>
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
     * <code>bool return_property_quota = 11;</code>
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.RunPivotReportRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.RunPivotReportRequest)
  private static final com.google.analytics.data.v1alpha.RunPivotReportRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.RunPivotReportRequest();
  }

  public static com.google.analytics.data.v1alpha.RunPivotReportRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RunPivotReportRequest> PARSER =
      new com.google.protobuf.AbstractParser<RunPivotReportRequest>() {
        @java.lang.Override
        public RunPivotReportRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new RunPivotReportRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<RunPivotReportRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RunPivotReportRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.RunPivotReportRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
