# AuthenticationApi

All URIs are relative to *https://api.paychex.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBearerToken**](AuthenticationApi.md#createBearerToken) | **POST** /auth/oauth/v2/token | Create Bearer token |


<a name="createBearerToken"></a>
# **createBearerToken**
> Authentication createBearerToken(grantType, clientId, clientSecret).authenticationCreateBearerTokenRequest(authenticationCreateBearerTokenRequest).execute();

Create Bearer token

Request a Bearer token that will be used as an access token when making calls to resources.  The credentials need to be sent within the body of the request.

### Example
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **grantType** | **String**| Send \\\&quot;client_credentials\\\&quot;. | |
| **clientId** | **String**| The applications API key. | |
| **clientSecret** | **String**| The applications corresponding secret. | |
| **authenticationCreateBearerTokenRequest** | [**AuthenticationCreateBearerTokenRequest**](AuthenticationCreateBearerTokenRequest.md)| user info to be filled | [optional] |

### Return type

[**Authentication**](Authentication.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

