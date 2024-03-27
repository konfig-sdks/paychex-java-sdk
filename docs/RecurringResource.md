

# RecurringResource

Worker recurring deduction

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**workerComponentId** | **String** | The id of a single pay component that a workers has. |  [optional] [readonly] |
|**componentId** | **String** | The unique identifier of the pay component. This data field cannot be PATCHED. |  [optional] |
|**name** | **String** | Name of the pay component. This data field will be populated automatically based on componentId. |  [optional] |
|**calculationType** | [**CalculationTypeEnum**](#CalculationTypeEnum) | The type of calculation that will be applied for the pay component . |  [optional] |
|**calculationBaseId** | **String** | This is required if you are not using a FLAT_DOLLAR_AMOUNT Calculation Type. |  [optional] |
|**value** | **Double** | This is used to specify the value that is used against the calculationType. |  [optional] |
|**startDate** | **OffsetDateTime** | Date which this pay component will start to be applied during the payruns. This is an optional field that default to current datetime if not provided. This cannot be backdated but can be added to start in the future. |  [optional] |
|**effectiveDate** | **OffsetDateTime** | Date which this pay component has started for the worker. |  [optional] |
|**endDate** | **OffsetDateTime** | Date which this pay component has ended for the worker. |  [optional] |
|**effectOnPay** | **String** | What the effect on pay will be (REDUCTION OR ADDITION), currently only reductions are available. This data field will be populated automatically based on componentId. This data field cannot be PATCHED |  [optional] |
|**classificationType** | **String** | The category that this component falls into. |  [optional] |
|**frequency** | [**PayComponentFrequencyTypeResource1**](PayComponentFrequencyTypeResource1.md) |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



## Enum: CalculationTypeEnum

| Name | Value |
|---- | -----|
| FLAT_DOLLAR_AMOUNT_THIS_IS_USED_FOR_A_SPECIFIC_DOLLAR_AMOUNT | &quot;FLAT_DOLLAR_AMOUNT:This is used for a specific dollar amount&quot; |
| PERCENTAGE_THIS_IS_USED_FOR_WHEN_A_PERCENTAGE_WILL_BE_USED_TO_CALCULATE_THE_AMOUNT_AND_WILL_NEED_A_CALCULATIONBASEID_TO_SPECIFY_WHAT_TO_APPLY_AGAINST | &quot;PERCENTAGE:This is used for when a Percentage will be used to calculate the amount and will need a calculationBaseId to specify what to apply against&quot; |
| RATE_X_UNITS_THIS_IS_USED_FOR_APPLY_THE_RATE_AGAINST_UNITS_AND_WILL_NEED_A_CALCULATIONBASEID_TO_SPECIFY_WHAT_TO_APPLY_AGAINST | &quot;RATE_X_UNITS:This is used for apply the rate against units and will need a calculationBaseId to specify what to apply against&quot; |
| RATE_X_HOURS_THIS_IS_USED_FOR_APPLY_THE_RATE_AGAINST_HOURS_AND_WILL_NEED_A_CALCULATIONBASEID_TO_SPECIFY_WHAT_TO_APPLY_AGAINST_ | &quot;RATE_X_HOURS:This is used for apply the rate against hours and will need a calculationBaseId to specify what to apply against.&quot; |



