

# PayStandardResource

Worker Pay Standard

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payFrequency** | [**PayFrequencyEnum**](#PayFrequencyEnum) | How often a worker is paid. |  [optional] |
|**overtimeFactor** | **String** | Default overtime factor that would be applied for overtime work completed. |  [optional] |
|**calculatedPayPeriod** | **String** | Calculated amount of compensation based on rate defaults. |  [optional] |
|**calculatedAnnualSalary** | **String** | Calculated amount of compensation based on calculatedPayPeriod and payFrequency. |  [optional] |



## Enum: PayFrequencyEnum

| Name | Value |
|---- | -----|
| WEEKLY | &quot;WEEKLY&quot; |
| BI_WEEKLY | &quot;BI_WEEKLY&quot; |
| SEMI_MONTHLY | &quot;SEMI_MONTHLY&quot; |
| MONTHLY | &quot;MONTHLY&quot; |



