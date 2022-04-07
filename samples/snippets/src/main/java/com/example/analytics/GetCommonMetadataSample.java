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

/* Google Analytics Data API sample application retrieving dimension and metrics
metadata.

See https://developers.google.com/analytics/devguides/reporting/data/v1/rest/v1beta/properties/getMetadata
for more information.

Before you start the application, please review the comments starting with
"TODO(developer)" and update the code to use correct values.

To run this sample using Maven:
  cd java-analytics-data/samples/snippets
  mvn compile
  mvn exec:java -Dexec.mainClass="com.example.analytics.GetCommonMetadataSample"
 */

// [START analyticsdata_get_common_metadata]

import com.google.analytics.data.v1beta.*;

public class GetCommonMetadataSample {

  public static void main(String... args) throws Exception {
    /**
     * TODO(developer): Replace this variable with your Google Analytics 4 property ID before
     * running the sample.
     */
    String propertyId = "YOUR-GA4-PROPERTY-ID";
    sampleGetCommonMetadata(propertyId);
  }

  // Retrieves dimensions and metrics available for all Google Analytics 4 properties.
  static void sampleGetCommonMetadata(String propertyId) throws Exception {
    // Using a default constructor instructs the client to use the credentials
    // specified in GOOGLE_APPLICATION_CREDENTIALS environment variable.
    try (BetaAnalyticsDataClient analyticsData = BetaAnalyticsDataClient.create()) {
      GetMetadataRequest request =
          GetMetadataRequest.newBuilder()
              .setName("properties/" + propertyId)
              .build();

      // Make the request.
      Metadata response = analyticsData.getMetadata(request);
      printRunResponseResponse(response);
    }
  }

  // Prints results of the getMetadata call.
  static void printGetMetadataResponse(Metadata response) {
    // [START analyticsdata_print_get_metadata_response]
    for (Dimension dimension : response.getDimensions()) {
      System.out.println("DIMENSION");
    }
    System.out.printf("%s rows received%n", response.getRowsList().size());

    for (DimensionHeader header : response.getDimensionHeadersList()) {
      System.out.printf("Dimension header name: %s%n", header.getName());
    }

    for (MetricHeader header : response.getMetricHeadersList()) {
      System.out.printf("Metric header name: %s (%s)%n", header.getName(), header.getType());
    }
    // [END analyticsdata_print_run_report_response_header]

    // [START analyticsdata_print_run_report_response_rows]
    System.out.println("Report result:");
    for (Row row : response.getRowsList()) {
      System.out.printf(
          "%s, %s%n", row.getDimensionValues(0).getValue(),
          row.getMetricValues(0).getValue());
    }
    // [END analyticsdata_print_get_metadata_response]
  }
}
// [END analyticsdata_get_common_metadata]
