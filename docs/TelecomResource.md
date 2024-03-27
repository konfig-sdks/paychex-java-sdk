

# TelecomResource

The telecom communications for this contact.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**communicationId** | **String** | The ID for the workers relationship to contact. |  [optional] |
|**dialCountry** | **String** | The country code. Required for POST contacts. |  [optional] |
|**dialArea** | **String** | The area code. Required for POST contacts. |  [optional] |
|**dialNumber** | **String** | The phone number. Required for POST contacts. |  [optional] |
|**type** | **String** | Enum: \&quot;PHONE\&quot;, \&quot;MOBILE_PHONE\&quot;  Indicates whether or not the number is for a mobile device. Required for POST contacts. |  [optional] |
|**usageType** | **String** | Enum: \&quot;PERSONAL\&quot;, \&quot;BUSINESS\&quot;  A code classifying a designated use associated with a contact method. For example, whether a telephone or email address is one for work communications or one primarily for personal use. This data field cannot be PATCHED. Required for POST contacts. |  [optional] |
|**extension** | **String** | The phone extension. |  [optional] |



