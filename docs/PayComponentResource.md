

# PayComponentResource

The earnings to apply to the check. Each earning needs to define as one of the following allowed values

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the Pay Component. |  [optional] |
|**componentId** | **String** | The unique identifier used to identify a pay component. |  [optional] |
|**checkComponentId** | **String** | The unique identifier associated for the pay component on this check. |  [optional] |
|**code** | **String** | The Paychex standard code number for the Pay Component, can be two digit. |  [optional] |
|**name** | **String** | Name given to the pay component. |  [optional] |
|**classificationType** | **String** | The category that this component falls into. |  [optional] |
|**effectOnPay** | [**EffectOnPayEnum**](#EffectOnPayEnum) | The effect that the pay component will have on the check amount. |  [optional] |
|**startDate** | **OffsetDateTime** | The date that the pay component is able to be applied on a check. |  [optional] |
|**endDate** | **OffsetDateTime** | The date that the pay component is not available to be applied on a check moving forward. |  [optional] |
|**appliesToWorkerTypes** | [**List&lt;AppliesToWorkerTypesEnum&gt;**](#List&lt;AppliesToWorkerTypesEnum&gt;) | List of workerTypes that the component can be applied to. |  [optional] |
|**jobId** | **String** | This is used optionally for overriding a job when it needs to be different than the workers default. This option is only available when the client has job costing. |  [optional] |
|**laborAssignmentId** | **String** | This is used optionally for overriding a labor assignment when it needs to be different than the workers assignment distribution. This option is only available when the client has labor assignment. |  [optional] |
|**payRateId** | **String** | Unique identifier for this workers pay rate **This ID will change if this is created for an IN_PROGRESS worker that is later completed within Flex** |  [optional] |
|**payRate** | **String** | The rate amount that will be applied for this component. Used in conjunction with Hours or Units. |  [optional] |
|**payHours** | **String** | The number of hours that will be applied for this component. Used in conjunction with rate. |  [optional] |
|**payUnits** | **String** | The number of units that will be applied for this component. Used in conjunction with rate. |  [optional] |
|**payAmount** | **String** | The flat amount to be applied for this component. Not used with Rate, Hours, or Units. |  [optional] |
|**lineDate** | **OffsetDateTime** | This is used optionally for specifying a date that the pay component was generated on. |  [optional] |
|**memoed** | **Boolean** | This is used optionally for memoing the payHours or payUnits so that they are informational when using a payAmount. |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



## Enum: EffectOnPayEnum

| Name | Value |
|---- | -----|
| ADDITION | &quot;ADDITION&quot; |
| ADDITION_WITH_IN_OUT | &quot;ADDITION_WITH_IN_OUT&quot; |
| EMPLOYER_INFORMATIONAL | &quot;EMPLOYER_INFORMATIONAL&quot; |
| REDUCTION | &quot;REDUCTION&quot; |



## Enum: List&lt;AppliesToWorkerTypesEnum&gt;

| Name | Value |
|---- | -----|
| EMPLOYEE | &quot;EMPLOYEE&quot; |
| CONTRACTOR | &quot;CONTRACTOR&quot; |
| INDEPENDENT_CONTRACTOR | &quot;INDEPENDENT_CONTRACTOR&quot; |



