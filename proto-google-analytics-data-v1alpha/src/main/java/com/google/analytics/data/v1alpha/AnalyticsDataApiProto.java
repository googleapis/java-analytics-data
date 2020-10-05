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
// source: google/analytics/data/v1alpha/analytics_data_api.proto

package com.google.analytics.data.v1alpha;

public final class AnalyticsDataApiProto {
  private AnalyticsDataApiProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1alpha_RunReportRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1alpha_RunReportRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1alpha_RunReportResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1alpha_RunReportResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1alpha_RunPivotReportRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1alpha_RunPivotReportRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1alpha_RunPivotReportResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1alpha_RunPivotReportResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1alpha_BatchRunReportsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1alpha_BatchRunReportsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1alpha_BatchRunReportsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1alpha_BatchRunReportsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1alpha_GetUniversalMetadataRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1alpha_GetUniversalMetadataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1alpha_UniversalMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1alpha_UniversalMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/analytics/data/v1alpha/analytic"
          + "s_data_api.proto\022\035google.analytics.data."
          + "v1alpha\032(google/analytics/data/v1alpha/d"
          + "ata.proto\032\034google/api/annotations.proto\032"
          + "\027google/api/client.proto\032\037google/api/fie"
          + "ld_behavior.proto\"\311\005\n\020RunReportRequest\0225"
          + "\n\006entity\030\001 \001(\0132%.google.analytics.data.v"
          + "1alpha.Entity\022<\n\ndimensions\030\002 \003(\0132(.goog"
          + "le.analytics.data.v1alpha.Dimension\0226\n\007m"
          + "etrics\030\003 \003(\0132%.google.analytics.data.v1a"
          + "lpha.Metric\022=\n\013date_ranges\030\004 \003(\0132(.googl"
          + "e.analytics.data.v1alpha.DateRange\022\016\n\006of"
          + "fset\030\005 \001(\003\022\r\n\005limit\030\006 \001(\003\022M\n\023metric_aggr"
          + "egations\030\007 \003(\01620.google.analytics.data.v"
          + "1alpha.MetricAggregation\022I\n\020dimension_fi"
          + "lter\030\010 \001(\0132/.google.analytics.data.v1alp"
          + "ha.FilterExpression\022F\n\rmetric_filter\030\t \001"
          + "(\0132/.google.analytics.data.v1alpha.Filte"
          + "rExpression\0229\n\torder_bys\030\n \003(\0132&.google."
          + "analytics.data.v1alpha.OrderBy\022\025\n\rcurren"
          + "cy_code\030\013 \001(\t\022>\n\013cohort_spec\030\014 \001(\0132).goo"
          + "gle.analytics.data.v1alpha.CohortSpec\022\027\n"
          + "\017keep_empty_rows\030\r \001(\010\022\035\n\025return_propert"
          + "y_quota\030\016 \001(\010\"\221\004\n\021RunReportResponse\022I\n\021d"
          + "imension_headers\030\013 \003(\0132..google.analytic"
          + "s.data.v1alpha.DimensionHeader\022C\n\016metric"
          + "_headers\030\001 \003(\0132+.google.analytics.data.v"
          + "1alpha.MetricHeader\0220\n\004rows\030\002 \003(\0132\".goog"
          + "le.analytics.data.v1alpha.Row\0222\n\006totals\030"
          + "\010 \003(\0132\".google.analytics.data.v1alpha.Ro"
          + "w\0224\n\010maximums\030\t \003(\0132\".google.analytics.d"
          + "ata.v1alpha.Row\0224\n\010minimums\030\n \003(\0132\".goog"
          + "le.analytics.data.v1alpha.Row\022\021\n\trow_cou"
          + "nt\030\014 \001(\005\022A\n\010metadata\030\006 \001(\0132/.google.anal"
          + "ytics.data.v1alpha.ResponseMetaData\022D\n\016p"
          + "roperty_quota\030\007 \001(\0132,.google.analytics.d"
          + "ata.v1alpha.PropertyQuota\"\333\004\n\025RunPivotRe"
          + "portRequest\0225\n\006entity\030\001 \001(\0132%.google.ana"
          + "lytics.data.v1alpha.Entity\022<\n\ndimensions"
          + "\030\002 \003(\0132(.google.analytics.data.v1alpha.D"
          + "imension\0226\n\007metrics\030\003 \003(\0132%.google.analy"
          + "tics.data.v1alpha.Metric\022I\n\020dimension_fi"
          + "lter\030\004 \001(\0132/.google.analytics.data.v1alp"
          + "ha.FilterExpression\022F\n\rmetric_filter\030\005 \001"
          + "(\0132/.google.analytics.data.v1alpha.Filte"
          + "rExpression\0224\n\006pivots\030\006 \003(\0132$.google.ana"
          + "lytics.data.v1alpha.Pivot\022=\n\013date_ranges"
          + "\030\007 \003(\0132(.google.analytics.data.v1alpha.D"
          + "ateRange\022\025\n\rcurrency_code\030\010 \001(\t\022>\n\013cohor"
          + "t_spec\030\t \001(\0132).google.analytics.data.v1a"
          + "lpha.CohortSpec\022\027\n\017keep_empty_rows\030\n \001(\010"
          + "\022\035\n\025return_property_quota\030\013 \001(\010\"\336\003\n\026RunP"
          + "ivotReportResponse\022A\n\rpivot_headers\030\001 \003("
          + "\0132*.google.analytics.data.v1alpha.PivotH"
          + "eader\022I\n\021dimension_headers\030\007 \003(\0132..googl"
          + "e.analytics.data.v1alpha.DimensionHeader"
          + "\022C\n\016metric_headers\030\002 \003(\0132+.google.analyt"
          + "ics.data.v1alpha.MetricHeader\0220\n\004rows\030\003 "
          + "\003(\0132\".google.analytics.data.v1alpha.Row\022"
          + "6\n\naggregates\030\004 \003(\0132\".google.analytics.d"
          + "ata.v1alpha.Row\022A\n\010metadata\030\005 \001(\0132/.goog"
          + "le.analytics.data.v1alpha.ResponseMetaDa"
          + "ta\022D\n\016property_quota\030\006 \001(\0132,.google.anal"
          + "ytics.data.v1alpha.PropertyQuota\"\222\001\n\026Bat"
          + "chRunReportsRequest\0225\n\006entity\030\001 \001(\0132%.go"
          + "ogle.analytics.data.v1alpha.Entity\022A\n\010re"
          + "quests\030\002 \003(\0132/.google.analytics.data.v1a"
          + "lpha.RunReportRequest\"\\\n\027BatchRunReports"
          + "Response\022A\n\007reports\030\001 \003(\01320.google.analy"
          + "tics.data.v1alpha.RunReportResponse\"\234\001\n\033"
          + "BatchRunPivotReportsRequest\0225\n\006entity\030\001 "
          + "\001(\0132%.google.analytics.data.v1alpha.Enti"
          + "ty\022F\n\010requests\030\002 \003(\01324.google.analytics."
          + "data.v1alpha.RunPivotReportRequest\"l\n\034Ba"
          + "tchRunPivotReportsResponse\022L\n\rpivot_repo"
          + "rts\030\001 \003(\01325.google.analytics.data.v1alph"
          + "a.RunPivotReportResponse\"\035\n\033GetUniversal"
          + "MetadataRequest\"\231\001\n\021UniversalMetadata\022D\n"
          + "\ndimensions\030\001 \003(\01320.google.analytics.dat"
          + "a.v1alpha.DimensionMetadata\022>\n\007metrics\030\002"
          + " \003(\0132-.google.analytics.data.v1alpha.Met"
          + "ricMetadata2\327\007\n\022AlphaAnalyticsData\022\215\001\n\tR"
          + "unReport\022/.google.analytics.data.v1alpha"
          + ".RunReportRequest\0320.google.analytics.dat"
          + "a.v1alpha.RunReportResponse\"\035\202\323\344\223\002\027\"\022/v1"
          + "alpha:runReport:\001*\022\241\001\n\016RunPivotReport\0224."
          + "google.analytics.data.v1alpha.RunPivotRe"
          + "portRequest\0325.google.analytics.data.v1al"
          + "pha.RunPivotReportResponse\"\"\202\323\344\223\002\034\"\027/v1a"
          + "lpha:runPivotReport:\001*\022\245\001\n\017BatchRunRepor"
          + "ts\0225.google.analytics.data.v1alpha.Batch"
          + "RunReportsRequest\0326.google.analytics.dat"
          + "a.v1alpha.BatchRunReportsResponse\"#\202\323\344\223\002"
          + "\035\"\030/v1alpha:batchRunReports:\001*\022\271\001\n\024Batch"
          + "RunPivotReports\022:.google.analytics.data."
          + "v1alpha.BatchRunPivotReportsRequest\032;.go"
          + "ogle.analytics.data.v1alpha.BatchRunPivo"
          + "tReportsResponse\"(\202\323\344\223\002\"\"\035/v1alpha:batch"
          + "RunPivotReports:\001*\022\250\001\n\024GetUniversalMetad"
          + "ata\022:.google.analytics.data.v1alpha.GetU"
          + "niversalMetadataRequest\0320.google.analyti"
          + "cs.data.v1alpha.UniversalMetadata\"\"\202\323\344\223\002"
          + "\034\022\032/v1alpha/universalMetadata\032~\312A\034analyt"
          + "icsdata.googleapis.com\322A\\https://www.goo"
          + "gleapis.com/auth/analytics,https://www.g"
          + "oogleapis.com/auth/analytics.readonlyB\177\n"
          + "!com.google.analytics.data.v1alphaB\025Anal"
          + "yticsDataApiProtoP\001ZAgoogle.golang.org/g"
          + "enproto/googleapis/analytics/data/v1alph"
          + "a;datab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.analytics.data.v1alpha.ReportingApiProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_analytics_data_v1alpha_RunReportRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_analytics_data_v1alpha_RunReportRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1alpha_RunReportRequest_descriptor,
            new java.lang.String[] {
              "Entity",
              "Dimensions",
              "Metrics",
              "DateRanges",
              "Offset",
              "Limit",
              "MetricAggregations",
              "DimensionFilter",
              "MetricFilter",
              "OrderBys",
              "CurrencyCode",
              "CohortSpec",
              "KeepEmptyRows",
              "ReturnPropertyQuota",
            });
    internal_static_google_analytics_data_v1alpha_RunReportResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_analytics_data_v1alpha_RunReportResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1alpha_RunReportResponse_descriptor,
            new java.lang.String[] {
              "DimensionHeaders",
              "MetricHeaders",
              "Rows",
              "Totals",
              "Maximums",
              "Minimums",
              "RowCount",
              "Metadata",
              "PropertyQuota",
            });
    internal_static_google_analytics_data_v1alpha_RunPivotReportRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_analytics_data_v1alpha_RunPivotReportRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1alpha_RunPivotReportRequest_descriptor,
            new java.lang.String[] {
              "Entity",
              "Dimensions",
              "Metrics",
              "DimensionFilter",
              "MetricFilter",
              "Pivots",
              "DateRanges",
              "CurrencyCode",
              "CohortSpec",
              "KeepEmptyRows",
              "ReturnPropertyQuota",
            });
    internal_static_google_analytics_data_v1alpha_RunPivotReportResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_analytics_data_v1alpha_RunPivotReportResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1alpha_RunPivotReportResponse_descriptor,
            new java.lang.String[] {
              "PivotHeaders",
              "DimensionHeaders",
              "MetricHeaders",
              "Rows",
              "Aggregates",
              "Metadata",
              "PropertyQuota",
            });
    internal_static_google_analytics_data_v1alpha_BatchRunReportsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_analytics_data_v1alpha_BatchRunReportsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1alpha_BatchRunReportsRequest_descriptor,
            new java.lang.String[] {
              "Entity", "Requests",
            });
    internal_static_google_analytics_data_v1alpha_BatchRunReportsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_analytics_data_v1alpha_BatchRunReportsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1alpha_BatchRunReportsResponse_descriptor,
            new java.lang.String[] {
              "Reports",
            });
    internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsRequest_descriptor,
            new java.lang.String[] {
              "Entity", "Requests",
            });
    internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsResponse_descriptor,
            new java.lang.String[] {
              "PivotReports",
            });
    internal_static_google_analytics_data_v1alpha_GetUniversalMetadataRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_analytics_data_v1alpha_GetUniversalMetadataRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1alpha_GetUniversalMetadataRequest_descriptor,
            new java.lang.String[] {});
    internal_static_google_analytics_data_v1alpha_UniversalMetadata_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_analytics_data_v1alpha_UniversalMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1alpha_UniversalMetadata_descriptor,
            new java.lang.String[] {
              "Dimensions", "Metrics",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.analytics.data.v1alpha.ReportingApiProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
