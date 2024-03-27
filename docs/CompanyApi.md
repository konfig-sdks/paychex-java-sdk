# CompanyApi

All URIs are relative to *https://api.paychex.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addInProgressWorkers**](CompanyApi.md#addInProgressWorkers) | **POST** /companies/{companyId}/workers | In Progress Workers |
| [**addJob**](CompanyApi.md#addJob) | **POST** /companies/{companyId}/jobs | Company Job |
| [**createCustomFieldAtCompanyLevel**](CompanyApi.md#createCustomFieldAtCompanyLevel) | **POST** /companies/{companyId}/customfields | Custom Field |
| [**createCustomFieldCategory**](CompanyApi.md#createCustomFieldCategory) | **POST** /companies/{companyId}/customfieldscategories | Custom Fields Category |
| [**deleteCustomField**](CompanyApi.md#deleteCustomField) | **DELETE** /companies/{companyId}/customfields/{customfieldid} | Custom Field |
| [**deleteCustomFieldsCategory**](CompanyApi.md#deleteCustomFieldsCategory) | **DELETE** /companies/{companyId}/customfieldscategories/{categoryid} | Custom Fields Category |
| [**getCalculationBases**](CompanyApi.md#getCalculationBases) | **GET** /companies/{companyId}/calculationbases | Company Calculation Bases |
| [**getContactTypes**](CompanyApi.md#getContactTypes) | **GET** /companies/{companyId}/contacttypes | Company Contact Types |
| [**getCustomField**](CompanyApi.md#getCustomField) | **GET** /companies/{companyId}/customfields/{customFieldId} | Custom Field |
| [**getCustomFieldCategories**](CompanyApi.md#getCustomFieldCategories) | **GET** /companies/{companyId}/customfieldscategories | Custom Fields Categories |
| [**getCustomFields**](CompanyApi.md#getCustomFields) | **GET** /companies/{companyId}/customfields | Custom Fields |
| [**getCustomFieldsCategory**](CompanyApi.md#getCustomFieldsCategory) | **GET** /companies/{companyId}/customfieldscategories/{categoryId} | Custom Fields Category |
| [**getInformation**](CompanyApi.md#getInformation) | **GET** /companies/{companyId} | A Company |
| [**getJobInformation**](CompanyApi.md#getJobInformation) | **GET** /companies/{companyId}/jobs/{jobId} | Company Job |
| [**getJobSegmentStructureSetup**](CompanyApi.md#getJobSegmentStructureSetup) | **GET** /companies/{companyId}/jobsegments | Company Job Segments |
| [**getJobTitle**](CompanyApi.md#getJobTitle) | **GET** /companies/{companyId}/jobtitles/{jobTitleId} | Job Title |
| [**getJobs**](CompanyApi.md#getJobs) | **GET** /companies/{companyId}/jobs | Company Jobs |
| [**getLaborAssignment**](CompanyApi.md#getLaborAssignment) | **GET** /companies/{companyId}/laborassignments/{laborAssignmentId} | Company Labour Assignment |
| [**getLocation**](CompanyApi.md#getLocation) | **GET** /companies/{companyId}/locations/{locationId} | Company Location |
| [**getLocations**](CompanyApi.md#getLocations) | **GET** /companies/{companyId}/locations | Company Locations |
| [**getOrganization**](CompanyApi.md#getOrganization) | **GET** /companies/{companyId}/organizations/{orgId} | Company Organization |
| [**getOrganizations**](CompanyApi.md#getOrganizations) | **GET** /companies/{companyId}/organizations | Company Organizations |
| [**getPayFrequencies**](CompanyApi.md#getPayFrequencies) | **GET** /companies/{companyId}/payfrequencies | Company Pay Frequencies |
| [**getStatus**](CompanyApi.md#getStatus) | **GET** /companies/{companyId}/workerstatuses/{statusId} | Company Worker Status |
| [**getWorkers**](CompanyApi.md#getWorkers) | **GET** /companies/{companyId}/workers | Company Workers |
| [**list**](CompanyApi.md#list) | **GET** /companies | Companies |
| [**listJobTitles**](CompanyApi.md#listJobTitles) | **GET** /companies/{companyId}/jobtitles | Company Job Titles |
| [**listLaborAssignments**](CompanyApi.md#listLaborAssignments) | **GET** /companies/{companyId}/laborassignments | Company Labour Assignments |
| [**listWorkerStatuses**](CompanyApi.md#listWorkerStatuses) | **GET** /companies/{companyId}/workerstatuses | Company Worker Statuses |
| [**updateCustomField**](CompanyApi.md#updateCustomField) | **PATCH** /companies/{companyId}/customfields/{customfieldid} | Custom Field |
| [**updateCustomFieldsCategory**](CompanyApi.md#updateCustomFieldsCategory) | **PATCH** /companies/{companyId}/customfieldscategories/{categoryid} | Custom Fields Category |
| [**updateJob**](CompanyApi.md#updateJob) | **PATCH** /companies/{companyId}/jobs/{jobId} | Company Job |


<a name="addInProgressWorkers"></a>
# **addInProgressWorkers**
> WorkerResource addInProgressWorkers(companyId, workerResource).execute();

In Progress Workers

Add one or more workers to a specific company that your application has been granted access to. These workers will be added with an IN_PROGRESS status assigned to them.  In_Progress workers will pre-populated within Paychex Flex and will require someone to complete them to be fully available with the Flex platform.  Paychex Flex UI will hold a majority of validation, rules, and enforced required fields based on the clients configuration.  Required fields are givenName, familyName, &amp; workerType (when adding multiple workers at a time you will need to also include a \&quot;workerCorrelationId\&quot; data element on each worker, that will be used as an identifier in our responses). Optionally you can include a workers communications object within the worker.  Once generated the IN_PROGRESS worker can have their communications, Compensation and Federal Taxes POSTed and PATCHed using the generated workerId.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // The id assigned to the company that workers are being requested for.
    String workerId = "workerId_example"; // The unique identifier associated with this worker representation.
    String employeeId = "employeeId_example"; // The workers employee identification information.
    String workerType = "EMPLOYEE"; // The type of worker. This data field cannot be PATCHED.
    String employmentType = "FULL_TIME"; // The type of employment for the worker.
    String exemptionType = "EXEMPT"; // The Overtime classification of the worker.This data field cannot be PATCHED for ACTIVE workers.
    OffsetDateTime birthDate = OffsetDateTime.now(); // The workers date of birth. It cannot be greater than today's date.
    String sex = "MALE";
    String ethnicityCode = "(blank)"; // Disclaimer:This parameter is not visible in Flex for the client. This data field cannot be PATCHED for ACTIVE workers.
    OffsetDateTime hireDate = OffsetDateTime.now(); // The date which the worker was hired. It cannot be PATCHED for ACTIVE workers.
    String clockId = "clockId_example"; // The clock ID of the worker that can be an identification for other systems.
    NameResource name = new NameResource();
    LegalIdResource legalId = new LegalIdResource();
    String laborAssignmentId = "laborAssignmentId_example"; // The workers home labor assignment. This data field cannot be POSTED or PATCHED
    String jobId = "jobId_example"; // The workers home job. This data field cannot be POSTED or PATCHED.
    String locationId = "locationId_example"; // The workers location. This data field cannot be POSTED or PATCHED.
    JobTitleResource job = new JobTitleResource();
    OrganizationResource organization = new OrganizationResource();
    SupervisorResource supervisor = new SupervisorResource();
    Status currentStatus = new Status();
    List<CommunicationResource> communications = Arrays.asList(); // Worker Communications. This data field cannot be updated for worker endpoint.
    String workerCorrelationId = "workerCorrelationId_example"; // Id that you define which is used for error handling/responses.This data field is used while POSTING multiple IN_PROGRESS workers
    try {
      WorkerResource result = client
              .company
              .addInProgressWorkers(companyId)
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
              .jobId(jobId)
              .locationId(locationId)
              .job(job)
              .organization(organization)
              .supervisor(supervisor)
              .currentStatus(currentStatus)
              .communications(communications)
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
      System.out.println(result.getJobId());
      System.out.println(result.getLocationId());
      System.out.println(result.getJob());
      System.out.println(result.getOrganization());
      System.out.println(result.getSupervisor());
      System.out.println(result.getCurrentStatus());
      System.out.println(result.getCommunications());
      System.out.println(result.getWorkerCorrelationId());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#addInProgressWorkers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkerResource> response = client
              .company
              .addInProgressWorkers(companyId)
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
              .jobId(jobId)
              .locationId(locationId)
              .job(job)
              .organization(organization)
              .supervisor(supervisor)
              .currentStatus(currentStatus)
              .communications(communications)
              .workerCorrelationId(workerCorrelationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#addInProgressWorkers");
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
| **companyId** | **String**| The id assigned to the company that workers are being requested for. | |
| **workerResource** | [**WorkerResource**](WorkerResource.md)|  | |

### Return type

[**WorkerResource**](WorkerResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.paychex.workers.v1+json
 - **Accept**: application/json, application/vnd.paychex.workers.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |

<a name="addJob"></a>
# **addJob**
> JobResource addJob(companyId, jobResource).execute();

Company Job

Add a company level job. If a client has their job numbering structured in 2-3 separate &#39;segments&#39;, you may need to first do a GET on the jobsegements endpoint, so you can see how many segments and the character length of each segment, as well as the name of those segments, which you will need to have before you POST.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // The ID of the company.
    String jobId = "jobId_example"; // The unique identifier associated with this job.
    String jobCorrelationId = "jobCorrelationId_example"; // Id that you define which is used for error handling/responses.
    String jobName = "jobName_example"; // The name of the job.
    OffsetDateTime startDate = OffsetDateTime.now(); // The start date associated with this job.
    OffsetDateTime endDate = OffsetDateTime.now(); // The end date associated with this job.
    List<Link> links = Arrays.asList();
    JobSegmentsResource jobNumber = new JobSegmentsResource();
    try {
      JobResource result = client
              .company
              .addJob(companyId)
              .jobId(jobId)
              .jobCorrelationId(jobCorrelationId)
              .jobName(jobName)
              .startDate(startDate)
              .endDate(endDate)
              .links(links)
              .jobNumber(jobNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getJobId());
      System.out.println(result.getJobCorrelationId());
      System.out.println(result.getJobName());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getLinks());
      System.out.println(result.getJobNumber());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#addJob");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobResource> response = client
              .company
              .addJob(companyId)
              .jobId(jobId)
              .jobCorrelationId(jobCorrelationId)
              .jobName(jobName)
              .startDate(startDate)
              .endDate(endDate)
              .links(links)
              .jobNumber(jobNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#addJob");
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
| **companyId** | **String**| The ID of the company. | |
| **jobResource** | [**JobResource**](JobResource.md)|  | |

### Return type

[**JobResource**](JobResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.paychex.company.jobs.v1+json
 - **Accept**: application/json, application/vnd.paychex.company.jobs.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |

<a name="createCustomFieldAtCompanyLevel"></a>
# **createCustomFieldAtCompanyLevel**
> CustomFieldsResource createCustomFieldAtCompanyLevel(companyId, customFieldsResource).execute();

Custom Field

Create CustomFields at the company level which a company could be assigned.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // ID associated with desired company.
    String customFieldId = "customFieldId_example"; // The unique identifier that is autogenerated when a custom field is created
    String customFieldName = "customFieldName_example"; // The name of the custom field
    String categoryId = "categoryId_example"; // The unique identifier that is autogenerated when creating a category
    Boolean required = true; // Where to indicate if the custom field is required on the worker where true = required and false = not required
    Boolean checkStub = true; // Where to indicate if the custom field is required on the worker's pay stub, where true = required and false = not required
    Boolean employeeEditable = true; // Where to indicate if the custom field is able to be edited by the employee, where true = required and false = not required
    String type = "DROPDOWN"; // The type of field the custom field is.
    Boolean booleanValue = true; // The value for BOOLEAN type (true / false)
    List<Link> links = Arrays.asList();
    OffsetDateTime dateValue = OffsetDateTime.now(); // The value for DATE type , example : 2012-02-01T05:00:00Z
    String textValue = "textValue_example"; // The value for TEXT type (any text, alphanumeric, special characters allowed)
    Double maxTextLength = 3.4D; // The maximum allowed value for textValue
    Double numericValue = 3.4D; // Numeric data type can have three formats namely - whole number, second decimal place and fourth decimal place, example: 12 , 12.34 or 12.3456
    List<CustomFieldsDropdownResource> dropdown = Arrays.asList();
    try {
      CustomFieldsResource result = client
              .company
              .createCustomFieldAtCompanyLevel(companyId)
              .customFieldId(customFieldId)
              .customFieldName(customFieldName)
              .categoryId(categoryId)
              .required(required)
              .checkStub(checkStub)
              .employeeEditable(employeeEditable)
              .type(type)
              .booleanValue(booleanValue)
              .links(links)
              .dateValue(dateValue)
              .textValue(textValue)
              .maxTextLength(maxTextLength)
              .numericValue(numericValue)
              .dropdown(dropdown)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomFieldId());
      System.out.println(result.getCustomFieldName());
      System.out.println(result.getCategoryId());
      System.out.println(result.getRequired());
      System.out.println(result.getCheckStub());
      System.out.println(result.getEmployeeEditable());
      System.out.println(result.getType());
      System.out.println(result.getBooleanValue());
      System.out.println(result.getLinks());
      System.out.println(result.getDateValue());
      System.out.println(result.getTextValue());
      System.out.println(result.getMaxTextLength());
      System.out.println(result.getNumericValue());
      System.out.println(result.getDropdown());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#createCustomFieldAtCompanyLevel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomFieldsResource> response = client
              .company
              .createCustomFieldAtCompanyLevel(companyId)
              .customFieldId(customFieldId)
              .customFieldName(customFieldName)
              .categoryId(categoryId)
              .required(required)
              .checkStub(checkStub)
              .employeeEditable(employeeEditable)
              .type(type)
              .booleanValue(booleanValue)
              .links(links)
              .dateValue(dateValue)
              .textValue(textValue)
              .maxTextLength(maxTextLength)
              .numericValue(numericValue)
              .dropdown(dropdown)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#createCustomFieldAtCompanyLevel");
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
| **customFieldsResource** | [**CustomFieldsResource**](CustomFieldsResource.md)|  | |

### Return type

[**CustomFieldsResource**](CustomFieldsResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/vnd.paychex.company.customfields.v1+json
 - **Accept**: application/json, application/vnd.paychex.company.customfields.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |

<a name="createCustomFieldCategory"></a>
# **createCustomFieldCategory**
> CustomFieldsCategoryResource createCustomFieldCategory(companyId, customFieldsCategoryResource).execute();

Custom Fields Category

Create CustomFieldsCategory at the company level which a company could be assigned.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // ID associated with desired company.
    String categoryId = "categoryId_example"; // The unique identifier that is autogenerated when creating a category
    String categoryName = "categoryName_example"; // The name of the Category
    List<Link> links = Arrays.asList();
    try {
      CustomFieldsCategoryResource result = client
              .company
              .createCustomFieldCategory(companyId)
              .categoryId(categoryId)
              .categoryName(categoryName)
              .links(links)
              .execute();
      System.out.println(result);
      System.out.println(result.getCategoryId());
      System.out.println(result.getCategoryName());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#createCustomFieldCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomFieldsCategoryResource> response = client
              .company
              .createCustomFieldCategory(companyId)
              .categoryId(categoryId)
              .categoryName(categoryName)
              .links(links)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#createCustomFieldCategory");
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
| **customFieldsCategoryResource** | [**CustomFieldsCategoryResource**](CustomFieldsCategoryResource.md)|  | |

### Return type

[**CustomFieldsCategoryResource**](CustomFieldsCategoryResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/vnd.paychex.company.customfieldscategories.v1+json
 - **Accept**: application/json, application/vnd.paychex.company.customfieldscategories.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |

<a name="deleteCustomField"></a>
# **deleteCustomField**
> deleteCustomField(companyId, customfieldid).execute();

Custom Field

Delete CustomField at the company level.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // ID associated with desired company.
    String customfieldid = "customfieldid_example"; // ID associated with desired custom field.
    try {
      client
              .company
              .deleteCustomField(companyId, customfieldid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#deleteCustomField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .company
              .deleteCustomField(companyId, customfieldid)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#deleteCustomField");
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
| **customfieldid** | **String**| ID associated with desired custom field. | |

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

<a name="deleteCustomFieldsCategory"></a>
# **deleteCustomFieldsCategory**
> deleteCustomFieldsCategory(companyId, categoryid).execute();

Custom Fields Category

Delete CustomFieldsCategory at the company level.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // ID associated with desired company.
    String categoryid = "categoryid_example"; // ID associated with desired category.
    try {
      client
              .company
              .deleteCustomFieldsCategory(companyId, categoryid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#deleteCustomFieldsCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .company
              .deleteCustomFieldsCategory(companyId, categoryid)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#deleteCustomFieldsCategory");
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
| **categoryid** | **String**| ID associated with desired category. | |

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

<a name="getCalculationBases"></a>
# **getCalculationBases**
> CalculationBase getCalculationBases(companyId).execute();

Company Calculation Bases

Array of calculation bases that are used with a worker pay components that are not FLAT_DOLLAR_AMOUNT allow you to determine what to apply the calculation against when determining the amount during the pay run.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // The ID of the company.
    try {
      CalculationBase result = client
              .company
              .getCalculationBases(companyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCalculationBaseId());
      System.out.println(result.getCalculationBaseName());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getCalculationBases");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CalculationBase> response = client
              .company
              .getCalculationBases(companyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getCalculationBases");
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
| **companyId** | **String**| The ID of the company. | |

### Return type

[**CalculationBase**](CalculationBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.payroll.calculationbases.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getContactTypes"></a>
# **getContactTypes**
> ContactTypeResource getContactTypes(companyId).execute();

Company Contact Types

Information about contact types that your application has been granted access to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // ID associated with desired company.
    try {
      ContactTypeResource result = client
              .company
              .getContactTypes(companyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getContactTypeId());
      System.out.println(result.getContactTypeName());
      System.out.println(result.getRelationshipTypes());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getContactTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContactTypeResource> response = client
              .company
              .getContactTypes(companyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getContactTypes");
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

### Return type

[**ContactTypeResource**](ContactTypeResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.company.contacttypes.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="getCustomField"></a>
# **getCustomField**
> CustomFieldsResource getCustomField(companyId, customFieldId).execute();

Custom Field

Information about a single CustomField.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // ID associated with desired company.
    String customFieldId = "customFieldId_example"; // ID associated with desired custom field.
    try {
      CustomFieldsResource result = client
              .company
              .getCustomField(companyId, customFieldId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomFieldId());
      System.out.println(result.getCustomFieldName());
      System.out.println(result.getCategoryId());
      System.out.println(result.getRequired());
      System.out.println(result.getCheckStub());
      System.out.println(result.getEmployeeEditable());
      System.out.println(result.getType());
      System.out.println(result.getBooleanValue());
      System.out.println(result.getLinks());
      System.out.println(result.getDateValue());
      System.out.println(result.getTextValue());
      System.out.println(result.getMaxTextLength());
      System.out.println(result.getNumericValue());
      System.out.println(result.getDropdown());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getCustomField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomFieldsResource> response = client
              .company
              .getCustomField(companyId, customFieldId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getCustomField");
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
| **customFieldId** | **String**| ID associated with desired custom field. | |

### Return type

[**CustomFieldsResource**](CustomFieldsResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.company.customfield.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getCustomFieldCategories"></a>
# **getCustomFieldCategories**
> CustomFieldsCategoryResource getCustomFieldCategories(companyId).execute();

Custom Fields Categories

Array of CustomFieldsCategories Configured at the company level 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // ID associated with desired company.
    try {
      CustomFieldsCategoryResource result = client
              .company
              .getCustomFieldCategories(companyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCategoryId());
      System.out.println(result.getCategoryName());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getCustomFieldCategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomFieldsCategoryResource> response = client
              .company
              .getCustomFieldCategories(companyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getCustomFieldCategories");
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

### Return type

[**CustomFieldsCategoryResource**](CustomFieldsCategoryResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.company.customfieldscategories.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getCustomFields"></a>
# **getCustomFields**
> CustomFieldsResource getCustomFields(companyId).execute();

Custom Fields

Array of customFields Configured at the company level 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // ID associated with desired company.
    try {
      CustomFieldsResource result = client
              .company
              .getCustomFields(companyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomFieldId());
      System.out.println(result.getCustomFieldName());
      System.out.println(result.getCategoryId());
      System.out.println(result.getRequired());
      System.out.println(result.getCheckStub());
      System.out.println(result.getEmployeeEditable());
      System.out.println(result.getType());
      System.out.println(result.getBooleanValue());
      System.out.println(result.getLinks());
      System.out.println(result.getDateValue());
      System.out.println(result.getTextValue());
      System.out.println(result.getMaxTextLength());
      System.out.println(result.getNumericValue());
      System.out.println(result.getDropdown());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getCustomFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomFieldsResource> response = client
              .company
              .getCustomFields(companyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getCustomFields");
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

### Return type

[**CustomFieldsResource**](CustomFieldsResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.company.customfields.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getCustomFieldsCategory"></a>
# **getCustomFieldsCategory**
> CustomFieldsCategoryResource getCustomFieldsCategory(companyId, categoryId).execute();

Custom Fields Category

Information about a single CustomFieldsCategory.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // ID associated with desired company.
    String categoryId = "categoryId_example"; // ID associated with desired category.
    try {
      CustomFieldsCategoryResource result = client
              .company
              .getCustomFieldsCategory(companyId, categoryId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCategoryId());
      System.out.println(result.getCategoryName());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getCustomFieldsCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomFieldsCategoryResource> response = client
              .company
              .getCustomFieldsCategory(companyId, categoryId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getCustomFieldsCategory");
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
| **categoryId** | **String**| ID associated with desired category. | |

### Return type

[**CustomFieldsCategoryResource**](CustomFieldsCategoryResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.company.customfieldscategory.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getInformation"></a>
# **getInformation**
> CompanyResource getInformation(companyId).execute();

A Company

Information about a single company that your application has access to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // The ID of the company.
    try {
      CompanyResource result = client
              .company
              .getInformation(companyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCompanyId());
      System.out.println(result.getDisplayId());
      System.out.println(result.getLegalName());
      System.out.println(result.getLegalId());
      System.out.println(result.getCommunications());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompanyResource> response = client
              .company
              .getInformation(companyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getInformation");
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
| **companyId** | **String**| The ID of the company. | |

### Return type

[**CompanyResource**](CompanyResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.company.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **409** | default response |  -  |

<a name="getJobInformation"></a>
# **getJobInformation**
> JobResource getJobInformation(companyId, jobId).asof(asof).execute();

Company Job

Information about a single Job.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // The ID of the company.
    String jobId = "jobId_example"; // The ID of the job.
    String asof = "2020-01-04T00:00:00Z"; // Returns job as of the date used in the request.
    try {
      JobResource result = client
              .company
              .getJobInformation(companyId, jobId)
              .asof(asof)
              .execute();
      System.out.println(result);
      System.out.println(result.getJobId());
      System.out.println(result.getJobCorrelationId());
      System.out.println(result.getJobName());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getLinks());
      System.out.println(result.getJobNumber());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getJobInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobResource> response = client
              .company
              .getJobInformation(companyId, jobId)
              .asof(asof)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getJobInformation");
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
| **companyId** | **String**| The ID of the company. | |
| **jobId** | **String**| The ID of the job. | |
| **asof** | **String**| Returns job as of the date used in the request. | [optional] |

### Return type

[**JobResource**](JobResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.company.job.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getJobSegmentStructureSetup"></a>
# **getJobSegmentStructureSetup**
> JobSegmentsConfigResource getJobSegmentStructureSetup(companyId).execute();

Company Job Segments

Retrieve job segment structure setup for this client. This endpoint is only available if the client has their job numbering set up in &#39;2-3 separate &#39;segments&#39;.  The response will give you back the exact character lengths and the segment names so you are able to POST.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // The ID of the company.
    try {
      JobSegmentsConfigResource result = client
              .company
              .getJobSegmentStructureSetup(companyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSegmentNumber());
      System.out.println(result.getName());
      System.out.println(result.getSegmentLength());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getJobSegmentStructureSetup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobSegmentsConfigResource> response = client
              .company
              .getJobSegmentStructureSetup(companyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getJobSegmentStructureSetup");
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
| **companyId** | **String**| The ID of the company. | |

### Return type

[**JobSegmentsConfigResource**](JobSegmentsConfigResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.company.jobsegments.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getJobTitle"></a>
# **getJobTitle**
> JobTitleResource getJobTitle(companyId, workerJobTitleId).execute();

Job Title

Information about a single Job Title.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // The ID of the company.
    String workerJobTitleId = "workerJobTitleId_example"; // The ID of the worker job title.
    try {
      JobTitleResource result = client
              .company
              .getJobTitle(companyId, workerJobTitleId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getJobTitleId());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getJobTitle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobTitleResource> response = client
              .company
              .getJobTitle(companyId, workerJobTitleId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getJobTitle");
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
| **companyId** | **String**| The ID of the company. | |
| **workerJobTitleId** | **String**| The ID of the worker job title. | |

### Return type

[**JobTitleResource**](JobTitleResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.company.jobtitle.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getJobs"></a>
# **getJobs**
> JobResource getJobs(companyId).asof(asof).execute();

Company Jobs

Array of jobs set at the company level.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // The ID of the company.
    String asof = "2020-01-04T00:00:00Z"; // Returns all jobs as of the date used in the request.
    try {
      JobResource result = client
              .company
              .getJobs(companyId)
              .asof(asof)
              .execute();
      System.out.println(result);
      System.out.println(result.getJobId());
      System.out.println(result.getJobCorrelationId());
      System.out.println(result.getJobName());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getLinks());
      System.out.println(result.getJobNumber());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getJobs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobResource> response = client
              .company
              .getJobs(companyId)
              .asof(asof)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getJobs");
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
| **companyId** | **String**| The ID of the company. | |
| **asof** | **String**| Returns all jobs as of the date used in the request. | [optional] |

### Return type

[**JobResource**](JobResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.company.jobs.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getLaborAssignment"></a>
# **getLaborAssignment**
> LaborAssignmentResource getLaborAssignment(companyId, laborAssignmentId).asof(asof).execute();

Company Labour Assignment

Information about a single Labor Assignment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // The ID of the company.
    String laborAssignmentId = "laborAssignmentId_example"; // The ID of the labor assignment.
    String asof = "2020-01-04T00:00:00Z"; // Returns labour assignment as of the date used in the request.
    try {
      LaborAssignmentResource result = client
              .company
              .getLaborAssignment(companyId, laborAssignmentId)
              .asof(asof)
              .execute();
      System.out.println(result);
      System.out.println(result.getLaborAssignmentId());
      System.out.println(result.getName());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getOrganizationId());
      System.out.println(result.getPositionId());
      System.out.println(result.getLinks());
      System.out.println(result.getLocationId());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getLaborAssignment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LaborAssignmentResource> response = client
              .company
              .getLaborAssignment(companyId, laborAssignmentId)
              .asof(asof)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getLaborAssignment");
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
| **companyId** | **String**| The ID of the company. | |
| **laborAssignmentId** | **String**| The ID of the labor assignment. | |
| **asof** | **String**| Returns labour assignment as of the date used in the request. | [optional] |

### Return type

[**LaborAssignmentResource**](LaborAssignmentResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.company.laborassignment.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getLocation"></a>
# **getLocation**
> LocationResource getLocation(companyId, locationId).asof(asof).execute();

Company Location

Information about a single Location.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // ID associated with desired company.
    String locationId = "locationId_example"; // The ID of the location.
    String asof = "2020-01-04T00:00:00Z"; // Returns location as of the date used in the request.
    try {
      LocationResource result = client
              .company
              .getLocation(companyId, locationId)
              .asof(asof)
              .execute();
      System.out.println(result);
      System.out.println(result.getLocationId());
      System.out.println(result.getName());
      System.out.println(result.getAddress());
      System.out.println(result.getLinks());
      System.out.println(result.getMovedIn());
      System.out.println(result.getMovedOut());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getLocation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LocationResource> response = client
              .company
              .getLocation(companyId, locationId)
              .asof(asof)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getLocation");
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
| **locationId** | **String**| The ID of the location. | |
| **asof** | **String**| Returns location as of the date used in the request. | [optional] |

### Return type

[**LocationResource**](LocationResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.company.location.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getLocations"></a>
# **getLocations**
> LocationResource getLocations(companyId).asof(asof).execute();

Company Locations

Array of locations set at the company level.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // The ID of the company.
    String asof = "2020-01-04T00:00:00Z"; // Returns all locations as of the date used in the request.
    try {
      LocationResource result = client
              .company
              .getLocations(companyId)
              .asof(asof)
              .execute();
      System.out.println(result);
      System.out.println(result.getLocationId());
      System.out.println(result.getName());
      System.out.println(result.getAddress());
      System.out.println(result.getLinks());
      System.out.println(result.getMovedIn());
      System.out.println(result.getMovedOut());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getLocations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LocationResource> response = client
              .company
              .getLocations(companyId)
              .asof(asof)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getLocations");
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
| **companyId** | **String**| The ID of the company. | |
| **asof** | **String**| Returns all locations as of the date used in the request. | [optional] |

### Return type

[**LocationResource**](LocationResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.company.locations.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getOrganization"></a>
# **getOrganization**
> OrganizationResource getOrganization(companyId, organizationId).execute();

Company Organization

Information about a single Organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // The ID of the company.
    String organizationId = "organizationId_example"; // The ID of the organization.
    try {
      OrganizationResource result = client
              .company
              .getOrganization(companyId, organizationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOrganizationId());
      System.out.println(result.getName());
      System.out.println(result.getNumber());
      System.out.println(result.getLevel());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getOrganization");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationResource> response = client
              .company
              .getOrganization(companyId, organizationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getOrganization");
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
| **companyId** | **String**| The ID of the company. | |
| **organizationId** | **String**| The ID of the organization. | |

### Return type

[**OrganizationResource**](OrganizationResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.company.organization.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getOrganizations"></a>
# **getOrganizations**
> OrganizationResource getOrganizations(companyId).execute();

Company Organizations

Array of organizations set at the company level.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // The ID of the company.
    try {
      OrganizationResource result = client
              .company
              .getOrganizations(companyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOrganizationId());
      System.out.println(result.getName());
      System.out.println(result.getNumber());
      System.out.println(result.getLevel());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getOrganizations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationResource> response = client
              .company
              .getOrganizations(companyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getOrganizations");
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
| **companyId** | **String**| The ID of the company. | |

### Return type

[**OrganizationResource**](OrganizationResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.company.organizations.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getPayFrequencies"></a>
# **getPayFrequencies**
> FrequencyCombinationUnitResource getPayFrequencies(companyId).payfrequency(payfrequency).execute();

Company Pay Frequencies

Array of pay frequencies that workers maybe paid on. This is a generic array that is currently not specific to the companies pay frequency. This is to be used with the workers pay components to determine what the frequency, occurrence, and intervals are allowed.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // The ID of the company.
    String payfrequency = "payfrequency_example"; // The frequency that you would like to search for.
    try {
      FrequencyCombinationUnitResource result = client
              .company
              .getPayFrequencies(companyId)
              .payfrequency(payfrequency)
              .execute();
      System.out.println(result);
      System.out.println(result.getPayFrequency());
      System.out.println(result.getPayComponentFrequency());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getPayFrequencies");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FrequencyCombinationUnitResource> response = client
              .company
              .getPayFrequencies(companyId)
              .payfrequency(payfrequency)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getPayFrequencies");
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
| **companyId** | **String**| The ID of the company. | |
| **payfrequency** | **String**| The frequency that you would like to search for. | [optional] |

### Return type

[**FrequencyCombinationUnitResource**](FrequencyCombinationUnitResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.payroll.payfrequencies.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getStatus"></a>
# **getStatus**
> WorkerStatus getStatus(companyId, workerStatusId).execute();

Company Worker Status

Information about a single status.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // The ID of the company.
    String workerStatusId = "workerStatusId_example"; // The ID of the worker status.
    try {
      WorkerStatus result = client
              .company
              .getStatus(companyId, workerStatusId)
              .execute();
      System.out.println(result);
      System.out.println(result.getWorkerStatusId());
      System.out.println(result.getStatusType());
      System.out.println(result.getStatusReason());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkerStatus> response = client
              .company
              .getStatus(companyId, workerStatusId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getStatus");
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
| **companyId** | **String**| The ID of the company. | |
| **workerStatusId** | **String**| The ID of the worker status. | |

### Return type

[**WorkerStatus**](WorkerStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.company.workerstatus.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getWorkers"></a>
# **getWorkers**
> WorkerResource getWorkers(companyId).givenname(givenname).familyname(familyname).legallastfour(legallastfour).employeeid(employeeid).from(from).to(to).locationid(locationid).execute();

Company Workers

Array of workers (employee and contractor) for all of the companies who are associated with a specific company that your application has been granted access to. The combination of query parameters to be used with this endpoint are as follows:  1. givenname, familyname, legallastfour  2. from, to (start date, end date)  3. employeeid  4. locationid  5. offset, limit (paging).  Note: Paging and filtering attributes cannot be applied together. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // The id assigned to the company that workers are being requested for.
    String givenname = "givenname_example"; // The given or first name of the workers to search for.
    String familyname = "familyname_example"; // The family or last name of the workers to search for.
    String legallastfour = "legallastfour_example"; // The last 4 digits of the workers federal level taxpayer id number of the worker to search for.
    String employeeid = "employeeid_example"; // The assigned workers employee ID.
    String from = "from_example"; // The beginning of the search date range using for when the worker was created.
    String to = "to_example"; // The ending of the search date range using for then the worker was created.
    String locationid = "locationid_example"; // The location Id.
    try {
      WorkerResource result = client
              .company
              .getWorkers(companyId)
              .givenname(givenname)
              .familyname(familyname)
              .legallastfour(legallastfour)
              .employeeid(employeeid)
              .from(from)
              .to(to)
              .locationid(locationid)
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
      System.out.println(result.getJobId());
      System.out.println(result.getLocationId());
      System.out.println(result.getJob());
      System.out.println(result.getOrganization());
      System.out.println(result.getSupervisor());
      System.out.println(result.getCurrentStatus());
      System.out.println(result.getCommunications());
      System.out.println(result.getWorkerCorrelationId());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getWorkers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkerResource> response = client
              .company
              .getWorkers(companyId)
              .givenname(givenname)
              .familyname(familyname)
              .legallastfour(legallastfour)
              .employeeid(employeeid)
              .from(from)
              .to(to)
              .locationid(locationid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getWorkers");
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
| **companyId** | **String**| The id assigned to the company that workers are being requested for. | |
| **givenname** | **String**| The given or first name of the workers to search for. | [optional] |
| **familyname** | **String**| The family or last name of the workers to search for. | [optional] |
| **legallastfour** | **String**| The last 4 digits of the workers federal level taxpayer id number of the worker to search for. | [optional] |
| **employeeid** | **String**| The assigned workers employee ID. | [optional] |
| **from** | **String**| The beginning of the search date range using for when the worker was created. | [optional] |
| **to** | **String**| The ending of the search date range using for then the worker was created. | [optional] |
| **locationid** | **String**| The location Id. | [optional] |

### Return type

[**WorkerResource**](WorkerResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.workers.v1+json, application/vnd.paychex.workers_communications.v1+json, application/vnd.paychex.workers.nonpii_communications.v1+json, application/vnd.paychex.workers.nonpii.v1+json, application/vnd.paychex.workers.roster.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="list"></a>
# **list**
> CompanyResource list().displayid(displayid).execute();

Companies

Array of companies that your application has been granted with some level of access. Your Application (API Key) can be granted access to one or more companies (clients) accounts that are associated with one or more product lines within Paychex.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String displayid = "displayid_example"; // The client account number used for identification purposes. (no dash or spaces allowed, only the last 8 characters  of the ID)
    try {
      CompanyResource result = client
              .company
              .list()
              .displayid(displayid)
              .execute();
      System.out.println(result);
      System.out.println(result.getCompanyId());
      System.out.println(result.getDisplayId());
      System.out.println(result.getLegalName());
      System.out.println(result.getLegalId());
      System.out.println(result.getCommunications());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompanyResource> response = client
              .company
              .list()
              .displayid(displayid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#list");
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
| **displayid** | **String**| The client account number used for identification purposes. (no dash or spaces allowed, only the last 8 characters  of the ID) | [optional] |

### Return type

[**CompanyResource**](CompanyResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.companies.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="listJobTitles"></a>
# **listJobTitles**
> JobTitleResource listJobTitles(companyId).execute();

Company Job Titles

Array of job titles set at the company level which a worker could be assigned.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // The ID of the company.
    try {
      JobTitleResource result = client
              .company
              .listJobTitles(companyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getJobTitleId());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#listJobTitles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobTitleResource> response = client
              .company
              .listJobTitles(companyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#listJobTitles");
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
| **companyId** | **String**| The ID of the company. | |

### Return type

[**JobTitleResource**](JobTitleResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.company.jobtitles.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="listLaborAssignments"></a>
# **listLaborAssignments**
> LaborAssignmentResource listLaborAssignments(companyId).asof(asof).execute();

Company Labour Assignments

Array of labor assignments set at the company level.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // The ID of the company.
    String asof = "2020-01-04T00:00:00Z"; // Returns all labour assignments as of the date used in the request.
    try {
      LaborAssignmentResource result = client
              .company
              .listLaborAssignments(companyId)
              .asof(asof)
              .execute();
      System.out.println(result);
      System.out.println(result.getLaborAssignmentId());
      System.out.println(result.getName());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getOrganizationId());
      System.out.println(result.getPositionId());
      System.out.println(result.getLinks());
      System.out.println(result.getLocationId());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#listLaborAssignments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LaborAssignmentResource> response = client
              .company
              .listLaborAssignments(companyId)
              .asof(asof)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#listLaborAssignments");
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
| **companyId** | **String**| The ID of the company. | |
| **asof** | **String**| Returns all labour assignments as of the date used in the request. | [optional] |

### Return type

[**LaborAssignmentResource**](LaborAssignmentResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.company.laborassignments.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="listWorkerStatuses"></a>
# **listWorkerStatuses**
> WorkerStatus listWorkerStatuses(companyId).execute();

Company Worker Statuses

Array of statuses set at the company level which a worker could be assigned.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // The ID of the company.
    try {
      WorkerStatus result = client
              .company
              .listWorkerStatuses(companyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getWorkerStatusId());
      System.out.println(result.getStatusType());
      System.out.println(result.getStatusReason());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#listWorkerStatuses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkerStatus> response = client
              .company
              .listWorkerStatuses(companyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#listWorkerStatuses");
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
| **companyId** | **String**| The ID of the company. | |

### Return type

[**WorkerStatus**](WorkerStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.paychex.company.workerstatuses.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="updateCustomField"></a>
# **updateCustomField**
> CustomFieldsResource updateCustomField(companyId, customfieldid, customFieldsResource).execute();

Custom Field

Update CustomFields at the company level which a company could be assigned.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // ID associated with desired company.
    String customfieldid = "customfieldid_example"; // ID associated with desired custom field.
    String customFieldId = "customFieldId_example"; // The unique identifier that is autogenerated when a custom field is created
    String customFieldName = "customFieldName_example"; // The name of the custom field
    String categoryId = "categoryId_example"; // The unique identifier that is autogenerated when creating a category
    Boolean required = true; // Where to indicate if the custom field is required on the worker where true = required and false = not required
    Boolean checkStub = true; // Where to indicate if the custom field is required on the worker's pay stub, where true = required and false = not required
    Boolean employeeEditable = true; // Where to indicate if the custom field is able to be edited by the employee, where true = required and false = not required
    String type = "DROPDOWN"; // The type of field the custom field is.
    Boolean booleanValue = true; // The value for BOOLEAN type (true / false)
    List<Link> links = Arrays.asList();
    OffsetDateTime dateValue = OffsetDateTime.now(); // The value for DATE type , example : 2012-02-01T05:00:00Z
    String textValue = "textValue_example"; // The value for TEXT type (any text, alphanumeric, special characters allowed)
    Double maxTextLength = 3.4D; // The maximum allowed value for textValue
    Double numericValue = 3.4D; // Numeric data type can have three formats namely - whole number, second decimal place and fourth decimal place, example: 12 , 12.34 or 12.3456
    List<CustomFieldsDropdownResource> dropdown = Arrays.asList();
    try {
      CustomFieldsResource result = client
              .company
              .updateCustomField(companyId, customfieldid)
              .customFieldId(customFieldId)
              .customFieldName(customFieldName)
              .categoryId(categoryId)
              .required(required)
              .checkStub(checkStub)
              .employeeEditable(employeeEditable)
              .type(type)
              .booleanValue(booleanValue)
              .links(links)
              .dateValue(dateValue)
              .textValue(textValue)
              .maxTextLength(maxTextLength)
              .numericValue(numericValue)
              .dropdown(dropdown)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomFieldId());
      System.out.println(result.getCustomFieldName());
      System.out.println(result.getCategoryId());
      System.out.println(result.getRequired());
      System.out.println(result.getCheckStub());
      System.out.println(result.getEmployeeEditable());
      System.out.println(result.getType());
      System.out.println(result.getBooleanValue());
      System.out.println(result.getLinks());
      System.out.println(result.getDateValue());
      System.out.println(result.getTextValue());
      System.out.println(result.getMaxTextLength());
      System.out.println(result.getNumericValue());
      System.out.println(result.getDropdown());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#updateCustomField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomFieldsResource> response = client
              .company
              .updateCustomField(companyId, customfieldid)
              .customFieldId(customFieldId)
              .customFieldName(customFieldName)
              .categoryId(categoryId)
              .required(required)
              .checkStub(checkStub)
              .employeeEditable(employeeEditable)
              .type(type)
              .booleanValue(booleanValue)
              .links(links)
              .dateValue(dateValue)
              .textValue(textValue)
              .maxTextLength(maxTextLength)
              .numericValue(numericValue)
              .dropdown(dropdown)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#updateCustomField");
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
| **customfieldid** | **String**| ID associated with desired custom field. | |
| **customFieldsResource** | [**CustomFieldsResource**](CustomFieldsResource.md)|  | |

### Return type

[**CustomFieldsResource**](CustomFieldsResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.paychex.company.customfields.v1+json
 - **Accept**: application/json, application/vnd.paychex.company.customfields.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="updateCustomFieldsCategory"></a>
# **updateCustomFieldsCategory**
> CustomFieldsCategoryResource updateCustomFieldsCategory(companyId, categoryid, customFieldsCategoryResource).execute();

Custom Fields Category

Update  CustomFieldsCategory at the company level.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // ID associated with desired company.
    String categoryid = "categoryid_example"; // ID associated with desired custom field.
    String categoryId = "categoryId_example"; // The unique identifier that is autogenerated when creating a category
    String categoryName = "categoryName_example"; // The name of the Category
    List<Link> links = Arrays.asList();
    try {
      CustomFieldsCategoryResource result = client
              .company
              .updateCustomFieldsCategory(companyId, categoryid)
              .categoryId(categoryId)
              .categoryName(categoryName)
              .links(links)
              .execute();
      System.out.println(result);
      System.out.println(result.getCategoryId());
      System.out.println(result.getCategoryName());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#updateCustomFieldsCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomFieldsCategoryResource> response = client
              .company
              .updateCustomFieldsCategory(companyId, categoryid)
              .categoryId(categoryId)
              .categoryName(categoryName)
              .links(links)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#updateCustomFieldsCategory");
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
| **categoryid** | **String**| ID associated with desired custom field. | |
| **customFieldsCategoryResource** | [**CustomFieldsCategoryResource**](CustomFieldsCategoryResource.md)|  | |

### Return type

[**CustomFieldsCategoryResource**](CustomFieldsCategoryResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/vnd.paychex.company.customfieldscategory.v1+json
 - **Accept**: application/json, application/vnd.paychex.company.customfieldscategories.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="updateJob"></a>
# **updateJob**
> JobResource updateJob(companyId, jobId, jobResource).execute();

Company Job

Update a single Job.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String companyId = "companyId_example"; // The ID of the company.
    String jobId = "jobId_example"; // The ID of the job.
    String jobId = "jobId_example"; // The unique identifier associated with this job.
    String jobCorrelationId = "jobCorrelationId_example"; // Id that you define which is used for error handling/responses.
    String jobName = "jobName_example"; // The name of the job.
    OffsetDateTime startDate = OffsetDateTime.now(); // The start date associated with this job.
    OffsetDateTime endDate = OffsetDateTime.now(); // The end date associated with this job.
    List<Link> links = Arrays.asList();
    JobSegmentsResource jobNumber = new JobSegmentsResource();
    try {
      JobResource result = client
              .company
              .updateJob(companyId, jobId)
              .jobId(jobId)
              .jobCorrelationId(jobCorrelationId)
              .jobName(jobName)
              .startDate(startDate)
              .endDate(endDate)
              .links(links)
              .jobNumber(jobNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getJobId());
      System.out.println(result.getJobCorrelationId());
      System.out.println(result.getJobName());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getLinks());
      System.out.println(result.getJobNumber());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#updateJob");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobResource> response = client
              .company
              .updateJob(companyId, jobId)
              .jobId(jobId)
              .jobCorrelationId(jobCorrelationId)
              .jobName(jobName)
              .startDate(startDate)
              .endDate(endDate)
              .links(links)
              .jobNumber(jobNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#updateJob");
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
| **companyId** | **String**| The ID of the company. | |
| **jobId** | **String**| The ID of the job. | |
| **jobResource** | [**JobResource**](JobResource.md)|  | |

### Return type

[**JobResource**](JobResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/vnd.paychex.company.jobs.v1+json
 - **Accept**: application/json, application/vnd.paychex.company.jobs.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

