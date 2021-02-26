/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.analytics.data.v1beta.stub;

import static com.google.analytics.data.v1beta.BetaAnalyticsDataClient.RunReportPagedResponse;

import com.google.analytics.data.v1beta.BatchRunPivotReportsRequest;
import com.google.analytics.data.v1beta.BatchRunPivotReportsResponse;
import com.google.analytics.data.v1beta.BatchRunReportsRequest;
import com.google.analytics.data.v1beta.BatchRunReportsResponse;
import com.google.analytics.data.v1beta.DimensionHeader;
import com.google.analytics.data.v1beta.GetMetadataRequest;
import com.google.analytics.data.v1beta.Metadata;
import com.google.analytics.data.v1beta.RunPivotReportRequest;
import com.google.analytics.data.v1beta.RunPivotReportResponse;
import com.google.analytics.data.v1beta.RunRealtimeReportRequest;
import com.google.analytics.data.v1beta.RunRealtimeReportResponse;
import com.google.analytics.data.v1beta.RunReportRequest;
import com.google.analytics.data.v1beta.RunReportResponse;
import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link BetaAnalyticsDataStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (analyticsdata.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of runPivotReport to 30 seconds:
 *
 * <pre>{@code
 * BetaAnalyticsDataStubSettings.Builder betaAnalyticsDataSettingsBuilder =
 *     BetaAnalyticsDataStubSettings.newBuilder();
 * betaAnalyticsDataSettingsBuilder
 *     .runPivotReportSettings()
 *     .setRetrySettings(
 *         betaAnalyticsDataSettingsBuilder
 *             .runPivotReportSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * BetaAnalyticsDataStubSettings betaAnalyticsDataSettings =
 *     betaAnalyticsDataSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class BetaAnalyticsDataStubSettings extends StubSettings<BetaAnalyticsDataStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/analytics")
          .add("https://www.googleapis.com/auth/analytics.readonly")
          .build();

  private final PagedCallSettings<RunReportRequest, RunReportResponse, RunReportPagedResponse>
      runReportSettings;
  private final UnaryCallSettings<RunPivotReportRequest, RunPivotReportResponse>
      runPivotReportSettings;
  private final UnaryCallSettings<BatchRunReportsRequest, BatchRunReportsResponse>
      batchRunReportsSettings;
  private final UnaryCallSettings<BatchRunPivotReportsRequest, BatchRunPivotReportsResponse>
      batchRunPivotReportsSettings;
  private final UnaryCallSettings<GetMetadataRequest, Metadata> getMetadataSettings;
  private final UnaryCallSettings<RunRealtimeReportRequest, RunRealtimeReportResponse>
      runRealtimeReportSettings;

  private static final PagedListDescriptor<RunReportRequest, RunReportResponse, DimensionHeader>
      RUN_REPORT_PAGE_STR_DESC =
          new PagedListDescriptor<RunReportRequest, RunReportResponse, DimensionHeader>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public RunReportRequest injectToken(RunReportRequest payload, String token) {
              return RunReportRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public RunReportRequest injectPageSize(RunReportRequest payload, int pageSize) {
              return RunReportRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(RunReportRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(RunReportResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<DimensionHeader> extractResources(RunReportResponse payload) {
              return payload.getDimensionHeadersList() == null
                  ? ImmutableList.<DimensionHeader>of()
                  : payload.getDimensionHeadersList();
            }
          };

  private static final PagedListResponseFactory<
          RunReportRequest, RunReportResponse, RunReportPagedResponse>
      RUN_REPORT_PAGE_STR_FACT =
          new PagedListResponseFactory<
              RunReportRequest, RunReportResponse, RunReportPagedResponse>() {
            @Override
            public ApiFuture<RunReportPagedResponse> getFuturePagedResponse(
                UnaryCallable<RunReportRequest, RunReportResponse> callable,
                RunReportRequest request,
                ApiCallContext context,
                ApiFuture<RunReportResponse> futureResponse) {
              PageContext<RunReportRequest, RunReportResponse, DimensionHeader> pageContext =
                  PageContext.create(callable, RUN_REPORT_PAGE_STR_DESC, request, context);
              return RunReportPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to runReport. */
  public PagedCallSettings<RunReportRequest, RunReportResponse, RunReportPagedResponse>
      runReportSettings() {
    return runReportSettings;
  }

  /** Returns the object with the settings used for calls to runPivotReport. */
  public UnaryCallSettings<RunPivotReportRequest, RunPivotReportResponse> runPivotReportSettings() {
    return runPivotReportSettings;
  }

  /** Returns the object with the settings used for calls to batchRunReports. */
  public UnaryCallSettings<BatchRunReportsRequest, BatchRunReportsResponse>
      batchRunReportsSettings() {
    return batchRunReportsSettings;
  }

  /** Returns the object with the settings used for calls to batchRunPivotReports. */
  public UnaryCallSettings<BatchRunPivotReportsRequest, BatchRunPivotReportsResponse>
      batchRunPivotReportsSettings() {
    return batchRunPivotReportsSettings;
  }

  /** Returns the object with the settings used for calls to getMetadata. */
  public UnaryCallSettings<GetMetadataRequest, Metadata> getMetadataSettings() {
    return getMetadataSettings;
  }

  /** Returns the object with the settings used for calls to runRealtimeReport. */
  public UnaryCallSettings<RunRealtimeReportRequest, RunRealtimeReportResponse>
      runRealtimeReportSettings() {
    return runRealtimeReportSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public BetaAnalyticsDataStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcBetaAnalyticsDataStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "analyticsdata.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(BetaAnalyticsDataStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected BetaAnalyticsDataStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    runReportSettings = settingsBuilder.runReportSettings().build();
    runPivotReportSettings = settingsBuilder.runPivotReportSettings().build();
    batchRunReportsSettings = settingsBuilder.batchRunReportsSettings().build();
    batchRunPivotReportsSettings = settingsBuilder.batchRunPivotReportsSettings().build();
    getMetadataSettings = settingsBuilder.getMetadataSettings().build();
    runRealtimeReportSettings = settingsBuilder.runRealtimeReportSettings().build();
  }

  /** Builder for BetaAnalyticsDataStubSettings. */
  public static class Builder extends StubSettings.Builder<BetaAnalyticsDataStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final PagedCallSettings.Builder<
            RunReportRequest, RunReportResponse, RunReportPagedResponse>
        runReportSettings;
    private final UnaryCallSettings.Builder<RunPivotReportRequest, RunPivotReportResponse>
        runPivotReportSettings;
    private final UnaryCallSettings.Builder<BatchRunReportsRequest, BatchRunReportsResponse>
        batchRunReportsSettings;
    private final UnaryCallSettings.Builder<
            BatchRunPivotReportsRequest, BatchRunPivotReportsResponse>
        batchRunPivotReportsSettings;
    private final UnaryCallSettings.Builder<GetMetadataRequest, Metadata> getMetadataSettings;
    private final UnaryCallSettings.Builder<RunRealtimeReportRequest, RunRealtimeReportResponse>
        runRealtimeReportSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "no_retry_1_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      definitions.put(
          "retry_policy_0_codes",
          ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList(StatusCode.Code.UNKNOWN)));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeout(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(60000L))
              .setTotalTimeout(Duration.ofMillis(60000L))
              .build();
      definitions.put("no_retry_1_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(1000L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(60000L))
              .setTotalTimeout(Duration.ofMillis(60000L))
              .build();
      definitions.put("retry_policy_0_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      runReportSettings = PagedCallSettings.newBuilder(RUN_REPORT_PAGE_STR_FACT);
      runPivotReportSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      batchRunReportsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      batchRunPivotReportsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getMetadataSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      runRealtimeReportSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              runReportSettings,
              runPivotReportSettings,
              batchRunReportsSettings,
              batchRunPivotReportsSettings,
              getMetadataSettings,
              runRealtimeReportSettings);
      initDefaults(this);
    }

    protected Builder(BetaAnalyticsDataStubSettings settings) {
      super(settings);

      runReportSettings = settings.runReportSettings.toBuilder();
      runPivotReportSettings = settings.runPivotReportSettings.toBuilder();
      batchRunReportsSettings = settings.batchRunReportsSettings.toBuilder();
      batchRunPivotReportsSettings = settings.batchRunPivotReportsSettings.toBuilder();
      getMetadataSettings = settings.getMetadataSettings.toBuilder();
      runRealtimeReportSettings = settings.runRealtimeReportSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              runReportSettings,
              runPivotReportSettings,
              batchRunReportsSettings,
              batchRunPivotReportsSettings,
              getMetadataSettings,
              runRealtimeReportSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .runReportSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .runPivotReportSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .batchRunReportsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .batchRunPivotReportsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .getMetadataSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .runRealtimeReportSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      return builder;
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'.
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to runReport. */
    public PagedCallSettings.Builder<RunReportRequest, RunReportResponse, RunReportPagedResponse>
        runReportSettings() {
      return runReportSettings;
    }

    /** Returns the builder for the settings used for calls to runPivotReport. */
    public UnaryCallSettings.Builder<RunPivotReportRequest, RunPivotReportResponse>
        runPivotReportSettings() {
      return runPivotReportSettings;
    }

    /** Returns the builder for the settings used for calls to batchRunReports. */
    public UnaryCallSettings.Builder<BatchRunReportsRequest, BatchRunReportsResponse>
        batchRunReportsSettings() {
      return batchRunReportsSettings;
    }

    /** Returns the builder for the settings used for calls to batchRunPivotReports. */
    public UnaryCallSettings.Builder<BatchRunPivotReportsRequest, BatchRunPivotReportsResponse>
        batchRunPivotReportsSettings() {
      return batchRunPivotReportsSettings;
    }

    /** Returns the builder for the settings used for calls to getMetadata. */
    public UnaryCallSettings.Builder<GetMetadataRequest, Metadata> getMetadataSettings() {
      return getMetadataSettings;
    }

    /** Returns the builder for the settings used for calls to runRealtimeReport. */
    public UnaryCallSettings.Builder<RunRealtimeReportRequest, RunRealtimeReportResponse>
        runRealtimeReportSettings() {
      return runRealtimeReportSettings;
    }

    @Override
    public BetaAnalyticsDataStubSettings build() throws IOException {
      return new BetaAnalyticsDataStubSettings(this);
    }
  }
}