

# CommunicationResource1


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**communicationId** | **String** | The ID for the workers specific communication item. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | A set of communication types classifying an instruction that the customer, requester, or subject must comply with in order for the screening to go forward. NOTE: PHONE and EMAIL type supports BUSINESS and PERSONAL usage type only.MOBILE_PHONE, FAX and PAGER supports BUSINESS usage type only.This data field cannot be PATCHED. |  [optional] |
|**usageType** | [**UsageTypeEnum**](#UsageTypeEnum) | A code classifying a designated use associated with a contact method. For example, whether a telephone or email address is one for business communications or one primarily for personal use.This data field cannot be PATCHED. |  [optional] |
|**dialCountry** | **String** | The country dialing code for a communication number |  [optional] |
|**dialArea** | **String** | The area dialing code for a communication number |  [optional] |
|**dialNumber** | **String** | The communication number, not including country dialing or area dialing codes |  [optional] |
|**dialExtension** | **String** | The extension of the associated communication number |  [optional] |
|**uri** | **String** | The mailto address as specified in RFC2368 |  [optional] |
|**streetLineOne** | **String** | The street address line one |  [optional] |
|**streetLineTwo** | **String** | The street address line two |  [optional] |
|**postOfficeBox** | **String** | The postal office box. This data field cannot be PATCHED |  [optional] |
|**city** | **String** | The city name |  [optional] |
|**postalCode** | **String** | The zip-code |  [optional] |
|**postalCodeExtension** | **String** | The zip-code extension |  [optional] |
|**countrySubdivisionCode** | **String** | The state code (ISO 3166 subdivision code). This data field cannot be PATCHED for ACTIVE worker |  [optional] |
|**countryCode** | **String** | The country code (ISO 3166 alpha-2) |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STREET_ADDRESS | &quot;STREET_ADDRESS&quot; |
| PO_BOX_ADDRESS | &quot;PO_BOX_ADDRESS&quot; |
| PHONE | &quot;PHONE&quot; |
| MOBILE_PHONE | &quot;MOBILE_PHONE&quot; |
| FAX | &quot;FAX&quot; |
| EMAIL | &quot;EMAIL&quot; |
| PAGER | &quot;PAGER&quot; |



## Enum: UsageTypeEnum

| Name | Value |
|---- | -----|
| PERSONAL | &quot;PERSONAL&quot; |
| BUSINESS | &quot;BUSINESS&quot; |
| HOME | &quot;HOME&quot; |
| WORK | &quot;WORK&quot; |
| LOCATION_STREET_ADDRESS | &quot;LOCATION_STREET_ADDRESS&quot; |
| MAILING_ADDRESS | &quot;MAILING_ADDRESS&quot; |



