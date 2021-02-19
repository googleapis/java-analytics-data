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

public interface RunReportResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.RunReportResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Describes dimension columns. The number of DimensionHeaders and ordering of
   * DimensionHeaders matches the dimensions present in rows.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 11;</code>
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
   * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 11;</code>
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
   * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 11;</code>
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
   * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 11;</code>
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
   * <code>repeated .google.analytics.data.v1alpha.DimensionHeader dimension_headers = 11;</code>
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
   * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 1;</code>
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
   * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 1;</code>
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
   * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 1;</code>
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
   * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 1;</code>
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
   * <code>repeated .google.analytics.data.v1alpha.MetricHeader metric_headers = 1;</code>
   */
  com.google.analytics.data.v1alpha.MetricHeaderOrBuilder getMetricHeadersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Rows of dimension value combinations and metric values in the report.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row rows = 2;</code>
   */
  java.util.List<com.google.analytics.data.v1alpha.Row> getRowsList();
  /**
   *
   *
   * <pre>
   * Rows of dimension value combinations and metric values in the report.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row rows = 2;</code>
   */
  com.google.analytics.data.v1alpha.Row getRows(int index);
  /**
   *
   *
   * <pre>
   * Rows of dimension value combinations and metric values in the report.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row rows = 2;</code>
   */
  int getRowsCount();
  /**
   *
   *
   * <pre>
   * Rows of dimension value combinations and metric values in the report.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row rows = 2;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1alpha.RowOrBuilder> getRowsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Rows of dimension value combinations and metric values in the report.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row rows = 2;</code>
   */
  com.google.analytics.data.v1alpha.RowOrBuilder getRowsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If requested, the totaled values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row totals = 8;</code>
   */
  java.util.List<com.google.analytics.data.v1alpha.Row> getTotalsList();
  /**
   *
   *
   * <pre>
   * If requested, the totaled values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row totals = 8;</code>
   */
  com.google.analytics.data.v1alpha.Row getTotals(int index);
  /**
   *
   *
   * <pre>
   * If requested, the totaled values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row totals = 8;</code>
   */
  int getTotalsCount();
  /**
   *
   *
   * <pre>
   * If requested, the totaled values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row totals = 8;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1alpha.RowOrBuilder> getTotalsOrBuilderList();
  /**
   *
   *
   * <pre>
   * If requested, the totaled values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row totals = 8;</code>
   */
  com.google.analytics.data.v1alpha.RowOrBuilder getTotalsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If requested, the maximum values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row maximums = 9;</code>
   */
  java.util.List<com.google.analytics.data.v1alpha.Row> getMaximumsList();
  /**
   *
   *
   * <pre>
   * If requested, the maximum values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row maximums = 9;</code>
   */
  com.google.analytics.data.v1alpha.Row getMaximums(int index);
  /**
   *
   *
   * <pre>
   * If requested, the maximum values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row maximums = 9;</code>
   */
  int getMaximumsCount();
  /**
   *
   *
   * <pre>
   * If requested, the maximum values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row maximums = 9;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1alpha.RowOrBuilder>
      getMaximumsOrBuilderList();
  /**
   *
   *
   * <pre>
   * If requested, the maximum values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row maximums = 9;</code>
   */
  com.google.analytics.data.v1alpha.RowOrBuilder getMaximumsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If requested, the minimum values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row minimums = 10;</code>
   */
  java.util.List<com.google.analytics.data.v1alpha.Row> getMinimumsList();
  /**
   *
   *
   * <pre>
   * If requested, the minimum values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row minimums = 10;</code>
   */
  com.google.analytics.data.v1alpha.Row getMinimums(int index);
  /**
   *
   *
   * <pre>
   * If requested, the minimum values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row minimums = 10;</code>
   */
  int getMinimumsCount();
  /**
   *
   *
   * <pre>
   * If requested, the minimum values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row minimums = 10;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1alpha.RowOrBuilder>
      getMinimumsOrBuilderList();
  /**
   *
   *
   * <pre>
   * If requested, the minimum values of metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Row minimums = 10;</code>
   */
  com.google.analytics.data.v1alpha.RowOrBuilder getMinimumsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The total number of rows in the query result, regardless of the number of
   * rows returned in the response. For example if a query returns 175 rows and
   * includes limit = 50 in the API request, the response will contain row_count
   * = 175 but only 50 rows.
   * To learn more about this pagination parameter, see
   * [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
   * </pre>
   *
   * <code>int32 row_count = 12;</code>
   *
   * @return The rowCount.
   */
  int getRowCount();

  /**
   *
   *
   * <pre>
   * Metadata for the report.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.ResponseMetaData metadata = 6;</code>
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
   * <code>.google.analytics.data.v1alpha.ResponseMetaData metadata = 6;</code>
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
   * <code>.google.analytics.data.v1alpha.ResponseMetaData metadata = 6;</code>
   */
  com.google.analytics.data.v1alpha.ResponseMetaDataOrBuilder getMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * This Analytics Property's quota state including this request.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 7;</code>
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
   * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 7;</code>
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
   * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 7;</code>
   */
  com.google.analytics.data.v1alpha.PropertyQuotaOrBuilder getPropertyQuotaOrBuilder();
}
