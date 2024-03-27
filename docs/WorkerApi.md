# WorkerApi

All URIs are relative to *https://api.paychex.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCommunication**](WorkerApi.md#addCommunication) | **POST** /workers/{workerId}/communications | Worker Communication |
| [**addDirectDeposit**](WorkerApi.md#addDirectDeposit) | **POST** /workers/{workerId}/directdeposits | Worker Direct Deposit |
| [**addFederalTaxSetup**](WorkerApi.md#addFederalTaxSetup) | **POST** /workers/{workerId}/federaltax | Worker Federal Tax |
| [**addPayComponent**](WorkerApi.md#addPayComponent) | **POST** /workers/{workerId}/paycomponents | Worker Pay Component |
| [**addPayRate**](WorkerApi.md#addPayRate) | **POST** /workers/{workerId}/compensation/payrates | Worker Pay Rate |
| [**addWorkerContacts**](WorkerApi.md#addWorkerContacts) | **POST** /workers/{workerId}/contacts | Worker Contacts |
| [**createCustomField**](WorkerApi.md#createCustomField) | **POST** /workers/{workerId}/customfields | Worker Custom Field |
| [**deleteContactByContactId**](WorkerApi.md#deleteContactByContactId) | **DELETE** /workers/{workerId}/contacts/{contactId} | Worker Contact |
| [**deleteCustomField**](WorkerApi.md#deleteCustomField) | **DELETE** /workers/{workerId}/customfields/{workerCustomFieldId} | Worker Custom Field |
| [**deleteInProgress**](WorkerApi.md#deleteInProgress) | **DELETE** /workers/{workerId} | Worker |
| [**getCommunicationItem**](WorkerApi.md#getCommunicationItem) | **GET** /workers/{workerId}/communications/{communicationId} | Worker Communication |
| [**getCommunications**](WorkerApi.md#getCommunications) | **GET** /workers/{workerId}/communications | Worker Communications |
| [**getCompensationInformation**](WorkerApi.md#getCompensationInformation) | **GET** /workers/{workerId}/compensation | Worker Compensation |
| [**getContactByContactId**](WorkerApi.md#getContactByContactId) | **GET** /workers/{workerId}/contacts/{contactId} | Worker Contact |
| [**getContacts**](WorkerApi.md#getContacts) | **GET** /workers/{workerId}/contacts | Worker Contacts |
| [**getCustomField**](WorkerApi.md#getCustomField) | **GET** /workers/{workerId}/customfields/{workerCustomFieldId} | Worker Custom Field |
| [**getCustomFields**](WorkerApi.md#getCustomFields) | **GET** /workers/{workerId}/customfields | Worker Custom Fields |
| [**getDirectDeposit**](WorkerApi.md#getDirectDeposit) | **GET** /workers/{workerId}/directdeposits/{directDepositId} | Worker Direct Deposit |
| [**getFederalTaxSetup**](WorkerApi.md#getFederalTaxSetup) | **GET** /workers/{workerId}/federaltax | Worker Federal Tax |
| [**getInformation**](WorkerApi.md#getInformation) | **GET** /workers/{workerId} | Worker |
| [**getPayComponent**](WorkerApi.md#getPayComponent) | **GET** /workers/{workerId}/paycomponents/{workerComponentId} | Worker Pay Component |
| [**getPayComponents**](WorkerApi.md#getPayComponents) | **GET** /workers/{workerId}/paycomponents | Worker Pay Components |
| [**getPayRate**](WorkerApi.md#getPayRate) | **GET** /workers/{workerId}/compensation/payrates/{rateId} | Worker Pay Rate |
| [**getPayRatesByWorkerId**](WorkerApi.md#getPayRatesByWorkerId) | **GET** /workers/{workerId}/compensation/payrates | Worker Pay Rates |
| [**getPayStandards**](WorkerApi.md#getPayStandards) | **GET** /workers/{workerId}/compensation/paystandards | Worker Pay Standards |
| [**getTimeOffBalance**](WorkerApi.md#getTimeOffBalance) | **GET** /workers/{workerId}/timeoff | Worker Time Off |
| [**getWorkerStatusList**](WorkerApi.md#getWorkerStatusList) | **GET** /workers/{workerId}/status | Worker Statuses |
| [**listAssignmentDistributions**](WorkerApi.md#listAssignmentDistributions) | **GET** /workers/{workerId}/assignmentdistributions | Worker Assignments |
| [**listDirectDeposits**](WorkerApi.md#listDirectDeposits) | **GET** /workers/{workerId}/directdeposits | Worker Direct Deposits |
| [**removeCommunication**](WorkerApi.md#removeCommunication) | **DELETE** /workers/{workerId}/communications/{communicationId} | Worker Communication |
| [**removeDirectDeposit**](WorkerApi.md#removeDirectDeposit) | **DELETE** /workers/{workerId}/directdeposits/{directDepositId} | Worker Direct Deposit |
| [**removeFederalTax**](WorkerApi.md#removeFederalTax) | **DELETE** /workers/{workerId}/federaltax | Worker Federal Tax |
| [**removePayComponent**](WorkerApi.md#removePayComponent) | **DELETE** /workers/{workerId}/paycomponents/{workerComponentId} | Worker Pay Component |
| [**removePayRate**](WorkerApi.md#removePayRate) | **DELETE** /workers/{workerId}/compensation/payrates/{rateId} | Worker Pay Rate |
| [**updateCommunicationItem**](WorkerApi.md#updateCommunicationItem) | **PATCH** /workers/{workerId}/communications/{communicationId} | Worker Communication |
| [**updateCompensationRate**](WorkerApi.md#updateCompensationRate) | **PATCH** /workers/{workerId}/compensation/payrates/{rateId} | Worker Pay Rate |
| [**updateContact**](WorkerApi.md#updateContact) | **PATCH** /workers/{workerId}/contacts/{contactId} | Worker Contacts |
| [**updateCustomField**](WorkerApi.md#updateCustomField) | **PATCH** /workers/{workerId}/customfields/{workerCustomFieldId} | Worker CustomField |
| [**updateDirectDeposit**](WorkerApi.md#updateDirectDeposit) | **PATCH** /workers/{workerId}/directdeposits/{directDepositId} | Worker Direct Deposit |
| [**updateDirectDeposits**](WorkerApi.md#updateDirectDeposits) | **PATCH** /workers/{workerId}/directdeposits | Worker Direct Deposits |
| [**updateFederalTaxSetup**](WorkerApi.md#updateFederalTaxSetup) | **PATCH** /workers/{workerId}/federaltax | Worker Federal Tax |
| [**updatePayComponent**](WorkerApi.md#updatePayComponent) | **PATCH** /workers/{workerId}/paycomponents/{workerComponentId} | Worker Pay Component |
| [**updatePayComponents**](WorkerApi.md#updatePayComponents) | **PATCH** /workers/{workerId}/paycomponents | Worker Pay Components |
| [**updateUniqueWorker**](WorkerApi.md#updateUniqueWorker) | **PATCH** /workers/{workerId} | Worker |


<a name="addCommunication"></a>
# **addCommunication**
> CommunicationResource1 addCommunication(workerId, communicationResource1).execute();

Worker Communication

Add a single communication to the \&quot;Active\&quot; or \&quot;In-progress\&quot; worker.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // The id assigned to the worker that workers are being requested for.
    String communicationId = "communicationId_example"; // The ID for the workers specific communication item.
    String type = "STREET_ADDRESS"; // A set of communication types classifying an instruction that the customer, requester, or subject must comply with in order for the screening to go forward. NOTE: PHONE and EMAIL type supports BUSINESS and PERSONAL usage type only.MOBILE_PHONE, FAX and PAGER supports BUSINESS usage type only.This data field cannot be PATCHED.
    String usageType = "PERSONAL"; // A code classifying a designated use associated with a contact method. For example, whether a telephone or email address is one for business communications or one primarily for personal use.This data field cannot be PATCHED.
    String dialCountry = "dialCountry_example"; // The country dialing code for a communication number
    String dialArea = "dialArea_example"; // The area dialing code for a communication number
    String dialNumber = "dialNumber_example"; // The communication number, not including country dialing or area dialing codes
    String dialExtension = "dialExtension_example"; // The extension of the associated communication number
    String uri = "uri_example"; // The mailto address as specified in RFC2368
    String streetLineOne = "streetLineOne_example"; // The street address line one
    String streetLineTwo = "streetLineTwo_example"; // The street address line two
    String postOfficeBox = "postOfficeBox_example"; // The postal office box. This data field cannot be PATCHED
    String city = "city_example"; // The city name
    String postalCode = "postalCode_example"; // The zip-code
    String postalCodeExtension = "postalCodeExtension_example"; // The zip-code extension
    String countrySubdivisionCode = "countrySubdivisionCode_example"; // The state code (ISO 3166 subdivision code). This data field cannot be PATCHED for ACTIVE worker
    String countryCode = "countryCode_example"; // The country code (ISO 3166 alpha-2)
    List<Link> links = Arrays.asList();
    try {
      CommunicationResource1 result = client
              .worker
              .addCommunication(workerId)
              .communicationId(communicationId)
              .type(type)
              .usageType(usageType)
              .dialCountry(dialCountry)
              .dialArea(dialArea)
              .dialNumber(dialNumber)
              .dialExtension(dialExtension)
              .uri(uri)
              .streetLineOne(streetLineOne)
              .streetLineTwo(streetLineTwo)
              .postOfficeBox(postOfficeBox)
              .city(city)
              .postalCode(postalCode)
              .postalCodeExtension(postalCodeExtension)
              .countrySubdivisionCode(countrySubdivisionCode)
              .countryCode(countryCode)
              .links(links)
              .execute();
      System.out.println(result);
      System.out.println(result.getCommunicationId());
      System.out.println(result.getType());
      System.out.println(result.getUsageType());
      System.out.println(result.getDialCountry());
      System.out.println(result.getDialArea());
      System.out.println(result.getDialNumber());
      System.out.println(result.getDialExtension());
      System.out.println(result.getUri());
      System.out.println(result.getStreetLineOne());
      System.out.println(result.getStreetLineTwo());
      System.out.println(result.getPostOfficeBox());
      System.out.println(result.getCity());
      System.out.println(result.getPostalCode());
      System.out.println(result.getPostalCodeExtension());
      System.out.println(result.getCountrySubdivisionCode());
      System.out.println(result.getCountryCode());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#addCommunication");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommunicationResource1> response = client
              .worker
              .addCommunication(workerId)
              .communicationId(communicationId)
              .type(type)
              .usageType(usageType)
              .dialCountry(dialCountry)
              .dialArea(dialArea)
              .dialNumber(dialNumber)
              .dialExtension(dialExtension)
              .uri(uri)
              .streetLineOne(streetLineOne)
              .streetLineTwo(streetLineTwo)
              .postOfficeBox(postOfficeBox)
              .city(city)
              .postalCode(postalCode)
              .postalCodeExtension(postalCodeExtension)
              .countrySubdivisionCode(countrySubdivisionCode)
              .countryCode(countryCode)
              .links(links)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#addCommunication");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| The id assigned to the worker that workers are being requested for. | |
| **communicationResource1** | [**CommunicationResource1**](CommunicationResource1.md)|  | |

### Return type

[**CommunicationResource1**](CommunicationResource1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/vnd.paychex.worker.communication.v1+json
 - **Accept**: application/json, application/vnd.paychex.worker.communication.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="addDirectDeposit"></a>
# **addDirectDeposit**
> DirectDepositResource addDirectDeposit(workerId, directDepositResource).execute();

Worker Direct Deposit

Add a direct deposit to an \&quot;Active\&quot; worker.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String directDepositId = "directDepositId_example"; // The ID for the direct deposit item.
    OffsetDateTime startDate = OffsetDateTime.now(); // The date that this direct deposit will be applied to future pay periods. This data field cannot be PATCHED.
    String paymentType = "FLAT_DOLLAR_AMOUNT"; // A type of payment for the direct deposit.
    String accountType = "CHECKING"; // Financial institutions account type. This data field cannot be PATCHED.
    Double value = 3.4D; // The amount to be applied to this direct deposit.
    String routingNumber = "routingNumber_example"; // The financial institutions routing number.This data field cannot be PATCHED.
    String accountNumber = "accountNumber_example"; // The financial institutions account number.This data field cannot be PATCHED.
    String priority = "priority_example"; // The priority order for which the direct deposits will be performed in. When a new direct deposit is added the priority will be assigned. The priority can be modified only by swapping with a different direct deposit using the bulk PATCH. A paymentType of REMAINDER will show a priority of 99 and can't be modified.This data field cannot be PATCHED.
    List<Link> links = Arrays.asList();
    try {
      DirectDepositResource result = client
              .worker
              .addDirectDeposit(workerId)
              .directDepositId(directDepositId)
              .startDate(startDate)
              .paymentType(paymentType)
              .accountType(accountType)
              .value(value)
              .routingNumber(routingNumber)
              .accountNumber(accountNumber)
              .priority(priority)
              .links(links)
              .execute();
      System.out.println(result);
      System.out.println(result.getDirectDepositId());
      System.out.println(result.getStartDate());
      System.out.println(result.getPaymentType());
      System.out.println(result.getAccountType());
      System.out.println(result.getValue());
      System.out.println(result.getRoutingNumber());
      System.out.println(result.getAccountNumber());
      System.out.println(result.getPriority());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#addDirectDeposit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DirectDepositResource> response = client
              .worker
              .addDirectDeposit(workerId)
              .directDepositId(directDepositId)
              .startDate(startDate)
              .paymentType(paymentType)
              .accountType(accountType)
              .value(value)
              .routingNumber(routingNumber)
              .accountNumber(accountNumber)
              .priority(priority)
              .links(links)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#addDirectDeposit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **directDepositResource** | [**DirectDepositResource**](DirectDepositResource.md)|  | |

### Return type

[**DirectDepositResource**](DirectDepositResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/vnd.paychex.payroll.directdeposit.v1+json
 - **Accept**: application/json, application/vnd.paychex.payroll.directdeposit.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a name="addFederalTaxSetup"></a>
# **addFederalTaxSetup**
> WorkerFederalTaxResource addFederalTaxSetup(workerId, workerFederalTaxResource).execute();

Worker Federal Tax

Add federal tax setup for a \&quot;Active\&quot; or \&quot;In-progress\&quot; worker.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String taxId = "taxId_example"; // The ID for the federal tax item.
    String filingStatus = "SINGLE_OR_MARRIED_FILING_SEPARATELY"; // Filing status.
    String multipleJobs = "true"; // See federal W-4 instructions.
    String dependentsAmount = "dependentsAmount_example"; // See federal W-4 instructions.
    String otherIncome = "otherIncome_example"; // See federal W-4 instructions.
    String deductionsAmount = "deductionsAmount_example"; // See federal W-4 instructions.
    String extraWithholdingAmount = "extraWithholdingAmount_example"; // Additional tax you want withheld each pay period.
    String taxesWithheld = "true = Federal taxes withheld"; // Should federal taxes be withheld.
    try {
      WorkerFederalTaxResource result = client
              .worker
              .addFederalTaxSetup(workerId)
              .taxId(taxId)
              .filingStatus(filingStatus)
              .multipleJobs(multipleJobs)
              .dependentsAmount(dependentsAmount)
              .otherIncome(otherIncome)
              .deductionsAmount(deductionsAmount)
              .extraWithholdingAmount(extraWithholdingAmount)
              .taxesWithheld(taxesWithheld)
              .execute();
      System.out.println(result);
      System.out.println(result.getTaxId());
      System.out.println(result.getFilingStatus());
      System.out.println(result.getMultipleJobs());
      System.out.println(result.getDependentsAmount());
      System.out.println(result.getOtherIncome());
      System.out.println(result.getDeductionsAmount());
      System.out.println(result.getExtraWithholdingAmount());
      System.out.println(result.getTaxesWithheld());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#addFederalTaxSetup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkerFederalTaxResource> response = client
              .worker
              .addFederalTaxSetup(workerId)
              .taxId(taxId)
              .filingStatus(filingStatus)
              .multipleJobs(multipleJobs)
              .dependentsAmount(dependentsAmount)
              .otherIncome(otherIncome)
              .deductionsAmount(deductionsAmount)
              .extraWithholdingAmount(extraWithholdingAmount)
              .taxesWithheld(taxesWithheld)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#addFederalTaxSetup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **workerFederalTaxResource** | [**WorkerFederalTaxResource**](WorkerFederalTaxResource.md)|  | |

### Return type

[**WorkerFederalTaxResource**](WorkerFederalTaxResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/vnd.paychex.worker.federaltax2020.v1+json
 - **Accept**: application/vnd.paychex.worker.federaltax2020.v1+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Worker Federal Tax successfully added |  -  |

<a name="addPayComponent"></a>
# **addPayComponent**
> RecurringResource addPayComponent(workerId, recurringResource).execute();

Worker Pay Component

Add a single pay component to the \&quot;Active\&quot; worker. This pay component will be used for apply recurring pay components on a workers check based on the frequency specified. supports the ability to POST both Addition and Reduction type pay components.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String workerComponentId = "workerComponentId_example"; // The id of a single pay component that a workers has.
    String componentId = "componentId_example"; // The unique identifier of the pay component. This data field cannot be PATCHED.
    String name = "name_example"; // Name of the pay component. This data field will be populated automatically based on componentId.
    String calculationType = "FLAT_DOLLAR_AMOUNT:This is used for a specific dollar amount"; // The type of calculation that will be applied for the pay component .
    String calculationBaseId = "calculationBaseId_example"; // This is required if you are not using a FLAT_DOLLAR_AMOUNT Calculation Type.
    Double value = 3.4D; // This is used to specify the value that is used against the calculationType.
    OffsetDateTime startDate = OffsetDateTime.now(); // Date which this pay component will start to be applied during the payruns. This is an optional field that default to current datetime if not provided. This cannot be backdated but can be added to start in the future.
    OffsetDateTime effectiveDate = OffsetDateTime.now(); // Date which this pay component has started for the worker.
    OffsetDateTime endDate = OffsetDateTime.now(); // Date which this pay component has ended for the worker.
    String effectOnPay = "effectOnPay_example"; // What the effect on pay will be (REDUCTION OR ADDITION), currently only reductions are available. This data field will be populated automatically based on componentId. This data field cannot be PATCHED
    String classificationType = "classificationType_example"; // The category that this component falls into.
    PayComponentFrequencyTypeResource1 frequency = new PayComponentFrequencyTypeResource1();
    List<Link> links = Arrays.asList();
    try {
      RecurringResource result = client
              .worker
              .addPayComponent(workerId)
              .workerComponentId(workerComponentId)
              .componentId(componentId)
              .name(name)
              .calculationType(calculationType)
              .calculationBaseId(calculationBaseId)
              .value(value)
              .startDate(startDate)
              .effectiveDate(effectiveDate)
              .endDate(endDate)
              .effectOnPay(effectOnPay)
              .classificationType(classificationType)
              .frequency(frequency)
              .links(links)
              .execute();
      System.out.println(result);
      System.out.println(result.getWorkerComponentId());
      System.out.println(result.getComponentId());
      System.out.println(result.getName());
      System.out.println(result.getCalculationType());
      System.out.println(result.getCalculationBaseId());
      System.out.println(result.getValue());
      System.out.println(result.getStartDate());
      System.out.println(result.getEffectiveDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getEffectOnPay());
      System.out.println(result.getClassificationType());
      System.out.println(result.getFrequency());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#addPayComponent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecurringResource> response = client
              .worker
              .addPayComponent(workerId)
              .workerComponentId(workerComponentId)
              .componentId(componentId)
              .name(name)
              .calculationType(calculationType)
              .calculationBaseId(calculationBaseId)
              .value(value)
              .startDate(startDate)
              .effectiveDate(effectiveDate)
              .endDate(endDate)
              .effectOnPay(effectOnPay)
              .classificationType(classificationType)
              .frequency(frequency)
              .links(links)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#addPayComponent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **recurringResource** | [**RecurringResource**](RecurringResource.md)|  | |

### Return type

[**RecurringResource**](RecurringResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/vnd.paychex.payroll.paycomponents.v1+json
 - **Accept**: application/json, application/vnd.paychex.payroll.paycomponents.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful operation |  -  |

<a name="addPayRate"></a>
# **addPayRate**
> PayRateResource addPayRate(workerId, payRateResource).execute();

Worker Pay Rate

Add a single compensation rate to the \&quot;Active\&quot; or \&quot;In-progress\&quot; worker.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String description = "description_example"; // Describes the rate for the worker.
    String rateId = "rateId_example"; // Unique identifier for this workers pay rate. **This ID will change if this is created for an IN_PROGRESS worker that is later completed within Flex**
    OffsetDateTime startDate = OffsetDateTime.now(); // The date when the pay rate is going to begin.
    String rateNumber = "rateNumber_example"; // The number of the rate. A worker can have up to 5 different rates.
    String rateType = "ANNUAL_SALARY"; // Type of rate.
    String amount = "amount_example"; // The currency amount which this rate is applied.
    String standardHours = "standardHours_example"; // Default standard hours that this rate is used with a pay frequency.
    String standardOvertime = "standardOvertime_example"; // Default over time hours that this rate is used with a pay frequency.
    Boolean _default = true; // If this rate is the default one to apply on the worker.
    String effectiveDate = "effectiveDate_example"; // The date when the pay rate becomes effective for the worker.(can be used only in POST/PATCH for an active worker)
    List<Link> links = Arrays.asList();
    try {
      PayRateResource result = client
              .worker
              .addPayRate(workerId)
              .description(description)
              .rateId(rateId)
              .startDate(startDate)
              .rateNumber(rateNumber)
              .rateType(rateType)
              .amount(amount)
              .standardHours(standardHours)
              .standardOvertime(standardOvertime)
              ._default(_default)
              .effectiveDate(effectiveDate)
              .links(links)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getRateId());
      System.out.println(result.getStartDate());
      System.out.println(result.getRateNumber());
      System.out.println(result.getRateType());
      System.out.println(result.getAmount());
      System.out.println(result.getStandardHours());
      System.out.println(result.getStandardOvertime());
      System.out.println(result.getDefault());
      System.out.println(result.getEffectiveDate());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#addPayRate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayRateResource> response = client
              .worker
              .addPayRate(workerId)
              .description(description)
              .rateId(rateId)
              .startDate(startDate)
              .rateNumber(rateNumber)
              .rateType(rateType)
              .amount(amount)
              .standardHours(standardHours)
              .standardOvertime(standardOvertime)
              ._default(_default)
              .effectiveDate(effectiveDate)
              .links(links)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#addPayRate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **payRateResource** | [**PayRateResource**](PayRateResource.md)|  | |

### Return type

[**PayRateResource**](PayRateResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/vnd.paychex.payroll.compensation.payrate.v1+json
 - **Accept**: application/json, application/vnd.paychex.payroll.compensation.payrate.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a name="addWorkerContacts"></a>
# **addWorkerContacts**
> WorkerContactResource addWorkerContacts(workerId, workerContactResource).execute();

Worker Contacts

Add one or more contacts to a worker. A contact may represent a person or entity (organization) but not both. A contact must have at least one communication (telecom, postal, or email). Person contacts can have multiple communications for each communication type (telecom, postal, or email) to support BUSINESS and PERSONAL. Exactly one contact must be marked as primary for each contact type. If one or more contacts are posted for the same contact type, and there are currently no contacts of that type for the worker, the first contact in the list will be made primary unless another in the list is expressly marked as primary. When a new contact is made primary the previous primary contact will be marked as not primary. Use the GET /companies/{companyId}/contacttypes endpoint to get a full list of available contact types and relationship types (used for person contacts).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String contactId = "contactId_example"; // The ID for the workers specific contact.
    ContactTypeResource1 contactType = new ContactTypeResource1();
    RelationshipResource relationship = new RelationshipResource();
    try {
      WorkerContactResource result = client
              .worker
              .addWorkerContacts(workerId)
              .contactId(contactId)
              .contactType(contactType)
              .relationship(relationship)
              .execute();
      System.out.println(result);
      System.out.println(result.getContactId());
      System.out.println(result.getContactType());
      System.out.println(result.getRelationship());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#addWorkerContacts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkerContactResource> response = client
              .worker
              .addWorkerContacts(workerId)
              .contactId(contactId)
              .contactType(contactType)
              .relationship(relationship)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#addWorkerContacts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **workerContactResource** | [**WorkerContactResource**](WorkerContactResource.md)|  | |

### Return type

[**WorkerContactResource**](WorkerContactResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/vnd.paychex.worker.contacts.v1+json
 - **Accept**: application/json, application/vnd.paychex.worker.contacts.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful operation. |  -  |

<a name="createCustomField"></a>
# **createCustomField**
> WorkerCustomFieldsResource createCustomField(workerId, workerCustomFieldsResource).execute();

Worker Custom Field

Create CustomField at the worker level

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String workerCustomFieldId = "workerCustomFieldId_example"; // The unique identifier that is autogenerated when a custom field is created
    String customFieldId = "customFieldId_example"; // client Custom Field Id
    String type = "DROPDOWN"; // The type of field the custom field is
    Boolean booleanValue = true; // The value for BOOLEAN type (true/false)
    String textValue = "textValue_example"; // The value for TEXT type (any text, alphanumeric, special characters allowed)
    Double numericValue = 3.4D; // Numeric data type can have three formats namely - whole number, second decimal place and fourth decimal place, example: 12 , 12.34 or 12.3456
    OffsetDateTime dateValue = OffsetDateTime.now(); // The value for DATE type , example : 2012-02-01T05:00:00Z
    String dropdownId = "dropdownId_example"; // The unique identifier that is autogenerated when dropdown list is created
    String dropdownValue = "dropdownValue_example"; // The value for dropdown list
    String customFieldName = "customFieldName_example"; // The name of the custom field. Such as: \\\"Hobbies\\\"
    Boolean required = true; // Where to indicate if the custom field is required on the worker where true = required and false = not required
    Boolean checkStub = true; // Where to indicate if the custom field is required on the workers pay stub, where true = required and false = not required.
    Boolean employeeEditable = true; // Where to indicate if the custom field is able to be edited by the employee, where true = required and false = not required.
    try {
      WorkerCustomFieldsResource result = client
              .worker
              .createCustomField(workerId)
              .workerCustomFieldId(workerCustomFieldId)
              .customFieldId(customFieldId)
              .type(type)
              .booleanValue(booleanValue)
              .textValue(textValue)
              .numericValue(numericValue)
              .dateValue(dateValue)
              .dropdownId(dropdownId)
              .dropdownValue(dropdownValue)
              .customFieldName(customFieldName)
              .required(required)
              .checkStub(checkStub)
              .employeeEditable(employeeEditable)
              .execute();
      System.out.println(result);
      System.out.println(result.getWorkerCustomFieldId());
      System.out.println(result.getCustomFieldId());
      System.out.println(result.getType());
      System.out.println(result.getBooleanValue());
      System.out.println(result.getTextValue());
      System.out.println(result.getNumericValue());
      System.out.println(result.getDateValue());
      System.out.println(result.getDropdownId());
      System.out.println(result.getDropdownValue());
      System.out.println(result.getCustomFieldName());
      System.out.println(result.getRequired());
      System.out.println(result.getCheckStub());
      System.out.println(result.getEmployeeEditable());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#createCustomField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkerCustomFieldsResource> response = client
              .worker
              .createCustomField(workerId)
              .workerCustomFieldId(workerCustomFieldId)
              .customFieldId(customFieldId)
              .type(type)
              .booleanValue(booleanValue)
              .textValue(textValue)
              .numericValue(numericValue)
              .dateValue(dateValue)
              .dropdownId(dropdownId)
              .dropdownValue(dropdownValue)
              .customFieldName(customFieldName)
              .required(required)
              .checkStub(checkStub)
              .employeeEditable(employeeEditable)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#createCustomField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **workerCustomFieldsResource** | [**WorkerCustomFieldsResource**](WorkerCustomFieldsResource.md)|  | |

### Return type

[**WorkerCustomFieldsResource**](WorkerCustomFieldsResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/vnd.paychex.worker.customfields.v1+json
 - **Accept**: application/json, application/vnd.paychex.worker.customfields.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Worker Custom field successfully created |  -  |

<a name="deleteContactByContactId"></a>
# **deleteContactByContactId**
> deleteContactByContactId(workerId, contactId).execute();

Worker Contact

Delete a worker contact by contactId.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String contactId = "contactId_example"; // ID associated with desired worker contact.
    try {
      client
              .worker
              .deleteContactByContactId(workerId, contactId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#deleteContactByContactId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .worker
              .deleteContactByContactId(workerId, contactId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#deleteContactByContactId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **contactId** | **String**| ID associated with desired worker contact. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful operation. |  -  |

<a name="deleteCustomField"></a>
# **deleteCustomField**
> deleteCustomField(workerId, workerCustomFieldId).execute();

Worker Custom Field

Delete CustomField at the worker level

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String workerCustomFieldId = "workerCustomFieldId_example"; // ID associated with desired worker custom field.
    try {
      client
              .worker
              .deleteCustomField(workerId, workerCustomFieldId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#deleteCustomField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .worker
              .deleteCustomField(workerId, workerCustomFieldId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#deleteCustomField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **workerCustomFieldId** | **String**| ID associated with desired worker custom field. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | successful operation |  -  |

<a name="deleteInProgress"></a>
# **deleteInProgress**
> deleteInProgress(workerId).execute();

Worker

Delete in progress Worker

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    try {
      client
              .worker
              .deleteInProgress(workerId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#deleteInProgress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .worker
              .deleteInProgress(workerId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#deleteInProgress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Inprogress Worker successfully deleted |  -  |

<a name="getCommunicationItem"></a>
# **getCommunicationItem**
> CommunicationResource1 getCommunicationItem(workerId, communicationId).execute();

Worker Communication

A \&quot;Active\&quot; or \&quot;In-progress\&quot; workers single communication item.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // The id assigned to the worker that workers are being requested for.
    String communicationId = "communicationId_example"; // The id of a single workers communication.
    try {
      CommunicationResource1 result = client
              .worker
              .getCommunicationItem(workerId, communicationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCommunicationId());
      System.out.println(result.getType());
      System.out.println(result.getUsageType());
      System.out.println(result.getDialCountry());
      System.out.println(result.getDialArea());
      System.out.println(result.getDialNumber());
      System.out.println(result.getDialExtension());
      System.out.println(result.getUri());
      System.out.println(result.getStreetLineOne());
      System.out.println(result.getStreetLineTwo());
      System.out.println(result.getPostOfficeBox());
      System.out.println(result.getCity());
      System.out.println(result.getPostalCode());
      System.out.println(result.getPostalCodeExtension());
      System.out.println(result.getCountrySubdivisionCode());
      System.out.println(result.getCountryCode());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getCommunicationItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommunicationResource1> response = client
              .worker
              .getCommunicationItem(workerId, communicationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getCommunicationItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| The id assigned to the worker that workers are being requested for. | |
| **communicationId** | **String**| The id of a single workers communication. | |

### Return type

[**CommunicationResource1**](CommunicationResource1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.worker.communication.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getCommunications"></a>
# **getCommunications**
> CommunicationResource1 getCommunications(workerId).execute();

Worker Communications

Information about \&quot;Active\&quot; or \&quot;In-progress\&quot;  workers communications.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // The id assigned to the worker that workers are being requested for.
    try {
      CommunicationResource1 result = client
              .worker
              .getCommunications(workerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCommunicationId());
      System.out.println(result.getType());
      System.out.println(result.getUsageType());
      System.out.println(result.getDialCountry());
      System.out.println(result.getDialArea());
      System.out.println(result.getDialNumber());
      System.out.println(result.getDialExtension());
      System.out.println(result.getUri());
      System.out.println(result.getStreetLineOne());
      System.out.println(result.getStreetLineTwo());
      System.out.println(result.getPostOfficeBox());
      System.out.println(result.getCity());
      System.out.println(result.getPostalCode());
      System.out.println(result.getPostalCodeExtension());
      System.out.println(result.getCountrySubdivisionCode());
      System.out.println(result.getCountryCode());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getCommunications");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommunicationResource1> response = client
              .worker
              .getCommunications(workerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getCommunications");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| The id assigned to the worker that workers are being requested for. | |

### Return type

[**CommunicationResource1**](CommunicationResource1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.worker.communications.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getCompensationInformation"></a>
# **getCompensationInformation**
> CollectionResource getCompensationInformation(workerId).execute();

Worker Compensation

Information about a workers compensation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    try {
      CollectionResource result = client
              .worker
              .getCompensationInformation(workerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getContent());
      System.out.println(result.getErrors());
      System.out.println(result.getMessage());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getCompensationInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CollectionResource> response = client
              .worker
              .getCompensationInformation(workerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getCompensationInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |

### Return type

[**CollectionResource**](CollectionResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.payroll.compensation.v1+json, application/vnd.paychex.payroll.compensation.standards_rates.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a name="getContactByContactId"></a>
# **getContactByContactId**
> WorkerContactResource getContactByContactId(workerId, contactId).execute();

Worker Contact

Get a worker contact by contactId.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String contactId = "contactId_example"; // The id of a single Contact.
    try {
      WorkerContactResource result = client
              .worker
              .getContactByContactId(workerId, contactId)
              .execute();
      System.out.println(result);
      System.out.println(result.getContactId());
      System.out.println(result.getContactType());
      System.out.println(result.getRelationship());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getContactByContactId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkerContactResource> response = client
              .worker
              .getContactByContactId(workerId, contactId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getContactByContactId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **contactId** | **String**| The id of a single Contact. | |

### Return type

[**WorkerContactResource**](WorkerContactResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.worker.contact.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="getContacts"></a>
# **getContacts**
> WorkerContactResource getContacts(workerId).execute();

Worker Contacts

Get all contacts for the specified worker.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    try {
      WorkerContactResource result = client
              .worker
              .getContacts(workerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getContactId());
      System.out.println(result.getContactType());
      System.out.println(result.getRelationship());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getContacts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkerContactResource> response = client
              .worker
              .getContacts(workerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getContacts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |

### Return type

[**WorkerContactResource**](WorkerContactResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.worker.contacts.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="getCustomField"></a>
# **getCustomField**
> WorkerCustomFieldsResource getCustomField(workerId, workerCustomFieldId).asof(asof).execute();

Worker Custom Field

Get the worker&#39;s customFields by workerCustomFieldId

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String workerCustomFieldId = "workerCustomFieldId_example"; // ID associated with desired worker custom field.
    String asof = "2020-01-04T00:00:00Z"; // Returns custom field as of the date used in the request
    try {
      WorkerCustomFieldsResource result = client
              .worker
              .getCustomField(workerId, workerCustomFieldId)
              .asof(asof)
              .execute();
      System.out.println(result);
      System.out.println(result.getWorkerCustomFieldId());
      System.out.println(result.getCustomFieldId());
      System.out.println(result.getType());
      System.out.println(result.getBooleanValue());
      System.out.println(result.getTextValue());
      System.out.println(result.getNumericValue());
      System.out.println(result.getDateValue());
      System.out.println(result.getDropdownId());
      System.out.println(result.getDropdownValue());
      System.out.println(result.getCustomFieldName());
      System.out.println(result.getRequired());
      System.out.println(result.getCheckStub());
      System.out.println(result.getEmployeeEditable());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getCustomField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkerCustomFieldsResource> response = client
              .worker
              .getCustomField(workerId, workerCustomFieldId)
              .asof(asof)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getCustomField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **workerCustomFieldId** | **String**| ID associated with desired worker custom field. | |
| **asof** | **String**| Returns custom field as of the date used in the request | [optional] |

### Return type

[**WorkerCustomFieldsResource**](WorkerCustomFieldsResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.worker.customfield.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Worker Custom field successfully returned |  -  |

<a name="getCustomFields"></a>
# **getCustomFields**
> WorkerCustomFieldsResource getCustomFields(workerId).asof(asof).execute();

Worker Custom Fields

Get the worker&#39;s customFields

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String asof = "2020-01-04T00:00:00Z"; // Returns all custom fields as of the date used in the request
    try {
      WorkerCustomFieldsResource result = client
              .worker
              .getCustomFields(workerId)
              .asof(asof)
              .execute();
      System.out.println(result);
      System.out.println(result.getWorkerCustomFieldId());
      System.out.println(result.getCustomFieldId());
      System.out.println(result.getType());
      System.out.println(result.getBooleanValue());
      System.out.println(result.getTextValue());
      System.out.println(result.getNumericValue());
      System.out.println(result.getDateValue());
      System.out.println(result.getDropdownId());
      System.out.println(result.getDropdownValue());
      System.out.println(result.getCustomFieldName());
      System.out.println(result.getRequired());
      System.out.println(result.getCheckStub());
      System.out.println(result.getEmployeeEditable());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getCustomFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkerCustomFieldsResource> response = client
              .worker
              .getCustomFields(workerId)
              .asof(asof)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getCustomFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **asof** | **String**| Returns all custom fields as of the date used in the request | [optional] |

### Return type

[**WorkerCustomFieldsResource**](WorkerCustomFieldsResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.worker.customfields.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Worker Custom fields successfully returned |  -  |

<a name="getDirectDeposit"></a>
# **getDirectDeposit**
> DirectDepositResource getDirectDeposit(workerId, directDepositId).effectivitydate(effectivitydate).execute();

Worker Direct Deposit

Single direct deposit for an \&quot;Active\&quot; worker.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String directDepositId = "directDepositId_example"; // The id assigned to the direct deposit for this worker.
    String effectivitydate = "effectivitydate_example"; // The effectivity date.
    try {
      DirectDepositResource result = client
              .worker
              .getDirectDeposit(workerId, directDepositId)
              .effectivitydate(effectivitydate)
              .execute();
      System.out.println(result);
      System.out.println(result.getDirectDepositId());
      System.out.println(result.getStartDate());
      System.out.println(result.getPaymentType());
      System.out.println(result.getAccountType());
      System.out.println(result.getValue());
      System.out.println(result.getRoutingNumber());
      System.out.println(result.getAccountNumber());
      System.out.println(result.getPriority());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getDirectDeposit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DirectDepositResource> response = client
              .worker
              .getDirectDeposit(workerId, directDepositId)
              .effectivitydate(effectivitydate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getDirectDeposit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **directDepositId** | **String**| The id assigned to the direct deposit for this worker. | |
| **effectivitydate** | **String**| The effectivity date. | [optional] |

### Return type

[**DirectDepositResource**](DirectDepositResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.payroll.directdeposit.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a name="getFederalTaxSetup"></a>
# **getFederalTaxSetup**
> WorkerFederalTaxResource getFederalTaxSetup(workerId).execute();

Worker Federal Tax

Federal tax setup for \&quot;Active\&quot; or \&quot;In-progress\&quot;  worker.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    try {
      WorkerFederalTaxResource result = client
              .worker
              .getFederalTaxSetup(workerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTaxId());
      System.out.println(result.getFilingStatus());
      System.out.println(result.getMultipleJobs());
      System.out.println(result.getDependentsAmount());
      System.out.println(result.getOtherIncome());
      System.out.println(result.getDeductionsAmount());
      System.out.println(result.getExtraWithholdingAmount());
      System.out.println(result.getTaxesWithheld());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getFederalTaxSetup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkerFederalTaxResource> response = client
              .worker
              .getFederalTaxSetup(workerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getFederalTaxSetup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |

### Return type

[**WorkerFederalTaxResource**](WorkerFederalTaxResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.paychex.worker.federaltax2020.v1+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Worker Federal Tax successfully returned |  -  |

<a name="getInformation"></a>
# **getInformation**
> WorkerResource1 getInformation(workerId).execute();

Worker

Information about a unique worker (employee and contractor) that your application has been granted access to. Currently workers that exist within Paychex Flex payroll will be available, future enhancements will make workers from other Paychex systems available.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    try {
      WorkerResource1 result = client
              .worker
              .getInformation(workerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getWorkerId());
      System.out.println(result.getEmployeeId());
      System.out.println(result.getWorkerType());
      System.out.println(result.getEmploymentType());
      System.out.println(result.getExemptionType());
      System.out.println(result.getBirthDate());
      System.out.println(result.getSex());
      System.out.println(result.getEthnicityCode());
      System.out.println(result.getHireDate());
      System.out.println(result.getClockId());
      System.out.println(result.getName());
      System.out.println(result.getLegalId());
      System.out.println(result.getLaborAssignmentId());
      System.out.println(result.getLocationId());
      System.out.println(result.getJobId());
      System.out.println(result.getJob());
      System.out.println(result.getOrganization());
      System.out.println(result.getSupervisor());
      System.out.println(result.getCurrentStatus());
      System.out.println(result.getCommunications());
      System.out.println(result.getLinks());
      System.out.println(result.getWorkerCorrelationId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkerResource1> response = client
              .worker
              .getInformation(workerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |

### Return type

[**WorkerResource1**](WorkerResource1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.worker.v1+json, application/vnd.paychex.worker_communications.v1+json, application/vnd.paychex.worker.nonpii.v1+json, application/vnd.paychex.worker.nonpii_communications.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getPayComponent"></a>
# **getPayComponent**
> RecurringResource getPayComponent(workerId, workerComponentId).asof(asof).execute();

Worker Pay Component

Retrieve a specific pay component that a \&quot;Active\&quot; worker has.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String workerComponentId = "workerComponentId_example"; // The id of a single pay component that a  \"Active\" worker has.
    String asof = "2020-01-04T00:00:00Z"; // Returns pay component as of the date used in the request
    try {
      RecurringResource result = client
              .worker
              .getPayComponent(workerId, workerComponentId)
              .asof(asof)
              .execute();
      System.out.println(result);
      System.out.println(result.getWorkerComponentId());
      System.out.println(result.getComponentId());
      System.out.println(result.getName());
      System.out.println(result.getCalculationType());
      System.out.println(result.getCalculationBaseId());
      System.out.println(result.getValue());
      System.out.println(result.getStartDate());
      System.out.println(result.getEffectiveDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getEffectOnPay());
      System.out.println(result.getClassificationType());
      System.out.println(result.getFrequency());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getPayComponent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecurringResource> response = client
              .worker
              .getPayComponent(workerId, workerComponentId)
              .asof(asof)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getPayComponent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **workerComponentId** | **String**| The id of a single pay component that a  \&quot;Active\&quot; worker has. | |
| **asof** | **String**| Returns pay component as of the date used in the request | [optional] |

### Return type

[**RecurringResource**](RecurringResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.payroll.paycomponent.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a name="getPayComponents"></a>
# **getPayComponents**
> RecurringResource getPayComponents(workerId).effectonpay(effectonpay).asof(asof).name(name).componentid(componentid).classificationtype(classificationtype).execute();

Worker Pay Components

Get all the the pay components for a specific \&quot;Active\&quot; worker.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String effectonpay = "effectonpay_example"; // What the effect on pay will be (REDUCTION OR ADDITION), currently only reductions are available.
    String asof = "2020-01-04T00:00:00Z"; // Returns all pay components as of the date used in the request
    String name = "name_example"; // The name of a pay component that a workers has.
    String componentid = "componentid_example"; // The unique identifier of the pay component.
    String classificationtype = "classificationtype_example"; // The classification type of a pay component that a worker has. (such as \"DEDUCTION\", or \"REGULAR\",)
    try {
      RecurringResource result = client
              .worker
              .getPayComponents(workerId)
              .effectonpay(effectonpay)
              .asof(asof)
              .name(name)
              .componentid(componentid)
              .classificationtype(classificationtype)
              .execute();
      System.out.println(result);
      System.out.println(result.getWorkerComponentId());
      System.out.println(result.getComponentId());
      System.out.println(result.getName());
      System.out.println(result.getCalculationType());
      System.out.println(result.getCalculationBaseId());
      System.out.println(result.getValue());
      System.out.println(result.getStartDate());
      System.out.println(result.getEffectiveDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getEffectOnPay());
      System.out.println(result.getClassificationType());
      System.out.println(result.getFrequency());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getPayComponents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecurringResource> response = client
              .worker
              .getPayComponents(workerId)
              .effectonpay(effectonpay)
              .asof(asof)
              .name(name)
              .componentid(componentid)
              .classificationtype(classificationtype)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getPayComponents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **effectonpay** | **String**| What the effect on pay will be (REDUCTION OR ADDITION), currently only reductions are available. | [optional] |
| **asof** | **String**| Returns all pay components as of the date used in the request | [optional] |
| **name** | **String**| The name of a pay component that a workers has. | [optional] |
| **componentid** | **String**| The unique identifier of the pay component. | [optional] |
| **classificationtype** | **String**| The classification type of a pay component that a worker has. (such as \&quot;DEDUCTION\&quot;, or \&quot;REGULAR\&quot;,) | [optional] |

### Return type

[**RecurringResource**](RecurringResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.payroll.paycomponents.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getPayRate"></a>
# **getPayRate**
> PayRateResource getPayRate(workerId, rateId).asof(asof).execute();

Worker Pay Rate

A workers single compensation rate.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String rateId = "rateId_example"; // The id of a single workers compensation rate.
    String asof = "2020-01-04T00:00:00Z"; // Returns compensation as of the date used in the request
    try {
      PayRateResource result = client
              .worker
              .getPayRate(workerId, rateId)
              .asof(asof)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getRateId());
      System.out.println(result.getStartDate());
      System.out.println(result.getRateNumber());
      System.out.println(result.getRateType());
      System.out.println(result.getAmount());
      System.out.println(result.getStandardHours());
      System.out.println(result.getStandardOvertime());
      System.out.println(result.getDefault());
      System.out.println(result.getEffectiveDate());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getPayRate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayRateResource> response = client
              .worker
              .getPayRate(workerId, rateId)
              .asof(asof)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getPayRate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **rateId** | **String**| The id of a single workers compensation rate. | |
| **asof** | **String**| Returns compensation as of the date used in the request | [optional] |

### Return type

[**PayRateResource**](PayRateResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.payroll.compensation.payrate.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a name="getPayRatesByWorkerId"></a>
# **getPayRatesByWorkerId**
> PayRateResource getPayRatesByWorkerId(workerId).asof(asof).execute();

Worker Pay Rates

Information about a workers compensation rates. Rate one is only one available if the worker is In-Progress. The multiple rates is available for workers that have been completed within Flex. It’s not required for a worker to have a rate in the system.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String asof = "2020-01-04T00:00:00Z"; // Returns all pay rates as of the date used in the request
    try {
      PayRateResource result = client
              .worker
              .getPayRatesByWorkerId(workerId)
              .asof(asof)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getRateId());
      System.out.println(result.getStartDate());
      System.out.println(result.getRateNumber());
      System.out.println(result.getRateType());
      System.out.println(result.getAmount());
      System.out.println(result.getStandardHours());
      System.out.println(result.getStandardOvertime());
      System.out.println(result.getDefault());
      System.out.println(result.getEffectiveDate());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getPayRatesByWorkerId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayRateResource> response = client
              .worker
              .getPayRatesByWorkerId(workerId)
              .asof(asof)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getPayRatesByWorkerId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **asof** | **String**| Returns all pay rates as of the date used in the request | [optional] |

### Return type

[**PayRateResource**](PayRateResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.payroll.compensation.payrates.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a name="getPayStandards"></a>
# **getPayStandards**
> PayStandardResource getPayStandards(workerId).execute();

Worker Pay Standards

Information about a workers compensation pay standards.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    try {
      PayStandardResource result = client
              .worker
              .getPayStandards(workerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPayFrequency());
      System.out.println(result.getOvertimeFactor());
      System.out.println(result.getCalculatedPayPeriod());
      System.out.println(result.getCalculatedAnnualSalary());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getPayStandards");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayStandardResource> response = client
              .worker
              .getPayStandards(workerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getPayStandards");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |

### Return type

[**PayStandardResource**](PayStandardResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.payroll.compensation.paystandards.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a name="getTimeOffBalance"></a>
# **getTimeOffBalance**
> TimeOffResource getTimeOffBalance(workerId).execute();

Worker Time Off

Array of time off balance(s) a worker has for each policy type of time off, for that worker. NOTE: This data is only available if the client has the Time Off Accrual product (This is not related to the Flex Time product which has it is own dev portal for those APIs).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // The ID of the worker.
    try {
      TimeOffResource result = client
              .worker
              .getTimeOffBalance(workerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPolicyId());
      System.out.println(result.getType());
      System.out.println(result.getName());
      System.out.println(result.getBalance());
      System.out.println(result.getMeasure());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getTimeOffBalance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeOffResource> response = client
              .worker
              .getTimeOffBalance(workerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getTimeOffBalance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| The ID of the worker. | |

### Return type

[**TimeOffResource**](TimeOffResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.worker.timeoff.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getWorkerStatusList"></a>
# **getWorkerStatusList**
> Status1 getWorkerStatusList(workerId).execute();

Worker Statuses

Retrieve the full list of worker statuses (past, present, and future). For each status the workerStatusId is the value of the corresponding company worker status ID. If no company worker status with a matching type/reason exists then workerStatusId is omitted. If multiple statuses share an effective date the order field will indicate the order in which they were posted.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    try {
      Status1 result = client
              .worker
              .getWorkerStatusList(workerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getWorkerStatusId());
      System.out.println(result.getStatusType());
      System.out.println(result.getStatusReason());
      System.out.println(result.getEffectiveDate());
      System.out.println(result.getOrder());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getWorkerStatusList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Status1> response = client
              .worker
              .getWorkerStatusList(workerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#getWorkerStatusList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |

### Return type

[**Status1**](Status1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.company.workerstatuses.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="listAssignmentDistributions"></a>
# **listAssignmentDistributions**
> WorkerAssignmentDistributionsResource listAssignmentDistributions(workerId).execute();

Worker Assignments

Array of assignments that will be used for auto distribution assigned to the worker.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // The ID of the worker.
    try {
      WorkerAssignmentDistributionsResource result = client
              .worker
              .listAssignmentDistributions(workerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getJobId());
      System.out.println(result.getLaborAssignmentId());
      System.out.println(result.getValue());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#listAssignmentDistributions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkerAssignmentDistributionsResource> response = client
              .worker
              .listAssignmentDistributions(workerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#listAssignmentDistributions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| The ID of the worker. | |

### Return type

[**WorkerAssignmentDistributionsResource**](WorkerAssignmentDistributionsResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.worker.assignmentdistributions.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a name="listDirectDeposits"></a>
# **listDirectDeposits**
> DirectDepositResource listDirectDeposits(workerId).effectivitydate(effectivitydate).asof(asof).execute();

Worker Direct Deposits

Array of direct deposits on the \&quot;Active\&quot; worker.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String effectivitydate = "effectivitydate_example"; // The effectivity date
    String asof = "2020-01-04T00:00:00Z"; // Returns all direct deposits as of the date used in the request
    try {
      DirectDepositResource result = client
              .worker
              .listDirectDeposits(workerId)
              .effectivitydate(effectivitydate)
              .asof(asof)
              .execute();
      System.out.println(result);
      System.out.println(result.getDirectDepositId());
      System.out.println(result.getStartDate());
      System.out.println(result.getPaymentType());
      System.out.println(result.getAccountType());
      System.out.println(result.getValue());
      System.out.println(result.getRoutingNumber());
      System.out.println(result.getAccountNumber());
      System.out.println(result.getPriority());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#listDirectDeposits");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DirectDepositResource> response = client
              .worker
              .listDirectDeposits(workerId)
              .effectivitydate(effectivitydate)
              .asof(asof)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#listDirectDeposits");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **effectivitydate** | **String**| The effectivity date | [optional] |
| **asof** | **String**| Returns all direct deposits as of the date used in the request | [optional] |

### Return type

[**DirectDepositResource**](DirectDepositResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.payroll.directdeposits.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a name="removeCommunication"></a>
# **removeCommunication**
> CommunicationResource1 removeCommunication(workerId, communicationId).execute();

Worker Communication

Remove a communication item from a \&quot;Active\&quot; or \&quot;In-progress\&quot; worker.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // The id assigned to the worker that workers are being requested for.
    String communicationId = "communicationId_example"; // The id of a single workers communication.
    try {
      CommunicationResource1 result = client
              .worker
              .removeCommunication(workerId, communicationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCommunicationId());
      System.out.println(result.getType());
      System.out.println(result.getUsageType());
      System.out.println(result.getDialCountry());
      System.out.println(result.getDialArea());
      System.out.println(result.getDialNumber());
      System.out.println(result.getDialExtension());
      System.out.println(result.getUri());
      System.out.println(result.getStreetLineOne());
      System.out.println(result.getStreetLineTwo());
      System.out.println(result.getPostOfficeBox());
      System.out.println(result.getCity());
      System.out.println(result.getPostalCode());
      System.out.println(result.getPostalCodeExtension());
      System.out.println(result.getCountrySubdivisionCode());
      System.out.println(result.getCountryCode());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#removeCommunication");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommunicationResource1> response = client
              .worker
              .removeCommunication(workerId, communicationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#removeCommunication");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| The id assigned to the worker that workers are being requested for. | |
| **communicationId** | **String**| The id of a single workers communication. | |

### Return type

[**CommunicationResource1**](CommunicationResource1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.worker.communications.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="removeDirectDeposit"></a>
# **removeDirectDeposit**
> removeDirectDeposit(workerId, directDepositId).effectivitydate(effectivitydate).execute();

Worker Direct Deposit

Remove a single direct deposit for a \&quot;Active\&quot; worker.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String directDepositId = "directDepositId_example"; // The id assigned to the direct deposit for this worker.
    String effectivitydate = "effectivitydate_example"; // The effectivity date.
    try {
      client
              .worker
              .removeDirectDeposit(workerId, directDepositId)
              .effectivitydate(effectivitydate)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#removeDirectDeposit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .worker
              .removeDirectDeposit(workerId, directDepositId)
              .effectivitydate(effectivitydate)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#removeDirectDeposit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **directDepositId** | **String**| The id assigned to the direct deposit for this worker. | |
| **effectivitydate** | **String**| The effectivity date. | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Direct Deposit successfully deleted |  -  |

<a name="removeFederalTax"></a>
# **removeFederalTax**
> removeFederalTax(workerId).execute();

Worker Federal Tax

Remove the federal tax setup for an \&quot;In-progress\&quot; worker.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    try {
      client
              .worker
              .removeFederalTax(workerId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#removeFederalTax");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .worker
              .removeFederalTax(workerId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#removeFederalTax");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Worker Federal Tax successfully deleted |  -  |

<a name="removePayComponent"></a>
# **removePayComponent**
> removePayComponent(workerId, workerComponentId).execute();

Worker Pay Component

Remove a specific pay component that a \&quot;Active\&quot; worker has.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String workerComponentId = "workerComponentId_example"; // The id of a single pay component that a workers has.
    try {
      client
              .worker
              .removePayComponent(workerId, workerComponentId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#removePayComponent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .worker
              .removePayComponent(workerId, workerComponentId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#removePayComponent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **workerComponentId** | **String**| The id of a single pay component that a workers has. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful operation |  -  |

<a name="removePayRate"></a>
# **removePayRate**
> removePayRate(workerId, rateId).execute();

Worker Pay Rate

Remove a compensation rate from a worker.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String rateId = "rateId_example"; // The id of a single workers compensation rate.
    try {
      client
              .worker
              .removePayRate(workerId, rateId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#removePayRate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .worker
              .removePayRate(workerId, rateId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#removePayRate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **rateId** | **String**| The id of a single workers compensation rate. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | successfully deleted |  -  |

<a name="updateCommunicationItem"></a>
# **updateCommunicationItem**
> CommunicationResource1 updateCommunicationItem(workerId, communicationId, communicationResource1).execute();

Worker Communication

Update a \&quot;Active\&quot; or \&quot;In-progress\&quot; workers specific communication item.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // The id assigned to the worker that workers are being requested for.
    String communicationId = "communicationId_example"; // The id of a single workers communication.
    String communicationId = "communicationId_example"; // The ID for the workers specific communication item.
    String type = "STREET_ADDRESS"; // A set of communication types classifying an instruction that the customer, requester, or subject must comply with in order for the screening to go forward. NOTE: PHONE and EMAIL type supports BUSINESS and PERSONAL usage type only.MOBILE_PHONE, FAX and PAGER supports BUSINESS usage type only.This data field cannot be PATCHED.
    String usageType = "PERSONAL"; // A code classifying a designated use associated with a contact method. For example, whether a telephone or email address is one for business communications or one primarily for personal use.This data field cannot be PATCHED.
    String dialCountry = "dialCountry_example"; // The country dialing code for a communication number
    String dialArea = "dialArea_example"; // The area dialing code for a communication number
    String dialNumber = "dialNumber_example"; // The communication number, not including country dialing or area dialing codes
    String dialExtension = "dialExtension_example"; // The extension of the associated communication number
    String uri = "uri_example"; // The mailto address as specified in RFC2368
    String streetLineOne = "streetLineOne_example"; // The street address line one
    String streetLineTwo = "streetLineTwo_example"; // The street address line two
    String postOfficeBox = "postOfficeBox_example"; // The postal office box. This data field cannot be PATCHED
    String city = "city_example"; // The city name
    String postalCode = "postalCode_example"; // The zip-code
    String postalCodeExtension = "postalCodeExtension_example"; // The zip-code extension
    String countrySubdivisionCode = "countrySubdivisionCode_example"; // The state code (ISO 3166 subdivision code). This data field cannot be PATCHED for ACTIVE worker
    String countryCode = "countryCode_example"; // The country code (ISO 3166 alpha-2)
    List<Link> links = Arrays.asList();
    try {
      CommunicationResource1 result = client
              .worker
              .updateCommunicationItem(workerId, communicationId)
              .communicationId(communicationId)
              .type(type)
              .usageType(usageType)
              .dialCountry(dialCountry)
              .dialArea(dialArea)
              .dialNumber(dialNumber)
              .dialExtension(dialExtension)
              .uri(uri)
              .streetLineOne(streetLineOne)
              .streetLineTwo(streetLineTwo)
              .postOfficeBox(postOfficeBox)
              .city(city)
              .postalCode(postalCode)
              .postalCodeExtension(postalCodeExtension)
              .countrySubdivisionCode(countrySubdivisionCode)
              .countryCode(countryCode)
              .links(links)
              .execute();
      System.out.println(result);
      System.out.println(result.getCommunicationId());
      System.out.println(result.getType());
      System.out.println(result.getUsageType());
      System.out.println(result.getDialCountry());
      System.out.println(result.getDialArea());
      System.out.println(result.getDialNumber());
      System.out.println(result.getDialExtension());
      System.out.println(result.getUri());
      System.out.println(result.getStreetLineOne());
      System.out.println(result.getStreetLineTwo());
      System.out.println(result.getPostOfficeBox());
      System.out.println(result.getCity());
      System.out.println(result.getPostalCode());
      System.out.println(result.getPostalCodeExtension());
      System.out.println(result.getCountrySubdivisionCode());
      System.out.println(result.getCountryCode());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#updateCommunicationItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommunicationResource1> response = client
              .worker
              .updateCommunicationItem(workerId, communicationId)
              .communicationId(communicationId)
              .type(type)
              .usageType(usageType)
              .dialCountry(dialCountry)
              .dialArea(dialArea)
              .dialNumber(dialNumber)
              .dialExtension(dialExtension)
              .uri(uri)
              .streetLineOne(streetLineOne)
              .streetLineTwo(streetLineTwo)
              .postOfficeBox(postOfficeBox)
              .city(city)
              .postalCode(postalCode)
              .postalCodeExtension(postalCodeExtension)
              .countrySubdivisionCode(countrySubdivisionCode)
              .countryCode(countryCode)
              .links(links)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#updateCommunicationItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| The id assigned to the worker that workers are being requested for. | |
| **communicationId** | **String**| The id of a single workers communication. | |
| **communicationResource1** | [**CommunicationResource1**](CommunicationResource1.md)|  | |

### Return type

[**CommunicationResource1**](CommunicationResource1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/vnd.paychex.worker.communication.v1+json
 - **Accept**: application/json, application/vnd.paychex.worker.communication.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="updateCompensationRate"></a>
# **updateCompensationRate**
> PayRateResource updateCompensationRate(workerId, rateId, payRateResource).execute();

Worker Pay Rate

Update a workers specific compensation rate.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String rateId = "rateId_example"; // The id of a single workers compensation rate.
    String description = "description_example"; // Describes the rate for the worker.
    String rateId = "rateId_example"; // Unique identifier for this workers pay rate. **This ID will change if this is created for an IN_PROGRESS worker that is later completed within Flex**
    OffsetDateTime startDate = OffsetDateTime.now(); // The date when the pay rate is going to begin.
    String rateNumber = "rateNumber_example"; // The number of the rate. A worker can have up to 5 different rates.
    String rateType = "ANNUAL_SALARY"; // Type of rate.
    String amount = "amount_example"; // The currency amount which this rate is applied.
    String standardHours = "standardHours_example"; // Default standard hours that this rate is used with a pay frequency.
    String standardOvertime = "standardOvertime_example"; // Default over time hours that this rate is used with a pay frequency.
    Boolean _default = true; // If this rate is the default one to apply on the worker.
    String effectiveDate = "effectiveDate_example"; // The date when the pay rate becomes effective for the worker.(can be used only in POST/PATCH for an active worker)
    List<Link> links = Arrays.asList();
    try {
      PayRateResource result = client
              .worker
              .updateCompensationRate(workerId, rateId)
              .description(description)
              .rateId(rateId)
              .startDate(startDate)
              .rateNumber(rateNumber)
              .rateType(rateType)
              .amount(amount)
              .standardHours(standardHours)
              .standardOvertime(standardOvertime)
              ._default(_default)
              .effectiveDate(effectiveDate)
              .links(links)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getRateId());
      System.out.println(result.getStartDate());
      System.out.println(result.getRateNumber());
      System.out.println(result.getRateType());
      System.out.println(result.getAmount());
      System.out.println(result.getStandardHours());
      System.out.println(result.getStandardOvertime());
      System.out.println(result.getDefault());
      System.out.println(result.getEffectiveDate());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#updateCompensationRate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayRateResource> response = client
              .worker
              .updateCompensationRate(workerId, rateId)
              .description(description)
              .rateId(rateId)
              .startDate(startDate)
              .rateNumber(rateNumber)
              .rateType(rateType)
              .amount(amount)
              .standardHours(standardHours)
              .standardOvertime(standardOvertime)
              ._default(_default)
              .effectiveDate(effectiveDate)
              .links(links)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#updateCompensationRate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **rateId** | **String**| The id of a single workers compensation rate. | |
| **payRateResource** | [**PayRateResource**](PayRateResource.md)|  | |

### Return type

[**PayRateResource**](PayRateResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/vnd.paychex.payroll.compensation.payrate.v1+json
 - **Accept**: application/json, application/vnd.paychex.payroll.compensation.payrate.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a name="updateContact"></a>
# **updateContact**
> WorkerContactResource updateContact(workerId, contactId, workerContactResource).execute();

Worker Contacts

Update a worker contact. A contact may represent a person or entity (organization) but not both. A contact must have at least one communication (telecom, postal, or email). Person contacts can have multiple communications for each communication type (telecom, postal, or email) to support BUSINESS and PERSONAL. Exactly one contact must be marked as primary for each contact type. When a new contact is made primary the previous primary contact will be marked as not primary. A postal contact can be switched from a street address to a PO box and vice versa. This is done by setting either streetLineOne or postOfficeBox (a postal communication may not have both). Use the GET /companies/{companyId}/contacttypes endpoint to get a full list of available contact types and relationship types (used for person contacts).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String contactId = "contactId_example"; // ID associated with desired worker contact.
    String contactId = "contactId_example"; // The ID for the workers specific contact.
    ContactTypeResource1 contactType = new ContactTypeResource1();
    RelationshipResource relationship = new RelationshipResource();
    try {
      WorkerContactResource result = client
              .worker
              .updateContact(workerId, contactId)
              .contactId(contactId)
              .contactType(contactType)
              .relationship(relationship)
              .execute();
      System.out.println(result);
      System.out.println(result.getContactId());
      System.out.println(result.getContactType());
      System.out.println(result.getRelationship());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#updateContact");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkerContactResource> response = client
              .worker
              .updateContact(workerId, contactId)
              .contactId(contactId)
              .contactType(contactType)
              .relationship(relationship)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#updateContact");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **contactId** | **String**| ID associated with desired worker contact. | |
| **workerContactResource** | [**WorkerContactResource**](WorkerContactResource.md)|  | |

### Return type

[**WorkerContactResource**](WorkerContactResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/vnd.paychex.worker.contacts.v1+json
 - **Accept**: application/json, application/vnd.paychex.worker.contacts.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="updateCustomField"></a>
# **updateCustomField**
> WorkerCustomFieldsResource updateCustomField(workerId, workerCustomFieldId, workerCustomFieldsResource).execute();

Worker CustomField

Update CustomField at the worker level

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String workerCustomFieldId = "workerCustomFieldId_example"; // ID associated with desired worker custom field.
    String workerCustomFieldId = "workerCustomFieldId_example"; // The unique identifier that is autogenerated when a custom field is created
    String customFieldId = "customFieldId_example"; // client Custom Field Id
    String type = "DROPDOWN"; // The type of field the custom field is
    Boolean booleanValue = true; // The value for BOOLEAN type (true/false)
    String textValue = "textValue_example"; // The value for TEXT type (any text, alphanumeric, special characters allowed)
    Double numericValue = 3.4D; // Numeric data type can have three formats namely - whole number, second decimal place and fourth decimal place, example: 12 , 12.34 or 12.3456
    OffsetDateTime dateValue = OffsetDateTime.now(); // The value for DATE type , example : 2012-02-01T05:00:00Z
    String dropdownId = "dropdownId_example"; // The unique identifier that is autogenerated when dropdown list is created
    String dropdownValue = "dropdownValue_example"; // The value for dropdown list
    String customFieldName = "customFieldName_example"; // The name of the custom field. Such as: \\\"Hobbies\\\"
    Boolean required = true; // Where to indicate if the custom field is required on the worker where true = required and false = not required
    Boolean checkStub = true; // Where to indicate if the custom field is required on the workers pay stub, where true = required and false = not required.
    Boolean employeeEditable = true; // Where to indicate if the custom field is able to be edited by the employee, where true = required and false = not required.
    try {
      WorkerCustomFieldsResource result = client
              .worker
              .updateCustomField(workerId, workerCustomFieldId)
              .workerCustomFieldId(workerCustomFieldId)
              .customFieldId(customFieldId)
              .type(type)
              .booleanValue(booleanValue)
              .textValue(textValue)
              .numericValue(numericValue)
              .dateValue(dateValue)
              .dropdownId(dropdownId)
              .dropdownValue(dropdownValue)
              .customFieldName(customFieldName)
              .required(required)
              .checkStub(checkStub)
              .employeeEditable(employeeEditable)
              .execute();
      System.out.println(result);
      System.out.println(result.getWorkerCustomFieldId());
      System.out.println(result.getCustomFieldId());
      System.out.println(result.getType());
      System.out.println(result.getBooleanValue());
      System.out.println(result.getTextValue());
      System.out.println(result.getNumericValue());
      System.out.println(result.getDateValue());
      System.out.println(result.getDropdownId());
      System.out.println(result.getDropdownValue());
      System.out.println(result.getCustomFieldName());
      System.out.println(result.getRequired());
      System.out.println(result.getCheckStub());
      System.out.println(result.getEmployeeEditable());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#updateCustomField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkerCustomFieldsResource> response = client
              .worker
              .updateCustomField(workerId, workerCustomFieldId)
              .workerCustomFieldId(workerCustomFieldId)
              .customFieldId(customFieldId)
              .type(type)
              .booleanValue(booleanValue)
              .textValue(textValue)
              .numericValue(numericValue)
              .dateValue(dateValue)
              .dropdownId(dropdownId)
              .dropdownValue(dropdownValue)
              .customFieldName(customFieldName)
              .required(required)
              .checkStub(checkStub)
              .employeeEditable(employeeEditable)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#updateCustomField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **workerCustomFieldId** | **String**| ID associated with desired worker custom field. | |
| **workerCustomFieldsResource** | [**WorkerCustomFieldsResource**](WorkerCustomFieldsResource.md)|  | |

### Return type

[**WorkerCustomFieldsResource**](WorkerCustomFieldsResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/vnd.paychex.worker.customfield.v1+json
 - **Accept**: application/json, application/vnd.paychex.worker.customfield.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Worker Custom field successfully updated |  -  |

<a name="updateDirectDeposit"></a>
# **updateDirectDeposit**
> DirectDepositResource updateDirectDeposit(workerId, directDepositId, directDepositResource).effectivitydate(effectivitydate).execute();

Worker Direct Deposit

Update a single direct deposit for a an \&quot;Active\&quot; worker.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String directDepositId = "directDepositId_example"; // The id assigned to the direct deposit for this worker.
    String directDepositId = "directDepositId_example"; // The ID for the direct deposit item.
    OffsetDateTime startDate = OffsetDateTime.now(); // The date that this direct deposit will be applied to future pay periods. This data field cannot be PATCHED.
    String paymentType = "FLAT_DOLLAR_AMOUNT"; // A type of payment for the direct deposit.
    String accountType = "CHECKING"; // Financial institutions account type. This data field cannot be PATCHED.
    Double value = 3.4D; // The amount to be applied to this direct deposit.
    String routingNumber = "routingNumber_example"; // The financial institutions routing number.This data field cannot be PATCHED.
    String accountNumber = "accountNumber_example"; // The financial institutions account number.This data field cannot be PATCHED.
    String priority = "priority_example"; // The priority order for which the direct deposits will be performed in. When a new direct deposit is added the priority will be assigned. The priority can be modified only by swapping with a different direct deposit using the bulk PATCH. A paymentType of REMAINDER will show a priority of 99 and can't be modified.This data field cannot be PATCHED.
    List<Link> links = Arrays.asList();
    String effectivitydate = "effectivitydate_example"; // The effectivity date.
    try {
      DirectDepositResource result = client
              .worker
              .updateDirectDeposit(workerId, directDepositId)
              .directDepositId(directDepositId)
              .startDate(startDate)
              .paymentType(paymentType)
              .accountType(accountType)
              .value(value)
              .routingNumber(routingNumber)
              .accountNumber(accountNumber)
              .priority(priority)
              .links(links)
              .effectivitydate(effectivitydate)
              .execute();
      System.out.println(result);
      System.out.println(result.getDirectDepositId());
      System.out.println(result.getStartDate());
      System.out.println(result.getPaymentType());
      System.out.println(result.getAccountType());
      System.out.println(result.getValue());
      System.out.println(result.getRoutingNumber());
      System.out.println(result.getAccountNumber());
      System.out.println(result.getPriority());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#updateDirectDeposit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DirectDepositResource> response = client
              .worker
              .updateDirectDeposit(workerId, directDepositId)
              .directDepositId(directDepositId)
              .startDate(startDate)
              .paymentType(paymentType)
              .accountType(accountType)
              .value(value)
              .routingNumber(routingNumber)
              .accountNumber(accountNumber)
              .priority(priority)
              .links(links)
              .effectivitydate(effectivitydate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#updateDirectDeposit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **directDepositId** | **String**| The id assigned to the direct deposit for this worker. | |
| **directDepositResource** | [**DirectDepositResource**](DirectDepositResource.md)|  | |
| **effectivitydate** | **String**| The effectivity date. | [optional] |

### Return type

[**DirectDepositResource**](DirectDepositResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/vnd.paychex.payroll.directdeposit.v1+json
 - **Accept**: application/json, application/vnd.paychex.payroll.directdeposit.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a name="updateDirectDeposits"></a>
# **updateDirectDeposits**
> DirectDepositResource updateDirectDeposits(workerId, directDepositResource).effectivitydate(effectivitydate).execute();

Worker Direct Deposits

Update multiple direct deposits of an \&quot;Active\&quot; Worker at a time.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String directDepositId = "directDepositId_example"; // The ID for the direct deposit item.
    OffsetDateTime startDate = OffsetDateTime.now(); // The date that this direct deposit will be applied to future pay periods. This data field cannot be PATCHED.
    String paymentType = "FLAT_DOLLAR_AMOUNT"; // A type of payment for the direct deposit.
    String accountType = "CHECKING"; // Financial institutions account type. This data field cannot be PATCHED.
    Double value = 3.4D; // The amount to be applied to this direct deposit.
    String routingNumber = "routingNumber_example"; // The financial institutions routing number.This data field cannot be PATCHED.
    String accountNumber = "accountNumber_example"; // The financial institutions account number.This data field cannot be PATCHED.
    String priority = "priority_example"; // The priority order for which the direct deposits will be performed in. When a new direct deposit is added the priority will be assigned. The priority can be modified only by swapping with a different direct deposit using the bulk PATCH. A paymentType of REMAINDER will show a priority of 99 and can't be modified.This data field cannot be PATCHED.
    List<Link> links = Arrays.asList();
    String effectivitydate = "effectivitydate_example"; // The effectivity date.
    try {
      DirectDepositResource result = client
              .worker
              .updateDirectDeposits(workerId)
              .directDepositId(directDepositId)
              .startDate(startDate)
              .paymentType(paymentType)
              .accountType(accountType)
              .value(value)
              .routingNumber(routingNumber)
              .accountNumber(accountNumber)
              .priority(priority)
              .links(links)
              .effectivitydate(effectivitydate)
              .execute();
      System.out.println(result);
      System.out.println(result.getDirectDepositId());
      System.out.println(result.getStartDate());
      System.out.println(result.getPaymentType());
      System.out.println(result.getAccountType());
      System.out.println(result.getValue());
      System.out.println(result.getRoutingNumber());
      System.out.println(result.getAccountNumber());
      System.out.println(result.getPriority());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#updateDirectDeposits");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DirectDepositResource> response = client
              .worker
              .updateDirectDeposits(workerId)
              .directDepositId(directDepositId)
              .startDate(startDate)
              .paymentType(paymentType)
              .accountType(accountType)
              .value(value)
              .routingNumber(routingNumber)
              .accountNumber(accountNumber)
              .priority(priority)
              .links(links)
              .effectivitydate(effectivitydate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#updateDirectDeposits");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **directDepositResource** | [**DirectDepositResource**](DirectDepositResource.md)|  | |
| **effectivitydate** | **String**| The effectivity date. | [optional] |

### Return type

[**DirectDepositResource**](DirectDepositResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/vnd.paychex.payroll.directdeposits.v1+json
 - **Accept**: application/json, application/vnd.paychex.payroll.directdeposits.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | This is successful |  -  |

<a name="updateFederalTaxSetup"></a>
# **updateFederalTaxSetup**
> WorkerFederalTaxResource updateFederalTaxSetup(workerId, workerFederalTaxResource).execute();

Worker Federal Tax

Update the federal tax setup for a \&quot;Active\&quot; or \&quot;In-progress\&quot; worker.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String taxId = "taxId_example"; // The ID for the federal tax item.
    String filingStatus = "SINGLE_OR_MARRIED_FILING_SEPARATELY"; // Filing status.
    String multipleJobs = "true"; // See federal W-4 instructions.
    String dependentsAmount = "dependentsAmount_example"; // See federal W-4 instructions.
    String otherIncome = "otherIncome_example"; // See federal W-4 instructions.
    String deductionsAmount = "deductionsAmount_example"; // See federal W-4 instructions.
    String extraWithholdingAmount = "extraWithholdingAmount_example"; // Additional tax you want withheld each pay period.
    String taxesWithheld = "true = Federal taxes withheld"; // Should federal taxes be withheld.
    try {
      WorkerFederalTaxResource result = client
              .worker
              .updateFederalTaxSetup(workerId)
              .taxId(taxId)
              .filingStatus(filingStatus)
              .multipleJobs(multipleJobs)
              .dependentsAmount(dependentsAmount)
              .otherIncome(otherIncome)
              .deductionsAmount(deductionsAmount)
              .extraWithholdingAmount(extraWithholdingAmount)
              .taxesWithheld(taxesWithheld)
              .execute();
      System.out.println(result);
      System.out.println(result.getTaxId());
      System.out.println(result.getFilingStatus());
      System.out.println(result.getMultipleJobs());
      System.out.println(result.getDependentsAmount());
      System.out.println(result.getOtherIncome());
      System.out.println(result.getDeductionsAmount());
      System.out.println(result.getExtraWithholdingAmount());
      System.out.println(result.getTaxesWithheld());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#updateFederalTaxSetup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkerFederalTaxResource> response = client
              .worker
              .updateFederalTaxSetup(workerId)
              .taxId(taxId)
              .filingStatus(filingStatus)
              .multipleJobs(multipleJobs)
              .dependentsAmount(dependentsAmount)
              .otherIncome(otherIncome)
              .deductionsAmount(deductionsAmount)
              .extraWithholdingAmount(extraWithholdingAmount)
              .taxesWithheld(taxesWithheld)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#updateFederalTaxSetup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **workerFederalTaxResource** | [**WorkerFederalTaxResource**](WorkerFederalTaxResource.md)|  | |

### Return type

[**WorkerFederalTaxResource**](WorkerFederalTaxResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/vnd.paychex.worker.federaltax2020.v1+json
 - **Accept**: application/vnd.paychex.worker.federaltax2020.v1+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Worker Federal Tax successfully returned |  -  |

<a name="updatePayComponent"></a>
# **updatePayComponent**
> RecurringResource updatePayComponent(workerId, workerComponentId, recurringResource).execute();

Worker Pay Component

 Update a single pay component associated to the \&quot;Active\&quot; worker.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String workerComponentId = "workerComponentId_example"; // The id of a single pay component that a workers has.
    String workerComponentId = "workerComponentId_example"; // The id of a single pay component that a workers has.
    String componentId = "componentId_example"; // The unique identifier of the pay component. This data field cannot be PATCHED.
    String name = "name_example"; // Name of the pay component. This data field will be populated automatically based on componentId.
    String calculationType = "FLAT_DOLLAR_AMOUNT:This is used for a specific dollar amount"; // The type of calculation that will be applied for the pay component .
    String calculationBaseId = "calculationBaseId_example"; // This is required if you are not using a FLAT_DOLLAR_AMOUNT Calculation Type.
    Double value = 3.4D; // This is used to specify the value that is used against the calculationType.
    OffsetDateTime startDate = OffsetDateTime.now(); // Date which this pay component will start to be applied during the payruns. This is an optional field that default to current datetime if not provided. This cannot be backdated but can be added to start in the future.
    OffsetDateTime effectiveDate = OffsetDateTime.now(); // Date which this pay component has started for the worker.
    OffsetDateTime endDate = OffsetDateTime.now(); // Date which this pay component has ended for the worker.
    String effectOnPay = "effectOnPay_example"; // What the effect on pay will be (REDUCTION OR ADDITION), currently only reductions are available. This data field will be populated automatically based on componentId. This data field cannot be PATCHED
    String classificationType = "classificationType_example"; // The category that this component falls into.
    PayComponentFrequencyTypeResource1 frequency = new PayComponentFrequencyTypeResource1();
    List<Link> links = Arrays.asList();
    try {
      RecurringResource result = client
              .worker
              .updatePayComponent(workerId, workerComponentId)
              .workerComponentId(workerComponentId)
              .componentId(componentId)
              .name(name)
              .calculationType(calculationType)
              .calculationBaseId(calculationBaseId)
              .value(value)
              .startDate(startDate)
              .effectiveDate(effectiveDate)
              .endDate(endDate)
              .effectOnPay(effectOnPay)
              .classificationType(classificationType)
              .frequency(frequency)
              .links(links)
              .execute();
      System.out.println(result);
      System.out.println(result.getWorkerComponentId());
      System.out.println(result.getComponentId());
      System.out.println(result.getName());
      System.out.println(result.getCalculationType());
      System.out.println(result.getCalculationBaseId());
      System.out.println(result.getValue());
      System.out.println(result.getStartDate());
      System.out.println(result.getEffectiveDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getEffectOnPay());
      System.out.println(result.getClassificationType());
      System.out.println(result.getFrequency());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#updatePayComponent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecurringResource> response = client
              .worker
              .updatePayComponent(workerId, workerComponentId)
              .workerComponentId(workerComponentId)
              .componentId(componentId)
              .name(name)
              .calculationType(calculationType)
              .calculationBaseId(calculationBaseId)
              .value(value)
              .startDate(startDate)
              .effectiveDate(effectiveDate)
              .endDate(endDate)
              .effectOnPay(effectOnPay)
              .classificationType(classificationType)
              .frequency(frequency)
              .links(links)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#updatePayComponent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **workerComponentId** | **String**| The id of a single pay component that a workers has. | |
| **recurringResource** | [**RecurringResource**](RecurringResource.md)|  | |

### Return type

[**RecurringResource**](RecurringResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/vnd.paychex.payroll.paycomponent.v1+json
 - **Accept**: application/json, application/vnd.paychex.payroll.paycomponent.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a name="updatePayComponents"></a>
# **updatePayComponents**
> RecurringResource updatePayComponents(workerId, recurringResource).execute();

Worker Pay Components

Batch update pay components associated to the \&quot;Active\&quot; worker.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String workerComponentId = "workerComponentId_example"; // The id of a single pay component that a workers has.
    String componentId = "componentId_example"; // The unique identifier of the pay component. This data field cannot be PATCHED.
    String name = "name_example"; // Name of the pay component. This data field will be populated automatically based on componentId.
    String calculationType = "FLAT_DOLLAR_AMOUNT:This is used for a specific dollar amount"; // The type of calculation that will be applied for the pay component .
    String calculationBaseId = "calculationBaseId_example"; // This is required if you are not using a FLAT_DOLLAR_AMOUNT Calculation Type.
    Double value = 3.4D; // This is used to specify the value that is used against the calculationType.
    OffsetDateTime startDate = OffsetDateTime.now(); // Date which this pay component will start to be applied during the payruns. This is an optional field that default to current datetime if not provided. This cannot be backdated but can be added to start in the future.
    OffsetDateTime effectiveDate = OffsetDateTime.now(); // Date which this pay component has started for the worker.
    OffsetDateTime endDate = OffsetDateTime.now(); // Date which this pay component has ended for the worker.
    String effectOnPay = "effectOnPay_example"; // What the effect on pay will be (REDUCTION OR ADDITION), currently only reductions are available. This data field will be populated automatically based on componentId. This data field cannot be PATCHED
    String classificationType = "classificationType_example"; // The category that this component falls into.
    PayComponentFrequencyTypeResource1 frequency = new PayComponentFrequencyTypeResource1();
    List<Link> links = Arrays.asList();
    try {
      RecurringResource result = client
              .worker
              .updatePayComponents(workerId)
              .workerComponentId(workerComponentId)
              .componentId(componentId)
              .name(name)
              .calculationType(calculationType)
              .calculationBaseId(calculationBaseId)
              .value(value)
              .startDate(startDate)
              .effectiveDate(effectiveDate)
              .endDate(endDate)
              .effectOnPay(effectOnPay)
              .classificationType(classificationType)
              .frequency(frequency)
              .links(links)
              .execute();
      System.out.println(result);
      System.out.println(result.getWorkerComponentId());
      System.out.println(result.getComponentId());
      System.out.println(result.getName());
      System.out.println(result.getCalculationType());
      System.out.println(result.getCalculationBaseId());
      System.out.println(result.getValue());
      System.out.println(result.getStartDate());
      System.out.println(result.getEffectiveDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getEffectOnPay());
      System.out.println(result.getClassificationType());
      System.out.println(result.getFrequency());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#updatePayComponents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecurringResource> response = client
              .worker
              .updatePayComponents(workerId)
              .workerComponentId(workerComponentId)
              .componentId(componentId)
              .name(name)
              .calculationType(calculationType)
              .calculationBaseId(calculationBaseId)
              .value(value)
              .startDate(startDate)
              .effectiveDate(effectiveDate)
              .endDate(endDate)
              .effectOnPay(effectOnPay)
              .classificationType(classificationType)
              .frequency(frequency)
              .links(links)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#updatePayComponents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **recurringResource** | [**RecurringResource**](RecurringResource.md)|  | |

### Return type

[**RecurringResource**](RecurringResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/vnd.paychex.payroll.paycomponents.v1+json
 - **Accept**: application/json, application/vnd.paychex.payroll.paycomponents.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a name="updateUniqueWorker"></a>
# **updateUniqueWorker**
> WorkerResource1 updateUniqueWorker(workerId, workerResource1).execute();

Worker

Update a unique worker (employee and contractor) that your application has been granted access to modify.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String workerId = "workerId_example"; // The unique identifier associated with this worker representation.
    String employeeId = "employeeId_example"; // The workers employee identification information.
    String workerType = "EMPLOYEE"; // The type of worker. This data field cannot be PATCHED.
    String employmentType = "FULL_TIME"; // The type of employment for the worker.
    String exemptionType = "EXEMPT"; // The Overtime classification of the worker. This data field cannot be PATCHED for ACTIVE workers.
    OffsetDateTime birthDate = OffsetDateTime.now(); // The workers date of birth. It cannot be greater than today's date.
    String sex = "MALE";
    String ethnicityCode = "ethnicityCode_example"; // Disclaimer:This parameter is not visible in Flex for the client. This data field cannot be PATCHED for ACTIVE workers.
    OffsetDateTime hireDate = OffsetDateTime.now(); // The date which the worker was hired. It cannot be PATCHED for ACTIVE workers.
    String clockId = "clockId_example"; // The clock ID of the worker that can be an identification for other systems.
    NameResource1 name = new NameResource1();
    LegalIdResource1 legalId = new LegalIdResource1();
    String laborAssignmentId = "laborAssignmentId_example"; // The workers home labor assignment. This data field cannot be POSTED or PATCHED.
    String locationId = "locationId_example"; // The workers location. This data field cannot be POSTED or PATCHED.
    String jobId = "jobId_example"; // The workers home job. This data field cannot be POSTED or PATCHED.
    JobTitleResource1 job = new JobTitleResource1();
    OrganizationResource1 organization = new OrganizationResource1();
    SupervisorResource1 supervisor = new SupervisorResource1();
    Status1 currentStatus = new Status1();
    List<CommunicationResource1> communications = Arrays.asList(); // Worker Communications. This data field cannot be updated for worker endpoint.
    List<Link> links = Arrays.asList();
    String workerCorrelationId = "workerCorrelationId_example"; // Id that you define which is used for error handling/responses.This data field is used while POSTING multiple IN_PROGRESS workers
    try {
      WorkerResource1 result = client
              .worker
              .updateUniqueWorker(workerId)
              .workerId(workerId)
              .employeeId(employeeId)
              .workerType(workerType)
              .employmentType(employmentType)
              .exemptionType(exemptionType)
              .birthDate(birthDate)
              .sex(sex)
              .ethnicityCode(ethnicityCode)
              .hireDate(hireDate)
              .clockId(clockId)
              .name(name)
              .legalId(legalId)
              .laborAssignmentId(laborAssignmentId)
              .locationId(locationId)
              .jobId(jobId)
              .job(job)
              .organization(organization)
              .supervisor(supervisor)
              .currentStatus(currentStatus)
              .communications(communications)
              .links(links)
              .workerCorrelationId(workerCorrelationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getWorkerId());
      System.out.println(result.getEmployeeId());
      System.out.println(result.getWorkerType());
      System.out.println(result.getEmploymentType());
      System.out.println(result.getExemptionType());
      System.out.println(result.getBirthDate());
      System.out.println(result.getSex());
      System.out.println(result.getEthnicityCode());
      System.out.println(result.getHireDate());
      System.out.println(result.getClockId());
      System.out.println(result.getName());
      System.out.println(result.getLegalId());
      System.out.println(result.getLaborAssignmentId());
      System.out.println(result.getLocationId());
      System.out.println(result.getJobId());
      System.out.println(result.getJob());
      System.out.println(result.getOrganization());
      System.out.println(result.getSupervisor());
      System.out.println(result.getCurrentStatus());
      System.out.println(result.getCommunications());
      System.out.println(result.getLinks());
      System.out.println(result.getWorkerCorrelationId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#updateUniqueWorker");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkerResource1> response = client
              .worker
              .updateUniqueWorker(workerId)
              .workerId(workerId)
              .employeeId(employeeId)
              .workerType(workerType)
              .employmentType(employmentType)
              .exemptionType(exemptionType)
              .birthDate(birthDate)
              .sex(sex)
              .ethnicityCode(ethnicityCode)
              .hireDate(hireDate)
              .clockId(clockId)
              .name(name)
              .legalId(legalId)
              .laborAssignmentId(laborAssignmentId)
              .locationId(locationId)
              .jobId(jobId)
              .job(job)
              .organization(organization)
              .supervisor(supervisor)
              .currentStatus(currentStatus)
              .communications(communications)
              .links(links)
              .workerCorrelationId(workerCorrelationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#updateUniqueWorker");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workerId** | **String**| ID associated with desired worker. | |
| **workerResource1** | [**WorkerResource1**](WorkerResource1.md)|  | |

### Return type

[**WorkerResource1**](WorkerResource1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/vnd.paychex.worker.v1+json
 - **Accept**: application/json, application/vnd.paychex.worker.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

