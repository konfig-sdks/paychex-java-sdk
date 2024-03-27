

# DirectDepositResource

Worker direct deposit

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**directDepositId** | **String** | The ID for the direct deposit item. |  [optional] [readonly] |
|**startDate** | **OffsetDateTime** | The date that this direct deposit will be applied to future pay periods. This data field cannot be PATCHED. |  [optional] |
|**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) | A type of payment for the direct deposit. |  [optional] |
|**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | Financial institutions account type. This data field cannot be PATCHED. |  [optional] |
|**value** | **Double** | The amount to be applied to this direct deposit. |  [optional] |
|**routingNumber** | **String** | The financial institutions routing number.This data field cannot be PATCHED. |  [optional] |
|**accountNumber** | **String** | The financial institutions account number.This data field cannot be PATCHED. |  [optional] |
|**priority** | **String** | The priority order for which the direct deposits will be performed in. When a new direct deposit is added the priority will be assigned. The priority can be modified only by swapping with a different direct deposit using the bulk PATCH. A paymentType of REMAINDER will show a priority of 99 and can&#39;t be modified.This data field cannot be PATCHED. |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



## Enum: PaymentTypeEnum

| Name | Value |
|---- | -----|
| FLAT_DOLLAR_AMOUNT | &quot;FLAT_DOLLAR_AMOUNT&quot; |
| PERCENTAGE | &quot;PERCENTAGE&quot; |
| REMAINDER | &quot;REMAINDER&quot; |



## Enum: AccountTypeEnum

| Name | Value |
|---- | -----|
| CHECKING | &quot;CHECKING&quot; |
| SAVINGS | &quot;SAVINGS&quot; |
| CREDIT_CARD | &quot;CREDIT_CARD&quot; |



