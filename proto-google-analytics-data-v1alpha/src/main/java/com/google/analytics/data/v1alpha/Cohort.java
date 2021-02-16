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
 * Defines a cohort selection criteria. A cohort is a group of users who share
 * a common characteristic. For example, users with the same `firstTouchDate`
 * belong to the same cohort.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.Cohort}
 */
public final class Cohort extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.Cohort)
    CohortOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Cohort.newBuilder() to construct.
  private Cohort(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Cohort() {
    name_ = "";
    dimension_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Cohort();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Cohort(
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
              java.lang.String s = input.readStringRequireUtf8();

              dimension_ = s;
              break;
            }
          case 26:
            {
              com.google.analytics.data.v1alpha.DateRange.Builder subBuilder = null;
              if (dateRange_ != null) {
                subBuilder = dateRange_.toBuilder();
              }
              dateRange_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.DateRange.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(dateRange_);
                dateRange_ = subBuilder.buildPartial();
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
        .internal_static_google_analytics_data_v1alpha_Cohort_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_Cohort_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.Cohort.class,
            com.google.analytics.data.v1alpha.Cohort.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Assigns a name to this cohort. The dimension `cohort` is valued to this
   * name in a report response. If set, cannot begin with `cohort_` or
   * `RESERVED_`. If not set, cohorts are named by their zero based index
   * `cohort_0`, `cohort_1`, etc.
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
   * Assigns a name to this cohort. The dimension `cohort` is valued to this
   * name in a report response. If set, cannot begin with `cohort_` or
   * `RESERVED_`. If not set, cohorts are named by their zero based index
   * `cohort_0`, `cohort_1`, etc.
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

  public static final int DIMENSION_FIELD_NUMBER = 2;
  private volatile java.lang.Object dimension_;
  /**
   *
   *
   * <pre>
   * Dimension used by the cohort. Required and only supports `firstTouchDate`.
   * </pre>
   *
   * <code>string dimension = 2;</code>
   *
   * @return The dimension.
   */
  @java.lang.Override
  public java.lang.String getDimension() {
    java.lang.Object ref = dimension_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dimension_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Dimension used by the cohort. Required and only supports `firstTouchDate`.
   * </pre>
   *
   * <code>string dimension = 2;</code>
   *
   * @return The bytes for dimension.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDimensionBytes() {
    java.lang.Object ref = dimension_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      dimension_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATE_RANGE_FIELD_NUMBER = 3;
  private com.google.analytics.data.v1alpha.DateRange dateRange_;
  /**
   *
   *
   * <pre>
   * The cohort selects users whose first touch date is between start date and
   * end date defined in the `dateRange`. This `dateRange` does not specify the
   * full date range of event data that is present in a cohort report. In a
   * cohort report, this `dateRange` is extended by the granularity and offset
   * present in the `cohortsRange`; event data for the extended reporting date
   * range is present in a cohort report.
   * In a cohort request, this `dateRange` is required and the `dateRanges` in
   * the `RunReportRequest` or `RunPivotReportRequest` must be unspecified.
   * This `dateRange` should generally be aligned with the cohort's granularity.
   * If `CohortsRange` uses daily granularity, this `dateRange` can be a single
   * day. If `CohortsRange` uses weekly granularity, this `dateRange` can be
   * aligned to a week boundary, starting at Sunday and ending Saturday. If
   * `CohortsRange` uses monthly granularity, this `dateRange` can be aligned to
   * a month, starting at the first and ending on the last day of the month.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.DateRange date_range = 3;</code>
   *
   * @return Whether the dateRange field is set.
   */
  @java.lang.Override
  public boolean hasDateRange() {
    return dateRange_ != null;
  }
  /**
   *
   *
   * <pre>
   * The cohort selects users whose first touch date is between start date and
   * end date defined in the `dateRange`. This `dateRange` does not specify the
   * full date range of event data that is present in a cohort report. In a
   * cohort report, this `dateRange` is extended by the granularity and offset
   * present in the `cohortsRange`; event data for the extended reporting date
   * range is present in a cohort report.
   * In a cohort request, this `dateRange` is required and the `dateRanges` in
   * the `RunReportRequest` or `RunPivotReportRequest` must be unspecified.
   * This `dateRange` should generally be aligned with the cohort's granularity.
   * If `CohortsRange` uses daily granularity, this `dateRange` can be a single
   * day. If `CohortsRange` uses weekly granularity, this `dateRange` can be
   * aligned to a week boundary, starting at Sunday and ending Saturday. If
   * `CohortsRange` uses monthly granularity, this `dateRange` can be aligned to
   * a month, starting at the first and ending on the last day of the month.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.DateRange date_range = 3;</code>
   *
   * @return The dateRange.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.DateRange getDateRange() {
    return dateRange_ == null
        ? com.google.analytics.data.v1alpha.DateRange.getDefaultInstance()
        : dateRange_;
  }
  /**
   *
   *
   * <pre>
   * The cohort selects users whose first touch date is between start date and
   * end date defined in the `dateRange`. This `dateRange` does not specify the
   * full date range of event data that is present in a cohort report. In a
   * cohort report, this `dateRange` is extended by the granularity and offset
   * present in the `cohortsRange`; event data for the extended reporting date
   * range is present in a cohort report.
   * In a cohort request, this `dateRange` is required and the `dateRanges` in
   * the `RunReportRequest` or `RunPivotReportRequest` must be unspecified.
   * This `dateRange` should generally be aligned with the cohort's granularity.
   * If `CohortsRange` uses daily granularity, this `dateRange` can be a single
   * day. If `CohortsRange` uses weekly granularity, this `dateRange` can be
   * aligned to a week boundary, starting at Sunday and ending Saturday. If
   * `CohortsRange` uses monthly granularity, this `dateRange` can be aligned to
   * a month, starting at the first and ending on the last day of the month.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.DateRange date_range = 3;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.DateRangeOrBuilder getDateRangeOrBuilder() {
    return getDateRange();
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
    if (!getDimensionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dimension_);
    }
    if (dateRange_ != null) {
      output.writeMessage(3, getDateRange());
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
    if (!getDimensionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dimension_);
    }
    if (dateRange_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getDateRange());
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.Cohort)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.Cohort other = (com.google.analytics.data.v1alpha.Cohort) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getDimension().equals(other.getDimension())) return false;
    if (hasDateRange() != other.hasDateRange()) return false;
    if (hasDateRange()) {
      if (!getDateRange().equals(other.getDateRange())) return false;
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
    hash = (37 * hash) + DIMENSION_FIELD_NUMBER;
    hash = (53 * hash) + getDimension().hashCode();
    if (hasDateRange()) {
      hash = (37 * hash) + DATE_RANGE_FIELD_NUMBER;
      hash = (53 * hash) + getDateRange().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.Cohort parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.Cohort parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Cohort parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.Cohort parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Cohort parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.Cohort parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Cohort parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.Cohort parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Cohort parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.Cohort parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Cohort parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.Cohort parseFrom(
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

  public static Builder newBuilder(com.google.analytics.data.v1alpha.Cohort prototype) {
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
   * Defines a cohort selection criteria. A cohort is a group of users who share
   * a common characteristic. For example, users with the same `firstTouchDate`
   * belong to the same cohort.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.Cohort}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.Cohort)
      com.google.analytics.data.v1alpha.CohortOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_Cohort_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_Cohort_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.Cohort.class,
              com.google.analytics.data.v1alpha.Cohort.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.Cohort.newBuilder()
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

      dimension_ = "";

      if (dateRangeBuilder_ == null) {
        dateRange_ = null;
      } else {
        dateRange_ = null;
        dateRangeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_Cohort_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Cohort getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.Cohort.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Cohort build() {
      com.google.analytics.data.v1alpha.Cohort result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Cohort buildPartial() {
      com.google.analytics.data.v1alpha.Cohort result =
          new com.google.analytics.data.v1alpha.Cohort(this);
      result.name_ = name_;
      result.dimension_ = dimension_;
      if (dateRangeBuilder_ == null) {
        result.dateRange_ = dateRange_;
      } else {
        result.dateRange_ = dateRangeBuilder_.build();
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
      if (other instanceof com.google.analytics.data.v1alpha.Cohort) {
        return mergeFrom((com.google.analytics.data.v1alpha.Cohort) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.Cohort other) {
      if (other == com.google.analytics.data.v1alpha.Cohort.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getDimension().isEmpty()) {
        dimension_ = other.dimension_;
        onChanged();
      }
      if (other.hasDateRange()) {
        mergeDateRange(other.getDateRange());
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
      com.google.analytics.data.v1alpha.Cohort parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.analytics.data.v1alpha.Cohort) e.getUnfinishedMessage();
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
     * Assigns a name to this cohort. The dimension `cohort` is valued to this
     * name in a report response. If set, cannot begin with `cohort_` or
     * `RESERVED_`. If not set, cohorts are named by their zero based index
     * `cohort_0`, `cohort_1`, etc.
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
     * Assigns a name to this cohort. The dimension `cohort` is valued to this
     * name in a report response. If set, cannot begin with `cohort_` or
     * `RESERVED_`. If not set, cohorts are named by their zero based index
     * `cohort_0`, `cohort_1`, etc.
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
     * Assigns a name to this cohort. The dimension `cohort` is valued to this
     * name in a report response. If set, cannot begin with `cohort_` or
     * `RESERVED_`. If not set, cohorts are named by their zero based index
     * `cohort_0`, `cohort_1`, etc.
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
     * Assigns a name to this cohort. The dimension `cohort` is valued to this
     * name in a report response. If set, cannot begin with `cohort_` or
     * `RESERVED_`. If not set, cohorts are named by their zero based index
     * `cohort_0`, `cohort_1`, etc.
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
     * Assigns a name to this cohort. The dimension `cohort` is valued to this
     * name in a report response. If set, cannot begin with `cohort_` or
     * `RESERVED_`. If not set, cohorts are named by their zero based index
     * `cohort_0`, `cohort_1`, etc.
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

    private java.lang.Object dimension_ = "";
    /**
     *
     *
     * <pre>
     * Dimension used by the cohort. Required and only supports `firstTouchDate`.
     * </pre>
     *
     * <code>string dimension = 2;</code>
     *
     * @return The dimension.
     */
    public java.lang.String getDimension() {
      java.lang.Object ref = dimension_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dimension_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Dimension used by the cohort. Required and only supports `firstTouchDate`.
     * </pre>
     *
     * <code>string dimension = 2;</code>
     *
     * @return The bytes for dimension.
     */
    public com.google.protobuf.ByteString getDimensionBytes() {
      java.lang.Object ref = dimension_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        dimension_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Dimension used by the cohort. Required and only supports `firstTouchDate`.
     * </pre>
     *
     * <code>string dimension = 2;</code>
     *
     * @param value The dimension to set.
     * @return This builder for chaining.
     */
    public Builder setDimension(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      dimension_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Dimension used by the cohort. Required and only supports `firstTouchDate`.
     * </pre>
     *
     * <code>string dimension = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDimension() {

      dimension_ = getDefaultInstance().getDimension();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Dimension used by the cohort. Required and only supports `firstTouchDate`.
     * </pre>
     *
     * <code>string dimension = 2;</code>
     *
     * @param value The bytes for dimension to set.
     * @return This builder for chaining.
     */
    public Builder setDimensionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      dimension_ = value;
      onChanged();
      return this;
    }

    private com.google.analytics.data.v1alpha.DateRange dateRange_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.DateRange,
            com.google.analytics.data.v1alpha.DateRange.Builder,
            com.google.analytics.data.v1alpha.DateRangeOrBuilder>
        dateRangeBuilder_;
    /**
     *
     *
     * <pre>
     * The cohort selects users whose first touch date is between start date and
     * end date defined in the `dateRange`. This `dateRange` does not specify the
     * full date range of event data that is present in a cohort report. In a
     * cohort report, this `dateRange` is extended by the granularity and offset
     * present in the `cohortsRange`; event data for the extended reporting date
     * range is present in a cohort report.
     * In a cohort request, this `dateRange` is required and the `dateRanges` in
     * the `RunReportRequest` or `RunPivotReportRequest` must be unspecified.
     * This `dateRange` should generally be aligned with the cohort's granularity.
     * If `CohortsRange` uses daily granularity, this `dateRange` can be a single
     * day. If `CohortsRange` uses weekly granularity, this `dateRange` can be
     * aligned to a week boundary, starting at Sunday and ending Saturday. If
     * `CohortsRange` uses monthly granularity, this `dateRange` can be aligned to
     * a month, starting at the first and ending on the last day of the month.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DateRange date_range = 3;</code>
     *
     * @return Whether the dateRange field is set.
     */
    public boolean hasDateRange() {
      return dateRangeBuilder_ != null || dateRange_ != null;
    }
    /**
     *
     *
     * <pre>
     * The cohort selects users whose first touch date is between start date and
     * end date defined in the `dateRange`. This `dateRange` does not specify the
     * full date range of event data that is present in a cohort report. In a
     * cohort report, this `dateRange` is extended by the granularity and offset
     * present in the `cohortsRange`; event data for the extended reporting date
     * range is present in a cohort report.
     * In a cohort request, this `dateRange` is required and the `dateRanges` in
     * the `RunReportRequest` or `RunPivotReportRequest` must be unspecified.
     * This `dateRange` should generally be aligned with the cohort's granularity.
     * If `CohortsRange` uses daily granularity, this `dateRange` can be a single
     * day. If `CohortsRange` uses weekly granularity, this `dateRange` can be
     * aligned to a week boundary, starting at Sunday and ending Saturday. If
     * `CohortsRange` uses monthly granularity, this `dateRange` can be aligned to
     * a month, starting at the first and ending on the last day of the month.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DateRange date_range = 3;</code>
     *
     * @return The dateRange.
     */
    public com.google.analytics.data.v1alpha.DateRange getDateRange() {
      if (dateRangeBuilder_ == null) {
        return dateRange_ == null
            ? com.google.analytics.data.v1alpha.DateRange.getDefaultInstance()
            : dateRange_;
      } else {
        return dateRangeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The cohort selects users whose first touch date is between start date and
     * end date defined in the `dateRange`. This `dateRange` does not specify the
     * full date range of event data that is present in a cohort report. In a
     * cohort report, this `dateRange` is extended by the granularity and offset
     * present in the `cohortsRange`; event data for the extended reporting date
     * range is present in a cohort report.
     * In a cohort request, this `dateRange` is required and the `dateRanges` in
     * the `RunReportRequest` or `RunPivotReportRequest` must be unspecified.
     * This `dateRange` should generally be aligned with the cohort's granularity.
     * If `CohortsRange` uses daily granularity, this `dateRange` can be a single
     * day. If `CohortsRange` uses weekly granularity, this `dateRange` can be
     * aligned to a week boundary, starting at Sunday and ending Saturday. If
     * `CohortsRange` uses monthly granularity, this `dateRange` can be aligned to
     * a month, starting at the first and ending on the last day of the month.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DateRange date_range = 3;</code>
     */
    public Builder setDateRange(com.google.analytics.data.v1alpha.DateRange value) {
      if (dateRangeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dateRange_ = value;
        onChanged();
      } else {
        dateRangeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The cohort selects users whose first touch date is between start date and
     * end date defined in the `dateRange`. This `dateRange` does not specify the
     * full date range of event data that is present in a cohort report. In a
     * cohort report, this `dateRange` is extended by the granularity and offset
     * present in the `cohortsRange`; event data for the extended reporting date
     * range is present in a cohort report.
     * In a cohort request, this `dateRange` is required and the `dateRanges` in
     * the `RunReportRequest` or `RunPivotReportRequest` must be unspecified.
     * This `dateRange` should generally be aligned with the cohort's granularity.
     * If `CohortsRange` uses daily granularity, this `dateRange` can be a single
     * day. If `CohortsRange` uses weekly granularity, this `dateRange` can be
     * aligned to a week boundary, starting at Sunday and ending Saturday. If
     * `CohortsRange` uses monthly granularity, this `dateRange` can be aligned to
     * a month, starting at the first and ending on the last day of the month.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DateRange date_range = 3;</code>
     */
    public Builder setDateRange(
        com.google.analytics.data.v1alpha.DateRange.Builder builderForValue) {
      if (dateRangeBuilder_ == null) {
        dateRange_ = builderForValue.build();
        onChanged();
      } else {
        dateRangeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The cohort selects users whose first touch date is between start date and
     * end date defined in the `dateRange`. This `dateRange` does not specify the
     * full date range of event data that is present in a cohort report. In a
     * cohort report, this `dateRange` is extended by the granularity and offset
     * present in the `cohortsRange`; event data for the extended reporting date
     * range is present in a cohort report.
     * In a cohort request, this `dateRange` is required and the `dateRanges` in
     * the `RunReportRequest` or `RunPivotReportRequest` must be unspecified.
     * This `dateRange` should generally be aligned with the cohort's granularity.
     * If `CohortsRange` uses daily granularity, this `dateRange` can be a single
     * day. If `CohortsRange` uses weekly granularity, this `dateRange` can be
     * aligned to a week boundary, starting at Sunday and ending Saturday. If
     * `CohortsRange` uses monthly granularity, this `dateRange` can be aligned to
     * a month, starting at the first and ending on the last day of the month.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DateRange date_range = 3;</code>
     */
    public Builder mergeDateRange(com.google.analytics.data.v1alpha.DateRange value) {
      if (dateRangeBuilder_ == null) {
        if (dateRange_ != null) {
          dateRange_ =
              com.google.analytics.data.v1alpha.DateRange.newBuilder(dateRange_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          dateRange_ = value;
        }
        onChanged();
      } else {
        dateRangeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The cohort selects users whose first touch date is between start date and
     * end date defined in the `dateRange`. This `dateRange` does not specify the
     * full date range of event data that is present in a cohort report. In a
     * cohort report, this `dateRange` is extended by the granularity and offset
     * present in the `cohortsRange`; event data for the extended reporting date
     * range is present in a cohort report.
     * In a cohort request, this `dateRange` is required and the `dateRanges` in
     * the `RunReportRequest` or `RunPivotReportRequest` must be unspecified.
     * This `dateRange` should generally be aligned with the cohort's granularity.
     * If `CohortsRange` uses daily granularity, this `dateRange` can be a single
     * day. If `CohortsRange` uses weekly granularity, this `dateRange` can be
     * aligned to a week boundary, starting at Sunday and ending Saturday. If
     * `CohortsRange` uses monthly granularity, this `dateRange` can be aligned to
     * a month, starting at the first and ending on the last day of the month.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DateRange date_range = 3;</code>
     */
    public Builder clearDateRange() {
      if (dateRangeBuilder_ == null) {
        dateRange_ = null;
        onChanged();
      } else {
        dateRange_ = null;
        dateRangeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The cohort selects users whose first touch date is between start date and
     * end date defined in the `dateRange`. This `dateRange` does not specify the
     * full date range of event data that is present in a cohort report. In a
     * cohort report, this `dateRange` is extended by the granularity and offset
     * present in the `cohortsRange`; event data for the extended reporting date
     * range is present in a cohort report.
     * In a cohort request, this `dateRange` is required and the `dateRanges` in
     * the `RunReportRequest` or `RunPivotReportRequest` must be unspecified.
     * This `dateRange` should generally be aligned with the cohort's granularity.
     * If `CohortsRange` uses daily granularity, this `dateRange` can be a single
     * day. If `CohortsRange` uses weekly granularity, this `dateRange` can be
     * aligned to a week boundary, starting at Sunday and ending Saturday. If
     * `CohortsRange` uses monthly granularity, this `dateRange` can be aligned to
     * a month, starting at the first and ending on the last day of the month.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DateRange date_range = 3;</code>
     */
    public com.google.analytics.data.v1alpha.DateRange.Builder getDateRangeBuilder() {

      onChanged();
      return getDateRangeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The cohort selects users whose first touch date is between start date and
     * end date defined in the `dateRange`. This `dateRange` does not specify the
     * full date range of event data that is present in a cohort report. In a
     * cohort report, this `dateRange` is extended by the granularity and offset
     * present in the `cohortsRange`; event data for the extended reporting date
     * range is present in a cohort report.
     * In a cohort request, this `dateRange` is required and the `dateRanges` in
     * the `RunReportRequest` or `RunPivotReportRequest` must be unspecified.
     * This `dateRange` should generally be aligned with the cohort's granularity.
     * If `CohortsRange` uses daily granularity, this `dateRange` can be a single
     * day. If `CohortsRange` uses weekly granularity, this `dateRange` can be
     * aligned to a week boundary, starting at Sunday and ending Saturday. If
     * `CohortsRange` uses monthly granularity, this `dateRange` can be aligned to
     * a month, starting at the first and ending on the last day of the month.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DateRange date_range = 3;</code>
     */
    public com.google.analytics.data.v1alpha.DateRangeOrBuilder getDateRangeOrBuilder() {
      if (dateRangeBuilder_ != null) {
        return dateRangeBuilder_.getMessageOrBuilder();
      } else {
        return dateRange_ == null
            ? com.google.analytics.data.v1alpha.DateRange.getDefaultInstance()
            : dateRange_;
      }
    }
    /**
     *
     *
     * <pre>
     * The cohort selects users whose first touch date is between start date and
     * end date defined in the `dateRange`. This `dateRange` does not specify the
     * full date range of event data that is present in a cohort report. In a
     * cohort report, this `dateRange` is extended by the granularity and offset
     * present in the `cohortsRange`; event data for the extended reporting date
     * range is present in a cohort report.
     * In a cohort request, this `dateRange` is required and the `dateRanges` in
     * the `RunReportRequest` or `RunPivotReportRequest` must be unspecified.
     * This `dateRange` should generally be aligned with the cohort's granularity.
     * If `CohortsRange` uses daily granularity, this `dateRange` can be a single
     * day. If `CohortsRange` uses weekly granularity, this `dateRange` can be
     * aligned to a week boundary, starting at Sunday and ending Saturday. If
     * `CohortsRange` uses monthly granularity, this `dateRange` can be aligned to
     * a month, starting at the first and ending on the last day of the month.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.DateRange date_range = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.DateRange,
            com.google.analytics.data.v1alpha.DateRange.Builder,
            com.google.analytics.data.v1alpha.DateRangeOrBuilder>
        getDateRangeFieldBuilder() {
      if (dateRangeBuilder_ == null) {
        dateRangeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.DateRange,
                com.google.analytics.data.v1alpha.DateRange.Builder,
                com.google.analytics.data.v1alpha.DateRangeOrBuilder>(
                getDateRange(), getParentForChildren(), isClean());
        dateRange_ = null;
      }
      return dateRangeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.Cohort)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.Cohort)
  private static final com.google.analytics.data.v1alpha.Cohort DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.Cohort();
  }

  public static com.google.analytics.data.v1alpha.Cohort getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Cohort> PARSER =
      new com.google.protobuf.AbstractParser<Cohort>() {
        @java.lang.Override
        public Cohort parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Cohort(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Cohort> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Cohort> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.Cohort getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
