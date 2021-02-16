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

public interface MetricMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.MetricMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A metric name. Useable in [Metric](#Metric)'s `name`. For example,
   * `eventCount`.
   * </pre>
   *
   * <code>string api_name = 1;</code>
   *
   * @return The apiName.
   */
  java.lang.String getApiName();
  /**
   *
   *
   * <pre>
   * A metric name. Useable in [Metric](#Metric)'s `name`. For example,
   * `eventCount`.
   * </pre>
   *
   * <code>string api_name = 1;</code>
   *
   * @return The bytes for apiName.
   */
  com.google.protobuf.ByteString getApiNameBytes();

  /**
   *
   *
   * <pre>
   * This metric's name within the Google Analytics user interface. For example,
   * `Event count`.
   * </pre>
   *
   * <code>string ui_name = 2;</code>
   *
   * @return The uiName.
   */
  java.lang.String getUiName();
  /**
   *
   *
   * <pre>
   * This metric's name within the Google Analytics user interface. For example,
   * `Event count`.
   * </pre>
   *
   * <code>string ui_name = 2;</code>
   *
   * @return The bytes for uiName.
   */
  com.google.protobuf.ByteString getUiNameBytes();

  /**
   *
   *
   * <pre>
   * Description of how this metric is used and calculated.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Description of how this metric is used and calculated.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Still usable but deprecated names for this metric. If populated, this
   * metric is available by either `apiName` or one of `deprecatedApiNames`
   * for a period of time. After the deprecation period, the metric will be
   * available only by `apiName`.
   * </pre>
   *
   * <code>repeated string deprecated_api_names = 4;</code>
   *
   * @return A list containing the deprecatedApiNames.
   */
  java.util.List<java.lang.String> getDeprecatedApiNamesList();
  /**
   *
   *
   * <pre>
   * Still usable but deprecated names for this metric. If populated, this
   * metric is available by either `apiName` or one of `deprecatedApiNames`
   * for a period of time. After the deprecation period, the metric will be
   * available only by `apiName`.
   * </pre>
   *
   * <code>repeated string deprecated_api_names = 4;</code>
   *
   * @return The count of deprecatedApiNames.
   */
  int getDeprecatedApiNamesCount();
  /**
   *
   *
   * <pre>
   * Still usable but deprecated names for this metric. If populated, this
   * metric is available by either `apiName` or one of `deprecatedApiNames`
   * for a period of time. After the deprecation period, the metric will be
   * available only by `apiName`.
   * </pre>
   *
   * <code>repeated string deprecated_api_names = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The deprecatedApiNames at the given index.
   */
  java.lang.String getDeprecatedApiNames(int index);
  /**
   *
   *
   * <pre>
   * Still usable but deprecated names for this metric. If populated, this
   * metric is available by either `apiName` or one of `deprecatedApiNames`
   * for a period of time. After the deprecation period, the metric will be
   * available only by `apiName`.
   * </pre>
   *
   * <code>repeated string deprecated_api_names = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the deprecatedApiNames at the given index.
   */
  com.google.protobuf.ByteString getDeprecatedApiNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * The type of this metric.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.MetricType type = 5;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * The type of this metric.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.MetricType type = 5;</code>
   *
   * @return The type.
   */
  com.google.analytics.data.v1alpha.MetricType getType();

  /**
   *
   *
   * <pre>
   * The mathematical expression for this derived metric. Can be used in
   * [Metric](#Metric)'s `expression` field for equivalent reports. Most metrics
   * are not expressions, and for non-expressions, this field is empty.
   * </pre>
   *
   * <code>string expression = 6;</code>
   *
   * @return The expression.
   */
  java.lang.String getExpression();
  /**
   *
   *
   * <pre>
   * The mathematical expression for this derived metric. Can be used in
   * [Metric](#Metric)'s `expression` field for equivalent reports. Most metrics
   * are not expressions, and for non-expressions, this field is empty.
   * </pre>
   *
   * <code>string expression = 6;</code>
   *
   * @return The bytes for expression.
   */
  com.google.protobuf.ByteString getExpressionBytes();

  /**
   *
   *
   * <pre>
   * True if the metric is a custom metric for this property.
   * </pre>
   *
   * <code>bool custom_definition = 7;</code>
   *
   * @return The customDefinition.
   */
  boolean getCustomDefinition();
}
