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

public interface FilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.Filter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The dimension name or metric name. Must be a name defined in dimensions
   * or metrics.
   * </pre>
   *
   * <code>string field_name = 1;</code>
   *
   * @return The fieldName.
   */
  java.lang.String getFieldName();
  /**
   *
   *
   * <pre>
   * The dimension name or metric name. Must be a name defined in dimensions
   * or metrics.
   * </pre>
   *
   * <code>string field_name = 1;</code>
   *
   * @return The bytes for fieldName.
   */
  com.google.protobuf.ByteString getFieldNameBytes();

  /**
   *
   *
   * <pre>
   * A filter for null values. If True, a null dimension value is matched by
   * this filter. Null filter is commonly used inside a NOT filter
   * expression. For example, a NOT expression of a null filter removes rows
   * when a dimension is null.
   * </pre>
   *
   * <code>bool null_filter = 2;</code>
   *
   * @return The nullFilter.
   */
  boolean getNullFilter();

  /**
   *
   *
   * <pre>
   * Strings related filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter.StringFilter string_filter = 3;</code>
   *
   * @return Whether the stringFilter field is set.
   */
  boolean hasStringFilter();
  /**
   *
   *
   * <pre>
   * Strings related filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter.StringFilter string_filter = 3;</code>
   *
   * @return The stringFilter.
   */
  com.google.analytics.data.v1alpha.Filter.StringFilter getStringFilter();
  /**
   *
   *
   * <pre>
   * Strings related filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter.StringFilter string_filter = 3;</code>
   */
  com.google.analytics.data.v1alpha.Filter.StringFilterOrBuilder getStringFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * A filter for in list values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter.InListFilter in_list_filter = 4;</code>
   *
   * @return Whether the inListFilter field is set.
   */
  boolean hasInListFilter();
  /**
   *
   *
   * <pre>
   * A filter for in list values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter.InListFilter in_list_filter = 4;</code>
   *
   * @return The inListFilter.
   */
  com.google.analytics.data.v1alpha.Filter.InListFilter getInListFilter();
  /**
   *
   *
   * <pre>
   * A filter for in list values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter.InListFilter in_list_filter = 4;</code>
   */
  com.google.analytics.data.v1alpha.Filter.InListFilterOrBuilder getInListFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * A filter for numeric or date values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter.NumericFilter numeric_filter = 5;</code>
   *
   * @return Whether the numericFilter field is set.
   */
  boolean hasNumericFilter();
  /**
   *
   *
   * <pre>
   * A filter for numeric or date values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter.NumericFilter numeric_filter = 5;</code>
   *
   * @return The numericFilter.
   */
  com.google.analytics.data.v1alpha.Filter.NumericFilter getNumericFilter();
  /**
   *
   *
   * <pre>
   * A filter for numeric or date values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter.NumericFilter numeric_filter = 5;</code>
   */
  com.google.analytics.data.v1alpha.Filter.NumericFilterOrBuilder getNumericFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * A filter for two values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter.BetweenFilter between_filter = 6;</code>
   *
   * @return Whether the betweenFilter field is set.
   */
  boolean hasBetweenFilter();
  /**
   *
   *
   * <pre>
   * A filter for two values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter.BetweenFilter between_filter = 6;</code>
   *
   * @return The betweenFilter.
   */
  com.google.analytics.data.v1alpha.Filter.BetweenFilter getBetweenFilter();
  /**
   *
   *
   * <pre>
   * A filter for two values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter.BetweenFilter between_filter = 6;</code>
   */
  com.google.analytics.data.v1alpha.Filter.BetweenFilterOrBuilder getBetweenFilterOrBuilder();

  public com.google.analytics.data.v1alpha.Filter.OneFilterCase getOneFilterCase();
}
