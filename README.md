# Google Analytics Data Client for Java

Java idiomatic client for [Analytics Data][product-docs].

[![Maven][maven-version-image]][maven-version-link]
![Stability][stability-image]

- [Product Documentation][product-docs]
- [Client Library Documentation][javadocs]

> Note: This client is a work-in-progress, and may occasionally
> make backwards-incompatible changes.


## Quickstart


If you are using Maven, add this to your pom.xml file:


```xml
<dependency>
  <groupId>com.google.analytics</groupId>
  <artifactId>google-analytics-data</artifactId>
  <version>0.14.6</version>
</dependency>
```

If you are using Gradle without BOM, add this to your dependencies:

```Groovy
implementation 'com.google.analytics:google-analytics-data:0.14.6'
```

If you are using SBT, add this to your dependencies:

```Scala
libraryDependencies += "com.google.analytics" % "google-analytics-data" % "0.14.6"
```

## Authentication

See the [Authentication][authentication] section in the base directory's README.

## Authorization

The client application making API calls must be granted [authorization scopes][auth-scopes] required for the desired Analytics Data APIs, and the authenticated principal must have the [IAM role(s)][predefined-iam-roles] required to access GCP resources using the Analytics Data API calls.

## Getting Started

### Prerequisites

You will need a [Google Cloud Platform Console][developer-console] project with the Analytics Data [API enabled][enable-api].
You will need to [enable billing][enable-billing] to use Google Analytics Data.
[Follow these instructions][create-project] to get your project set up. You will also need to set up the local development environment by
[installing the Google Cloud SDK][cloud-sdk] and running the following commands in command line:
`gcloud auth login` and `gcloud config set project [YOUR PROJECT ID]`.

### Installation and setup

You'll need to obtain the `google-analytics-data` library.  See the [Quickstart](#quickstart) section
to add `google-analytics-data` as a dependency in your code.

## About Analytics Data


[Analytics Data][product-docs] provides programmatic methods to access report data in Google Analytics App+Web properties.

See the [Analytics Data client library docs][javadocs] to learn how to
use this Analytics Data Client Library.





## Samples

Samples are in the [`samples/`](https://github.com/googleapis/java-analytics-data/tree/main/samples) directory.

| Sample                      | Source Code                       | Try it |
| --------------------------- | --------------------------------- | ------ |
| Get Common Metadata Sample | [source code](https://github.com/googleapis/java-analytics-data/blob/main/samples/snippets/src/main/java/com/example/analytics/GetCommonMetadataSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-analytics-data&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/analytics/GetCommonMetadataSample.java) |
| Get Metadata By Property Id Sample | [source code](https://github.com/googleapis/java-analytics-data/blob/main/samples/snippets/src/main/java/com/example/analytics/GetMetadataByPropertyIdSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-analytics-data&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/analytics/GetMetadataByPropertyIdSample.java) |
| Quickstart Json Credentials Sample | [source code](https://github.com/googleapis/java-analytics-data/blob/main/samples/snippets/src/main/java/com/example/analytics/QuickstartJsonCredentialsSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-analytics-data&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/analytics/QuickstartJsonCredentialsSample.java) |
| Quickstart Sample | [source code](https://github.com/googleapis/java-analytics-data/blob/main/samples/snippets/src/main/java/com/example/analytics/QuickstartSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-analytics-data&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/analytics/QuickstartSample.java) |
| Run Batch Report Sample | [source code](https://github.com/googleapis/java-analytics-data/blob/main/samples/snippets/src/main/java/com/example/analytics/RunBatchReportSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-analytics-data&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/analytics/RunBatchReportSample.java) |
| Run Pivot Report Sample | [source code](https://github.com/googleapis/java-analytics-data/blob/main/samples/snippets/src/main/java/com/example/analytics/RunPivotReportSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-analytics-data&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/analytics/RunPivotReportSample.java) |
| Run Realtime Report Sample | [source code](https://github.com/googleapis/java-analytics-data/blob/main/samples/snippets/src/main/java/com/example/analytics/RunRealtimeReportSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-analytics-data&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/analytics/RunRealtimeReportSample.java) |
| Run Realtime Report With Multiple Dimensions Sample | [source code](https://github.com/googleapis/java-analytics-data/blob/main/samples/snippets/src/main/java/com/example/analytics/RunRealtimeReportWithMultipleDimensionsSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-analytics-data&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/analytics/RunRealtimeReportWithMultipleDimensionsSample.java) |
| Run Realtime Report With Multiple Metrics Sample | [source code](https://github.com/googleapis/java-analytics-data/blob/main/samples/snippets/src/main/java/com/example/analytics/RunRealtimeReportWithMultipleMetricsSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-analytics-data&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/analytics/RunRealtimeReportWithMultipleMetricsSample.java) |
| Run Report Sample | [source code](https://github.com/googleapis/java-analytics-data/blob/main/samples/snippets/src/main/java/com/example/analytics/RunReportSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-analytics-data&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/analytics/RunReportSample.java) |
| Run Report With Aggregations Sample | [source code](https://github.com/googleapis/java-analytics-data/blob/main/samples/snippets/src/main/java/com/example/analytics/RunReportWithAggregationsSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-analytics-data&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/analytics/RunReportWithAggregationsSample.java) |
| Run Report With Cohorts Sample | [source code](https://github.com/googleapis/java-analytics-data/blob/main/samples/snippets/src/main/java/com/example/analytics/RunReportWithCohortsSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-analytics-data&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/analytics/RunReportWithCohortsSample.java) |
| Run Report With Date Ranges Sample | [source code](https://github.com/googleapis/java-analytics-data/blob/main/samples/snippets/src/main/java/com/example/analytics/RunReportWithDateRangesSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-analytics-data&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/analytics/RunReportWithDateRangesSample.java) |
| Run Report With Dimension And Metric Filters Sample | [source code](https://github.com/googleapis/java-analytics-data/blob/main/samples/snippets/src/main/java/com/example/analytics/RunReportWithDimensionAndMetricFiltersSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-analytics-data&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/analytics/RunReportWithDimensionAndMetricFiltersSample.java) |
| Run Report With Dimension Exclude Filter Sample | [source code](https://github.com/googleapis/java-analytics-data/blob/main/samples/snippets/src/main/java/com/example/analytics/RunReportWithDimensionExcludeFilterSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-analytics-data&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/analytics/RunReportWithDimensionExcludeFilterSample.java) |
| Run Report With Dimension Filter Sample | [source code](https://github.com/googleapis/java-analytics-data/blob/main/samples/snippets/src/main/java/com/example/analytics/RunReportWithDimensionFilterSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-analytics-data&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/analytics/RunReportWithDimensionFilterSample.java) |
| Run Report With Dimension In List Filter Sample | [source code](https://github.com/googleapis/java-analytics-data/blob/main/samples/snippets/src/main/java/com/example/analytics/RunReportWithDimensionInListFilterSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-analytics-data&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/analytics/RunReportWithDimensionInListFilterSample.java) |
| Run Report With Multiple Dimension Filters Sample | [source code](https://github.com/googleapis/java-analytics-data/blob/main/samples/snippets/src/main/java/com/example/analytics/RunReportWithMultipleDimensionFiltersSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-analytics-data&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/analytics/RunReportWithMultipleDimensionFiltersSample.java) |
| Run Report With Multiple Dimensions Sample | [source code](https://github.com/googleapis/java-analytics-data/blob/main/samples/snippets/src/main/java/com/example/analytics/RunReportWithMultipleDimensionsSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-analytics-data&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/analytics/RunReportWithMultipleDimensionsSample.java) |
| Run Report With Multiple Metrics Sample | [source code](https://github.com/googleapis/java-analytics-data/blob/main/samples/snippets/src/main/java/com/example/analytics/RunReportWithMultipleMetricsSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-analytics-data&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/analytics/RunReportWithMultipleMetricsSample.java) |
| Run Report With Named Date Ranges Sample | [source code](https://github.com/googleapis/java-analytics-data/blob/main/samples/snippets/src/main/java/com/example/analytics/RunReportWithNamedDateRangesSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-analytics-data&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/analytics/RunReportWithNamedDateRangesSample.java) |
| Run Report With Ordering Sample | [source code](https://github.com/googleapis/java-analytics-data/blob/main/samples/snippets/src/main/java/com/example/analytics/RunReportWithOrderingSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-analytics-data&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/analytics/RunReportWithOrderingSample.java) |
| Run Report With Pagination Sample | [source code](https://github.com/googleapis/java-analytics-data/blob/main/samples/snippets/src/main/java/com/example/analytics/RunReportWithPaginationSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-analytics-data&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/analytics/RunReportWithPaginationSample.java) |
| Run Report With Property Quota Sample | [source code](https://github.com/googleapis/java-analytics-data/blob/main/samples/snippets/src/main/java/com/example/analytics/RunReportWithPropertyQuotaSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-analytics-data&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/analytics/RunReportWithPropertyQuotaSample.java) |



## Troubleshooting

To get help, follow the instructions in the [shared Troubleshooting document][troubleshooting].

## Transport

Analytics Data uses gRPC for the transport layer.

## Supported Java Versions

Java 8 or above is required for using this client.

Google's Java client libraries,
[Google Cloud Client Libraries][cloudlibs]
and
[Google Cloud API Libraries][apilibs],
follow the
[Oracle Java SE support roadmap][oracle]
(see the Oracle Java SE Product Releases section).

### For new development

In general, new feature development occurs with support for the lowest Java
LTS version covered by  Oracle's Premier Support (which typically lasts 5 years
from initial General Availability). If the minimum required JVM for a given
library is changed, it is accompanied by a [semver][semver] major release.

Java 11 and (in September 2021) Java 17 are the best choices for new
development.

### Keeping production systems current

Google tests its client libraries with all current LTS versions covered by
Oracle's Extended Support (which typically lasts 8 years from initial
General Availability).

#### Legacy support

Google's client libraries support legacy versions of Java runtimes with long
term stable libraries that don't receive feature updates on a best efforts basis
as it may not be possible to backport all patches.

Google provides updates on a best efforts basis to apps that continue to use
Java 7, though apps might need to upgrade to current versions of the library
that supports their JVM.

#### Where to find specific information

The latest versions and the supported Java versions are identified on
the individual GitHub repository `github.com/GoogleAPIs/java-SERVICENAME`
and on [google-cloud-java][g-c-j].

## Versioning


This library follows [Semantic Versioning](http://semver.org/).


It is currently in major version zero (``0.y.z``), which means that anything may change at any time
and the public API should not be considered stable.


## Contributing


Contributions to this library are always welcome and highly encouraged.

See [CONTRIBUTING][contributing] for more information how to get started.

Please note that this project is released with a Contributor Code of Conduct. By participating in
this project you agree to abide by its terms. See [Code of Conduct][code-of-conduct] for more
information.


## License

Apache 2.0 - See [LICENSE][license] for more information.

## CI Status

Java Version | Status
------------ | ------
Java 8 | [![Kokoro CI][kokoro-badge-image-2]][kokoro-badge-link-2]
Java 8 OSX | [![Kokoro CI][kokoro-badge-image-3]][kokoro-badge-link-3]
Java 8 Windows | [![Kokoro CI][kokoro-badge-image-4]][kokoro-badge-link-4]
Java 11 | [![Kokoro CI][kokoro-badge-image-5]][kokoro-badge-link-5]

Java is a registered trademark of Oracle and/or its affiliates.

[product-docs]: https://developers.google.com/analytics/trusted-testing/analytics-data
[javadocs]: https://googleapis.dev/java/google-analytics-data/latest/index.html
[kokoro-badge-image-1]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-analytics-data/java7.svg
[kokoro-badge-link-1]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-analytics-data/java7.html
[kokoro-badge-image-2]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-analytics-data/java8.svg
[kokoro-badge-link-2]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-analytics-data/java8.html
[kokoro-badge-image-3]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-analytics-data/java8-osx.svg
[kokoro-badge-link-3]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-analytics-data/java8-osx.html
[kokoro-badge-image-4]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-analytics-data/java8-win.svg
[kokoro-badge-link-4]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-analytics-data/java8-win.html
[kokoro-badge-image-5]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-analytics-data/java11.svg
[kokoro-badge-link-5]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-analytics-data/java11.html
[stability-image]: https://img.shields.io/badge/stability-preview-yellow
[maven-version-image]: https://img.shields.io/maven-central/v/com.google.analytics/google-analytics-data.svg
[maven-version-link]: https://search.maven.org/search?q=g:com.google.analytics%20AND%20a:google-analytics-data&core=gav
[authentication]: https://github.com/googleapis/google-cloud-java#authentication
[auth-scopes]: https://developers.google.com/identity/protocols/oauth2/scopes
[predefined-iam-roles]: https://cloud.google.com/iam/docs/understanding-roles#predefined_roles
[iam-policy]: https://cloud.google.com/iam/docs/overview#cloud-iam-policy
[developer-console]: https://console.developers.google.com/
[create-project]: https://cloud.google.com/resource-manager/docs/creating-managing-projects
[cloud-sdk]: https://cloud.google.com/sdk/
[troubleshooting]: https://github.com/googleapis/google-cloud-common/blob/main/troubleshooting/readme.md#troubleshooting
[contributing]: https://github.com/googleapis/java-analytics-data/blob/main/CONTRIBUTING.md
[code-of-conduct]: https://github.com/googleapis/java-analytics-data/blob/main/CODE_OF_CONDUCT.md#contributor-code-of-conduct
[license]: https://github.com/googleapis/java-analytics-data/blob/main/LICENSE
[enable-billing]: https://cloud.google.com/apis/docs/getting-started#enabling_billing
[enable-api]: https://console.cloud.google.com/flows/enableapi?apiid=analytics-data.googleapis.com
[libraries-bom]: https://github.com/GoogleCloudPlatform/cloud-opensource-java/wiki/The-Google-Cloud-Platform-Libraries-BOM
[shell_img]: https://gstatic.com/cloudssh/images/open-btn.png

[semver]: https://semver.org/
[cloudlibs]: https://cloud.google.com/apis/docs/client-libraries-explained
[apilibs]: https://cloud.google.com/apis/docs/client-libraries-explained#google_api_client_libraries
[oracle]: https://www.oracle.com/java/technologies/java-se-support-roadmap.html
[g-c-j]: http://github.com/googleapis/google-cloud-java
