/*
 * External API
 *   # Developer Resources  Refer [Developer Resources](https://developer.paychex.com/resources/overview/) for more details on API specification 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.Authentication1;
import com.konfigthis.client.model.Link;
import com.konfigthis.client.model.WebhookRequest;
import com.konfigthis.client.model.WebhookResponse;
import com.konfigthis.client.model.WebhooksGetSpecificHookByIdResponse;
import com.konfigthis.client.model.WebhooksListResponseInner;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class WebhooksApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WebhooksApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public WebhooksApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call addWebhookCall(WebhookRequest webhookRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = webhookRequest;

        // create path and map variables
        String localVarPath = "/management/hooks";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addWebhookValidateBeforeCall(WebhookRequest webhookRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'webhookRequest' is set
        if (webhookRequest == null) {
            throw new ApiException("Missing the required parameter 'webhookRequest' when calling addWebhook(Async)");
        }

        return addWebhookCall(webhookRequest, _callback);

    }


    private ApiResponse<WebhookResponse> addWebhookWithHttpInfo(WebhookRequest webhookRequest) throws ApiException {
        okhttp3.Call localVarCall = addWebhookValidateBeforeCall(webhookRequest, null);
        Type localVarReturnType = new TypeToken<WebhookResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call addWebhookAsync(WebhookRequest webhookRequest, final ApiCallback<WebhookResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = addWebhookValidateBeforeCall(webhookRequest, _callback);
        Type localVarReturnType = new TypeToken<WebhookResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class AddWebhookRequestBuilder {
        private final String uri;
        private final Authentication1 authentication;
        private final List<String> domains;
        private String hookId;
        private String companyId;
        private List<Link> links;

        private AddWebhookRequestBuilder(String uri, Authentication1 authentication, List<String> domains) {
            this.uri = uri;
            this.authentication = authentication;
            this.domains = domains;
        }

        /**
         * Set hookId
         * @param hookId The unique identifier associated with this webhook. Not required for Posting. (optional)
         * @return AddWebhookRequestBuilder
         */
        public AddWebhookRequestBuilder hookId(String hookId) {
            this.hookId = hookId;
            return this;
        }
        
        /**
         * Set companyId
         * @param companyId ID associated with desired company that will receive the webhook notifications. NOTE: If no Company ID is provided in the POST, then all companies linked to the app will receive notifications. (optional)
         * @return AddWebhookRequestBuilder
         */
        public AddWebhookRequestBuilder companyId(String companyId) {
            this.companyId = companyId;
            return this;
        }
        
        /**
         * Set links
         * @param links  (optional)
         * @return AddWebhookRequestBuilder
         */
        public AddWebhookRequestBuilder links(List<Link> links) {
            this.links = links;
            return this;
        }
        
        /**
         * Build call for addWebhook
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Webhook successfully created. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            WebhookRequest webhookRequest = buildBodyParams();
            return addWebhookCall(webhookRequest, _callback);
        }

        private WebhookRequest buildBodyParams() {
            WebhookRequest webhookRequest = new WebhookRequest();
            webhookRequest.hookId(this.hookId);
            webhookRequest.uri(this.uri);
            webhookRequest.companyId(this.companyId);
            webhookRequest.authentication(this.authentication);
            webhookRequest.domains(this.domains);
            webhookRequest.links(this.links);
            return webhookRequest;
        }

        /**
         * Execute addWebhook request
         * @return WebhookResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Webhook successfully created. </td><td>  -  </td></tr>
         </table>
         */
        public WebhookResponse execute() throws ApiException {
            WebhookRequest webhookRequest = buildBodyParams();
            ApiResponse<WebhookResponse> localVarResp = addWebhookWithHttpInfo(webhookRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute addWebhook request with HTTP info returned
         * @return ApiResponse&lt;WebhookResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Webhook successfully created. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<WebhookResponse> executeWithHttpInfo() throws ApiException {
            WebhookRequest webhookRequest = buildBodyParams();
            return addWebhookWithHttpInfo(webhookRequest);
        }

        /**
         * Execute addWebhook request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Webhook successfully created. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<WebhookResponse> _callback) throws ApiException {
            WebhookRequest webhookRequest = buildBodyParams();
            return addWebhookAsync(webhookRequest, _callback);
        }
    }

    /**
     * Add Webhook
     * &lt;h3&gt;Add a webhook for the calling application.&lt;/h3&gt;&lt;p&gt;When registering a webhook, you will need to provide your own URI in the request body (see our &lt;a href&#x3D;&#39;https://developer.paychex.com/resources/webhooks&#39;&gt;full webhook documention here&lt;/a&gt; on how to configure your URI). The newly registered webhook will send notifications to this endpoint as JSON payloads which vary by domain. Please configure your endpoint to accept the relevant payloads. To see an example payload for each domain, please refer to the \&quot;Callbacks\&quot; tab.&lt;/p&gt;
     * @param webhookRequest  (required)
     * @return AddWebhookRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Webhook successfully created. </td><td>  -  </td></tr>
     </table>
     * Full webhook documention
     * @see <a href="https://developer.paychex.com/resources/webhooks">Add Webhook Documentation</a>
     */
    public AddWebhookRequestBuilder addWebhook(String uri, Authentication1 authentication, List<String> domains) throws IllegalArgumentException {
        if (uri == null) throw new IllegalArgumentException("\"uri\" is required but got null");
            

        if (authentication == null) throw new IllegalArgumentException("\"authentication\" is required but got null");
        if (domains == null) throw new IllegalArgumentException("\"domains\" is required but got null");
        return new AddWebhookRequestBuilder(uri, authentication, domains);
    }
    private okhttp3.Call deleteByIdCall(String hookId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/management/hooks/{hookId}"
            .replace("{" + "hookId" + "}", localVarApiClient.escapeString(hookId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteByIdValidateBeforeCall(String hookId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'hookId' is set
        if (hookId == null) {
            throw new ApiException("Missing the required parameter 'hookId' when calling deleteById(Async)");
        }

        return deleteByIdCall(hookId, _callback);

    }


    private ApiResponse<String> deleteByIdWithHttpInfo(String hookId) throws ApiException {
        okhttp3.Call localVarCall = deleteByIdValidateBeforeCall(hookId, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call deleteByIdAsync(String hookId, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteByIdValidateBeforeCall(hookId, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class DeleteByIdRequestBuilder {
        private final String hookId;

        private DeleteByIdRequestBuilder(String hookId) {
            this.hookId = hookId;
        }

        /**
         * Build call for deleteById
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Worker successfully deleted </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteByIdCall(hookId, _callback);
        }


        /**
         * Execute deleteById request
         * @return String
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Worker successfully deleted </td><td>  -  </td></tr>
         </table>
         */
        public String execute() throws ApiException {
            ApiResponse<String> localVarResp = deleteByIdWithHttpInfo(hookId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute deleteById request with HTTP info returned
         * @return ApiResponse&lt;String&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Worker successfully deleted </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<String> executeWithHttpInfo() throws ApiException {
            return deleteByIdWithHttpInfo(hookId);
        }

        /**
         * Execute deleteById request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Worker successfully deleted </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<String> _callback) throws ApiException {
            return deleteByIdAsync(hookId, _callback);
        }
    }

    /**
     * Delete Webhook
     * Delete a specific hook for the calling application by id
     * @param hookId  (required)
     * @return DeleteByIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Worker successfully deleted </td><td>  -  </td></tr>
     </table>
     */
    public DeleteByIdRequestBuilder deleteById(String hookId) throws IllegalArgumentException {
        if (hookId == null) throw new IllegalArgumentException("\"hookId\" is required but got null");
            

        return new DeleteByIdRequestBuilder(hookId);
    }
    private okhttp3.Call getAvailableDomainsCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/management/domains";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAvailableDomainsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getAvailableDomainsCall(_callback);

    }


    private ApiResponse<String> getAvailableDomainsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getAvailableDomainsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAvailableDomainsAsync(final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAvailableDomainsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetAvailableDomainsRequestBuilder {

        private GetAvailableDomainsRequestBuilder() {
        }

        /**
         * Build call for getAvailableDomains
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Domains successfully returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getAvailableDomainsCall(_callback);
        }


        /**
         * Execute getAvailableDomains request
         * @return String
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Domains successfully returned. </td><td>  -  </td></tr>
         </table>
         */
        public String execute() throws ApiException {
            ApiResponse<String> localVarResp = getAvailableDomainsWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getAvailableDomains request with HTTP info returned
         * @return ApiResponse&lt;String&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Domains successfully returned. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<String> executeWithHttpInfo() throws ApiException {
            return getAvailableDomainsWithHttpInfo();
        }

        /**
         * Execute getAvailableDomains request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Domains successfully returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<String> _callback) throws ApiException {
            return getAvailableDomainsAsync(_callback);
        }
    }

    /**
     * Get Webhook domains
     * Will return a list of available domains depending on application type.
     * @return GetAvailableDomainsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Domains successfully returned. </td><td>  -  </td></tr>
     </table>
     */
    public GetAvailableDomainsRequestBuilder getAvailableDomains() throws IllegalArgumentException {
        return new GetAvailableDomainsRequestBuilder();
    }
    private okhttp3.Call getSpecificHookByIdCall(String hookId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/management/hooks/{hookId}"
            .replace("{" + "hookId" + "}", localVarApiClient.escapeString(hookId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSpecificHookByIdValidateBeforeCall(String hookId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'hookId' is set
        if (hookId == null) {
            throw new ApiException("Missing the required parameter 'hookId' when calling getSpecificHookById(Async)");
        }

        return getSpecificHookByIdCall(hookId, _callback);

    }


    private ApiResponse<WebhooksGetSpecificHookByIdResponse> getSpecificHookByIdWithHttpInfo(String hookId) throws ApiException {
        okhttp3.Call localVarCall = getSpecificHookByIdValidateBeforeCall(hookId, null);
        Type localVarReturnType = new TypeToken<WebhooksGetSpecificHookByIdResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getSpecificHookByIdAsync(String hookId, final ApiCallback<WebhooksGetSpecificHookByIdResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSpecificHookByIdValidateBeforeCall(hookId, _callback);
        Type localVarReturnType = new TypeToken<WebhooksGetSpecificHookByIdResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetSpecificHookByIdRequestBuilder {
        private final String hookId;

        private GetSpecificHookByIdRequestBuilder(String hookId) {
            this.hookId = hookId;
        }

        /**
         * Build call for getSpecificHookById
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Webhook successfully returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getSpecificHookByIdCall(hookId, _callback);
        }


        /**
         * Execute getSpecificHookById request
         * @return WebhooksGetSpecificHookByIdResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Webhook successfully returned. </td><td>  -  </td></tr>
         </table>
         */
        public WebhooksGetSpecificHookByIdResponse execute() throws ApiException {
            ApiResponse<WebhooksGetSpecificHookByIdResponse> localVarResp = getSpecificHookByIdWithHttpInfo(hookId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getSpecificHookById request with HTTP info returned
         * @return ApiResponse&lt;WebhooksGetSpecificHookByIdResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Webhook successfully returned. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<WebhooksGetSpecificHookByIdResponse> executeWithHttpInfo() throws ApiException {
            return getSpecificHookByIdWithHttpInfo(hookId);
        }

        /**
         * Execute getSpecificHookById request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Webhook successfully returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<WebhooksGetSpecificHookByIdResponse> _callback) throws ApiException {
            return getSpecificHookByIdAsync(hookId, _callback);
        }
    }

    /**
     * Webhook
     * Get a specific hook for the calling application by id
     * @param hookId  (required)
     * @return GetSpecificHookByIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Webhook successfully returned. </td><td>  -  </td></tr>
     </table>
     */
    public GetSpecificHookByIdRequestBuilder getSpecificHookById(String hookId) throws IllegalArgumentException {
        if (hookId == null) throw new IllegalArgumentException("\"hookId\" is required but got null");
            

        return new GetSpecificHookByIdRequestBuilder(hookId);
    }
    private okhttp3.Call listCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/management/hooks";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return listCall(_callback);

    }


    private ApiResponse<List<WebhooksListResponseInner>> listWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = listValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<WebhooksListResponseInner>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAsync(final ApiCallback<List<WebhooksListResponseInner>> _callback) throws ApiException {

        okhttp3.Call localVarCall = listValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<WebhooksListResponseInner>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListRequestBuilder {

        private ListRequestBuilder() {
        }

        /**
         * Build call for list
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Webhooks successfully returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listCall(_callback);
        }


        /**
         * Execute list request
         * @return List&lt;WebhooksListResponseInner&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Webhooks successfully returned. </td><td>  -  </td></tr>
         </table>
         */
        public List<WebhooksListResponseInner> execute() throws ApiException {
            ApiResponse<List<WebhooksListResponseInner>> localVarResp = listWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute list request with HTTP info returned
         * @return ApiResponse&lt;List&lt;WebhooksListResponseInner&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Webhooks successfully returned. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<WebhooksListResponseInner>> executeWithHttpInfo() throws ApiException {
            return listWithHttpInfo();
        }

        /**
         * Execute list request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Webhooks successfully returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<WebhooksListResponseInner>> _callback) throws ApiException {
            return listAsync(_callback);
        }
    }

    /**
     * List Webhooks
     * List all the webhooks setup for the calling application
     * @return ListRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Webhooks successfully returned. </td><td>  -  </td></tr>
     </table>
     */
    public ListRequestBuilder list() throws IllegalArgumentException {
        return new ListRequestBuilder();
    }
}
