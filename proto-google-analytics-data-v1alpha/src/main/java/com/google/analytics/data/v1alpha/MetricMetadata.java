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
 * Explains a metric.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.MetricMetadata}
 */
public final class MetricMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.MetricMetadata)
    MetricMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MetricMetadata.newBuilder() to construct.
  private MetricMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MetricMetadata() {
    apiName_ = "";
    uiName_ = "";
    description_ = "";
    deprecatedApiNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    type_ = 0;
    expression_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MetricMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private MetricMetadata(
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

              apiName_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              uiName_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              description_ = s;
              break;
            }
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                deprecatedApiNames_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              deprecatedApiNames_.add(s);
              break;
            }
          case 40:
            {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
          case 50:
            {
              java.lang.String s = input.readStringRequireUtf8();

              expression_ = s;
              break;
            }
          case 56:
            {
              customDefinition_ = input.readBool();
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
        deprecatedApiNames_ = deprecatedApiNames_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_MetricMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_MetricMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.MetricMetadata.class,
            com.google.analytics.data.v1alpha.MetricMetadata.Builder.class);
  }

  public static final int API_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object apiName_;
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
  @java.lang.Override
  public java.lang.String getApiName() {
    java.lang.Object ref = apiName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      apiName_ = s;
      return s;
    }
  }
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
  @java.lang.Override
  public com.google.protobuf.ByteString getApiNameBytes() {
    java.lang.Object ref = apiName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      apiName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UI_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object uiName_;
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
  @java.lang.Override
  public java.lang.String getUiName() {
    java.lang.Object ref = uiName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uiName_ = s;
      return s;
    }
  }
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
  @java.lang.Override
  public com.google.protobuf.ByteString getUiNameBytes() {
    java.lang.Object ref = uiName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      uiName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  private volatile java.lang.Object description_;
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
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
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
  @java.lang.Override
  public com.google.protobuf.ByteString getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEPRECATED_API_NAMES_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList deprecatedApiNames_;
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
  public com.google.protobuf.ProtocolStringList getDeprecatedApiNamesList() {
    return deprecatedApiNames_;
  }
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
  public int getDeprecatedApiNamesCount() {
    return deprecatedApiNames_.size();
  }
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
  public java.lang.String getDeprecatedApiNames(int index) {
    return deprecatedApiNames_.get(index);
  }
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
  public com.google.protobuf.ByteString getDeprecatedApiNamesBytes(int index) {
    return deprecatedApiNames_.getByteString(index);
  }

  public static final int TYPE_FIELD_NUMBER = 5;
  private int type_;
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
  @java.lang.Override
  public int getTypeValue() {
    return type_;
  }
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
  @java.lang.Override
  public com.google.analytics.data.v1alpha.MetricType getType() {
    @SuppressWarnings("deprecation")
    com.google.analytics.data.v1alpha.MetricType result =
        com.google.analytics.data.v1alpha.MetricType.valueOf(type_);
    return result == null ? com.google.analytics.data.v1alpha.MetricType.UNRECOGNIZED : result;
  }

  public static final int EXPRESSION_FIELD_NUMBER = 6;
  private volatile java.lang.Object expression_;
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
  @java.lang.Override
  public java.lang.String getExpression() {
    java.lang.Object ref = expression_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      expression_ = s;
      return s;
    }
  }
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
  @java.lang.Override
  public com.google.protobuf.ByteString getExpressionBytes() {
    java.lang.Object ref = expression_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      expression_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CUSTOM_DEFINITION_FIELD_NUMBER = 7;
  private boolean customDefinition_;
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
  @java.lang.Override
  public boolean getCustomDefinition() {
    return customDefinition_;
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
    if (!getApiNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, apiName_);
    }
    if (!getUiNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, uiName_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, description_);
    }
    for (int i = 0; i < deprecatedApiNames_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, deprecatedApiNames_.getRaw(i));
    }
    if (type_ != com.google.analytics.data.v1alpha.MetricType.METRIC_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(5, type_);
    }
    if (!getExpressionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, expression_);
    }
    if (customDefinition_ != false) {
      output.writeBool(7, customDefinition_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getApiNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, apiName_);
    }
    if (!getUiNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, uiName_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, description_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < deprecatedApiNames_.size(); i++) {
        dataSize += computeStringSizeNoTag(deprecatedApiNames_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDeprecatedApiNamesList().size();
    }
    if (type_ != com.google.analytics.data.v1alpha.MetricType.METRIC_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(5, type_);
    }
    if (!getExpressionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, expression_);
    }
    if (customDefinition_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(7, customDefinition_);
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.MetricMetadata)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.MetricMetadata other =
        (com.google.analytics.data.v1alpha.MetricMetadata) obj;

    if (!getApiName().equals(other.getApiName())) return false;
    if (!getUiName().equals(other.getUiName())) return false;
    if (!getDescription().equals(other.getDescription())) return false;
    if (!getDeprecatedApiNamesList().equals(other.getDeprecatedApiNamesList())) return false;
    if (type_ != other.type_) return false;
    if (!getExpression().equals(other.getExpression())) return false;
    if (getCustomDefinition() != other.getCustomDefinition()) return false;
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
    hash = (37 * hash) + API_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getApiName().hashCode();
    hash = (37 * hash) + UI_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getUiName().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    if (getDeprecatedApiNamesCount() > 0) {
      hash = (37 * hash) + DEPRECATED_API_NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getDeprecatedApiNamesList().hashCode();
    }
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + EXPRESSION_FIELD_NUMBER;
    hash = (53 * hash) + getExpression().hashCode();
    hash = (37 * hash) + CUSTOM_DEFINITION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getCustomDefinition());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.MetricMetadata parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.MetricMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.MetricMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.MetricMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.MetricMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.MetricMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.MetricMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.MetricMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.MetricMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.MetricMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.MetricMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.MetricMetadata parseFrom(
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

  public static Builder newBuilder(com.google.analytics.data.v1alpha.MetricMetadata prototype) {
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
   * Explains a metric.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.MetricMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.MetricMetadata)
      com.google.analytics.data.v1alpha.MetricMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_MetricMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_MetricMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.MetricMetadata.class,
              com.google.analytics.data.v1alpha.MetricMetadata.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.MetricMetadata.newBuilder()
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
      apiName_ = "";

      uiName_ = "";

      description_ = "";

      deprecatedApiNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;

      expression_ = "";

      customDefinition_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_MetricMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.MetricMetadata getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.MetricMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.MetricMetadata build() {
      com.google.analytics.data.v1alpha.MetricMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.MetricMetadata buildPartial() {
      com.google.analytics.data.v1alpha.MetricMetadata result =
          new com.google.analytics.data.v1alpha.MetricMetadata(this);
      int from_bitField0_ = bitField0_;
      result.apiName_ = apiName_;
      result.uiName_ = uiName_;
      result.description_ = description_;
      if (((bitField0_ & 0x00000001) != 0)) {
        deprecatedApiNames_ = deprecatedApiNames_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.deprecatedApiNames_ = deprecatedApiNames_;
      result.type_ = type_;
      result.expression_ = expression_;
      result.customDefinition_ = customDefinition_;
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
      if (other instanceof com.google.analytics.data.v1alpha.MetricMetadata) {
        return mergeFrom((com.google.analytics.data.v1alpha.MetricMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.MetricMetadata other) {
      if (other == com.google.analytics.data.v1alpha.MetricMetadata.getDefaultInstance())
        return this;
      if (!other.getApiName().isEmpty()) {
        apiName_ = other.apiName_;
        onChanged();
      }
      if (!other.getUiName().isEmpty()) {
        uiName_ = other.uiName_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (!other.deprecatedApiNames_.isEmpty()) {
        if (deprecatedApiNames_.isEmpty()) {
          deprecatedApiNames_ = other.deprecatedApiNames_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureDeprecatedApiNamesIsMutable();
          deprecatedApiNames_.addAll(other.deprecatedApiNames_);
        }
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (!other.getExpression().isEmpty()) {
        expression_ = other.expression_;
        onChanged();
      }
      if (other.getCustomDefinition() != false) {
        setCustomDefinition(other.getCustomDefinition());
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
      com.google.analytics.data.v1alpha.MetricMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.analytics.data.v1alpha.MetricMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object apiName_ = "";
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
    public java.lang.String getApiName() {
      java.lang.Object ref = apiName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        apiName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
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
    public com.google.protobuf.ByteString getApiNameBytes() {
      java.lang.Object ref = apiName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        apiName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
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
     * @param value The apiName to set.
     * @return This builder for chaining.
     */
    public Builder setApiName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      apiName_ = value;
      onChanged();
      return this;
    }
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
     * @return This builder for chaining.
     */
    public Builder clearApiName() {

      apiName_ = getDefaultInstance().getApiName();
      onChanged();
      return this;
    }
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
     * @param value The bytes for apiName to set.
     * @return This builder for chaining.
     */
    public Builder setApiNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      apiName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object uiName_ = "";
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
    public java.lang.String getUiName() {
      java.lang.Object ref = uiName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uiName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
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
    public com.google.protobuf.ByteString getUiNameBytes() {
      java.lang.Object ref = uiName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        uiName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
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
     * @param value The uiName to set.
     * @return This builder for chaining.
     */
    public Builder setUiName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      uiName_ = value;
      onChanged();
      return this;
    }
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
     * @return This builder for chaining.
     */
    public Builder clearUiName() {

      uiName_ = getDefaultInstance().getUiName();
      onChanged();
      return this;
    }
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
     * @param value The bytes for uiName to set.
     * @return This builder for chaining.
     */
    public Builder setUiNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      uiName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
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
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
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
    public com.google.protobuf.ByteString getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Description of how this metric is used and calculated.
     * </pre>
     *
     * <code>string description = 3;</code>
     *
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      description_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Description of how this metric is used and calculated.
     * </pre>
     *
     * <code>string description = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDescription() {

      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Description of how this metric is used and calculated.
     * </pre>
     *
     * <code>string description = 3;</code>
     *
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      description_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList deprecatedApiNames_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureDeprecatedApiNamesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        deprecatedApiNames_ = new com.google.protobuf.LazyStringArrayList(deprecatedApiNames_);
        bitField0_ |= 0x00000001;
      }
    }
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
    public com.google.protobuf.ProtocolStringList getDeprecatedApiNamesList() {
      return deprecatedApiNames_.getUnmodifiableView();
    }
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
    public int getDeprecatedApiNamesCount() {
      return deprecatedApiNames_.size();
    }
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
    public java.lang.String getDeprecatedApiNames(int index) {
      return deprecatedApiNames_.get(index);
    }
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
    public com.google.protobuf.ByteString getDeprecatedApiNamesBytes(int index) {
      return deprecatedApiNames_.getByteString(index);
    }
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
     * @param index The index to set the value at.
     * @param value The deprecatedApiNames to set.
     * @return This builder for chaining.
     */
    public Builder setDeprecatedApiNames(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureDeprecatedApiNamesIsMutable();
      deprecatedApiNames_.set(index, value);
      onChanged();
      return this;
    }
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
     * @param value The deprecatedApiNames to add.
     * @return This builder for chaining.
     */
    public Builder addDeprecatedApiNames(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureDeprecatedApiNamesIsMutable();
      deprecatedApiNames_.add(value);
      onChanged();
      return this;
    }
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
     * @param values The deprecatedApiNames to add.
     * @return This builder for chaining.
     */
    public Builder addAllDeprecatedApiNames(java.lang.Iterable<java.lang.String> values) {
      ensureDeprecatedApiNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, deprecatedApiNames_);
      onChanged();
      return this;
    }
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
     * @return This builder for chaining.
     */
    public Builder clearDeprecatedApiNames() {
      deprecatedApiNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
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
     * @param value The bytes of the deprecatedApiNames to add.
     * @return This builder for chaining.
     */
    public Builder addDeprecatedApiNamesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureDeprecatedApiNamesIsMutable();
      deprecatedApiNames_.add(value);
      onChanged();
      return this;
    }

    private int type_ = 0;
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
    @java.lang.Override
    public int getTypeValue() {
      return type_;
    }
    /**
     *
     *
     * <pre>
     * The type of this metric.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.MetricType type = 5;</code>
     *
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {

      type_ = value;
      onChanged();
      return this;
    }
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
    @java.lang.Override
    public com.google.analytics.data.v1alpha.MetricType getType() {
      @SuppressWarnings("deprecation")
      com.google.analytics.data.v1alpha.MetricType result =
          com.google.analytics.data.v1alpha.MetricType.valueOf(type_);
      return result == null ? com.google.analytics.data.v1alpha.MetricType.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * The type of this metric.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.MetricType type = 5;</code>
     *
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.analytics.data.v1alpha.MetricType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of this metric.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.MetricType type = 5;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearType() {

      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object expression_ = "";
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
    public java.lang.String getExpression() {
      java.lang.Object ref = expression_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        expression_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
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
    public com.google.protobuf.ByteString getExpressionBytes() {
      java.lang.Object ref = expression_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        expression_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
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
     * @param value The expression to set.
     * @return This builder for chaining.
     */
    public Builder setExpression(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      expression_ = value;
      onChanged();
      return this;
    }
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
     * @return This builder for chaining.
     */
    public Builder clearExpression() {

      expression_ = getDefaultInstance().getExpression();
      onChanged();
      return this;
    }
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
     * @param value The bytes for expression to set.
     * @return This builder for chaining.
     */
    public Builder setExpressionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      expression_ = value;
      onChanged();
      return this;
    }

    private boolean customDefinition_;
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
    @java.lang.Override
    public boolean getCustomDefinition() {
      return customDefinition_;
    }
    /**
     *
     *
     * <pre>
     * True if the metric is a custom metric for this property.
     * </pre>
     *
     * <code>bool custom_definition = 7;</code>
     *
     * @param value The customDefinition to set.
     * @return This builder for chaining.
     */
    public Builder setCustomDefinition(boolean value) {

      customDefinition_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * True if the metric is a custom metric for this property.
     * </pre>
     *
     * <code>bool custom_definition = 7;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCustomDefinition() {

      customDefinition_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.MetricMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.MetricMetadata)
  private static final com.google.analytics.data.v1alpha.MetricMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.MetricMetadata();
  }

  public static com.google.analytics.data.v1alpha.MetricMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MetricMetadata> PARSER =
      new com.google.protobuf.AbstractParser<MetricMetadata>() {
        @java.lang.Override
        public MetricMetadata parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new MetricMetadata(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<MetricMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetricMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.MetricMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
