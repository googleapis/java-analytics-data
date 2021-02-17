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

public interface DateRangeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.DateRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The inclusive start date for the query in the format `YYYY-MM-DD`. Cannot
   * be after `end_date`. The format `NdaysAgo`, `yesterday`, or `today` is also
   * accepted, and in that case, the date is inferred based on the property's
   * reporting time zone.
   * </pre>
   *
   * <code>string start_date = 1;</code>
   *
   * @return The startDate.
   */
  java.lang.String getStartDate();
  /**
   *
   *
   * <pre>
   * The inclusive start date for the query in the format `YYYY-MM-DD`. Cannot
   * be after `end_date`. The format `NdaysAgo`, `yesterday`, or `today` is also
   * accepted, and in that case, the date is inferred based on the property's
   * reporting time zone.
   * </pre>
   *
   * <code>string start_date = 1;</code>
   *
   * @return The bytes for startDate.
   */
  com.google.protobuf.ByteString getStartDateBytes();

  /**
   *
   *
   * <pre>
   * The inclusive end date for the query in the format `YYYY-MM-DD`. Cannot
   * be before `start_date`. The format `NdaysAgo`, `yesterday`, or `today` is
   * also accepted, and in that case, the date is inferred based on the
   * property's reporting time zone.
   * </pre>
   *
   * <code>string end_date = 2;</code>
   *
   * @return The endDate.
   */
  java.lang.String getEndDate();
  /**
   *
   *
   * <pre>
   * The inclusive end date for the query in the format `YYYY-MM-DD`. Cannot
   * be before `start_date`. The format `NdaysAgo`, `yesterday`, or `today` is
   * also accepted, and in that case, the date is inferred based on the
   * property's reporting time zone.
   * </pre>
   *
   * <code>string end_date = 2;</code>
   *
   * @return The bytes for endDate.
   */
  com.google.protobuf.ByteString getEndDateBytes();

  /**
   *
   *
   * <pre>
   * Assigns a name to this date range. The dimension `dateRange` is valued to
   * this name in a report response. If set, cannot begin with `date_range_` or
   * `RESERVED_`. If not set, date ranges are named by their zero based index in
   * the request: `date_range_0`, `date_range_1`, etc.
   * </pre>
   *
   * <code>string name = 3;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Assigns a name to this date range. The dimension `dateRange` is valued to
   * this name in a report response. If set, cannot begin with `date_range_` or
   * `RESERVED_`. If not set, date ranges are named by their zero based index in
   * the request: `date_range_0`, `date_range_1`, etc.
   * </pre>
   *
   * <code>string name = 3;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
