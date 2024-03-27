

# CheckResource

The state representation of Labor Assignments within a company.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**workerId** | **String** | The id assigned to the worker. |  [optional] |
|**paycheckId** | **String** | The id of a single check that a workers has. |  [optional] [readonly] |
|**payPeriodId** | **String** | The id for the unprocessed payperiod.  |  [optional] |
|**checkCorrelationId** | **String** | Id that you define which is used for error handling/responses. This is not required when sending a single check. |  [optional] |
|**blockAutoDistribution** | **Boolean** | This is used optionally for blocking the auto distribution of the earnings on the workers if they are setup for auto distribution. |  [optional] |
|**earnings** | [**List&lt;PayComponentResource&gt;**](PayComponentResource.md) | The earnings to apply to the check.Each earning needs to define as one of the following:1 .payHours: Will use the default hourly rate defined on the worker to apply the hours against. 2. payHours and payRate: Will allow you to define the monetary rate that the hours will be applied against. 3. payHours and payRateId: Will allow you to define which workers predefined pay rate the hours will be applied against. 4. payUnits: Will use the default hourly rate defined on the worker to apply the units against. 5. payUnits and payRate: Will allow you to define the monetary rate that the units will be applied against. 6. payUnits and payRateId: Will allow you to define which workers predefined pay rate the units will be applied against. 7. payAmount: Will allow you to define straight monetary amount. |  [optional] |
|**deductions** | [**List&lt;PayComponentResource&gt;**](PayComponentResource.md) | Deduction pay components on the check. |  [optional] |
|**checkDate** | **String** | The check date  |  [optional] |
|**informational** | [**List&lt;PayComponentResource&gt;**](PayComponentResource.md) | Informational pay components on the check. |  [optional] |
|**taxes** | [**List&lt;PayComponentResource&gt;**](PayComponentResource.md) | Tax pay components on the check. |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |


