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
// source: google/analytics/data/v1beta/analytics_data_api.proto

package com.google.analytics.data.v1beta;

public interface RunReportRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1beta.RunReportRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A Google Analytics GA4 property identifier whose events are tracked.
   * Specified in the URL path and not the body. To learn more, see [where to
   * find your Property
   * ID](https://developers.google.com/analytics/devguides/reporting/data/v1/property-id).
   * Within a batch request, this property should either be unspecified or
   * consistent with the batch-level property.
   * Example: properties/1234
   * </pre>
   *
   * <code>string property = 1;</code>
   *
   * @return The property.
   */
  java.lang.String getProperty();
  /**
   *
   *
   * <pre>
   * A Google Analytics GA4 property identifier whose events are tracked.
   * Specified in the URL path and not the body. To learn more, see [where to
   * find your Property
   * ID](https://developers.google.com/analytics/devguides/reporting/data/v1/property-id).
   * Within a batch request, this property should either be unspecified or
   * consistent with the batch-level property.
   * Example: properties/1234
   * </pre>
   *
   * <code>string property = 1;</code>
   *
   * @return The bytes for property.
   */
  com.google.protobuf.ByteString getPropertyBytes();

  /**
   *
   *
   * <pre>
   * The dimensions requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.Dimension dimensions = 2;</code>
   */
  java.util.List<com.google.analytics.data.v1beta.Dimension> getDimensionsList();
  /**
   *
   *
   * <pre>
   * The dimensions requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.Dimension dimensions = 2;</code>
   */
  com.google.analytics.data.v1beta.Dimension getDimensions(int index);
  /**
   *
   *
   * <pre>
   * The dimensions requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.Dimension dimensions = 2;</code>
   */
  int getDimensionsCount();
  /**
   *
   *
   * <pre>
   * The dimensions requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.Dimension dimensions = 2;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1beta.DimensionOrBuilder>
      getDimensionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The dimensions requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.Dimension dimensions = 2;</code>
   */
  com.google.analytics.data.v1beta.DimensionOrBuilder getDimensionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The metrics requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.Metric metrics = 3;</code>
   */
  java.util.List<com.google.analytics.data.v1beta.Metric> getMetricsList();
  /**
   *
   *
   * <pre>
   * The metrics requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.Metric metrics = 3;</code>
   */
  com.google.analytics.data.v1beta.Metric getMetrics(int index);
  /**
   *
   *
   * <pre>
   * The metrics requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.Metric metrics = 3;</code>
   */
  int getMetricsCount();
  /**
   *
   *
   * <pre>
   * The metrics requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.Metric metrics = 3;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1beta.MetricOrBuilder>
      getMetricsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The metrics requested and displayed.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.Metric metrics = 3;</code>
   */
  com.google.analytics.data.v1beta.MetricOrBuilder getMetricsOrBuilder(int index);

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
   * <code>repeated .google.analytics.data.v1beta.DateRange date_ranges = 4;</code>
   */
  java.util.List<com.google.analytics.data.v1beta.DateRange> getDateRangesList();
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
   * <code>repeated .google.analytics.data.v1beta.DateRange date_ranges = 4;</code>
   */
  com.google.analytics.data.v1beta.DateRange getDateRanges(int index);
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
   * <code>repeated .google.analytics.data.v1beta.DateRange date_ranges = 4;</code>
   */
  int getDateRangesCount();
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
   * <code>repeated .google.analytics.data.v1beta.DateRange date_ranges = 4;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1beta.DateRangeOrBuilder>
      getDateRangesOrBuilderList();
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
   * <code>repeated .google.analytics.data.v1beta.DateRange date_ranges = 4;</code>
   */
  com.google.analytics.data.v1beta.DateRangeOrBuilder getDateRangesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The filter clause of dimensions. Dimensions must be requested to be used in
   * this filter. Metrics cannot be used in this filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.FilterExpression dimension_filter = 5;</code>
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
   * <code>.google.analytics.data.v1beta.FilterExpression dimension_filter = 5;</code>
   *
   * @return The dimensionFilter.
   */
  com.google.analytics.data.v1beta.FilterExpression getDimensionFilter();
  /**
   *
   *
   * <pre>
   * The filter clause of dimensions. Dimensions must be requested to be used in
   * this filter. Metrics cannot be used in this filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.FilterExpression dimension_filter = 5;</code>
   */
  com.google.analytics.data.v1beta.FilterExpressionOrBuilder getDimensionFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * The filter clause of metrics. Applied at post aggregation phase, similar to
   * SQL having-clause. Metrics must be requested to be used in this filter.
   * Dimensions cannot be used in this filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.FilterExpression metric_filter = 6;</code>
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
   * <code>.google.analytics.data.v1beta.FilterExpression metric_filter = 6;</code>
   *
   * @return The metricFilter.
   */
  com.google.analytics.data.v1beta.FilterExpression getMetricFilter();
  /**
   *
   *
   * <pre>
   * The filter clause of metrics. Applied at post aggregation phase, similar to
   * SQL having-clause. Metrics must be requested to be used in this filter.
   * Dimensions cannot be used in this filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.FilterExpression metric_filter = 6;</code>
   */
  com.google.analytics.data.v1beta.FilterExpressionOrBuilder getMetricFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * Page size is for paging and specifies maximum number of rows to return. The
   * API returns a maximum of 200,000 rows per request, no matter how many you
   * ask for. Page size must be positive.
   * The API can also return fewer rows than the requested `pageSize`, if there
   * aren't as many dimension values as the `pageSize`. For instance, there are
   * fewer than 300 possible values for the dimension `country`, so when
   * reporting on only `country`, you can't get more than 300 rows, even if you
   * set `pageSize` to a higher value.
   * To learn more about this pagination parameter, see
   * [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
   * </pre>
   *
   * <code>int32 page_size = 7;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A continuation token to get the next page of the results. Adding this to
   * the request will return the next page of rows after the `pageToken`. The
   * `pageToken` should be the value returned in the `nextPageToken` parameter
   * in the response.
   * When paginating, all other parameters specified in `RunReportRequest` must
   * match the call that provided the page token.
   * To learn more about this pagination parameter, see
   * [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
   * </pre>
   *
   * <code>string page_token = 8;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * A continuation token to get the next page of the results. Adding this to
   * the request will return the next page of rows after the `pageToken`. The
   * `pageToken` should be the value returned in the `nextPageToken` parameter
   * in the response.
   * When paginating, all other parameters specified in `RunReportRequest` must
   * match the call that provided the page token.
   * To learn more about this pagination parameter, see
   * [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
   * </pre>
   *
   * <code>string page_token = 8;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Aggregation of metrics. Aggregated metric values will be shown in rows
   * where the dimension_values are set to "RESERVED_(MetricAggregation)".
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.MetricAggregation metric_aggregations = 9;</code>
   *
   * @return A list containing the metricAggregations.
   */
  java.util.List<com.google.analytics.data.v1beta.MetricAggregation> getMetricAggregationsList();
  /**
   *
   *
   * <pre>
   * Aggregation of metrics. Aggregated metric values will be shown in rows
   * where the dimension_values are set to "RESERVED_(MetricAggregation)".
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.MetricAggregation metric_aggregations = 9;</code>
   *
   * @return The count of metricAggregations.
   */
  int getMetricAggregationsCount();
  /**
   *
   *
   * <pre>
   * Aggregation of metrics. Aggregated metric values will be shown in rows
   * where the dimension_values are set to "RESERVED_(MetricAggregation)".
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.MetricAggregation metric_aggregations = 9;</code>
   *
   * @param index The index of the element to return.
   * @return The metricAggregations at the given index.
   */
  com.google.analytics.data.v1beta.MetricAggregation getMetricAggregations(int index);
  /**
   *
   *
   * <pre>
   * Aggregation of metrics. Aggregated metric values will be shown in rows
   * where the dimension_values are set to "RESERVED_(MetricAggregation)".
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.MetricAggregation metric_aggregations = 9;</code>
   *
   * @return A list containing the enum numeric values on the wire for metricAggregations.
   */
  java.util.List<java.lang.Integer> getMetricAggregationsValueList();
  /**
   *
   *
   * <pre>
   * Aggregation of metrics. Aggregated metric values will be shown in rows
   * where the dimension_values are set to "RESERVED_(MetricAggregation)".
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.MetricAggregation metric_aggregations = 9;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of metricAggregations at the given index.
   */
  int getMetricAggregationsValue(int index);

  /**
   *
   *
   * <pre>
   * Specifies how rows are ordered in the response.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.OrderBy order_bys = 10;</code>
   */
  java.util.List<com.google.analytics.data.v1beta.OrderBy> getOrderBysList();
  /**
   *
   *
   * <pre>
   * Specifies how rows are ordered in the response.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.OrderBy order_bys = 10;</code>
   */
  com.google.analytics.data.v1beta.OrderBy getOrderBys(int index);
  /**
   *
   *
   * <pre>
   * Specifies how rows are ordered in the response.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.OrderBy order_bys = 10;</code>
   */
  int getOrderBysCount();
  /**
   *
   *
   * <pre>
   * Specifies how rows are ordered in the response.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.OrderBy order_bys = 10;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1beta.OrderByOrBuilder>
      getOrderBysOrBuilderList();
  /**
   *
   *
   * <pre>
   * Specifies how rows are ordered in the response.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.OrderBy order_bys = 10;</code>
   */
  com.google.analytics.data.v1beta.OrderByOrBuilder getOrderBysOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A currency code in ISO4217 format, such as "AED", "USD", "JPY".
   * If the field is empty, the report uses the property's default currency.
   * </pre>
   *
   * <code>string currency_code = 11;</code>
   *
   * @return The currencyCode.
   */
  java.lang.String getCurrencyCode();
  /**
   *
   *
   * <pre>
   * A currency code in ISO4217 format, such as "AED", "USD", "JPY".
   * If the field is empty, the report uses the property's default currency.
   * </pre>
   *
   * <code>string currency_code = 11;</code>
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
   * <code>.google.analytics.data.v1beta.CohortSpec cohort_spec = 12;</code>
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
   * <code>.google.analytics.data.v1beta.CohortSpec cohort_spec = 12;</code>
   *
   * @return The cohortSpec.
   */
  com.google.analytics.data.v1beta.CohortSpec getCohortSpec();
  /**
   *
   *
   * <pre>
   * Cohort group associated with this request. If there is a cohort group
   * in the request the 'cohort' dimension must be present.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.CohortSpec cohort_spec = 12;</code>
   */
  com.google.analytics.data.v1beta.CohortSpecOrBuilder getCohortSpecOrBuilder();

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
  boolean getKeepEmptyRows();

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
  boolean getReturnPropertyQuota();
}
