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

public interface RunPivotReportResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.RunPivotReportResponse)
    com.google.protobuf.MessageOrBuilder {

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
  java.util.List<com.google.analytics.data.v1alpha.PivotHeader> getPivotHeadersList();
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
  com.google.analytics.data.v1alpha.PivotHeader getPivotHeaders(int index);
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
  int getPivotHeadersCount();
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
  java.util.List<? extends com.google.analytics.data.v1alpha.PivotHeaderOrBuilder>
      getPivotHeadersOrBuilderList();
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
  com.google.analytics.data.v1alpha.PivotHeaderOrBuilder getPivotHeadersOrBuilder(int index);

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
  java.util.List<com.google.analytics.data.v1alpha.DimensionHeader> getDimensionHeadersList();
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
  com.google.analytics.data.v1alpha.DimensionHeader getDimensionHeaders(int index);
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
  int getDimensionHeadersCount();
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
  java.util.List<? extends com.google.analytics.data.v1alpha.DimensionHeaderOrBuilder>
      getDimensionHeadersOrBuilderList();
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
  com.google.analytics.data.v1alpha.DimensionHeaderOrBuilder getDimensionHeadersOrBuilder(
      int index);

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
  java.util.List<com.google.analytics.data.v1alpha.MetricHeader> getMetricHeadersList();
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
  com.google.analytics.data.v1alpha.MetricHeader getMetricHeaders(int index);
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
  int getMetricHeadersCount();
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
  java.util.List<? extends com.google.analytics.data.v1alpha.MetricHeaderOrBuilder>
      getMetricHeadersOrBuilderList();
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
  com.google.analytics.data.v1alpha.MetricHeaderOrBuilder getMetricHeadersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Rows of dimension value combinations and metric values in the report.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
   */
  java.util.List<com.google.analytics.data.v1alpha.Row> getRowsList();
  /**
   *
   *
   * <pre>
   * Rows of dimension value combinations and metric values in the report.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
   */
  com.google.analytics.data.v1alpha.Row getRows(int index);
  /**
   *
   *
   * <pre>
   * Rows of dimension value combinations and metric values in the report.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
   */
  int getRowsCount();
  /**
   *
   *
   * <pre>
   * Rows of dimension value combinations and metric values in the report.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1alpha.RowOrBuilder> getRowsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Rows of dimension value combinations and metric values in the report.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row rows = 3;</code>
   */
  com.google.analytics.data.v1alpha.RowOrBuilder getRowsOrBuilder(int index);

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
  java.util.List<com.google.analytics.data.v1alpha.Row> getAggregatesList();
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
  com.google.analytics.data.v1alpha.Row getAggregates(int index);
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
  int getAggregatesCount();
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
  java.util.List<? extends com.google.analytics.data.v1alpha.RowOrBuilder>
      getAggregatesOrBuilderList();
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
  com.google.analytics.data.v1alpha.RowOrBuilder getAggregatesOrBuilder(int index);

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
  boolean hasMetadata();
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
  com.google.analytics.data.v1alpha.ResponseMetaData getMetadata();
  /**
   *
   *
   * <pre>
   * Metadata for the report.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.ResponseMetaData metadata = 5;</code>
   */
  com.google.analytics.data.v1alpha.ResponseMetaDataOrBuilder getMetadataOrBuilder();

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
  boolean hasPropertyQuota();
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
  com.google.analytics.data.v1alpha.PropertyQuota getPropertyQuota();
  /**
   *
   *
   * <pre>
   * This Analytics Property's quota state including this request.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 6;</code>
   */
  com.google.analytics.data.v1alpha.PropertyQuotaOrBuilder getPropertyQuotaOrBuilder();
}
