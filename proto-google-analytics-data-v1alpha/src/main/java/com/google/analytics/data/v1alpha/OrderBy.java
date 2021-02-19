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
 * The sort options.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.OrderBy}
 */
public final class OrderBy extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.OrderBy)
    OrderByOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use OrderBy.newBuilder() to construct.
  private OrderBy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private OrderBy() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new OrderBy();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private OrderBy(
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
              com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy.Builder subBuilder = null;
              if (oneOrderByCase_ == 1) {
                subBuilder =
                    ((com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy) oneOrderBy_)
                        .toBuilder();
              }
              oneOrderBy_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(
                    (com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy) oneOrderBy_);
                oneOrderBy_ = subBuilder.buildPartial();
              }
              oneOrderByCase_ = 1;
              break;
            }
          case 18:
            {
              com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.Builder subBuilder = null;
              if (oneOrderByCase_ == 2) {
                subBuilder =
                    ((com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy) oneOrderBy_)
                        .toBuilder();
              }
              oneOrderBy_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(
                    (com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy) oneOrderBy_);
                oneOrderBy_ = subBuilder.buildPartial();
              }
              oneOrderByCase_ = 2;
              break;
            }
          case 26:
            {
              com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.Builder subBuilder = null;
              if (oneOrderByCase_ == 3) {
                subBuilder =
                    ((com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy) oneOrderBy_)
                        .toBuilder();
              }
              oneOrderBy_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(
                    (com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy) oneOrderBy_);
                oneOrderBy_ = subBuilder.buildPartial();
              }
              oneOrderByCase_ = 3;
              break;
            }
          case 32:
            {
              desc_ = input.readBool();
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
        .internal_static_google_analytics_data_v1alpha_OrderBy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_OrderBy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.OrderBy.class,
            com.google.analytics.data.v1alpha.OrderBy.Builder.class);
  }

  public interface MetricOrderByOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.OrderBy.MetricOrderBy)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * A metric name in the request to order by.
     * </pre>
     *
     * <code>string metric_name = 1;</code>
     *
     * @return The metricName.
     */
    java.lang.String getMetricName();
    /**
     *
     *
     * <pre>
     * A metric name in the request to order by.
     * </pre>
     *
     * <code>string metric_name = 1;</code>
     *
     * @return The bytes for metricName.
     */
    com.google.protobuf.ByteString getMetricNameBytes();
  }
  /**
   *
   *
   * <pre>
   * Sorts by metric values.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.OrderBy.MetricOrderBy}
   */
  public static final class MetricOrderBy extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.OrderBy.MetricOrderBy)
      MetricOrderByOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use MetricOrderBy.newBuilder() to construct.
    private MetricOrderBy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private MetricOrderBy() {
      metricName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
      return new MetricOrderBy();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private MetricOrderBy(
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
                java.lang.String s = input.readStringRequireUtf8();

                metricName_ = s;
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
          .internal_static_google_analytics_data_v1alpha_OrderBy_MetricOrderBy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_OrderBy_MetricOrderBy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy.class,
              com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy.Builder.class);
    }

    public static final int METRIC_NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object metricName_;
    /**
     *
     *
     * <pre>
     * A metric name in the request to order by.
     * </pre>
     *
     * <code>string metric_name = 1;</code>
     *
     * @return The metricName.
     */
    @java.lang.Override
    public java.lang.String getMetricName() {
      java.lang.Object ref = metricName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        metricName_ = s;
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * A metric name in the request to order by.
     * </pre>
     *
     * <code>string metric_name = 1;</code>
     *
     * @return The bytes for metricName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMetricNameBytes() {
      java.lang.Object ref = metricName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        metricName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!getMetricNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, metricName_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getMetricNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, metricName_);
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
      if (!(obj instanceof com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy)) {
        return super.equals(obj);
      }
      com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy other =
          (com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy) obj;

      if (!getMetricName().equals(other.getMetricName())) return false;
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
      hash = (37 * hash) + METRIC_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getMetricName().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy parseFrom(
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
        com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * Sorts by metric values.
     * </pre>
     *
     * Protobuf type {@code google.analytics.data.v1alpha.OrderBy.MetricOrderBy}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.OrderBy.MetricOrderBy)
        com.google.analytics.data.v1alpha.OrderBy.MetricOrderByOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_OrderBy_MetricOrderBy_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_OrderBy_MetricOrderBy_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy.class,
                com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy.Builder.class);
      }

      // Construct using com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy.newBuilder()
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
        metricName_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_OrderBy_MetricOrderBy_descriptor;
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy getDefaultInstanceForType() {
        return com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy.getDefaultInstance();
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy build() {
        com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy buildPartial() {
        com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy result =
            new com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy(this);
        result.metricName_ = metricName_;
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
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy) {
          return mergeFrom((com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy other) {
        if (other == com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy.getDefaultInstance())
          return this;
        if (!other.getMetricName().isEmpty()) {
          metricName_ = other.metricName_;
          onChanged();
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
        com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object metricName_ = "";
      /**
       *
       *
       * <pre>
       * A metric name in the request to order by.
       * </pre>
       *
       * <code>string metric_name = 1;</code>
       *
       * @return The metricName.
       */
      public java.lang.String getMetricName() {
        java.lang.Object ref = metricName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          metricName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * A metric name in the request to order by.
       * </pre>
       *
       * <code>string metric_name = 1;</code>
       *
       * @return The bytes for metricName.
       */
      public com.google.protobuf.ByteString getMetricNameBytes() {
        java.lang.Object ref = metricName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          metricName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * A metric name in the request to order by.
       * </pre>
       *
       * <code>string metric_name = 1;</code>
       *
       * @param value The metricName to set.
       * @return This builder for chaining.
       */
      public Builder setMetricName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }

        metricName_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * A metric name in the request to order by.
       * </pre>
       *
       * <code>string metric_name = 1;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearMetricName() {

        metricName_ = getDefaultInstance().getMetricName();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * A metric name in the request to order by.
       * </pre>
       *
       * <code>string metric_name = 1;</code>
       *
       * @param value The bytes for metricName to set.
       * @return This builder for chaining.
       */
      public Builder setMetricNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        checkByteStringIsUtf8(value);

        metricName_ = value;
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.OrderBy.MetricOrderBy)
    }

    // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.OrderBy.MetricOrderBy)
    private static final com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy();
    }

    public static com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MetricOrderBy> PARSER =
        new com.google.protobuf.AbstractParser<MetricOrderBy>() {
          @java.lang.Override
          public MetricOrderBy parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new MetricOrderBy(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<MetricOrderBy> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MetricOrderBy> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface DimensionOrderByOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.OrderBy.DimensionOrderBy)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * A dimension name in the request to order by.
     * </pre>
     *
     * <code>string dimension_name = 1;</code>
     *
     * @return The dimensionName.
     */
    java.lang.String getDimensionName();
    /**
     *
     *
     * <pre>
     * A dimension name in the request to order by.
     * </pre>
     *
     * <code>string dimension_name = 1;</code>
     *
     * @return The bytes for dimensionName.
     */
    com.google.protobuf.ByteString getDimensionNameBytes();

    /**
     *
     *
     * <pre>
     * Controls the rule for dimension value ordering.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.OrderType order_type = 2;
     * </code>
     *
     * @return The enum numeric value on the wire for orderType.
     */
    int getOrderTypeValue();
    /**
     *
     *
     * <pre>
     * Controls the rule for dimension value ordering.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.OrderType order_type = 2;
     * </code>
     *
     * @return The orderType.
     */
    com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.OrderType getOrderType();
  }
  /**
   *
   *
   * <pre>
   * Sorts by dimension values.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.OrderBy.DimensionOrderBy}
   */
  public static final class DimensionOrderBy extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.OrderBy.DimensionOrderBy)
      DimensionOrderByOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use DimensionOrderBy.newBuilder() to construct.
    private DimensionOrderBy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private DimensionOrderBy() {
      dimensionName_ = "";
      orderType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
      return new DimensionOrderBy();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private DimensionOrderBy(
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
                java.lang.String s = input.readStringRequireUtf8();

                dimensionName_ = s;
                break;
              }
            case 16:
              {
                int rawValue = input.readEnum();

                orderType_ = rawValue;
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
          .internal_static_google_analytics_data_v1alpha_OrderBy_DimensionOrderBy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_OrderBy_DimensionOrderBy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.class,
              com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.Builder.class);
    }

    /**
     *
     *
     * <pre>
     * Rule to order the string dimension values by.
     * </pre>
     *
     * Protobuf enum {@code google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.OrderType}
     */
    public enum OrderType implements com.google.protobuf.ProtocolMessageEnum {
      /**
       *
       *
       * <pre>
       * Unspecified.
       * </pre>
       *
       * <code>ORDER_TYPE_UNSPECIFIED = 0;</code>
       */
      ORDER_TYPE_UNSPECIFIED(0),
      /**
       *
       *
       * <pre>
       * Alphanumeric sort by Unicode code point. For example, "2" &lt; "A" &lt; "X" &lt;
       * "b" &lt; "z".
       * </pre>
       *
       * <code>ALPHANUMERIC = 1;</code>
       */
      ALPHANUMERIC(1),
      /**
       *
       *
       * <pre>
       * Case insensitive alphanumeric sort by lower case Unicode code point.
       * For example, "2" &lt; "A" &lt; "b" &lt; "X" &lt; "z".
       * </pre>
       *
       * <code>CASE_INSENSITIVE_ALPHANUMERIC = 2;</code>
       */
      CASE_INSENSITIVE_ALPHANUMERIC(2),
      /**
       *
       *
       * <pre>
       * Dimension values are converted to numbers before sorting. For example
       * in NUMERIC sort, "25" &lt; "100", and in `ALPHANUMERIC` sort, "100" &lt;
       * "25". Non-numeric dimension values all have equal ordering value below
       * all numeric values.
       * </pre>
       *
       * <code>NUMERIC = 3;</code>
       */
      NUMERIC(3),
      UNRECOGNIZED(-1),
      ;

      /**
       *
       *
       * <pre>
       * Unspecified.
       * </pre>
       *
       * <code>ORDER_TYPE_UNSPECIFIED = 0;</code>
       */
      public static final int ORDER_TYPE_UNSPECIFIED_VALUE = 0;
      /**
       *
       *
       * <pre>
       * Alphanumeric sort by Unicode code point. For example, "2" &lt; "A" &lt; "X" &lt;
       * "b" &lt; "z".
       * </pre>
       *
       * <code>ALPHANUMERIC = 1;</code>
       */
      public static final int ALPHANUMERIC_VALUE = 1;
      /**
       *
       *
       * <pre>
       * Case insensitive alphanumeric sort by lower case Unicode code point.
       * For example, "2" &lt; "A" &lt; "b" &lt; "X" &lt; "z".
       * </pre>
       *
       * <code>CASE_INSENSITIVE_ALPHANUMERIC = 2;</code>
       */
      public static final int CASE_INSENSITIVE_ALPHANUMERIC_VALUE = 2;
      /**
       *
       *
       * <pre>
       * Dimension values are converted to numbers before sorting. For example
       * in NUMERIC sort, "25" &lt; "100", and in `ALPHANUMERIC` sort, "100" &lt;
       * "25". Non-numeric dimension values all have equal ordering value below
       * all numeric values.
       * </pre>
       *
       * <code>NUMERIC = 3;</code>
       */
      public static final int NUMERIC_VALUE = 3;

      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static OrderType valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static OrderType forNumber(int value) {
        switch (value) {
          case 0:
            return ORDER_TYPE_UNSPECIFIED;
          case 1:
            return ALPHANUMERIC;
          case 2:
            return CASE_INSENSITIVE_ALPHANUMERIC;
          case 3:
            return NUMERIC;
          default:
            return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<OrderType> internalGetValueMap() {
        return internalValueMap;
      }

      private static final com.google.protobuf.Internal.EnumLiteMap<OrderType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<OrderType>() {
            public OrderType findValueByNumber(int number) {
              return OrderType.forNumber(number);
            }
          };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }

      public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
      }

      public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
        return com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.getDescriptor()
            .getEnumTypes()
            .get(0);
      }

      private static final OrderType[] VALUES = values();

      public static OrderType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private OrderType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.OrderType)
    }

    public static final int DIMENSION_NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object dimensionName_;
    /**
     *
     *
     * <pre>
     * A dimension name in the request to order by.
     * </pre>
     *
     * <code>string dimension_name = 1;</code>
     *
     * @return The dimensionName.
     */
    @java.lang.Override
    public java.lang.String getDimensionName() {
      java.lang.Object ref = dimensionName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dimensionName_ = s;
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * A dimension name in the request to order by.
     * </pre>
     *
     * <code>string dimension_name = 1;</code>
     *
     * @return The bytes for dimensionName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getDimensionNameBytes() {
      java.lang.Object ref = dimensionName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        dimensionName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ORDER_TYPE_FIELD_NUMBER = 2;
    private int orderType_;
    /**
     *
     *
     * <pre>
     * Controls the rule for dimension value ordering.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.OrderType order_type = 2;
     * </code>
     *
     * @return The enum numeric value on the wire for orderType.
     */
    @java.lang.Override
    public int getOrderTypeValue() {
      return orderType_;
    }
    /**
     *
     *
     * <pre>
     * Controls the rule for dimension value ordering.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.OrderType order_type = 2;
     * </code>
     *
     * @return The orderType.
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.OrderType getOrderType() {
      @SuppressWarnings("deprecation")
      com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.OrderType result =
          com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.OrderType.valueOf(orderType_);
      return result == null
          ? com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.OrderType.UNRECOGNIZED
          : result;
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
      if (!getDimensionNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dimensionName_);
      }
      if (orderType_
          != com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.OrderType
              .ORDER_TYPE_UNSPECIFIED
              .getNumber()) {
        output.writeEnum(2, orderType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getDimensionNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dimensionName_);
      }
      if (orderType_
          != com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.OrderType
              .ORDER_TYPE_UNSPECIFIED
              .getNumber()) {
        size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, orderType_);
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
      if (!(obj instanceof com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy)) {
        return super.equals(obj);
      }
      com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy other =
          (com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy) obj;

      if (!getDimensionName().equals(other.getDimensionName())) return false;
      if (orderType_ != other.orderType_) return false;
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
      hash = (37 * hash) + DIMENSION_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getDimensionName().hashCode();
      hash = (37 * hash) + ORDER_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + orderType_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy parseFrom(
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
        com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * Sorts by dimension values.
     * </pre>
     *
     * Protobuf type {@code google.analytics.data.v1alpha.OrderBy.DimensionOrderBy}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.OrderBy.DimensionOrderBy)
        com.google.analytics.data.v1alpha.OrderBy.DimensionOrderByOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_OrderBy_DimensionOrderBy_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_OrderBy_DimensionOrderBy_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.class,
                com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.Builder.class);
      }

      // Construct using com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.newBuilder()
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
        dimensionName_ = "";

        orderType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_OrderBy_DimensionOrderBy_descriptor;
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy
          getDefaultInstanceForType() {
        return com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.getDefaultInstance();
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy build() {
        com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy buildPartial() {
        com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy result =
            new com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy(this);
        result.dimensionName_ = dimensionName_;
        result.orderType_ = orderType_;
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
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy) {
          return mergeFrom((com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy other) {
        if (other
            == com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.getDefaultInstance())
          return this;
        if (!other.getDimensionName().isEmpty()) {
          dimensionName_ = other.dimensionName_;
          onChanged();
        }
        if (other.orderType_ != 0) {
          setOrderTypeValue(other.getOrderTypeValue());
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
        com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object dimensionName_ = "";
      /**
       *
       *
       * <pre>
       * A dimension name in the request to order by.
       * </pre>
       *
       * <code>string dimension_name = 1;</code>
       *
       * @return The dimensionName.
       */
      public java.lang.String getDimensionName() {
        java.lang.Object ref = dimensionName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          dimensionName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * A dimension name in the request to order by.
       * </pre>
       *
       * <code>string dimension_name = 1;</code>
       *
       * @return The bytes for dimensionName.
       */
      public com.google.protobuf.ByteString getDimensionNameBytes() {
        java.lang.Object ref = dimensionName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          dimensionName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * A dimension name in the request to order by.
       * </pre>
       *
       * <code>string dimension_name = 1;</code>
       *
       * @param value The dimensionName to set.
       * @return This builder for chaining.
       */
      public Builder setDimensionName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }

        dimensionName_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * A dimension name in the request to order by.
       * </pre>
       *
       * <code>string dimension_name = 1;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearDimensionName() {

        dimensionName_ = getDefaultInstance().getDimensionName();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * A dimension name in the request to order by.
       * </pre>
       *
       * <code>string dimension_name = 1;</code>
       *
       * @param value The bytes for dimensionName to set.
       * @return This builder for chaining.
       */
      public Builder setDimensionNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        checkByteStringIsUtf8(value);

        dimensionName_ = value;
        onChanged();
        return this;
      }

      private int orderType_ = 0;
      /**
       *
       *
       * <pre>
       * Controls the rule for dimension value ordering.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.OrderType order_type = 2;
       * </code>
       *
       * @return The enum numeric value on the wire for orderType.
       */
      @java.lang.Override
      public int getOrderTypeValue() {
        return orderType_;
      }
      /**
       *
       *
       * <pre>
       * Controls the rule for dimension value ordering.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.OrderType order_type = 2;
       * </code>
       *
       * @param value The enum numeric value on the wire for orderType to set.
       * @return This builder for chaining.
       */
      public Builder setOrderTypeValue(int value) {

        orderType_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Controls the rule for dimension value ordering.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.OrderType order_type = 2;
       * </code>
       *
       * @return The orderType.
       */
      @java.lang.Override
      public com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.OrderType getOrderType() {
        @SuppressWarnings("deprecation")
        com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.OrderType result =
            com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.OrderType.valueOf(
                orderType_);
        return result == null
            ? com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.OrderType.UNRECOGNIZED
            : result;
      }
      /**
       *
       *
       * <pre>
       * Controls the rule for dimension value ordering.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.OrderType order_type = 2;
       * </code>
       *
       * @param value The orderType to set.
       * @return This builder for chaining.
       */
      public Builder setOrderType(
          com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.OrderType value) {
        if (value == null) {
          throw new NullPointerException();
        }

        orderType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Controls the rule for dimension value ordering.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.OrderType order_type = 2;
       * </code>
       *
       * @return This builder for chaining.
       */
      public Builder clearOrderType() {

        orderType_ = 0;
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.OrderBy.DimensionOrderBy)
    }

    // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.OrderBy.DimensionOrderBy)
    private static final com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy();
    }

    public static com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DimensionOrderBy> PARSER =
        new com.google.protobuf.AbstractParser<DimensionOrderBy>() {
          @java.lang.Override
          public DimensionOrderBy parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new DimensionOrderBy(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<DimensionOrderBy> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DimensionOrderBy> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface PivotOrderByOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.OrderBy.PivotOrderBy)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * In the response to order by, order rows by this column. Must be a metric
     * name from the request.
     * </pre>
     *
     * <code>string metric_name = 1;</code>
     *
     * @return The metricName.
     */
    java.lang.String getMetricName();
    /**
     *
     *
     * <pre>
     * In the response to order by, order rows by this column. Must be a metric
     * name from the request.
     * </pre>
     *
     * <code>string metric_name = 1;</code>
     *
     * @return The bytes for metricName.
     */
    com.google.protobuf.ByteString getMetricNameBytes();

    /**
     *
     *
     * <pre>
     * Used to select a dimension name and value pivot. If multiple pivot
     * selections are given, the sort occurs on rows where all pivot selection
     * dimension name and value pairs match the row's dimension name and value
     * pair.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
     * </code>
     */
    java.util.List<com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection>
        getPivotSelectionsList();
    /**
     *
     *
     * <pre>
     * Used to select a dimension name and value pivot. If multiple pivot
     * selections are given, the sort occurs on rows where all pivot selection
     * dimension name and value pairs match the row's dimension name and value
     * pair.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
     * </code>
     */
    com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection getPivotSelections(
        int index);
    /**
     *
     *
     * <pre>
     * Used to select a dimension name and value pivot. If multiple pivot
     * selections are given, the sort occurs on rows where all pivot selection
     * dimension name and value pairs match the row's dimension name and value
     * pair.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
     * </code>
     */
    int getPivotSelectionsCount();
    /**
     *
     *
     * <pre>
     * Used to select a dimension name and value pivot. If multiple pivot
     * selections are given, the sort occurs on rows where all pivot selection
     * dimension name and value pairs match the row's dimension name and value
     * pair.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
     * </code>
     */
    java.util.List<
            ? extends
                com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelectionOrBuilder>
        getPivotSelectionsOrBuilderList();
    /**
     *
     *
     * <pre>
     * Used to select a dimension name and value pivot. If multiple pivot
     * selections are given, the sort occurs on rows where all pivot selection
     * dimension name and value pairs match the row's dimension name and value
     * pair.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
     * </code>
     */
    com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelectionOrBuilder
        getPivotSelectionsOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * Sorts by a pivot column group.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.OrderBy.PivotOrderBy}
   */
  public static final class PivotOrderBy extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.OrderBy.PivotOrderBy)
      PivotOrderByOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use PivotOrderBy.newBuilder() to construct.
    private PivotOrderBy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private PivotOrderBy() {
      metricName_ = "";
      pivotSelections_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
      return new PivotOrderBy();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private PivotOrderBy(
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
                java.lang.String s = input.readStringRequireUtf8();

                metricName_ = s;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                  pivotSelections_ =
                      new java.util.ArrayList<
                          com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection>();
                  mutable_bitField0_ |= 0x00000001;
                }
                pivotSelections_.add(
                    input.readMessage(
                        com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection
                            .parser(),
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
          pivotSelections_ = java.util.Collections.unmodifiableList(pivotSelections_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_OrderBy_PivotOrderBy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_OrderBy_PivotOrderBy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.class,
              com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.Builder.class);
    }

    public interface PivotSelectionOrBuilder
        extends
        // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection)
        com.google.protobuf.MessageOrBuilder {

      /**
       *
       *
       * <pre>
       * Must be a dimension name from the request.
       * </pre>
       *
       * <code>string dimension_name = 1;</code>
       *
       * @return The dimensionName.
       */
      java.lang.String getDimensionName();
      /**
       *
       *
       * <pre>
       * Must be a dimension name from the request.
       * </pre>
       *
       * <code>string dimension_name = 1;</code>
       *
       * @return The bytes for dimensionName.
       */
      com.google.protobuf.ByteString getDimensionNameBytes();

      /**
       *
       *
       * <pre>
       * Order by only when the named dimension is this value.
       * </pre>
       *
       * <code>string dimension_value = 2;</code>
       *
       * @return The dimensionValue.
       */
      java.lang.String getDimensionValue();
      /**
       *
       *
       * <pre>
       * Order by only when the named dimension is this value.
       * </pre>
       *
       * <code>string dimension_value = 2;</code>
       *
       * @return The bytes for dimensionValue.
       */
      com.google.protobuf.ByteString getDimensionValueBytes();
    }
    /**
     *
     *
     * <pre>
     * A pair of dimension names and values. Rows with this dimension pivot pair
     * are ordered by the metric's value.
     * For example if pivots = {{"browser", "Chrome"}} and
     * metric_name = "Sessions",
     * then the rows will be sorted based on Sessions in Chrome.
     *     ---------|----------|----------------|----------|----------------
     *              |  Chrome  |    Chrome      |  Safari  |     Safari
     *     ---------|----------|----------------|----------|----------------
     *      Country | Sessions | Pages/Sessions | Sessions | Pages/Sessions
     *     ---------|----------|----------------|----------|----------------
     *         US   |    2     |       2        |     3    |        1
     *     ---------|----------|----------------|----------|----------------
     *       Canada |    3     |       1        |     4    |        1
     *     ---------|----------|----------------|----------|----------------
     * </pre>
     *
     * Protobuf type {@code google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection}
     */
    public static final class PivotSelection extends com.google.protobuf.GeneratedMessageV3
        implements
        // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection)
        PivotSelectionOrBuilder {
      private static final long serialVersionUID = 0L;
      // Use PivotSelection.newBuilder() to construct.
      private PivotSelection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }

      private PivotSelection() {
        dimensionName_ = "";
        dimensionValue_ = "";
      }

      @java.lang.Override
      @SuppressWarnings({"unused"})
      protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
        return new PivotSelection();
      }

      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
      }

      private PivotSelection(
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
                  java.lang.String s = input.readStringRequireUtf8();

                  dimensionName_ = s;
                  break;
                }
              case 18:
                {
                  java.lang.String s = input.readStringRequireUtf8();

                  dimensionValue_ = s;
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
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(this);
        } finally {
          this.unknownFields = unknownFields.build();
          makeExtensionsImmutable();
        }
      }

      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_OrderBy_PivotOrderBy_PivotSelection_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_OrderBy_PivotOrderBy_PivotSelection_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection.class,
                com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection.Builder
                    .class);
      }

      public static final int DIMENSION_NAME_FIELD_NUMBER = 1;
      private volatile java.lang.Object dimensionName_;
      /**
       *
       *
       * <pre>
       * Must be a dimension name from the request.
       * </pre>
       *
       * <code>string dimension_name = 1;</code>
       *
       * @return The dimensionName.
       */
      @java.lang.Override
      public java.lang.String getDimensionName() {
        java.lang.Object ref = dimensionName_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          dimensionName_ = s;
          return s;
        }
      }
      /**
       *
       *
       * <pre>
       * Must be a dimension name from the request.
       * </pre>
       *
       * <code>string dimension_name = 1;</code>
       *
       * @return The bytes for dimensionName.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getDimensionNameBytes() {
        java.lang.Object ref = dimensionName_;
        if (ref instanceof java.lang.String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          dimensionName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      public static final int DIMENSION_VALUE_FIELD_NUMBER = 2;
      private volatile java.lang.Object dimensionValue_;
      /**
       *
       *
       * <pre>
       * Order by only when the named dimension is this value.
       * </pre>
       *
       * <code>string dimension_value = 2;</code>
       *
       * @return The dimensionValue.
       */
      @java.lang.Override
      public java.lang.String getDimensionValue() {
        java.lang.Object ref = dimensionValue_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          dimensionValue_ = s;
          return s;
        }
      }
      /**
       *
       *
       * <pre>
       * Order by only when the named dimension is this value.
       * </pre>
       *
       * <code>string dimension_value = 2;</code>
       *
       * @return The bytes for dimensionValue.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getDimensionValueBytes() {
        java.lang.Object ref = dimensionValue_;
        if (ref instanceof java.lang.String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          dimensionValue_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
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
        if (!getDimensionNameBytes().isEmpty()) {
          com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dimensionName_);
        }
        if (!getDimensionValueBytes().isEmpty()) {
          com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dimensionValue_);
        }
        unknownFields.writeTo(output);
      }

      @java.lang.Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (!getDimensionNameBytes().isEmpty()) {
          size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dimensionName_);
        }
        if (!getDimensionValueBytes().isEmpty()) {
          size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dimensionValue_);
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
        if (!(obj
            instanceof com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection)) {
          return super.equals(obj);
        }
        com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection other =
            (com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection) obj;

        if (!getDimensionName().equals(other.getDimensionName())) return false;
        if (!getDimensionValue().equals(other.getDimensionValue())) return false;
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
        hash = (37 * hash) + DIMENSION_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getDimensionName().hashCode();
        hash = (37 * hash) + DIMENSION_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getDimensionValue().hashCode();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection parseFrom(
          java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }

      public static com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }

      public static com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }

      public static com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }

      public static com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection parseFrom(
          byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }

      public static com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection parseFrom(
          byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }

      public static com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection parseFrom(
          java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
            PARSER, input, extensionRegistry);
      }

      public static com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection
          parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection
          parseDelimitedFrom(
              java.io.InputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
            PARSER, input, extensionRegistry);
      }

      public static com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection parseFrom(
          com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection parseFrom(
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
          com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      @java.lang.Override
      public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       *
       *
       * <pre>
       * A pair of dimension names and values. Rows with this dimension pivot pair
       * are ordered by the metric's value.
       * For example if pivots = {{"browser", "Chrome"}} and
       * metric_name = "Sessions",
       * then the rows will be sorted based on Sessions in Chrome.
       *     ---------|----------|----------------|----------|----------------
       *              |  Chrome  |    Chrome      |  Safari  |     Safari
       *     ---------|----------|----------------|----------|----------------
       *      Country | Sessions | Pages/Sessions | Sessions | Pages/Sessions
       *     ---------|----------|----------------|----------|----------------
       *         US   |    2     |       2        |     3    |        1
       *     ---------|----------|----------------|----------|----------------
       *       Canada |    3     |       1        |     4    |        1
       *     ---------|----------|----------------|----------|----------------
       * </pre>
       *
       * Protobuf type {@code google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection}
       */
      public static final class Builder
          extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
          implements
          // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection)
          com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelectionOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
          return com.google.analytics.data.v1alpha.ReportingApiProto
              .internal_static_google_analytics_data_v1alpha_OrderBy_PivotOrderBy_PivotSelection_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return com.google.analytics.data.v1alpha.ReportingApiProto
              .internal_static_google_analytics_data_v1alpha_OrderBy_PivotOrderBy_PivotSelection_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection.class,
                  com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection.Builder
                      .class);
        }

        // Construct using
        // com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection.newBuilder()
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
          dimensionName_ = "";

          dimensionValue_ = "";

          return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
          return com.google.analytics.data.v1alpha.ReportingApiProto
              .internal_static_google_analytics_data_v1alpha_OrderBy_PivotOrderBy_PivotSelection_descriptor;
        }

        @java.lang.Override
        public com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection
            getDefaultInstanceForType() {
          return com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection
              .getDefaultInstance();
        }

        @java.lang.Override
        public com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection build() {
          com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection result =
              buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @java.lang.Override
        public com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection
            buildPartial() {
          com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection result =
              new com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection(this);
          result.dimensionName_ = dimensionName_;
          result.dimensionValue_ = dimensionValue_;
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
            com.google.protobuf.Descriptors.FieldDescriptor field,
            int index,
            java.lang.Object value) {
          return super.setRepeatedField(field, index, value);
        }

        @java.lang.Override
        public Builder addRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
          return super.addRepeatedField(field, value);
        }

        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other
              instanceof com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection) {
            return mergeFrom(
                (com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection) other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(
            com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection other) {
          if (other
              == com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection
                  .getDefaultInstance()) return this;
          if (!other.getDimensionName().isEmpty()) {
            dimensionName_ = other.dimensionName_;
            onChanged();
          }
          if (!other.getDimensionValue().isEmpty()) {
            dimensionValue_ = other.dimensionValue_;
            onChanged();
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
          com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection parsedMessage =
              null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage =
                (com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection)
                    e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }

        private java.lang.Object dimensionName_ = "";
        /**
         *
         *
         * <pre>
         * Must be a dimension name from the request.
         * </pre>
         *
         * <code>string dimension_name = 1;</code>
         *
         * @return The dimensionName.
         */
        public java.lang.String getDimensionName() {
          java.lang.Object ref = dimensionName_;
          if (!(ref instanceof java.lang.String)) {
            com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            dimensionName_ = s;
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         *
         *
         * <pre>
         * Must be a dimension name from the request.
         * </pre>
         *
         * <code>string dimension_name = 1;</code>
         *
         * @return The bytes for dimensionName.
         */
        public com.google.protobuf.ByteString getDimensionNameBytes() {
          java.lang.Object ref = dimensionName_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
            dimensionName_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         *
         *
         * <pre>
         * Must be a dimension name from the request.
         * </pre>
         *
         * <code>string dimension_name = 1;</code>
         *
         * @param value The dimensionName to set.
         * @return This builder for chaining.
         */
        public Builder setDimensionName(java.lang.String value) {
          if (value == null) {
            throw new NullPointerException();
          }

          dimensionName_ = value;
          onChanged();
          return this;
        }
        /**
         *
         *
         * <pre>
         * Must be a dimension name from the request.
         * </pre>
         *
         * <code>string dimension_name = 1;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearDimensionName() {

          dimensionName_ = getDefaultInstance().getDimensionName();
          onChanged();
          return this;
        }
        /**
         *
         *
         * <pre>
         * Must be a dimension name from the request.
         * </pre>
         *
         * <code>string dimension_name = 1;</code>
         *
         * @param value The bytes for dimensionName to set.
         * @return This builder for chaining.
         */
        public Builder setDimensionNameBytes(com.google.protobuf.ByteString value) {
          if (value == null) {
            throw new NullPointerException();
          }
          checkByteStringIsUtf8(value);

          dimensionName_ = value;
          onChanged();
          return this;
        }

        private java.lang.Object dimensionValue_ = "";
        /**
         *
         *
         * <pre>
         * Order by only when the named dimension is this value.
         * </pre>
         *
         * <code>string dimension_value = 2;</code>
         *
         * @return The dimensionValue.
         */
        public java.lang.String getDimensionValue() {
          java.lang.Object ref = dimensionValue_;
          if (!(ref instanceof java.lang.String)) {
            com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            dimensionValue_ = s;
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         *
         *
         * <pre>
         * Order by only when the named dimension is this value.
         * </pre>
         *
         * <code>string dimension_value = 2;</code>
         *
         * @return The bytes for dimensionValue.
         */
        public com.google.protobuf.ByteString getDimensionValueBytes() {
          java.lang.Object ref = dimensionValue_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
            dimensionValue_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         *
         *
         * <pre>
         * Order by only when the named dimension is this value.
         * </pre>
         *
         * <code>string dimension_value = 2;</code>
         *
         * @param value The dimensionValue to set.
         * @return This builder for chaining.
         */
        public Builder setDimensionValue(java.lang.String value) {
          if (value == null) {
            throw new NullPointerException();
          }

          dimensionValue_ = value;
          onChanged();
          return this;
        }
        /**
         *
         *
         * <pre>
         * Order by only when the named dimension is this value.
         * </pre>
         *
         * <code>string dimension_value = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearDimensionValue() {

          dimensionValue_ = getDefaultInstance().getDimensionValue();
          onChanged();
          return this;
        }
        /**
         *
         *
         * <pre>
         * Order by only when the named dimension is this value.
         * </pre>
         *
         * <code>string dimension_value = 2;</code>
         *
         * @param value The bytes for dimensionValue to set.
         * @return This builder for chaining.
         */
        public Builder setDimensionValueBytes(com.google.protobuf.ByteString value) {
          if (value == null) {
            throw new NullPointerException();
          }
          checkByteStringIsUtf8(value);

          dimensionValue_ = value;
          onChanged();
          return this;
        }

        @java.lang.Override
        public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.mergeUnknownFields(unknownFields);
        }

        // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection)
      }

      // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection)
      private static final com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection
          DEFAULT_INSTANCE;

      static {
        DEFAULT_INSTANCE =
            new com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection();
      }

      public static com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection
          getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      private static final com.google.protobuf.Parser<PivotSelection> PARSER =
          new com.google.protobuf.AbstractParser<PivotSelection>() {
            @java.lang.Override
            public PivotSelection parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return new PivotSelection(input, extensionRegistry);
            }
          };

      public static com.google.protobuf.Parser<PivotSelection> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.google.protobuf.Parser<PivotSelection> getParserForType() {
        return PARSER;
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection
          getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }
    }

    public static final int METRIC_NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object metricName_;
    /**
     *
     *
     * <pre>
     * In the response to order by, order rows by this column. Must be a metric
     * name from the request.
     * </pre>
     *
     * <code>string metric_name = 1;</code>
     *
     * @return The metricName.
     */
    @java.lang.Override
    public java.lang.String getMetricName() {
      java.lang.Object ref = metricName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        metricName_ = s;
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * In the response to order by, order rows by this column. Must be a metric
     * name from the request.
     * </pre>
     *
     * <code>string metric_name = 1;</code>
     *
     * @return The bytes for metricName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMetricNameBytes() {
      java.lang.Object ref = metricName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        metricName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PIVOT_SELECTIONS_FIELD_NUMBER = 2;
    private java.util.List<com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection>
        pivotSelections_;
    /**
     *
     *
     * <pre>
     * Used to select a dimension name and value pivot. If multiple pivot
     * selections are given, the sort occurs on rows where all pivot selection
     * dimension name and value pairs match the row's dimension name and value
     * pair.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
     * </code>
     */
    @java.lang.Override
    public java.util.List<com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection>
        getPivotSelectionsList() {
      return pivotSelections_;
    }
    /**
     *
     *
     * <pre>
     * Used to select a dimension name and value pivot. If multiple pivot
     * selections are given, the sort occurs on rows where all pivot selection
     * dimension name and value pairs match the row's dimension name and value
     * pair.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
     * </code>
     */
    @java.lang.Override
    public java.util.List<
            ? extends
                com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelectionOrBuilder>
        getPivotSelectionsOrBuilderList() {
      return pivotSelections_;
    }
    /**
     *
     *
     * <pre>
     * Used to select a dimension name and value pivot. If multiple pivot
     * selections are given, the sort occurs on rows where all pivot selection
     * dimension name and value pairs match the row's dimension name and value
     * pair.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
     * </code>
     */
    @java.lang.Override
    public int getPivotSelectionsCount() {
      return pivotSelections_.size();
    }
    /**
     *
     *
     * <pre>
     * Used to select a dimension name and value pivot. If multiple pivot
     * selections are given, the sort occurs on rows where all pivot selection
     * dimension name and value pairs match the row's dimension name and value
     * pair.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
     * </code>
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection getPivotSelections(
        int index) {
      return pivotSelections_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Used to select a dimension name and value pivot. If multiple pivot
     * selections are given, the sort occurs on rows where all pivot selection
     * dimension name and value pairs match the row's dimension name and value
     * pair.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
     * </code>
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelectionOrBuilder
        getPivotSelectionsOrBuilder(int index) {
      return pivotSelections_.get(index);
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
      if (!getMetricNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, metricName_);
      }
      for (int i = 0; i < pivotSelections_.size(); i++) {
        output.writeMessage(2, pivotSelections_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getMetricNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, metricName_);
      }
      for (int i = 0; i < pivotSelections_.size(); i++) {
        size +=
            com.google.protobuf.CodedOutputStream.computeMessageSize(2, pivotSelections_.get(i));
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
      if (!(obj instanceof com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy)) {
        return super.equals(obj);
      }
      com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy other =
          (com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy) obj;

      if (!getMetricName().equals(other.getMetricName())) return false;
      if (!getPivotSelectionsList().equals(other.getPivotSelectionsList())) return false;
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
      hash = (37 * hash) + METRIC_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getMetricName().hashCode();
      if (getPivotSelectionsCount() > 0) {
        hash = (37 * hash) + PIVOT_SELECTIONS_FIELD_NUMBER;
        hash = (53 * hash) + getPivotSelectionsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy parseFrom(
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
        com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * Sorts by a pivot column group.
     * </pre>
     *
     * Protobuf type {@code google.analytics.data.v1alpha.OrderBy.PivotOrderBy}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.OrderBy.PivotOrderBy)
        com.google.analytics.data.v1alpha.OrderBy.PivotOrderByOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_OrderBy_PivotOrderBy_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_OrderBy_PivotOrderBy_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.class,
                com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.Builder.class);
      }

      // Construct using com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getPivotSelectionsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        metricName_ = "";

        if (pivotSelectionsBuilder_ == null) {
          pivotSelections_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          pivotSelectionsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_OrderBy_PivotOrderBy_descriptor;
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy getDefaultInstanceForType() {
        return com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.getDefaultInstance();
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy build() {
        com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy buildPartial() {
        com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy result =
            new com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy(this);
        int from_bitField0_ = bitField0_;
        result.metricName_ = metricName_;
        if (pivotSelectionsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            pivotSelections_ = java.util.Collections.unmodifiableList(pivotSelections_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.pivotSelections_ = pivotSelections_;
        } else {
          result.pivotSelections_ = pivotSelectionsBuilder_.build();
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
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy) {
          return mergeFrom((com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy other) {
        if (other == com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.getDefaultInstance())
          return this;
        if (!other.getMetricName().isEmpty()) {
          metricName_ = other.metricName_;
          onChanged();
        }
        if (pivotSelectionsBuilder_ == null) {
          if (!other.pivotSelections_.isEmpty()) {
            if (pivotSelections_.isEmpty()) {
              pivotSelections_ = other.pivotSelections_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePivotSelectionsIsMutable();
              pivotSelections_.addAll(other.pivotSelections_);
            }
            onChanged();
          }
        } else {
          if (!other.pivotSelections_.isEmpty()) {
            if (pivotSelectionsBuilder_.isEmpty()) {
              pivotSelectionsBuilder_.dispose();
              pivotSelectionsBuilder_ = null;
              pivotSelections_ = other.pivotSelections_;
              bitField0_ = (bitField0_ & ~0x00000001);
              pivotSelectionsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getPivotSelectionsFieldBuilder()
                      : null;
            } else {
              pivotSelectionsBuilder_.addAllMessages(other.pivotSelections_);
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
        com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object metricName_ = "";
      /**
       *
       *
       * <pre>
       * In the response to order by, order rows by this column. Must be a metric
       * name from the request.
       * </pre>
       *
       * <code>string metric_name = 1;</code>
       *
       * @return The metricName.
       */
      public java.lang.String getMetricName() {
        java.lang.Object ref = metricName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          metricName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * In the response to order by, order rows by this column. Must be a metric
       * name from the request.
       * </pre>
       *
       * <code>string metric_name = 1;</code>
       *
       * @return The bytes for metricName.
       */
      public com.google.protobuf.ByteString getMetricNameBytes() {
        java.lang.Object ref = metricName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          metricName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * In the response to order by, order rows by this column. Must be a metric
       * name from the request.
       * </pre>
       *
       * <code>string metric_name = 1;</code>
       *
       * @param value The metricName to set.
       * @return This builder for chaining.
       */
      public Builder setMetricName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }

        metricName_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * In the response to order by, order rows by this column. Must be a metric
       * name from the request.
       * </pre>
       *
       * <code>string metric_name = 1;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearMetricName() {

        metricName_ = getDefaultInstance().getMetricName();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * In the response to order by, order rows by this column. Must be a metric
       * name from the request.
       * </pre>
       *
       * <code>string metric_name = 1;</code>
       *
       * @param value The bytes for metricName to set.
       * @return This builder for chaining.
       */
      public Builder setMetricNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        checkByteStringIsUtf8(value);

        metricName_ = value;
        onChanged();
        return this;
      }

      private java.util.List<com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection>
          pivotSelections_ = java.util.Collections.emptyList();

      private void ensurePivotSelectionsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          pivotSelections_ =
              new java.util.ArrayList<
                  com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection>(
                  pivotSelections_);
          bitField0_ |= 0x00000001;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection,
              com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection.Builder,
              com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelectionOrBuilder>
          pivotSelectionsBuilder_;

      /**
       *
       *
       * <pre>
       * Used to select a dimension name and value pivot. If multiple pivot
       * selections are given, the sort occurs on rows where all pivot selection
       * dimension name and value pairs match the row's dimension name and value
       * pair.
       * </pre>
       *
       * <code>
       * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
       * </code>
       */
      public java.util.List<com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection>
          getPivotSelectionsList() {
        if (pivotSelectionsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(pivotSelections_);
        } else {
          return pivotSelectionsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * Used to select a dimension name and value pivot. If multiple pivot
       * selections are given, the sort occurs on rows where all pivot selection
       * dimension name and value pairs match the row's dimension name and value
       * pair.
       * </pre>
       *
       * <code>
       * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
       * </code>
       */
      public int getPivotSelectionsCount() {
        if (pivotSelectionsBuilder_ == null) {
          return pivotSelections_.size();
        } else {
          return pivotSelectionsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * Used to select a dimension name and value pivot. If multiple pivot
       * selections are given, the sort occurs on rows where all pivot selection
       * dimension name and value pairs match the row's dimension name and value
       * pair.
       * </pre>
       *
       * <code>
       * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
       * </code>
       */
      public com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection
          getPivotSelections(int index) {
        if (pivotSelectionsBuilder_ == null) {
          return pivotSelections_.get(index);
        } else {
          return pivotSelectionsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Used to select a dimension name and value pivot. If multiple pivot
       * selections are given, the sort occurs on rows where all pivot selection
       * dimension name and value pairs match the row's dimension name and value
       * pair.
       * </pre>
       *
       * <code>
       * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
       * </code>
       */
      public Builder setPivotSelections(
          int index, com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection value) {
        if (pivotSelectionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePivotSelectionsIsMutable();
          pivotSelections_.set(index, value);
          onChanged();
        } else {
          pivotSelectionsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Used to select a dimension name and value pivot. If multiple pivot
       * selections are given, the sort occurs on rows where all pivot selection
       * dimension name and value pairs match the row's dimension name and value
       * pair.
       * </pre>
       *
       * <code>
       * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
       * </code>
       */
      public Builder setPivotSelections(
          int index,
          com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection.Builder
              builderForValue) {
        if (pivotSelectionsBuilder_ == null) {
          ensurePivotSelectionsIsMutable();
          pivotSelections_.set(index, builderForValue.build());
          onChanged();
        } else {
          pivotSelectionsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Used to select a dimension name and value pivot. If multiple pivot
       * selections are given, the sort occurs on rows where all pivot selection
       * dimension name and value pairs match the row's dimension name and value
       * pair.
       * </pre>
       *
       * <code>
       * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
       * </code>
       */
      public Builder addPivotSelections(
          com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection value) {
        if (pivotSelectionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePivotSelectionsIsMutable();
          pivotSelections_.add(value);
          onChanged();
        } else {
          pivotSelectionsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Used to select a dimension name and value pivot. If multiple pivot
       * selections are given, the sort occurs on rows where all pivot selection
       * dimension name and value pairs match the row's dimension name and value
       * pair.
       * </pre>
       *
       * <code>
       * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
       * </code>
       */
      public Builder addPivotSelections(
          int index, com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection value) {
        if (pivotSelectionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePivotSelectionsIsMutable();
          pivotSelections_.add(index, value);
          onChanged();
        } else {
          pivotSelectionsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Used to select a dimension name and value pivot. If multiple pivot
       * selections are given, the sort occurs on rows where all pivot selection
       * dimension name and value pairs match the row's dimension name and value
       * pair.
       * </pre>
       *
       * <code>
       * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
       * </code>
       */
      public Builder addPivotSelections(
          com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection.Builder
              builderForValue) {
        if (pivotSelectionsBuilder_ == null) {
          ensurePivotSelectionsIsMutable();
          pivotSelections_.add(builderForValue.build());
          onChanged();
        } else {
          pivotSelectionsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Used to select a dimension name and value pivot. If multiple pivot
       * selections are given, the sort occurs on rows where all pivot selection
       * dimension name and value pairs match the row's dimension name and value
       * pair.
       * </pre>
       *
       * <code>
       * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
       * </code>
       */
      public Builder addPivotSelections(
          int index,
          com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection.Builder
              builderForValue) {
        if (pivotSelectionsBuilder_ == null) {
          ensurePivotSelectionsIsMutable();
          pivotSelections_.add(index, builderForValue.build());
          onChanged();
        } else {
          pivotSelectionsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Used to select a dimension name and value pivot. If multiple pivot
       * selections are given, the sort occurs on rows where all pivot selection
       * dimension name and value pairs match the row's dimension name and value
       * pair.
       * </pre>
       *
       * <code>
       * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
       * </code>
       */
      public Builder addAllPivotSelections(
          java.lang.Iterable<
                  ? extends com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection>
              values) {
        if (pivotSelectionsBuilder_ == null) {
          ensurePivotSelectionsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, pivotSelections_);
          onChanged();
        } else {
          pivotSelectionsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Used to select a dimension name and value pivot. If multiple pivot
       * selections are given, the sort occurs on rows where all pivot selection
       * dimension name and value pairs match the row's dimension name and value
       * pair.
       * </pre>
       *
       * <code>
       * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
       * </code>
       */
      public Builder clearPivotSelections() {
        if (pivotSelectionsBuilder_ == null) {
          pivotSelections_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          pivotSelectionsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Used to select a dimension name and value pivot. If multiple pivot
       * selections are given, the sort occurs on rows where all pivot selection
       * dimension name and value pairs match the row's dimension name and value
       * pair.
       * </pre>
       *
       * <code>
       * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
       * </code>
       */
      public Builder removePivotSelections(int index) {
        if (pivotSelectionsBuilder_ == null) {
          ensurePivotSelectionsIsMutable();
          pivotSelections_.remove(index);
          onChanged();
        } else {
          pivotSelectionsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Used to select a dimension name and value pivot. If multiple pivot
       * selections are given, the sort occurs on rows where all pivot selection
       * dimension name and value pairs match the row's dimension name and value
       * pair.
       * </pre>
       *
       * <code>
       * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
       * </code>
       */
      public com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection.Builder
          getPivotSelectionsBuilder(int index) {
        return getPivotSelectionsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Used to select a dimension name and value pivot. If multiple pivot
       * selections are given, the sort occurs on rows where all pivot selection
       * dimension name and value pairs match the row's dimension name and value
       * pair.
       * </pre>
       *
       * <code>
       * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
       * </code>
       */
      public com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelectionOrBuilder
          getPivotSelectionsOrBuilder(int index) {
        if (pivotSelectionsBuilder_ == null) {
          return pivotSelections_.get(index);
        } else {
          return pivotSelectionsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Used to select a dimension name and value pivot. If multiple pivot
       * selections are given, the sort occurs on rows where all pivot selection
       * dimension name and value pairs match the row's dimension name and value
       * pair.
       * </pre>
       *
       * <code>
       * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
       * </code>
       */
      public java.util.List<
              ? extends
                  com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelectionOrBuilder>
          getPivotSelectionsOrBuilderList() {
        if (pivotSelectionsBuilder_ != null) {
          return pivotSelectionsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(pivotSelections_);
        }
      }
      /**
       *
       *
       * <pre>
       * Used to select a dimension name and value pivot. If multiple pivot
       * selections are given, the sort occurs on rows where all pivot selection
       * dimension name and value pairs match the row's dimension name and value
       * pair.
       * </pre>
       *
       * <code>
       * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
       * </code>
       */
      public com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection.Builder
          addPivotSelectionsBuilder() {
        return getPivotSelectionsFieldBuilder()
            .addBuilder(
                com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Used to select a dimension name and value pivot. If multiple pivot
       * selections are given, the sort occurs on rows where all pivot selection
       * dimension name and value pairs match the row's dimension name and value
       * pair.
       * </pre>
       *
       * <code>
       * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
       * </code>
       */
      public com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection.Builder
          addPivotSelectionsBuilder(int index) {
        return getPivotSelectionsFieldBuilder()
            .addBuilder(
                index,
                com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Used to select a dimension name and value pivot. If multiple pivot
       * selections are given, the sort occurs on rows where all pivot selection
       * dimension name and value pairs match the row's dimension name and value
       * pair.
       * </pre>
       *
       * <code>
       * repeated .google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection pivot_selections = 2;
       * </code>
       */
      public java.util.List<
              com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection.Builder>
          getPivotSelectionsBuilderList() {
        return getPivotSelectionsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection,
              com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection.Builder,
              com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelectionOrBuilder>
          getPivotSelectionsFieldBuilder() {
        if (pivotSelectionsBuilder_ == null) {
          pivotSelectionsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection,
                  com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelection.Builder,
                  com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.PivotSelectionOrBuilder>(
                  pivotSelections_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          pivotSelections_ = null;
        }
        return pivotSelectionsBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.OrderBy.PivotOrderBy)
    }

    // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.OrderBy.PivotOrderBy)
    private static final com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy();
    }

    public static com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PivotOrderBy> PARSER =
        new com.google.protobuf.AbstractParser<PivotOrderBy>() {
          @java.lang.Override
          public PivotOrderBy parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new PivotOrderBy(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<PivotOrderBy> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PivotOrderBy> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private int oneOrderByCase_ = 0;
  private java.lang.Object oneOrderBy_;

  public enum OneOrderByCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    METRIC(1),
    DIMENSION(2),
    PIVOT(3),
    ONEORDERBY_NOT_SET(0);
    private final int value;

    private OneOrderByCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OneOrderByCase valueOf(int value) {
      return forNumber(value);
    }

    public static OneOrderByCase forNumber(int value) {
      switch (value) {
        case 1:
          return METRIC;
        case 2:
          return DIMENSION;
        case 3:
          return PIVOT;
        case 0:
          return ONEORDERBY_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public OneOrderByCase getOneOrderByCase() {
    return OneOrderByCase.forNumber(oneOrderByCase_);
  }

  public static final int METRIC_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Sorts results by a metric's values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.OrderBy.MetricOrderBy metric = 1;</code>
   *
   * @return Whether the metric field is set.
   */
  @java.lang.Override
  public boolean hasMetric() {
    return oneOrderByCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Sorts results by a metric's values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.OrderBy.MetricOrderBy metric = 1;</code>
   *
   * @return The metric.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy getMetric() {
    if (oneOrderByCase_ == 1) {
      return (com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy) oneOrderBy_;
    }
    return com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Sorts results by a metric's values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.OrderBy.MetricOrderBy metric = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.OrderBy.MetricOrderByOrBuilder getMetricOrBuilder() {
    if (oneOrderByCase_ == 1) {
      return (com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy) oneOrderBy_;
    }
    return com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy.getDefaultInstance();
  }

  public static final int DIMENSION_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Sorts results by a dimension's values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy dimension = 2;</code>
   *
   * @return Whether the dimension field is set.
   */
  @java.lang.Override
  public boolean hasDimension() {
    return oneOrderByCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Sorts results by a dimension's values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy dimension = 2;</code>
   *
   * @return The dimension.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy getDimension() {
    if (oneOrderByCase_ == 2) {
      return (com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy) oneOrderBy_;
    }
    return com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Sorts results by a dimension's values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy dimension = 2;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.OrderBy.DimensionOrderByOrBuilder
      getDimensionOrBuilder() {
    if (oneOrderByCase_ == 2) {
      return (com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy) oneOrderBy_;
    }
    return com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.getDefaultInstance();
  }

  public static final int PIVOT_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * Sorts results by a metric's values within a pivot column group.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.OrderBy.PivotOrderBy pivot = 3;</code>
   *
   * @return Whether the pivot field is set.
   */
  @java.lang.Override
  public boolean hasPivot() {
    return oneOrderByCase_ == 3;
  }
  /**
   *
   *
   * <pre>
   * Sorts results by a metric's values within a pivot column group.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.OrderBy.PivotOrderBy pivot = 3;</code>
   *
   * @return The pivot.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy getPivot() {
    if (oneOrderByCase_ == 3) {
      return (com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy) oneOrderBy_;
    }
    return com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Sorts results by a metric's values within a pivot column group.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.OrderBy.PivotOrderBy pivot = 3;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.OrderBy.PivotOrderByOrBuilder getPivotOrBuilder() {
    if (oneOrderByCase_ == 3) {
      return (com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy) oneOrderBy_;
    }
    return com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.getDefaultInstance();
  }

  public static final int DESC_FIELD_NUMBER = 4;
  private boolean desc_;
  /**
   *
   *
   * <pre>
   * If true, sorts by descending order.
   * </pre>
   *
   * <code>bool desc = 4;</code>
   *
   * @return The desc.
   */
  @java.lang.Override
  public boolean getDesc() {
    return desc_;
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
    if (oneOrderByCase_ == 1) {
      output.writeMessage(1, (com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy) oneOrderBy_);
    }
    if (oneOrderByCase_ == 2) {
      output.writeMessage(
          2, (com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy) oneOrderBy_);
    }
    if (oneOrderByCase_ == 3) {
      output.writeMessage(3, (com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy) oneOrderBy_);
    }
    if (desc_ != false) {
      output.writeBool(4, desc_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (oneOrderByCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy) oneOrderBy_);
    }
    if (oneOrderByCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy) oneOrderBy_);
    }
    if (oneOrderByCase_ == 3) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              3, (com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy) oneOrderBy_);
    }
    if (desc_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, desc_);
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.OrderBy)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.OrderBy other =
        (com.google.analytics.data.v1alpha.OrderBy) obj;

    if (getDesc() != other.getDesc()) return false;
    if (!getOneOrderByCase().equals(other.getOneOrderByCase())) return false;
    switch (oneOrderByCase_) {
      case 1:
        if (!getMetric().equals(other.getMetric())) return false;
        break;
      case 2:
        if (!getDimension().equals(other.getDimension())) return false;
        break;
      case 3:
        if (!getPivot().equals(other.getPivot())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + DESC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getDesc());
    switch (oneOrderByCase_) {
      case 1:
        hash = (37 * hash) + METRIC_FIELD_NUMBER;
        hash = (53 * hash) + getMetric().hashCode();
        break;
      case 2:
        hash = (37 * hash) + DIMENSION_FIELD_NUMBER;
        hash = (53 * hash) + getDimension().hashCode();
        break;
      case 3:
        hash = (37 * hash) + PIVOT_FIELD_NUMBER;
        hash = (53 * hash) + getPivot().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.OrderBy parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.OrderBy parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.OrderBy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.OrderBy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.OrderBy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.OrderBy parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.OrderBy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.OrderBy parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.OrderBy parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.OrderBy parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.OrderBy parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.OrderBy parseFrom(
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

  public static Builder newBuilder(com.google.analytics.data.v1alpha.OrderBy prototype) {
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
   * The sort options.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.OrderBy}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.OrderBy)
      com.google.analytics.data.v1alpha.OrderByOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_OrderBy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_OrderBy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.OrderBy.class,
              com.google.analytics.data.v1alpha.OrderBy.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.OrderBy.newBuilder()
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
      desc_ = false;

      oneOrderByCase_ = 0;
      oneOrderBy_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_OrderBy_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.OrderBy getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.OrderBy.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.OrderBy build() {
      com.google.analytics.data.v1alpha.OrderBy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.OrderBy buildPartial() {
      com.google.analytics.data.v1alpha.OrderBy result =
          new com.google.analytics.data.v1alpha.OrderBy(this);
      if (oneOrderByCase_ == 1) {
        if (metricBuilder_ == null) {
          result.oneOrderBy_ = oneOrderBy_;
        } else {
          result.oneOrderBy_ = metricBuilder_.build();
        }
      }
      if (oneOrderByCase_ == 2) {
        if (dimensionBuilder_ == null) {
          result.oneOrderBy_ = oneOrderBy_;
        } else {
          result.oneOrderBy_ = dimensionBuilder_.build();
        }
      }
      if (oneOrderByCase_ == 3) {
        if (pivotBuilder_ == null) {
          result.oneOrderBy_ = oneOrderBy_;
        } else {
          result.oneOrderBy_ = pivotBuilder_.build();
        }
      }
      result.desc_ = desc_;
      result.oneOrderByCase_ = oneOrderByCase_;
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
      if (other instanceof com.google.analytics.data.v1alpha.OrderBy) {
        return mergeFrom((com.google.analytics.data.v1alpha.OrderBy) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.OrderBy other) {
      if (other == com.google.analytics.data.v1alpha.OrderBy.getDefaultInstance()) return this;
      if (other.getDesc() != false) {
        setDesc(other.getDesc());
      }
      switch (other.getOneOrderByCase()) {
        case METRIC:
          {
            mergeMetric(other.getMetric());
            break;
          }
        case DIMENSION:
          {
            mergeDimension(other.getDimension());
            break;
          }
        case PIVOT:
          {
            mergePivot(other.getPivot());
            break;
          }
        case ONEORDERBY_NOT_SET:
          {
            break;
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
      com.google.analytics.data.v1alpha.OrderBy parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.analytics.data.v1alpha.OrderBy) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int oneOrderByCase_ = 0;
    private java.lang.Object oneOrderBy_;

    public OneOrderByCase getOneOrderByCase() {
      return OneOrderByCase.forNumber(oneOrderByCase_);
    }

    public Builder clearOneOrderBy() {
      oneOrderByCase_ = 0;
      oneOrderBy_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy,
            com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy.Builder,
            com.google.analytics.data.v1alpha.OrderBy.MetricOrderByOrBuilder>
        metricBuilder_;
    /**
     *
     *
     * <pre>
     * Sorts results by a metric's values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.MetricOrderBy metric = 1;</code>
     *
     * @return Whether the metric field is set.
     */
    @java.lang.Override
    public boolean hasMetric() {
      return oneOrderByCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Sorts results by a metric's values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.MetricOrderBy metric = 1;</code>
     *
     * @return The metric.
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy getMetric() {
      if (metricBuilder_ == null) {
        if (oneOrderByCase_ == 1) {
          return (com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy) oneOrderBy_;
        }
        return com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy.getDefaultInstance();
      } else {
        if (oneOrderByCase_ == 1) {
          return metricBuilder_.getMessage();
        }
        return com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Sorts results by a metric's values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.MetricOrderBy metric = 1;</code>
     */
    public Builder setMetric(com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy value) {
      if (metricBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        oneOrderBy_ = value;
        onChanged();
      } else {
        metricBuilder_.setMessage(value);
      }
      oneOrderByCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Sorts results by a metric's values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.MetricOrderBy metric = 1;</code>
     */
    public Builder setMetric(
        com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy.Builder builderForValue) {
      if (metricBuilder_ == null) {
        oneOrderBy_ = builderForValue.build();
        onChanged();
      } else {
        metricBuilder_.setMessage(builderForValue.build());
      }
      oneOrderByCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Sorts results by a metric's values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.MetricOrderBy metric = 1;</code>
     */
    public Builder mergeMetric(com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy value) {
      if (metricBuilder_ == null) {
        if (oneOrderByCase_ == 1
            && oneOrderBy_
                != com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy.getDefaultInstance()) {
          oneOrderBy_ =
              com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy.newBuilder(
                      (com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy) oneOrderBy_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          oneOrderBy_ = value;
        }
        onChanged();
      } else {
        if (oneOrderByCase_ == 1) {
          metricBuilder_.mergeFrom(value);
        }
        metricBuilder_.setMessage(value);
      }
      oneOrderByCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Sorts results by a metric's values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.MetricOrderBy metric = 1;</code>
     */
    public Builder clearMetric() {
      if (metricBuilder_ == null) {
        if (oneOrderByCase_ == 1) {
          oneOrderByCase_ = 0;
          oneOrderBy_ = null;
          onChanged();
        }
      } else {
        if (oneOrderByCase_ == 1) {
          oneOrderByCase_ = 0;
          oneOrderBy_ = null;
        }
        metricBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Sorts results by a metric's values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.MetricOrderBy metric = 1;</code>
     */
    public com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy.Builder getMetricBuilder() {
      return getMetricFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Sorts results by a metric's values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.MetricOrderBy metric = 1;</code>
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.OrderBy.MetricOrderByOrBuilder getMetricOrBuilder() {
      if ((oneOrderByCase_ == 1) && (metricBuilder_ != null)) {
        return metricBuilder_.getMessageOrBuilder();
      } else {
        if (oneOrderByCase_ == 1) {
          return (com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy) oneOrderBy_;
        }
        return com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Sorts results by a metric's values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.MetricOrderBy metric = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy,
            com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy.Builder,
            com.google.analytics.data.v1alpha.OrderBy.MetricOrderByOrBuilder>
        getMetricFieldBuilder() {
      if (metricBuilder_ == null) {
        if (!(oneOrderByCase_ == 1)) {
          oneOrderBy_ =
              com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy.getDefaultInstance();
        }
        metricBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy,
                com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy.Builder,
                com.google.analytics.data.v1alpha.OrderBy.MetricOrderByOrBuilder>(
                (com.google.analytics.data.v1alpha.OrderBy.MetricOrderBy) oneOrderBy_,
                getParentForChildren(),
                isClean());
        oneOrderBy_ = null;
      }
      oneOrderByCase_ = 1;
      onChanged();
      ;
      return metricBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy,
            com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.Builder,
            com.google.analytics.data.v1alpha.OrderBy.DimensionOrderByOrBuilder>
        dimensionBuilder_;
    /**
     *
     *
     * <pre>
     * Sorts results by a dimension's values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy dimension = 2;</code>
     *
     * @return Whether the dimension field is set.
     */
    @java.lang.Override
    public boolean hasDimension() {
      return oneOrderByCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Sorts results by a dimension's values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy dimension = 2;</code>
     *
     * @return The dimension.
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy getDimension() {
      if (dimensionBuilder_ == null) {
        if (oneOrderByCase_ == 2) {
          return (com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy) oneOrderBy_;
        }
        return com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.getDefaultInstance();
      } else {
        if (oneOrderByCase_ == 2) {
          return dimensionBuilder_.getMessage();
        }
        return com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Sorts results by a dimension's values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy dimension = 2;</code>
     */
    public Builder setDimension(com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy value) {
      if (dimensionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        oneOrderBy_ = value;
        onChanged();
      } else {
        dimensionBuilder_.setMessage(value);
      }
      oneOrderByCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Sorts results by a dimension's values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy dimension = 2;</code>
     */
    public Builder setDimension(
        com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.Builder builderForValue) {
      if (dimensionBuilder_ == null) {
        oneOrderBy_ = builderForValue.build();
        onChanged();
      } else {
        dimensionBuilder_.setMessage(builderForValue.build());
      }
      oneOrderByCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Sorts results by a dimension's values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy dimension = 2;</code>
     */
    public Builder mergeDimension(
        com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy value) {
      if (dimensionBuilder_ == null) {
        if (oneOrderByCase_ == 2
            && oneOrderBy_
                != com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy
                    .getDefaultInstance()) {
          oneOrderBy_ =
              com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.newBuilder(
                      (com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy) oneOrderBy_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          oneOrderBy_ = value;
        }
        onChanged();
      } else {
        if (oneOrderByCase_ == 2) {
          dimensionBuilder_.mergeFrom(value);
        }
        dimensionBuilder_.setMessage(value);
      }
      oneOrderByCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Sorts results by a dimension's values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy dimension = 2;</code>
     */
    public Builder clearDimension() {
      if (dimensionBuilder_ == null) {
        if (oneOrderByCase_ == 2) {
          oneOrderByCase_ = 0;
          oneOrderBy_ = null;
          onChanged();
        }
      } else {
        if (oneOrderByCase_ == 2) {
          oneOrderByCase_ = 0;
          oneOrderBy_ = null;
        }
        dimensionBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Sorts results by a dimension's values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy dimension = 2;</code>
     */
    public com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.Builder
        getDimensionBuilder() {
      return getDimensionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Sorts results by a dimension's values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy dimension = 2;</code>
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.OrderBy.DimensionOrderByOrBuilder
        getDimensionOrBuilder() {
      if ((oneOrderByCase_ == 2) && (dimensionBuilder_ != null)) {
        return dimensionBuilder_.getMessageOrBuilder();
      } else {
        if (oneOrderByCase_ == 2) {
          return (com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy) oneOrderBy_;
        }
        return com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Sorts results by a dimension's values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy dimension = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy,
            com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.Builder,
            com.google.analytics.data.v1alpha.OrderBy.DimensionOrderByOrBuilder>
        getDimensionFieldBuilder() {
      if (dimensionBuilder_ == null) {
        if (!(oneOrderByCase_ == 2)) {
          oneOrderBy_ =
              com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.getDefaultInstance();
        }
        dimensionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy,
                com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy.Builder,
                com.google.analytics.data.v1alpha.OrderBy.DimensionOrderByOrBuilder>(
                (com.google.analytics.data.v1alpha.OrderBy.DimensionOrderBy) oneOrderBy_,
                getParentForChildren(),
                isClean());
        oneOrderBy_ = null;
      }
      oneOrderByCase_ = 2;
      onChanged();
      ;
      return dimensionBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy,
            com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.Builder,
            com.google.analytics.data.v1alpha.OrderBy.PivotOrderByOrBuilder>
        pivotBuilder_;
    /**
     *
     *
     * <pre>
     * Sorts results by a metric's values within a pivot column group.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.PivotOrderBy pivot = 3;</code>
     *
     * @return Whether the pivot field is set.
     */
    @java.lang.Override
    public boolean hasPivot() {
      return oneOrderByCase_ == 3;
    }
    /**
     *
     *
     * <pre>
     * Sorts results by a metric's values within a pivot column group.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.PivotOrderBy pivot = 3;</code>
     *
     * @return The pivot.
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy getPivot() {
      if (pivotBuilder_ == null) {
        if (oneOrderByCase_ == 3) {
          return (com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy) oneOrderBy_;
        }
        return com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.getDefaultInstance();
      } else {
        if (oneOrderByCase_ == 3) {
          return pivotBuilder_.getMessage();
        }
        return com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Sorts results by a metric's values within a pivot column group.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.PivotOrderBy pivot = 3;</code>
     */
    public Builder setPivot(com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy value) {
      if (pivotBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        oneOrderBy_ = value;
        onChanged();
      } else {
        pivotBuilder_.setMessage(value);
      }
      oneOrderByCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Sorts results by a metric's values within a pivot column group.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.PivotOrderBy pivot = 3;</code>
     */
    public Builder setPivot(
        com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.Builder builderForValue) {
      if (pivotBuilder_ == null) {
        oneOrderBy_ = builderForValue.build();
        onChanged();
      } else {
        pivotBuilder_.setMessage(builderForValue.build());
      }
      oneOrderByCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Sorts results by a metric's values within a pivot column group.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.PivotOrderBy pivot = 3;</code>
     */
    public Builder mergePivot(com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy value) {
      if (pivotBuilder_ == null) {
        if (oneOrderByCase_ == 3
            && oneOrderBy_
                != com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.getDefaultInstance()) {
          oneOrderBy_ =
              com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.newBuilder(
                      (com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy) oneOrderBy_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          oneOrderBy_ = value;
        }
        onChanged();
      } else {
        if (oneOrderByCase_ == 3) {
          pivotBuilder_.mergeFrom(value);
        }
        pivotBuilder_.setMessage(value);
      }
      oneOrderByCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Sorts results by a metric's values within a pivot column group.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.PivotOrderBy pivot = 3;</code>
     */
    public Builder clearPivot() {
      if (pivotBuilder_ == null) {
        if (oneOrderByCase_ == 3) {
          oneOrderByCase_ = 0;
          oneOrderBy_ = null;
          onChanged();
        }
      } else {
        if (oneOrderByCase_ == 3) {
          oneOrderByCase_ = 0;
          oneOrderBy_ = null;
        }
        pivotBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Sorts results by a metric's values within a pivot column group.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.PivotOrderBy pivot = 3;</code>
     */
    public com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.Builder getPivotBuilder() {
      return getPivotFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Sorts results by a metric's values within a pivot column group.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.PivotOrderBy pivot = 3;</code>
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.OrderBy.PivotOrderByOrBuilder getPivotOrBuilder() {
      if ((oneOrderByCase_ == 3) && (pivotBuilder_ != null)) {
        return pivotBuilder_.getMessageOrBuilder();
      } else {
        if (oneOrderByCase_ == 3) {
          return (com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy) oneOrderBy_;
        }
        return com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Sorts results by a metric's values within a pivot column group.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.OrderBy.PivotOrderBy pivot = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy,
            com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.Builder,
            com.google.analytics.data.v1alpha.OrderBy.PivotOrderByOrBuilder>
        getPivotFieldBuilder() {
      if (pivotBuilder_ == null) {
        if (!(oneOrderByCase_ == 3)) {
          oneOrderBy_ = com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.getDefaultInstance();
        }
        pivotBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy,
                com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy.Builder,
                com.google.analytics.data.v1alpha.OrderBy.PivotOrderByOrBuilder>(
                (com.google.analytics.data.v1alpha.OrderBy.PivotOrderBy) oneOrderBy_,
                getParentForChildren(),
                isClean());
        oneOrderBy_ = null;
      }
      oneOrderByCase_ = 3;
      onChanged();
      ;
      return pivotBuilder_;
    }

    private boolean desc_;
    /**
     *
     *
     * <pre>
     * If true, sorts by descending order.
     * </pre>
     *
     * <code>bool desc = 4;</code>
     *
     * @return The desc.
     */
    @java.lang.Override
    public boolean getDesc() {
      return desc_;
    }
    /**
     *
     *
     * <pre>
     * If true, sorts by descending order.
     * </pre>
     *
     * <code>bool desc = 4;</code>
     *
     * @param value The desc to set.
     * @return This builder for chaining.
     */
    public Builder setDesc(boolean value) {

      desc_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If true, sorts by descending order.
     * </pre>
     *
     * <code>bool desc = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDesc() {

      desc_ = false;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.OrderBy)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.OrderBy)
  private static final com.google.analytics.data.v1alpha.OrderBy DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.OrderBy();
  }

  public static com.google.analytics.data.v1alpha.OrderBy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrderBy> PARSER =
      new com.google.protobuf.AbstractParser<OrderBy>() {
        @java.lang.Override
        public OrderBy parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new OrderBy(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<OrderBy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrderBy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.OrderBy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
