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

public interface RunPivotReportRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.RunPivotReportRequest)
    com.google.protobuf.MessageOrBuilder {

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
  boolean hasEntity();
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
  com.google.analytics.data.v1alpha.Entity getEntity();
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
  com.google.analytics.data.v1alpha.EntityOrBuilder getEntityOrBuilder();

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
  java.util.List<com.google.analytics.data.v1alpha.Dimension> getDimensionsList();
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
  com.google.analytics.data.v1alpha.Dimension getDimensions(int index);
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
  int getDimensionsCount();
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
  java.util.List<? extends com.google.analytics.data.v1alpha.DimensionOrBuilder>
      getDimensionsOrBuilderList();
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
  com.google.analytics.data.v1alpha.DimensionOrBuilder getDimensionsOrBuilder(int index);

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
  java.util.List<com.google.analytics.data.v1alpha.Metric> getMetricsList();
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
  com.google.analytics.data.v1alpha.Metric getMetrics(int index);
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
  int getMetricsCount();
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
  java.util.List<? extends com.google.analytics.data.v1alpha.MetricOrBuilder>
      getMetricsOrBuilderList();
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
  com.google.analytics.data.v1alpha.MetricOrBuilder getMetricsOrBuilder(int index);

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
  boolean hasDimensionFilter();
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
  com.google.analytics.data.v1alpha.FilterExpression getDimensionFilter();
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
  com.google.analytics.data.v1alpha.FilterExpressionOrBuilder getDimensionFilterOrBuilder();

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
  boolean hasMetricFilter();
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
  com.google.analytics.data.v1alpha.FilterExpression getMetricFilter();
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
  com.google.analytics.data.v1alpha.FilterExpressionOrBuilder getMetricFilterOrBuilder();

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
  java.util.List<com.google.analytics.data.v1alpha.Pivot> getPivotsList();
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
  com.google.analytics.data.v1alpha.Pivot getPivots(int index);
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
  int getPivotsCount();
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
  java.util.List<? extends com.google.analytics.data.v1alpha.PivotOrBuilder>
      getPivotsOrBuilderList();
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
  com.google.analytics.data.v1alpha.PivotOrBuilder getPivotsOrBuilder(int index);

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
  java.util.List<com.google.analytics.data.v1alpha.DateRange> getDateRangesList();
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
  com.google.analytics.data.v1alpha.DateRange getDateRanges(int index);
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
  int getDateRangesCount();
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
  java.util.List<? extends com.google.analytics.data.v1alpha.DateRangeOrBuilder>
      getDateRangesOrBuilderList();
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
  com.google.analytics.data.v1alpha.DateRangeOrBuilder getDateRangesOrBuilder(int index);

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
  java.lang.String getCurrencyCode();
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
  com.google.protobuf.ByteString getCurrencyCodeBytes();

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
  boolean hasCohortSpec();
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
  com.google.analytics.data.v1alpha.CohortSpec getCohortSpec();
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
  com.google.analytics.data.v1alpha.CohortSpecOrBuilder getCohortSpecOrBuilder();

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
  boolean getKeepEmptyRows();

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
  boolean getReturnPropertyQuota();
}
