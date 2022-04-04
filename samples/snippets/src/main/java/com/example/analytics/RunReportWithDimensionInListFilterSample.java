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

/* Google Analytics Data API sample application demonstrating the usage of
dimension and metric filters in a report.

See
https://developers.google.com/analytics/devguides/reporting/data/v1/rest/v1beta/properties/runReport#body.request_body.FIELDS.dimension_filter
for more information.

Before you start the application, please review the comments starting with
"TODO(developer)" and update the code to use correct values.

To run this sample using Maven:
  cd java-analytics-data/samples/snippets
  mvn compile
  mvn exec:java -Dexec.mainClass="com.example.analytics.RunReportWithDimensionInListFilterSample"
 */

// [START analyticsdata_run_report_with_dimension_in_list_filter]

import com.google.analytics.data.v1beta.BetaAnalyticsDataClient;
import com.google.analytics.data.v1beta.DateRange;
import com.google.analytics.data.v1beta.Dimension;
import com.google.analytics.data.v1beta.Filter;
import com.google.analytics.data.v1beta.FilterExpression;
import com.google.analytics.data.v1beta.Metric;
import com.google.analytics.data.v1beta.RunReportRequest;
import com.google.analytics.data.v1beta.RunReportResponse;

import java.util.ArrayList;

public class RunReportWithDimensionInListFilterSample {

  public static void main(String... args) throws Exception {
    /**
     * TODO(developer): Replace this variable with your Google Analytics 4 property ID before
     * running the sample.
     */
    String propertyId = "YOUR-GA4-PROPERTY-ID";
    sampleRunReportWithDimensionInListFilter(propertyId);
  }

  // Runs a report using a dimension filter with `in_list_filter` expression. The filter selects for
  // when `eventName` is set to one of three event names specified in the query.
  // This sample uses relative date range values.
  // See https://developers.google.com/analytics/devguides/reporting/data/v1/rest/v1beta/DateRange
  // for more information.
  static void sampleRunReportWithDimensionInListFilter(String propertyId) throws Exception {
    // Using a default constructor instructs the client to use the credentials
    // specified in GOOGLE_APPLICATION_CREDENTIALS environment variable.
    try (BetaAnalyticsDataClient analyticsData = BetaAnalyticsDataClient.create()) {
      RunReportRequest request =
          RunReportRequest.newBuilder()
              .setProperty("properties/" + propertyId)
              .addDimensions(Dimension.newBuilder().setName("eventName"))
              .addMetrics(Metric.newBuilder().setName("sessions"))
              .addDateRanges(DateRange.newBuilder().setStartDate("7daysAgo").setEndDate("yesterday"))
              .setDimensionFilter(FilterExpression.newBuilder()
                  .setFilter(Filter.newBuilder()
                      .setFieldName("eventName")
                      .setInListFilter(Filter.InListFilter.newBuilder()
                          .addAllValues(new ArrayList<String>() {
                            {
                              add("purchase");
                              add("in_app_purchase");
                              add("app_store_subscription_renew");
                            }}
                          ).build())
                     ))
              .build();

      // Make the request.
      RunReportResponse response = analyticsData.runReport(request);
      RunReportSample.printRunResponseResponse(response);
    }
  }

}
// [END analyticsdata_run_report_with_dimension_in_list_filter]