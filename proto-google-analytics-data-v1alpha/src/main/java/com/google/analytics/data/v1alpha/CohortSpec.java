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
 * Specification of cohorts for a cohort report.
 * Cohort reports can be used for example to create a time series of user
 * retention for the cohort. For example, you could select the cohort of users
 * that were acquired in the first week of September and follow that cohort for
 * the next six weeks. Selecting the users acquired in the first week of
 * September cohort is specified in the `cohort` object. Following that
 * cohort for the next six weeks is specified in the `cohortsRange` object.
 * The report response could show a weekly time series where say your app has
 * retained 60% of this cohort after three weeks and 25% of this cohort after
 * six weeks. These two percentages can be calculated by the metric
 * `cohortActiveUsers/cohortTotalUsers` and will be separate rows in the report.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.CohortSpec}
 */
public final class CohortSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.CohortSpec)
    CohortSpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CohortSpec.newBuilder() to construct.
  private CohortSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CohortSpec() {
    cohorts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CohortSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CohortSpec(
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
                cohorts_ = new java.util.ArrayList<com.google.analytics.data.v1alpha.Cohort>();
                mutable_bitField0_ |= 0x00000001;
              }
              cohorts_.add(
                  input.readMessage(
                      com.google.analytics.data.v1alpha.Cohort.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              com.google.analytics.data.v1alpha.CohortsRange.Builder subBuilder = null;
              if (cohortsRange_ != null) {
                subBuilder = cohortsRange_.toBuilder();
              }
              cohortsRange_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.CohortsRange.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(cohortsRange_);
                cohortsRange_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              com.google.analytics.data.v1alpha.CohortReportSettings.Builder subBuilder = null;
              if (cohortReportSettings_ != null) {
                subBuilder = cohortReportSettings_.toBuilder();
              }
              cohortReportSettings_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.CohortReportSettings.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(cohortReportSettings_);
                cohortReportSettings_ = subBuilder.buildPartial();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        cohorts_ = java.util.Collections.unmodifiableList(cohorts_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_CohortSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_CohortSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.CohortSpec.class,
            com.google.analytics.data.v1alpha.CohortSpec.Builder.class);
  }

  public static final int COHORTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.analytics.data.v1alpha.Cohort> cohorts_;
  /**
   *
   *
   * <pre>
   * Defines the selection criteria to group users into cohorts.
   * Most cohort reports define only a single cohort. If multiple cohorts are
   * specified, each cohort can be recognized in the report by their name.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1alpha.Cohort> getCohortsList() {
    return cohorts_;
  }
  /**
   *
   *
   * <pre>
   * Defines the selection criteria to group users into cohorts.
   * Most cohort reports define only a single cohort. If multiple cohorts are
   * specified, each cohort can be recognized in the report by their name.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.data.v1alpha.CohortOrBuilder>
      getCohortsOrBuilderList() {
    return cohorts_;
  }
  /**
   *
   *
   * <pre>
   * Defines the selection criteria to group users into cohorts.
   * Most cohort reports define only a single cohort. If multiple cohorts are
   * specified, each cohort can be recognized in the report by their name.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
   */
  @java.lang.Override
  public int getCohortsCount() {
    return cohorts_.size();
  }
  /**
   *
   *
   * <pre>
   * Defines the selection criteria to group users into cohorts.
   * Most cohort reports define only a single cohort. If multiple cohorts are
   * specified, each cohort can be recognized in the report by their name.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.Cohort getCohorts(int index) {
    return cohorts_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Defines the selection criteria to group users into cohorts.
   * Most cohort reports define only a single cohort. If multiple cohorts are
   * specified, each cohort can be recognized in the report by their name.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.CohortOrBuilder getCohortsOrBuilder(int index) {
    return cohorts_.get(index);
  }

  public static final int COHORTS_RANGE_FIELD_NUMBER = 2;
  private com.google.analytics.data.v1alpha.CohortsRange cohortsRange_;
  /**
   *
   *
   * <pre>
   * Cohort reports follow cohorts over an extended reporting date range. This
   * range specifies an offset duration to follow the cohorts over.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.CohortsRange cohorts_range = 2;</code>
   *
   * @return Whether the cohortsRange field is set.
   */
  @java.lang.Override
  public boolean hasCohortsRange() {
    return cohortsRange_ != null;
  }
  /**
   *
   *
   * <pre>
   * Cohort reports follow cohorts over an extended reporting date range. This
   * range specifies an offset duration to follow the cohorts over.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.CohortsRange cohorts_range = 2;</code>
   *
   * @return The cohortsRange.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.CohortsRange getCohortsRange() {
    return cohortsRange_ == null
        ? com.google.analytics.data.v1alpha.CohortsRange.getDefaultInstance()
        : cohortsRange_;
  }
  /**
   *
   *
   * <pre>
   * Cohort reports follow cohorts over an extended reporting date range. This
   * range specifies an offset duration to follow the cohorts over.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.CohortsRange cohorts_range = 2;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.CohortsRangeOrBuilder getCohortsRangeOrBuilder() {
    return getCohortsRange();
  }

  public static final int COHORT_REPORT_SETTINGS_FIELD_NUMBER = 3;
  private com.google.analytics.data.v1alpha.CohortReportSettings cohortReportSettings_;
  /**
   *
   *
   * <pre>
   * Optional settings for a cohort report.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.CohortReportSettings cohort_report_settings = 3;</code>
   *
   * @return Whether the cohortReportSettings field is set.
   */
  @java.lang.Override
  public boolean hasCohortReportSettings() {
    return cohortReportSettings_ != null;
  }
  /**
   *
   *
   * <pre>
   * Optional settings for a cohort report.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.CohortReportSettings cohort_report_settings = 3;</code>
   *
   * @return The cohortReportSettings.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.CohortReportSettings getCohortReportSettings() {
    return cohortReportSettings_ == null
        ? com.google.analytics.data.v1alpha.CohortReportSettings.getDefaultInstance()
        : cohortReportSettings_;
  }
  /**
   *
   *
   * <pre>
   * Optional settings for a cohort report.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.CohortReportSettings cohort_report_settings = 3;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.CohortReportSettingsOrBuilder
      getCohortReportSettingsOrBuilder() {
    return getCohortReportSettings();
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
    for (int i = 0; i < cohorts_.size(); i++) {
      output.writeMessage(1, cohorts_.get(i));
    }
    if (cohortsRange_ != null) {
      output.writeMessage(2, getCohortsRange());
    }
    if (cohortReportSettings_ != null) {
      output.writeMessage(3, getCohortReportSettings());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < cohorts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, cohorts_.get(i));
    }
    if (cohortsRange_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getCohortsRange());
    }
    if (cohortReportSettings_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(3, getCohortReportSettings());
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.CohortSpec)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.CohortSpec other =
        (com.google.analytics.data.v1alpha.CohortSpec) obj;

    if (!getCohortsList().equals(other.getCohortsList())) return false;
    if (hasCohortsRange() != other.hasCohortsRange()) return false;
    if (hasCohortsRange()) {
      if (!getCohortsRange().equals(other.getCohortsRange())) return false;
    }
    if (hasCohortReportSettings() != other.hasCohortReportSettings()) return false;
    if (hasCohortReportSettings()) {
      if (!getCohortReportSettings().equals(other.getCohortReportSettings())) return false;
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
    if (getCohortsCount() > 0) {
      hash = (37 * hash) + COHORTS_FIELD_NUMBER;
      hash = (53 * hash) + getCohortsList().hashCode();
    }
    if (hasCohortsRange()) {
      hash = (37 * hash) + COHORTS_RANGE_FIELD_NUMBER;
      hash = (53 * hash) + getCohortsRange().hashCode();
    }
    if (hasCohortReportSettings()) {
      hash = (37 * hash) + COHORT_REPORT_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getCohortReportSettings().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.CohortSpec parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.CohortSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.CohortSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.CohortSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.CohortSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.CohortSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.CohortSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.CohortSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.CohortSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.CohortSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.CohortSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.CohortSpec parseFrom(
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

  public static Builder newBuilder(com.google.analytics.data.v1alpha.CohortSpec prototype) {
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
   * Specification of cohorts for a cohort report.
   * Cohort reports can be used for example to create a time series of user
   * retention for the cohort. For example, you could select the cohort of users
   * that were acquired in the first week of September and follow that cohort for
   * the next six weeks. Selecting the users acquired in the first week of
   * September cohort is specified in the `cohort` object. Following that
   * cohort for the next six weeks is specified in the `cohortsRange` object.
   * The report response could show a weekly time series where say your app has
   * retained 60% of this cohort after three weeks and 25% of this cohort after
   * six weeks. These two percentages can be calculated by the metric
   * `cohortActiveUsers/cohortTotalUsers` and will be separate rows in the report.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.CohortSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.CohortSpec)
      com.google.analytics.data.v1alpha.CohortSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_CohortSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_CohortSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.CohortSpec.class,
              com.google.analytics.data.v1alpha.CohortSpec.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.CohortSpec.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getCohortsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (cohortsBuilder_ == null) {
        cohorts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        cohortsBuilder_.clear();
      }
      if (cohortsRangeBuilder_ == null) {
        cohortsRange_ = null;
      } else {
        cohortsRange_ = null;
        cohortsRangeBuilder_ = null;
      }
      if (cohortReportSettingsBuilder_ == null) {
        cohortReportSettings_ = null;
      } else {
        cohortReportSettings_ = null;
        cohortReportSettingsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_CohortSpec_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.CohortSpec getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.CohortSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.CohortSpec build() {
      com.google.analytics.data.v1alpha.CohortSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.CohortSpec buildPartial() {
      com.google.analytics.data.v1alpha.CohortSpec result =
          new com.google.analytics.data.v1alpha.CohortSpec(this);
      int from_bitField0_ = bitField0_;
      if (cohortsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          cohorts_ = java.util.Collections.unmodifiableList(cohorts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cohorts_ = cohorts_;
      } else {
        result.cohorts_ = cohortsBuilder_.build();
      }
      if (cohortsRangeBuilder_ == null) {
        result.cohortsRange_ = cohortsRange_;
      } else {
        result.cohortsRange_ = cohortsRangeBuilder_.build();
      }
      if (cohortReportSettingsBuilder_ == null) {
        result.cohortReportSettings_ = cohortReportSettings_;
      } else {
        result.cohortReportSettings_ = cohortReportSettingsBuilder_.build();
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
      if (other instanceof com.google.analytics.data.v1alpha.CohortSpec) {
        return mergeFrom((com.google.analytics.data.v1alpha.CohortSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.CohortSpec other) {
      if (other == com.google.analytics.data.v1alpha.CohortSpec.getDefaultInstance()) return this;
      if (cohortsBuilder_ == null) {
        if (!other.cohorts_.isEmpty()) {
          if (cohorts_.isEmpty()) {
            cohorts_ = other.cohorts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCohortsIsMutable();
            cohorts_.addAll(other.cohorts_);
          }
          onChanged();
        }
      } else {
        if (!other.cohorts_.isEmpty()) {
          if (cohortsBuilder_.isEmpty()) {
            cohortsBuilder_.dispose();
            cohortsBuilder_ = null;
            cohorts_ = other.cohorts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            cohortsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getCohortsFieldBuilder()
                    : null;
          } else {
            cohortsBuilder_.addAllMessages(other.cohorts_);
          }
        }
      }
      if (other.hasCohortsRange()) {
        mergeCohortsRange(other.getCohortsRange());
      }
      if (other.hasCohortReportSettings()) {
        mergeCohortReportSettings(other.getCohortReportSettings());
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
      com.google.analytics.data.v1alpha.CohortSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.analytics.data.v1alpha.CohortSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.analytics.data.v1alpha.Cohort> cohorts_ =
        java.util.Collections.emptyList();

    private void ensureCohortsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        cohorts_ = new java.util.ArrayList<com.google.analytics.data.v1alpha.Cohort>(cohorts_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.Cohort,
            com.google.analytics.data.v1alpha.Cohort.Builder,
            com.google.analytics.data.v1alpha.CohortOrBuilder>
        cohortsBuilder_;

    /**
     *
     *
     * <pre>
     * Defines the selection criteria to group users into cohorts.
     * Most cohort reports define only a single cohort. If multiple cohorts are
     * specified, each cohort can be recognized in the report by their name.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.Cohort> getCohortsList() {
      if (cohortsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(cohorts_);
      } else {
        return cohortsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Defines the selection criteria to group users into cohorts.
     * Most cohort reports define only a single cohort. If multiple cohorts are
     * specified, each cohort can be recognized in the report by their name.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
     */
    public int getCohortsCount() {
      if (cohortsBuilder_ == null) {
        return cohorts_.size();
      } else {
        return cohortsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Defines the selection criteria to group users into cohorts.
     * Most cohort reports define only a single cohort. If multiple cohorts are
     * specified, each cohort can be recognized in the report by their name.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
     */
    public com.google.analytics.data.v1alpha.Cohort getCohorts(int index) {
      if (cohortsBuilder_ == null) {
        return cohorts_.get(index);
      } else {
        return cohortsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Defines the selection criteria to group users into cohorts.
     * Most cohort reports define only a single cohort. If multiple cohorts are
     * specified, each cohort can be recognized in the report by their name.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
     */
    public Builder setCohorts(int index, com.google.analytics.data.v1alpha.Cohort value) {
      if (cohortsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCohortsIsMutable();
        cohorts_.set(index, value);
        onChanged();
      } else {
        cohortsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines the selection criteria to group users into cohorts.
     * Most cohort reports define only a single cohort. If multiple cohorts are
     * specified, each cohort can be recognized in the report by their name.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
     */
    public Builder setCohorts(
        int index, com.google.analytics.data.v1alpha.Cohort.Builder builderForValue) {
      if (cohortsBuilder_ == null) {
        ensureCohortsIsMutable();
        cohorts_.set(index, builderForValue.build());
        onChanged();
      } else {
        cohortsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines the selection criteria to group users into cohorts.
     * Most cohort reports define only a single cohort. If multiple cohorts are
     * specified, each cohort can be recognized in the report by their name.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
     */
    public Builder addCohorts(com.google.analytics.data.v1alpha.Cohort value) {
      if (cohortsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCohortsIsMutable();
        cohorts_.add(value);
        onChanged();
      } else {
        cohortsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines the selection criteria to group users into cohorts.
     * Most cohort reports define only a single cohort. If multiple cohorts are
     * specified, each cohort can be recognized in the report by their name.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
     */
    public Builder addCohorts(int index, com.google.analytics.data.v1alpha.Cohort value) {
      if (cohortsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCohortsIsMutable();
        cohorts_.add(index, value);
        onChanged();
      } else {
        cohortsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines the selection criteria to group users into cohorts.
     * Most cohort reports define only a single cohort. If multiple cohorts are
     * specified, each cohort can be recognized in the report by their name.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
     */
    public Builder addCohorts(com.google.analytics.data.v1alpha.Cohort.Builder builderForValue) {
      if (cohortsBuilder_ == null) {
        ensureCohortsIsMutable();
        cohorts_.add(builderForValue.build());
        onChanged();
      } else {
        cohortsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines the selection criteria to group users into cohorts.
     * Most cohort reports define only a single cohort. If multiple cohorts are
     * specified, each cohort can be recognized in the report by their name.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
     */
    public Builder addCohorts(
        int index, com.google.analytics.data.v1alpha.Cohort.Builder builderForValue) {
      if (cohortsBuilder_ == null) {
        ensureCohortsIsMutable();
        cohorts_.add(index, builderForValue.build());
        onChanged();
      } else {
        cohortsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines the selection criteria to group users into cohorts.
     * Most cohort reports define only a single cohort. If multiple cohorts are
     * specified, each cohort can be recognized in the report by their name.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
     */
    public Builder addAllCohorts(
        java.lang.Iterable<? extends com.google.analytics.data.v1alpha.Cohort> values) {
      if (cohortsBuilder_ == null) {
        ensureCohortsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, cohorts_);
        onChanged();
      } else {
        cohortsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines the selection criteria to group users into cohorts.
     * Most cohort reports define only a single cohort. If multiple cohorts are
     * specified, each cohort can be recognized in the report by their name.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
     */
    public Builder clearCohorts() {
      if (cohortsBuilder_ == null) {
        cohorts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        cohortsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines the selection criteria to group users into cohorts.
     * Most cohort reports define only a single cohort. If multiple cohorts are
     * specified, each cohort can be recognized in the report by their name.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
     */
    public Builder removeCohorts(int index) {
      if (cohortsBuilder_ == null) {
        ensureCohortsIsMutable();
        cohorts_.remove(index);
        onChanged();
      } else {
        cohortsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines the selection criteria to group users into cohorts.
     * Most cohort reports define only a single cohort. If multiple cohorts are
     * specified, each cohort can be recognized in the report by their name.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
     */
    public com.google.analytics.data.v1alpha.Cohort.Builder getCohortsBuilder(int index) {
      return getCohortsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Defines the selection criteria to group users into cohorts.
     * Most cohort reports define only a single cohort. If multiple cohorts are
     * specified, each cohort can be recognized in the report by their name.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
     */
    public com.google.analytics.data.v1alpha.CohortOrBuilder getCohortsOrBuilder(int index) {
      if (cohortsBuilder_ == null) {
        return cohorts_.get(index);
      } else {
        return cohortsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Defines the selection criteria to group users into cohorts.
     * Most cohort reports define only a single cohort. If multiple cohorts are
     * specified, each cohort can be recognized in the report by their name.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
     */
    public java.util.List<? extends com.google.analytics.data.v1alpha.CohortOrBuilder>
        getCohortsOrBuilderList() {
      if (cohortsBuilder_ != null) {
        return cohortsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(cohorts_);
      }
    }
    /**
     *
     *
     * <pre>
     * Defines the selection criteria to group users into cohorts.
     * Most cohort reports define only a single cohort. If multiple cohorts are
     * specified, each cohort can be recognized in the report by their name.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
     */
    public com.google.analytics.data.v1alpha.Cohort.Builder addCohortsBuilder() {
      return getCohortsFieldBuilder()
          .addBuilder(com.google.analytics.data.v1alpha.Cohort.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Defines the selection criteria to group users into cohorts.
     * Most cohort reports define only a single cohort. If multiple cohorts are
     * specified, each cohort can be recognized in the report by their name.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
     */
    public com.google.analytics.data.v1alpha.Cohort.Builder addCohortsBuilder(int index) {
      return getCohortsFieldBuilder()
          .addBuilder(index, com.google.analytics.data.v1alpha.Cohort.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Defines the selection criteria to group users into cohorts.
     * Most cohort reports define only a single cohort. If multiple cohorts are
     * specified, each cohort can be recognized in the report by their name.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.Cohort.Builder>
        getCohortsBuilderList() {
      return getCohortsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.Cohort,
            com.google.analytics.data.v1alpha.Cohort.Builder,
            com.google.analytics.data.v1alpha.CohortOrBuilder>
        getCohortsFieldBuilder() {
      if (cohortsBuilder_ == null) {
        cohortsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.data.v1alpha.Cohort,
                com.google.analytics.data.v1alpha.Cohort.Builder,
                com.google.analytics.data.v1alpha.CohortOrBuilder>(
                cohorts_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        cohorts_ = null;
      }
      return cohortsBuilder_;
    }

    private com.google.analytics.data.v1alpha.CohortsRange cohortsRange_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.CohortsRange,
            com.google.analytics.data.v1alpha.CohortsRange.Builder,
            com.google.analytics.data.v1alpha.CohortsRangeOrBuilder>
        cohortsRangeBuilder_;
    /**
     *
     *
     * <pre>
     * Cohort reports follow cohorts over an extended reporting date range. This
     * range specifies an offset duration to follow the cohorts over.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.CohortsRange cohorts_range = 2;</code>
     *
     * @return Whether the cohortsRange field is set.
     */
    public boolean hasCohortsRange() {
      return cohortsRangeBuilder_ != null || cohortsRange_ != null;
    }
    /**
     *
     *
     * <pre>
     * Cohort reports follow cohorts over an extended reporting date range. This
     * range specifies an offset duration to follow the cohorts over.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.CohortsRange cohorts_range = 2;</code>
     *
     * @return The cohortsRange.
     */
    public com.google.analytics.data.v1alpha.CohortsRange getCohortsRange() {
      if (cohortsRangeBuilder_ == null) {
        return cohortsRange_ == null
            ? com.google.analytics.data.v1alpha.CohortsRange.getDefaultInstance()
            : cohortsRange_;
      } else {
        return cohortsRangeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Cohort reports follow cohorts over an extended reporting date range. This
     * range specifies an offset duration to follow the cohorts over.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.CohortsRange cohorts_range = 2;</code>
     */
    public Builder setCohortsRange(com.google.analytics.data.v1alpha.CohortsRange value) {
      if (cohortsRangeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cohortsRange_ = value;
        onChanged();
      } else {
        cohortsRangeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Cohort reports follow cohorts over an extended reporting date range. This
     * range specifies an offset duration to follow the cohorts over.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.CohortsRange cohorts_range = 2;</code>
     */
    public Builder setCohortsRange(
        com.google.analytics.data.v1alpha.CohortsRange.Builder builderForValue) {
      if (cohortsRangeBuilder_ == null) {
        cohortsRange_ = builderForValue.build();
        onChanged();
      } else {
        cohortsRangeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Cohort reports follow cohorts over an extended reporting date range. This
     * range specifies an offset duration to follow the cohorts over.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.CohortsRange cohorts_range = 2;</code>
     */
    public Builder mergeCohortsRange(com.google.analytics.data.v1alpha.CohortsRange value) {
      if (cohortsRangeBuilder_ == null) {
        if (cohortsRange_ != null) {
          cohortsRange_ =
              com.google.analytics.data.v1alpha.CohortsRange.newBuilder(cohortsRange_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          cohortsRange_ = value;
        }
        onChanged();
      } else {
        cohortsRangeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Cohort reports follow cohorts over an extended reporting date range. This
     * range specifies an offset duration to follow the cohorts over.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.CohortsRange cohorts_range = 2;</code>
     */
    public Builder clearCohortsRange() {
      if (cohortsRangeBuilder_ == null) {
        cohortsRange_ = null;
        onChanged();
      } else {
        cohortsRange_ = null;
        cohortsRangeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Cohort reports follow cohorts over an extended reporting date range. This
     * range specifies an offset duration to follow the cohorts over.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.CohortsRange cohorts_range = 2;</code>
     */
    public com.google.analytics.data.v1alpha.CohortsRange.Builder getCohortsRangeBuilder() {

      onChanged();
      return getCohortsRangeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Cohort reports follow cohorts over an extended reporting date range. This
     * range specifies an offset duration to follow the cohorts over.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.CohortsRange cohorts_range = 2;</code>
     */
    public com.google.analytics.data.v1alpha.CohortsRangeOrBuilder getCohortsRangeOrBuilder() {
      if (cohortsRangeBuilder_ != null) {
        return cohortsRangeBuilder_.getMessageOrBuilder();
      } else {
        return cohortsRange_ == null
            ? com.google.analytics.data.v1alpha.CohortsRange.getDefaultInstance()
            : cohortsRange_;
      }
    }
    /**
     *
     *
     * <pre>
     * Cohort reports follow cohorts over an extended reporting date range. This
     * range specifies an offset duration to follow the cohorts over.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.CohortsRange cohorts_range = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.CohortsRange,
            com.google.analytics.data.v1alpha.CohortsRange.Builder,
            com.google.analytics.data.v1alpha.CohortsRangeOrBuilder>
        getCohortsRangeFieldBuilder() {
      if (cohortsRangeBuilder_ == null) {
        cohortsRangeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.CohortsRange,
                com.google.analytics.data.v1alpha.CohortsRange.Builder,
                com.google.analytics.data.v1alpha.CohortsRangeOrBuilder>(
                getCohortsRange(), getParentForChildren(), isClean());
        cohortsRange_ = null;
      }
      return cohortsRangeBuilder_;
    }

    private com.google.analytics.data.v1alpha.CohortReportSettings cohortReportSettings_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.CohortReportSettings,
            com.google.analytics.data.v1alpha.CohortReportSettings.Builder,
            com.google.analytics.data.v1alpha.CohortReportSettingsOrBuilder>
        cohortReportSettingsBuilder_;
    /**
     *
     *
     * <pre>
     * Optional settings for a cohort report.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.CohortReportSettings cohort_report_settings = 3;</code>
     *
     * @return Whether the cohortReportSettings field is set.
     */
    public boolean hasCohortReportSettings() {
      return cohortReportSettingsBuilder_ != null || cohortReportSettings_ != null;
    }
    /**
     *
     *
     * <pre>
     * Optional settings for a cohort report.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.CohortReportSettings cohort_report_settings = 3;</code>
     *
     * @return The cohortReportSettings.
     */
    public com.google.analytics.data.v1alpha.CohortReportSettings getCohortReportSettings() {
      if (cohortReportSettingsBuilder_ == null) {
        return cohortReportSettings_ == null
            ? com.google.analytics.data.v1alpha.CohortReportSettings.getDefaultInstance()
            : cohortReportSettings_;
      } else {
        return cohortReportSettingsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional settings for a cohort report.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.CohortReportSettings cohort_report_settings = 3;</code>
     */
    public Builder setCohortReportSettings(
        com.google.analytics.data.v1alpha.CohortReportSettings value) {
      if (cohortReportSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cohortReportSettings_ = value;
        onChanged();
      } else {
        cohortReportSettingsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional settings for a cohort report.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.CohortReportSettings cohort_report_settings = 3;</code>
     */
    public Builder setCohortReportSettings(
        com.google.analytics.data.v1alpha.CohortReportSettings.Builder builderForValue) {
      if (cohortReportSettingsBuilder_ == null) {
        cohortReportSettings_ = builderForValue.build();
        onChanged();
      } else {
        cohortReportSettingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional settings for a cohort report.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.CohortReportSettings cohort_report_settings = 3;</code>
     */
    public Builder mergeCohortReportSettings(
        com.google.analytics.data.v1alpha.CohortReportSettings value) {
      if (cohortReportSettingsBuilder_ == null) {
        if (cohortReportSettings_ != null) {
          cohortReportSettings_ =
              com.google.analytics.data.v1alpha.CohortReportSettings.newBuilder(
                      cohortReportSettings_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          cohortReportSettings_ = value;
        }
        onChanged();
      } else {
        cohortReportSettingsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional settings for a cohort report.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.CohortReportSettings cohort_report_settings = 3;</code>
     */
    public Builder clearCohortReportSettings() {
      if (cohortReportSettingsBuilder_ == null) {
        cohortReportSettings_ = null;
        onChanged();
      } else {
        cohortReportSettings_ = null;
        cohortReportSettingsBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional settings for a cohort report.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.CohortReportSettings cohort_report_settings = 3;</code>
     */
    public com.google.analytics.data.v1alpha.CohortReportSettings.Builder
        getCohortReportSettingsBuilder() {

      onChanged();
      return getCohortReportSettingsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional settings for a cohort report.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.CohortReportSettings cohort_report_settings = 3;</code>
     */
    public com.google.analytics.data.v1alpha.CohortReportSettingsOrBuilder
        getCohortReportSettingsOrBuilder() {
      if (cohortReportSettingsBuilder_ != null) {
        return cohortReportSettingsBuilder_.getMessageOrBuilder();
      } else {
        return cohortReportSettings_ == null
            ? com.google.analytics.data.v1alpha.CohortReportSettings.getDefaultInstance()
            : cohortReportSettings_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional settings for a cohort report.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.CohortReportSettings cohort_report_settings = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.CohortReportSettings,
            com.google.analytics.data.v1alpha.CohortReportSettings.Builder,
            com.google.analytics.data.v1alpha.CohortReportSettingsOrBuilder>
        getCohortReportSettingsFieldBuilder() {
      if (cohortReportSettingsBuilder_ == null) {
        cohortReportSettingsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.CohortReportSettings,
                com.google.analytics.data.v1alpha.CohortReportSettings.Builder,
                com.google.analytics.data.v1alpha.CohortReportSettingsOrBuilder>(
                getCohortReportSettings(), getParentForChildren(), isClean());
        cohortReportSettings_ = null;
      }
      return cohortReportSettingsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.CohortSpec)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.CohortSpec)
  private static final com.google.analytics.data.v1alpha.CohortSpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.CohortSpec();
  }

  public static com.google.analytics.data.v1alpha.CohortSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CohortSpec> PARSER =
      new com.google.protobuf.AbstractParser<CohortSpec>() {
        @java.lang.Override
        public CohortSpec parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CohortSpec(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CohortSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CohortSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.CohortSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
