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
 * Dimensions are attributes of your data. For example, the dimension city
 * indicates the city from which an event originates. Dimension values in report
 * responses are strings; for example, city could be "Paris" or "New York".
 * Requests are allowed up to 8 dimensions.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.Dimension}
 */
public final class Dimension extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.Dimension)
    DimensionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Dimension.newBuilder() to construct.
  private Dimension(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Dimension() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Dimension();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Dimension(
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

              name_ = s;
              break;
            }
          case 18:
            {
              com.google.analytics.data.v1alpha.DimensionExpression.Builder subBuilder = null;
              if (dimensionExpression_ != null) {
                subBuilder = dimensionExpression_.toBuilder();
              }
              dimensionExpression_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.DimensionExpression.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(dimensionExpression_);
                dimensionExpression_ = subBuilder.buildPartial();
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
        .internal_static_google_analytics_data_v1alpha_Dimension_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_Dimension_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.Dimension.class,
            com.google.analytics.data.v1alpha.Dimension.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * The name of the dimension. See the [API
   * Dimensions](https://developers.google.com/analytics/devguides/reporting/data/v1/api-schema#dimensions)
   * for the list of dimension names.
   * If `dimensionExpression` is specified, `name` can be any string that you
   * would like. For example if a `dimensionExpression` concatenates `country`
   * and `city`, you could call that dimension `countryAndCity`.
   * Dimensions are referenced by `name` in `dimensionFilter`, `orderBys`,
   * `dimensionExpression`, and `pivots`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of the dimension. See the [API
   * Dimensions](https://developers.google.com/analytics/devguides/reporting/data/v1/api-schema#dimensions)
   * for the list of dimension names.
   * If `dimensionExpression` is specified, `name` can be any string that you
   * would like. For example if a `dimensionExpression` concatenates `country`
   * and `city`, you could call that dimension `countryAndCity`.
   * Dimensions are referenced by `name` in `dimensionFilter`, `orderBys`,
   * `dimensionExpression`, and `pivots`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DIMENSION_EXPRESSION_FIELD_NUMBER = 2;
  private com.google.analytics.data.v1alpha.DimensionExpression dimensionExpression_;
  /**
   *
   *
   * <pre>
   * One dimension can be the result of an expression of multiple dimensions.
   * For example, dimension "country, city": concatenate(country, ", ", city).
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.DimensionExpression dimension_expression = 2;</code>
   *
   * @return Whether the dimensionExpression field is set.
   */
  @java.lang.Override
  public boolean hasDimensionExpression() {
    return dimensionExpression_ != null;
  }
  /**
   *
   *
   * <pre>
   * One dimension can be the result of an expression of multiple dimensions.
   * For example, dimension "country, city": concatenate(country, ", ", city).
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.DimensionExpression dimension_expression = 2;</code>
   *
   * @return The dimensionExpression.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.DimensionExpression getDimensionExpression() {
    return dimensionExpression_ == null
        ? com.google.analytics.data.v1alpha.DimensionExpression.getDefaultInstance()
        : dimensionExpression_;
  }
  /**
   *
   *
   * <pre>
   * One dimension can be the result of an expression of multiple dimensions.
   * For example, dimension "country, city": concatenate(country, ", ", city).
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.DimensionExpression dimension_expression = 2;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.DimensionExpressionOrBuilder
      getDimensionExpressionOrBuilder() {
    return getDimensionExpression();
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (dimensionExpression_ != null) {
      output.writeMessage(2, getDimensionExpression());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (dimensionExpression_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getDimensionExpression());
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.Dimension)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.Dimension other =
        (com.google.analytics.data.v1alpha.Dimension) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasDimensionExpression() != other.hasDimensionExpression()) return false;
    if (hasDimensionExpression()) {
      if (!getDimensionExpression().equals(other.getDimensionExpression())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasDimensionExpression()) {
      hash = (37 * hash) + DIMENSION_EXPRESSION_FIELD_NUMBER;
      hash = (53 * hash) + getDimensionExpression().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.Dimension parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.Dimension parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Dimension parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.Dimension parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Dimension parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.Dimension parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Dimension parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.Dimension parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Dimension parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.Dimension parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Dimension parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.Dimension parseFrom(
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

  public static Builder newBuilder(com.google.analytics.data.v1alpha.Dimension prototype) {
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
   * Dimensions are attributes of your data. For example, the dimension city
   * indicates the city from which an event originates. Dimension values in report
   * responses are strings; for example, city could be "Paris" or "New York".
   * Requests are allowed up to 8 dimensions.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.Dimension}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.Dimension)
      com.google.analytics.data.v1alpha.DimensionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_Dimension_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_Dimension_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.Dimension.class,
              com.google.analytics.data.v1alpha.Dimension.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.Dimension.newBuilder()
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
      name_ = "";

      if (dimensionExpressionBuilder_ == null) {
        dimensionExpression_ = null;
      } else {
        dimensionExpression_ = null;
        dimensionExpressionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_Dimension_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Dimension getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.Dimension.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Dimension build() {
      com.google.analytics.data.v1alpha.Dimension result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Dimension buildPartial() {
      com.google.analytics.data.v1alpha.Dimension result =
          new com.google.analytics.data.v1alpha.Dimension(this);
      result.name_ = name_;
      if (dimensionExpressionBuilder_ == null) {
        result.dimensionExpression_ = dimensionExpression_;
      } else {
        result.dimensionExpression_ = dimensionExpressionBuilder_.build();
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
      if (other instanceof com.google.analytics.data.v1alpha.Dimension) {
        return mergeFrom((com.google.analytics.data.v1alpha.Dimension) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.Dimension other) {
      if (other == com.google.analytics.data.v1alpha.Dimension.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasDimensionExpression()) {
        mergeDimensionExpression(other.getDimensionExpression());
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
      com.google.analytics.data.v1alpha.Dimension parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.analytics.data.v1alpha.Dimension) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * The name of the dimension. See the [API
     * Dimensions](https://developers.google.com/analytics/devguides/reporting/data/v1/api-schema#dimensions)
     * for the list of dimension names.
     * If `dimensionExpression` is specified, `name` can be any string that you
     * would like. For example if a `dimensionExpression` concatenates `country`
     * and `city`, you could call that dimension `countryAndCity`.
     * Dimensions are referenced by `name` in `dimensionFilter`, `orderBys`,
     * `dimensionExpression`, and `pivots`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the dimension. See the [API
     * Dimensions](https://developers.google.com/analytics/devguides/reporting/data/v1/api-schema#dimensions)
     * for the list of dimension names.
     * If `dimensionExpression` is specified, `name` can be any string that you
     * would like. For example if a `dimensionExpression` concatenates `country`
     * and `city`, you could call that dimension `countryAndCity`.
     * Dimensions are referenced by `name` in `dimensionFilter`, `orderBys`,
     * `dimensionExpression`, and `pivots`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the dimension. See the [API
     * Dimensions](https://developers.google.com/analytics/devguides/reporting/data/v1/api-schema#dimensions)
     * for the list of dimension names.
     * If `dimensionExpression` is specified, `name` can be any string that you
     * would like. For example if a `dimensionExpression` concatenates `country`
     * and `city`, you could call that dimension `countryAndCity`.
     * Dimensions are referenced by `name` in `dimensionFilter`, `orderBys`,
     * `dimensionExpression`, and `pivots`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the dimension. See the [API
     * Dimensions](https://developers.google.com/analytics/devguides/reporting/data/v1/api-schema#dimensions)
     * for the list of dimension names.
     * If `dimensionExpression` is specified, `name` can be any string that you
     * would like. For example if a `dimensionExpression` concatenates `country`
     * and `city`, you could call that dimension `countryAndCity`.
     * Dimensions are referenced by `name` in `dimensionFilter`, `orderBys`,
     * `dimensionExpression`, and `pivots`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the dimension. See the [API
     * Dimensions](https://developers.google.com/analytics/devguides/reporting/data/v1/api-schema#dimensions)
     * for the list of dimension names.
     * If `dimensionExpression` is specified, `name` can be any string that you
     * would like. For example if a `dimensionExpression` concatenates `country`
     * and `city`, you could call that dimension `countryAndCity`.
     * Dimensions are referenced by `name` in `dimensionFilter`, `orderBys`,
     * `dimensionExpression`, and `pivots`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private com.google.analytics.data.v1alpha.DimensionExpression dimensionExpression_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.DimensionExpression,
            com.google.analytics.data.v1alpha.DimensionExpression.Builder,
            com.google.analytics.data.v1alpha.DimensionExpressionOrBuilder>
        dimensionExpressionBuilder_;
    /**
     *
     *
     * <pre>
     * One dimension can be the result of an expression of multiple dimensions.
     * For example, dimension "country, city": concatenate(country, ", ", city).
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DimensionExpression dimension_expression = 2;</code>
     *
     * @return Whether the dimensionExpression field is set.
     */
    public boolean hasDimensionExpression() {
      return dimensionExpressionBuilder_ != null || dimensionExpression_ != null;
    }
    /**
     *
     *
     * <pre>
     * One dimension can be the result of an expression of multiple dimensions.
     * For example, dimension "country, city": concatenate(country, ", ", city).
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DimensionExpression dimension_expression = 2;</code>
     *
     * @return The dimensionExpression.
     */
    public com.google.analytics.data.v1alpha.DimensionExpression getDimensionExpression() {
      if (dimensionExpressionBuilder_ == null) {
        return dimensionExpression_ == null
            ? com.google.analytics.data.v1alpha.DimensionExpression.getDefaultInstance()
            : dimensionExpression_;
      } else {
        return dimensionExpressionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * One dimension can be the result of an expression of multiple dimensions.
     * For example, dimension "country, city": concatenate(country, ", ", city).
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DimensionExpression dimension_expression = 2;</code>
     */
    public Builder setDimensionExpression(
        com.google.analytics.data.v1alpha.DimensionExpression value) {
      if (dimensionExpressionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dimensionExpression_ = value;
        onChanged();
      } else {
        dimensionExpressionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * One dimension can be the result of an expression of multiple dimensions.
     * For example, dimension "country, city": concatenate(country, ", ", city).
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DimensionExpression dimension_expression = 2;</code>
     */
    public Builder setDimensionExpression(
        com.google.analytics.data.v1alpha.DimensionExpression.Builder builderForValue) {
      if (dimensionExpressionBuilder_ == null) {
        dimensionExpression_ = builderForValue.build();
        onChanged();
      } else {
        dimensionExpressionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * One dimension can be the result of an expression of multiple dimensions.
     * For example, dimension "country, city": concatenate(country, ", ", city).
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DimensionExpression dimension_expression = 2;</code>
     */
    public Builder mergeDimensionExpression(
        com.google.analytics.data.v1alpha.DimensionExpression value) {
      if (dimensionExpressionBuilder_ == null) {
        if (dimensionExpression_ != null) {
          dimensionExpression_ =
              com.google.analytics.data.v1alpha.DimensionExpression.newBuilder(dimensionExpression_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          dimensionExpression_ = value;
        }
        onChanged();
      } else {
        dimensionExpressionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * One dimension can be the result of an expression of multiple dimensions.
     * For example, dimension "country, city": concatenate(country, ", ", city).
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DimensionExpression dimension_expression = 2;</code>
     */
    public Builder clearDimensionExpression() {
      if (dimensionExpressionBuilder_ == null) {
        dimensionExpression_ = null;
        onChanged();
      } else {
        dimensionExpression_ = null;
        dimensionExpressionBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * One dimension can be the result of an expression of multiple dimensions.
     * For example, dimension "country, city": concatenate(country, ", ", city).
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DimensionExpression dimension_expression = 2;</code>
     */
    public com.google.analytics.data.v1alpha.DimensionExpression.Builder
        getDimensionExpressionBuilder() {

      onChanged();
      return getDimensionExpressionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * One dimension can be the result of an expression of multiple dimensions.
     * For example, dimension "country, city": concatenate(country, ", ", city).
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DimensionExpression dimension_expression = 2;</code>
     */
    public com.google.analytics.data.v1alpha.DimensionExpressionOrBuilder
        getDimensionExpressionOrBuilder() {
      if (dimensionExpressionBuilder_ != null) {
        return dimensionExpressionBuilder_.getMessageOrBuilder();
      } else {
        return dimensionExpression_ == null
            ? com.google.analytics.data.v1alpha.DimensionExpression.getDefaultInstance()
            : dimensionExpression_;
      }
    }
    /**
     *
     *
     * <pre>
     * One dimension can be the result of an expression of multiple dimensions.
     * For example, dimension "country, city": concatenate(country, ", ", city).
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DimensionExpression dimension_expression = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.DimensionExpression,
            com.google.analytics.data.v1alpha.DimensionExpression.Builder,
            com.google.analytics.data.v1alpha.DimensionExpressionOrBuilder>
        getDimensionExpressionFieldBuilder() {
      if (dimensionExpressionBuilder_ == null) {
        dimensionExpressionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.DimensionExpression,
                com.google.analytics.data.v1alpha.DimensionExpression.Builder,
                com.google.analytics.data.v1alpha.DimensionExpressionOrBuilder>(
                getDimensionExpression(), getParentForChildren(), isClean());
        dimensionExpression_ = null;
      }
      return dimensionExpressionBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.Dimension)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.Dimension)
  private static final com.google.analytics.data.v1alpha.Dimension DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.Dimension();
  }

  public static com.google.analytics.data.v1alpha.Dimension getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Dimension> PARSER =
      new com.google.protobuf.AbstractParser<Dimension>() {
        @java.lang.Override
        public Dimension parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Dimension(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Dimension> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Dimension> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.Dimension getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
