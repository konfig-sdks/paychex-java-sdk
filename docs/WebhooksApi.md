# WebhooksApi

All URIs are relative to *https://api.paychex.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addWebhook**](WebhooksApi.md#addWebhook) | **POST** /management/hooks | Add Webhook |
| [**deleteById**](WebhooksApi.md#deleteById) | **DELETE** /management/hooks/{hookId} | Delete Webhook |
| [**getAvailableDomains**](WebhooksApi.md#getAvailableDomains) | **GET** /management/domains | Get Webhook domains |
| [**getSpecificHookById**](WebhooksApi.md#getSpecificHookById) | **GET** /management/hooks/{hookId} | Webhook |
| [**list**](WebhooksApi.md#list) | **GET** /management/hooks | List Webhooks |


<a name="addWebhook"></a>
# **addWebhook**
> WebhookResponse addWebhook(webhookRequest).execute();

Add Webhook

&lt;h3&gt;Add a webhook for the calling application.&lt;/h3&gt;&lt;p&gt;When registering a webhook, you will need to provide your own URI in the request body (see our &lt;a href&#x3D;&#39;https://developer.paychex.com/resources/webhooks&#39;&gt;full webhook documention here&lt;/a&gt; on how to configure your URI). The newly registered webhook will send notifications to this endpoint as JSON payloads which vary by domain. Please configure your endpoint to accept the relevant payloads. To see an example payload for each domain, please refer to the \&quot;Callbacks\&quot; tab.&lt;/p&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String uri = "uri_example"; // Enter a valid URL for the webhook to receive events.
    Authentication1 authentication = new Authentication1();
    List<String> domains = Arrays.asList(); // List of available domains to register to. Refer to webhook documentation https://developer.paychex.com/documentation#operation/domains.
    String hookId = "hookId_example"; // The unique identifier associated with this webhook. Not required for Posting.
    String companyId = "companyId_example"; // ID associated with desired company that will receive the webhook notifications. NOTE: If no Company ID is provided in the POST, then all companies linked to the app will receive notifications.
    List<Link> links = Arrays.asList();
    try {
      WebhookResponse result = client
              .webhooks
              .addWebhook(uri, authentication, domains)
              .hookId(hookId)
              .companyId(companyId)
              .links(links)
              .execute();
      System.out.println(result);
      System.out.println(result.getHookId());
      System.out.println(result.getCompanyId());
      System.out.println(result.getUri());
      System.out.println(result.getAuthType());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getActive());
      System.out.println(result.getDomains());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#addWebhook");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebhookResponse> response = client
              .webhooks
              .addWebhook(uri, authentication, domains)
              .hookId(hookId)
              .companyId(companyId)
              .links(links)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#addWebhook");
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
| **webhookRequest** | [**WebhookRequest**](WebhookRequest.md)|  | |

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Webhook successfully created. |  -  |

<a name="deleteById"></a>
# **deleteById**
> String deleteById(hookId).execute();

Delete Webhook

Delete a specific hook for the calling application by id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String hookId = "hookId_example";
    try {
      String result = client
              .webhooks
              .deleteById(hookId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .webhooks
              .deleteById(hookId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#deleteById");
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
| **hookId** | **String**|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Worker successfully deleted |  -  |

<a name="getAvailableDomains"></a>
# **getAvailableDomains**
> String getAvailableDomains().execute();

Get Webhook domains

Will return a list of available domains depending on application type.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    try {
      String result = client
              .webhooks
              .getAvailableDomains()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getAvailableDomains");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .webhooks
              .getAvailableDomains()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getAvailableDomains");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Domains successfully returned. |  -  |

<a name="getSpecificHookById"></a>
# **getSpecificHookById**
> WebhooksGetSpecificHookByIdResponse getSpecificHookById(hookId).execute();

Webhook

Get a specific hook for the calling application by id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    String hookId = "hookId_example";
    try {
      WebhooksGetSpecificHookByIdResponse result = client
              .webhooks
              .getSpecificHookById(hookId)
              .execute();
      System.out.println(result);
      System.out.println(result.getHookId());
      System.out.println(result.getCompanyId());
      System.out.println(result.getUri());
      System.out.println(result.getAuthType());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getDomains());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getSpecificHookById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebhooksGetSpecificHookByIdResponse> response = client
              .webhooks
              .getSpecificHookById(hookId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getSpecificHookById");
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
| **hookId** | **String**|  | |

### Return type

[**WebhooksGetSpecificHookByIdResponse**](WebhooksGetSpecificHookByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhook successfully returned. |  -  |

<a name="list"></a>
# **list**
> List&lt;WebhooksListResponseInner&gt; list().execute();

List Webhooks

List all the webhooks setup for the calling application

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paychex;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.paychex.com";
    Paychex client = new Paychex(configuration);
    try {
      List<WebhooksListResponseInner> result = client
              .webhooks
              .list()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<WebhooksListResponseInner>> response = client
              .webhooks
              .list()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;WebhooksListResponseInner&gt;**](WebhooksListResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhooks successfully returned. |  -  |

