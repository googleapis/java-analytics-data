/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.analytics;

/* Google Analytics Data API sample application demonstrating the usage of property quota metadata.

See
https://developers.google.com/analytics/devguides/reporting/data/v1/rest/v1beta/properties/runReport#body.request_body.FIELDS.return_property_quota
for more information.

Before you start the application, please review the comments starting with
"TODO(developer)" and update the code to use correct values.

To run this sample using Maven:
  cd java-analytics-data/samples/snippets
  mvn compile
  mvn exec:java -Dexec.mainClass="com.example.analytics.RunReportWithPropertyQuotaSample"
 */

// [START analyticsdata_run_report_with_property_quota]

import com.google.analytics.data.v1beta.*;

public class RunReportWithPropertyQuotaSample {

  public static void main(String... args) throws Exception {
    /**
     * TODO(developer): Replace this variable with your Google Analytics 4 property ID before
     * running the sample.
     */
    String propertyId = "YOUR-GA4-PROPERTY-ID";
    sampleRunReportWithPropertyQuota(propertyId);
  }

  // Runs a report and prints property quota information.
  static void sampleRunReportWithPropertyQuota(String propertyId) throws Exception {
    // Using a default constructor instructs the client to use the credentials
    // specified in GOOGLE_APPLICATION_CREDENTIALS environment variable.
    try (BetaAnalyticsDataClient analyticsData = BetaAnalyticsDataClient.create()) {
      RunReportRequest request =
          RunReportRequest.newBuilder()
              .setProperty("properties/" + propertyId)
              .setReturnPropertyQuota(true)
              .addDimensions(Dimension.newBuilder().setName("country"))
              .addMetrics(Metric.newBuilder().setName("activeUsers"))
              .addDateRanges(DateRange.newBuilder().setStartDate("7daysAgo").setEndDate("today"))
              .build();

      // Make the request.
      RunReportResponse response = analyticsData.runReport(request);

      // [START analyticsdata_run_report_with_property_quota_print_response]
      if (response.hasPropertyQuota()){
        System.out.printf("Tokens per day quota consumed: %i, remaining: %i.%n", response.getPropertyQuota().getTokensPerDay().getConsumed(), response.getPropertyQuota().getTokensPerDay().getRemaining());
        System.out.printf("Tokens per hour quota consumed: %i, remaining: %i.%n", response.getPropertyQuota().getTokensPerHour().getConsumed(), response.getPropertyQuota().getTokensPerHour().getRemaining());
        System.out.printf("Concurrent requests quota consumed: %i, remaining: %i.%n", response.getPropertyQuota().getConcurrentRequests().getConsumed(), response.getPropertyQuota().getConcurrentRequests().getRemaining());
        System.out.printf("Server errors per project per hour quota consumed: %i, remaining: %i.%n", response.getPropertyQuota().getServerErrorsPerProjectPerHour().getConsumed(), response.getPropertyQuota().getServerErrorsPerProjectPerHour().getRemaining());
        System.out.printf("Potentially thresholded requests per hour quota consumed: %i, remaining: %i.%n", response.getPropertyQuota().getPotentiallyThresholdedRequestsPerHour().getConsumed(), response.getPropertyQuota().getPotentiallyThresholdedRequestsPerHour().getRemaining());
      }
      // [END analyticsdata_run_report_with_property_quota_print_response]
    }
  }

}
// [END analyticsdata_run_report_with_property_quota]