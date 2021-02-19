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
 * To express dimension or metric filters.
 * The fields in the same FilterExpression need to be either all dimensions or
 * all metrics.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.FilterExpression}
 */
public final class FilterExpression extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.FilterExpression)
    FilterExpressionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FilterExpression.newBuilder() to construct.
  private FilterExpression(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FilterExpression() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FilterExpression();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private FilterExpression(
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
              com.google.analytics.data.v1alpha.FilterExpressionList.Builder subBuilder = null;
              if (exprCase_ == 1) {
                subBuilder =
                    ((com.google.analytics.data.v1alpha.FilterExpressionList) expr_).toBuilder();
              }
              expr_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.FilterExpressionList.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(
                    (com.google.analytics.data.v1alpha.FilterExpressionList) expr_);
                expr_ = subBuilder.buildPartial();
              }
              exprCase_ = 1;
              break;
            }
          case 18:
            {
              com.google.analytics.data.v1alpha.FilterExpressionList.Builder subBuilder = null;
              if (exprCase_ == 2) {
                subBuilder =
                    ((com.google.analytics.data.v1alpha.FilterExpressionList) expr_).toBuilder();
              }
              expr_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.FilterExpressionList.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(
                    (com.google.analytics.data.v1alpha.FilterExpressionList) expr_);
                expr_ = subBuilder.buildPartial();
              }
              exprCase_ = 2;
              break;
            }
          case 26:
            {
              com.google.analytics.data.v1alpha.FilterExpression.Builder subBuilder = null;
              if (exprCase_ == 3) {
                subBuilder =
                    ((com.google.analytics.data.v1alpha.FilterExpression) expr_).toBuilder();
              }
              expr_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.FilterExpression.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.analytics.data.v1alpha.FilterExpression) expr_);
                expr_ = subBuilder.buildPartial();
              }
              exprCase_ = 3;
              break;
            }
          case 34:
            {
              com.google.analytics.data.v1alpha.Filter.Builder subBuilder = null;
              if (exprCase_ == 4) {
                subBuilder = ((com.google.analytics.data.v1alpha.Filter) expr_).toBuilder();
              }
              expr_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.Filter.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.analytics.data.v1alpha.Filter) expr_);
                expr_ = subBuilder.buildPartial();
              }
              exprCase_ = 4;
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
        .internal_static_google_analytics_data_v1alpha_FilterExpression_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_FilterExpression_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.FilterExpression.class,
            com.google.analytics.data.v1alpha.FilterExpression.Builder.class);
  }

  private int exprCase_ = 0;
  private java.lang.Object expr_;

  public enum ExprCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    AND_GROUP(1),
    OR_GROUP(2),
    NOT_EXPRESSION(3),
    FILTER(4),
    EXPR_NOT_SET(0);
    private final int value;

    private ExprCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ExprCase valueOf(int value) {
      return forNumber(value);
    }

    public static ExprCase forNumber(int value) {
      switch (value) {
        case 1:
          return AND_GROUP;
        case 2:
          return OR_GROUP;
        case 3:
          return NOT_EXPRESSION;
        case 4:
          return FILTER;
        case 0:
          return EXPR_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ExprCase getExprCase() {
    return ExprCase.forNumber(exprCase_);
  }

  public static final int AND_GROUP_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * The FilterExpressions in and_group have an AND relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpressionList and_group = 1;</code>
   *
   * @return Whether the andGroup field is set.
   */
  @java.lang.Override
  public boolean hasAndGroup() {
    return exprCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * The FilterExpressions in and_group have an AND relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpressionList and_group = 1;</code>
   *
   * @return The andGroup.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.FilterExpressionList getAndGroup() {
    if (exprCase_ == 1) {
      return (com.google.analytics.data.v1alpha.FilterExpressionList) expr_;
    }
    return com.google.analytics.data.v1alpha.FilterExpressionList.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * The FilterExpressions in and_group have an AND relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpressionList and_group = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.FilterExpressionListOrBuilder getAndGroupOrBuilder() {
    if (exprCase_ == 1) {
      return (com.google.analytics.data.v1alpha.FilterExpressionList) expr_;
    }
    return com.google.analytics.data.v1alpha.FilterExpressionList.getDefaultInstance();
  }

  public static final int OR_GROUP_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * The FilterExpressions in or_group have an OR relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpressionList or_group = 2;</code>
   *
   * @return Whether the orGroup field is set.
   */
  @java.lang.Override
  public boolean hasOrGroup() {
    return exprCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * The FilterExpressions in or_group have an OR relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpressionList or_group = 2;</code>
   *
   * @return The orGroup.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.FilterExpressionList getOrGroup() {
    if (exprCase_ == 2) {
      return (com.google.analytics.data.v1alpha.FilterExpressionList) expr_;
    }
    return com.google.analytics.data.v1alpha.FilterExpressionList.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * The FilterExpressions in or_group have an OR relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpressionList or_group = 2;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.FilterExpressionListOrBuilder getOrGroupOrBuilder() {
    if (exprCase_ == 2) {
      return (com.google.analytics.data.v1alpha.FilterExpressionList) expr_;
    }
    return com.google.analytics.data.v1alpha.FilterExpressionList.getDefaultInstance();
  }

  public static final int NOT_EXPRESSION_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * The FilterExpression is NOT of not_expression.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpression not_expression = 3;</code>
   *
   * @return Whether the notExpression field is set.
   */
  @java.lang.Override
  public boolean hasNotExpression() {
    return exprCase_ == 3;
  }
  /**
   *
   *
   * <pre>
   * The FilterExpression is NOT of not_expression.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpression not_expression = 3;</code>
   *
   * @return The notExpression.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.FilterExpression getNotExpression() {
    if (exprCase_ == 3) {
      return (com.google.analytics.data.v1alpha.FilterExpression) expr_;
    }
    return com.google.analytics.data.v1alpha.FilterExpression.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * The FilterExpression is NOT of not_expression.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpression not_expression = 3;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.FilterExpressionOrBuilder getNotExpressionOrBuilder() {
    if (exprCase_ == 3) {
      return (com.google.analytics.data.v1alpha.FilterExpression) expr_;
    }
    return com.google.analytics.data.v1alpha.FilterExpression.getDefaultInstance();
  }

  public static final int FILTER_FIELD_NUMBER = 4;
  /**
   *
   *
   * <pre>
   * A primitive filter.
   * All fields in filter in same FilterExpression needs to be either all
   * dimensions or metrics.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter filter = 4;</code>
   *
   * @return Whether the filter field is set.
   */
  @java.lang.Override
  public boolean hasFilter() {
    return exprCase_ == 4;
  }
  /**
   *
   *
   * <pre>
   * A primitive filter.
   * All fields in filter in same FilterExpression needs to be either all
   * dimensions or metrics.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter filter = 4;</code>
   *
   * @return The filter.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.Filter getFilter() {
    if (exprCase_ == 4) {
      return (com.google.analytics.data.v1alpha.Filter) expr_;
    }
    return com.google.analytics.data.v1alpha.Filter.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * A primitive filter.
   * All fields in filter in same FilterExpression needs to be either all
   * dimensions or metrics.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter filter = 4;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.FilterOrBuilder getFilterOrBuilder() {
    if (exprCase_ == 4) {
      return (com.google.analytics.data.v1alpha.Filter) expr_;
    }
    return com.google.analytics.data.v1alpha.Filter.getDefaultInstance();
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
    if (exprCase_ == 1) {
      output.writeMessage(1, (com.google.analytics.data.v1alpha.FilterExpressionList) expr_);
    }
    if (exprCase_ == 2) {
      output.writeMessage(2, (com.google.analytics.data.v1alpha.FilterExpressionList) expr_);
    }
    if (exprCase_ == 3) {
      output.writeMessage(3, (com.google.analytics.data.v1alpha.FilterExpression) expr_);
    }
    if (exprCase_ == 4) {
      output.writeMessage(4, (com.google.analytics.data.v1alpha.Filter) expr_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (exprCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.analytics.data.v1alpha.FilterExpressionList) expr_);
    }
    if (exprCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.analytics.data.v1alpha.FilterExpressionList) expr_);
    }
    if (exprCase_ == 3) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              3, (com.google.analytics.data.v1alpha.FilterExpression) expr_);
    }
    if (exprCase_ == 4) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              4, (com.google.analytics.data.v1alpha.Filter) expr_);
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.FilterExpression)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.FilterExpression other =
        (com.google.analytics.data.v1alpha.FilterExpression) obj;

    if (!getExprCase().equals(other.getExprCase())) return false;
    switch (exprCase_) {
      case 1:
        if (!getAndGroup().equals(other.getAndGroup())) return false;
        break;
      case 2:
        if (!getOrGroup().equals(other.getOrGroup())) return false;
        break;
      case 3:
        if (!getNotExpression().equals(other.getNotExpression())) return false;
        break;
      case 4:
        if (!getFilter().equals(other.getFilter())) return false;
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
    switch (exprCase_) {
      case 1:
        hash = (37 * hash) + AND_GROUP_FIELD_NUMBER;
        hash = (53 * hash) + getAndGroup().hashCode();
        break;
      case 2:
        hash = (37 * hash) + OR_GROUP_FIELD_NUMBER;
        hash = (53 * hash) + getOrGroup().hashCode();
        break;
      case 3:
        hash = (37 * hash) + NOT_EXPRESSION_FIELD_NUMBER;
        hash = (53 * hash) + getNotExpression().hashCode();
        break;
      case 4:
        hash = (37 * hash) + FILTER_FIELD_NUMBER;
        hash = (53 * hash) + getFilter().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.FilterExpression parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.FilterExpression parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.FilterExpression parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.FilterExpression parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.FilterExpression parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.FilterExpression parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.FilterExpression parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.FilterExpression parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.FilterExpression parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.FilterExpression parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.FilterExpression parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.FilterExpression parseFrom(
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

  public static Builder newBuilder(com.google.analytics.data.v1alpha.FilterExpression prototype) {
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
   * To express dimension or metric filters.
   * The fields in the same FilterExpression need to be either all dimensions or
   * all metrics.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.FilterExpression}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.FilterExpression)
      com.google.analytics.data.v1alpha.FilterExpressionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_FilterExpression_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_FilterExpression_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.FilterExpression.class,
              com.google.analytics.data.v1alpha.FilterExpression.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.FilterExpression.newBuilder()
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
      exprCase_ = 0;
      expr_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_FilterExpression_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.FilterExpression getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.FilterExpression.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.FilterExpression build() {
      com.google.analytics.data.v1alpha.FilterExpression result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.FilterExpression buildPartial() {
      com.google.analytics.data.v1alpha.FilterExpression result =
          new com.google.analytics.data.v1alpha.FilterExpression(this);
      if (exprCase_ == 1) {
        if (andGroupBuilder_ == null) {
          result.expr_ = expr_;
        } else {
          result.expr_ = andGroupBuilder_.build();
        }
      }
      if (exprCase_ == 2) {
        if (orGroupBuilder_ == null) {
          result.expr_ = expr_;
        } else {
          result.expr_ = orGroupBuilder_.build();
        }
      }
      if (exprCase_ == 3) {
        if (notExpressionBuilder_ == null) {
          result.expr_ = expr_;
        } else {
          result.expr_ = notExpressionBuilder_.build();
        }
      }
      if (exprCase_ == 4) {
        if (filterBuilder_ == null) {
          result.expr_ = expr_;
        } else {
          result.expr_ = filterBuilder_.build();
        }
      }
      result.exprCase_ = exprCase_;
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
      if (other instanceof com.google.analytics.data.v1alpha.FilterExpression) {
        return mergeFrom((com.google.analytics.data.v1alpha.FilterExpression) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.FilterExpression other) {
      if (other == com.google.analytics.data.v1alpha.FilterExpression.getDefaultInstance())
        return this;
      switch (other.getExprCase()) {
        case AND_GROUP:
          {
            mergeAndGroup(other.getAndGroup());
            break;
          }
        case OR_GROUP:
          {
            mergeOrGroup(other.getOrGroup());
            break;
          }
        case NOT_EXPRESSION:
          {
            mergeNotExpression(other.getNotExpression());
            break;
          }
        case FILTER:
          {
            mergeFilter(other.getFilter());
            break;
          }
        case EXPR_NOT_SET:
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
      com.google.analytics.data.v1alpha.FilterExpression parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.data.v1alpha.FilterExpression) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int exprCase_ = 0;
    private java.lang.Object expr_;

    public ExprCase getExprCase() {
      return ExprCase.forNumber(exprCase_);
    }

    public Builder clearExpr() {
      exprCase_ = 0;
      expr_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.FilterExpressionList,
            com.google.analytics.data.v1alpha.FilterExpressionList.Builder,
            com.google.analytics.data.v1alpha.FilterExpressionListOrBuilder>
        andGroupBuilder_;
    /**
     *
     *
     * <pre>
     * The FilterExpressions in and_group have an AND relationship.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpressionList and_group = 1;</code>
     *
     * @return Whether the andGroup field is set.
     */
    @java.lang.Override
    public boolean hasAndGroup() {
      return exprCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * The FilterExpressions in and_group have an AND relationship.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpressionList and_group = 1;</code>
     *
     * @return The andGroup.
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.FilterExpressionList getAndGroup() {
      if (andGroupBuilder_ == null) {
        if (exprCase_ == 1) {
          return (com.google.analytics.data.v1alpha.FilterExpressionList) expr_;
        }
        return com.google.analytics.data.v1alpha.FilterExpressionList.getDefaultInstance();
      } else {
        if (exprCase_ == 1) {
          return andGroupBuilder_.getMessage();
        }
        return com.google.analytics.data.v1alpha.FilterExpressionList.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * The FilterExpressions in and_group have an AND relationship.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpressionList and_group = 1;</code>
     */
    public Builder setAndGroup(com.google.analytics.data.v1alpha.FilterExpressionList value) {
      if (andGroupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expr_ = value;
        onChanged();
      } else {
        andGroupBuilder_.setMessage(value);
      }
      exprCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The FilterExpressions in and_group have an AND relationship.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpressionList and_group = 1;</code>
     */
    public Builder setAndGroup(
        com.google.analytics.data.v1alpha.FilterExpressionList.Builder builderForValue) {
      if (andGroupBuilder_ == null) {
        expr_ = builderForValue.build();
        onChanged();
      } else {
        andGroupBuilder_.setMessage(builderForValue.build());
      }
      exprCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The FilterExpressions in and_group have an AND relationship.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpressionList and_group = 1;</code>
     */
    public Builder mergeAndGroup(com.google.analytics.data.v1alpha.FilterExpressionList value) {
      if (andGroupBuilder_ == null) {
        if (exprCase_ == 1
            && expr_
                != com.google.analytics.data.v1alpha.FilterExpressionList.getDefaultInstance()) {
          expr_ =
              com.google.analytics.data.v1alpha.FilterExpressionList.newBuilder(
                      (com.google.analytics.data.v1alpha.FilterExpressionList) expr_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          expr_ = value;
        }
        onChanged();
      } else {
        if (exprCase_ == 1) {
          andGroupBuilder_.mergeFrom(value);
        }
        andGroupBuilder_.setMessage(value);
      }
      exprCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The FilterExpressions in and_group have an AND relationship.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpressionList and_group = 1;</code>
     */
    public Builder clearAndGroup() {
      if (andGroupBuilder_ == null) {
        if (exprCase_ == 1) {
          exprCase_ = 0;
          expr_ = null;
          onChanged();
        }
      } else {
        if (exprCase_ == 1) {
          exprCase_ = 0;
          expr_ = null;
        }
        andGroupBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The FilterExpressions in and_group have an AND relationship.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpressionList and_group = 1;</code>
     */
    public com.google.analytics.data.v1alpha.FilterExpressionList.Builder getAndGroupBuilder() {
      return getAndGroupFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The FilterExpressions in and_group have an AND relationship.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpressionList and_group = 1;</code>
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.FilterExpressionListOrBuilder getAndGroupOrBuilder() {
      if ((exprCase_ == 1) && (andGroupBuilder_ != null)) {
        return andGroupBuilder_.getMessageOrBuilder();
      } else {
        if (exprCase_ == 1) {
          return (com.google.analytics.data.v1alpha.FilterExpressionList) expr_;
        }
        return com.google.analytics.data.v1alpha.FilterExpressionList.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * The FilterExpressions in and_group have an AND relationship.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpressionList and_group = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.FilterExpressionList,
            com.google.analytics.data.v1alpha.FilterExpressionList.Builder,
            com.google.analytics.data.v1alpha.FilterExpressionListOrBuilder>
        getAndGroupFieldBuilder() {
      if (andGroupBuilder_ == null) {
        if (!(exprCase_ == 1)) {
          expr_ = com.google.analytics.data.v1alpha.FilterExpressionList.getDefaultInstance();
        }
        andGroupBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.FilterExpressionList,
                com.google.analytics.data.v1alpha.FilterExpressionList.Builder,
                com.google.analytics.data.v1alpha.FilterExpressionListOrBuilder>(
                (com.google.analytics.data.v1alpha.FilterExpressionList) expr_,
                getParentForChildren(),
                isClean());
        expr_ = null;
      }
      exprCase_ = 1;
      onChanged();
      ;
      return andGroupBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.FilterExpressionList,
            com.google.analytics.data.v1alpha.FilterExpressionList.Builder,
            com.google.analytics.data.v1alpha.FilterExpressionListOrBuilder>
        orGroupBuilder_;
    /**
     *
     *
     * <pre>
     * The FilterExpressions in or_group have an OR relationship.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpressionList or_group = 2;</code>
     *
     * @return Whether the orGroup field is set.
     */
    @java.lang.Override
    public boolean hasOrGroup() {
      return exprCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * The FilterExpressions in or_group have an OR relationship.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpressionList or_group = 2;</code>
     *
     * @return The orGroup.
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.FilterExpressionList getOrGroup() {
      if (orGroupBuilder_ == null) {
        if (exprCase_ == 2) {
          return (com.google.analytics.data.v1alpha.FilterExpressionList) expr_;
        }
        return com.google.analytics.data.v1alpha.FilterExpressionList.getDefaultInstance();
      } else {
        if (exprCase_ == 2) {
          return orGroupBuilder_.getMessage();
        }
        return com.google.analytics.data.v1alpha.FilterExpressionList.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * The FilterExpressions in or_group have an OR relationship.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpressionList or_group = 2;</code>
     */
    public Builder setOrGroup(com.google.analytics.data.v1alpha.FilterExpressionList value) {
      if (orGroupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expr_ = value;
        onChanged();
      } else {
        orGroupBuilder_.setMessage(value);
      }
      exprCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The FilterExpressions in or_group have an OR relationship.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpressionList or_group = 2;</code>
     */
    public Builder setOrGroup(
        com.google.analytics.data.v1alpha.FilterExpressionList.Builder builderForValue) {
      if (orGroupBuilder_ == null) {
        expr_ = builderForValue.build();
        onChanged();
      } else {
        orGroupBuilder_.setMessage(builderForValue.build());
      }
      exprCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The FilterExpressions in or_group have an OR relationship.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpressionList or_group = 2;</code>
     */
    public Builder mergeOrGroup(com.google.analytics.data.v1alpha.FilterExpressionList value) {
      if (orGroupBuilder_ == null) {
        if (exprCase_ == 2
            && expr_
                != com.google.analytics.data.v1alpha.FilterExpressionList.getDefaultInstance()) {
          expr_ =
              com.google.analytics.data.v1alpha.FilterExpressionList.newBuilder(
                      (com.google.analytics.data.v1alpha.FilterExpressionList) expr_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          expr_ = value;
        }
        onChanged();
      } else {
        if (exprCase_ == 2) {
          orGroupBuilder_.mergeFrom(value);
        }
        orGroupBuilder_.setMessage(value);
      }
      exprCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The FilterExpressions in or_group have an OR relationship.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpressionList or_group = 2;</code>
     */
    public Builder clearOrGroup() {
      if (orGroupBuilder_ == null) {
        if (exprCase_ == 2) {
          exprCase_ = 0;
          expr_ = null;
          onChanged();
        }
      } else {
        if (exprCase_ == 2) {
          exprCase_ = 0;
          expr_ = null;
        }
        orGroupBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The FilterExpressions in or_group have an OR relationship.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpressionList or_group = 2;</code>
     */
    public com.google.analytics.data.v1alpha.FilterExpressionList.Builder getOrGroupBuilder() {
      return getOrGroupFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The FilterExpressions in or_group have an OR relationship.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpressionList or_group = 2;</code>
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.FilterExpressionListOrBuilder getOrGroupOrBuilder() {
      if ((exprCase_ == 2) && (orGroupBuilder_ != null)) {
        return orGroupBuilder_.getMessageOrBuilder();
      } else {
        if (exprCase_ == 2) {
          return (com.google.analytics.data.v1alpha.FilterExpressionList) expr_;
        }
        return com.google.analytics.data.v1alpha.FilterExpressionList.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * The FilterExpressions in or_group have an OR relationship.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpressionList or_group = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.FilterExpressionList,
            com.google.analytics.data.v1alpha.FilterExpressionList.Builder,
            com.google.analytics.data.v1alpha.FilterExpressionListOrBuilder>
        getOrGroupFieldBuilder() {
      if (orGroupBuilder_ == null) {
        if (!(exprCase_ == 2)) {
          expr_ = com.google.analytics.data.v1alpha.FilterExpressionList.getDefaultInstance();
        }
        orGroupBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.FilterExpressionList,
                com.google.analytics.data.v1alpha.FilterExpressionList.Builder,
                com.google.analytics.data.v1alpha.FilterExpressionListOrBuilder>(
                (com.google.analytics.data.v1alpha.FilterExpressionList) expr_,
                getParentForChildren(),
                isClean());
        expr_ = null;
      }
      exprCase_ = 2;
      onChanged();
      ;
      return orGroupBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.FilterExpression,
            com.google.analytics.data.v1alpha.FilterExpression.Builder,
            com.google.analytics.data.v1alpha.FilterExpressionOrBuilder>
        notExpressionBuilder_;
    /**
     *
     *
     * <pre>
     * The FilterExpression is NOT of not_expression.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpression not_expression = 3;</code>
     *
     * @return Whether the notExpression field is set.
     */
    @java.lang.Override
    public boolean hasNotExpression() {
      return exprCase_ == 3;
    }
    /**
     *
     *
     * <pre>
     * The FilterExpression is NOT of not_expression.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpression not_expression = 3;</code>
     *
     * @return The notExpression.
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.FilterExpression getNotExpression() {
      if (notExpressionBuilder_ == null) {
        if (exprCase_ == 3) {
          return (com.google.analytics.data.v1alpha.FilterExpression) expr_;
        }
        return com.google.analytics.data.v1alpha.FilterExpression.getDefaultInstance();
      } else {
        if (exprCase_ == 3) {
          return notExpressionBuilder_.getMessage();
        }
        return com.google.analytics.data.v1alpha.FilterExpression.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * The FilterExpression is NOT of not_expression.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpression not_expression = 3;</code>
     */
    public Builder setNotExpression(com.google.analytics.data.v1alpha.FilterExpression value) {
      if (notExpressionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expr_ = value;
        onChanged();
      } else {
        notExpressionBuilder_.setMessage(value);
      }
      exprCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The FilterExpression is NOT of not_expression.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpression not_expression = 3;</code>
     */
    public Builder setNotExpression(
        com.google.analytics.data.v1alpha.FilterExpression.Builder builderForValue) {
      if (notExpressionBuilder_ == null) {
        expr_ = builderForValue.build();
        onChanged();
      } else {
        notExpressionBuilder_.setMessage(builderForValue.build());
      }
      exprCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The FilterExpression is NOT of not_expression.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpression not_expression = 3;</code>
     */
    public Builder mergeNotExpression(com.google.analytics.data.v1alpha.FilterExpression value) {
      if (notExpressionBuilder_ == null) {
        if (exprCase_ == 3
            && expr_ != com.google.analytics.data.v1alpha.FilterExpression.getDefaultInstance()) {
          expr_ =
              com.google.analytics.data.v1alpha.FilterExpression.newBuilder(
                      (com.google.analytics.data.v1alpha.FilterExpression) expr_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          expr_ = value;
        }
        onChanged();
      } else {
        if (exprCase_ == 3) {
          notExpressionBuilder_.mergeFrom(value);
        }
        notExpressionBuilder_.setMessage(value);
      }
      exprCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The FilterExpression is NOT of not_expression.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpression not_expression = 3;</code>
     */
    public Builder clearNotExpression() {
      if (notExpressionBuilder_ == null) {
        if (exprCase_ == 3) {
          exprCase_ = 0;
          expr_ = null;
          onChanged();
        }
      } else {
        if (exprCase_ == 3) {
          exprCase_ = 0;
          expr_ = null;
        }
        notExpressionBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The FilterExpression is NOT of not_expression.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpression not_expression = 3;</code>
     */
    public com.google.analytics.data.v1alpha.FilterExpression.Builder getNotExpressionBuilder() {
      return getNotExpressionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The FilterExpression is NOT of not_expression.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpression not_expression = 3;</code>
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.FilterExpressionOrBuilder getNotExpressionOrBuilder() {
      if ((exprCase_ == 3) && (notExpressionBuilder_ != null)) {
        return notExpressionBuilder_.getMessageOrBuilder();
      } else {
        if (exprCase_ == 3) {
          return (com.google.analytics.data.v1alpha.FilterExpression) expr_;
        }
        return com.google.analytics.data.v1alpha.FilterExpression.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * The FilterExpression is NOT of not_expression.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.FilterExpression not_expression = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.FilterExpression,
            com.google.analytics.data.v1alpha.FilterExpression.Builder,
            com.google.analytics.data.v1alpha.FilterExpressionOrBuilder>
        getNotExpressionFieldBuilder() {
      if (notExpressionBuilder_ == null) {
        if (!(exprCase_ == 3)) {
          expr_ = com.google.analytics.data.v1alpha.FilterExpression.getDefaultInstance();
        }
        notExpressionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.FilterExpression,
                com.google.analytics.data.v1alpha.FilterExpression.Builder,
                com.google.analytics.data.v1alpha.FilterExpressionOrBuilder>(
                (com.google.analytics.data.v1alpha.FilterExpression) expr_,
                getParentForChildren(),
                isClean());
        expr_ = null;
      }
      exprCase_ = 3;
      onChanged();
      ;
      return notExpressionBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.Filter,
            com.google.analytics.data.v1alpha.Filter.Builder,
            com.google.analytics.data.v1alpha.FilterOrBuilder>
        filterBuilder_;
    /**
     *
     *
     * <pre>
     * A primitive filter.
     * All fields in filter in same FilterExpression needs to be either all
     * dimensions or metrics.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter filter = 4;</code>
     *
     * @return Whether the filter field is set.
     */
    @java.lang.Override
    public boolean hasFilter() {
      return exprCase_ == 4;
    }
    /**
     *
     *
     * <pre>
     * A primitive filter.
     * All fields in filter in same FilterExpression needs to be either all
     * dimensions or metrics.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter filter = 4;</code>
     *
     * @return The filter.
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.Filter getFilter() {
      if (filterBuilder_ == null) {
        if (exprCase_ == 4) {
          return (com.google.analytics.data.v1alpha.Filter) expr_;
        }
        return com.google.analytics.data.v1alpha.Filter.getDefaultInstance();
      } else {
        if (exprCase_ == 4) {
          return filterBuilder_.getMessage();
        }
        return com.google.analytics.data.v1alpha.Filter.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * A primitive filter.
     * All fields in filter in same FilterExpression needs to be either all
     * dimensions or metrics.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter filter = 4;</code>
     */
    public Builder setFilter(com.google.analytics.data.v1alpha.Filter value) {
      if (filterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expr_ = value;
        onChanged();
      } else {
        filterBuilder_.setMessage(value);
      }
      exprCase_ = 4;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A primitive filter.
     * All fields in filter in same FilterExpression needs to be either all
     * dimensions or metrics.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter filter = 4;</code>
     */
    public Builder setFilter(com.google.analytics.data.v1alpha.Filter.Builder builderForValue) {
      if (filterBuilder_ == null) {
        expr_ = builderForValue.build();
        onChanged();
      } else {
        filterBuilder_.setMessage(builderForValue.build());
      }
      exprCase_ = 4;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A primitive filter.
     * All fields in filter in same FilterExpression needs to be either all
     * dimensions or metrics.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter filter = 4;</code>
     */
    public Builder mergeFilter(com.google.analytics.data.v1alpha.Filter value) {
      if (filterBuilder_ == null) {
        if (exprCase_ == 4
            && expr_ != com.google.analytics.data.v1alpha.Filter.getDefaultInstance()) {
          expr_ =
              com.google.analytics.data.v1alpha.Filter.newBuilder(
                      (com.google.analytics.data.v1alpha.Filter) expr_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          expr_ = value;
        }
        onChanged();
      } else {
        if (exprCase_ == 4) {
          filterBuilder_.mergeFrom(value);
        }
        filterBuilder_.setMessage(value);
      }
      exprCase_ = 4;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A primitive filter.
     * All fields in filter in same FilterExpression needs to be either all
     * dimensions or metrics.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter filter = 4;</code>
     */
    public Builder clearFilter() {
      if (filterBuilder_ == null) {
        if (exprCase_ == 4) {
          exprCase_ = 0;
          expr_ = null;
          onChanged();
        }
      } else {
        if (exprCase_ == 4) {
          exprCase_ = 0;
          expr_ = null;
        }
        filterBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A primitive filter.
     * All fields in filter in same FilterExpression needs to be either all
     * dimensions or metrics.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter filter = 4;</code>
     */
    public com.google.analytics.data.v1alpha.Filter.Builder getFilterBuilder() {
      return getFilterFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A primitive filter.
     * All fields in filter in same FilterExpression needs to be either all
     * dimensions or metrics.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter filter = 4;</code>
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.FilterOrBuilder getFilterOrBuilder() {
      if ((exprCase_ == 4) && (filterBuilder_ != null)) {
        return filterBuilder_.getMessageOrBuilder();
      } else {
        if (exprCase_ == 4) {
          return (com.google.analytics.data.v1alpha.Filter) expr_;
        }
        return com.google.analytics.data.v1alpha.Filter.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * A primitive filter.
     * All fields in filter in same FilterExpression needs to be either all
     * dimensions or metrics.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter filter = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.Filter,
            com.google.analytics.data.v1alpha.Filter.Builder,
            com.google.analytics.data.v1alpha.FilterOrBuilder>
        getFilterFieldBuilder() {
      if (filterBuilder_ == null) {
        if (!(exprCase_ == 4)) {
          expr_ = com.google.analytics.data.v1alpha.Filter.getDefaultInstance();
        }
        filterBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.Filter,
                com.google.analytics.data.v1alpha.Filter.Builder,
                com.google.analytics.data.v1alpha.FilterOrBuilder>(
                (com.google.analytics.data.v1alpha.Filter) expr_,
                getParentForChildren(),
                isClean());
        expr_ = null;
      }
      exprCase_ = 4;
      onChanged();
      ;
      return filterBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.FilterExpression)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.FilterExpression)
  private static final com.google.analytics.data.v1alpha.FilterExpression DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.FilterExpression();
  }

  public static com.google.analytics.data.v1alpha.FilterExpression getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FilterExpression> PARSER =
      new com.google.protobuf.AbstractParser<FilterExpression>() {
        @java.lang.Override
        public FilterExpression parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new FilterExpression(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<FilterExpression> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FilterExpression> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.FilterExpression getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
