// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

public interface SegmentParameterFilterScopingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.SegmentParameterFilterScoping)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Accumulates the parameter over the specified period of days before
   * applying the filter. Only supported if criteria scoping is
   * `ACROSS_ALL_SESSIONS` or `WITHIN_SAME_SESSION`. Only supported if the
   * parameter is `event_count`.
   * For example if `inAnyNDayPeriod` is 3, the event_name is "purchase",
   * the event parameter is "event_count", and the Filter's criteria is
   * greater than 5, this filter will accumulate the event count of purchase
   * events over every 3 consecutive day period in the report's date range; a
   * user will pass this Filter's criteria to be included in this segment if
   * their count of purchase events exceeds 5 in any 3 consecutive day period.
   * For example, the periods 2021-11-01 to 2021-11-03, 2021-11-02 to
   * 2021-11-04, 2021-11-03 to 2021-11-05, and etc. will be considered.
   * The date range is not extended for the purpose of having a full N day
   * window near the start of the date range. For example if a report is for
   * 2021-11-01 to 2021-11-10 and `inAnyNDayPeriod` = 3, the first two day
   * period will be effectively shortened because no event data outside the
   * report's date range will be read. For example, the first four periods
   * will effectively be: 2021-11-01 to 2021-11-01, 2021-11-01 to 2021-11-02,
   * 2021-11-01 to 2021-11-03, and 2021-11-02 to 2021-11-04.
   * `inAnyNDayPeriod` is optional. If not specified, the
   * `segmentParameterFilter` is applied to each event individually.
   * </pre>
   *
   * <code>optional int64 in_any_n_day_period = 1;</code>
   * @return Whether the inAnyNDayPeriod field is set.
   */
  boolean hasInAnyNDayPeriod();
  /**
   * <pre>
   * Accumulates the parameter over the specified period of days before
   * applying the filter. Only supported if criteria scoping is
   * `ACROSS_ALL_SESSIONS` or `WITHIN_SAME_SESSION`. Only supported if the
   * parameter is `event_count`.
   * For example if `inAnyNDayPeriod` is 3, the event_name is "purchase",
   * the event parameter is "event_count", and the Filter's criteria is
   * greater than 5, this filter will accumulate the event count of purchase
   * events over every 3 consecutive day period in the report's date range; a
   * user will pass this Filter's criteria to be included in this segment if
   * their count of purchase events exceeds 5 in any 3 consecutive day period.
   * For example, the periods 2021-11-01 to 2021-11-03, 2021-11-02 to
   * 2021-11-04, 2021-11-03 to 2021-11-05, and etc. will be considered.
   * The date range is not extended for the purpose of having a full N day
   * window near the start of the date range. For example if a report is for
   * 2021-11-01 to 2021-11-10 and `inAnyNDayPeriod` = 3, the first two day
   * period will be effectively shortened because no event data outside the
   * report's date range will be read. For example, the first four periods
   * will effectively be: 2021-11-01 to 2021-11-01, 2021-11-01 to 2021-11-02,
   * 2021-11-01 to 2021-11-03, and 2021-11-02 to 2021-11-04.
   * `inAnyNDayPeriod` is optional. If not specified, the
   * `segmentParameterFilter` is applied to each event individually.
   * </pre>
   *
   * <code>optional int64 in_any_n_day_period = 1;</code>
   * @return The inAnyNDayPeriod.
   */
  long getInAnyNDayPeriod();
}
