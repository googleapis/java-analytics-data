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

public interface RowOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.Row)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of requested dimension values. In a PivotReport, dimension_values
   * are only listed for dimensions included in a pivot.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
   */
  java.util.List<com.google.analytics.data.v1alpha.DimensionValue> getDimensionValuesList();
  /**
   *
   *
   * <pre>
   * List of requested dimension values. In a PivotReport, dimension_values
   * are only listed for dimensions included in a pivot.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
   */
  com.google.analytics.data.v1alpha.DimensionValue getDimensionValues(int index);
  /**
   *
   *
   * <pre>
   * List of requested dimension values. In a PivotReport, dimension_values
   * are only listed for dimensions included in a pivot.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
   */
  int getDimensionValuesCount();
  /**
   *
   *
   * <pre>
   * List of requested dimension values. In a PivotReport, dimension_values
   * are only listed for dimensions included in a pivot.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1alpha.DimensionValueOrBuilder>
      getDimensionValuesOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of requested dimension values. In a PivotReport, dimension_values
   * are only listed for dimensions included in a pivot.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionValue dimension_values = 1;</code>
   */
  com.google.analytics.data.v1alpha.DimensionValueOrBuilder getDimensionValuesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * List of requested visible metric values.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
   */
  java.util.List<com.google.analytics.data.v1alpha.MetricValue> getMetricValuesList();
  /**
   *
   *
   * <pre>
   * List of requested visible metric values.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
   */
  com.google.analytics.data.v1alpha.MetricValue getMetricValues(int index);
  /**
   *
   *
   * <pre>
   * List of requested visible metric values.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
   */
  int getMetricValuesCount();
  /**
   *
   *
   * <pre>
   * List of requested visible metric values.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1alpha.MetricValueOrBuilder>
      getMetricValuesOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of requested visible metric values.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricValue metric_values = 2;</code>
   */
  com.google.analytics.data.v1alpha.MetricValueOrBuilder getMetricValuesOrBuilder(int index);
}
