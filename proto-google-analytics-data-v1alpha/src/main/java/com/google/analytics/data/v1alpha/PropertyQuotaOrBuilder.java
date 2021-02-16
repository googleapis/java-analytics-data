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

public interface PropertyQuotaOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.PropertyQuota)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Standard Analytics Properties can use up to 25,000 tokens per day;
   * Analytics 360 Properties can use 250,000 tokens per day. Most requests
   * consume fewer than 10 tokens.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.QuotaStatus tokens_per_day = 1;</code>
   *
   * @return Whether the tokensPerDay field is set.
   */
  boolean hasTokensPerDay();
  /**
   *
   *
   * <pre>
   * Standard Analytics Properties can use up to 25,000 tokens per day;
   * Analytics 360 Properties can use 250,000 tokens per day. Most requests
   * consume fewer than 10 tokens.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.QuotaStatus tokens_per_day = 1;</code>
   *
   * @return The tokensPerDay.
   */
  com.google.analytics.data.v1alpha.QuotaStatus getTokensPerDay();
  /**
   *
   *
   * <pre>
   * Standard Analytics Properties can use up to 25,000 tokens per day;
   * Analytics 360 Properties can use 250,000 tokens per day. Most requests
   * consume fewer than 10 tokens.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.QuotaStatus tokens_per_day = 1;</code>
   */
  com.google.analytics.data.v1alpha.QuotaStatusOrBuilder getTokensPerDayOrBuilder();

  /**
   *
   *
   * <pre>
   * Standard Analytics Properties can use up to 5,000 tokens per day; Analytics
   * 360 Properties can use 50,000 tokens per day. An API request consumes a
   * single number of tokens, and that number is deducted from both the hourly
   * and daily quotas.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.QuotaStatus tokens_per_hour = 2;</code>
   *
   * @return Whether the tokensPerHour field is set.
   */
  boolean hasTokensPerHour();
  /**
   *
   *
   * <pre>
   * Standard Analytics Properties can use up to 5,000 tokens per day; Analytics
   * 360 Properties can use 50,000 tokens per day. An API request consumes a
   * single number of tokens, and that number is deducted from both the hourly
   * and daily quotas.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.QuotaStatus tokens_per_hour = 2;</code>
   *
   * @return The tokensPerHour.
   */
  com.google.analytics.data.v1alpha.QuotaStatus getTokensPerHour();
  /**
   *
   *
   * <pre>
   * Standard Analytics Properties can use up to 5,000 tokens per day; Analytics
   * 360 Properties can use 50,000 tokens per day. An API request consumes a
   * single number of tokens, and that number is deducted from both the hourly
   * and daily quotas.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.QuotaStatus tokens_per_hour = 2;</code>
   */
  com.google.analytics.data.v1alpha.QuotaStatusOrBuilder getTokensPerHourOrBuilder();

  /**
   *
   *
   * <pre>
   * Standard Analytics Properties can send up to 10 concurrent requests;
   * Analytics 360 Properties can use up to 50 concurrent requests.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.QuotaStatus concurrent_requests = 3;</code>
   *
   * @return Whether the concurrentRequests field is set.
   */
  boolean hasConcurrentRequests();
  /**
   *
   *
   * <pre>
   * Standard Analytics Properties can send up to 10 concurrent requests;
   * Analytics 360 Properties can use up to 50 concurrent requests.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.QuotaStatus concurrent_requests = 3;</code>
   *
   * @return The concurrentRequests.
   */
  com.google.analytics.data.v1alpha.QuotaStatus getConcurrentRequests();
  /**
   *
   *
   * <pre>
   * Standard Analytics Properties can send up to 10 concurrent requests;
   * Analytics 360 Properties can use up to 50 concurrent requests.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.QuotaStatus concurrent_requests = 3;</code>
   */
  com.google.analytics.data.v1alpha.QuotaStatusOrBuilder getConcurrentRequestsOrBuilder();

  /**
   *
   *
   * <pre>
   * Standard Analytics Properties and cloud project pairs can have up to 10
   * server errors per hour; Analytics 360 Properties and cloud project pairs
   * can have up to 50 server errors per hour.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.QuotaStatus server_errors_per_project_per_hour = 4;</code>
   *
   * @return Whether the serverErrorsPerProjectPerHour field is set.
   */
  boolean hasServerErrorsPerProjectPerHour();
  /**
   *
   *
   * <pre>
   * Standard Analytics Properties and cloud project pairs can have up to 10
   * server errors per hour; Analytics 360 Properties and cloud project pairs
   * can have up to 50 server errors per hour.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.QuotaStatus server_errors_per_project_per_hour = 4;</code>
   *
   * @return The serverErrorsPerProjectPerHour.
   */
  com.google.analytics.data.v1alpha.QuotaStatus getServerErrorsPerProjectPerHour();
  /**
   *
   *
   * <pre>
   * Standard Analytics Properties and cloud project pairs can have up to 10
   * server errors per hour; Analytics 360 Properties and cloud project pairs
   * can have up to 50 server errors per hour.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.QuotaStatus server_errors_per_project_per_hour = 4;</code>
   */
  com.google.analytics.data.v1alpha.QuotaStatusOrBuilder
      getServerErrorsPerProjectPerHourOrBuilder();
}
