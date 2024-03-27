

# WebhookRequest

This resource is for registering/unregistering webhooks.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hookId** | **String** | The unique identifier associated with this webhook. Not required for Posting. |  [optional] |
|**uri** | **String** | Enter a valid URL for the webhook to receive events. |  |
|**companyId** | **String** | ID associated with desired company that will receive the webhook notifications. NOTE: If no Company ID is provided in the POST, then all companies linked to the app will receive notifications. |  [optional] |
|**authentication** | [**Authentication1**](Authentication1.md) |  |  |
|**domains** | **List&lt;String&gt;** | List of available domains to register to. Refer to webhook documentation https://developer.paychex.com/documentation#operation/domains. |  |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



