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
 * An expression to filter dimension or metric values.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.Filter}
 */
public final class Filter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.Filter)
    FilterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Filter.newBuilder() to construct.
  private Filter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Filter() {
    fieldName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Filter();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Filter(
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

              fieldName_ = s;
              break;
            }
          case 16:
            {
              oneFilterCase_ = 2;
              oneFilter_ = input.readBool();
              break;
            }
          case 26:
            {
              com.google.analytics.data.v1alpha.Filter.StringFilter.Builder subBuilder = null;
              if (oneFilterCase_ == 3) {
                subBuilder =
                    ((com.google.analytics.data.v1alpha.Filter.StringFilter) oneFilter_)
                        .toBuilder();
              }
              oneFilter_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.Filter.StringFilter.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(
                    (com.google.analytics.data.v1alpha.Filter.StringFilter) oneFilter_);
                oneFilter_ = subBuilder.buildPartial();
              }
              oneFilterCase_ = 3;
              break;
            }
          case 34:
            {
              com.google.analytics.data.v1alpha.Filter.InListFilter.Builder subBuilder = null;
              if (oneFilterCase_ == 4) {
                subBuilder =
                    ((com.google.analytics.data.v1alpha.Filter.InListFilter) oneFilter_)
                        .toBuilder();
              }
              oneFilter_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.Filter.InListFilter.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(
                    (com.google.analytics.data.v1alpha.Filter.InListFilter) oneFilter_);
                oneFilter_ = subBuilder.buildPartial();
              }
              oneFilterCase_ = 4;
              break;
            }
          case 42:
            {
              com.google.analytics.data.v1alpha.Filter.NumericFilter.Builder subBuilder = null;
              if (oneFilterCase_ == 5) {
                subBuilder =
                    ((com.google.analytics.data.v1alpha.Filter.NumericFilter) oneFilter_)
                        .toBuilder();
              }
              oneFilter_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.Filter.NumericFilter.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(
                    (com.google.analytics.data.v1alpha.Filter.NumericFilter) oneFilter_);
                oneFilter_ = subBuilder.buildPartial();
              }
              oneFilterCase_ = 5;
              break;
            }
          case 50:
            {
              com.google.analytics.data.v1alpha.Filter.BetweenFilter.Builder subBuilder = null;
              if (oneFilterCase_ == 6) {
                subBuilder =
                    ((com.google.analytics.data.v1alpha.Filter.BetweenFilter) oneFilter_)
                        .toBuilder();
              }
              oneFilter_ =
                  input.readMessage(
                      com.google.analytics.data.v1alpha.Filter.BetweenFilter.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(
                    (com.google.analytics.data.v1alpha.Filter.BetweenFilter) oneFilter_);
                oneFilter_ = subBuilder.buildPartial();
              }
              oneFilterCase_ = 6;
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
        .internal_static_google_analytics_data_v1alpha_Filter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_Filter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.Filter.class,
            com.google.analytics.data.v1alpha.Filter.Builder.class);
  }

  public interface StringFilterOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.Filter.StringFilter)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * The match type for this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.StringFilter.MatchType match_type = 1;</code>
     *
     * @return The enum numeric value on the wire for matchType.
     */
    int getMatchTypeValue();
    /**
     *
     *
     * <pre>
     * The match type for this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.StringFilter.MatchType match_type = 1;</code>
     *
     * @return The matchType.
     */
    com.google.analytics.data.v1alpha.Filter.StringFilter.MatchType getMatchType();

    /**
     *
     *
     * <pre>
     * The string value used for the matching.
     * </pre>
     *
     * <code>string value = 2;</code>
     *
     * @return The value.
     */
    java.lang.String getValue();
    /**
     *
     *
     * <pre>
     * The string value used for the matching.
     * </pre>
     *
     * <code>string value = 2;</code>
     *
     * @return The bytes for value.
     */
    com.google.protobuf.ByteString getValueBytes();

    /**
     *
     *
     * <pre>
     * If true, the string value is case sensitive.
     * </pre>
     *
     * <code>bool case_sensitive = 3;</code>
     *
     * @return The caseSensitive.
     */
    boolean getCaseSensitive();
  }
  /**
   *
   *
   * <pre>
   * The filter for string
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.Filter.StringFilter}
   */
  public static final class StringFilter extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.Filter.StringFilter)
      StringFilterOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use StringFilter.newBuilder() to construct.
    private StringFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private StringFilter() {
      matchType_ = 0;
      value_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
      return new StringFilter();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private StringFilter(
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
            case 8:
              {
                int rawValue = input.readEnum();

                matchType_ = rawValue;
                break;
              }
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();

                value_ = s;
                break;
              }
            case 24:
              {
                caseSensitive_ = input.readBool();
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
          .internal_static_google_analytics_data_v1alpha_Filter_StringFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_Filter_StringFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.Filter.StringFilter.class,
              com.google.analytics.data.v1alpha.Filter.StringFilter.Builder.class);
    }

    /**
     *
     *
     * <pre>
     * The match type of a string filter
     * </pre>
     *
     * Protobuf enum {@code google.analytics.data.v1alpha.Filter.StringFilter.MatchType}
     */
    public enum MatchType implements com.google.protobuf.ProtocolMessageEnum {
      /**
       *
       *
       * <pre>
       * Unspecified
       * </pre>
       *
       * <code>MATCH_TYPE_UNSPECIFIED = 0;</code>
       */
      MATCH_TYPE_UNSPECIFIED(0),
      /**
       *
       *
       * <pre>
       * Exact match of the string value.
       * </pre>
       *
       * <code>EXACT = 1;</code>
       */
      EXACT(1),
      /**
       *
       *
       * <pre>
       * Begins with the string value.
       * </pre>
       *
       * <code>BEGINS_WITH = 2;</code>
       */
      BEGINS_WITH(2),
      /**
       *
       *
       * <pre>
       * Ends with the string value.
       * </pre>
       *
       * <code>ENDS_WITH = 3;</code>
       */
      ENDS_WITH(3),
      /**
       *
       *
       * <pre>
       * Contains the string value.
       * </pre>
       *
       * <code>CONTAINS = 4;</code>
       */
      CONTAINS(4),
      /**
       *
       *
       * <pre>
       * Full regular expression match with the string value.
       * </pre>
       *
       * <code>FULL_REGEXP = 5;</code>
       */
      FULL_REGEXP(5),
      /**
       *
       *
       * <pre>
       * Partial regular expression match with the string value.
       * </pre>
       *
       * <code>PARTIAL_REGEXP = 6;</code>
       */
      PARTIAL_REGEXP(6),
      UNRECOGNIZED(-1),
      ;

      /**
       *
       *
       * <pre>
       * Unspecified
       * </pre>
       *
       * <code>MATCH_TYPE_UNSPECIFIED = 0;</code>
       */
      public static final int MATCH_TYPE_UNSPECIFIED_VALUE = 0;
      /**
       *
       *
       * <pre>
       * Exact match of the string value.
       * </pre>
       *
       * <code>EXACT = 1;</code>
       */
      public static final int EXACT_VALUE = 1;
      /**
       *
       *
       * <pre>
       * Begins with the string value.
       * </pre>
       *
       * <code>BEGINS_WITH = 2;</code>
       */
      public static final int BEGINS_WITH_VALUE = 2;
      /**
       *
       *
       * <pre>
       * Ends with the string value.
       * </pre>
       *
       * <code>ENDS_WITH = 3;</code>
       */
      public static final int ENDS_WITH_VALUE = 3;
      /**
       *
       *
       * <pre>
       * Contains the string value.
       * </pre>
       *
       * <code>CONTAINS = 4;</code>
       */
      public static final int CONTAINS_VALUE = 4;
      /**
       *
       *
       * <pre>
       * Full regular expression match with the string value.
       * </pre>
       *
       * <code>FULL_REGEXP = 5;</code>
       */
      public static final int FULL_REGEXP_VALUE = 5;
      /**
       *
       *
       * <pre>
       * Partial regular expression match with the string value.
       * </pre>
       *
       * <code>PARTIAL_REGEXP = 6;</code>
       */
      public static final int PARTIAL_REGEXP_VALUE = 6;

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
      public static MatchType valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static MatchType forNumber(int value) {
        switch (value) {
          case 0:
            return MATCH_TYPE_UNSPECIFIED;
          case 1:
            return EXACT;
          case 2:
            return BEGINS_WITH;
          case 3:
            return ENDS_WITH;
          case 4:
            return CONTAINS;
          case 5:
            return FULL_REGEXP;
          case 6:
            return PARTIAL_REGEXP;
          default:
            return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<MatchType> internalGetValueMap() {
        return internalValueMap;
      }

      private static final com.google.protobuf.Internal.EnumLiteMap<MatchType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MatchType>() {
            public MatchType findValueByNumber(int number) {
              return MatchType.forNumber(number);
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
        return com.google.analytics.data.v1alpha.Filter.StringFilter.getDescriptor()
            .getEnumTypes()
            .get(0);
      }

      private static final MatchType[] VALUES = values();

      public static MatchType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private MatchType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:google.analytics.data.v1alpha.Filter.StringFilter.MatchType)
    }

    public static final int MATCH_TYPE_FIELD_NUMBER = 1;
    private int matchType_;
    /**
     *
     *
     * <pre>
     * The match type for this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.StringFilter.MatchType match_type = 1;</code>
     *
     * @return The enum numeric value on the wire for matchType.
     */
    @java.lang.Override
    public int getMatchTypeValue() {
      return matchType_;
    }
    /**
     *
     *
     * <pre>
     * The match type for this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.StringFilter.MatchType match_type = 1;</code>
     *
     * @return The matchType.
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.Filter.StringFilter.MatchType getMatchType() {
      @SuppressWarnings("deprecation")
      com.google.analytics.data.v1alpha.Filter.StringFilter.MatchType result =
          com.google.analytics.data.v1alpha.Filter.StringFilter.MatchType.valueOf(matchType_);
      return result == null
          ? com.google.analytics.data.v1alpha.Filter.StringFilter.MatchType.UNRECOGNIZED
          : result;
    }

    public static final int VALUE_FIELD_NUMBER = 2;
    private volatile java.lang.Object value_;
    /**
     *
     *
     * <pre>
     * The string value used for the matching.
     * </pre>
     *
     * <code>string value = 2;</code>
     *
     * @return The value.
     */
    @java.lang.Override
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * The string value used for the matching.
     * </pre>
     *
     * <code>string value = 2;</code>
     *
     * @return The bytes for value.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CASE_SENSITIVE_FIELD_NUMBER = 3;
    private boolean caseSensitive_;
    /**
     *
     *
     * <pre>
     * If true, the string value is case sensitive.
     * </pre>
     *
     * <code>bool case_sensitive = 3;</code>
     *
     * @return The caseSensitive.
     */
    @java.lang.Override
    public boolean getCaseSensitive() {
      return caseSensitive_;
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
      if (matchType_
          != com.google.analytics.data.v1alpha.Filter.StringFilter.MatchType.MATCH_TYPE_UNSPECIFIED
              .getNumber()) {
        output.writeEnum(1, matchType_);
      }
      if (!getValueBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, value_);
      }
      if (caseSensitive_ != false) {
        output.writeBool(3, caseSensitive_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (matchType_
          != com.google.analytics.data.v1alpha.Filter.StringFilter.MatchType.MATCH_TYPE_UNSPECIFIED
              .getNumber()) {
        size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, matchType_);
      }
      if (!getValueBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, value_);
      }
      if (caseSensitive_ != false) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, caseSensitive_);
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
      if (!(obj instanceof com.google.analytics.data.v1alpha.Filter.StringFilter)) {
        return super.equals(obj);
      }
      com.google.analytics.data.v1alpha.Filter.StringFilter other =
          (com.google.analytics.data.v1alpha.Filter.StringFilter) obj;

      if (matchType_ != other.matchType_) return false;
      if (!getValue().equals(other.getValue())) return false;
      if (getCaseSensitive() != other.getCaseSensitive()) return false;
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
      hash = (37 * hash) + MATCH_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + matchType_;
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
      hash = (37 * hash) + CASE_SENSITIVE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getCaseSensitive());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.google.analytics.data.v1alpha.Filter.StringFilter parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.analytics.data.v1alpha.Filter.StringFilter parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.Filter.StringFilter parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.analytics.data.v1alpha.Filter.StringFilter parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.Filter.StringFilter parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.analytics.data.v1alpha.Filter.StringFilter parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.Filter.StringFilter parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.analytics.data.v1alpha.Filter.StringFilter parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.Filter.StringFilter parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.google.analytics.data.v1alpha.Filter.StringFilter parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.Filter.StringFilter parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.analytics.data.v1alpha.Filter.StringFilter parseFrom(
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
        com.google.analytics.data.v1alpha.Filter.StringFilter prototype) {
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
     * The filter for string
     * </pre>
     *
     * Protobuf type {@code google.analytics.data.v1alpha.Filter.StringFilter}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.Filter.StringFilter)
        com.google.analytics.data.v1alpha.Filter.StringFilterOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_Filter_StringFilter_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_Filter_StringFilter_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.analytics.data.v1alpha.Filter.StringFilter.class,
                com.google.analytics.data.v1alpha.Filter.StringFilter.Builder.class);
      }

      // Construct using com.google.analytics.data.v1alpha.Filter.StringFilter.newBuilder()
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
        matchType_ = 0;

        value_ = "";

        caseSensitive_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_Filter_StringFilter_descriptor;
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.Filter.StringFilter getDefaultInstanceForType() {
        return com.google.analytics.data.v1alpha.Filter.StringFilter.getDefaultInstance();
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.Filter.StringFilter build() {
        com.google.analytics.data.v1alpha.Filter.StringFilter result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.Filter.StringFilter buildPartial() {
        com.google.analytics.data.v1alpha.Filter.StringFilter result =
            new com.google.analytics.data.v1alpha.Filter.StringFilter(this);
        result.matchType_ = matchType_;
        result.value_ = value_;
        result.caseSensitive_ = caseSensitive_;
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
        if (other instanceof com.google.analytics.data.v1alpha.Filter.StringFilter) {
          return mergeFrom((com.google.analytics.data.v1alpha.Filter.StringFilter) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.google.analytics.data.v1alpha.Filter.StringFilter other) {
        if (other == com.google.analytics.data.v1alpha.Filter.StringFilter.getDefaultInstance())
          return this;
        if (other.matchType_ != 0) {
          setMatchTypeValue(other.getMatchTypeValue());
        }
        if (!other.getValue().isEmpty()) {
          value_ = other.value_;
          onChanged();
        }
        if (other.getCaseSensitive() != false) {
          setCaseSensitive(other.getCaseSensitive());
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
        com.google.analytics.data.v1alpha.Filter.StringFilter parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (com.google.analytics.data.v1alpha.Filter.StringFilter) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int matchType_ = 0;
      /**
       *
       *
       * <pre>
       * The match type for this filter.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.Filter.StringFilter.MatchType match_type = 1;</code>
       *
       * @return The enum numeric value on the wire for matchType.
       */
      @java.lang.Override
      public int getMatchTypeValue() {
        return matchType_;
      }
      /**
       *
       *
       * <pre>
       * The match type for this filter.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.Filter.StringFilter.MatchType match_type = 1;</code>
       *
       * @param value The enum numeric value on the wire for matchType to set.
       * @return This builder for chaining.
       */
      public Builder setMatchTypeValue(int value) {

        matchType_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The match type for this filter.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.Filter.StringFilter.MatchType match_type = 1;</code>
       *
       * @return The matchType.
       */
      @java.lang.Override
      public com.google.analytics.data.v1alpha.Filter.StringFilter.MatchType getMatchType() {
        @SuppressWarnings("deprecation")
        com.google.analytics.data.v1alpha.Filter.StringFilter.MatchType result =
            com.google.analytics.data.v1alpha.Filter.StringFilter.MatchType.valueOf(matchType_);
        return result == null
            ? com.google.analytics.data.v1alpha.Filter.StringFilter.MatchType.UNRECOGNIZED
            : result;
      }
      /**
       *
       *
       * <pre>
       * The match type for this filter.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.Filter.StringFilter.MatchType match_type = 1;</code>
       *
       * @param value The matchType to set.
       * @return This builder for chaining.
       */
      public Builder setMatchType(
          com.google.analytics.data.v1alpha.Filter.StringFilter.MatchType value) {
        if (value == null) {
          throw new NullPointerException();
        }

        matchType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The match type for this filter.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.Filter.StringFilter.MatchType match_type = 1;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearMatchType() {

        matchType_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object value_ = "";
      /**
       *
       *
       * <pre>
       * The string value used for the matching.
       * </pre>
       *
       * <code>string value = 2;</code>
       *
       * @return The value.
       */
      public java.lang.String getValue() {
        java.lang.Object ref = value_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          value_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * The string value used for the matching.
       * </pre>
       *
       * <code>string value = 2;</code>
       *
       * @return The bytes for value.
       */
      public com.google.protobuf.ByteString getValueBytes() {
        java.lang.Object ref = value_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          value_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * The string value used for the matching.
       * </pre>
       *
       * <code>string value = 2;</code>
       *
       * @param value The value to set.
       * @return This builder for chaining.
       */
      public Builder setValue(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }

        value_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The string value used for the matching.
       * </pre>
       *
       * <code>string value = 2;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearValue() {

        value_ = getDefaultInstance().getValue();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The string value used for the matching.
       * </pre>
       *
       * <code>string value = 2;</code>
       *
       * @param value The bytes for value to set.
       * @return This builder for chaining.
       */
      public Builder setValueBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        checkByteStringIsUtf8(value);

        value_ = value;
        onChanged();
        return this;
      }

      private boolean caseSensitive_;
      /**
       *
       *
       * <pre>
       * If true, the string value is case sensitive.
       * </pre>
       *
       * <code>bool case_sensitive = 3;</code>
       *
       * @return The caseSensitive.
       */
      @java.lang.Override
      public boolean getCaseSensitive() {
        return caseSensitive_;
      }
      /**
       *
       *
       * <pre>
       * If true, the string value is case sensitive.
       * </pre>
       *
       * <code>bool case_sensitive = 3;</code>
       *
       * @param value The caseSensitive to set.
       * @return This builder for chaining.
       */
      public Builder setCaseSensitive(boolean value) {

        caseSensitive_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * If true, the string value is case sensitive.
       * </pre>
       *
       * <code>bool case_sensitive = 3;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearCaseSensitive() {

        caseSensitive_ = false;
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

      // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.Filter.StringFilter)
    }

    // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.Filter.StringFilter)
    private static final com.google.analytics.data.v1alpha.Filter.StringFilter DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.Filter.StringFilter();
    }

    public static com.google.analytics.data.v1alpha.Filter.StringFilter getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StringFilter> PARSER =
        new com.google.protobuf.AbstractParser<StringFilter>() {
          @java.lang.Override
          public StringFilter parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new StringFilter(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<StringFilter> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StringFilter> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Filter.StringFilter getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface InListFilterOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.Filter.InListFilter)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * The list of string values.
     * Must be non-empty.
     * </pre>
     *
     * <code>repeated string values = 1;</code>
     *
     * @return A list containing the values.
     */
    java.util.List<java.lang.String> getValuesList();
    /**
     *
     *
     * <pre>
     * The list of string values.
     * Must be non-empty.
     * </pre>
     *
     * <code>repeated string values = 1;</code>
     *
     * @return The count of values.
     */
    int getValuesCount();
    /**
     *
     *
     * <pre>
     * The list of string values.
     * Must be non-empty.
     * </pre>
     *
     * <code>repeated string values = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The values at the given index.
     */
    java.lang.String getValues(int index);
    /**
     *
     *
     * <pre>
     * The list of string values.
     * Must be non-empty.
     * </pre>
     *
     * <code>repeated string values = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the values at the given index.
     */
    com.google.protobuf.ByteString getValuesBytes(int index);

    /**
     *
     *
     * <pre>
     * If true, the string value is case sensitive.
     * </pre>
     *
     * <code>bool case_sensitive = 2;</code>
     *
     * @return The caseSensitive.
     */
    boolean getCaseSensitive();
  }
  /**
   *
   *
   * <pre>
   * The result needs to be in a list of string values.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.Filter.InListFilter}
   */
  public static final class InListFilter extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.Filter.InListFilter)
      InListFilterOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use InListFilter.newBuilder() to construct.
    private InListFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private InListFilter() {
      values_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
      return new InListFilter();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private InListFilter(
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
                  values_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000001;
                }
                values_.add(s);
                break;
              }
            case 16:
              {
                caseSensitive_ = input.readBool();
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
          values_ = values_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_Filter_InListFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_Filter_InListFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.Filter.InListFilter.class,
              com.google.analytics.data.v1alpha.Filter.InListFilter.Builder.class);
    }

    public static final int VALUES_FIELD_NUMBER = 1;
    private com.google.protobuf.LazyStringList values_;
    /**
     *
     *
     * <pre>
     * The list of string values.
     * Must be non-empty.
     * </pre>
     *
     * <code>repeated string values = 1;</code>
     *
     * @return A list containing the values.
     */
    public com.google.protobuf.ProtocolStringList getValuesList() {
      return values_;
    }
    /**
     *
     *
     * <pre>
     * The list of string values.
     * Must be non-empty.
     * </pre>
     *
     * <code>repeated string values = 1;</code>
     *
     * @return The count of values.
     */
    public int getValuesCount() {
      return values_.size();
    }
    /**
     *
     *
     * <pre>
     * The list of string values.
     * Must be non-empty.
     * </pre>
     *
     * <code>repeated string values = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The values at the given index.
     */
    public java.lang.String getValues(int index) {
      return values_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The list of string values.
     * Must be non-empty.
     * </pre>
     *
     * <code>repeated string values = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the values at the given index.
     */
    public com.google.protobuf.ByteString getValuesBytes(int index) {
      return values_.getByteString(index);
    }

    public static final int CASE_SENSITIVE_FIELD_NUMBER = 2;
    private boolean caseSensitive_;
    /**
     *
     *
     * <pre>
     * If true, the string value is case sensitive.
     * </pre>
     *
     * <code>bool case_sensitive = 2;</code>
     *
     * @return The caseSensitive.
     */
    @java.lang.Override
    public boolean getCaseSensitive() {
      return caseSensitive_;
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
      for (int i = 0; i < values_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, values_.getRaw(i));
      }
      if (caseSensitive_ != false) {
        output.writeBool(2, caseSensitive_);
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
        for (int i = 0; i < values_.size(); i++) {
          dataSize += computeStringSizeNoTag(values_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getValuesList().size();
      }
      if (caseSensitive_ != false) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, caseSensitive_);
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
      if (!(obj instanceof com.google.analytics.data.v1alpha.Filter.InListFilter)) {
        return super.equals(obj);
      }
      com.google.analytics.data.v1alpha.Filter.InListFilter other =
          (com.google.analytics.data.v1alpha.Filter.InListFilter) obj;

      if (!getValuesList().equals(other.getValuesList())) return false;
      if (getCaseSensitive() != other.getCaseSensitive()) return false;
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
      if (getValuesCount() > 0) {
        hash = (37 * hash) + VALUES_FIELD_NUMBER;
        hash = (53 * hash) + getValuesList().hashCode();
      }
      hash = (37 * hash) + CASE_SENSITIVE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getCaseSensitive());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.google.analytics.data.v1alpha.Filter.InListFilter parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.analytics.data.v1alpha.Filter.InListFilter parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.Filter.InListFilter parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.analytics.data.v1alpha.Filter.InListFilter parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.Filter.InListFilter parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.analytics.data.v1alpha.Filter.InListFilter parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.Filter.InListFilter parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.analytics.data.v1alpha.Filter.InListFilter parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.Filter.InListFilter parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.google.analytics.data.v1alpha.Filter.InListFilter parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.Filter.InListFilter parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.analytics.data.v1alpha.Filter.InListFilter parseFrom(
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
        com.google.analytics.data.v1alpha.Filter.InListFilter prototype) {
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
     * The result needs to be in a list of string values.
     * </pre>
     *
     * Protobuf type {@code google.analytics.data.v1alpha.Filter.InListFilter}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.Filter.InListFilter)
        com.google.analytics.data.v1alpha.Filter.InListFilterOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_Filter_InListFilter_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_Filter_InListFilter_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.analytics.data.v1alpha.Filter.InListFilter.class,
                com.google.analytics.data.v1alpha.Filter.InListFilter.Builder.class);
      }

      // Construct using com.google.analytics.data.v1alpha.Filter.InListFilter.newBuilder()
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
        values_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        caseSensitive_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_Filter_InListFilter_descriptor;
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.Filter.InListFilter getDefaultInstanceForType() {
        return com.google.analytics.data.v1alpha.Filter.InListFilter.getDefaultInstance();
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.Filter.InListFilter build() {
        com.google.analytics.data.v1alpha.Filter.InListFilter result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.Filter.InListFilter buildPartial() {
        com.google.analytics.data.v1alpha.Filter.InListFilter result =
            new com.google.analytics.data.v1alpha.Filter.InListFilter(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          values_ = values_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.values_ = values_;
        result.caseSensitive_ = caseSensitive_;
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
        if (other instanceof com.google.analytics.data.v1alpha.Filter.InListFilter) {
          return mergeFrom((com.google.analytics.data.v1alpha.Filter.InListFilter) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.google.analytics.data.v1alpha.Filter.InListFilter other) {
        if (other == com.google.analytics.data.v1alpha.Filter.InListFilter.getDefaultInstance())
          return this;
        if (!other.values_.isEmpty()) {
          if (values_.isEmpty()) {
            values_ = other.values_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureValuesIsMutable();
            values_.addAll(other.values_);
          }
          onChanged();
        }
        if (other.getCaseSensitive() != false) {
          setCaseSensitive(other.getCaseSensitive());
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
        com.google.analytics.data.v1alpha.Filter.InListFilter parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (com.google.analytics.data.v1alpha.Filter.InListFilter) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private com.google.protobuf.LazyStringList values_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureValuesIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          values_ = new com.google.protobuf.LazyStringArrayList(values_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       *
       *
       * <pre>
       * The list of string values.
       * Must be non-empty.
       * </pre>
       *
       * <code>repeated string values = 1;</code>
       *
       * @return A list containing the values.
       */
      public com.google.protobuf.ProtocolStringList getValuesList() {
        return values_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * The list of string values.
       * Must be non-empty.
       * </pre>
       *
       * <code>repeated string values = 1;</code>
       *
       * @return The count of values.
       */
      public int getValuesCount() {
        return values_.size();
      }
      /**
       *
       *
       * <pre>
       * The list of string values.
       * Must be non-empty.
       * </pre>
       *
       * <code>repeated string values = 1;</code>
       *
       * @param index The index of the element to return.
       * @return The values at the given index.
       */
      public java.lang.String getValues(int index) {
        return values_.get(index);
      }
      /**
       *
       *
       * <pre>
       * The list of string values.
       * Must be non-empty.
       * </pre>
       *
       * <code>repeated string values = 1;</code>
       *
       * @param index The index of the value to return.
       * @return The bytes of the values at the given index.
       */
      public com.google.protobuf.ByteString getValuesBytes(int index) {
        return values_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * The list of string values.
       * Must be non-empty.
       * </pre>
       *
       * <code>repeated string values = 1;</code>
       *
       * @param index The index to set the value at.
       * @param value The values to set.
       * @return This builder for chaining.
       */
      public Builder setValues(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The list of string values.
       * Must be non-empty.
       * </pre>
       *
       * <code>repeated string values = 1;</code>
       *
       * @param value The values to add.
       * @return This builder for chaining.
       */
      public Builder addValues(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The list of string values.
       * Must be non-empty.
       * </pre>
       *
       * <code>repeated string values = 1;</code>
       *
       * @param values The values to add.
       * @return This builder for chaining.
       */
      public Builder addAllValues(java.lang.Iterable<java.lang.String> values) {
        ensureValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, values_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The list of string values.
       * Must be non-empty.
       * </pre>
       *
       * <code>repeated string values = 1;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearValues() {
        values_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The list of string values.
       * Must be non-empty.
       * </pre>
       *
       * <code>repeated string values = 1;</code>
       *
       * @param value The bytes of the values to add.
       * @return This builder for chaining.
       */
      public Builder addValuesBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        checkByteStringIsUtf8(value);
        ensureValuesIsMutable();
        values_.add(value);
        onChanged();
        return this;
      }

      private boolean caseSensitive_;
      /**
       *
       *
       * <pre>
       * If true, the string value is case sensitive.
       * </pre>
       *
       * <code>bool case_sensitive = 2;</code>
       *
       * @return The caseSensitive.
       */
      @java.lang.Override
      public boolean getCaseSensitive() {
        return caseSensitive_;
      }
      /**
       *
       *
       * <pre>
       * If true, the string value is case sensitive.
       * </pre>
       *
       * <code>bool case_sensitive = 2;</code>
       *
       * @param value The caseSensitive to set.
       * @return This builder for chaining.
       */
      public Builder setCaseSensitive(boolean value) {

        caseSensitive_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * If true, the string value is case sensitive.
       * </pre>
       *
       * <code>bool case_sensitive = 2;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearCaseSensitive() {

        caseSensitive_ = false;
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

      // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.Filter.InListFilter)
    }

    // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.Filter.InListFilter)
    private static final com.google.analytics.data.v1alpha.Filter.InListFilter DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.Filter.InListFilter();
    }

    public static com.google.analytics.data.v1alpha.Filter.InListFilter getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InListFilter> PARSER =
        new com.google.protobuf.AbstractParser<InListFilter>() {
          @java.lang.Override
          public InListFilter parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new InListFilter(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<InListFilter> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InListFilter> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Filter.InListFilter getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface NumericFilterOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.Filter.NumericFilter)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * The operation type for this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.NumericFilter.Operation operation = 1;</code>
     *
     * @return The enum numeric value on the wire for operation.
     */
    int getOperationValue();
    /**
     *
     *
     * <pre>
     * The operation type for this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.NumericFilter.Operation operation = 1;</code>
     *
     * @return The operation.
     */
    com.google.analytics.data.v1alpha.Filter.NumericFilter.Operation getOperation();

    /**
     *
     *
     * <pre>
     * A numeric value or a date value.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue value = 2;</code>
     *
     * @return Whether the value field is set.
     */
    boolean hasValue();
    /**
     *
     *
     * <pre>
     * A numeric value or a date value.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue value = 2;</code>
     *
     * @return The value.
     */
    com.google.analytics.data.v1alpha.NumericValue getValue();
    /**
     *
     *
     * <pre>
     * A numeric value or a date value.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue value = 2;</code>
     */
    com.google.analytics.data.v1alpha.NumericValueOrBuilder getValueOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * Filters for numeric or date values.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.Filter.NumericFilter}
   */
  public static final class NumericFilter extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.Filter.NumericFilter)
      NumericFilterOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use NumericFilter.newBuilder() to construct.
    private NumericFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private NumericFilter() {
      operation_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
      return new NumericFilter();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private NumericFilter(
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
            case 8:
              {
                int rawValue = input.readEnum();

                operation_ = rawValue;
                break;
              }
            case 18:
              {
                com.google.analytics.data.v1alpha.NumericValue.Builder subBuilder = null;
                if (value_ != null) {
                  subBuilder = value_.toBuilder();
                }
                value_ =
                    input.readMessage(
                        com.google.analytics.data.v1alpha.NumericValue.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(value_);
                  value_ = subBuilder.buildPartial();
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
          .internal_static_google_analytics_data_v1alpha_Filter_NumericFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_Filter_NumericFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.Filter.NumericFilter.class,
              com.google.analytics.data.v1alpha.Filter.NumericFilter.Builder.class);
    }

    /**
     *
     *
     * <pre>
     * The operation applied to a numeric filter
     * </pre>
     *
     * Protobuf enum {@code google.analytics.data.v1alpha.Filter.NumericFilter.Operation}
     */
    public enum Operation implements com.google.protobuf.ProtocolMessageEnum {
      /**
       *
       *
       * <pre>
       * Unspecified.
       * </pre>
       *
       * <code>OPERATION_UNSPECIFIED = 0;</code>
       */
      OPERATION_UNSPECIFIED(0),
      /**
       *
       *
       * <pre>
       * Equal
       * </pre>
       *
       * <code>EQUAL = 1;</code>
       */
      EQUAL(1),
      /**
       *
       *
       * <pre>
       * Less than
       * </pre>
       *
       * <code>LESS_THAN = 2;</code>
       */
      LESS_THAN(2),
      /**
       *
       *
       * <pre>
       * Less than or equal
       * </pre>
       *
       * <code>LESS_THAN_OR_EQUAL = 3;</code>
       */
      LESS_THAN_OR_EQUAL(3),
      /**
       *
       *
       * <pre>
       * Greater than
       * </pre>
       *
       * <code>GREATER_THAN = 4;</code>
       */
      GREATER_THAN(4),
      /**
       *
       *
       * <pre>
       * Greater than or equal
       * </pre>
       *
       * <code>GREATER_THAN_OR_EQUAL = 5;</code>
       */
      GREATER_THAN_OR_EQUAL(5),
      UNRECOGNIZED(-1),
      ;

      /**
       *
       *
       * <pre>
       * Unspecified.
       * </pre>
       *
       * <code>OPERATION_UNSPECIFIED = 0;</code>
       */
      public static final int OPERATION_UNSPECIFIED_VALUE = 0;
      /**
       *
       *
       * <pre>
       * Equal
       * </pre>
       *
       * <code>EQUAL = 1;</code>
       */
      public static final int EQUAL_VALUE = 1;
      /**
       *
       *
       * <pre>
       * Less than
       * </pre>
       *
       * <code>LESS_THAN = 2;</code>
       */
      public static final int LESS_THAN_VALUE = 2;
      /**
       *
       *
       * <pre>
       * Less than or equal
       * </pre>
       *
       * <code>LESS_THAN_OR_EQUAL = 3;</code>
       */
      public static final int LESS_THAN_OR_EQUAL_VALUE = 3;
      /**
       *
       *
       * <pre>
       * Greater than
       * </pre>
       *
       * <code>GREATER_THAN = 4;</code>
       */
      public static final int GREATER_THAN_VALUE = 4;
      /**
       *
       *
       * <pre>
       * Greater than or equal
       * </pre>
       *
       * <code>GREATER_THAN_OR_EQUAL = 5;</code>
       */
      public static final int GREATER_THAN_OR_EQUAL_VALUE = 5;

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
      public static Operation valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static Operation forNumber(int value) {
        switch (value) {
          case 0:
            return OPERATION_UNSPECIFIED;
          case 1:
            return EQUAL;
          case 2:
            return LESS_THAN;
          case 3:
            return LESS_THAN_OR_EQUAL;
          case 4:
            return GREATER_THAN;
          case 5:
            return GREATER_THAN_OR_EQUAL;
          default:
            return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Operation> internalGetValueMap() {
        return internalValueMap;
      }

      private static final com.google.protobuf.Internal.EnumLiteMap<Operation> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Operation>() {
            public Operation findValueByNumber(int number) {
              return Operation.forNumber(number);
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
        return com.google.analytics.data.v1alpha.Filter.NumericFilter.getDescriptor()
            .getEnumTypes()
            .get(0);
      }

      private static final Operation[] VALUES = values();

      public static Operation valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Operation(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:google.analytics.data.v1alpha.Filter.NumericFilter.Operation)
    }

    public static final int OPERATION_FIELD_NUMBER = 1;
    private int operation_;
    /**
     *
     *
     * <pre>
     * The operation type for this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.NumericFilter.Operation operation = 1;</code>
     *
     * @return The enum numeric value on the wire for operation.
     */
    @java.lang.Override
    public int getOperationValue() {
      return operation_;
    }
    /**
     *
     *
     * <pre>
     * The operation type for this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.NumericFilter.Operation operation = 1;</code>
     *
     * @return The operation.
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.Filter.NumericFilter.Operation getOperation() {
      @SuppressWarnings("deprecation")
      com.google.analytics.data.v1alpha.Filter.NumericFilter.Operation result =
          com.google.analytics.data.v1alpha.Filter.NumericFilter.Operation.valueOf(operation_);
      return result == null
          ? com.google.analytics.data.v1alpha.Filter.NumericFilter.Operation.UNRECOGNIZED
          : result;
    }

    public static final int VALUE_FIELD_NUMBER = 2;
    private com.google.analytics.data.v1alpha.NumericValue value_;
    /**
     *
     *
     * <pre>
     * A numeric value or a date value.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue value = 2;</code>
     *
     * @return Whether the value field is set.
     */
    @java.lang.Override
    public boolean hasValue() {
      return value_ != null;
    }
    /**
     *
     *
     * <pre>
     * A numeric value or a date value.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue value = 2;</code>
     *
     * @return The value.
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.NumericValue getValue() {
      return value_ == null
          ? com.google.analytics.data.v1alpha.NumericValue.getDefaultInstance()
          : value_;
    }
    /**
     *
     *
     * <pre>
     * A numeric value or a date value.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue value = 2;</code>
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.NumericValueOrBuilder getValueOrBuilder() {
      return getValue();
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
      if (operation_
          != com.google.analytics.data.v1alpha.Filter.NumericFilter.Operation.OPERATION_UNSPECIFIED
              .getNumber()) {
        output.writeEnum(1, operation_);
      }
      if (value_ != null) {
        output.writeMessage(2, getValue());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (operation_
          != com.google.analytics.data.v1alpha.Filter.NumericFilter.Operation.OPERATION_UNSPECIFIED
              .getNumber()) {
        size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, operation_);
      }
      if (value_ != null) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getValue());
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
      if (!(obj instanceof com.google.analytics.data.v1alpha.Filter.NumericFilter)) {
        return super.equals(obj);
      }
      com.google.analytics.data.v1alpha.Filter.NumericFilter other =
          (com.google.analytics.data.v1alpha.Filter.NumericFilter) obj;

      if (operation_ != other.operation_) return false;
      if (hasValue() != other.hasValue()) return false;
      if (hasValue()) {
        if (!getValue().equals(other.getValue())) return false;
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
      hash = (37 * hash) + OPERATION_FIELD_NUMBER;
      hash = (53 * hash) + operation_;
      if (hasValue()) {
        hash = (37 * hash) + VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getValue().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.google.analytics.data.v1alpha.Filter.NumericFilter parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.analytics.data.v1alpha.Filter.NumericFilter parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.Filter.NumericFilter parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.analytics.data.v1alpha.Filter.NumericFilter parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.Filter.NumericFilter parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.analytics.data.v1alpha.Filter.NumericFilter parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.Filter.NumericFilter parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.analytics.data.v1alpha.Filter.NumericFilter parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.Filter.NumericFilter parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.google.analytics.data.v1alpha.Filter.NumericFilter parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.Filter.NumericFilter parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.analytics.data.v1alpha.Filter.NumericFilter parseFrom(
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
        com.google.analytics.data.v1alpha.Filter.NumericFilter prototype) {
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
     * Filters for numeric or date values.
     * </pre>
     *
     * Protobuf type {@code google.analytics.data.v1alpha.Filter.NumericFilter}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.Filter.NumericFilter)
        com.google.analytics.data.v1alpha.Filter.NumericFilterOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_Filter_NumericFilter_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_Filter_NumericFilter_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.analytics.data.v1alpha.Filter.NumericFilter.class,
                com.google.analytics.data.v1alpha.Filter.NumericFilter.Builder.class);
      }

      // Construct using com.google.analytics.data.v1alpha.Filter.NumericFilter.newBuilder()
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
        operation_ = 0;

        if (valueBuilder_ == null) {
          value_ = null;
        } else {
          value_ = null;
          valueBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_Filter_NumericFilter_descriptor;
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.Filter.NumericFilter getDefaultInstanceForType() {
        return com.google.analytics.data.v1alpha.Filter.NumericFilter.getDefaultInstance();
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.Filter.NumericFilter build() {
        com.google.analytics.data.v1alpha.Filter.NumericFilter result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.Filter.NumericFilter buildPartial() {
        com.google.analytics.data.v1alpha.Filter.NumericFilter result =
            new com.google.analytics.data.v1alpha.Filter.NumericFilter(this);
        result.operation_ = operation_;
        if (valueBuilder_ == null) {
          result.value_ = value_;
        } else {
          result.value_ = valueBuilder_.build();
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
        if (other instanceof com.google.analytics.data.v1alpha.Filter.NumericFilter) {
          return mergeFrom((com.google.analytics.data.v1alpha.Filter.NumericFilter) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.google.analytics.data.v1alpha.Filter.NumericFilter other) {
        if (other == com.google.analytics.data.v1alpha.Filter.NumericFilter.getDefaultInstance())
          return this;
        if (other.operation_ != 0) {
          setOperationValue(other.getOperationValue());
        }
        if (other.hasValue()) {
          mergeValue(other.getValue());
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
        com.google.analytics.data.v1alpha.Filter.NumericFilter parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (com.google.analytics.data.v1alpha.Filter.NumericFilter) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int operation_ = 0;
      /**
       *
       *
       * <pre>
       * The operation type for this filter.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.Filter.NumericFilter.Operation operation = 1;</code>
       *
       * @return The enum numeric value on the wire for operation.
       */
      @java.lang.Override
      public int getOperationValue() {
        return operation_;
      }
      /**
       *
       *
       * <pre>
       * The operation type for this filter.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.Filter.NumericFilter.Operation operation = 1;</code>
       *
       * @param value The enum numeric value on the wire for operation to set.
       * @return This builder for chaining.
       */
      public Builder setOperationValue(int value) {

        operation_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The operation type for this filter.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.Filter.NumericFilter.Operation operation = 1;</code>
       *
       * @return The operation.
       */
      @java.lang.Override
      public com.google.analytics.data.v1alpha.Filter.NumericFilter.Operation getOperation() {
        @SuppressWarnings("deprecation")
        com.google.analytics.data.v1alpha.Filter.NumericFilter.Operation result =
            com.google.analytics.data.v1alpha.Filter.NumericFilter.Operation.valueOf(operation_);
        return result == null
            ? com.google.analytics.data.v1alpha.Filter.NumericFilter.Operation.UNRECOGNIZED
            : result;
      }
      /**
       *
       *
       * <pre>
       * The operation type for this filter.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.Filter.NumericFilter.Operation operation = 1;</code>
       *
       * @param value The operation to set.
       * @return This builder for chaining.
       */
      public Builder setOperation(
          com.google.analytics.data.v1alpha.Filter.NumericFilter.Operation value) {
        if (value == null) {
          throw new NullPointerException();
        }

        operation_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The operation type for this filter.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.Filter.NumericFilter.Operation operation = 1;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearOperation() {

        operation_ = 0;
        onChanged();
        return this;
      }

      private com.google.analytics.data.v1alpha.NumericValue value_;
      private com.google.protobuf.SingleFieldBuilderV3<
              com.google.analytics.data.v1alpha.NumericValue,
              com.google.analytics.data.v1alpha.NumericValue.Builder,
              com.google.analytics.data.v1alpha.NumericValueOrBuilder>
          valueBuilder_;
      /**
       *
       *
       * <pre>
       * A numeric value or a date value.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.NumericValue value = 2;</code>
       *
       * @return Whether the value field is set.
       */
      public boolean hasValue() {
        return valueBuilder_ != null || value_ != null;
      }
      /**
       *
       *
       * <pre>
       * A numeric value or a date value.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.NumericValue value = 2;</code>
       *
       * @return The value.
       */
      public com.google.analytics.data.v1alpha.NumericValue getValue() {
        if (valueBuilder_ == null) {
          return value_ == null
              ? com.google.analytics.data.v1alpha.NumericValue.getDefaultInstance()
              : value_;
        } else {
          return valueBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * A numeric value or a date value.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.NumericValue value = 2;</code>
       */
      public Builder setValue(com.google.analytics.data.v1alpha.NumericValue value) {
        if (valueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          value_ = value;
          onChanged();
        } else {
          valueBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       *
       *
       * <pre>
       * A numeric value or a date value.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.NumericValue value = 2;</code>
       */
      public Builder setValue(
          com.google.analytics.data.v1alpha.NumericValue.Builder builderForValue) {
        if (valueBuilder_ == null) {
          value_ = builderForValue.build();
          onChanged();
        } else {
          valueBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       *
       *
       * <pre>
       * A numeric value or a date value.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.NumericValue value = 2;</code>
       */
      public Builder mergeValue(com.google.analytics.data.v1alpha.NumericValue value) {
        if (valueBuilder_ == null) {
          if (value_ != null) {
            value_ =
                com.google.analytics.data.v1alpha.NumericValue.newBuilder(value_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            value_ = value;
          }
          onChanged();
        } else {
          valueBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       *
       *
       * <pre>
       * A numeric value or a date value.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.NumericValue value = 2;</code>
       */
      public Builder clearValue() {
        if (valueBuilder_ == null) {
          value_ = null;
          onChanged();
        } else {
          value_ = null;
          valueBuilder_ = null;
        }

        return this;
      }
      /**
       *
       *
       * <pre>
       * A numeric value or a date value.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.NumericValue value = 2;</code>
       */
      public com.google.analytics.data.v1alpha.NumericValue.Builder getValueBuilder() {

        onChanged();
        return getValueFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * A numeric value or a date value.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.NumericValue value = 2;</code>
       */
      public com.google.analytics.data.v1alpha.NumericValueOrBuilder getValueOrBuilder() {
        if (valueBuilder_ != null) {
          return valueBuilder_.getMessageOrBuilder();
        } else {
          return value_ == null
              ? com.google.analytics.data.v1alpha.NumericValue.getDefaultInstance()
              : value_;
        }
      }
      /**
       *
       *
       * <pre>
       * A numeric value or a date value.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.NumericValue value = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              com.google.analytics.data.v1alpha.NumericValue,
              com.google.analytics.data.v1alpha.NumericValue.Builder,
              com.google.analytics.data.v1alpha.NumericValueOrBuilder>
          getValueFieldBuilder() {
        if (valueBuilder_ == null) {
          valueBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  com.google.analytics.data.v1alpha.NumericValue,
                  com.google.analytics.data.v1alpha.NumericValue.Builder,
                  com.google.analytics.data.v1alpha.NumericValueOrBuilder>(
                  getValue(), getParentForChildren(), isClean());
          value_ = null;
        }
        return valueBuilder_;
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

      // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.Filter.NumericFilter)
    }

    // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.Filter.NumericFilter)
    private static final com.google.analytics.data.v1alpha.Filter.NumericFilter DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.Filter.NumericFilter();
    }

    public static com.google.analytics.data.v1alpha.Filter.NumericFilter getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NumericFilter> PARSER =
        new com.google.protobuf.AbstractParser<NumericFilter>() {
          @java.lang.Override
          public NumericFilter parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new NumericFilter(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<NumericFilter> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NumericFilter> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Filter.NumericFilter getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface BetweenFilterOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.Filter.BetweenFilter)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Begins with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue from_value = 1;</code>
     *
     * @return Whether the fromValue field is set.
     */
    boolean hasFromValue();
    /**
     *
     *
     * <pre>
     * Begins with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue from_value = 1;</code>
     *
     * @return The fromValue.
     */
    com.google.analytics.data.v1alpha.NumericValue getFromValue();
    /**
     *
     *
     * <pre>
     * Begins with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue from_value = 1;</code>
     */
    com.google.analytics.data.v1alpha.NumericValueOrBuilder getFromValueOrBuilder();

    /**
     *
     *
     * <pre>
     * Ends with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue to_value = 2;</code>
     *
     * @return Whether the toValue field is set.
     */
    boolean hasToValue();
    /**
     *
     *
     * <pre>
     * Ends with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue to_value = 2;</code>
     *
     * @return The toValue.
     */
    com.google.analytics.data.v1alpha.NumericValue getToValue();
    /**
     *
     *
     * <pre>
     * Ends with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue to_value = 2;</code>
     */
    com.google.analytics.data.v1alpha.NumericValueOrBuilder getToValueOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * To express that the result needs to be between two numbers (inclusive).
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.Filter.BetweenFilter}
   */
  public static final class BetweenFilter extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.Filter.BetweenFilter)
      BetweenFilterOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use BetweenFilter.newBuilder() to construct.
    private BetweenFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private BetweenFilter() {}

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
      return new BetweenFilter();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private BetweenFilter(
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
                com.google.analytics.data.v1alpha.NumericValue.Builder subBuilder = null;
                if (fromValue_ != null) {
                  subBuilder = fromValue_.toBuilder();
                }
                fromValue_ =
                    input.readMessage(
                        com.google.analytics.data.v1alpha.NumericValue.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(fromValue_);
                  fromValue_ = subBuilder.buildPartial();
                }

                break;
              }
            case 18:
              {
                com.google.analytics.data.v1alpha.NumericValue.Builder subBuilder = null;
                if (toValue_ != null) {
                  subBuilder = toValue_.toBuilder();
                }
                toValue_ =
                    input.readMessage(
                        com.google.analytics.data.v1alpha.NumericValue.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(toValue_);
                  toValue_ = subBuilder.buildPartial();
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
          .internal_static_google_analytics_data_v1alpha_Filter_BetweenFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_Filter_BetweenFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.Filter.BetweenFilter.class,
              com.google.analytics.data.v1alpha.Filter.BetweenFilter.Builder.class);
    }

    public static final int FROM_VALUE_FIELD_NUMBER = 1;
    private com.google.analytics.data.v1alpha.NumericValue fromValue_;
    /**
     *
     *
     * <pre>
     * Begins with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue from_value = 1;</code>
     *
     * @return Whether the fromValue field is set.
     */
    @java.lang.Override
    public boolean hasFromValue() {
      return fromValue_ != null;
    }
    /**
     *
     *
     * <pre>
     * Begins with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue from_value = 1;</code>
     *
     * @return The fromValue.
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.NumericValue getFromValue() {
      return fromValue_ == null
          ? com.google.analytics.data.v1alpha.NumericValue.getDefaultInstance()
          : fromValue_;
    }
    /**
     *
     *
     * <pre>
     * Begins with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue from_value = 1;</code>
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.NumericValueOrBuilder getFromValueOrBuilder() {
      return getFromValue();
    }

    public static final int TO_VALUE_FIELD_NUMBER = 2;
    private com.google.analytics.data.v1alpha.NumericValue toValue_;
    /**
     *
     *
     * <pre>
     * Ends with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue to_value = 2;</code>
     *
     * @return Whether the toValue field is set.
     */
    @java.lang.Override
    public boolean hasToValue() {
      return toValue_ != null;
    }
    /**
     *
     *
     * <pre>
     * Ends with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue to_value = 2;</code>
     *
     * @return The toValue.
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.NumericValue getToValue() {
      return toValue_ == null
          ? com.google.analytics.data.v1alpha.NumericValue.getDefaultInstance()
          : toValue_;
    }
    /**
     *
     *
     * <pre>
     * Ends with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue to_value = 2;</code>
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.NumericValueOrBuilder getToValueOrBuilder() {
      return getToValue();
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
      if (fromValue_ != null) {
        output.writeMessage(1, getFromValue());
      }
      if (toValue_ != null) {
        output.writeMessage(2, getToValue());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (fromValue_ != null) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getFromValue());
      }
      if (toValue_ != null) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getToValue());
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
      if (!(obj instanceof com.google.analytics.data.v1alpha.Filter.BetweenFilter)) {
        return super.equals(obj);
      }
      com.google.analytics.data.v1alpha.Filter.BetweenFilter other =
          (com.google.analytics.data.v1alpha.Filter.BetweenFilter) obj;

      if (hasFromValue() != other.hasFromValue()) return false;
      if (hasFromValue()) {
        if (!getFromValue().equals(other.getFromValue())) return false;
      }
      if (hasToValue() != other.hasToValue()) return false;
      if (hasToValue()) {
        if (!getToValue().equals(other.getToValue())) return false;
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
      if (hasFromValue()) {
        hash = (37 * hash) + FROM_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getFromValue().hashCode();
      }
      if (hasToValue()) {
        hash = (37 * hash) + TO_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getToValue().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.google.analytics.data.v1alpha.Filter.BetweenFilter parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.analytics.data.v1alpha.Filter.BetweenFilter parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.Filter.BetweenFilter parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.analytics.data.v1alpha.Filter.BetweenFilter parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.Filter.BetweenFilter parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.analytics.data.v1alpha.Filter.BetweenFilter parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.Filter.BetweenFilter parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.analytics.data.v1alpha.Filter.BetweenFilter parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.Filter.BetweenFilter parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.google.analytics.data.v1alpha.Filter.BetweenFilter parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static com.google.analytics.data.v1alpha.Filter.BetweenFilter parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.analytics.data.v1alpha.Filter.BetweenFilter parseFrom(
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
        com.google.analytics.data.v1alpha.Filter.BetweenFilter prototype) {
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
     * To express that the result needs to be between two numbers (inclusive).
     * </pre>
     *
     * Protobuf type {@code google.analytics.data.v1alpha.Filter.BetweenFilter}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.Filter.BetweenFilter)
        com.google.analytics.data.v1alpha.Filter.BetweenFilterOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_Filter_BetweenFilter_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_Filter_BetweenFilter_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.analytics.data.v1alpha.Filter.BetweenFilter.class,
                com.google.analytics.data.v1alpha.Filter.BetweenFilter.Builder.class);
      }

      // Construct using com.google.analytics.data.v1alpha.Filter.BetweenFilter.newBuilder()
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
        if (fromValueBuilder_ == null) {
          fromValue_ = null;
        } else {
          fromValue_ = null;
          fromValueBuilder_ = null;
        }
        if (toValueBuilder_ == null) {
          toValue_ = null;
        } else {
          toValue_ = null;
          toValueBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.google.analytics.data.v1alpha.ReportingApiProto
            .internal_static_google_analytics_data_v1alpha_Filter_BetweenFilter_descriptor;
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.Filter.BetweenFilter getDefaultInstanceForType() {
        return com.google.analytics.data.v1alpha.Filter.BetweenFilter.getDefaultInstance();
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.Filter.BetweenFilter build() {
        com.google.analytics.data.v1alpha.Filter.BetweenFilter result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.google.analytics.data.v1alpha.Filter.BetweenFilter buildPartial() {
        com.google.analytics.data.v1alpha.Filter.BetweenFilter result =
            new com.google.analytics.data.v1alpha.Filter.BetweenFilter(this);
        if (fromValueBuilder_ == null) {
          result.fromValue_ = fromValue_;
        } else {
          result.fromValue_ = fromValueBuilder_.build();
        }
        if (toValueBuilder_ == null) {
          result.toValue_ = toValue_;
        } else {
          result.toValue_ = toValueBuilder_.build();
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
        if (other instanceof com.google.analytics.data.v1alpha.Filter.BetweenFilter) {
          return mergeFrom((com.google.analytics.data.v1alpha.Filter.BetweenFilter) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.google.analytics.data.v1alpha.Filter.BetweenFilter other) {
        if (other == com.google.analytics.data.v1alpha.Filter.BetweenFilter.getDefaultInstance())
          return this;
        if (other.hasFromValue()) {
          mergeFromValue(other.getFromValue());
        }
        if (other.hasToValue()) {
          mergeToValue(other.getToValue());
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
        com.google.analytics.data.v1alpha.Filter.BetweenFilter parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (com.google.analytics.data.v1alpha.Filter.BetweenFilter) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.analytics.data.v1alpha.NumericValue fromValue_;
      private com.google.protobuf.SingleFieldBuilderV3<
              com.google.analytics.data.v1alpha.NumericValue,
              com.google.analytics.data.v1alpha.NumericValue.Builder,
              com.google.analytics.data.v1alpha.NumericValueOrBuilder>
          fromValueBuilder_;
      /**
       *
       *
       * <pre>
       * Begins with this number.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.NumericValue from_value = 1;</code>
       *
       * @return Whether the fromValue field is set.
       */
      public boolean hasFromValue() {
        return fromValueBuilder_ != null || fromValue_ != null;
      }
      /**
       *
       *
       * <pre>
       * Begins with this number.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.NumericValue from_value = 1;</code>
       *
       * @return The fromValue.
       */
      public com.google.analytics.data.v1alpha.NumericValue getFromValue() {
        if (fromValueBuilder_ == null) {
          return fromValue_ == null
              ? com.google.analytics.data.v1alpha.NumericValue.getDefaultInstance()
              : fromValue_;
        } else {
          return fromValueBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Begins with this number.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.NumericValue from_value = 1;</code>
       */
      public Builder setFromValue(com.google.analytics.data.v1alpha.NumericValue value) {
        if (fromValueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          fromValue_ = value;
          onChanged();
        } else {
          fromValueBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       *
       *
       * <pre>
       * Begins with this number.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.NumericValue from_value = 1;</code>
       */
      public Builder setFromValue(
          com.google.analytics.data.v1alpha.NumericValue.Builder builderForValue) {
        if (fromValueBuilder_ == null) {
          fromValue_ = builderForValue.build();
          onChanged();
        } else {
          fromValueBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       *
       *
       * <pre>
       * Begins with this number.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.NumericValue from_value = 1;</code>
       */
      public Builder mergeFromValue(com.google.analytics.data.v1alpha.NumericValue value) {
        if (fromValueBuilder_ == null) {
          if (fromValue_ != null) {
            fromValue_ =
                com.google.analytics.data.v1alpha.NumericValue.newBuilder(fromValue_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            fromValue_ = value;
          }
          onChanged();
        } else {
          fromValueBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       *
       *
       * <pre>
       * Begins with this number.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.NumericValue from_value = 1;</code>
       */
      public Builder clearFromValue() {
        if (fromValueBuilder_ == null) {
          fromValue_ = null;
          onChanged();
        } else {
          fromValue_ = null;
          fromValueBuilder_ = null;
        }

        return this;
      }
      /**
       *
       *
       * <pre>
       * Begins with this number.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.NumericValue from_value = 1;</code>
       */
      public com.google.analytics.data.v1alpha.NumericValue.Builder getFromValueBuilder() {

        onChanged();
        return getFromValueFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Begins with this number.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.NumericValue from_value = 1;</code>
       */
      public com.google.analytics.data.v1alpha.NumericValueOrBuilder getFromValueOrBuilder() {
        if (fromValueBuilder_ != null) {
          return fromValueBuilder_.getMessageOrBuilder();
        } else {
          return fromValue_ == null
              ? com.google.analytics.data.v1alpha.NumericValue.getDefaultInstance()
              : fromValue_;
        }
      }
      /**
       *
       *
       * <pre>
       * Begins with this number.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.NumericValue from_value = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              com.google.analytics.data.v1alpha.NumericValue,
              com.google.analytics.data.v1alpha.NumericValue.Builder,
              com.google.analytics.data.v1alpha.NumericValueOrBuilder>
          getFromValueFieldBuilder() {
        if (fromValueBuilder_ == null) {
          fromValueBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  com.google.analytics.data.v1alpha.NumericValue,
                  com.google.analytics.data.v1alpha.NumericValue.Builder,
                  com.google.analytics.data.v1alpha.NumericValueOrBuilder>(
                  getFromValue(), getParentForChildren(), isClean());
          fromValue_ = null;
        }
        return fromValueBuilder_;
      }

      private com.google.analytics.data.v1alpha.NumericValue toValue_;
      private com.google.protobuf.SingleFieldBuilderV3<
              com.google.analytics.data.v1alpha.NumericValue,
              com.google.analytics.data.v1alpha.NumericValue.Builder,
              com.google.analytics.data.v1alpha.NumericValueOrBuilder>
          toValueBuilder_;
      /**
       *
       *
       * <pre>
       * Ends with this number.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.NumericValue to_value = 2;</code>
       *
       * @return Whether the toValue field is set.
       */
      public boolean hasToValue() {
        return toValueBuilder_ != null || toValue_ != null;
      }
      /**
       *
       *
       * <pre>
       * Ends with this number.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.NumericValue to_value = 2;</code>
       *
       * @return The toValue.
       */
      public com.google.analytics.data.v1alpha.NumericValue getToValue() {
        if (toValueBuilder_ == null) {
          return toValue_ == null
              ? com.google.analytics.data.v1alpha.NumericValue.getDefaultInstance()
              : toValue_;
        } else {
          return toValueBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Ends with this number.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.NumericValue to_value = 2;</code>
       */
      public Builder setToValue(com.google.analytics.data.v1alpha.NumericValue value) {
        if (toValueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          toValue_ = value;
          onChanged();
        } else {
          toValueBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       *
       *
       * <pre>
       * Ends with this number.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.NumericValue to_value = 2;</code>
       */
      public Builder setToValue(
          com.google.analytics.data.v1alpha.NumericValue.Builder builderForValue) {
        if (toValueBuilder_ == null) {
          toValue_ = builderForValue.build();
          onChanged();
        } else {
          toValueBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       *
       *
       * <pre>
       * Ends with this number.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.NumericValue to_value = 2;</code>
       */
      public Builder mergeToValue(com.google.analytics.data.v1alpha.NumericValue value) {
        if (toValueBuilder_ == null) {
          if (toValue_ != null) {
            toValue_ =
                com.google.analytics.data.v1alpha.NumericValue.newBuilder(toValue_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            toValue_ = value;
          }
          onChanged();
        } else {
          toValueBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       *
       *
       * <pre>
       * Ends with this number.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.NumericValue to_value = 2;</code>
       */
      public Builder clearToValue() {
        if (toValueBuilder_ == null) {
          toValue_ = null;
          onChanged();
        } else {
          toValue_ = null;
          toValueBuilder_ = null;
        }

        return this;
      }
      /**
       *
       *
       * <pre>
       * Ends with this number.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.NumericValue to_value = 2;</code>
       */
      public com.google.analytics.data.v1alpha.NumericValue.Builder getToValueBuilder() {

        onChanged();
        return getToValueFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Ends with this number.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.NumericValue to_value = 2;</code>
       */
      public com.google.analytics.data.v1alpha.NumericValueOrBuilder getToValueOrBuilder() {
        if (toValueBuilder_ != null) {
          return toValueBuilder_.getMessageOrBuilder();
        } else {
          return toValue_ == null
              ? com.google.analytics.data.v1alpha.NumericValue.getDefaultInstance()
              : toValue_;
        }
      }
      /**
       *
       *
       * <pre>
       * Ends with this number.
       * </pre>
       *
       * <code>.google.analytics.data.v1alpha.NumericValue to_value = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              com.google.analytics.data.v1alpha.NumericValue,
              com.google.analytics.data.v1alpha.NumericValue.Builder,
              com.google.analytics.data.v1alpha.NumericValueOrBuilder>
          getToValueFieldBuilder() {
        if (toValueBuilder_ == null) {
          toValueBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  com.google.analytics.data.v1alpha.NumericValue,
                  com.google.analytics.data.v1alpha.NumericValue.Builder,
                  com.google.analytics.data.v1alpha.NumericValueOrBuilder>(
                  getToValue(), getParentForChildren(), isClean());
          toValue_ = null;
        }
        return toValueBuilder_;
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

      // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.Filter.BetweenFilter)
    }

    // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.Filter.BetweenFilter)
    private static final com.google.analytics.data.v1alpha.Filter.BetweenFilter DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.Filter.BetweenFilter();
    }

    public static com.google.analytics.data.v1alpha.Filter.BetweenFilter getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BetweenFilter> PARSER =
        new com.google.protobuf.AbstractParser<BetweenFilter>() {
          @java.lang.Override
          public BetweenFilter parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new BetweenFilter(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<BetweenFilter> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BetweenFilter> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Filter.BetweenFilter getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private int oneFilterCase_ = 0;
  private java.lang.Object oneFilter_;

  public enum OneFilterCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    NULL_FILTER(2),
    STRING_FILTER(3),
    IN_LIST_FILTER(4),
    NUMERIC_FILTER(5),
    BETWEEN_FILTER(6),
    ONEFILTER_NOT_SET(0);
    private final int value;

    private OneFilterCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OneFilterCase valueOf(int value) {
      return forNumber(value);
    }

    public static OneFilterCase forNumber(int value) {
      switch (value) {
        case 2:
          return NULL_FILTER;
        case 3:
          return STRING_FILTER;
        case 4:
          return IN_LIST_FILTER;
        case 5:
          return NUMERIC_FILTER;
        case 6:
          return BETWEEN_FILTER;
        case 0:
          return ONEFILTER_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public OneFilterCase getOneFilterCase() {
    return OneFilterCase.forNumber(oneFilterCase_);
  }

  public static final int FIELD_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object fieldName_;
  /**
   *
   *
   * <pre>
   * The dimension name or metric name. Must be a name defined in dimensions
   * or metrics.
   * </pre>
   *
   * <code>string field_name = 1;</code>
   *
   * @return The fieldName.
   */
  @java.lang.Override
  public java.lang.String getFieldName() {
    java.lang.Object ref = fieldName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fieldName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The dimension name or metric name. Must be a name defined in dimensions
   * or metrics.
   * </pre>
   *
   * <code>string field_name = 1;</code>
   *
   * @return The bytes for fieldName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFieldNameBytes() {
    java.lang.Object ref = fieldName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      fieldName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NULL_FILTER_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * A filter for null values. If True, a null dimension value is matched by
   * this filter. Null filter is commonly used inside a NOT filter
   * expression. For example, a NOT expression of a null filter removes rows
   * when a dimension is null.
   * </pre>
   *
   * <code>bool null_filter = 2;</code>
   *
   * @return The nullFilter.
   */
  @java.lang.Override
  public boolean getNullFilter() {
    if (oneFilterCase_ == 2) {
      return (java.lang.Boolean) oneFilter_;
    }
    return false;
  }

  public static final int STRING_FILTER_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * Strings related filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter.StringFilter string_filter = 3;</code>
   *
   * @return Whether the stringFilter field is set.
   */
  @java.lang.Override
  public boolean hasStringFilter() {
    return oneFilterCase_ == 3;
  }
  /**
   *
   *
   * <pre>
   * Strings related filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter.StringFilter string_filter = 3;</code>
   *
   * @return The stringFilter.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.Filter.StringFilter getStringFilter() {
    if (oneFilterCase_ == 3) {
      return (com.google.analytics.data.v1alpha.Filter.StringFilter) oneFilter_;
    }
    return com.google.analytics.data.v1alpha.Filter.StringFilter.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Strings related filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter.StringFilter string_filter = 3;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.Filter.StringFilterOrBuilder getStringFilterOrBuilder() {
    if (oneFilterCase_ == 3) {
      return (com.google.analytics.data.v1alpha.Filter.StringFilter) oneFilter_;
    }
    return com.google.analytics.data.v1alpha.Filter.StringFilter.getDefaultInstance();
  }

  public static final int IN_LIST_FILTER_FIELD_NUMBER = 4;
  /**
   *
   *
   * <pre>
   * A filter for in list values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter.InListFilter in_list_filter = 4;</code>
   *
   * @return Whether the inListFilter field is set.
   */
  @java.lang.Override
  public boolean hasInListFilter() {
    return oneFilterCase_ == 4;
  }
  /**
   *
   *
   * <pre>
   * A filter for in list values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter.InListFilter in_list_filter = 4;</code>
   *
   * @return The inListFilter.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.Filter.InListFilter getInListFilter() {
    if (oneFilterCase_ == 4) {
      return (com.google.analytics.data.v1alpha.Filter.InListFilter) oneFilter_;
    }
    return com.google.analytics.data.v1alpha.Filter.InListFilter.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * A filter for in list values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter.InListFilter in_list_filter = 4;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.Filter.InListFilterOrBuilder getInListFilterOrBuilder() {
    if (oneFilterCase_ == 4) {
      return (com.google.analytics.data.v1alpha.Filter.InListFilter) oneFilter_;
    }
    return com.google.analytics.data.v1alpha.Filter.InListFilter.getDefaultInstance();
  }

  public static final int NUMERIC_FILTER_FIELD_NUMBER = 5;
  /**
   *
   *
   * <pre>
   * A filter for numeric or date values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter.NumericFilter numeric_filter = 5;</code>
   *
   * @return Whether the numericFilter field is set.
   */
  @java.lang.Override
  public boolean hasNumericFilter() {
    return oneFilterCase_ == 5;
  }
  /**
   *
   *
   * <pre>
   * A filter for numeric or date values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter.NumericFilter numeric_filter = 5;</code>
   *
   * @return The numericFilter.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.Filter.NumericFilter getNumericFilter() {
    if (oneFilterCase_ == 5) {
      return (com.google.analytics.data.v1alpha.Filter.NumericFilter) oneFilter_;
    }
    return com.google.analytics.data.v1alpha.Filter.NumericFilter.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * A filter for numeric or date values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter.NumericFilter numeric_filter = 5;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.Filter.NumericFilterOrBuilder
      getNumericFilterOrBuilder() {
    if (oneFilterCase_ == 5) {
      return (com.google.analytics.data.v1alpha.Filter.NumericFilter) oneFilter_;
    }
    return com.google.analytics.data.v1alpha.Filter.NumericFilter.getDefaultInstance();
  }

  public static final int BETWEEN_FILTER_FIELD_NUMBER = 6;
  /**
   *
   *
   * <pre>
   * A filter for two values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter.BetweenFilter between_filter = 6;</code>
   *
   * @return Whether the betweenFilter field is set.
   */
  @java.lang.Override
  public boolean hasBetweenFilter() {
    return oneFilterCase_ == 6;
  }
  /**
   *
   *
   * <pre>
   * A filter for two values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter.BetweenFilter between_filter = 6;</code>
   *
   * @return The betweenFilter.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.Filter.BetweenFilter getBetweenFilter() {
    if (oneFilterCase_ == 6) {
      return (com.google.analytics.data.v1alpha.Filter.BetweenFilter) oneFilter_;
    }
    return com.google.analytics.data.v1alpha.Filter.BetweenFilter.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * A filter for two values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Filter.BetweenFilter between_filter = 6;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.Filter.BetweenFilterOrBuilder
      getBetweenFilterOrBuilder() {
    if (oneFilterCase_ == 6) {
      return (com.google.analytics.data.v1alpha.Filter.BetweenFilter) oneFilter_;
    }
    return com.google.analytics.data.v1alpha.Filter.BetweenFilter.getDefaultInstance();
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
    if (!getFieldNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fieldName_);
    }
    if (oneFilterCase_ == 2) {
      output.writeBool(2, (boolean) ((java.lang.Boolean) oneFilter_));
    }
    if (oneFilterCase_ == 3) {
      output.writeMessage(3, (com.google.analytics.data.v1alpha.Filter.StringFilter) oneFilter_);
    }
    if (oneFilterCase_ == 4) {
      output.writeMessage(4, (com.google.analytics.data.v1alpha.Filter.InListFilter) oneFilter_);
    }
    if (oneFilterCase_ == 5) {
      output.writeMessage(5, (com.google.analytics.data.v1alpha.Filter.NumericFilter) oneFilter_);
    }
    if (oneFilterCase_ == 6) {
      output.writeMessage(6, (com.google.analytics.data.v1alpha.Filter.BetweenFilter) oneFilter_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFieldNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fieldName_);
    }
    if (oneFilterCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(
              2, (boolean) ((java.lang.Boolean) oneFilter_));
    }
    if (oneFilterCase_ == 3) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              3, (com.google.analytics.data.v1alpha.Filter.StringFilter) oneFilter_);
    }
    if (oneFilterCase_ == 4) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              4, (com.google.analytics.data.v1alpha.Filter.InListFilter) oneFilter_);
    }
    if (oneFilterCase_ == 5) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              5, (com.google.analytics.data.v1alpha.Filter.NumericFilter) oneFilter_);
    }
    if (oneFilterCase_ == 6) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              6, (com.google.analytics.data.v1alpha.Filter.BetweenFilter) oneFilter_);
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.Filter)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.Filter other = (com.google.analytics.data.v1alpha.Filter) obj;

    if (!getFieldName().equals(other.getFieldName())) return false;
    if (!getOneFilterCase().equals(other.getOneFilterCase())) return false;
    switch (oneFilterCase_) {
      case 2:
        if (getNullFilter() != other.getNullFilter()) return false;
        break;
      case 3:
        if (!getStringFilter().equals(other.getStringFilter())) return false;
        break;
      case 4:
        if (!getInListFilter().equals(other.getInListFilter())) return false;
        break;
      case 5:
        if (!getNumericFilter().equals(other.getNumericFilter())) return false;
        break;
      case 6:
        if (!getBetweenFilter().equals(other.getBetweenFilter())) return false;
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
    hash = (37 * hash) + FIELD_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFieldName().hashCode();
    switch (oneFilterCase_) {
      case 2:
        hash = (37 * hash) + NULL_FILTER_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getNullFilter());
        break;
      case 3:
        hash = (37 * hash) + STRING_FILTER_FIELD_NUMBER;
        hash = (53 * hash) + getStringFilter().hashCode();
        break;
      case 4:
        hash = (37 * hash) + IN_LIST_FILTER_FIELD_NUMBER;
        hash = (53 * hash) + getInListFilter().hashCode();
        break;
      case 5:
        hash = (37 * hash) + NUMERIC_FILTER_FIELD_NUMBER;
        hash = (53 * hash) + getNumericFilter().hashCode();
        break;
      case 6:
        hash = (37 * hash) + BETWEEN_FILTER_FIELD_NUMBER;
        hash = (53 * hash) + getBetweenFilter().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.Filter parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.Filter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Filter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.Filter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Filter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.Filter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Filter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.Filter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Filter parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.Filter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Filter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.Filter parseFrom(
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

  public static Builder newBuilder(com.google.analytics.data.v1alpha.Filter prototype) {
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
   * An expression to filter dimension or metric values.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.Filter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.Filter)
      com.google.analytics.data.v1alpha.FilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_Filter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_Filter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.Filter.class,
              com.google.analytics.data.v1alpha.Filter.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.Filter.newBuilder()
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
      fieldName_ = "";

      oneFilterCase_ = 0;
      oneFilter_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_Filter_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Filter getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.Filter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Filter build() {
      com.google.analytics.data.v1alpha.Filter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Filter buildPartial() {
      com.google.analytics.data.v1alpha.Filter result =
          new com.google.analytics.data.v1alpha.Filter(this);
      result.fieldName_ = fieldName_;
      if (oneFilterCase_ == 2) {
        result.oneFilter_ = oneFilter_;
      }
      if (oneFilterCase_ == 3) {
        if (stringFilterBuilder_ == null) {
          result.oneFilter_ = oneFilter_;
        } else {
          result.oneFilter_ = stringFilterBuilder_.build();
        }
      }
      if (oneFilterCase_ == 4) {
        if (inListFilterBuilder_ == null) {
          result.oneFilter_ = oneFilter_;
        } else {
          result.oneFilter_ = inListFilterBuilder_.build();
        }
      }
      if (oneFilterCase_ == 5) {
        if (numericFilterBuilder_ == null) {
          result.oneFilter_ = oneFilter_;
        } else {
          result.oneFilter_ = numericFilterBuilder_.build();
        }
      }
      if (oneFilterCase_ == 6) {
        if (betweenFilterBuilder_ == null) {
          result.oneFilter_ = oneFilter_;
        } else {
          result.oneFilter_ = betweenFilterBuilder_.build();
        }
      }
      result.oneFilterCase_ = oneFilterCase_;
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
      if (other instanceof com.google.analytics.data.v1alpha.Filter) {
        return mergeFrom((com.google.analytics.data.v1alpha.Filter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.Filter other) {
      if (other == com.google.analytics.data.v1alpha.Filter.getDefaultInstance()) return this;
      if (!other.getFieldName().isEmpty()) {
        fieldName_ = other.fieldName_;
        onChanged();
      }
      switch (other.getOneFilterCase()) {
        case NULL_FILTER:
          {
            setNullFilter(other.getNullFilter());
            break;
          }
        case STRING_FILTER:
          {
            mergeStringFilter(other.getStringFilter());
            break;
          }
        case IN_LIST_FILTER:
          {
            mergeInListFilter(other.getInListFilter());
            break;
          }
        case NUMERIC_FILTER:
          {
            mergeNumericFilter(other.getNumericFilter());
            break;
          }
        case BETWEEN_FILTER:
          {
            mergeBetweenFilter(other.getBetweenFilter());
            break;
          }
        case ONEFILTER_NOT_SET:
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
      com.google.analytics.data.v1alpha.Filter parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.analytics.data.v1alpha.Filter) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int oneFilterCase_ = 0;
    private java.lang.Object oneFilter_;

    public OneFilterCase getOneFilterCase() {
      return OneFilterCase.forNumber(oneFilterCase_);
    }

    public Builder clearOneFilter() {
      oneFilterCase_ = 0;
      oneFilter_ = null;
      onChanged();
      return this;
    }

    private java.lang.Object fieldName_ = "";
    /**
     *
     *
     * <pre>
     * The dimension name or metric name. Must be a name defined in dimensions
     * or metrics.
     * </pre>
     *
     * <code>string field_name = 1;</code>
     *
     * @return The fieldName.
     */
    public java.lang.String getFieldName() {
      java.lang.Object ref = fieldName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fieldName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The dimension name or metric name. Must be a name defined in dimensions
     * or metrics.
     * </pre>
     *
     * <code>string field_name = 1;</code>
     *
     * @return The bytes for fieldName.
     */
    public com.google.protobuf.ByteString getFieldNameBytes() {
      java.lang.Object ref = fieldName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        fieldName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The dimension name or metric name. Must be a name defined in dimensions
     * or metrics.
     * </pre>
     *
     * <code>string field_name = 1;</code>
     *
     * @param value The fieldName to set.
     * @return This builder for chaining.
     */
    public Builder setFieldName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      fieldName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The dimension name or metric name. Must be a name defined in dimensions
     * or metrics.
     * </pre>
     *
     * <code>string field_name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFieldName() {

      fieldName_ = getDefaultInstance().getFieldName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The dimension name or metric name. Must be a name defined in dimensions
     * or metrics.
     * </pre>
     *
     * <code>string field_name = 1;</code>
     *
     * @param value The bytes for fieldName to set.
     * @return This builder for chaining.
     */
    public Builder setFieldNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      fieldName_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A filter for null values. If True, a null dimension value is matched by
     * this filter. Null filter is commonly used inside a NOT filter
     * expression. For example, a NOT expression of a null filter removes rows
     * when a dimension is null.
     * </pre>
     *
     * <code>bool null_filter = 2;</code>
     *
     * @return The nullFilter.
     */
    public boolean getNullFilter() {
      if (oneFilterCase_ == 2) {
        return (java.lang.Boolean) oneFilter_;
      }
      return false;
    }
    /**
     *
     *
     * <pre>
     * A filter for null values. If True, a null dimension value is matched by
     * this filter. Null filter is commonly used inside a NOT filter
     * expression. For example, a NOT expression of a null filter removes rows
     * when a dimension is null.
     * </pre>
     *
     * <code>bool null_filter = 2;</code>
     *
     * @param value The nullFilter to set.
     * @return This builder for chaining.
     */
    public Builder setNullFilter(boolean value) {
      oneFilterCase_ = 2;
      oneFilter_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter for null values. If True, a null dimension value is matched by
     * this filter. Null filter is commonly used inside a NOT filter
     * expression. For example, a NOT expression of a null filter removes rows
     * when a dimension is null.
     * </pre>
     *
     * <code>bool null_filter = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNullFilter() {
      if (oneFilterCase_ == 2) {
        oneFilterCase_ = 0;
        oneFilter_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.Filter.StringFilter,
            com.google.analytics.data.v1alpha.Filter.StringFilter.Builder,
            com.google.analytics.data.v1alpha.Filter.StringFilterOrBuilder>
        stringFilterBuilder_;
    /**
     *
     *
     * <pre>
     * Strings related filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.StringFilter string_filter = 3;</code>
     *
     * @return Whether the stringFilter field is set.
     */
    @java.lang.Override
    public boolean hasStringFilter() {
      return oneFilterCase_ == 3;
    }
    /**
     *
     *
     * <pre>
     * Strings related filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.StringFilter string_filter = 3;</code>
     *
     * @return The stringFilter.
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.Filter.StringFilter getStringFilter() {
      if (stringFilterBuilder_ == null) {
        if (oneFilterCase_ == 3) {
          return (com.google.analytics.data.v1alpha.Filter.StringFilter) oneFilter_;
        }
        return com.google.analytics.data.v1alpha.Filter.StringFilter.getDefaultInstance();
      } else {
        if (oneFilterCase_ == 3) {
          return stringFilterBuilder_.getMessage();
        }
        return com.google.analytics.data.v1alpha.Filter.StringFilter.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Strings related filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.StringFilter string_filter = 3;</code>
     */
    public Builder setStringFilter(com.google.analytics.data.v1alpha.Filter.StringFilter value) {
      if (stringFilterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        oneFilter_ = value;
        onChanged();
      } else {
        stringFilterBuilder_.setMessage(value);
      }
      oneFilterCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Strings related filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.StringFilter string_filter = 3;</code>
     */
    public Builder setStringFilter(
        com.google.analytics.data.v1alpha.Filter.StringFilter.Builder builderForValue) {
      if (stringFilterBuilder_ == null) {
        oneFilter_ = builderForValue.build();
        onChanged();
      } else {
        stringFilterBuilder_.setMessage(builderForValue.build());
      }
      oneFilterCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Strings related filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.StringFilter string_filter = 3;</code>
     */
    public Builder mergeStringFilter(com.google.analytics.data.v1alpha.Filter.StringFilter value) {
      if (stringFilterBuilder_ == null) {
        if (oneFilterCase_ == 3
            && oneFilter_
                != com.google.analytics.data.v1alpha.Filter.StringFilter.getDefaultInstance()) {
          oneFilter_ =
              com.google.analytics.data.v1alpha.Filter.StringFilter.newBuilder(
                      (com.google.analytics.data.v1alpha.Filter.StringFilter) oneFilter_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          oneFilter_ = value;
        }
        onChanged();
      } else {
        if (oneFilterCase_ == 3) {
          stringFilterBuilder_.mergeFrom(value);
        }
        stringFilterBuilder_.setMessage(value);
      }
      oneFilterCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Strings related filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.StringFilter string_filter = 3;</code>
     */
    public Builder clearStringFilter() {
      if (stringFilterBuilder_ == null) {
        if (oneFilterCase_ == 3) {
          oneFilterCase_ = 0;
          oneFilter_ = null;
          onChanged();
        }
      } else {
        if (oneFilterCase_ == 3) {
          oneFilterCase_ = 0;
          oneFilter_ = null;
        }
        stringFilterBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Strings related filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.StringFilter string_filter = 3;</code>
     */
    public com.google.analytics.data.v1alpha.Filter.StringFilter.Builder getStringFilterBuilder() {
      return getStringFilterFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Strings related filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.StringFilter string_filter = 3;</code>
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.Filter.StringFilterOrBuilder
        getStringFilterOrBuilder() {
      if ((oneFilterCase_ == 3) && (stringFilterBuilder_ != null)) {
        return stringFilterBuilder_.getMessageOrBuilder();
      } else {
        if (oneFilterCase_ == 3) {
          return (com.google.analytics.data.v1alpha.Filter.StringFilter) oneFilter_;
        }
        return com.google.analytics.data.v1alpha.Filter.StringFilter.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Strings related filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.StringFilter string_filter = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.Filter.StringFilter,
            com.google.analytics.data.v1alpha.Filter.StringFilter.Builder,
            com.google.analytics.data.v1alpha.Filter.StringFilterOrBuilder>
        getStringFilterFieldBuilder() {
      if (stringFilterBuilder_ == null) {
        if (!(oneFilterCase_ == 3)) {
          oneFilter_ = com.google.analytics.data.v1alpha.Filter.StringFilter.getDefaultInstance();
        }
        stringFilterBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.Filter.StringFilter,
                com.google.analytics.data.v1alpha.Filter.StringFilter.Builder,
                com.google.analytics.data.v1alpha.Filter.StringFilterOrBuilder>(
                (com.google.analytics.data.v1alpha.Filter.StringFilter) oneFilter_,
                getParentForChildren(),
                isClean());
        oneFilter_ = null;
      }
      oneFilterCase_ = 3;
      onChanged();
      ;
      return stringFilterBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.Filter.InListFilter,
            com.google.analytics.data.v1alpha.Filter.InListFilter.Builder,
            com.google.analytics.data.v1alpha.Filter.InListFilterOrBuilder>
        inListFilterBuilder_;
    /**
     *
     *
     * <pre>
     * A filter for in list values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.InListFilter in_list_filter = 4;</code>
     *
     * @return Whether the inListFilter field is set.
     */
    @java.lang.Override
    public boolean hasInListFilter() {
      return oneFilterCase_ == 4;
    }
    /**
     *
     *
     * <pre>
     * A filter for in list values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.InListFilter in_list_filter = 4;</code>
     *
     * @return The inListFilter.
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.Filter.InListFilter getInListFilter() {
      if (inListFilterBuilder_ == null) {
        if (oneFilterCase_ == 4) {
          return (com.google.analytics.data.v1alpha.Filter.InListFilter) oneFilter_;
        }
        return com.google.analytics.data.v1alpha.Filter.InListFilter.getDefaultInstance();
      } else {
        if (oneFilterCase_ == 4) {
          return inListFilterBuilder_.getMessage();
        }
        return com.google.analytics.data.v1alpha.Filter.InListFilter.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * A filter for in list values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.InListFilter in_list_filter = 4;</code>
     */
    public Builder setInListFilter(com.google.analytics.data.v1alpha.Filter.InListFilter value) {
      if (inListFilterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        oneFilter_ = value;
        onChanged();
      } else {
        inListFilterBuilder_.setMessage(value);
      }
      oneFilterCase_ = 4;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter for in list values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.InListFilter in_list_filter = 4;</code>
     */
    public Builder setInListFilter(
        com.google.analytics.data.v1alpha.Filter.InListFilter.Builder builderForValue) {
      if (inListFilterBuilder_ == null) {
        oneFilter_ = builderForValue.build();
        onChanged();
      } else {
        inListFilterBuilder_.setMessage(builderForValue.build());
      }
      oneFilterCase_ = 4;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter for in list values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.InListFilter in_list_filter = 4;</code>
     */
    public Builder mergeInListFilter(com.google.analytics.data.v1alpha.Filter.InListFilter value) {
      if (inListFilterBuilder_ == null) {
        if (oneFilterCase_ == 4
            && oneFilter_
                != com.google.analytics.data.v1alpha.Filter.InListFilter.getDefaultInstance()) {
          oneFilter_ =
              com.google.analytics.data.v1alpha.Filter.InListFilter.newBuilder(
                      (com.google.analytics.data.v1alpha.Filter.InListFilter) oneFilter_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          oneFilter_ = value;
        }
        onChanged();
      } else {
        if (oneFilterCase_ == 4) {
          inListFilterBuilder_.mergeFrom(value);
        }
        inListFilterBuilder_.setMessage(value);
      }
      oneFilterCase_ = 4;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter for in list values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.InListFilter in_list_filter = 4;</code>
     */
    public Builder clearInListFilter() {
      if (inListFilterBuilder_ == null) {
        if (oneFilterCase_ == 4) {
          oneFilterCase_ = 0;
          oneFilter_ = null;
          onChanged();
        }
      } else {
        if (oneFilterCase_ == 4) {
          oneFilterCase_ = 0;
          oneFilter_ = null;
        }
        inListFilterBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter for in list values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.InListFilter in_list_filter = 4;</code>
     */
    public com.google.analytics.data.v1alpha.Filter.InListFilter.Builder getInListFilterBuilder() {
      return getInListFilterFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A filter for in list values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.InListFilter in_list_filter = 4;</code>
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.Filter.InListFilterOrBuilder
        getInListFilterOrBuilder() {
      if ((oneFilterCase_ == 4) && (inListFilterBuilder_ != null)) {
        return inListFilterBuilder_.getMessageOrBuilder();
      } else {
        if (oneFilterCase_ == 4) {
          return (com.google.analytics.data.v1alpha.Filter.InListFilter) oneFilter_;
        }
        return com.google.analytics.data.v1alpha.Filter.InListFilter.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * A filter for in list values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.InListFilter in_list_filter = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.Filter.InListFilter,
            com.google.analytics.data.v1alpha.Filter.InListFilter.Builder,
            com.google.analytics.data.v1alpha.Filter.InListFilterOrBuilder>
        getInListFilterFieldBuilder() {
      if (inListFilterBuilder_ == null) {
        if (!(oneFilterCase_ == 4)) {
          oneFilter_ = com.google.analytics.data.v1alpha.Filter.InListFilter.getDefaultInstance();
        }
        inListFilterBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.Filter.InListFilter,
                com.google.analytics.data.v1alpha.Filter.InListFilter.Builder,
                com.google.analytics.data.v1alpha.Filter.InListFilterOrBuilder>(
                (com.google.analytics.data.v1alpha.Filter.InListFilter) oneFilter_,
                getParentForChildren(),
                isClean());
        oneFilter_ = null;
      }
      oneFilterCase_ = 4;
      onChanged();
      ;
      return inListFilterBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.Filter.NumericFilter,
            com.google.analytics.data.v1alpha.Filter.NumericFilter.Builder,
            com.google.analytics.data.v1alpha.Filter.NumericFilterOrBuilder>
        numericFilterBuilder_;
    /**
     *
     *
     * <pre>
     * A filter for numeric or date values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.NumericFilter numeric_filter = 5;</code>
     *
     * @return Whether the numericFilter field is set.
     */
    @java.lang.Override
    public boolean hasNumericFilter() {
      return oneFilterCase_ == 5;
    }
    /**
     *
     *
     * <pre>
     * A filter for numeric or date values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.NumericFilter numeric_filter = 5;</code>
     *
     * @return The numericFilter.
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.Filter.NumericFilter getNumericFilter() {
      if (numericFilterBuilder_ == null) {
        if (oneFilterCase_ == 5) {
          return (com.google.analytics.data.v1alpha.Filter.NumericFilter) oneFilter_;
        }
        return com.google.analytics.data.v1alpha.Filter.NumericFilter.getDefaultInstance();
      } else {
        if (oneFilterCase_ == 5) {
          return numericFilterBuilder_.getMessage();
        }
        return com.google.analytics.data.v1alpha.Filter.NumericFilter.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * A filter for numeric or date values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.NumericFilter numeric_filter = 5;</code>
     */
    public Builder setNumericFilter(com.google.analytics.data.v1alpha.Filter.NumericFilter value) {
      if (numericFilterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        oneFilter_ = value;
        onChanged();
      } else {
        numericFilterBuilder_.setMessage(value);
      }
      oneFilterCase_ = 5;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter for numeric or date values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.NumericFilter numeric_filter = 5;</code>
     */
    public Builder setNumericFilter(
        com.google.analytics.data.v1alpha.Filter.NumericFilter.Builder builderForValue) {
      if (numericFilterBuilder_ == null) {
        oneFilter_ = builderForValue.build();
        onChanged();
      } else {
        numericFilterBuilder_.setMessage(builderForValue.build());
      }
      oneFilterCase_ = 5;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter for numeric or date values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.NumericFilter numeric_filter = 5;</code>
     */
    public Builder mergeNumericFilter(
        com.google.analytics.data.v1alpha.Filter.NumericFilter value) {
      if (numericFilterBuilder_ == null) {
        if (oneFilterCase_ == 5
            && oneFilter_
                != com.google.analytics.data.v1alpha.Filter.NumericFilter.getDefaultInstance()) {
          oneFilter_ =
              com.google.analytics.data.v1alpha.Filter.NumericFilter.newBuilder(
                      (com.google.analytics.data.v1alpha.Filter.NumericFilter) oneFilter_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          oneFilter_ = value;
        }
        onChanged();
      } else {
        if (oneFilterCase_ == 5) {
          numericFilterBuilder_.mergeFrom(value);
        }
        numericFilterBuilder_.setMessage(value);
      }
      oneFilterCase_ = 5;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter for numeric or date values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.NumericFilter numeric_filter = 5;</code>
     */
    public Builder clearNumericFilter() {
      if (numericFilterBuilder_ == null) {
        if (oneFilterCase_ == 5) {
          oneFilterCase_ = 0;
          oneFilter_ = null;
          onChanged();
        }
      } else {
        if (oneFilterCase_ == 5) {
          oneFilterCase_ = 0;
          oneFilter_ = null;
        }
        numericFilterBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter for numeric or date values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.NumericFilter numeric_filter = 5;</code>
     */
    public com.google.analytics.data.v1alpha.Filter.NumericFilter.Builder
        getNumericFilterBuilder() {
      return getNumericFilterFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A filter for numeric or date values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.NumericFilter numeric_filter = 5;</code>
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.Filter.NumericFilterOrBuilder
        getNumericFilterOrBuilder() {
      if ((oneFilterCase_ == 5) && (numericFilterBuilder_ != null)) {
        return numericFilterBuilder_.getMessageOrBuilder();
      } else {
        if (oneFilterCase_ == 5) {
          return (com.google.analytics.data.v1alpha.Filter.NumericFilter) oneFilter_;
        }
        return com.google.analytics.data.v1alpha.Filter.NumericFilter.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * A filter for numeric or date values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.NumericFilter numeric_filter = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.Filter.NumericFilter,
            com.google.analytics.data.v1alpha.Filter.NumericFilter.Builder,
            com.google.analytics.data.v1alpha.Filter.NumericFilterOrBuilder>
        getNumericFilterFieldBuilder() {
      if (numericFilterBuilder_ == null) {
        if (!(oneFilterCase_ == 5)) {
          oneFilter_ = com.google.analytics.data.v1alpha.Filter.NumericFilter.getDefaultInstance();
        }
        numericFilterBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.Filter.NumericFilter,
                com.google.analytics.data.v1alpha.Filter.NumericFilter.Builder,
                com.google.analytics.data.v1alpha.Filter.NumericFilterOrBuilder>(
                (com.google.analytics.data.v1alpha.Filter.NumericFilter) oneFilter_,
                getParentForChildren(),
                isClean());
        oneFilter_ = null;
      }
      oneFilterCase_ = 5;
      onChanged();
      ;
      return numericFilterBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.Filter.BetweenFilter,
            com.google.analytics.data.v1alpha.Filter.BetweenFilter.Builder,
            com.google.analytics.data.v1alpha.Filter.BetweenFilterOrBuilder>
        betweenFilterBuilder_;
    /**
     *
     *
     * <pre>
     * A filter for two values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.BetweenFilter between_filter = 6;</code>
     *
     * @return Whether the betweenFilter field is set.
     */
    @java.lang.Override
    public boolean hasBetweenFilter() {
      return oneFilterCase_ == 6;
    }
    /**
     *
     *
     * <pre>
     * A filter for two values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.BetweenFilter between_filter = 6;</code>
     *
     * @return The betweenFilter.
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.Filter.BetweenFilter getBetweenFilter() {
      if (betweenFilterBuilder_ == null) {
        if (oneFilterCase_ == 6) {
          return (com.google.analytics.data.v1alpha.Filter.BetweenFilter) oneFilter_;
        }
        return com.google.analytics.data.v1alpha.Filter.BetweenFilter.getDefaultInstance();
      } else {
        if (oneFilterCase_ == 6) {
          return betweenFilterBuilder_.getMessage();
        }
        return com.google.analytics.data.v1alpha.Filter.BetweenFilter.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * A filter for two values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.BetweenFilter between_filter = 6;</code>
     */
    public Builder setBetweenFilter(com.google.analytics.data.v1alpha.Filter.BetweenFilter value) {
      if (betweenFilterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        oneFilter_ = value;
        onChanged();
      } else {
        betweenFilterBuilder_.setMessage(value);
      }
      oneFilterCase_ = 6;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter for two values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.BetweenFilter between_filter = 6;</code>
     */
    public Builder setBetweenFilter(
        com.google.analytics.data.v1alpha.Filter.BetweenFilter.Builder builderForValue) {
      if (betweenFilterBuilder_ == null) {
        oneFilter_ = builderForValue.build();
        onChanged();
      } else {
        betweenFilterBuilder_.setMessage(builderForValue.build());
      }
      oneFilterCase_ = 6;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter for two values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.BetweenFilter between_filter = 6;</code>
     */
    public Builder mergeBetweenFilter(
        com.google.analytics.data.v1alpha.Filter.BetweenFilter value) {
      if (betweenFilterBuilder_ == null) {
        if (oneFilterCase_ == 6
            && oneFilter_
                != com.google.analytics.data.v1alpha.Filter.BetweenFilter.getDefaultInstance()) {
          oneFilter_ =
              com.google.analytics.data.v1alpha.Filter.BetweenFilter.newBuilder(
                      (com.google.analytics.data.v1alpha.Filter.BetweenFilter) oneFilter_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          oneFilter_ = value;
        }
        onChanged();
      } else {
        if (oneFilterCase_ == 6) {
          betweenFilterBuilder_.mergeFrom(value);
        }
        betweenFilterBuilder_.setMessage(value);
      }
      oneFilterCase_ = 6;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter for two values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.BetweenFilter between_filter = 6;</code>
     */
    public Builder clearBetweenFilter() {
      if (betweenFilterBuilder_ == null) {
        if (oneFilterCase_ == 6) {
          oneFilterCase_ = 0;
          oneFilter_ = null;
          onChanged();
        }
      } else {
        if (oneFilterCase_ == 6) {
          oneFilterCase_ = 0;
          oneFilter_ = null;
        }
        betweenFilterBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter for two values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.BetweenFilter between_filter = 6;</code>
     */
    public com.google.analytics.data.v1alpha.Filter.BetweenFilter.Builder
        getBetweenFilterBuilder() {
      return getBetweenFilterFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A filter for two values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.BetweenFilter between_filter = 6;</code>
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.Filter.BetweenFilterOrBuilder
        getBetweenFilterOrBuilder() {
      if ((oneFilterCase_ == 6) && (betweenFilterBuilder_ != null)) {
        return betweenFilterBuilder_.getMessageOrBuilder();
      } else {
        if (oneFilterCase_ == 6) {
          return (com.google.analytics.data.v1alpha.Filter.BetweenFilter) oneFilter_;
        }
        return com.google.analytics.data.v1alpha.Filter.BetweenFilter.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * A filter for two values.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Filter.BetweenFilter between_filter = 6;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.Filter.BetweenFilter,
            com.google.analytics.data.v1alpha.Filter.BetweenFilter.Builder,
            com.google.analytics.data.v1alpha.Filter.BetweenFilterOrBuilder>
        getBetweenFilterFieldBuilder() {
      if (betweenFilterBuilder_ == null) {
        if (!(oneFilterCase_ == 6)) {
          oneFilter_ = com.google.analytics.data.v1alpha.Filter.BetweenFilter.getDefaultInstance();
        }
        betweenFilterBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.Filter.BetweenFilter,
                com.google.analytics.data.v1alpha.Filter.BetweenFilter.Builder,
                com.google.analytics.data.v1alpha.Filter.BetweenFilterOrBuilder>(
                (com.google.analytics.data.v1alpha.Filter.BetweenFilter) oneFilter_,
                getParentForChildren(),
                isClean());
        oneFilter_ = null;
      }
      oneFilterCase_ = 6;
      onChanged();
      ;
      return betweenFilterBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.Filter)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.Filter)
  private static final com.google.analytics.data.v1alpha.Filter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.Filter();
  }

  public static com.google.analytics.data.v1alpha.Filter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Filter> PARSER =
      new com.google.protobuf.AbstractParser<Filter>() {
        @java.lang.Override
        public Filter parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Filter(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Filter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Filter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.Filter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
