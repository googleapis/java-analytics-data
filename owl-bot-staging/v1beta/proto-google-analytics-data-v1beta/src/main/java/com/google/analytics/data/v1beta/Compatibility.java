// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1beta/data.proto

package com.google.analytics.data.v1beta;

/**
 * <pre>
 * The compatibility types for a single dimension or metric.
 * </pre>
 *
 * Protobuf enum {@code google.analytics.data.v1beta.Compatibility}
 */
public enum Compatibility
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unspecified compatibility.
   * </pre>
   *
   * <code>COMPATIBILITY_UNSPECIFIED = 0;</code>
   */
  COMPATIBILITY_UNSPECIFIED(0),
  /**
   * <pre>
   * The dimension or metric is compatible. This dimension or metric can be
   * successfully added to a report.
   * </pre>
   *
   * <code>COMPATIBLE = 1;</code>
   */
  COMPATIBLE(1),
  /**
   * <pre>
   * The dimension or metric is incompatible. This dimension or metric cannot be
   * successfully added to a report.
   * </pre>
   *
   * <code>INCOMPATIBLE = 2;</code>
   */
  INCOMPATIBLE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unspecified compatibility.
   * </pre>
   *
   * <code>COMPATIBILITY_UNSPECIFIED = 0;</code>
   */
  public static final int COMPATIBILITY_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * The dimension or metric is compatible. This dimension or metric can be
   * successfully added to a report.
   * </pre>
   *
   * <code>COMPATIBLE = 1;</code>
   */
  public static final int COMPATIBLE_VALUE = 1;
  /**
   * <pre>
   * The dimension or metric is incompatible. This dimension or metric cannot be
   * successfully added to a report.
   * </pre>
   *
   * <code>INCOMPATIBLE = 2;</code>
   */
  public static final int INCOMPATIBLE_VALUE = 2;


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
  public static Compatibility valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Compatibility forNumber(int value) {
    switch (value) {
      case 0: return COMPATIBILITY_UNSPECIFIED;
      case 1: return COMPATIBLE;
      case 2: return INCOMPATIBLE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Compatibility>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Compatibility> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Compatibility>() {
          public Compatibility findValueByNumber(int number) {
            return Compatibility.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.analytics.data.v1beta.ReportingApiProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final Compatibility[] VALUES = values();

  public static Compatibility valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Compatibility(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.analytics.data.v1beta.Compatibility)
}

