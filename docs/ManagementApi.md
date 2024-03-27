# ManagementApi

All URIs are relative to *https://api.paychex.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**linkPaychexClients**](ManagementApi.md#linkPaychexClients) | **POST** /management/requestclientaccess | Request Client Access |


<a name="linkPaychexClients"></a>
# **linkPaychexClients**
> DeepUrlResponseResource linkPaychexClients(partnerLinkRequestResource).execute();

Request Client Access

(For partnerships only) Link Paychex clients to a 3rd party partner application

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String displayId = "displayId_example"; // The client account number used for identification purposes. (no dash or spaces allowed, only the last 8 characters of the ID)
    try {
      DeepUrlResponseResource result = client
              .management
              .linkPaychexClients(displayId)
              .execute();
      System.out.println(result);
      System.out.println(result.getApprovalLink());
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#linkPaychexClients");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeepUrlResponseResource> response = client
              .management
              .linkPaychexClients(displayId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#linkPaychexClients");
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
| **partnerLinkRequestResource** | [**PartnerLinkRequestResource**](PartnerLinkRequestResource.md)|  | |

### Return type

[**DeepUrlResponseResource**](DeepUrlResponseResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

