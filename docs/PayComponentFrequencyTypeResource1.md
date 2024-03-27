

# PayComponentFrequencyTypeResource1

Worker pay frequency

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**applied** | **String** | Currently we only support a BY_PAY_PERIOD value for the API. |  [optional] |
|**occurrence** | **String** | This is how often the pay component will be applied on the pay run. The available values for this will depend on the payFrequency that a worker is paid which can be found on the worker compensations pay standards. |  [optional] |
|**occurrenceIntervals** | [**FrequencyIntervalsResource1**](FrequencyIntervalsResource1.md) |  |  [optional] |
|**effectedChecks** | **String** | Which check(s) within the payrun that the paycomponent will be applied to.FIRST_CHECK: The Pay Component will be applied to the first check for the worker within the pay run. This is used for a pay component that only should be applied once like a health insurance deduction.EVERY_CHECK: The Pay Component will be applied to all of the checks for the worker within the pay run. This is used for a pay component that is applied on all check like a retirement deduction. |  [optional] |



