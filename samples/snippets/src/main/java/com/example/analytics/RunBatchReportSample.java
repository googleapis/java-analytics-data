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

/* Google Analytics Data API sample application demonstrating the batch creation
of multiple reports.

See
https://developers.google.com/analytics/devguides/reporting/data/v1/rest/v1beta/properties/batchRunReports
for more information.

Before you start the application, please review the comments starting with
"TODO(developer)" and update the code to use correct values.

To run this sample using Maven:
  cd java-analytics-data/samples/snippets
  mvn compile
  mvn exec:java -Dexec.mainClass="com.example.analytics.RunBatchReportSample"
 */

// [START analyticsdata_run_batch_report]

import com.google.analytics.data.v1beta.*;

public class RunBatchReportSample {

  public static void main(String... args) throws Exception {
    /**
     * TODO(developer): Replace this variable with your Google Analytics 4 property ID before
     * running the sample.
     */
    String propertyId = "YOUR-GA4-PROPERTY-ID";
    sampleRunBatchReport(propertyId);
  }

  // Runs a batch report on a Google Analytics 4 property.
  static void sampleRunBatchReport(String propertyId) throws Exception {
    // Using a default constructor instructs the client to use the credentials
    // specified in GOOGLE_APPLICATION_CREDENTIALS environment variable.
    try (BetaAnalyticsDataClient analyticsData = BetaAnalyticsDataClient.create()) {

      BatchRunReportsRequest request =
          BatchRunReportsRequest.newBuilder()
              .setProperty("properties/" + propertyId)
              .addRequests(RunReportRequest.newBuilder()
                  .addDimensions(Dimension.newBuilder().setName("country"))
                  .addDimensions(Dimension.newBuilder().setName("region"))
                  .addDimensions(Dimension.newBuilder().setName("city"))
                  .addMetrics(Metric.newBuilder().setName("activeUsers"))
                  .addDateRanges(DateRange.newBuilder().setStartDate("2021-01-03")
                      .setEndDate("2021-01-09")))
              .addRequests(RunReportRequest.newBuilder()
                  .addDimensions(Dimension.newBuilder().setName("browser"))
                  .addMetrics(Metric.newBuilder().setName("activeUsers"))
                  .addDateRanges(DateRange.newBuilder().setStartDate("2021-01-01")
                      .setEndDate("2021-01-31")))
              .build();

      // Make the request.
      BatchRunReportsResponse response = analyticsData.batchRunReports(request);
      System.out.println("Batch report results:");
      for (RunReportResponse report: response.getReportsList()){
        RunReportResponse.printRunResponseResponse(response);
      }

    }
  }
}
// [END analyticsdata_run_batch_report]
