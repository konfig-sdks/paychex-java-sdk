

# PayRateResource

Worker Pay Rate

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Describes the rate for the worker. |  [optional] |
|**rateId** | **String** | Unique identifier for this workers pay rate. **This ID will change if this is created for an IN_PROGRESS worker that is later completed within Flex** |  [optional] [readonly] |
|**startDate** | **OffsetDateTime** | The date when the pay rate is going to begin. |  [optional] |
|**rateNumber** | **String** | The number of the rate. A worker can have up to 5 different rates. |  [optional] |
|**rateType** | [**RateTypeEnum**](#RateTypeEnum) | Type of rate. |  [optional] |
|**amount** | **String** | The currency amount which this rate is applied. |  [optional] |
|**standardHours** | **String** | Default standard hours that this rate is used with a pay frequency. |  [optional] |
|**standardOvertime** | **String** | Default over time hours that this rate is used with a pay frequency. |  [optional] |
|**_default** | **Boolean** | If this rate is the default one to apply on the worker. |  [optional] |
|**effectiveDate** | **String** | The date when the pay rate becomes effective for the worker.(can be used only in POST/PATCH for an active worker) |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



## Enum: RateTypeEnum

| Name | Value |
|---- | -----|
| ANNUAL_SALARY | &quot;ANNUAL_SALARY&quot; |
| PER_PAY_PERIOD_SALARY | &quot;PER_PAY_PERIOD_SALARY&quot; |
| PIECEWORK_RATE | &quot;PIECEWORK_RATE&quot; |
| DAILY_RATE | &quot;DAILY_RATE&quot; |
| HOURLY_RATE | &quot;HOURLY_RATE&quot; |



