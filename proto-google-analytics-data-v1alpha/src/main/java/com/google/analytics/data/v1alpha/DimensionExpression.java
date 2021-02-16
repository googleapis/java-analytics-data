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

/**
 *
 *
 * <pre>
 * Used to express a dimension which is the result of a formula of multiple
 * dimensions. Example usages:
 * 1) lower_case(dimension)
 * 2) concatenate(dimension1, symbol, dimension2).
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.DimensionExpression}
 */
public final class DimensionExpression extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.DimensionExpression)
    DimensionExpressionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DimensionExpression.newBuilder() to construct.
  private DimensionExpression(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DimensionExpression() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DimensionExpression();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private DimensionExpression(
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
          case 34:
            {
              com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression.Builder
                  subBuilder = null;
              if (oneExpressionCase_ == 4) {
                subBuilder =
                    ((com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression)
                            oneExpression_)
                        .toBuilder();
              }
              oneExpression_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(
                    (com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression)
                        oneExpression_);
                oneExpression_ = subBuilder.buildPartial();
              }
              oneExpressionCase_ = 4;
              break;
            }
          case 42:
            {
              com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression.Builder
                  subBuilder = null;
              if (oneExpressionCase_ == 5) {
                subBuilder =
                    ((com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression)
                            oneExpression_)
                        .toBuilder();
              }
              oneExpression_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(
                    (com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression)
                        oneExpression_);
                oneExpression_ = subBuilder.buildPartial();
              }
              oneExpressionCase_ = 5;
              break;
            }
          case 50:
            {
              com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression.Builder
                  subBuilder = null;
              if (oneExpressionCase_ == 6) {
                subBuilder =
                    ((com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression)
                            oneExpression_)
                        .toBuilder();
              }
              oneExpression_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
                          .parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(
                    (com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression)
                        oneExpression_);
                oneExpression_ = subBuilder.buildPartial();
              }
              oneExpressionCase_ = 6;
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
        .internal_static_google_analytics_data_v1alpha_DimensionExpression_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_DimensionExpression_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.DimensionExpression.class,
            com.google.analytics.data.v1alpha.DimensionExpression.Builder.class);
  }

  public interface CaseExpressionOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.DimensionExpression.CaseExpression)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Name of a dimension. The name must refer back to a name in dimensions
     * field of the request.
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
     * Name of a dimension. The name must refer back to a name in dimensions
     * field of the request.
     * </pre>
     *
     * <code>string dimension_name = 1;</code>
     *
     * @return The bytes for dimensionName.
     */
    com.google.protobuf.ByteString getDimensionNameBytes();
  }
  /**
   *
   *
   * <pre>
   * Used to convert a dimension value to a single case.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.DimensionExpression.CaseExpression}
   */
  public static final class CaseExpression extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.DimensionExpression.CaseExpression)
      CaseExpressionOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use CaseExpression.newBuilder() to construct.
    private CaseExpression(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private CaseExpression() {
      dimensionName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
      return new CaseExpression();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private CaseExpression(
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
          .internal_static_google_analytics_data_v1alpha_DimensionExpression_CaseExpression_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_DimensionExpression_CaseExpression_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression.class,
              com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression.Builder.class);
    }

    public static final int DIMENSION_NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object dimensionName_;
    /**
     *
     *
     * <pre>
     * Name of a dimension. The name must refer back to a name in dimensions
     * field of the request.
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
     * Name of a dimension. The name must refer back to a name in dimensions
     * field of the request.
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
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression)) {
        return super.equals(obj);
      }
      com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression other =
          (com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression) obj;

      if (!getDimensionName().equals(other.getDimensionName())) return false;
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
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression parseFrom(
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
        com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression prototype) {
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
     * Used to convert a dimension value to a single case.
     * </pre>
     *
     * Protobuf type {@code google.analytics.data.v1alpha.DimensionExpression.CaseExpression}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.DimensionExpression.CaseExpression)
        com.google.analytics.data.v1alpha.DimensionExpression.CaseExpressionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_DimensionExpression_CaseExpression_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_DimensionExpression_CaseExpression_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression.class,
                com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression.Builder.class);
      }

      // Construct using
      // com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression.newBuilder()
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

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_DimensionExpression_CaseExpression_descriptor;
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression
          getDefaultInstanceForType() {
        return com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression
            .getDefaultInstance();
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression build() {
        com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression buildPartial() {
        com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression result =
            new com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression(this);
        result.dimensionName_ = dimensionName_;
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
        if (other instanceof com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression) {
          return mergeFrom(
              (com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression other) {
        if (other
            == com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression
                .getDefaultInstance()) return this;
        if (!other.getDimensionName().isEmpty()) {
          dimensionName_ = other.dimensionName_;
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
        com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression)
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
       * Name of a dimension. The name must refer back to a name in dimensions
       * field of the request.
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
       * Name of a dimension. The name must refer back to a name in dimensions
       * field of the request.
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
       * Name of a dimension. The name must refer back to a name in dimensions
       * field of the request.
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
       * Name of a dimension. The name must refer back to a name in dimensions
       * field of the request.
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
       * Name of a dimension. The name must refer back to a name in dimensions
       * field of the request.
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

      // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.DimensionExpression.CaseExpression)
    }

    // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.DimensionExpression.CaseExpression)
    private static final com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression();
    }

    public static com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CaseExpression> PARSER =
        new com.google.protobuf.AbstractParser<CaseExpression>() {
          @java.lang.Override
          public CaseExpression parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new CaseExpression(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<CaseExpression> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CaseExpression> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ConcatenateExpressionOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Names of dimensions. The names must refer back to names in the dimensions
     * field of the request.
     * </pre>
     *
     * <code>repeated string dimension_names = 1;</code>
     *
     * @return A list containing the dimensionNames.
     */
    java.util.List<java.lang.String> getDimensionNamesList();
    /**
     *
     *
     * <pre>
     * Names of dimensions. The names must refer back to names in the dimensions
     * field of the request.
     * </pre>
     *
     * <code>repeated string dimension_names = 1;</code>
     *
     * @return The count of dimensionNames.
     */
    int getDimensionNamesCount();
    /**
     *
     *
     * <pre>
     * Names of dimensions. The names must refer back to names in the dimensions
     * field of the request.
     * </pre>
     *
     * <code>repeated string dimension_names = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The dimensionNames at the given index.
     */
    java.lang.String getDimensionNames(int index);
    /**
     *
     *
     * <pre>
     * Names of dimensions. The names must refer back to names in the dimensions
     * field of the request.
     * </pre>
     *
     * <code>repeated string dimension_names = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the dimensionNames at the given index.
     */
    com.google.protobuf.ByteString getDimensionNamesBytes(int index);

    /**
     *
     *
     * <pre>
     * The delimiter placed between dimension names.
     * Delimiters are often single characters such as "|" or "," but can be
     * longer strings. If a dimension value contains the delimiter, both will be
     * present in response with no distinction. For example if dimension 1 value
     * = "US,FR", dimension 2 value = "JP", and delimiter = ",", then the
     * response will contain "US,FR,JP".
     * </pre>
     *
     * <code>string delimiter = 2;</code>
     *
     * @return The delimiter.
     */
    java.lang.String getDelimiter();
    /**
     *
     *
     * <pre>
     * The delimiter placed between dimension names.
     * Delimiters are often single characters such as "|" or "," but can be
     * longer strings. If a dimension value contains the delimiter, both will be
     * present in response with no distinction. For example if dimension 1 value
     * = "US,FR", dimension 2 value = "JP", and delimiter = ",", then the
     * response will contain "US,FR,JP".
     * </pre>
     *
     * <code>string delimiter = 2;</code>
     *
     * @return The bytes for delimiter.
     */
    com.google.protobuf.ByteString getDelimiterBytes();
  }
  /**
   *
   *
   * <pre>
   * Used to combine dimension values to a single dimension.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression}
   */
  public static final class ConcatenateExpression extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression)
      ConcatenateExpressionOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ConcatenateExpression.newBuilder() to construct.
    private ConcatenateExpression(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ConcatenateExpression() {
      dimensionNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      delimiter_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
      return new ConcatenateExpression();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ConcatenateExpression(
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
                if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                  dimensionNames_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000001;
                }
                dimensionNames_.add(s);
                break;
              }
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();

                delimiter_ = s;
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
          dimensionNames_ = dimensionNames_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_DimensionExpression_ConcatenateExpression_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_DimensionExpression_ConcatenateExpression_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression.class,
              com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression.Builder
                  .class);
    }

    public static final int DIMENSION_NAMES_FIELD_NUMBER = 1;
    private com.google.protobuf.LazyStringList dimensionNames_;
    /**
     *
     *
     * <pre>
     * Names of dimensions. The names must refer back to names in the dimensions
     * field of the request.
     * </pre>
     *
     * <code>repeated string dimension_names = 1;</code>
     *
     * @return A list containing the dimensionNames.
     */
    public com.google.protobuf.ProtocolStringList getDimensionNamesList() {
      return dimensionNames_;
    }
    /**
     *
     *
     * <pre>
     * Names of dimensions. The names must refer back to names in the dimensions
     * field of the request.
     * </pre>
     *
     * <code>repeated string dimension_names = 1;</code>
     *
     * @return The count of dimensionNames.
     */
    public int getDimensionNamesCount() {
      return dimensionNames_.size();
    }
    /**
     *
     *
     * <pre>
     * Names of dimensions. The names must refer back to names in the dimensions
     * field of the request.
     * </pre>
     *
     * <code>repeated string dimension_names = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The dimensionNames at the given index.
     */
    public java.lang.String getDimensionNames(int index) {
      return dimensionNames_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Names of dimensions. The names must refer back to names in the dimensions
     * field of the request.
     * </pre>
     *
     * <code>repeated string dimension_names = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the dimensionNames at the given index.
     */
    public com.google.protobuf.ByteString getDimensionNamesBytes(int index) {
      return dimensionNames_.getByteString(index);
    }

    public static final int DELIMITER_FIELD_NUMBER = 2;
    private volatile java.lang.Object delimiter_;
    /**
     *
     *
     * <pre>
     * The delimiter placed between dimension names.
     * Delimiters are often single characters such as "|" or "," but can be
     * longer strings. If a dimension value contains the delimiter, both will be
     * present in response with no distinction. For example if dimension 1 value
     * = "US,FR", dimension 2 value = "JP", and delimiter = ",", then the
     * response will contain "US,FR,JP".
     * </pre>
     *
     * <code>string delimiter = 2;</code>
     *
     * @return The delimiter.
     */
    @java.lang.Override
    public java.lang.String getDelimiter() {
      java.lang.Object ref = delimiter_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        delimiter_ = s;
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * The delimiter placed between dimension names.
     * Delimiters are often single characters such as "|" or "," but can be
     * longer strings. If a dimension value contains the delimiter, both will be
     * present in response with no distinction. For example if dimension 1 value
     * = "US,FR", dimension 2 value = "JP", and delimiter = ",", then the
     * response will contain "US,FR,JP".
     * </pre>
     *
     * <code>string delimiter = 2;</code>
     *
     * @return The bytes for delimiter.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getDelimiterBytes() {
      java.lang.Object ref = delimiter_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        delimiter_ = b;
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
      for (int i = 0; i < dimensionNames_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dimensionNames_.getRaw(i));
      }
      if (!getDelimiterBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, delimiter_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < dimensionNames_.size(); i++) {
          dataSize += computeStringSizeNoTag(dimensionNames_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getDimensionNamesList().size();
      }
      if (!getDelimiterBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, delimiter_);
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
          instanceof com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression)) {
        return super.equals(obj);
      }
      com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression other =
          (com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression) obj;

      if (!getDimensionNamesList().equals(other.getDimensionNamesList())) return false;
      if (!getDelimiter().equals(other.getDelimiter())) return false;
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
      if (getDimensionNamesCount() > 0) {
        hash = (37 * hash) + DIMENSION_NAMES_FIELD_NUMBER;
        hash = (53 * hash) + getDimensionNamesList().hashCode();
      }
      hash = (37 * hash) + DELIMITER_FIELD_NUMBER;
      hash = (53 * hash) + getDelimiter().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
        parseFrom(
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
        com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression prototype) {
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
     * Used to combine dimension values to a single dimension.
     * </pre>
     *
     * Protobuf type {@code google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression)
        com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpressionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_DimensionExpression_ConcatenateExpression_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_DimensionExpression_ConcatenateExpression_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression.class,
                com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression.Builder
                    .class);
      }

      // Construct using
      // com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression.newBuilder()
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
        dimensionNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        delimiter_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_DimensionExpression_ConcatenateExpression_descriptor;
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
          getDefaultInstanceForType() {
        return com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
            .getDefaultInstance();
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression build() {
        com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
          buildPartial() {
        com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression result =
            new com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          dimensionNames_ = dimensionNames_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dimensionNames_ = dimensionNames_;
        result.delimiter_ = delimiter_;
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
            instanceof
            com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression) {
          return mergeFrom(
              (com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression other) {
        if (other
            == com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
                .getDefaultInstance()) return this;
        if (!other.dimensionNames_.isEmpty()) {
          if (dimensionNames_.isEmpty()) {
            dimensionNames_ = other.dimensionNames_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDimensionNamesIsMutable();
            dimensionNames_.addAll(other.dimensionNames_);
          }
          onChanged();
        }
        if (!other.getDelimiter().isEmpty()) {
          delimiter_ = other.delimiter_;
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
        com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression parsedMessage =
            null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression)
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

      private com.google.protobuf.LazyStringList dimensionNames_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureDimensionNamesIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          dimensionNames_ = new com.google.protobuf.LazyStringArrayList(dimensionNames_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       *
       *
       * <pre>
       * Names of dimensions. The names must refer back to names in the dimensions
       * field of the request.
       * </pre>
       *
       * <code>repeated string dimension_names = 1;</code>
       *
       * @return A list containing the dimensionNames.
       */
      public com.google.protobuf.ProtocolStringList getDimensionNamesList() {
        return dimensionNames_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * Names of dimensions. The names must refer back to names in the dimensions
       * field of the request.
       * </pre>
       *
       * <code>repeated string dimension_names = 1;</code>
       *
       * @return The count of dimensionNames.
       */
      public int getDimensionNamesCount() {
        return dimensionNames_.size();
      }
      /**
       *
       *
       * <pre>
       * Names of dimensions. The names must refer back to names in the dimensions
       * field of the request.
       * </pre>
       *
       * <code>repeated string dimension_names = 1;</code>
       *
       * @param index The index of the element to return.
       * @return The dimensionNames at the given index.
       */
      public java.lang.String getDimensionNames(int index) {
        return dimensionNames_.get(index);
      }
      /**
       *
       *
       * <pre>
       * Names of dimensions. The names must refer back to names in the dimensions
       * field of the request.
       * </pre>
       *
       * <code>repeated string dimension_names = 1;</code>
       *
       * @param index The index of the value to return.
       * @return The bytes of the dimensionNames at the given index.
       */
      public com.google.protobuf.ByteString getDimensionNamesBytes(int index) {
        return dimensionNames_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * Names of dimensions. The names must refer back to names in the dimensions
       * field of the request.
       * </pre>
       *
       * <code>repeated string dimension_names = 1;</code>
       *
       * @param index The index to set the value at.
       * @param value The dimensionNames to set.
       * @return This builder for chaining.
       */
      public Builder setDimensionNames(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDimensionNamesIsMutable();
        dimensionNames_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Names of dimensions. The names must refer back to names in the dimensions
       * field of the request.
       * </pre>
       *
       * <code>repeated string dimension_names = 1;</code>
       *
       * @param value The dimensionNames to add.
       * @return This builder for chaining.
       */
      public Builder addDimensionNames(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDimensionNamesIsMutable();
        dimensionNames_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Names of dimensions. The names must refer back to names in the dimensions
       * field of the request.
       * </pre>
       *
       * <code>repeated string dimension_names = 1;</code>
       *
       * @param values The dimensionNames to add.
       * @return This builder for chaining.
       */
      public Builder addAllDimensionNames(java.lang.Iterable<java.lang.String> values) {
        ensureDimensionNamesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, dimensionNames_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Names of dimensions. The names must refer back to names in the dimensions
       * field of the request.
       * </pre>
       *
       * <code>repeated string dimension_names = 1;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearDimensionNames() {
        dimensionNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Names of dimensions. The names must refer back to names in the dimensions
       * field of the request.
       * </pre>
       *
       * <code>repeated string dimension_names = 1;</code>
       *
       * @param value The bytes of the dimensionNames to add.
       * @return This builder for chaining.
       */
      public Builder addDimensionNamesBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        checkByteStringIsUtf8(value);
        ensureDimensionNamesIsMutable();
        dimensionNames_.add(value);
        onChanged();
        return this;
      }

      private java.lang.Object delimiter_ = "";
      /**
       *
       *
       * <pre>
       * The delimiter placed between dimension names.
       * Delimiters are often single characters such as "|" or "," but can be
       * longer strings. If a dimension value contains the delimiter, both will be
       * present in response with no distinction. For example if dimension 1 value
       * = "US,FR", dimension 2 value = "JP", and delimiter = ",", then the
       * response will contain "US,FR,JP".
       * </pre>
       *
       * <code>string delimiter = 2;</code>
       *
       * @return The delimiter.
       */
      public java.lang.String getDelimiter() {
        java.lang.Object ref = delimiter_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          delimiter_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * The delimiter placed between dimension names.
       * Delimiters are often single characters such as "|" or "," but can be
       * longer strings. If a dimension value contains the delimiter, both will be
       * present in response with no distinction. For example if dimension 1 value
       * = "US,FR", dimension 2 value = "JP", and delimiter = ",", then the
       * response will contain "US,FR,JP".
       * </pre>
       *
       * <code>string delimiter = 2;</code>
       *
       * @return The bytes for delimiter.
       */
      public com.google.protobuf.ByteString getDelimiterBytes() {
        java.lang.Object ref = delimiter_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          delimiter_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * The delimiter placed between dimension names.
       * Delimiters are often single characters such as "|" or "," but can be
       * longer strings. If a dimension value contains the delimiter, both will be
       * present in response with no distinction. For example if dimension 1 value
       * = "US,FR", dimension 2 value = "JP", and delimiter = ",", then the
       * response will contain "US,FR,JP".
       * </pre>
       *
       * <code>string delimiter = 2;</code>
       *
       * @param value The delimiter to set.
       * @return This builder for chaining.
       */
      public Builder setDelimiter(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }

        delimiter_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The delimiter placed between dimension names.
       * Delimiters are often single characters such as "|" or "," but can be
       * longer strings. If a dimension value contains the delimiter, both will be
       * present in response with no distinction. For example if dimension 1 value
       * = "US,FR", dimension 2 value = "JP", and delimiter = ",", then the
       * response will contain "US,FR,JP".
       * </pre>
       *
       * <code>string delimiter = 2;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearDelimiter() {

        delimiter_ = getDefaultInstance().getDelimiter();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The delimiter placed between dimension names.
       * Delimiters are often single characters such as "|" or "," but can be
       * longer strings. If a dimension value contains the delimiter, both will be
       * present in response with no distinction. For example if dimension 1 value
       * = "US,FR", dimension 2 value = "JP", and delimiter = ",", then the
       * response will contain "US,FR,JP".
       * </pre>
       *
       * <code>string delimiter = 2;</code>
       *
       * @param value The bytes for delimiter to set.
       * @return This builder for chaining.
       */
      public Builder setDelimiterBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        checkByteStringIsUtf8(value);

        delimiter_ = value;
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

      // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression)
    }

    // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression)
    private static final com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression();
    }

    public static com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ConcatenateExpression> PARSER =
        new com.google.protobuf.AbstractParser<ConcatenateExpression>() {
          @java.lang.Override
          public ConcatenateExpression parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ConcatenateExpression(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ConcatenateExpression> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ConcatenateExpression> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private int oneExpressionCase_ = 0;
  private java.lang.Object oneExpression_;

  public enum OneExpressionCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    LOWER_CASE(4),
    UPPER_CASE(5),
    CONCATENATE(6),
    ONEEXPRESSION_NOT_SET(0);
    private final int value;

    private OneExpressionCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OneExpressionCase valueOf(int value) {
      return forNumber(value);
    }

    public static OneExpressionCase forNumber(int value) {
      switch (value) {
        case 4:
          return LOWER_CASE;
        case 5:
          return UPPER_CASE;
        case 6:
          return CONCATENATE;
        case 0:
          return ONEEXPRESSION_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public OneExpressionCase getOneExpressionCase() {
    return OneExpressionCase.forNumber(oneExpressionCase_);
  }

  public static final int LOWER_CASE_FIELD_NUMBER = 4;
  /**
   *
   *
   * <pre>
   * Used to convert a dimension value to lower case.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.DimensionExpression.CaseExpression lower_case = 4;</code>
   *
   * @return Whether the lowerCase field is set.
   */
  @java.lang.Override
  public boolean hasLowerCase() {
    return oneExpressionCase_ == 4;
  }
  /**
   *
   *
   * <pre>
   * Used to convert a dimension value to lower case.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.DimensionExpression.CaseExpression lower_case = 4;</code>
   *
   * @return The lowerCase.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression getLowerCase() {
    if (oneExpressionCase_ == 4) {
      return (com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression) oneExpression_;
    }
    return com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression
        .getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Used to convert a dimension value to lower case.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.DimensionExpression.CaseExpression lower_case = 4;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.DimensionExpression.CaseExpressionOrBuilder
      getLowerCaseOrBuilder() {
    if (oneExpressionCase_ == 4) {
      return (com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression) oneExpression_;
    }
    return com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression
        .getDefaultInstance();
  }

  public static final int UPPER_CASE_FIELD_NUMBER = 5;
  /**
   *
   *
   * <pre>
   * Used to convert a dimension value to upper case.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.DimensionExpression.CaseExpression upper_case = 5;</code>
   *
   * @return Whether the upperCase field is set.
   */
  @java.lang.Override
  public boolean hasUpperCase() {
    return oneExpressionCase_ == 5;
  }
  /**
   *
   *
   * <pre>
   * Used to convert a dimension value to upper case.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.DimensionExpression.CaseExpression upper_case = 5;</code>
   *
   * @return The upperCase.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression getUpperCase() {
    if (oneExpressionCase_ == 5) {
      return (com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression) oneExpression_;
    }
    return com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression
        .getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Used to convert a dimension value to upper case.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.DimensionExpression.CaseExpression upper_case = 5;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.DimensionExpression.CaseExpressionOrBuilder
      getUpperCaseOrBuilder() {
    if (oneExpressionCase_ == 5) {
      return (com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression) oneExpression_;
    }
    return com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression
        .getDefaultInstance();
  }

  public static final int CONCATENATE_FIELD_NUMBER = 6;
  /**
   *
   *
   * <pre>
   * Used to combine dimension values to a single dimension.
   * For example, dimension "country, city": concatenate(country, ", ", city).
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression concatenate = 6;
   * </code>
   *
   * @return Whether the concatenate field is set.
   */
  @java.lang.Override
  public boolean hasConcatenate() {
    return oneExpressionCase_ == 6;
  }
  /**
   *
   *
   * <pre>
   * Used to combine dimension values to a single dimension.
   * For example, dimension "country, city": concatenate(country, ", ", city).
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression concatenate = 6;
   * </code>
   *
   * @return The concatenate.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
      getConcatenate() {
    if (oneExpressionCase_ == 6) {
      return (com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression)
          oneExpression_;
    }
    return com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
        .getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Used to combine dimension values to a single dimension.
   * For example, dimension "country, city": concatenate(country, ", ", city).
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression concatenate = 6;
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpressionOrBuilder
      getConcatenateOrBuilder() {
    if (oneExpressionCase_ == 6) {
      return (com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression)
          oneExpression_;
    }
    return com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
        .getDefaultInstance();
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
    if (oneExpressionCase_ == 4) {
      output.writeMessage(
          4, (com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression) oneExpression_);
    }
    if (oneExpressionCase_ == 5) {
      output.writeMessage(
          5, (com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression) oneExpression_);
    }
    if (oneExpressionCase_ == 6) {
      output.writeMessage(
          6,
          (com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression)
              oneExpression_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (oneExpressionCase_ == 4) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              4,
              (com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression)
                  oneExpression_);
    }
    if (oneExpressionCase_ == 5) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              5,
              (com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression)
                  oneExpression_);
    }
    if (oneExpressionCase_ == 6) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              6,
              (com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression)
                  oneExpression_);
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.DimensionExpression)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.DimensionExpression other =
        (com.google.analytics.data.v1alpha.DimensionExpression) obj;

    if (!getOneExpressionCase().equals(other.getOneExpressionCase())) return false;
    switch (oneExpressionCase_) {
      case 4:
        if (!getLowerCase().equals(other.getLowerCase())) return false;
        break;
      case 5:
        if (!getUpperCase().equals(other.getUpperCase())) return false;
        break;
      case 6:
        if (!getConcatenate().equals(other.getConcatenate())) return false;
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
    switch (oneExpressionCase_) {
      case 4:
        hash = (37 * hash) + LOWER_CASE_FIELD_NUMBER;
        hash = (53 * hash) + getLowerCase().hashCode();
        break;
      case 5:
        hash = (37 * hash) + UPPER_CASE_FIELD_NUMBER;
        hash = (53 * hash) + getUpperCase().hashCode();
        break;
      case 6:
        hash = (37 * hash) + CONCATENATE_FIELD_NUMBER;
        hash = (53 * hash) + getConcatenate().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.DimensionExpression parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.DimensionExpression parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.DimensionExpression parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.DimensionExpression parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.DimensionExpression parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.DimensionExpression parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.DimensionExpression parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.DimensionExpression parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.DimensionExpression parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.DimensionExpression parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.DimensionExpression parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.DimensionExpression parseFrom(
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
      com.google.analytics.data.v1alpha.DimensionExpression prototype) {
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
   * Used to express a dimension which is the result of a formula of multiple
   * dimensions. Example usages:
   * 1) lower_case(dimension)
   * 2) concatenate(dimension1, symbol, dimension2).
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.DimensionExpression}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.DimensionExpression)
      com.google.analytics.data.v1alpha.DimensionExpressionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_DimensionExpression_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_DimensionExpression_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.DimensionExpression.class,
              com.google.analytics.data.v1alpha.DimensionExpression.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.DimensionExpression.newBuilder()
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
      oneExpressionCase_ = 0;
      oneExpression_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_DimensionExpression_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.DimensionExpression getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.DimensionExpression.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.DimensionExpression build() {
      com.google.analytics.data.v1alpha.DimensionExpression result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.DimensionExpression buildPartial() {
      com.google.analytics.data.v1alpha.DimensionExpression result =
          new com.google.analytics.data.v1alpha.DimensionExpression(this);
      if (oneExpressionCase_ == 4) {
        if (lowerCaseBuilder_ == null) {
          result.oneExpression_ = oneExpression_;
        } else {
          result.oneExpression_ = lowerCaseBuilder_.build();
        }
      }
      if (oneExpressionCase_ == 5) {
        if (upperCaseBuilder_ == null) {
          result.oneExpression_ = oneExpression_;
        } else {
          result.oneExpression_ = upperCaseBuilder_.build();
        }
      }
      if (oneExpressionCase_ == 6) {
        if (concatenateBuilder_ == null) {
          result.oneExpression_ = oneExpression_;
        } else {
          result.oneExpression_ = concatenateBuilder_.build();
        }
      }
      result.oneExpressionCase_ = oneExpressionCase_;
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
      if (other instanceof com.google.analytics.data.v1alpha.DimensionExpression) {
        return mergeFrom((com.google.analytics.data.v1alpha.DimensionExpression) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.DimensionExpression other) {
      if (other == com.google.analytics.data.v1alpha.DimensionExpression.getDefaultInstance())
        return this;
      switch (other.getOneExpressionCase()) {
        case LOWER_CASE:
          {
            mergeLowerCase(other.getLowerCase());
            break;
          }
        case UPPER_CASE:
          {
            mergeUpperCase(other.getUpperCase());
            break;
          }
        case CONCATENATE:
          {
            mergeConcatenate(other.getConcatenate());
            break;
          }
        case ONEEXPRESSION_NOT_SET:
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
      com.google.analytics.data.v1alpha.DimensionExpression parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.data.v1alpha.DimensionExpression) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int oneExpressionCase_ = 0;
    private java.lang.Object oneExpression_;

    public OneExpressionCase getOneExpressionCase() {
      return OneExpressionCase.forNumber(oneExpressionCase_);
    }

    public Builder clearOneExpression() {
      oneExpressionCase_ = 0;
      oneExpression_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression,
            com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression.Builder,
            com.google.analytics.data.v1alpha.DimensionExpression.CaseExpressionOrBuilder>
        lowerCaseBuilder_;
    /**
     *
     *
     * <pre>
     * Used to convert a dimension value to lower case.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DimensionExpression.CaseExpression lower_case = 4;
     * </code>
     *
     * @return Whether the lowerCase field is set.
     */
    @java.lang.Override
    public boolean hasLowerCase() {
      return oneExpressionCase_ == 4;
    }
    /**
     *
     *
     * <pre>
     * Used to convert a dimension value to lower case.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DimensionExpression.CaseExpression lower_case = 4;
     * </code>
     *
     * @return The lowerCase.
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression getLowerCase() {
      if (lowerCaseBuilder_ == null) {
        if (oneExpressionCase_ == 4) {
          return (com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression)
              oneExpression_;
        }
        return com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression
            .getDefaultInstance();
      } else {
        if (oneExpressionCase_ == 4) {
          return lowerCaseBuilder_.getMessage();
        }
        return com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression
            .getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Used to convert a dimension value to lower case.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DimensionExpression.CaseExpression lower_case = 4;
     * </code>
     */
    public Builder setLowerCase(
        com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression value) {
      if (lowerCaseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        oneExpression_ = value;
        onChanged();
      } else {
        lowerCaseBuilder_.setMessage(value);
      }
      oneExpressionCase_ = 4;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Used to convert a dimension value to lower case.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DimensionExpression.CaseExpression lower_case = 4;
     * </code>
     */
    public Builder setLowerCase(
        com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression.Builder
            builderForValue) {
      if (lowerCaseBuilder_ == null) {
        oneExpression_ = builderForValue.build();
        onChanged();
      } else {
        lowerCaseBuilder_.setMessage(builderForValue.build());
      }
      oneExpressionCase_ = 4;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Used to convert a dimension value to lower case.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DimensionExpression.CaseExpression lower_case = 4;
     * </code>
     */
    public Builder mergeLowerCase(
        com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression value) {
      if (lowerCaseBuilder_ == null) {
        if (oneExpressionCase_ == 4
            && oneExpression_
                != com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression
                    .getDefaultInstance()) {
          oneExpression_ =
              com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression.newBuilder(
                      (com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression)
                          oneExpression_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          oneExpression_ = value;
        }
        onChanged();
      } else {
        if (oneExpressionCase_ == 4) {
          lowerCaseBuilder_.mergeFrom(value);
        }
        lowerCaseBuilder_.setMessage(value);
      }
      oneExpressionCase_ = 4;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Used to convert a dimension value to lower case.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DimensionExpression.CaseExpression lower_case = 4;
     * </code>
     */
    public Builder clearLowerCase() {
      if (lowerCaseBuilder_ == null) {
        if (oneExpressionCase_ == 4) {
          oneExpressionCase_ = 0;
          oneExpression_ = null;
          onChanged();
        }
      } else {
        if (oneExpressionCase_ == 4) {
          oneExpressionCase_ = 0;
          oneExpression_ = null;
        }
        lowerCaseBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Used to convert a dimension value to lower case.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DimensionExpression.CaseExpression lower_case = 4;
     * </code>
     */
    public com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression.Builder
        getLowerCaseBuilder() {
      return getLowerCaseFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Used to convert a dimension value to lower case.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DimensionExpression.CaseExpression lower_case = 4;
     * </code>
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.DimensionExpression.CaseExpressionOrBuilder
        getLowerCaseOrBuilder() {
      if ((oneExpressionCase_ == 4) && (lowerCaseBuilder_ != null)) {
        return lowerCaseBuilder_.getMessageOrBuilder();
      } else {
        if (oneExpressionCase_ == 4) {
          return (com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression)
              oneExpression_;
        }
        return com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression
            .getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Used to convert a dimension value to lower case.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DimensionExpression.CaseExpression lower_case = 4;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression,
            com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression.Builder,
            com.google.analytics.data.v1alpha.DimensionExpression.CaseExpressionOrBuilder>
        getLowerCaseFieldBuilder() {
      if (lowerCaseBuilder_ == null) {
        if (!(oneExpressionCase_ == 4)) {
          oneExpression_ =
              com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression
                  .getDefaultInstance();
        }
        lowerCaseBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression,
                com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression.Builder,
                com.google.analytics.data.v1alpha.DimensionExpression.CaseExpressionOrBuilder>(
                (com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression)
                    oneExpression_,
                getParentForChildren(),
                isClean());
        oneExpression_ = null;
      }
      oneExpressionCase_ = 4;
      onChanged();
      ;
      return lowerCaseBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression,
            com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression.Builder,
            com.google.analytics.data.v1alpha.DimensionExpression.CaseExpressionOrBuilder>
        upperCaseBuilder_;
    /**
     *
     *
     * <pre>
     * Used to convert a dimension value to upper case.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DimensionExpression.CaseExpression upper_case = 5;
     * </code>
     *
     * @return Whether the upperCase field is set.
     */
    @java.lang.Override
    public boolean hasUpperCase() {
      return oneExpressionCase_ == 5;
    }
    /**
     *
     *
     * <pre>
     * Used to convert a dimension value to upper case.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DimensionExpression.CaseExpression upper_case = 5;
     * </code>
     *
     * @return The upperCase.
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression getUpperCase() {
      if (upperCaseBuilder_ == null) {
        if (oneExpressionCase_ == 5) {
          return (com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression)
              oneExpression_;
        }
        return com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression
            .getDefaultInstance();
      } else {
        if (oneExpressionCase_ == 5) {
          return upperCaseBuilder_.getMessage();
        }
        return com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression
            .getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Used to convert a dimension value to upper case.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DimensionExpression.CaseExpression upper_case = 5;
     * </code>
     */
    public Builder setUpperCase(
        com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression value) {
      if (upperCaseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        oneExpression_ = value;
        onChanged();
      } else {
        upperCaseBuilder_.setMessage(value);
      }
      oneExpressionCase_ = 5;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Used to convert a dimension value to upper case.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DimensionExpression.CaseExpression upper_case = 5;
     * </code>
     */
    public Builder setUpperCase(
        com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression.Builder
            builderForValue) {
      if (upperCaseBuilder_ == null) {
        oneExpression_ = builderForValue.build();
        onChanged();
      } else {
        upperCaseBuilder_.setMessage(builderForValue.build());
      }
      oneExpressionCase_ = 5;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Used to convert a dimension value to upper case.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DimensionExpression.CaseExpression upper_case = 5;
     * </code>
     */
    public Builder mergeUpperCase(
        com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression value) {
      if (upperCaseBuilder_ == null) {
        if (oneExpressionCase_ == 5
            && oneExpression_
                != com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression
                    .getDefaultInstance()) {
          oneExpression_ =
              com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression.newBuilder(
                      (com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression)
                          oneExpression_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          oneExpression_ = value;
        }
        onChanged();
      } else {
        if (oneExpressionCase_ == 5) {
          upperCaseBuilder_.mergeFrom(value);
        }
        upperCaseBuilder_.setMessage(value);
      }
      oneExpressionCase_ = 5;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Used to convert a dimension value to upper case.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DimensionExpression.CaseExpression upper_case = 5;
     * </code>
     */
    public Builder clearUpperCase() {
      if (upperCaseBuilder_ == null) {
        if (oneExpressionCase_ == 5) {
          oneExpressionCase_ = 0;
          oneExpression_ = null;
          onChanged();
        }
      } else {
        if (oneExpressionCase_ == 5) {
          oneExpressionCase_ = 0;
          oneExpression_ = null;
        }
        upperCaseBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Used to convert a dimension value to upper case.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DimensionExpression.CaseExpression upper_case = 5;
     * </code>
     */
    public com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression.Builder
        getUpperCaseBuilder() {
      return getUpperCaseFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Used to convert a dimension value to upper case.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DimensionExpression.CaseExpression upper_case = 5;
     * </code>
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.DimensionExpression.CaseExpressionOrBuilder
        getUpperCaseOrBuilder() {
      if ((oneExpressionCase_ == 5) && (upperCaseBuilder_ != null)) {
        return upperCaseBuilder_.getMessageOrBuilder();
      } else {
        if (oneExpressionCase_ == 5) {
          return (com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression)
              oneExpression_;
        }
        return com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression
            .getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Used to convert a dimension value to upper case.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DimensionExpression.CaseExpression upper_case = 5;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression,
            com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression.Builder,
            com.google.analytics.data.v1alpha.DimensionExpression.CaseExpressionOrBuilder>
        getUpperCaseFieldBuilder() {
      if (upperCaseBuilder_ == null) {
        if (!(oneExpressionCase_ == 5)) {
          oneExpression_ =
              com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression
                  .getDefaultInstance();
        }
        upperCaseBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression,
                com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression.Builder,
                com.google.analytics.data.v1alpha.DimensionExpression.CaseExpressionOrBuilder>(
                (com.google.analytics.data.v1alpha.DimensionExpression.CaseExpression)
                    oneExpression_,
                getParentForChildren(),
                isClean());
        oneExpression_ = null;
      }
      oneExpressionCase_ = 5;
      onChanged();
      ;
      return upperCaseBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression,
            com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression.Builder,
            com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpressionOrBuilder>
        concatenateBuilder_;
    /**
     *
     *
     * <pre>
     * Used to combine dimension values to a single dimension.
     * For example, dimension "country, city": concatenate(country, ", ", city).
     * </pre>
     *
     * <code>
     * .google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression concatenate = 6;
     * </code>
     *
     * @return Whether the concatenate field is set.
     */
    @java.lang.Override
    public boolean hasConcatenate() {
      return oneExpressionCase_ == 6;
    }
    /**
     *
     *
     * <pre>
     * Used to combine dimension values to a single dimension.
     * For example, dimension "country, city": concatenate(country, ", ", city).
     * </pre>
     *
     * <code>
     * .google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression concatenate = 6;
     * </code>
     *
     * @return The concatenate.
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
        getConcatenate() {
      if (concatenateBuilder_ == null) {
        if (oneExpressionCase_ == 6) {
          return (com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression)
              oneExpression_;
        }
        return com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
            .getDefaultInstance();
      } else {
        if (oneExpressionCase_ == 6) {
          return concatenateBuilder_.getMessage();
        }
        return com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
            .getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Used to combine dimension values to a single dimension.
     * For example, dimension "country, city": concatenate(country, ", ", city).
     * </pre>
     *
     * <code>
     * .google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression concatenate = 6;
     * </code>
     */
    public Builder setConcatenate(
        com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression value) {
      if (concatenateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        oneExpression_ = value;
        onChanged();
      } else {
        concatenateBuilder_.setMessage(value);
      }
      oneExpressionCase_ = 6;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Used to combine dimension values to a single dimension.
     * For example, dimension "country, city": concatenate(country, ", ", city).
     * </pre>
     *
     * <code>
     * .google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression concatenate = 6;
     * </code>
     */
    public Builder setConcatenate(
        com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression.Builder
            builderForValue) {
      if (concatenateBuilder_ == null) {
        oneExpression_ = builderForValue.build();
        onChanged();
      } else {
        concatenateBuilder_.setMessage(builderForValue.build());
      }
      oneExpressionCase_ = 6;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Used to combine dimension values to a single dimension.
     * For example, dimension "country, city": concatenate(country, ", ", city).
     * </pre>
     *
     * <code>
     * .google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression concatenate = 6;
     * </code>
     */
    public Builder mergeConcatenate(
        com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression value) {
      if (concatenateBuilder_ == null) {
        if (oneExpressionCase_ == 6
            && oneExpression_
                != com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
                    .getDefaultInstance()) {
          oneExpression_ =
              com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
                  .newBuilder(
                      (com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression)
                          oneExpression_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          oneExpression_ = value;
        }
        onChanged();
      } else {
        if (oneExpressionCase_ == 6) {
          concatenateBuilder_.mergeFrom(value);
        }
        concatenateBuilder_.setMessage(value);
      }
      oneExpressionCase_ = 6;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Used to combine dimension values to a single dimension.
     * For example, dimension "country, city": concatenate(country, ", ", city).
     * </pre>
     *
     * <code>
     * .google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression concatenate = 6;
     * </code>
     */
    public Builder clearConcatenate() {
      if (concatenateBuilder_ == null) {
        if (oneExpressionCase_ == 6) {
          oneExpressionCase_ = 0;
          oneExpression_ = null;
          onChanged();
        }
      } else {
        if (oneExpressionCase_ == 6) {
          oneExpressionCase_ = 0;
          oneExpression_ = null;
        }
        concatenateBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Used to combine dimension values to a single dimension.
     * For example, dimension "country, city": concatenate(country, ", ", city).
     * </pre>
     *
     * <code>
     * .google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression concatenate = 6;
     * </code>
     */
    public com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression.Builder
        getConcatenateBuilder() {
      return getConcatenateFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Used to combine dimension values to a single dimension.
     * For example, dimension "country, city": concatenate(country, ", ", city).
     * </pre>
     *
     * <code>
     * .google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression concatenate = 6;
     * </code>
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpressionOrBuilder
        getConcatenateOrBuilder() {
      if ((oneExpressionCase_ == 6) && (concatenateBuilder_ != null)) {
        return concatenateBuilder_.getMessageOrBuilder();
      } else {
        if (oneExpressionCase_ == 6) {
          return (com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression)
              oneExpression_;
        }
        return com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
            .getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Used to combine dimension values to a single dimension.
     * For example, dimension "country, city": concatenate(country, ", ", city).
     * </pre>
     *
     * <code>
     * .google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression concatenate = 6;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression,
            com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression.Builder,
            com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpressionOrBuilder>
        getConcatenateFieldBuilder() {
      if (concatenateBuilder_ == null) {
        if (!(oneExpressionCase_ == 6)) {
          oneExpression_ =
              com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression
                  .getDefaultInstance();
        }
        concatenateBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression,
                com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression.Builder,
                com.google.analytics.data.v1alpha.DimensionExpression
                    .ConcatenateExpressionOrBuilder>(
                (com.google.analytics.data.v1alpha.DimensionExpression.ConcatenateExpression)
                    oneExpression_,
                getParentForChildren(),
                isClean());
        oneExpression_ = null;
      }
      oneExpressionCase_ = 6;
      onChanged();
      ;
      return concatenateBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.DimensionExpression)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.DimensionExpression)
  private static final com.google.analytics.data.v1alpha.DimensionExpression DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.DimensionExpression();
  }

  public static com.google.analytics.data.v1alpha.DimensionExpression getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DimensionExpression> PARSER =
      new com.google.protobuf.AbstractParser<DimensionExpression>() {
        @java.lang.Override
        public DimensionExpression parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new DimensionExpression(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<DimensionExpression> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DimensionExpression> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.DimensionExpression getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
