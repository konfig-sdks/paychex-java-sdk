# PayrollApi

All URIs are relative to *https://api.paychex.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCompanyChecks**](PayrollApi.md#addCompanyChecks) | **POST** /companies/{companyId}/checks | Company Checks |
| [**addPayComponentToCheck**](PayrollApi.md#addPayComponentToCheck) | **POST** /checks/{checkId}/checkcomponents | Pay Component to a check. |
| [**addWorkerCheck**](PayrollApi.md#addWorkerCheck) | **POST** /workers/{workerId}/checks | Worker Check |
| [**deleteChecksByPayPeriodAndUser**](PayrollApi.md#deleteChecksByPayPeriodAndUser) | **DELETE** /checks | Checks by Pay Period and User |
| [**getCompanyChecksByPayPeriod**](PayrollApi.md#getCompanyChecksByPayPeriod) | **GET** /companies/{companyId}/checks | Company Checks |
| [**getCompanyPayComponent**](PayrollApi.md#getCompanyPayComponent) | **GET** /companies/{companyId}/paycomponents/{paycomponentId} | Company Pay Component |
| [**getCompanyPayComponents**](PayrollApi.md#getCompanyPayComponents) | **GET** /companies/{companyId}/paycomponents | Company Pay Components |
| [**getCompanyPayPeriods**](PayrollApi.md#getCompanyPayPeriods) | **GET** /companies/{companyId}/payperiods | Company Pay Periods |
| [**getPayPeriod**](PayrollApi.md#getPayPeriod) | **GET** /companies/{companyId}/payperiods/{payperiodId} | Company Pay Period |
| [**getWorkerCheck**](PayrollApi.md#getWorkerCheck) | **GET** /workers/{workerId}/checks/{externalCheckId} | Worker Check |
| [**getWorkerChecksByPayPeriod**](PayrollApi.md#getWorkerChecksByPayPeriod) | **GET** /workers/{workerId}/checks | Worker Checks |
| [**removePayComponent**](PayrollApi.md#removePayComponent) | **DELETE** /checks/{checkId}/checkcomponents/{checkComponentId} | Pay Component of a check |
| [**removeWorkerCheck**](PayrollApi.md#removeWorkerCheck) | **DELETE** /workers/{workerId}/checks/{externalCheckId} | Worker Check |
| [**updatePayComponent**](PayrollApi.md#updatePayComponent) | **PATCH** /checks/{checkId}/checkcomponents/{checkComponentId} | Pay Component of a Check |


<a name="addCompanyChecks"></a>
# **addCompanyChecks**
> CheckResource addCompanyChecks(companyId, checkResource).execute();

Company Checks

Add a check for one or more worker within a company for an available pay period.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // ID associated with desired company.
    String workerId = "workerId_example"; // The id assigned to the worker.
    String paycheckId = "paycheckId_example"; // The id of a single check that a workers has.
    String payPeriodId = "payPeriodId_example"; // The id for the unprocessed payperiod. 
    String checkCorrelationId = "checkCorrelationId_example"; // Id that you define which is used for error handling/responses. This is not required when sending a single check.
    Boolean blockAutoDistribution = true; // This is used optionally for blocking the auto distribution of the earnings on the workers if they are setup for auto distribution.
    List<PayComponentResource> earnings = Arrays.asList(); // The earnings to apply to the check.Each earning needs to define as one of the following:1 .payHours: Will use the default hourly rate defined on the worker to apply the hours against. 2. payHours and payRate: Will allow you to define the monetary rate that the hours will be applied against. 3. payHours and payRateId: Will allow you to define which workers predefined pay rate the hours will be applied against. 4. payUnits: Will use the default hourly rate defined on the worker to apply the units against. 5. payUnits and payRate: Will allow you to define the monetary rate that the units will be applied against. 6. payUnits and payRateId: Will allow you to define which workers predefined pay rate the units will be applied against. 7. payAmount: Will allow you to define straight monetary amount.
    List<PayComponentResource> deductions = Arrays.asList(); // Deduction pay components on the check.
    String checkDate = "checkDate_example"; // The check date 
    List<PayComponentResource> informational = Arrays.asList(); // Informational pay components on the check.
    List<PayComponentResource> taxes = Arrays.asList(); // Tax pay components on the check.
    List<Link> links = Arrays.asList();
    try {
      CheckResource result = client
              .payroll
              .addCompanyChecks(companyId)
              .workerId(workerId)
              .paycheckId(paycheckId)
              .payPeriodId(payPeriodId)
              .checkCorrelationId(checkCorrelationId)
              .blockAutoDistribution(blockAutoDistribution)
              .earnings(earnings)
              .deductions(deductions)
              .checkDate(checkDate)
              .informational(informational)
              .taxes(taxes)
              .links(links)
              .execute();
      System.out.println(result);
      System.out.println(result.getWorkerId());
      System.out.println(result.getPaycheckId());
      System.out.println(result.getPayPeriodId());
      System.out.println(result.getCheckCorrelationId());
      System.out.println(result.getBlockAutoDistribution());
      System.out.println(result.getEarnings());
      System.out.println(result.getDeductions());
      System.out.println(result.getCheckDate());
      System.out.println(result.getInformational());
      System.out.println(result.getTaxes());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#addCompanyChecks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CheckResource> response = client
              .payroll
              .addCompanyChecks(companyId)
              .workerId(workerId)
              .paycheckId(paycheckId)
              .payPeriodId(payPeriodId)
              .checkCorrelationId(checkCorrelationId)
              .blockAutoDistribution(blockAutoDistribution)
              .earnings(earnings)
              .deductions(deductions)
              .checkDate(checkDate)
              .informational(informational)
              .taxes(taxes)
              .links(links)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#addCompanyChecks");
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
| **companyId** | **String**| ID associated with desired company. | |
| **checkResource** | [**CheckResource**](CheckResource.md)|  | |

### Return type

[**CheckResource**](CheckResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.paychex.payroll.checks.v1+json
 - **Accept**: application/json, application/vnd.paychex.payroll.checks.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |

<a name="addPayComponentToCheck"></a>
# **addPayComponentToCheck**
> CheckResource2 addPayComponentToCheck(checkId, payComponentResource2).execute();

Pay Component to a check.

Add a new pay component on an individual unprocessed check.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String checkId = "checkId_example"; // ID associated with desired check.
    String description = "description_example"; // Description
    String componentId = "componentId_example"; // The identifier of the pay component to add to the check. An overtime pay component can't be placed on a worker that is OT exempt.
    String checkComponentId = "checkComponentId_example"; // The unique identifier associated for the pay component on this check.
    String name = "name_example"; // The name given to the pay component
    String classificationType = "classificationType_example"; // The category that this component falls into.
    String effectOnPay = "ADDITION"; // The effect that the pay component will have on the check amount.
    OffsetDateTime startDate = OffsetDateTime.now(); // The date that the pay component is able to be applied on a check.
    OffsetDateTime endDate = OffsetDateTime.now(); // The date that the pay component is not available to be applied on a check moving forward.
    List<String> appliesToWorkerTypes = Arrays.asList(); // Applies To WorkerTypes.
    String jobId = "jobId_example"; // This is used optionally for overriding a job when it needs to be different then the workers default. This option is only available when the client has job costing.
    String laborAssignmentId = "laborAssignmentId_example"; // This is used optionally for overriding a labor assignment when it needs to be different then the workers assignment distribution. This option is only available when the client has labor assignment.
    String payRateId = "payRateId_example"; // The rate identifier for the workers compensation
    String payRate = "payRate_example"; // The rate amount that will be applied for this component. Used in conjunction with Hours or Units.
    String payHours = "payHours_example"; // The number of hours that will be applied for this component. Used in conjunction with rate.
    String payUnits = "payUnits_example"; // The number of units that will be applied for this component. Used in conjunction with rate.
    String payAmount = "payAmount_example"; // The flat amount to be applied for this component. Not used with Rate, Hours, or Units.
    Boolean memoed = true; // This is used optionally for memoing the payHours or payUnits so that they are informational when using a payAmount.
    OffsetDateTime lineDate = OffsetDateTime.now(); // This is used optionally for specifying a date that the pay component was generated on.
    try {
      CheckResource2 result = client
              .payroll
              .addPayComponentToCheck(checkId)
              .description(description)
              .componentId(componentId)
              .checkComponentId(checkComponentId)
              .name(name)
              .classificationType(classificationType)
              .effectOnPay(effectOnPay)
              .startDate(startDate)
              .endDate(endDate)
              .appliesToWorkerTypes(appliesToWorkerTypes)
              .jobId(jobId)
              .laborAssignmentId(laborAssignmentId)
              .payRateId(payRateId)
              .payRate(payRate)
              .payHours(payHours)
              .payUnits(payUnits)
              .payAmount(payAmount)
              .memoed(memoed)
              .lineDate(lineDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getWorkerId());
      System.out.println(result.getPaycheckId());
      System.out.println(result.getPayPeriodId());
      System.out.println(result.getCheckCorrelationId());
      System.out.println(result.getBlockAutoDistribution());
      System.out.println(result.getEarnings());
      System.out.println(result.getDeductions());
      System.out.println(result.getInformational());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#addPayComponentToCheck");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CheckResource2> response = client
              .payroll
              .addPayComponentToCheck(checkId)
              .description(description)
              .componentId(componentId)
              .checkComponentId(checkComponentId)
              .name(name)
              .classificationType(classificationType)
              .effectOnPay(effectOnPay)
              .startDate(startDate)
              .endDate(endDate)
              .appliesToWorkerTypes(appliesToWorkerTypes)
              .jobId(jobId)
              .laborAssignmentId(laborAssignmentId)
              .payRateId(payRateId)
              .payRate(payRate)
              .payHours(payHours)
              .payUnits(payUnits)
              .payAmount(payAmount)
              .memoed(memoed)
              .lineDate(lineDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#addPayComponentToCheck");
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
| **checkId** | **String**| ID associated with desired check. | |
| **payComponentResource2** | [**PayComponentResource2**](PayComponentResource2.md)|  | |

### Return type

[**CheckResource2**](CheckResource2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/vnd.paychex.payroll.check.checkcomponent.v1+json
 - **Accept**: application/json, application/vnd.paychex.payroll.check.checkcomponent.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="addWorkerCheck"></a>
# **addWorkerCheck**
> CheckResource1 addWorkerCheck(workerId, checkResource1).execute();

Worker Check

Add a check to a worker for an unprocessed pay period.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String workerId = "workerId_example"; // The id assigned to the worker
    String paycheckId = "paycheckId_example"; // The id of a single check that a workers has.
    String payPeriodId = "payPeriodId_example"; // The id for the unprocessed payperiod.
    String checkCorrelationId = "checkCorrelationId_example"; // Id that you define which is used for error handling/responses. This is not required when sending a single check.
    Boolean blockAutoDistribution = true; // This is used optionally for blocking the auto distribution of the earnings on the workers if they are setup for auto distribution.
    List<PayComponentResource1> earnings = Arrays.asList(); // The earnings to apply to the check.Each earning needs to define as one of the following:1 .payHours: Will use the default hourly rate defined on the worker to apply the hours against. 2. payHours and payRate: Will allow you to define the monetary rate that the hours will be applied against. 3. payHours and payRateId: Will allow you to define which workers predefined pay rate the hours will be applied against. 4. payUnits: Will use the default hourly rate defined on the worker to apply the units against. 5. payUnits and payRate: Will allow you to define the monetary rate that the units will be applied against. 6. payUnits and payRateId: Will allow you to define which workers predefined pay rate the units will be applied against. 7. payAmount: Will allow you to define straight monetary amount.
    List<PayComponentResource1> deductions = Arrays.asList(); // Deduction pay components on the check.
    List<PayComponentResource1> informational = Arrays.asList(); // Informational pay components on the check.
    List<PayComponentResource1> taxes = Arrays.asList(); // Tax pay components on the check.
    try {
      CheckResource1 result = client
              .payroll
              .addWorkerCheck(workerId)
              .workerId(workerId)
              .paycheckId(paycheckId)
              .payPeriodId(payPeriodId)
              .checkCorrelationId(checkCorrelationId)
              .blockAutoDistribution(blockAutoDistribution)
              .earnings(earnings)
              .deductions(deductions)
              .informational(informational)
              .taxes(taxes)
              .execute();
      System.out.println(result);
      System.out.println(result.getWorkerId());
      System.out.println(result.getPaycheckId());
      System.out.println(result.getPayPeriodId());
      System.out.println(result.getCheckCorrelationId());
      System.out.println(result.getBlockAutoDistribution());
      System.out.println(result.getEarnings());
      System.out.println(result.getDeductions());
      System.out.println(result.getInformational());
      System.out.println(result.getTaxes());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#addWorkerCheck");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CheckResource1> response = client
              .payroll
              .addWorkerCheck(workerId)
              .workerId(workerId)
              .paycheckId(paycheckId)
              .payPeriodId(payPeriodId)
              .checkCorrelationId(checkCorrelationId)
              .blockAutoDistribution(blockAutoDistribution)
              .earnings(earnings)
              .deductions(deductions)
              .informational(informational)
              .taxes(taxes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#addWorkerCheck");
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
| **checkResource1** | [**CheckResource1**](CheckResource1.md)|  | |

### Return type

[**CheckResource1**](CheckResource1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/vnd.paychex.payroll.check.v1+json
 - **Accept**: application/json, application/vnd.paychex.payroll.check.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="deleteChecksByPayPeriodAndUser"></a>
# **deleteChecksByPayPeriodAndUser**
> deleteChecksByPayPeriodAndUser(payperiodid, deletebyuserid).execute();

Checks by Pay Period and User

Delete checks by pay period Id and user Id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String payperiodid = "payperiodid_example"; // ID associated with desired pay period.
    Boolean deletebyuserid = true; // Value for deletebyuserid parameter should be \"true\" 
    try {
      client
              .payroll
              .deleteChecksByPayPeriodAndUser(payperiodid, deletebyuserid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#deleteChecksByPayPeriodAndUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payroll
              .deleteChecksByPayPeriodAndUser(payperiodid, deletebyuserid)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#deleteChecksByPayPeriodAndUser");
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
| **payperiodid** | **String**| ID associated with desired pay period. | |
| **deletebyuserid** | **Boolean**| Value for deletebyuserid parameter should be \&quot;true\&quot;  | |

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

<a name="getCompanyChecksByPayPeriod"></a>
# **getCompanyChecksByPayPeriod**
> CheckResource getCompanyChecksByPayPeriod(companyId, payperiodid).offset(offset).limit(limit).filterbyuserid(filterbyuserid).execute();

Company Checks

Get check(s) that are for a specific company within a processed or unprocessed pay period.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // ID associated with desired company.
    String payperiodid = "payperiodid_example"; // The id assigned to the pay period that the check will be within.
    Integer offset = 0; // The zero based offset of the next page of data to be presented.
    Integer limit = 0; // The maximum number of elements to be returned in a page transition.
    Boolean filterbyuserid = true; // Filter by User Id.
    try {
      CheckResource result = client
              .payroll
              .getCompanyChecksByPayPeriod(companyId, payperiodid)
              .offset(offset)
              .limit(limit)
              .filterbyuserid(filterbyuserid)
              .execute();
      System.out.println(result);
      System.out.println(result.getWorkerId());
      System.out.println(result.getPaycheckId());
      System.out.println(result.getPayPeriodId());
      System.out.println(result.getCheckCorrelationId());
      System.out.println(result.getBlockAutoDistribution());
      System.out.println(result.getEarnings());
      System.out.println(result.getDeductions());
      System.out.println(result.getCheckDate());
      System.out.println(result.getInformational());
      System.out.println(result.getTaxes());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getCompanyChecksByPayPeriod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CheckResource> response = client
              .payroll
              .getCompanyChecksByPayPeriod(companyId, payperiodid)
              .offset(offset)
              .limit(limit)
              .filterbyuserid(filterbyuserid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getCompanyChecksByPayPeriod");
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
| **companyId** | **String**| ID associated with desired company. | |
| **payperiodid** | **String**| The id assigned to the pay period that the check will be within. | |
| **offset** | **Integer**| The zero based offset of the next page of data to be presented. | [optional] [default to 0] |
| **limit** | **Integer**| The maximum number of elements to be returned in a page transition. | [optional] [default to 0] |
| **filterbyuserid** | **Boolean**| Filter by User Id. | [optional] |

### Return type

[**CheckResource**](CheckResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.payroll.checks.v1+json, application/vnd.paychex.payroll.processedchecks.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getCompanyPayComponent"></a>
# **getCompanyPayComponent**
> PayComponentResource getCompanyPayComponent(companyId, paycomponentId).asof(asof).execute();

Company Pay Component

Pay component associated with the company.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // The id assigned to the company that is being requested for.
    String paycomponentId = "paycomponentId_example"; // The unique identifier used to identify a pay component.
    String asof = "2020-01-04T00:00:00Z"; // Returns PayComponent as of the date used in the request.
    try {
      PayComponentResource result = client
              .payroll
              .getCompanyPayComponent(companyId, paycomponentId)
              .asof(asof)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getComponentId());
      System.out.println(result.getCheckComponentId());
      System.out.println(result.getCode());
      System.out.println(result.getName());
      System.out.println(result.getClassificationType());
      System.out.println(result.getEffectOnPay());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getAppliesToWorkerTypes());
      System.out.println(result.getJobId());
      System.out.println(result.getLaborAssignmentId());
      System.out.println(result.getPayRateId());
      System.out.println(result.getPayRate());
      System.out.println(result.getPayHours());
      System.out.println(result.getPayUnits());
      System.out.println(result.getPayAmount());
      System.out.println(result.getLineDate());
      System.out.println(result.getMemoed());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getCompanyPayComponent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayComponentResource> response = client
              .payroll
              .getCompanyPayComponent(companyId, paycomponentId)
              .asof(asof)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getCompanyPayComponent");
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
| **companyId** | **String**| The id assigned to the company that is being requested for. | |
| **paycomponentId** | **String**| The unique identifier used to identify a pay component. | |
| **asof** | **String**| Returns PayComponent as of the date used in the request. | [optional] |

### Return type

[**PayComponentResource**](PayComponentResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.payroll.paycomponent.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getCompanyPayComponents"></a>
# **getCompanyPayComponents**
> PayComponentResource getCompanyPayComponents(companyId).effectonpay(effectonpay).asof(asof).classificationtype(classificationtype).name(name).execute();

Company Pay Components

Array of pay components that are configured for a company. Pay components are earnings and deductions which are used for payroll.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // The id assigned to the company that is being requested for.
    String effectonpay = "effectonpay_example"; // The type of effect on pay that you are requested for.
    String asof = "2020-01-04T00:00:00Z"; // Returns all PayComponent's as of the date used in the request.
    String classificationtype = "classificationtype_example"; // The category that this component falls into. (such as  EARNINGS  or   SICK_PAY )
    String name = "name_example"; // The name of a pay component that a company has.
    try {
      PayComponentResource result = client
              .payroll
              .getCompanyPayComponents(companyId)
              .effectonpay(effectonpay)
              .asof(asof)
              .classificationtype(classificationtype)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getComponentId());
      System.out.println(result.getCheckComponentId());
      System.out.println(result.getCode());
      System.out.println(result.getName());
      System.out.println(result.getClassificationType());
      System.out.println(result.getEffectOnPay());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getAppliesToWorkerTypes());
      System.out.println(result.getJobId());
      System.out.println(result.getLaborAssignmentId());
      System.out.println(result.getPayRateId());
      System.out.println(result.getPayRate());
      System.out.println(result.getPayHours());
      System.out.println(result.getPayUnits());
      System.out.println(result.getPayAmount());
      System.out.println(result.getLineDate());
      System.out.println(result.getMemoed());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getCompanyPayComponents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayComponentResource> response = client
              .payroll
              .getCompanyPayComponents(companyId)
              .effectonpay(effectonpay)
              .asof(asof)
              .classificationtype(classificationtype)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getCompanyPayComponents");
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
| **companyId** | **String**| The id assigned to the company that is being requested for. | |
| **effectonpay** | **String**| The type of effect on pay that you are requested for. | [optional] |
| **asof** | **String**| Returns all PayComponent&#39;s as of the date used in the request. | [optional] |
| **classificationtype** | **String**| The category that this component falls into. (such as  EARNINGS  or   SICK_PAY ) | [optional] |
| **name** | **String**| The name of a pay component that a company has. | [optional] |

### Return type

[**PayComponentResource**](PayComponentResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.payroll.paycomponents.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getCompanyPayPeriods"></a>
# **getCompanyPayPeriods**
> PayPeriodResource getCompanyPayPeriods(companyId).status(status).from(from).to(to).execute();

Company Pay Periods

Array of pay periods associated with the company.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // The id assigned to the company that is being requested for.
    List<String> status = Arrays.asList(); // Get PayPeriods that are in List of specific status.
    String from = "from_example"; // The beginning of the search date range using the Payperiod start date.
    String to = "to_example"; // The ending of the search date range using the Payperiod end date.
    try {
      PayPeriodResource result = client
              .payroll
              .getCompanyPayPeriods(companyId)
              .status(status)
              .from(from)
              .to(to)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getPayPeriodId());
      System.out.println(result.getIntervalCode());
      System.out.println(result.getStatus());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getSubmitByDate());
      System.out.println(result.getCheckDate());
      System.out.println(result.getCheckCount());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getCompanyPayPeriods");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayPeriodResource> response = client
              .payroll
              .getCompanyPayPeriods(companyId)
              .status(status)
              .from(from)
              .to(to)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getCompanyPayPeriods");
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
| **companyId** | **String**| The id assigned to the company that is being requested for. | |
| **status** | [**List&lt;String&gt;**](String.md)| Get PayPeriods that are in List of specific status. | [optional] |
| **from** | **String**| The beginning of the search date range using the Payperiod start date. | [optional] |
| **to** | **String**| The ending of the search date range using the Payperiod end date. | [optional] |

### Return type

[**PayPeriodResource**](PayPeriodResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.payroll.periods.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getPayPeriod"></a>
# **getPayPeriod**
> PayPeriodResource getPayPeriod(companyId, payperiodId).execute();

Company Pay Period

A single pay period.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // The id assigned to the company that is being requested for.
    String payperiodId = "payperiodId_example"; // The id assigned to the PayPeriod you are looking for.
    try {
      PayPeriodResource result = client
              .payroll
              .getPayPeriod(companyId, payperiodId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getPayPeriodId());
      System.out.println(result.getIntervalCode());
      System.out.println(result.getStatus());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getSubmitByDate());
      System.out.println(result.getCheckDate());
      System.out.println(result.getCheckCount());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getPayPeriod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayPeriodResource> response = client
              .payroll
              .getPayPeriod(companyId, payperiodId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getPayPeriod");
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
| **companyId** | **String**| The id assigned to the company that is being requested for. | |
| **payperiodId** | **String**| The id assigned to the PayPeriod you are looking for. | |

### Return type

[**PayPeriodResource**](PayPeriodResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.payroll.period.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pay Period successfully returned for given payPeriodId. |  -  |

<a name="getWorkerCheck"></a>
# **getWorkerCheck**
> CheckResource1 getWorkerCheck(workerId, paycheckId).execute();

Worker Check

Retrieve a specific unprocessed or processed check that a worker has.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String paycheckId = "paycheckId_example"; // The id of a single check that a workers has.
    try {
      CheckResource1 result = client
              .payroll
              .getWorkerCheck(workerId, paycheckId)
              .execute();
      System.out.println(result);
      System.out.println(result.getWorkerId());
      System.out.println(result.getPaycheckId());
      System.out.println(result.getPayPeriodId());
      System.out.println(result.getCheckCorrelationId());
      System.out.println(result.getBlockAutoDistribution());
      System.out.println(result.getEarnings());
      System.out.println(result.getDeductions());
      System.out.println(result.getInformational());
      System.out.println(result.getTaxes());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getWorkerCheck");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CheckResource1> response = client
              .payroll
              .getWorkerCheck(workerId, paycheckId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getWorkerCheck");
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
| **paycheckId** | **String**| The id of a single check that a workers has. | |

### Return type

[**CheckResource1**](CheckResource1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.payroll.processedcheck.v1+json, application/vnd.paychex.payroll.check.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getWorkerChecksByPayPeriod"></a>
# **getWorkerChecksByPayPeriod**
> CheckResource1 getWorkerChecksByPayPeriod(workerId, payperiodid).filterbyuserid(filterbyuserid).execute();

Worker Checks

Get check(s) that are for a specific worker   within a processed or unprocessed pay period.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String payperiodid = "payperiodid_example"; // The id assigned to the pay period that the  check will be within.
    Boolean filterbyuserid = true; // Filter by User Id.
    try {
      CheckResource1 result = client
              .payroll
              .getWorkerChecksByPayPeriod(workerId, payperiodid)
              .filterbyuserid(filterbyuserid)
              .execute();
      System.out.println(result);
      System.out.println(result.getWorkerId());
      System.out.println(result.getPaycheckId());
      System.out.println(result.getPayPeriodId());
      System.out.println(result.getCheckCorrelationId());
      System.out.println(result.getBlockAutoDistribution());
      System.out.println(result.getEarnings());
      System.out.println(result.getDeductions());
      System.out.println(result.getInformational());
      System.out.println(result.getTaxes());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getWorkerChecksByPayPeriod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CheckResource1> response = client
              .payroll
              .getWorkerChecksByPayPeriod(workerId, payperiodid)
              .filterbyuserid(filterbyuserid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getWorkerChecksByPayPeriod");
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
| **payperiodid** | **String**| The id assigned to the pay period that the  check will be within. | |
| **filterbyuserid** | **Boolean**| Filter by User Id. | [optional] |

### Return type

[**CheckResource1**](CheckResource1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.payroll.processedchecks.v1+json, application/vnd.paychex.payroll.checks.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="removePayComponent"></a>
# **removePayComponent**
> removePayComponent(checkId, checkComponentId).execute();

Pay Component of a check

Remove a single pay component on an individual unprocessed check.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String checkId = "checkId_example"; // ID associated with desired check.
    String checkComponentId = "checkComponentId_example"; // ID associated with an Earning of this check
    try {
      client
              .payroll
              .removePayComponent(checkId, checkComponentId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#removePayComponent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payroll
              .removePayComponent(checkId, checkComponentId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#removePayComponent");
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
| **checkId** | **String**| ID associated with desired check. | |
| **checkComponentId** | **String**| ID associated with an Earning of this check | |

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

<a name="removeWorkerCheck"></a>
# **removeWorkerCheck**
> CheckResource1 removeWorkerCheck(workerId, paycheckId).execute();

Worker Check

Remove a specific unprocessed check that a worker has.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String workerId = "workerId_example"; // ID associated with desired worker.
    String paycheckId = "paycheckId_example"; // The id of a single check that a workers has.
    try {
      CheckResource1 result = client
              .payroll
              .removeWorkerCheck(workerId, paycheckId)
              .execute();
      System.out.println(result);
      System.out.println(result.getWorkerId());
      System.out.println(result.getPaycheckId());
      System.out.println(result.getPayPeriodId());
      System.out.println(result.getCheckCorrelationId());
      System.out.println(result.getBlockAutoDistribution());
      System.out.println(result.getEarnings());
      System.out.println(result.getDeductions());
      System.out.println(result.getInformational());
      System.out.println(result.getTaxes());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#removeWorkerCheck");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CheckResource1> response = client
              .payroll
              .removeWorkerCheck(workerId, paycheckId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#removeWorkerCheck");
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
| **paycheckId** | **String**| The id of a single check that a workers has. | |

### Return type

[**CheckResource1**](CheckResource1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.paychex.payroll.check.v1+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="updatePayComponent"></a>
# **updatePayComponent**
> PayComponentResource2 updatePayComponent(checkId, checkComponentId, payComponentResource2).execute();

Pay Component of a Check

 Update a single pay component on an individual unprocessed check.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String checkId = "checkId_example"; // ID associated with desired check.
    String checkComponentId = "checkComponentId_example"; // ID associated with an Earning of this check
    String description = "description_example"; // Description
    String componentId = "componentId_example"; // The identifier of the pay component to add to the check. An overtime pay component can't be placed on a worker that is OT exempt.
    String checkComponentId = "checkComponentId_example"; // The unique identifier associated for the pay component on this check.
    String name = "name_example"; // The name given to the pay component
    String classificationType = "classificationType_example"; // The category that this component falls into.
    String effectOnPay = "ADDITION"; // The effect that the pay component will have on the check amount.
    OffsetDateTime startDate = OffsetDateTime.now(); // The date that the pay component is able to be applied on a check.
    OffsetDateTime endDate = OffsetDateTime.now(); // The date that the pay component is not available to be applied on a check moving forward.
    List<String> appliesToWorkerTypes = Arrays.asList(); // Applies To WorkerTypes.
    String jobId = "jobId_example"; // This is used optionally for overriding a job when it needs to be different then the workers default. This option is only available when the client has job costing.
    String laborAssignmentId = "laborAssignmentId_example"; // This is used optionally for overriding a labor assignment when it needs to be different then the workers assignment distribution. This option is only available when the client has labor assignment.
    String payRateId = "payRateId_example"; // The rate identifier for the workers compensation
    String payRate = "payRate_example"; // The rate amount that will be applied for this component. Used in conjunction with Hours or Units.
    String payHours = "payHours_example"; // The number of hours that will be applied for this component. Used in conjunction with rate.
    String payUnits = "payUnits_example"; // The number of units that will be applied for this component. Used in conjunction with rate.
    String payAmount = "payAmount_example"; // The flat amount to be applied for this component. Not used with Rate, Hours, or Units.
    Boolean memoed = true; // This is used optionally for memoing the payHours or payUnits so that they are informational when using a payAmount.
    OffsetDateTime lineDate = OffsetDateTime.now(); // This is used optionally for specifying a date that the pay component was generated on.
    try {
      PayComponentResource2 result = client
              .payroll
              .updatePayComponent(checkId, checkComponentId)
              .description(description)
              .componentId(componentId)
              .checkComponentId(checkComponentId)
              .name(name)
              .classificationType(classificationType)
              .effectOnPay(effectOnPay)
              .startDate(startDate)
              .endDate(endDate)
              .appliesToWorkerTypes(appliesToWorkerTypes)
              .jobId(jobId)
              .laborAssignmentId(laborAssignmentId)
              .payRateId(payRateId)
              .payRate(payRate)
              .payHours(payHours)
              .payUnits(payUnits)
              .payAmount(payAmount)
              .memoed(memoed)
              .lineDate(lineDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getComponentId());
      System.out.println(result.getCheckComponentId());
      System.out.println(result.getName());
      System.out.println(result.getClassificationType());
      System.out.println(result.getEffectOnPay());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getAppliesToWorkerTypes());
      System.out.println(result.getJobId());
      System.out.println(result.getLaborAssignmentId());
      System.out.println(result.getPayRateId());
      System.out.println(result.getPayRate());
      System.out.println(result.getPayHours());
      System.out.println(result.getPayUnits());
      System.out.println(result.getPayAmount());
      System.out.println(result.getMemoed());
      System.out.println(result.getLineDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#updatePayComponent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayComponentResource2> response = client
              .payroll
              .updatePayComponent(checkId, checkComponentId)
              .description(description)
              .componentId(componentId)
              .checkComponentId(checkComponentId)
              .name(name)
              .classificationType(classificationType)
              .effectOnPay(effectOnPay)
              .startDate(startDate)
              .endDate(endDate)
              .appliesToWorkerTypes(appliesToWorkerTypes)
              .jobId(jobId)
              .laborAssignmentId(laborAssignmentId)
              .payRateId(payRateId)
              .payRate(payRate)
              .payHours(payHours)
              .payUnits(payUnits)
              .payAmount(payAmount)
              .memoed(memoed)
              .lineDate(lineDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#updatePayComponent");
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
| **checkId** | **String**| ID associated with desired check. | |
| **checkComponentId** | **String**| ID associated with an Earning of this check | |
| **payComponentResource2** | [**PayComponentResource2**](PayComponentResource2.md)|  | |

### Return type

[**PayComponentResource2**](PayComponentResource2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/vnd.paychex.payroll.check.checkcomponent.v1+json
 - **Accept**: application/json, application/vnd.paychex.payroll.check.checkcomponent.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

