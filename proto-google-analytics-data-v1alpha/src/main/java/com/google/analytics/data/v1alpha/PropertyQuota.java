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

/**
 *
 *
 * <pre>
 * Current state of all quotas for this Analytics Property. If any quota for a
 * property is exhausted, all requests to that property will return Resource
 * Exhausted errors.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.PropertyQuota}
 */
public final class PropertyQuota extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.PropertyQuota)
    PropertyQuotaOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PropertyQuota.newBuilder() to construct.
  private PropertyQuota(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PropertyQuota() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PropertyQuota();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private PropertyQuota(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              com.google.analytics.data.v1alpha.QuotaStatus.Builder subBuilder = null;
              if (tokensPerDay_ != null) {
                subBuilder = tokensPerDay_.toBuilder();
              }
              tokensPerDay_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.QuotaStatus.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(tokensPerDay_);
                tokensPerDay_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.analytics.data.v1alpha.QuotaStatus.Builder subBuilder = null;
              if (tokensPerHour_ != null) {
                subBuilder = tokensPerHour_.toBuilder();
              }
              tokensPerHour_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.QuotaStatus.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(tokensPerHour_);
                tokensPerHour_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              com.google.analytics.data.v1alpha.QuotaStatus.Builder subBuilder = null;
              if (concurrentRequests_ != null) {
                subBuilder = concurrentRequests_.toBuilder();
              }
              concurrentRequests_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.QuotaStatus.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(concurrentRequests_);
                concurrentRequests_ = subBuilder.buildPartial();
              }

              break;
            }
          case 34:
            {
              com.google.analytics.data.v1alpha.QuotaStatus.Builder subBuilder = null;
              if (serverErrorsPerProjectPerHour_ != null) {
                subBuilder = serverErrorsPerProjectPerHour_.toBuilder();
              }
              serverErrorsPerProjectPerHour_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.QuotaStatus.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(serverErrorsPerProjectPerHour_);
                serverErrorsPerProjectPerHour_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_PropertyQuota_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_PropertyQuota_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.PropertyQuota.class,
            com.google.analytics.data.v1alpha.PropertyQuota.Builder.class);
  }

  public static final int TOKENS_PER_DAY_FIELD_NUMBER = 1;
  private com.google.analytics.data.v1alpha.QuotaStatus tokensPerDay_;
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
  @java.lang.Override
  public boolean hasTokensPerDay() {
    return tokensPerDay_ != null;
  }
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
  @java.lang.Override
  public com.google.analytics.data.v1alpha.QuotaStatus getTokensPerDay() {
    return tokensPerDay_ == null
        ? com.google.analytics.data.v1alpha.QuotaStatus.getDefaultInstance()
        : tokensPerDay_;
  }
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
  @java.lang.Override
  public com.google.analytics.data.v1alpha.QuotaStatusOrBuilder getTokensPerDayOrBuilder() {
    return getTokensPerDay();
  }

  public static final int TOKENS_PER_HOUR_FIELD_NUMBER = 2;
  private com.google.analytics.data.v1alpha.QuotaStatus tokensPerHour_;
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
  @java.lang.Override
  public boolean hasTokensPerHour() {
    return tokensPerHour_ != null;
  }
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
  @java.lang.Override
  public com.google.analytics.data.v1alpha.QuotaStatus getTokensPerHour() {
    return tokensPerHour_ == null
        ? com.google.analytics.data.v1alpha.QuotaStatus.getDefaultInstance()
        : tokensPerHour_;
  }
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
  @java.lang.Override
  public com.google.analytics.data.v1alpha.QuotaStatusOrBuilder getTokensPerHourOrBuilder() {
    return getTokensPerHour();
  }

  public static final int CONCURRENT_REQUESTS_FIELD_NUMBER = 3;
  private com.google.analytics.data.v1alpha.QuotaStatus concurrentRequests_;
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
  @java.lang.Override
  public boolean hasConcurrentRequests() {
    return concurrentRequests_ != null;
  }
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
  @java.lang.Override
  public com.google.analytics.data.v1alpha.QuotaStatus getConcurrentRequests() {
    return concurrentRequests_ == null
        ? com.google.analytics.data.v1alpha.QuotaStatus.getDefaultInstance()
        : concurrentRequests_;
  }
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
  @java.lang.Override
  public com.google.analytics.data.v1alpha.QuotaStatusOrBuilder getConcurrentRequestsOrBuilder() {
    return getConcurrentRequests();
  }

  public static final int SERVER_ERRORS_PER_PROJECT_PER_HOUR_FIELD_NUMBER = 4;
  private com.google.analytics.data.v1alpha.QuotaStatus serverErrorsPerProjectPerHour_;
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
  @java.lang.Override
  public boolean hasServerErrorsPerProjectPerHour() {
    return serverErrorsPerProjectPerHour_ != null;
  }
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
  @java.lang.Override
  public com.google.analytics.data.v1alpha.QuotaStatus getServerErrorsPerProjectPerHour() {
    return serverErrorsPerProjectPerHour_ == null
        ? com.google.analytics.data.v1alpha.QuotaStatus.getDefaultInstance()
        : serverErrorsPerProjectPerHour_;
  }
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
  @java.lang.Override
  public com.google.analytics.data.v1alpha.QuotaStatusOrBuilder
      getServerErrorsPerProjectPerHourOrBuilder() {
    return getServerErrorsPerProjectPerHour();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (tokensPerDay_ != null) {
      output.writeMessage(1, getTokensPerDay());
    }
    if (tokensPerHour_ != null) {
      output.writeMessage(2, getTokensPerHour());
    }
    if (concurrentRequests_ != null) {
      output.writeMessage(3, getConcurrentRequests());
    }
    if (serverErrorsPerProjectPerHour_ != null) {
      output.writeMessage(4, getServerErrorsPerProjectPerHour());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tokensPerDay_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTokensPerDay());
    }
    if (tokensPerHour_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getTokensPerHour());
    }
    if (concurrentRequests_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getConcurrentRequests());
    }
    if (serverErrorsPerProjectPerHour_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              4, getServerErrorsPerProjectPerHour());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.analytics.data.v1alpha.PropertyQuota)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.PropertyQuota other =
        (com.google.analytics.data.v1alpha.PropertyQuota) obj;

    if (hasTokensPerDay() != other.hasTokensPerDay()) return false;
    if (hasTokensPerDay()) {
      if (!getTokensPerDay().equals(other.getTokensPerDay())) return false;
    }
    if (hasTokensPerHour() != other.hasTokensPerHour()) return false;
    if (hasTokensPerHour()) {
      if (!getTokensPerHour().equals(other.getTokensPerHour())) return false;
    }
    if (hasConcurrentRequests() != other.hasConcurrentRequests()) return false;
    if (hasConcurrentRequests()) {
      if (!getConcurrentRequests().equals(other.getConcurrentRequests())) return false;
    }
    if (hasServerErrorsPerProjectPerHour() != other.hasServerErrorsPerProjectPerHour())
      return false;
    if (hasServerErrorsPerProjectPerHour()) {
      if (!getServerErrorsPerProjectPerHour().equals(other.getServerErrorsPerProjectPerHour()))
        return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasTokensPerDay()) {
      hash = (37 * hash) + TOKENS_PER_DAY_FIELD_NUMBER;
      hash = (53 * hash) + getTokensPerDay().hashCode();
    }
    if (hasTokensPerHour()) {
      hash = (37 * hash) + TOKENS_PER_HOUR_FIELD_NUMBER;
      hash = (53 * hash) + getTokensPerHour().hashCode();
    }
    if (hasConcurrentRequests()) {
      hash = (37 * hash) + CONCURRENT_REQUESTS_FIELD_NUMBER;
      hash = (53 * hash) + getConcurrentRequests().hashCode();
    }
    if (hasServerErrorsPerProjectPerHour()) {
      hash = (37 * hash) + SERVER_ERRORS_PER_PROJECT_PER_HOUR_FIELD_NUMBER;
      hash = (53 * hash) + getServerErrorsPerProjectPerHour().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.PropertyQuota parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.PropertyQuota parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.PropertyQuota parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.PropertyQuota parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.PropertyQuota parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.PropertyQuota parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.PropertyQuota parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.PropertyQuota parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.PropertyQuota parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.PropertyQuota parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.PropertyQuota parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.PropertyQuota parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.analytics.data.v1alpha.PropertyQuota prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Current state of all quotas for this Analytics Property. If any quota for a
   * property is exhausted, all requests to that property will return Resource
   * Exhausted errors.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.PropertyQuota}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.PropertyQuota)
      com.google.analytics.data.v1alpha.PropertyQuotaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_PropertyQuota_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_PropertyQuota_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.PropertyQuota.class,
              com.google.analytics.data.v1alpha.PropertyQuota.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.PropertyQuota.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (tokensPerDayBuilder_ == null) {
        tokensPerDay_ = null;
      } else {
        tokensPerDay_ = null;
        tokensPerDayBuilder_ = null;
      }
      if (tokensPerHourBuilder_ == null) {
        tokensPerHour_ = null;
      } else {
        tokensPerHour_ = null;
        tokensPerHourBuilder_ = null;
      }
      if (concurrentRequestsBuilder_ == null) {
        concurrentRequests_ = null;
      } else {
        concurrentRequests_ = null;
        concurrentRequestsBuilder_ = null;
      }
      if (serverErrorsPerProjectPerHourBuilder_ == null) {
        serverErrorsPerProjectPerHour_ = null;
      } else {
        serverErrorsPerProjectPerHour_ = null;
        serverErrorsPerProjectPerHourBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_PropertyQuota_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.PropertyQuota getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.PropertyQuota.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.PropertyQuota build() {
      com.google.analytics.data.v1alpha.PropertyQuota result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.PropertyQuota buildPartial() {
      com.google.analytics.data.v1alpha.PropertyQuota result =
          new com.google.analytics.data.v1alpha.PropertyQuota(this);
      if (tokensPerDayBuilder_ == null) {
        result.tokensPerDay_ = tokensPerDay_;
      } else {
        result.tokensPerDay_ = tokensPerDayBuilder_.build();
      }
      if (tokensPerHourBuilder_ == null) {
        result.tokensPerHour_ = tokensPerHour_;
      } else {
        result.tokensPerHour_ = tokensPerHourBuilder_.build();
      }
      if (concurrentRequestsBuilder_ == null) {
        result.concurrentRequests_ = concurrentRequests_;
      } else {
        result.concurrentRequests_ = concurrentRequestsBuilder_.build();
      }
      if (serverErrorsPerProjectPerHourBuilder_ == null) {
        result.serverErrorsPerProjectPerHour_ = serverErrorsPerProjectPerHour_;
      } else {
        result.serverErrorsPerProjectPerHour_ = serverErrorsPerProjectPerHourBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.analytics.data.v1alpha.PropertyQuota) {
        return mergeFrom((com.google.analytics.data.v1alpha.PropertyQuota) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.PropertyQuota other) {
      if (other == com.google.analytics.data.v1alpha.PropertyQuota.getDefaultInstance())
        return this;
      if (other.hasTokensPerDay()) {
        mergeTokensPerDay(other.getTokensPerDay());
      }
      if (other.hasTokensPerHour()) {
        mergeTokensPerHour(other.getTokensPerHour());
      }
      if (other.hasConcurrentRequests()) {
        mergeConcurrentRequests(other.getConcurrentRequests());
      }
      if (other.hasServerErrorsPerProjectPerHour()) {
        mergeServerErrorsPerProjectPerHour(other.getServerErrorsPerProjectPerHour());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.analytics.data.v1alpha.PropertyQuota parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.analytics.data.v1alpha.PropertyQuota) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.analytics.data.v1alpha.QuotaStatus tokensPerDay_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.QuotaStatus,
            com.google.analytics.data.v1alpha.QuotaStatus.Builder,
            com.google.analytics.data.v1alpha.QuotaStatusOrBuilder>
        tokensPerDayBuilder_;
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
    public boolean hasTokensPerDay() {
      return tokensPerDayBuilder_ != null || tokensPerDay_ != null;
    }
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
    public com.google.analytics.data.v1alpha.QuotaStatus getTokensPerDay() {
      if (tokensPerDayBuilder_ == null) {
        return tokensPerDay_ == null
            ? com.google.analytics.data.v1alpha.QuotaStatus.getDefaultInstance()
            : tokensPerDay_;
      } else {
        return tokensPerDayBuilder_.getMessage();
      }
    }
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
    public Builder setTokensPerDay(com.google.analytics.data.v1alpha.QuotaStatus value) {
      if (tokensPerDayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tokensPerDay_ = value;
        onChanged();
      } else {
        tokensPerDayBuilder_.setMessage(value);
      }

      return this;
    }
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
    public Builder setTokensPerDay(
        com.google.analytics.data.v1alpha.QuotaStatus.Builder builderForValue) {
      if (tokensPerDayBuilder_ == null) {
        tokensPerDay_ = builderForValue.build();
        onChanged();
      } else {
        tokensPerDayBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
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
    public Builder mergeTokensPerDay(com.google.analytics.data.v1alpha.QuotaStatus value) {
      if (tokensPerDayBuilder_ == null) {
        if (tokensPerDay_ != null) {
          tokensPerDay_ =
              com.google.analytics.data.v1alpha.QuotaStatus.newBuilder(tokensPerDay_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          tokensPerDay_ = value;
        }
        onChanged();
      } else {
        tokensPerDayBuilder_.mergeFrom(value);
      }

      return this;
    }
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
    public Builder clearTokensPerDay() {
      if (tokensPerDayBuilder_ == null) {
        tokensPerDay_ = null;
        onChanged();
      } else {
        tokensPerDay_ = null;
        tokensPerDayBuilder_ = null;
      }

      return this;
    }
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
    public com.google.analytics.data.v1alpha.QuotaStatus.Builder getTokensPerDayBuilder() {

      onChanged();
      return getTokensPerDayFieldBuilder().getBuilder();
    }
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
    public com.google.analytics.data.v1alpha.QuotaStatusOrBuilder getTokensPerDayOrBuilder() {
      if (tokensPerDayBuilder_ != null) {
        return tokensPerDayBuilder_.getMessageOrBuilder();
      } else {
        return tokensPerDay_ == null
            ? com.google.analytics.data.v1alpha.QuotaStatus.getDefaultInstance()
            : tokensPerDay_;
      }
    }
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
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.QuotaStatus,
            com.google.analytics.data.v1alpha.QuotaStatus.Builder,
            com.google.analytics.data.v1alpha.QuotaStatusOrBuilder>
        getTokensPerDayFieldBuilder() {
      if (tokensPerDayBuilder_ == null) {
        tokensPerDayBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.QuotaStatus,
                com.google.analytics.data.v1alpha.QuotaStatus.Builder,
                com.google.analytics.data.v1alpha.QuotaStatusOrBuilder>(
                getTokensPerDay(), getParentForChildren(), isClean());
        tokensPerDay_ = null;
      }
      return tokensPerDayBuilder_;
    }

    private com.google.analytics.data.v1alpha.QuotaStatus tokensPerHour_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.QuotaStatus,
            com.google.analytics.data.v1alpha.QuotaStatus.Builder,
            com.google.analytics.data.v1alpha.QuotaStatusOrBuilder>
        tokensPerHourBuilder_;
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
    public boolean hasTokensPerHour() {
      return tokensPerHourBuilder_ != null || tokensPerHour_ != null;
    }
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
    public com.google.analytics.data.v1alpha.QuotaStatus getTokensPerHour() {
      if (tokensPerHourBuilder_ == null) {
        return tokensPerHour_ == null
            ? com.google.analytics.data.v1alpha.QuotaStatus.getDefaultInstance()
            : tokensPerHour_;
      } else {
        return tokensPerHourBuilder_.getMessage();
      }
    }
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
    public Builder setTokensPerHour(com.google.analytics.data.v1alpha.QuotaStatus value) {
      if (tokensPerHourBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tokensPerHour_ = value;
        onChanged();
      } else {
        tokensPerHourBuilder_.setMessage(value);
      }

      return this;
    }
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
    public Builder setTokensPerHour(
        com.google.analytics.data.v1alpha.QuotaStatus.Builder builderForValue) {
      if (tokensPerHourBuilder_ == null) {
        tokensPerHour_ = builderForValue.build();
        onChanged();
      } else {
        tokensPerHourBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
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
    public Builder mergeTokensPerHour(com.google.analytics.data.v1alpha.QuotaStatus value) {
      if (tokensPerHourBuilder_ == null) {
        if (tokensPerHour_ != null) {
          tokensPerHour_ =
              com.google.analytics.data.v1alpha.QuotaStatus.newBuilder(tokensPerHour_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          tokensPerHour_ = value;
        }
        onChanged();
      } else {
        tokensPerHourBuilder_.mergeFrom(value);
      }

      return this;
    }
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
    public Builder clearTokensPerHour() {
      if (tokensPerHourBuilder_ == null) {
        tokensPerHour_ = null;
        onChanged();
      } else {
        tokensPerHour_ = null;
        tokensPerHourBuilder_ = null;
      }

      return this;
    }
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
    public com.google.analytics.data.v1alpha.QuotaStatus.Builder getTokensPerHourBuilder() {

      onChanged();
      return getTokensPerHourFieldBuilder().getBuilder();
    }
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
    public com.google.analytics.data.v1alpha.QuotaStatusOrBuilder getTokensPerHourOrBuilder() {
      if (tokensPerHourBuilder_ != null) {
        return tokensPerHourBuilder_.getMessageOrBuilder();
      } else {
        return tokensPerHour_ == null
            ? com.google.analytics.data.v1alpha.QuotaStatus.getDefaultInstance()
            : tokensPerHour_;
      }
    }
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
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.QuotaStatus,
            com.google.analytics.data.v1alpha.QuotaStatus.Builder,
            com.google.analytics.data.v1alpha.QuotaStatusOrBuilder>
        getTokensPerHourFieldBuilder() {
      if (tokensPerHourBuilder_ == null) {
        tokensPerHourBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.QuotaStatus,
                com.google.analytics.data.v1alpha.QuotaStatus.Builder,
                com.google.analytics.data.v1alpha.QuotaStatusOrBuilder>(
                getTokensPerHour(), getParentForChildren(), isClean());
        tokensPerHour_ = null;
      }
      return tokensPerHourBuilder_;
    }

    private com.google.analytics.data.v1alpha.QuotaStatus concurrentRequests_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.QuotaStatus,
            com.google.analytics.data.v1alpha.QuotaStatus.Builder,
            com.google.analytics.data.v1alpha.QuotaStatusOrBuilder>
        concurrentRequestsBuilder_;
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
    public boolean hasConcurrentRequests() {
      return concurrentRequestsBuilder_ != null || concurrentRequests_ != null;
    }
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
    public com.google.analytics.data.v1alpha.QuotaStatus getConcurrentRequests() {
      if (concurrentRequestsBuilder_ == null) {
        return concurrentRequests_ == null
            ? com.google.analytics.data.v1alpha.QuotaStatus.getDefaultInstance()
            : concurrentRequests_;
      } else {
        return concurrentRequestsBuilder_.getMessage();
      }
    }
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
    public Builder setConcurrentRequests(com.google.analytics.data.v1alpha.QuotaStatus value) {
      if (concurrentRequestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        concurrentRequests_ = value;
        onChanged();
      } else {
        concurrentRequestsBuilder_.setMessage(value);
      }

      return this;
    }
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
    public Builder setConcurrentRequests(
        com.google.analytics.data.v1alpha.QuotaStatus.Builder builderForValue) {
      if (concurrentRequestsBuilder_ == null) {
        concurrentRequests_ = builderForValue.build();
        onChanged();
      } else {
        concurrentRequestsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
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
    public Builder mergeConcurrentRequests(com.google.analytics.data.v1alpha.QuotaStatus value) {
      if (concurrentRequestsBuilder_ == null) {
        if (concurrentRequests_ != null) {
          concurrentRequests_ =
              com.google.analytics.data.v1alpha.QuotaStatus.newBuilder(concurrentRequests_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          concurrentRequests_ = value;
        }
        onChanged();
      } else {
        concurrentRequestsBuilder_.mergeFrom(value);
      }

      return this;
    }
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
    public Builder clearConcurrentRequests() {
      if (concurrentRequestsBuilder_ == null) {
        concurrentRequests_ = null;
        onChanged();
      } else {
        concurrentRequests_ = null;
        concurrentRequestsBuilder_ = null;
      }

      return this;
    }
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
    public com.google.analytics.data.v1alpha.QuotaStatus.Builder getConcurrentRequestsBuilder() {

      onChanged();
      return getConcurrentRequestsFieldBuilder().getBuilder();
    }
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
    public com.google.analytics.data.v1alpha.QuotaStatusOrBuilder getConcurrentRequestsOrBuilder() {
      if (concurrentRequestsBuilder_ != null) {
        return concurrentRequestsBuilder_.getMessageOrBuilder();
      } else {
        return concurrentRequests_ == null
            ? com.google.analytics.data.v1alpha.QuotaStatus.getDefaultInstance()
            : concurrentRequests_;
      }
    }
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
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.QuotaStatus,
            com.google.analytics.data.v1alpha.QuotaStatus.Builder,
            com.google.analytics.data.v1alpha.QuotaStatusOrBuilder>
        getConcurrentRequestsFieldBuilder() {
      if (concurrentRequestsBuilder_ == null) {
        concurrentRequestsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.QuotaStatus,
                com.google.analytics.data.v1alpha.QuotaStatus.Builder,
                com.google.analytics.data.v1alpha.QuotaStatusOrBuilder>(
                getConcurrentRequests(), getParentForChildren(), isClean());
        concurrentRequests_ = null;
      }
      return concurrentRequestsBuilder_;
    }

    private com.google.analytics.data.v1alpha.QuotaStatus serverErrorsPerProjectPerHour_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.QuotaStatus,
            com.google.analytics.data.v1alpha.QuotaStatus.Builder,
            com.google.analytics.data.v1alpha.QuotaStatusOrBuilder>
        serverErrorsPerProjectPerHourBuilder_;
    /**
     *
     *
     * <pre>
     * Standard Analytics Properties and cloud project pairs can have up to 10
     * server errors per hour; Analytics 360 Properties and cloud project pairs
     * can have up to 50 server errors per hour.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.QuotaStatus server_errors_per_project_per_hour = 4;
     * </code>
     *
     * @return Whether the serverErrorsPerProjectPerHour field is set.
     */
    public boolean hasServerErrorsPerProjectPerHour() {
      return serverErrorsPerProjectPerHourBuilder_ != null
          || serverErrorsPerProjectPerHour_ != null;
    }
    /**
     *
     *
     * <pre>
     * Standard Analytics Properties and cloud project pairs can have up to 10
     * server errors per hour; Analytics 360 Properties and cloud project pairs
     * can have up to 50 server errors per hour.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.QuotaStatus server_errors_per_project_per_hour = 4;
     * </code>
     *
     * @return The serverErrorsPerProjectPerHour.
     */
    public com.google.analytics.data.v1alpha.QuotaStatus getServerErrorsPerProjectPerHour() {
      if (serverErrorsPerProjectPerHourBuilder_ == null) {
        return serverErrorsPerProjectPerHour_ == null
            ? com.google.analytics.data.v1alpha.QuotaStatus.getDefaultInstance()
            : serverErrorsPerProjectPerHour_;
      } else {
        return serverErrorsPerProjectPerHourBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Standard Analytics Properties and cloud project pairs can have up to 10
     * server errors per hour; Analytics 360 Properties and cloud project pairs
     * can have up to 50 server errors per hour.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.QuotaStatus server_errors_per_project_per_hour = 4;
     * </code>
     */
    public Builder setServerErrorsPerProjectPerHour(
        com.google.analytics.data.v1alpha.QuotaStatus value) {
      if (serverErrorsPerProjectPerHourBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        serverErrorsPerProjectPerHour_ = value;
        onChanged();
      } else {
        serverErrorsPerProjectPerHourBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Standard Analytics Properties and cloud project pairs can have up to 10
     * server errors per hour; Analytics 360 Properties and cloud project pairs
     * can have up to 50 server errors per hour.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.QuotaStatus server_errors_per_project_per_hour = 4;
     * </code>
     */
    public Builder setServerErrorsPerProjectPerHour(
        com.google.analytics.data.v1alpha.QuotaStatus.Builder builderForValue) {
      if (serverErrorsPerProjectPerHourBuilder_ == null) {
        serverErrorsPerProjectPerHour_ = builderForValue.build();
        onChanged();
      } else {
        serverErrorsPerProjectPerHourBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Standard Analytics Properties and cloud project pairs can have up to 10
     * server errors per hour; Analytics 360 Properties and cloud project pairs
     * can have up to 50 server errors per hour.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.QuotaStatus server_errors_per_project_per_hour = 4;
     * </code>
     */
    public Builder mergeServerErrorsPerProjectPerHour(
        com.google.analytics.data.v1alpha.QuotaStatus value) {
      if (serverErrorsPerProjectPerHourBuilder_ == null) {
        if (serverErrorsPerProjectPerHour_ != null) {
          serverErrorsPerProjectPerHour_ =
              com.google.analytics.data.v1alpha.QuotaStatus.newBuilder(
                      serverErrorsPerProjectPerHour_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          serverErrorsPerProjectPerHour_ = value;
        }
        onChanged();
      } else {
        serverErrorsPerProjectPerHourBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Standard Analytics Properties and cloud project pairs can have up to 10
     * server errors per hour; Analytics 360 Properties and cloud project pairs
     * can have up to 50 server errors per hour.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.QuotaStatus server_errors_per_project_per_hour = 4;
     * </code>
     */
    public Builder clearServerErrorsPerProjectPerHour() {
      if (serverErrorsPerProjectPerHourBuilder_ == null) {
        serverErrorsPerProjectPerHour_ = null;
        onChanged();
      } else {
        serverErrorsPerProjectPerHour_ = null;
        serverErrorsPerProjectPerHourBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Standard Analytics Properties and cloud project pairs can have up to 10
     * server errors per hour; Analytics 360 Properties and cloud project pairs
     * can have up to 50 server errors per hour.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.QuotaStatus server_errors_per_project_per_hour = 4;
     * </code>
     */
    public com.google.analytics.data.v1alpha.QuotaStatus.Builder
        getServerErrorsPerProjectPerHourBuilder() {

      onChanged();
      return getServerErrorsPerProjectPerHourFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Standard Analytics Properties and cloud project pairs can have up to 10
     * server errors per hour; Analytics 360 Properties and cloud project pairs
     * can have up to 50 server errors per hour.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.QuotaStatus server_errors_per_project_per_hour = 4;
     * </code>
     */
    public com.google.analytics.data.v1alpha.QuotaStatusOrBuilder
        getServerErrorsPerProjectPerHourOrBuilder() {
      if (serverErrorsPerProjectPerHourBuilder_ != null) {
        return serverErrorsPerProjectPerHourBuilder_.getMessageOrBuilder();
      } else {
        return serverErrorsPerProjectPerHour_ == null
            ? com.google.analytics.data.v1alpha.QuotaStatus.getDefaultInstance()
            : serverErrorsPerProjectPerHour_;
      }
    }
    /**
     *
     *
     * <pre>
     * Standard Analytics Properties and cloud project pairs can have up to 10
     * server errors per hour; Analytics 360 Properties and cloud project pairs
     * can have up to 50 server errors per hour.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.QuotaStatus server_errors_per_project_per_hour = 4;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.QuotaStatus,
            com.google.analytics.data.v1alpha.QuotaStatus.Builder,
            com.google.analytics.data.v1alpha.QuotaStatusOrBuilder>
        getServerErrorsPerProjectPerHourFieldBuilder() {
      if (serverErrorsPerProjectPerHourBuilder_ == null) {
        serverErrorsPerProjectPerHourBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.QuotaStatus,
                com.google.analytics.data.v1alpha.QuotaStatus.Builder,
                com.google.analytics.data.v1alpha.QuotaStatusOrBuilder>(
                getServerErrorsPerProjectPerHour(), getParentForChildren(), isClean());
        serverErrorsPerProjectPerHour_ = null;
      }
      return serverErrorsPerProjectPerHourBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.PropertyQuota)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.PropertyQuota)
  private static final com.google.analytics.data.v1alpha.PropertyQuota DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.PropertyQuota();
  }

  public static com.google.analytics.data.v1alpha.PropertyQuota getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PropertyQuota> PARSER =
      new com.google.protobuf.AbstractParser<PropertyQuota>() {
        @java.lang.Override
        public PropertyQuota parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new PropertyQuota(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<PropertyQuota> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PropertyQuota> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.PropertyQuota getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
