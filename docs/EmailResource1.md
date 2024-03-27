

# EmailResource1


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**primaryEmail** | **String** |  |  [optional] |
|**secondaryEmail** | **String** |  |  [optional] |
|**connectionName** | **String** |  |  [optional] |
|**displayId** | **String** |  |  [optional] |
|**legalName** | **String** |  |  [optional] |
|**notificationType** | [**NotificationTypeEnum**](#NotificationTypeEnum) |  |  [optional] |
|**workerErrors** | [**List&lt;WorkerErrorResource&gt;**](WorkerErrorResource.md) |  |  [optional] |
|**payPeriod** | **String** |  |  [optional] |
|**partnerLocationId** | **String** |  |  [optional] |
|**state** | **String** |  |  [optional] |
|**sourceJobName** | **String** |  |  [optional] |
|**bcc** | **String** |  |  [optional] |
|**employeeFirstName** | **String** |  |  [optional] |
|**employeeLastName** | **String** |  |  [optional] |
|**linkToSurvey** | **String** |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



## Enum: NotificationTypeEnum

| Name | Value |
|---- | -----|
| CONNECTION_ERROR | &quot;CONNECTION_ERROR&quot; |
| DATA_ERROR | &quot;DATA_ERROR&quot; |
| WORKER_CHECK_ERROR | &quot;WORKER_CHECK_ERROR&quot; |
| MULTI_ID_SPI_REJECT | &quot;MULTI_ID_SPI_REJECT&quot; |
| EMPLOYEE_OVERTIME_NOTIFICATION | &quot;EMPLOYEE_OVERTIME_NOTIFICATION&quot; |
| COMPANY_PAY_PERIOD_ERROR | &quot;COMPANY_PAY_PERIOD_ERROR&quot; |
| PAYROLL_CONFIRMATION | &quot;PAYROLL_CONFIRMATION&quot; |
| COMPANY_JOBCODE | &quot;COMPANY_JOBCODE&quot; |
| OFFBOARDING_SURVEY | &quot;OFFBOARDING_SURVEY&quot; |
| OFFBOARDING_ERROR | &quot;OFFBOARDING_ERROR&quot; |
| WORKER_PUNCH_OR_ADJUSTMENT_ERROR | &quot;WORKER_PUNCH_OR_ADJUSTMENT_ERROR&quot; |
| WORKER_SCHEDULE_ERROR | &quot;WORKER_SCHEDULE_ERROR&quot; |



