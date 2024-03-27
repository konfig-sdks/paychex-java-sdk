

# Authentication1

Required Authentication object is going to be different based on each authType. <br />* NO_AUTH doesn't have any other fields in authentication object <br />* BASIC_AUTH needs 2 fields: username and password <br />* APIKEY requires the field: apiKey <br />* OAUTH2 requires 5 fields:  tokenUrl, clientId, clientSecret, grantType, contentType <br />* OAUTH2_BASIC requires 5 fields:  tokenUrl, clientId, clientSecret, grantType, contentType

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authType** | [**AuthTypeEnum**](#AuthTypeEnum) | The authorization method used to authorize callers to your webhook url. |  |
|**apiKey** | **String** | The API key required for API_KEY authorization. |  [optional] |
|**username** | **String** | The username required for BASIC_AUTH authorization. |  [optional] |
|**password** | **String** | The password required for BASIC_AUTH authorization. |  [optional] |
|**tokenUrl** | **String** | The URL used to obtain an access token for OAUTH2 or OAUTH2_BASIC authorization. |  [optional] |
|**clientId** | **String** | The client ID required by OAUTH2 and OAUTH2_BASIC authorization. |  [optional] |
|**clientSecret** | **String** | The client secret required by OAUTH2 and OAUTH2_BASIC authorization. |  [optional] |
|**grantType** | **String** | The grant type used to acquire an access token by OAUTH2 and OAUTH2_BASIC authorization. |  [optional] |
|**contentType** | **String** | The content type to use in the token request for OAUTH2 and OAUTH2_BASIC authorization. |  [optional] |



## Enum: AuthTypeEnum

| Name | Value |
|---- | -----|
| NO_AUTH | &quot;NO_AUTH&quot; |
| BASIC_AUTH | &quot;BASIC_AUTH&quot; |
| API_KEY | &quot;API_KEY&quot; |
| OAUTH2 | &quot;OAUTH2&quot; |
| OAUTH2_BASIC | &quot;OAUTH2_BASIC&quot; |



