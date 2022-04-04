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

/* Google Analytics Data API sample application demonstrating the creation
of a basic report.

See
https://developers.google.com/analytics/devguides/reporting/data/v1/rest/v1beta/properties/runReport
for more information.

Before you start the application, please review the comments starting with
"TODO(developer)" and update the code to use correct values.

To run this sample using Maven:
  cd java-analytics-data/samples/snippets
  mvn compile
  mvn exec:java -Dexec.mainClass="com.example.analytics.RunReportWithNamedDateRangesSample"
 */

// [START analyticsdata_run_report_with_named_date_ranges]

import com.google.analytics.data.v1beta.*;

public class RunReportWithNamedDateRangesSample {

  public static void main(String... args) throws Exception {
    /**
     * TODO(developer): Replace this variable with your Google Analytics 4 property ID before
     * running the sample.
     */
    String propertyId = "YOUR-GA4-PROPERTY-ID";
    sampleRunReportWithNamedDateRanges(propertyId);
  }

  // Runs a report using named date ranges.
  static void sampleRunReportWithNamedDateRanges(String propertyId) throws Exception {
    // Using a default constructor instructs the client to use the credentials
    // specified in GOOGLE_APPLICATION_CREDENTIALS environment variable.
    try (BetaAnalyticsDataClient analyticsData = BetaAnalyticsDataClient.create()) {
      RunReportRequest request =
          RunReportRequest.newBuilder()
              .setProperty("properties/" + propertyId)
              .addDateRanges(DateRange.newBuilder().setStartDate("2020-01-01")
                  .setEndDate("2020-01-31").setName("year_ago"))
              .addDateRanges(DateRange.newBuilder().setStartDate("2021-01-01")
                  .setEndDate("2021-01-31").setName("current_year"))
              .addDimensions(Dimension.newBuilder().setName("country"))
              .addMetrics(Metric.newBuilder().setName("sessions"))
              .build();

      // Make the request.
      RunReportResponse response = analyticsData.runReport(request);
      RunReportSample.printRunResponseResponse(response);
    }
  }

}
// [END analyticsdata_run_report_with_named_date_ranges]