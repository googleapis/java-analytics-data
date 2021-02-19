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
// source: google/analytics/data/v1alpha/analytics_data_api.proto

package com.google.analytics.data.v1alpha;

/**
 *
 *
 * <pre>
 * The batch response containing multiple pivot reports.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.BatchRunPivotReportsResponse}
 */
public final class BatchRunPivotReportsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.BatchRunPivotReportsResponse)
    BatchRunPivotReportsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchRunPivotReportsResponse.newBuilder() to construct.
  private BatchRunPivotReportsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchRunPivotReportsResponse() {
    pivotReports_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchRunPivotReportsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BatchRunPivotReportsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                pivotReports_ =
                    new java.util.ArrayList<
                        com.google.analytics.data.v1alpha.RunPivotReportResponse>();
                mutable_bitField0_ |= 0x00000001;
              }
              pivotReports_.add(
                  input.readMessage(
                      com.google.analytics.data.v1alpha.RunPivotReportResponse.parser(),
                      extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        pivotReports_ = java.util.Collections.unmodifiableList(pivotReports_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
        .internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
        .internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse.class,
            com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse.Builder.class);
  }

  public static final int PIVOT_REPORTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.analytics.data.v1alpha.RunPivotReportResponse> pivotReports_;
  /**
   *
   *
   * <pre>
   * Individual responses. Each response has a separate pivot report request.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.RunPivotReportResponse pivot_reports = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1alpha.RunPivotReportResponse>
      getPivotReportsList() {
    return pivotReports_;
  }
  /**
   *
   *
   * <pre>
   * Individual responses. Each response has a separate pivot report request.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.RunPivotReportResponse pivot_reports = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.data.v1alpha.RunPivotReportResponseOrBuilder>
      getPivotReportsOrBuilderList() {
    return pivotReports_;
  }
  /**
   *
   *
   * <pre>
   * Individual responses. Each response has a separate pivot report request.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.RunPivotReportResponse pivot_reports = 1;</code>
   */
  @java.lang.Override
  public int getPivotReportsCount() {
    return pivotReports_.size();
  }
  /**
   *
   *
   * <pre>
   * Individual responses. Each response has a separate pivot report request.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.RunPivotReportResponse pivot_reports = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.RunPivotReportResponse getPivotReports(int index) {
    return pivotReports_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Individual responses. Each response has a separate pivot report request.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.RunPivotReportResponse pivot_reports = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.RunPivotReportResponseOrBuilder getPivotReportsOrBuilder(
      int index) {
    return pivotReports_.get(index);
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
    for (int i = 0; i < pivotReports_.size(); i++) {
      output.writeMessage(1, pivotReports_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < pivotReports_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, pivotReports_.get(i));
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse other =
        (com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse) obj;

    if (!getPivotReportsList().equals(other.getPivotReportsList())) return false;
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
    if (getPivotReportsCount() > 0) {
      hash = (37 * hash) + PIVOT_REPORTS_FIELD_NUMBER;
      hash = (53 * hash) + getPivotReportsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse parseFrom(
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

  public static Builder newBuilder(
      com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse prototype) {
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
   * The batch response containing multiple pivot reports.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.BatchRunPivotReportsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.BatchRunPivotReportsResponse)
      com.google.analytics.data.v1alpha.BatchRunPivotReportsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse.class,
              com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getPivotReportsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (pivotReportsBuilder_ == null) {
        pivotReports_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        pivotReportsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse
        getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse build() {
      com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse buildPartial() {
      com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse result =
          new com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse(this);
      int from_bitField0_ = bitField0_;
      if (pivotReportsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          pivotReports_ = java.util.Collections.unmodifiableList(pivotReports_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.pivotReports_ = pivotReports_;
      } else {
        result.pivotReports_ = pivotReportsBuilder_.build();
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
      if (other instanceof com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse) {
        return mergeFrom((com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse other) {
      if (other
          == com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse.getDefaultInstance())
        return this;
      if (pivotReportsBuilder_ == null) {
        if (!other.pivotReports_.isEmpty()) {
          if (pivotReports_.isEmpty()) {
            pivotReports_ = other.pivotReports_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePivotReportsIsMutable();
            pivotReports_.addAll(other.pivotReports_);
          }
          onChanged();
        }
      } else {
        if (!other.pivotReports_.isEmpty()) {
          if (pivotReportsBuilder_.isEmpty()) {
            pivotReportsBuilder_.dispose();
            pivotReportsBuilder_ = null;
            pivotReports_ = other.pivotReports_;
            bitField0_ = (bitField0_ & ~0x00000001);
            pivotReportsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getPivotReportsFieldBuilder()
                    : null;
          } else {
            pivotReportsBuilder_.addAllMessages(other.pivotReports_);
          }
        }
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
      com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.analytics.data.v1alpha.RunPivotReportResponse> pivotReports_ =
        java.util.Collections.emptyList();

    private void ensurePivotReportsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        pivotReports_ =
            new java.util.ArrayList<com.google.analytics.data.v1alpha.RunPivotReportResponse>(
                pivotReports_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.RunPivotReportResponse,
            com.google.analytics.data.v1alpha.RunPivotReportResponse.Builder,
            com.google.analytics.data.v1alpha.RunPivotReportResponseOrBuilder>
        pivotReportsBuilder_;

    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportResponse pivot_reports = 1;
     * </code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.RunPivotReportResponse>
        getPivotReportsList() {
      if (pivotReportsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(pivotReports_);
      } else {
        return pivotReportsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportResponse pivot_reports = 1;
     * </code>
     */
    public int getPivotReportsCount() {
      if (pivotReportsBuilder_ == null) {
        return pivotReports_.size();
      } else {
        return pivotReportsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportResponse pivot_reports = 1;
     * </code>
     */
    public com.google.analytics.data.v1alpha.RunPivotReportResponse getPivotReports(int index) {
      if (pivotReportsBuilder_ == null) {
        return pivotReports_.get(index);
      } else {
        return pivotReportsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportResponse pivot_reports = 1;
     * </code>
     */
    public Builder setPivotReports(
        int index, com.google.analytics.data.v1alpha.RunPivotReportResponse value) {
      if (pivotReportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePivotReportsIsMutable();
        pivotReports_.set(index, value);
        onChanged();
      } else {
        pivotReportsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportResponse pivot_reports = 1;
     * </code>
     */
    public Builder setPivotReports(
        int index,
        com.google.analytics.data.v1alpha.RunPivotReportResponse.Builder builderForValue) {
      if (pivotReportsBuilder_ == null) {
        ensurePivotReportsIsMutable();
        pivotReports_.set(index, builderForValue.build());
        onChanged();
      } else {
        pivotReportsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportResponse pivot_reports = 1;
     * </code>
     */
    public Builder addPivotReports(com.google.analytics.data.v1alpha.RunPivotReportResponse value) {
      if (pivotReportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePivotReportsIsMutable();
        pivotReports_.add(value);
        onChanged();
      } else {
        pivotReportsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportResponse pivot_reports = 1;
     * </code>
     */
    public Builder addPivotReports(
        int index, com.google.analytics.data.v1alpha.RunPivotReportResponse value) {
      if (pivotReportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePivotReportsIsMutable();
        pivotReports_.add(index, value);
        onChanged();
      } else {
        pivotReportsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportResponse pivot_reports = 1;
     * </code>
     */
    public Builder addPivotReports(
        com.google.analytics.data.v1alpha.RunPivotReportResponse.Builder builderForValue) {
      if (pivotReportsBuilder_ == null) {
        ensurePivotReportsIsMutable();
        pivotReports_.add(builderForValue.build());
        onChanged();
      } else {
        pivotReportsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportResponse pivot_reports = 1;
     * </code>
     */
    public Builder addPivotReports(
        int index,
        com.google.analytics.data.v1alpha.RunPivotReportResponse.Builder builderForValue) {
      if (pivotReportsBuilder_ == null) {
        ensurePivotReportsIsMutable();
        pivotReports_.add(index, builderForValue.build());
        onChanged();
      } else {
        pivotReportsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportResponse pivot_reports = 1;
     * </code>
     */
    public Builder addAllPivotReports(
        java.lang.Iterable<? extends com.google.analytics.data.v1alpha.RunPivotReportResponse>
            values) {
      if (pivotReportsBuilder_ == null) {
        ensurePivotReportsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, pivotReports_);
        onChanged();
      } else {
        pivotReportsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportResponse pivot_reports = 1;
     * </code>
     */
    public Builder clearPivotReports() {
      if (pivotReportsBuilder_ == null) {
        pivotReports_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        pivotReportsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportResponse pivot_reports = 1;
     * </code>
     */
    public Builder removePivotReports(int index) {
      if (pivotReportsBuilder_ == null) {
        ensurePivotReportsIsMutable();
        pivotReports_.remove(index);
        onChanged();
      } else {
        pivotReportsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportResponse pivot_reports = 1;
     * </code>
     */
    public com.google.analytics.data.v1alpha.RunPivotReportResponse.Builder getPivotReportsBuilder(
        int index) {
      return getPivotReportsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportResponse pivot_reports = 1;
     * </code>
     */
    public com.google.analytics.data.v1alpha.RunPivotReportResponseOrBuilder
        getPivotReportsOrBuilder(int index) {
      if (pivotReportsBuilder_ == null) {
        return pivotReports_.get(index);
      } else {
        return pivotReportsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportResponse pivot_reports = 1;
     * </code>
     */
    public java.util.List<
            ? extends com.google.analytics.data.v1alpha.RunPivotReportResponseOrBuilder>
        getPivotReportsOrBuilderList() {
      if (pivotReportsBuilder_ != null) {
        return pivotReportsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(pivotReports_);
      }
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportResponse pivot_reports = 1;
     * </code>
     */
    public com.google.analytics.data.v1alpha.RunPivotReportResponse.Builder
        addPivotReportsBuilder() {
      return getPivotReportsFieldBuilder()
          .addBuilder(
              com.google.analytics.data.v1alpha.RunPivotReportResponse.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportResponse pivot_reports = 1;
     * </code>
     */
    public com.google.analytics.data.v1alpha.RunPivotReportResponse.Builder addPivotReportsBuilder(
        int index) {
      return getPivotReportsFieldBuilder()
          .addBuilder(
              index, com.google.analytics.data.v1alpha.RunPivotReportResponse.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate pivot report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportResponse pivot_reports = 1;
     * </code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.RunPivotReportResponse.Builder>
        getPivotReportsBuilderList() {
      return getPivotReportsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.RunPivotReportResponse,
            com.google.analytics.data.v1alpha.RunPivotReportResponse.Builder,
            com.google.analytics.data.v1alpha.RunPivotReportResponseOrBuilder>
        getPivotReportsFieldBuilder() {
      if (pivotReportsBuilder_ == null) {
        pivotReportsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.data.v1alpha.RunPivotReportResponse,
                com.google.analytics.data.v1alpha.RunPivotReportResponse.Builder,
                com.google.analytics.data.v1alpha.RunPivotReportResponseOrBuilder>(
                pivotReports_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        pivotReports_ = null;
      }
      return pivotReportsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.BatchRunPivotReportsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.BatchRunPivotReportsResponse)
  private static final com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse();
  }

  public static com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchRunPivotReportsResponse> PARSER =
      new com.google.protobuf.AbstractParser<BatchRunPivotReportsResponse>() {
        @java.lang.Override
        public BatchRunPivotReportsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BatchRunPivotReportsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BatchRunPivotReportsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchRunPivotReportsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.BatchRunPivotReportsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
