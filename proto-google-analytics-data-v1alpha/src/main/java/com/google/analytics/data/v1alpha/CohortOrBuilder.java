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

public interface CohortOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.Cohort)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Assigns a name to this cohort. The dimension `cohort` is valued to this
   * name in a report response. If set, cannot begin with `cohort_` or
   * `RESERVED_`. If not set, cohorts are named by their zero based index
   * `cohort_0`, `cohort_1`, etc.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Assigns a name to this cohort. The dimension `cohort` is valued to this
   * name in a report response. If set, cannot begin with `cohort_` or
   * `RESERVED_`. If not set, cohorts are named by their zero based index
   * `cohort_0`, `cohort_1`, etc.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Dimension used by the cohort. Required and only supports `firstTouchDate`.
   * </pre>
   *
   * <code>string dimension = 2;</code>
   *
   * @return The dimension.
   */
  java.lang.String getDimension();
  /**
   *
   *
   * <pre>
   * Dimension used by the cohort. Required and only supports `firstTouchDate`.
   * </pre>
   *
   * <code>string dimension = 2;</code>
   *
   * @return The bytes for dimension.
   */
  com.google.protobuf.ByteString getDimensionBytes();

  /**
   *
   *
   * <pre>
   * The cohort selects users whose first touch date is between start date and
   * end date defined in the `dateRange`. This `dateRange` does not specify the
   * full date range of event data that is present in a cohort report. In a
   * cohort report, this `dateRange` is extended by the granularity and offset
   * present in the `cohortsRange`; event data for the extended reporting date
   * range is present in a cohort report.
   * In a cohort request, this `dateRange` is required and the `dateRanges` in
   * the `RunReportRequest` or `RunPivotReportRequest` must be unspecified.
   * This `dateRange` should generally be aligned with the cohort's granularity.
   * If `CohortsRange` uses daily granularity, this `dateRange` can be a single
   * day. If `CohortsRange` uses weekly granularity, this `dateRange` can be
   * aligned to a week boundary, starting at Sunday and ending Saturday. If
   * `CohortsRange` uses monthly granularity, this `dateRange` can be aligned to
   * a month, starting at the first and ending on the last day of the month.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.DateRange date_range = 3;</code>
   *
   * @return Whether the dateRange field is set.
   */
  boolean hasDateRange();
  /**
   *
   *
   * <pre>
   * The cohort selects users whose first touch date is between start date and
   * end date defined in the `dateRange`. This `dateRange` does not specify the
   * full date range of event data that is present in a cohort report. In a
   * cohort report, this `dateRange` is extended by the granularity and offset
   * present in the `cohortsRange`; event data for the extended reporting date
   * range is present in a cohort report.
   * In a cohort request, this `dateRange` is required and the `dateRanges` in
   * the `RunReportRequest` or `RunPivotReportRequest` must be unspecified.
   * This `dateRange` should generally be aligned with the cohort's granularity.
   * If `CohortsRange` uses daily granularity, this `dateRange` can be a single
   * day. If `CohortsRange` uses weekly granularity, this `dateRange` can be
   * aligned to a week boundary, starting at Sunday and ending Saturday. If
   * `CohortsRange` uses monthly granularity, this `dateRange` can be aligned to
   * a month, starting at the first and ending on the last day of the month.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.DateRange date_range = 3;</code>
   *
   * @return The dateRange.
   */
  com.google.analytics.data.v1alpha.DateRange getDateRange();
  /**
   *
   *
   * <pre>
   * The cohort selects users whose first touch date is between start date and
   * end date defined in the `dateRange`. This `dateRange` does not specify the
   * full date range of event data that is present in a cohort report. In a
   * cohort report, this `dateRange` is extended by the granularity and offset
   * present in the `cohortsRange`; event data for the extended reporting date
   * range is present in a cohort report.
   * In a cohort request, this `dateRange` is required and the `dateRanges` in
   * the `RunReportRequest` or `RunPivotReportRequest` must be unspecified.
   * This `dateRange` should generally be aligned with the cohort's granularity.
   * If `CohortsRange` uses daily granularity, this `dateRange` can be a single
   * day. If `CohortsRange` uses weekly granularity, this `dateRange` can be
   * aligned to a week boundary, starting at Sunday and ending Saturday. If
   * `CohortsRange` uses monthly granularity, this `dateRange` can be aligned to
   * a month, starting at the first and ending on the last day of the month.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.DateRange date_range = 3;</code>
   */
  com.google.analytics.data.v1alpha.DateRangeOrBuilder getDateRangeOrBuilder();
}
