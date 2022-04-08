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

To run this sample using Maven:
  cd java-analytics-data/samples/snippets
  mvn compile
  mvn exec:java -Dexec.mainClass="com.example.analytics.GetMetadataByPropertyIdSample"
 */

// [START analyticsdata_get_metadata_by_property_id]

import com.google.analytics.data.v1beta.BetaAnalyticsDataClient;
import com.google.analytics.data.v1beta.GetMetadataRequest;
import com.google.analytics.data.v1beta.Metadata;

public class GetMetadataByPropertyIdSample {

  public static void main(String... args) throws Exception {
    /**
     * TODO(developer): Replace this variable with your Google Analytics 4 property ID before
     * running the sample.
     */
    String propertyId = "YOUR-GA4-PROPERTY-ID";
    sampleGetMetadataByPropertyId(propertyId);
  }

  // Retrieves dimensions and metrics available for a Google Analytics 4 property, including custom
  // fields.
  static void sampleGetMetadataByPropertyId(String propertyId) throws Exception {
    // Using a default constructor instructs the client to use the credentials
    // specified in GOOGLE_APPLICATION_CREDENTIALS environment variable.
    try (BetaAnalyticsDataClient analyticsData = BetaAnalyticsDataClient.create()) {
      GetMetadataRequest request =
          GetMetadataRequest.newBuilder()
              .setName("properties/" + propertyId + "/metadata")
              .build();

      // Make the request.
      Metadata response = analyticsData.getMetadata(request);

      System.out.printf("Dimensions and metrics available for Google Analytics 4 property %s "
          + "(including custom fields):", propertyId);
      GetCommonMetadataSample.printGetMetadataResponse(response);
    }
  }
}
// [END analyticsdata_get_metadata_by_property_id]
