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
// source: google/analytics/data/v1alpha/analytics_data_api.proto

package com.google.analytics.data.v1alpha;

/**
 *
 *
 * <pre>
 * The batch request containing multiple pivot report requests.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.BatchRunPivotReportsRequest}
 */
public final class BatchRunPivotReportsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.BatchRunPivotReportsRequest)
    BatchRunPivotReportsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchRunPivotReportsRequest.newBuilder() to construct.
  private BatchRunPivotReportsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchRunPivotReportsRequest() {
    requests_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchRunPivotReportsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BatchRunPivotReportsRequest(
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
              com.google.analytics.data.v1alpha.Entity.Builder subBuilder = null;
              if (entity_ != null) {
                subBuilder = entity_.toBuilder();
              }
              entity_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.Entity.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(entity_);
                entity_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                requests_ =
                    new java.util.ArrayList<
                        com.google.analytics.data.v1alpha.RunPivotReportRequest>();
                mutable_bitField0_ |= 0x00000001;
              }
              requests_.add(
                  input.readMessage(
                      com.google.analytics.data.v1alpha.RunPivotReportRequest.parser(),
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
        requests_ = java.util.Collections.unmodifiableList(requests_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
        .internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
        .internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest.class,
            com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest.Builder.class);
  }

  public static final int ENTITY_FIELD_NUMBER = 1;
  private com.google.analytics.data.v1alpha.Entity entity_;
  /**
   *
   *
   * <pre>
   * A property whose events are tracked. This entity must be specified for the
   * batch. The entity within RunPivotReportRequest may either be unspecified or
   * consistent with this entity.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Entity entity = 1;</code>
   *
   * @return Whether the entity field is set.
   */
  @java.lang.Override
  public boolean hasEntity() {
    return entity_ != null;
  }
  /**
   *
   *
   * <pre>
   * A property whose events are tracked. This entity must be specified for the
   * batch. The entity within RunPivotReportRequest may either be unspecified or
   * consistent with this entity.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Entity entity = 1;</code>
   *
   * @return The entity.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.Entity getEntity() {
    return entity_ == null
        ? com.google.analytics.data.v1alpha.Entity.getDefaultInstance()
        : entity_;
  }
  /**
   *
   *
   * <pre>
   * A property whose events are tracked. This entity must be specified for the
   * batch. The entity within RunPivotReportRequest may either be unspecified or
   * consistent with this entity.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Entity entity = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.EntityOrBuilder getEntityOrBuilder() {
    return getEntity();
  }

  public static final int REQUESTS_FIELD_NUMBER = 2;
  private java.util.List<com.google.analytics.data.v1alpha.RunPivotReportRequest> requests_;
  /**
   *
   *
   * <pre>
   * Individual requests. Each request has a separate pivot report response.
   * Each batch request is allowed up to 5 requests.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1alpha.RunPivotReportRequest> getRequestsList() {
    return requests_;
  }
  /**
   *
   *
   * <pre>
   * Individual requests. Each request has a separate pivot report response.
   * Each batch request is allowed up to 5 requests.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.data.v1alpha.RunPivotReportRequestOrBuilder>
      getRequestsOrBuilderList() {
    return requests_;
  }
  /**
   *
   *
   * <pre>
   * Individual requests. Each request has a separate pivot report response.
   * Each batch request is allowed up to 5 requests.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
   */
  @java.lang.Override
  public int getRequestsCount() {
    return requests_.size();
  }
  /**
   *
   *
   * <pre>
   * Individual requests. Each request has a separate pivot report response.
   * Each batch request is allowed up to 5 requests.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.RunPivotReportRequest getRequests(int index) {
    return requests_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Individual requests. Each request has a separate pivot report response.
   * Each batch request is allowed up to 5 requests.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.RunPivotReportRequestOrBuilder getRequestsOrBuilder(
      int index) {
    return requests_.get(index);
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
    if (entity_ != null) {
      output.writeMessage(1, getEntity());
    }
    for (int i = 0; i < requests_.size(); i++) {
      output.writeMessage(2, requests_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (entity_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getEntity());
    }
    for (int i = 0; i < requests_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, requests_.get(i));
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest other =
        (com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest) obj;

    if (hasEntity() != other.hasEntity()) return false;
    if (hasEntity()) {
      if (!getEntity().equals(other.getEntity())) return false;
    }
    if (!getRequestsList().equals(other.getRequestsList())) return false;
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
    if (hasEntity()) {
      hash = (37 * hash) + ENTITY_FIELD_NUMBER;
      hash = (53 * hash) + getEntity().hashCode();
    }
    if (getRequestsCount() > 0) {
      hash = (37 * hash) + REQUESTS_FIELD_NUMBER;
      hash = (53 * hash) + getRequestsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest parseFrom(
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
      com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest prototype) {
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
   * The batch request containing multiple pivot report requests.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.BatchRunPivotReportsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.BatchRunPivotReportsRequest)
      com.google.analytics.data.v1alpha.BatchRunPivotReportsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest.class,
              com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getRequestsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (entityBuilder_ == null) {
        entity_ = null;
      } else {
        entity_ = null;
        entityBuilder_ = null;
      }
      if (requestsBuilder_ == null) {
        requests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        requestsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest
        getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest build() {
      com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest buildPartial() {
      com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest result =
          new com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest(this);
      int from_bitField0_ = bitField0_;
      if (entityBuilder_ == null) {
        result.entity_ = entity_;
      } else {
        result.entity_ = entityBuilder_.build();
      }
      if (requestsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          requests_ = java.util.Collections.unmodifiableList(requests_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.requests_ = requests_;
      } else {
        result.requests_ = requestsBuilder_.build();
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
      if (other instanceof com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest) {
        return mergeFrom((com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest other) {
      if (other
          == com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest.getDefaultInstance())
        return this;
      if (other.hasEntity()) {
        mergeEntity(other.getEntity());
      }
      if (requestsBuilder_ == null) {
        if (!other.requests_.isEmpty()) {
          if (requests_.isEmpty()) {
            requests_ = other.requests_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRequestsIsMutable();
            requests_.addAll(other.requests_);
          }
          onChanged();
        }
      } else {
        if (!other.requests_.isEmpty()) {
          if (requestsBuilder_.isEmpty()) {
            requestsBuilder_.dispose();
            requestsBuilder_ = null;
            requests_ = other.requests_;
            bitField0_ = (bitField0_ & ~0x00000001);
            requestsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getRequestsFieldBuilder()
                    : null;
          } else {
            requestsBuilder_.addAllMessages(other.requests_);
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
      com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest)
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

    private com.google.analytics.data.v1alpha.Entity entity_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.Entity,
            com.google.analytics.data.v1alpha.Entity.Builder,
            com.google.analytics.data.v1alpha.EntityOrBuilder>
        entityBuilder_;
    /**
     *
     *
     * <pre>
     * A property whose events are tracked. This entity must be specified for the
     * batch. The entity within RunPivotReportRequest may either be unspecified or
     * consistent with this entity.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Entity entity = 1;</code>
     *
     * @return Whether the entity field is set.
     */
    public boolean hasEntity() {
      return entityBuilder_ != null || entity_ != null;
    }
    /**
     *
     *
     * <pre>
     * A property whose events are tracked. This entity must be specified for the
     * batch. The entity within RunPivotReportRequest may either be unspecified or
     * consistent with this entity.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Entity entity = 1;</code>
     *
     * @return The entity.
     */
    public com.google.analytics.data.v1alpha.Entity getEntity() {
      if (entityBuilder_ == null) {
        return entity_ == null
            ? com.google.analytics.data.v1alpha.Entity.getDefaultInstance()
            : entity_;
      } else {
        return entityBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * A property whose events are tracked. This entity must be specified for the
     * batch. The entity within RunPivotReportRequest may either be unspecified or
     * consistent with this entity.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Entity entity = 1;</code>
     */
    public Builder setEntity(com.google.analytics.data.v1alpha.Entity value) {
      if (entityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entity_ = value;
        onChanged();
      } else {
        entityBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A property whose events are tracked. This entity must be specified for the
     * batch. The entity within RunPivotReportRequest may either be unspecified or
     * consistent with this entity.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Entity entity = 1;</code>
     */
    public Builder setEntity(com.google.analytics.data.v1alpha.Entity.Builder builderForValue) {
      if (entityBuilder_ == null) {
        entity_ = builderForValue.build();
        onChanged();
      } else {
        entityBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A property whose events are tracked. This entity must be specified for the
     * batch. The entity within RunPivotReportRequest may either be unspecified or
     * consistent with this entity.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Entity entity = 1;</code>
     */
    public Builder mergeEntity(com.google.analytics.data.v1alpha.Entity value) {
      if (entityBuilder_ == null) {
        if (entity_ != null) {
          entity_ =
              com.google.analytics.data.v1alpha.Entity.newBuilder(entity_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          entity_ = value;
        }
        onChanged();
      } else {
        entityBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A property whose events are tracked. This entity must be specified for the
     * batch. The entity within RunPivotReportRequest may either be unspecified or
     * consistent with this entity.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Entity entity = 1;</code>
     */
    public Builder clearEntity() {
      if (entityBuilder_ == null) {
        entity_ = null;
        onChanged();
      } else {
        entity_ = null;
        entityBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A property whose events are tracked. This entity must be specified for the
     * batch. The entity within RunPivotReportRequest may either be unspecified or
     * consistent with this entity.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Entity entity = 1;</code>
     */
    public com.google.analytics.data.v1alpha.Entity.Builder getEntityBuilder() {

      onChanged();
      return getEntityFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A property whose events are tracked. This entity must be specified for the
     * batch. The entity within RunPivotReportRequest may either be unspecified or
     * consistent with this entity.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Entity entity = 1;</code>
     */
    public com.google.analytics.data.v1alpha.EntityOrBuilder getEntityOrBuilder() {
      if (entityBuilder_ != null) {
        return entityBuilder_.getMessageOrBuilder();
      } else {
        return entity_ == null
            ? com.google.analytics.data.v1alpha.Entity.getDefaultInstance()
            : entity_;
      }
    }
    /**
     *
     *
     * <pre>
     * A property whose events are tracked. This entity must be specified for the
     * batch. The entity within RunPivotReportRequest may either be unspecified or
     * consistent with this entity.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Entity entity = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.Entity,
            com.google.analytics.data.v1alpha.Entity.Builder,
            com.google.analytics.data.v1alpha.EntityOrBuilder>
        getEntityFieldBuilder() {
      if (entityBuilder_ == null) {
        entityBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.Entity,
                com.google.analytics.data.v1alpha.Entity.Builder,
                com.google.analytics.data.v1alpha.EntityOrBuilder>(
                getEntity(), getParentForChildren(), isClean());
        entity_ = null;
      }
      return entityBuilder_;
    }

    private java.util.List<com.google.analytics.data.v1alpha.RunPivotReportRequest> requests_ =
        java.util.Collections.emptyList();

    private void ensureRequestsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        requests_ =
            new java.util.ArrayList<com.google.analytics.data.v1alpha.RunPivotReportRequest>(
                requests_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.RunPivotReportRequest,
            com.google.analytics.data.v1alpha.RunPivotReportRequest.Builder,
            com.google.analytics.data.v1alpha.RunPivotReportRequestOrBuilder>
        requestsBuilder_;

    /**
     *
     *
     * <pre>
     * Individual requests. Each request has a separate pivot report response.
     * Each batch request is allowed up to 5 requests.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.RunPivotReportRequest>
        getRequestsList() {
      if (requestsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(requests_);
      } else {
        return requestsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Individual requests. Each request has a separate pivot report response.
     * Each batch request is allowed up to 5 requests.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
     */
    public int getRequestsCount() {
      if (requestsBuilder_ == null) {
        return requests_.size();
      } else {
        return requestsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Individual requests. Each request has a separate pivot report response.
     * Each batch request is allowed up to 5 requests.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
     */
    public com.google.analytics.data.v1alpha.RunPivotReportRequest getRequests(int index) {
      if (requestsBuilder_ == null) {
        return requests_.get(index);
      } else {
        return requestsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Individual requests. Each request has a separate pivot report response.
     * Each batch request is allowed up to 5 requests.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
     */
    public Builder setRequests(
        int index, com.google.analytics.data.v1alpha.RunPivotReportRequest value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestsIsMutable();
        requests_.set(index, value);
        onChanged();
      } else {
        requestsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual requests. Each request has a separate pivot report response.
     * Each batch request is allowed up to 5 requests.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
     */
    public Builder setRequests(
        int index,
        com.google.analytics.data.v1alpha.RunPivotReportRequest.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.set(index, builderForValue.build());
        onChanged();
      } else {
        requestsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual requests. Each request has a separate pivot report response.
     * Each batch request is allowed up to 5 requests.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
     */
    public Builder addRequests(com.google.analytics.data.v1alpha.RunPivotReportRequest value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestsIsMutable();
        requests_.add(value);
        onChanged();
      } else {
        requestsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual requests. Each request has a separate pivot report response.
     * Each batch request is allowed up to 5 requests.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
     */
    public Builder addRequests(
        int index, com.google.analytics.data.v1alpha.RunPivotReportRequest value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestsIsMutable();
        requests_.add(index, value);
        onChanged();
      } else {
        requestsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual requests. Each request has a separate pivot report response.
     * Each batch request is allowed up to 5 requests.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
     */
    public Builder addRequests(
        com.google.analytics.data.v1alpha.RunPivotReportRequest.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.add(builderForValue.build());
        onChanged();
      } else {
        requestsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual requests. Each request has a separate pivot report response.
     * Each batch request is allowed up to 5 requests.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
     */
    public Builder addRequests(
        int index,
        com.google.analytics.data.v1alpha.RunPivotReportRequest.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.add(index, builderForValue.build());
        onChanged();
      } else {
        requestsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual requests. Each request has a separate pivot report response.
     * Each batch request is allowed up to 5 requests.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
     */
    public Builder addAllRequests(
        java.lang.Iterable<? extends com.google.analytics.data.v1alpha.RunPivotReportRequest>
            values) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, requests_);
        onChanged();
      } else {
        requestsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual requests. Each request has a separate pivot report response.
     * Each batch request is allowed up to 5 requests.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
     */
    public Builder clearRequests() {
      if (requestsBuilder_ == null) {
        requests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        requestsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual requests. Each request has a separate pivot report response.
     * Each batch request is allowed up to 5 requests.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
     */
    public Builder removeRequests(int index) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.remove(index);
        onChanged();
      } else {
        requestsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual requests. Each request has a separate pivot report response.
     * Each batch request is allowed up to 5 requests.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
     */
    public com.google.analytics.data.v1alpha.RunPivotReportRequest.Builder getRequestsBuilder(
        int index) {
      return getRequestsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Individual requests. Each request has a separate pivot report response.
     * Each batch request is allowed up to 5 requests.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
     */
    public com.google.analytics.data.v1alpha.RunPivotReportRequestOrBuilder getRequestsOrBuilder(
        int index) {
      if (requestsBuilder_ == null) {
        return requests_.get(index);
      } else {
        return requestsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Individual requests. Each request has a separate pivot report response.
     * Each batch request is allowed up to 5 requests.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
     */
    public java.util.List<
            ? extends com.google.analytics.data.v1alpha.RunPivotReportRequestOrBuilder>
        getRequestsOrBuilderList() {
      if (requestsBuilder_ != null) {
        return requestsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(requests_);
      }
    }
    /**
     *
     *
     * <pre>
     * Individual requests. Each request has a separate pivot report response.
     * Each batch request is allowed up to 5 requests.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
     */
    public com.google.analytics.data.v1alpha.RunPivotReportRequest.Builder addRequestsBuilder() {
      return getRequestsFieldBuilder()
          .addBuilder(com.google.analytics.data.v1alpha.RunPivotReportRequest.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Individual requests. Each request has a separate pivot report response.
     * Each batch request is allowed up to 5 requests.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
     */
    public com.google.analytics.data.v1alpha.RunPivotReportRequest.Builder addRequestsBuilder(
        int index) {
      return getRequestsFieldBuilder()
          .addBuilder(
              index, com.google.analytics.data.v1alpha.RunPivotReportRequest.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Individual requests. Each request has a separate pivot report response.
     * Each batch request is allowed up to 5 requests.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.RunPivotReportRequest.Builder>
        getRequestsBuilderList() {
      return getRequestsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.RunPivotReportRequest,
            com.google.analytics.data.v1alpha.RunPivotReportRequest.Builder,
            com.google.analytics.data.v1alpha.RunPivotReportRequestOrBuilder>
        getRequestsFieldBuilder() {
      if (requestsBuilder_ == null) {
        requestsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.data.v1alpha.RunPivotReportRequest,
                com.google.analytics.data.v1alpha.RunPivotReportRequest.Builder,
                com.google.analytics.data.v1alpha.RunPivotReportRequestOrBuilder>(
                requests_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        requests_ = null;
      }
      return requestsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.BatchRunPivotReportsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.BatchRunPivotReportsRequest)
  private static final com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest();
  }

  public static com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchRunPivotReportsRequest> PARSER =
      new com.google.protobuf.AbstractParser<BatchRunPivotReportsRequest>() {
        @java.lang.Override
        public BatchRunPivotReportsRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BatchRunPivotReportsRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BatchRunPivotReportsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchRunPivotReportsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.BatchRunPivotReportsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
