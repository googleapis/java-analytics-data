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
 * A metric's value type.
 * </pre>
 *
 * Protobuf enum {@code google.analytics.data.v1alpha.MetricType}
 */
public enum MetricType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified type.
   * </pre>
   *
   * <code>METRIC_TYPE_UNSPECIFIED = 0;</code>
   */
  METRIC_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Integer type.
   * </pre>
   *
   * <code>TYPE_INTEGER = 1;</code>
   */
  TYPE_INTEGER(1),
  /**
   *
   *
   * <pre>
   * Floating point type.
   * </pre>
   *
   * <code>TYPE_FLOAT = 2;</code>
   */
  TYPE_FLOAT(2),
  /**
   *
   *
   * <pre>
   * A duration of seconds; a special floating point type.
   * </pre>
   *
   * <code>TYPE_SECONDS = 4;</code>
   */
  TYPE_SECONDS(4),
  /**
   *
   *
   * <pre>
   * A duration in milliseconds; a special floating point type.
   * </pre>
   *
   * <code>TYPE_MILLISECONDS = 5;</code>
   */
  TYPE_MILLISECONDS(5),
  /**
   *
   *
   * <pre>
   * A duration in minutes; a special floating point type.
   * </pre>
   *
   * <code>TYPE_MINUTES = 6;</code>
   */
  TYPE_MINUTES(6),
  /**
   *
   *
   * <pre>
   * A duration in hours; a special floating point type.
   * </pre>
   *
   * <code>TYPE_HOURS = 7;</code>
   */
  TYPE_HOURS(7),
  /**
   *
   *
   * <pre>
   * A custom metric of standard type; a special floating point type.
   * </pre>
   *
   * <code>TYPE_STANDARD = 8;</code>
   */
  TYPE_STANDARD(8),
  /**
   *
   *
   * <pre>
   * An amount of money; a special floating point type.
   * </pre>
   *
   * <code>TYPE_CURRENCY = 9;</code>
   */
  TYPE_CURRENCY(9),
  /**
   *
   *
   * <pre>
   * A length in feet; a special floating point type.
   * </pre>
   *
   * <code>TYPE_FEET = 10;</code>
   */
  TYPE_FEET(10),
  /**
   *
   *
   * <pre>
   * A length in miles; a special floating point type.
   * </pre>
   *
   * <code>TYPE_MILES = 11;</code>
   */
  TYPE_MILES(11),
  /**
   *
   *
   * <pre>
   * A length in meters; a special floating point type.
   * </pre>
   *
   * <code>TYPE_METERS = 12;</code>
   */
  TYPE_METERS(12),
  /**
   *
   *
   * <pre>
   * A length in kilometers; a special floating point type.
   * </pre>
   *
   * <code>TYPE_KILOMETERS = 13;</code>
   */
  TYPE_KILOMETERS(13),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified type.
   * </pre>
   *
   * <code>METRIC_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int METRIC_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Integer type.
   * </pre>
   *
   * <code>TYPE_INTEGER = 1;</code>
   */
  public static final int TYPE_INTEGER_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Floating point type.
   * </pre>
   *
   * <code>TYPE_FLOAT = 2;</code>
   */
  public static final int TYPE_FLOAT_VALUE = 2;
  /**
   *
   *
   * <pre>
   * A duration of seconds; a special floating point type.
   * </pre>
   *
   * <code>TYPE_SECONDS = 4;</code>
   */
  public static final int TYPE_SECONDS_VALUE = 4;
  /**
   *
   *
   * <pre>
   * A duration in milliseconds; a special floating point type.
   * </pre>
   *
   * <code>TYPE_MILLISECONDS = 5;</code>
   */
  public static final int TYPE_MILLISECONDS_VALUE = 5;
  /**
   *
   *
   * <pre>
   * A duration in minutes; a special floating point type.
   * </pre>
   *
   * <code>TYPE_MINUTES = 6;</code>
   */
  public static final int TYPE_MINUTES_VALUE = 6;
  /**
   *
   *
   * <pre>
   * A duration in hours; a special floating point type.
   * </pre>
   *
   * <code>TYPE_HOURS = 7;</code>
   */
  public static final int TYPE_HOURS_VALUE = 7;
  /**
   *
   *
   * <pre>
   * A custom metric of standard type; a special floating point type.
   * </pre>
   *
   * <code>TYPE_STANDARD = 8;</code>
   */
  public static final int TYPE_STANDARD_VALUE = 8;
  /**
   *
   *
   * <pre>
   * An amount of money; a special floating point type.
   * </pre>
   *
   * <code>TYPE_CURRENCY = 9;</code>
   */
  public static final int TYPE_CURRENCY_VALUE = 9;
  /**
   *
   *
   * <pre>
   * A length in feet; a special floating point type.
   * </pre>
   *
   * <code>TYPE_FEET = 10;</code>
   */
  public static final int TYPE_FEET_VALUE = 10;
  /**
   *
   *
   * <pre>
   * A length in miles; a special floating point type.
   * </pre>
   *
   * <code>TYPE_MILES = 11;</code>
   */
  public static final int TYPE_MILES_VALUE = 11;
  /**
   *
   *
   * <pre>
   * A length in meters; a special floating point type.
   * </pre>
   *
   * <code>TYPE_METERS = 12;</code>
   */
  public static final int TYPE_METERS_VALUE = 12;
  /**
   *
   *
   * <pre>
   * A length in kilometers; a special floating point type.
   * </pre>
   *
   * <code>TYPE_KILOMETERS = 13;</code>
   */
  public static final int TYPE_KILOMETERS_VALUE = 13;

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
  public static MetricType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MetricType forNumber(int value) {
    switch (value) {
      case 0:
        return METRIC_TYPE_UNSPECIFIED;
      case 1:
        return TYPE_INTEGER;
      case 2:
        return TYPE_FLOAT;
      case 4:
        return TYPE_SECONDS;
      case 5:
        return TYPE_MILLISECONDS;
      case 6:
        return TYPE_MINUTES;
      case 7:
        return TYPE_HOURS;
      case 8:
        return TYPE_STANDARD;
      case 9:
        return TYPE_CURRENCY;
      case 10:
        return TYPE_FEET;
      case 11:
        return TYPE_MILES;
      case 12:
        return TYPE_METERS;
      case 13:
        return TYPE_KILOMETERS;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MetricType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<MetricType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<MetricType>() {
        public MetricType findValueByNumber(int number) {
          return MetricType.forNumber(number);
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
    return com.google.analytics.data.v1alpha.ReportingApiProto.getDescriptor()
        .getEnumTypes()
        .get(1);
  }

  private static final MetricType[] VALUES = values();

  public static MetricType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MetricType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.analytics.data.v1alpha.MetricType)
}
