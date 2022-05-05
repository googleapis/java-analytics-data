// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

public interface FunnelParameterFilterExpressionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.FunnelParameterFilterExpression)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The FunnelParameterFilterExpression in `andGroup` have an AND
   * relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelParameterFilterExpressionList and_group = 1;</code>
   * @return Whether the andGroup field is set.
   */
  boolean hasAndGroup();
  /**
   * <pre>
   * The FunnelParameterFilterExpression in `andGroup` have an AND
   * relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelParameterFilterExpressionList and_group = 1;</code>
   * @return The andGroup.
   */
  com.google.analytics.data.v1alpha.FunnelParameterFilterExpressionList getAndGroup();
  /**
   * <pre>
   * The FunnelParameterFilterExpression in `andGroup` have an AND
   * relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelParameterFilterExpressionList and_group = 1;</code>
   */
  com.google.analytics.data.v1alpha.FunnelParameterFilterExpressionListOrBuilder getAndGroupOrBuilder();

  /**
   * <pre>
   * The FunnelParameterFilterExpression in `orGroup` have an OR
   * relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelParameterFilterExpressionList or_group = 2;</code>
   * @return Whether the orGroup field is set.
   */
  boolean hasOrGroup();
  /**
   * <pre>
   * The FunnelParameterFilterExpression in `orGroup` have an OR
   * relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelParameterFilterExpressionList or_group = 2;</code>
   * @return The orGroup.
   */
  com.google.analytics.data.v1alpha.FunnelParameterFilterExpressionList getOrGroup();
  /**
   * <pre>
   * The FunnelParameterFilterExpression in `orGroup` have an OR
   * relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelParameterFilterExpressionList or_group = 2;</code>
   */
  com.google.analytics.data.v1alpha.FunnelParameterFilterExpressionListOrBuilder getOrGroupOrBuilder();

  /**
   * <pre>
   * The FunnelParameterFilterExpression is NOT of `notExpression`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelParameterFilterExpression not_expression = 3;</code>
   * @return Whether the notExpression field is set.
   */
  boolean hasNotExpression();
  /**
   * <pre>
   * The FunnelParameterFilterExpression is NOT of `notExpression`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelParameterFilterExpression not_expression = 3;</code>
   * @return The notExpression.
   */
  com.google.analytics.data.v1alpha.FunnelParameterFilterExpression getNotExpression();
  /**
   * <pre>
   * The FunnelParameterFilterExpression is NOT of `notExpression`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelParameterFilterExpression not_expression = 3;</code>
   */
  com.google.analytics.data.v1alpha.FunnelParameterFilterExpressionOrBuilder getNotExpressionOrBuilder();

  /**
   * <pre>
   * A primitive funnel parameter filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelParameterFilter funnel_parameter_filter = 4;</code>
   * @return Whether the funnelParameterFilter field is set.
   */
  boolean hasFunnelParameterFilter();
  /**
   * <pre>
   * A primitive funnel parameter filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelParameterFilter funnel_parameter_filter = 4;</code>
   * @return The funnelParameterFilter.
   */
  com.google.analytics.data.v1alpha.FunnelParameterFilter getFunnelParameterFilter();
  /**
   * <pre>
   * A primitive funnel parameter filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelParameterFilter funnel_parameter_filter = 4;</code>
   */
  com.google.analytics.data.v1alpha.FunnelParameterFilterOrBuilder getFunnelParameterFilterOrBuilder();

  public com.google.analytics.data.v1alpha.FunnelParameterFilterExpression.ExprCase getExprCase();
}
