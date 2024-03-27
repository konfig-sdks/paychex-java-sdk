

# LegalIdResource

The workers legal tax identification information. This data field cannot be PATCHED for ACTIVE workers.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**legalIdType** | [**LegalIdTypeEnum**](#LegalIdTypeEnum) | A value that identifies the type of taxpayer identification number provided.   SSN: Social  Security Number - 9 digit number   , FEIN: Federal Employer Identification Number (EIN) |  [optional] |
|**legalIdValue** | **String** | The federal level taxpayer id number assigned to a business |  [optional] |



## Enum: LegalIdTypeEnum

| Name | Value |
|---- | -----|
| SSN | &quot;SSN&quot; |
| FEIN | &quot;FEIN&quot; |



