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
// source: google/analytics/data/v1beta/data.proto

package com.google.analytics.data.v1beta;

public interface MetricCompatibilityOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1beta.MetricCompatibility)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The metric metadata contains the API name for this compatibility
   * information. The metric metadata also contains other helpful information
   * like the UI name and description.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.MetricMetadata metric_metadata = 1;</code>
   *
   * @return Whether the metricMetadata field is set.
   */
  boolean hasMetricMetadata();
  /**
   *
   *
   * <pre>
   * The metric metadata contains the API name for this compatibility
   * information. The metric metadata also contains other helpful information
   * like the UI name and description.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.MetricMetadata metric_metadata = 1;</code>
   *
   * @return The metricMetadata.
   */
  com.google.analytics.data.v1beta.MetricMetadata getMetricMetadata();
  /**
   *
   *
   * <pre>
   * The metric metadata contains the API name for this compatibility
   * information. The metric metadata also contains other helpful information
   * like the UI name and description.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.MetricMetadata metric_metadata = 1;</code>
   */
  com.google.analytics.data.v1beta.MetricMetadataOrBuilder getMetricMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * The compatibility of this metric. If the compatibility is COMPATIBLE,
   * this metric can be successfully added to the report.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.Compatibility compatibility = 2;</code>
   *
   * @return Whether the compatibility field is set.
   */
  boolean hasCompatibility();
  /**
   *
   *
   * <pre>
   * The compatibility of this metric. If the compatibility is COMPATIBLE,
   * this metric can be successfully added to the report.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.Compatibility compatibility = 2;</code>
   *
   * @return The enum numeric value on the wire for compatibility.
   */
  int getCompatibilityValue();
  /**
   *
   *
   * <pre>
   * The compatibility of this metric. If the compatibility is COMPATIBLE,
   * this metric can be successfully added to the report.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.Compatibility compatibility = 2;</code>
   *
   * @return The compatibility.
   */
  com.google.analytics.data.v1beta.Compatibility getCompatibility();
}