

# EmailResource

The email communications for this contact.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**communicationId** | **String** | The ID for this email communication. |  [optional] |
|**uri** | **String** | The mailto address as specified in RFC2368. Required for POST contacts. |  [optional] |
|**usageType** | **String** | Enum: \&quot;PERSONAL\&quot;, \&quot;BUSINESS\&quot;  A code classifying a designated use associated with a contact method. For example, whether a telephone or email address is one for work communications or one primarily for personal use. This data field cannot be PATCHED. Required for POST contacts. |  [optional] |



