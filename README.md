<div align="left">

[![Visit Paychex](./header.png)](https://paychex.com)

# [Paychex](https://paychex.com)



# Developer Resources
 Refer
[Developer Resources](https://developer.paychex.com/resources/overview/) for more details on API specification 

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Paychex&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>paychex-java-sdk</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:paychex-java-sdk:1.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/paychex-java-sdk-1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String grantType = "grantType_example"; // Send \\\"client_credentials\\\".
    String clientId = "clientId_example"; // The applications API key.
    String clientSecret = "clientSecret_example"; // The applications corresponding secret.
    try {
      Authentication result = client
              .authentication
              .createBearerToken(grantType, clientId, clientSecret)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessToken());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getScope());
      System.out.println(result.getTokenType());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#createBearerToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Authentication> response = client
              .authentication
              .createBearerToken(grantType, clientId, clientSecret)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#createBearerToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.paychex.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticationApi* | [**createBearerToken**](docs/AuthenticationApi.md#createBearerToken) | **POST** /auth/oauth/v2/token | Create Bearer token
*CompanyApi* | [**addInProgressWorkers**](docs/CompanyApi.md#addInProgressWorkers) | **POST** /companies/{companyId}/workers | In Progress Workers
*CompanyApi* | [**addJob**](docs/CompanyApi.md#addJob) | **POST** /companies/{companyId}/jobs | Company Job
*CompanyApi* | [**createCustomFieldAtCompanyLevel**](docs/CompanyApi.md#createCustomFieldAtCompanyLevel) | **POST** /companies/{companyId}/customfields | Custom Field
*CompanyApi* | [**createCustomFieldCategory**](docs/CompanyApi.md#createCustomFieldCategory) | **POST** /companies/{companyId}/customfieldscategories | Custom Fields Category
*CompanyApi* | [**deleteCustomField**](docs/CompanyApi.md#deleteCustomField) | **DELETE** /companies/{companyId}/customfields/{customfieldid} | Custom Field
*CompanyApi* | [**deleteCustomFieldsCategory**](docs/CompanyApi.md#deleteCustomFieldsCategory) | **DELETE** /companies/{companyId}/customfieldscategories/{categoryid} | Custom Fields Category
*CompanyApi* | [**getCalculationBases**](docs/CompanyApi.md#getCalculationBases) | **GET** /companies/{companyId}/calculationbases | Company Calculation Bases
*CompanyApi* | [**getContactTypes**](docs/CompanyApi.md#getContactTypes) | **GET** /companies/{companyId}/contacttypes | Company Contact Types
*CompanyApi* | [**getCustomField**](docs/CompanyApi.md#getCustomField) | **GET** /companies/{companyId}/customfields/{customFieldId} | Custom Field
*CompanyApi* | [**getCustomFieldCategories**](docs/CompanyApi.md#getCustomFieldCategories) | **GET** /companies/{companyId}/customfieldscategories | Custom Fields Categories
*CompanyApi* | [**getCustomFields**](docs/CompanyApi.md#getCustomFields) | **GET** /companies/{companyId}/customfields | Custom Fields
*CompanyApi* | [**getCustomFieldsCategory**](docs/CompanyApi.md#getCustomFieldsCategory) | **GET** /companies/{companyId}/customfieldscategories/{categoryId} | Custom Fields Category
*CompanyApi* | [**getInformation**](docs/CompanyApi.md#getInformation) | **GET** /companies/{companyId} | A Company
*CompanyApi* | [**getJobInformation**](docs/CompanyApi.md#getJobInformation) | **GET** /companies/{companyId}/jobs/{jobId} | Company Job
*CompanyApi* | [**getJobSegmentStructureSetup**](docs/CompanyApi.md#getJobSegmentStructureSetup) | **GET** /companies/{companyId}/jobsegments | Company Job Segments
*CompanyApi* | [**getJobTitle**](docs/CompanyApi.md#getJobTitle) | **GET** /companies/{companyId}/jobtitles/{jobTitleId} | Job Title
*CompanyApi* | [**getJobs**](docs/CompanyApi.md#getJobs) | **GET** /companies/{companyId}/jobs | Company Jobs
*CompanyApi* | [**getLaborAssignment**](docs/CompanyApi.md#getLaborAssignment) | **GET** /companies/{companyId}/laborassignments/{laborAssignmentId} | Company Labour Assignment
*CompanyApi* | [**getLocation**](docs/CompanyApi.md#getLocation) | **GET** /companies/{companyId}/locations/{locationId} | Company Location
*CompanyApi* | [**getLocations**](docs/CompanyApi.md#getLocations) | **GET** /companies/{companyId}/locations | Company Locations
*CompanyApi* | [**getOrganization**](docs/CompanyApi.md#getOrganization) | **GET** /companies/{companyId}/organizations/{orgId} | Company Organization
*CompanyApi* | [**getOrganizations**](docs/CompanyApi.md#getOrganizations) | **GET** /companies/{companyId}/organizations | Company Organizations
*CompanyApi* | [**getPayFrequencies**](docs/CompanyApi.md#getPayFrequencies) | **GET** /companies/{companyId}/payfrequencies | Company Pay Frequencies
*CompanyApi* | [**getStatus**](docs/CompanyApi.md#getStatus) | **GET** /companies/{companyId}/workerstatuses/{statusId} | Company Worker Status
*CompanyApi* | [**getWorkers**](docs/CompanyApi.md#getWorkers) | **GET** /companies/{companyId}/workers | Company Workers
*CompanyApi* | [**list**](docs/CompanyApi.md#list) | **GET** /companies | Companies
*CompanyApi* | [**listJobTitles**](docs/CompanyApi.md#listJobTitles) | **GET** /companies/{companyId}/jobtitles | Company Job Titles
*CompanyApi* | [**listLaborAssignments**](docs/CompanyApi.md#listLaborAssignments) | **GET** /companies/{companyId}/laborassignments | Company Labour Assignments
*CompanyApi* | [**listWorkerStatuses**](docs/CompanyApi.md#listWorkerStatuses) | **GET** /companies/{companyId}/workerstatuses | Company Worker Statuses
*CompanyApi* | [**updateCustomField**](docs/CompanyApi.md#updateCustomField) | **PATCH** /companies/{companyId}/customfields/{customfieldid} | Custom Field
*CompanyApi* | [**updateCustomFieldsCategory**](docs/CompanyApi.md#updateCustomFieldsCategory) | **PATCH** /companies/{companyId}/customfieldscategories/{categoryid} | Custom Fields Category
*CompanyApi* | [**updateJob**](docs/CompanyApi.md#updateJob) | **PATCH** /companies/{companyId}/jobs/{jobId} | Company Job
*ManagementApi* | [**linkPaychexClients**](docs/ManagementApi.md#linkPaychexClients) | **POST** /management/requestclientaccess | Request Client Access
*PayrollApi* | [**addCompanyChecks**](docs/PayrollApi.md#addCompanyChecks) | **POST** /companies/{companyId}/checks | Company Checks
*PayrollApi* | [**addPayComponentToCheck**](docs/PayrollApi.md#addPayComponentToCheck) | **POST** /checks/{checkId}/checkcomponents | Pay Component to a check.
*PayrollApi* | [**addWorkerCheck**](docs/PayrollApi.md#addWorkerCheck) | **POST** /workers/{workerId}/checks | Worker Check
*PayrollApi* | [**deleteChecksByPayPeriodAndUser**](docs/PayrollApi.md#deleteChecksByPayPeriodAndUser) | **DELETE** /checks | Checks by Pay Period and User
*PayrollApi* | [**getCompanyChecksByPayPeriod**](docs/PayrollApi.md#getCompanyChecksByPayPeriod) | **GET** /companies/{companyId}/checks | Company Checks
*PayrollApi* | [**getCompanyPayComponent**](docs/PayrollApi.md#getCompanyPayComponent) | **GET** /companies/{companyId}/paycomponents/{paycomponentId} | Company Pay Component
*PayrollApi* | [**getCompanyPayComponents**](docs/PayrollApi.md#getCompanyPayComponents) | **GET** /companies/{companyId}/paycomponents | Company Pay Components
*PayrollApi* | [**getCompanyPayPeriods**](docs/PayrollApi.md#getCompanyPayPeriods) | **GET** /companies/{companyId}/payperiods | Company Pay Periods
*PayrollApi* | [**getPayPeriod**](docs/PayrollApi.md#getPayPeriod) | **GET** /companies/{companyId}/payperiods/{payperiodId} | Company Pay Period
*PayrollApi* | [**getWorkerCheck**](docs/PayrollApi.md#getWorkerCheck) | **GET** /workers/{workerId}/checks/{externalCheckId} | Worker Check
*PayrollApi* | [**getWorkerChecksByPayPeriod**](docs/PayrollApi.md#getWorkerChecksByPayPeriod) | **GET** /workers/{workerId}/checks | Worker Checks
*PayrollApi* | [**removePayComponent**](docs/PayrollApi.md#removePayComponent) | **DELETE** /checks/{checkId}/checkcomponents/{checkComponentId} | Pay Component of a check
*PayrollApi* | [**removeWorkerCheck**](docs/PayrollApi.md#removeWorkerCheck) | **DELETE** /workers/{workerId}/checks/{externalCheckId} | Worker Check
*PayrollApi* | [**updatePayComponent**](docs/PayrollApi.md#updatePayComponent) | **PATCH** /checks/{checkId}/checkcomponents/{checkComponentId} | Pay Component of a Check
*WebhooksApi* | [**addWebhook**](docs/WebhooksApi.md#addWebhook) | **POST** /management/hooks | Add Webhook
*WebhooksApi* | [**deleteById**](docs/WebhooksApi.md#deleteById) | **DELETE** /management/hooks/{hookId} | Delete Webhook
*WebhooksApi* | [**getAvailableDomains**](docs/WebhooksApi.md#getAvailableDomains) | **GET** /management/domains | Get Webhook domains
*WebhooksApi* | [**getSpecificHookById**](docs/WebhooksApi.md#getSpecificHookById) | **GET** /management/hooks/{hookId} | Webhook
*WebhooksApi* | [**list**](docs/WebhooksApi.md#list) | **GET** /management/hooks | List Webhooks
*WorkerApi* | [**addCommunication**](docs/WorkerApi.md#addCommunication) | **POST** /workers/{workerId}/communications | Worker Communication
*WorkerApi* | [**addDirectDeposit**](docs/WorkerApi.md#addDirectDeposit) | **POST** /workers/{workerId}/directdeposits | Worker Direct Deposit
*WorkerApi* | [**addFederalTaxSetup**](docs/WorkerApi.md#addFederalTaxSetup) | **POST** /workers/{workerId}/federaltax | Worker Federal Tax
*WorkerApi* | [**addPayComponent**](docs/WorkerApi.md#addPayComponent) | **POST** /workers/{workerId}/paycomponents | Worker Pay Component
*WorkerApi* | [**addPayRate**](docs/WorkerApi.md#addPayRate) | **POST** /workers/{workerId}/compensation/payrates | Worker Pay Rate
*WorkerApi* | [**addWorkerContacts**](docs/WorkerApi.md#addWorkerContacts) | **POST** /workers/{workerId}/contacts | Worker Contacts
*WorkerApi* | [**createCustomField**](docs/WorkerApi.md#createCustomField) | **POST** /workers/{workerId}/customfields | Worker Custom Field
*WorkerApi* | [**deleteContactByContactId**](docs/WorkerApi.md#deleteContactByContactId) | **DELETE** /workers/{workerId}/contacts/{contactId} | Worker Contact
*WorkerApi* | [**deleteCustomField**](docs/WorkerApi.md#deleteCustomField) | **DELETE** /workers/{workerId}/customfields/{workerCustomFieldId} | Worker Custom Field
*WorkerApi* | [**deleteInProgress**](docs/WorkerApi.md#deleteInProgress) | **DELETE** /workers/{workerId} | Worker
*WorkerApi* | [**getCommunicationItem**](docs/WorkerApi.md#getCommunicationItem) | **GET** /workers/{workerId}/communications/{communicationId} | Worker Communication
*WorkerApi* | [**getCommunications**](docs/WorkerApi.md#getCommunications) | **GET** /workers/{workerId}/communications | Worker Communications
*WorkerApi* | [**getCompensationInformation**](docs/WorkerApi.md#getCompensationInformation) | **GET** /workers/{workerId}/compensation | Worker Compensation
*WorkerApi* | [**getContactByContactId**](docs/WorkerApi.md#getContactByContactId) | **GET** /workers/{workerId}/contacts/{contactId} | Worker Contact
*WorkerApi* | [**getContacts**](docs/WorkerApi.md#getContacts) | **GET** /workers/{workerId}/contacts | Worker Contacts
*WorkerApi* | [**getCustomField**](docs/WorkerApi.md#getCustomField) | **GET** /workers/{workerId}/customfields/{workerCustomFieldId} | Worker Custom Field
*WorkerApi* | [**getCustomFields**](docs/WorkerApi.md#getCustomFields) | **GET** /workers/{workerId}/customfields | Worker Custom Fields
*WorkerApi* | [**getDirectDeposit**](docs/WorkerApi.md#getDirectDeposit) | **GET** /workers/{workerId}/directdeposits/{directDepositId} | Worker Direct Deposit
*WorkerApi* | [**getFederalTaxSetup**](docs/WorkerApi.md#getFederalTaxSetup) | **GET** /workers/{workerId}/federaltax | Worker Federal Tax
*WorkerApi* | [**getInformation**](docs/WorkerApi.md#getInformation) | **GET** /workers/{workerId} | Worker
*WorkerApi* | [**getPayComponent**](docs/WorkerApi.md#getPayComponent) | **GET** /workers/{workerId}/paycomponents/{workerComponentId} | Worker Pay Component
*WorkerApi* | [**getPayComponents**](docs/WorkerApi.md#getPayComponents) | **GET** /workers/{workerId}/paycomponents | Worker Pay Components
*WorkerApi* | [**getPayRate**](docs/WorkerApi.md#getPayRate) | **GET** /workers/{workerId}/compensation/payrates/{rateId} | Worker Pay Rate
*WorkerApi* | [**getPayRatesByWorkerId**](docs/WorkerApi.md#getPayRatesByWorkerId) | **GET** /workers/{workerId}/compensation/payrates | Worker Pay Rates
*WorkerApi* | [**getPayStandards**](docs/WorkerApi.md#getPayStandards) | **GET** /workers/{workerId}/compensation/paystandards | Worker Pay Standards
*WorkerApi* | [**getTimeOffBalance**](docs/WorkerApi.md#getTimeOffBalance) | **GET** /workers/{workerId}/timeoff | Worker Time Off
*WorkerApi* | [**getWorkerStatusList**](docs/WorkerApi.md#getWorkerStatusList) | **GET** /workers/{workerId}/status | Worker Statuses
*WorkerApi* | [**listAssignmentDistributions**](docs/WorkerApi.md#listAssignmentDistributions) | **GET** /workers/{workerId}/assignmentdistributions | Worker Assignments
*WorkerApi* | [**listDirectDeposits**](docs/WorkerApi.md#listDirectDeposits) | **GET** /workers/{workerId}/directdeposits | Worker Direct Deposits
*WorkerApi* | [**removeCommunication**](docs/WorkerApi.md#removeCommunication) | **DELETE** /workers/{workerId}/communications/{communicationId} | Worker Communication
*WorkerApi* | [**removeDirectDeposit**](docs/WorkerApi.md#removeDirectDeposit) | **DELETE** /workers/{workerId}/directdeposits/{directDepositId} | Worker Direct Deposit
*WorkerApi* | [**removeFederalTax**](docs/WorkerApi.md#removeFederalTax) | **DELETE** /workers/{workerId}/federaltax | Worker Federal Tax
*WorkerApi* | [**removePayComponent**](docs/WorkerApi.md#removePayComponent) | **DELETE** /workers/{workerId}/paycomponents/{workerComponentId} | Worker Pay Component
*WorkerApi* | [**removePayRate**](docs/WorkerApi.md#removePayRate) | **DELETE** /workers/{workerId}/compensation/payrates/{rateId} | Worker Pay Rate
*WorkerApi* | [**updateCommunicationItem**](docs/WorkerApi.md#updateCommunicationItem) | **PATCH** /workers/{workerId}/communications/{communicationId} | Worker Communication
*WorkerApi* | [**updateCompensationRate**](docs/WorkerApi.md#updateCompensationRate) | **PATCH** /workers/{workerId}/compensation/payrates/{rateId} | Worker Pay Rate
*WorkerApi* | [**updateContact**](docs/WorkerApi.md#updateContact) | **PATCH** /workers/{workerId}/contacts/{contactId} | Worker Contacts
*WorkerApi* | [**updateCustomField**](docs/WorkerApi.md#updateCustomField) | **PATCH** /workers/{workerId}/customfields/{workerCustomFieldId} | Worker CustomField
*WorkerApi* | [**updateDirectDeposit**](docs/WorkerApi.md#updateDirectDeposit) | **PATCH** /workers/{workerId}/directdeposits/{directDepositId} | Worker Direct Deposit
*WorkerApi* | [**updateDirectDeposits**](docs/WorkerApi.md#updateDirectDeposits) | **PATCH** /workers/{workerId}/directdeposits | Worker Direct Deposits
*WorkerApi* | [**updateFederalTaxSetup**](docs/WorkerApi.md#updateFederalTaxSetup) | **PATCH** /workers/{workerId}/federaltax | Worker Federal Tax
*WorkerApi* | [**updatePayComponent**](docs/WorkerApi.md#updatePayComponent) | **PATCH** /workers/{workerId}/paycomponents/{workerComponentId} | Worker Pay Component
*WorkerApi* | [**updatePayComponents**](docs/WorkerApi.md#updatePayComponents) | **PATCH** /workers/{workerId}/paycomponents | Worker Pay Components
*WorkerApi* | [**updateUniqueWorker**](docs/WorkerApi.md#updateUniqueWorker) | **PATCH** /workers/{workerId} | Worker


## Documentation for Models

 - [AcknowledgementResource](docs/AcknowledgementResource.md)
 - [Authentication](docs/Authentication.md)
 - [Authentication1](docs/Authentication1.md)
 - [AuthenticationCreateBearerTokenRequest](docs/AuthenticationCreateBearerTokenRequest.md)
 - [CalcMethod](docs/CalcMethod.md)
 - [CalculationBase](docs/CalculationBase.md)
 - [CheckResource](docs/CheckResource.md)
 - [CheckResource1](docs/CheckResource1.md)
 - [CheckResource2](docs/CheckResource2.md)
 - [CheckSummaryResource](docs/CheckSummaryResource.md)
 - [Client](docs/Client.md)
 - [ClientAccount](docs/ClientAccount.md)
 - [ClientAccountRegistration](docs/ClientAccountRegistration.md)
 - [ClientAccountRelation](docs/ClientAccountRelation.md)
 - [ClientAddress](docs/ClientAddress.md)
 - [ClientAddressVersion](docs/ClientAddressVersion.md)
 - [ClientName](docs/ClientName.md)
 - [ClientNameVersion](docs/ClientNameVersion.md)
 - [ClientPayComponentFrequency](docs/ClientPayComponentFrequency.md)
 - [ClientPayComponentOptions](docs/ClientPayComponentOptions.md)
 - [ClientPayComponentResponse](docs/ClientPayComponentResponse.md)
 - [ClientPayComponentWorkerTypes](docs/ClientPayComponentWorkerTypes.md)
 - [ClientVersion](docs/ClientVersion.md)
 - [CollectionResource](docs/CollectionResource.md)
 - [CommunicationResource](docs/CommunicationResource.md)
 - [CommunicationResource1](docs/CommunicationResource1.md)
 - [CompanyIdResource](docs/CompanyIdResource.md)
 - [CompanyResource](docs/CompanyResource.md)
 - [ContactTypeResource](docs/ContactTypeResource.md)
 - [ContactTypeResource1](docs/ContactTypeResource1.md)
 - [CustomFieldsCategoryResource](docs/CustomFieldsCategoryResource.md)
 - [CustomFieldsDropdownResource](docs/CustomFieldsDropdownResource.md)
 - [CustomFieldsResource](docs/CustomFieldsResource.md)
 - [DeepUrlResponseResource](docs/DeepUrlResponseResource.md)
 - [DirectDepositResource](docs/DirectDepositResource.md)
 - [EmailResource](docs/EmailResource.md)
 - [EmailResource1](docs/EmailResource1.md)
 - [EntityCommunicationResource](docs/EntityCommunicationResource.md)
 - [EntityResource](docs/EntityResource.md)
 - [ErrorMessageResource](docs/ErrorMessageResource.md)
 - [FrequencyCombinationUnitResource](docs/FrequencyCombinationUnitResource.md)
 - [FrequencyIntervalsResource](docs/FrequencyIntervalsResource.md)
 - [FrequencyIntervalsResource1](docs/FrequencyIntervalsResource1.md)
 - [HealthMonitoringMBean](docs/HealthMonitoringMBean.md)
 - [JobResource](docs/JobResource.md)
 - [JobSegmentsConfigResource](docs/JobSegmentsConfigResource.md)
 - [JobSegmentsResource](docs/JobSegmentsResource.md)
 - [JobTitleResource](docs/JobTitleResource.md)
 - [JobTitleResource1](docs/JobTitleResource1.md)
 - [LaborAssignmentResource](docs/LaborAssignmentResource.md)
 - [LegalIdResource](docs/LegalIdResource.md)
 - [LegalIdResource1](docs/LegalIdResource1.md)
 - [Link](docs/Link.md)
 - [LocationResource](docs/LocationResource.md)
 - [MetadataResource](docs/MetadataResource.md)
 - [NameResource](docs/NameResource.md)
 - [NameResource1](docs/NameResource1.md)
 - [OrganizationResource](docs/OrganizationResource.md)
 - [OrganizationResource1](docs/OrganizationResource1.md)
 - [OrganizationResource2](docs/OrganizationResource2.md)
 - [PaginationMetadataResource](docs/PaginationMetadataResource.md)
 - [PartnerLinkRequestResource](docs/PartnerLinkRequestResource.md)
 - [PayComponent](docs/PayComponent.md)
 - [PayComponentFrequencyTypeResource](docs/PayComponentFrequencyTypeResource.md)
 - [PayComponentFrequencyTypeResource1](docs/PayComponentFrequencyTypeResource1.md)
 - [PayComponentResource](docs/PayComponentResource.md)
 - [PayComponentResource1](docs/PayComponentResource1.md)
 - [PayComponentResource2](docs/PayComponentResource2.md)
 - [PayPeriodResource](docs/PayPeriodResource.md)
 - [PayRateResource](docs/PayRateResource.md)
 - [PayRatesStandardResource](docs/PayRatesStandardResource.md)
 - [PayStandardResource](docs/PayStandardResource.md)
 - [PersonCommunicationResource](docs/PersonCommunicationResource.md)
 - [PersonResource](docs/PersonResource.md)
 - [PostalResource](docs/PostalResource.md)
 - [ProcessedCheckComponentResource](docs/ProcessedCheckComponentResource.md)
 - [ProcessedCheckResource](docs/ProcessedCheckResource.md)
 - [PurchaseResource](docs/PurchaseResource.md)
 - [PurchaseResource1](docs/PurchaseResource1.md)
 - [RecurringResource](docs/RecurringResource.md)
 - [RelationTypeResource](docs/RelationTypeResource.md)
 - [RelationTypeResource1](docs/RelationTypeResource1.md)
 - [RelationshipResource](docs/RelationshipResource.md)
 - [ReportResource](docs/ReportResource.md)
 - [Status](docs/Status.md)
 - [Status1](docs/Status1.md)
 - [SupervisorResource](docs/SupervisorResource.md)
 - [SupervisorResource1](docs/SupervisorResource1.md)
 - [TelecomResource](docs/TelecomResource.md)
 - [TimeOffResource](docs/TimeOffResource.md)
 - [WebhookRequest](docs/WebhookRequest.md)
 - [WebhookResponse](docs/WebhookResponse.md)
 - [WebhooksGetSpecificHookByIdResponse](docs/WebhooksGetSpecificHookByIdResponse.md)
 - [WebhooksListResponseInner](docs/WebhooksListResponseInner.md)
 - [WorkerAssignmentDistributionsResource](docs/WorkerAssignmentDistributionsResource.md)
 - [WorkerContactResource](docs/WorkerContactResource.md)
 - [WorkerCustomFieldsResource](docs/WorkerCustomFieldsResource.md)
 - [WorkerErrorResource](docs/WorkerErrorResource.md)
 - [WorkerFederalTaxResource](docs/WorkerFederalTaxResource.md)
 - [WorkerResource](docs/WorkerResource.md)
 - [WorkerResource1](docs/WorkerResource1.md)
 - [WorkerStatus](docs/WorkerStatus.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
