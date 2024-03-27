

# TimeOffResource

The representational state of a workers time off.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**policyId** | **String** | The unique ID assigned to the company policy. |  [optional] |
|**type** | **String** | The policy type the client has assigned at the company level |  [optional] |
|**name** | **String** | The name of the policy the client has assigned at the company level. |  [optional] |
|**balance** | **String** | The current balance for this worker, for the associated policy type. |  [optional] |
|**measure** | [**MeasureEnum**](#MeasureEnum) | Type of measurement type to be applied to the balance. |  [optional] |



## Enum: MeasureEnum

| Name | Value |
|---- | -----|
| HOURS | &quot;HOURS&quot; |
| UNITS | &quot;UNITS&quot; |



