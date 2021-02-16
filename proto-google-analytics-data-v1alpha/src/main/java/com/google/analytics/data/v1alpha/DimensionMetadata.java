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
 * Explains a dimension.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.DimensionMetadata}
 */
public final class DimensionMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.DimensionMetadata)
    DimensionMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DimensionMetadata.newBuilder() to construct.
  private DimensionMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DimensionMetadata() {
    apiName_ = "";
    uiName_ = "";
    description_ = "";
    deprecatedApiNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DimensionMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private DimensionMetadata(
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
        .internal_static_google_analytics_data_v1alpha_DimensionMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_DimensionMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.DimensionMetadata.class,
            com.google.analytics.data.v1alpha.DimensionMetadata.Builder.class);
  }

  public static final int API_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object apiName_;
  /**
   *
   *
   * <pre>
   * This dimension's name. Useable in [Dimension](#Dimension)'s `name`. For
   * example, `eventName`.
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
   * This dimension's name. Useable in [Dimension](#Dimension)'s `name`. For
   * example, `eventName`.
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
   * This dimension's name within the Google Analytics user interface. For
   * example, `Event name`.
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
   * This dimension's name within the Google Analytics user interface. For
   * example, `Event name`.
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
   * Description of how this dimension is used and calculated.
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
   * Description of how this dimension is used and calculated.
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
   * Still usable but deprecated names for this dimension. If populated, this
   * dimension is available by either `apiName` or one of `deprecatedApiNames`
   * for a period of time. After the deprecation period, the dimension will be
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
   * Still usable but deprecated names for this dimension. If populated, this
   * dimension is available by either `apiName` or one of `deprecatedApiNames`
   * for a period of time. After the deprecation period, the dimension will be
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
   * Still usable but deprecated names for this dimension. If populated, this
   * dimension is available by either `apiName` or one of `deprecatedApiNames`
   * for a period of time. After the deprecation period, the dimension will be
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
   * Still usable but deprecated names for this dimension. If populated, this
   * dimension is available by either `apiName` or one of `deprecatedApiNames`
   * for a period of time. After the deprecation period, the dimension will be
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

  public static final int CUSTOM_DEFINITION_FIELD_NUMBER = 5;
  private boolean customDefinition_;
  /**
   *
   *
   * <pre>
   * True if the dimension is a custom dimension for this property.
   * </pre>
   *
   * <code>bool custom_definition = 5;</code>
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
    if (customDefinition_ != false) {
      output.writeBool(5, customDefinition_);
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
    if (customDefinition_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(5, customDefinition_);
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.DimensionMetadata)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.DimensionMetadata other =
        (com.google.analytics.data.v1alpha.DimensionMetadata) obj;

    if (!getApiName().equals(other.getApiName())) return false;
    if (!getUiName().equals(other.getUiName())) return false;
    if (!getDescription().equals(other.getDescription())) return false;
    if (!getDeprecatedApiNamesList().equals(other.getDeprecatedApiNamesList())) return false;
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
    hash = (37 * hash) + CUSTOM_DEFINITION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getCustomDefinition());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.DimensionMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.DimensionMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.DimensionMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.DimensionMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.DimensionMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.DimensionMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.DimensionMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.DimensionMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.DimensionMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.DimensionMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.DimensionMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.DimensionMetadata parseFrom(
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

  public static Builder newBuilder(com.google.analytics.data.v1alpha.DimensionMetadata prototype) {
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
   * Explains a dimension.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.DimensionMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.DimensionMetadata)
      com.google.analytics.data.v1alpha.DimensionMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_DimensionMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_DimensionMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.DimensionMetadata.class,
              com.google.analytics.data.v1alpha.DimensionMetadata.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.DimensionMetadata.newBuilder()
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
      customDefinition_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_DimensionMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.DimensionMetadata getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.DimensionMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.DimensionMetadata build() {
      com.google.analytics.data.v1alpha.DimensionMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.DimensionMetadata buildPartial() {
      com.google.analytics.data.v1alpha.DimensionMetadata result =
          new com.google.analytics.data.v1alpha.DimensionMetadata(this);
      int from_bitField0_ = bitField0_;
      result.apiName_ = apiName_;
      result.uiName_ = uiName_;
      result.description_ = description_;
      if (((bitField0_ & 0x00000001) != 0)) {
        deprecatedApiNames_ = deprecatedApiNames_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.deprecatedApiNames_ = deprecatedApiNames_;
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
      if (other instanceof com.google.analytics.data.v1alpha.DimensionMetadata) {
        return mergeFrom((com.google.analytics.data.v1alpha.DimensionMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.DimensionMetadata other) {
      if (other == com.google.analytics.data.v1alpha.DimensionMetadata.getDefaultInstance())
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
      com.google.analytics.data.v1alpha.DimensionMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.data.v1alpha.DimensionMetadata) e.getUnfinishedMessage();
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
     * This dimension's name. Useable in [Dimension](#Dimension)'s `name`. For
     * example, `eventName`.
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
     * This dimension's name. Useable in [Dimension](#Dimension)'s `name`. For
     * example, `eventName`.
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
     * This dimension's name. Useable in [Dimension](#Dimension)'s `name`. For
     * example, `eventName`.
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
     * This dimension's name. Useable in [Dimension](#Dimension)'s `name`. For
     * example, `eventName`.
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
     * This dimension's name. Useable in [Dimension](#Dimension)'s `name`. For
     * example, `eventName`.
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
     * This dimension's name within the Google Analytics user interface. For
     * example, `Event name`.
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
     * This dimension's name within the Google Analytics user interface. For
     * example, `Event name`.
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
     * This dimension's name within the Google Analytics user interface. For
     * example, `Event name`.
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
     * This dimension's name within the Google Analytics user interface. For
     * example, `Event name`.
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
     * This dimension's name within the Google Analytics user interface. For
     * example, `Event name`.
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
     * Description of how this dimension is used and calculated.
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
     * Description of how this dimension is used and calculated.
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
     * Description of how this dimension is used and calculated.
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
     * Description of how this dimension is used and calculated.
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
     * Description of how this dimension is used and calculated.
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
     * Still usable but deprecated names for this dimension. If populated, this
     * dimension is available by either `apiName` or one of `deprecatedApiNames`
     * for a period of time. After the deprecation period, the dimension will be
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
     * Still usable but deprecated names for this dimension. If populated, this
     * dimension is available by either `apiName` or one of `deprecatedApiNames`
     * for a period of time. After the deprecation period, the dimension will be
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
     * Still usable but deprecated names for this dimension. If populated, this
     * dimension is available by either `apiName` or one of `deprecatedApiNames`
     * for a period of time. After the deprecation period, the dimension will be
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
     * Still usable but deprecated names for this dimension. If populated, this
     * dimension is available by either `apiName` or one of `deprecatedApiNames`
     * for a period of time. After the deprecation period, the dimension will be
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
     * Still usable but deprecated names for this dimension. If populated, this
     * dimension is available by either `apiName` or one of `deprecatedApiNames`
     * for a period of time. After the deprecation period, the dimension will be
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
     * Still usable but deprecated names for this dimension. If populated, this
     * dimension is available by either `apiName` or one of `deprecatedApiNames`
     * for a period of time. After the deprecation period, the dimension will be
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
     * Still usable but deprecated names for this dimension. If populated, this
     * dimension is available by either `apiName` or one of `deprecatedApiNames`
     * for a period of time. After the deprecation period, the dimension will be
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
     * Still usable but deprecated names for this dimension. If populated, this
     * dimension is available by either `apiName` or one of `deprecatedApiNames`
     * for a period of time. After the deprecation period, the dimension will be
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
     * Still usable but deprecated names for this dimension. If populated, this
     * dimension is available by either `apiName` or one of `deprecatedApiNames`
     * for a period of time. After the deprecation period, the dimension will be
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

    private boolean customDefinition_;
    /**
     *
     *
     * <pre>
     * True if the dimension is a custom dimension for this property.
     * </pre>
     *
     * <code>bool custom_definition = 5;</code>
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
     * True if the dimension is a custom dimension for this property.
     * </pre>
     *
     * <code>bool custom_definition = 5;</code>
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
     * True if the dimension is a custom dimension for this property.
     * </pre>
     *
     * <code>bool custom_definition = 5;</code>
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.DimensionMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.DimensionMetadata)
  private static final com.google.analytics.data.v1alpha.DimensionMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.DimensionMetadata();
  }

  public static com.google.analytics.data.v1alpha.DimensionMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DimensionMetadata> PARSER =
      new com.google.protobuf.AbstractParser<DimensionMetadata>() {
        @java.lang.Override
        public DimensionMetadata parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new DimensionMetadata(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<DimensionMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DimensionMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.DimensionMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
