

# PayPeriodResource

The representational state of pay periods.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the Pay Period. |  [optional] |
|**payPeriodId** | **String** | The unique identifier used to identify a pay period. |  [optional] |
|**intervalCode** | [**IntervalCodeEnum**](#IntervalCodeEnum) | Frequency of the payroll period. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The current state of the associated pay period. |  [optional] |
|**startDate** | **OffsetDateTime** | The start date associated with this pay period. |  [optional] |
|**endDate** | **OffsetDateTime** | The end date associated with this pay period. |  [optional] |
|**submitByDate** | **OffsetDateTime** | The date by which information for the pay run must be submitted in order to be guaranteed the information is included. |  [optional] |
|**checkDate** | **OffsetDateTime** | The date on which the checks associated with this pay period can be cashed. |  [optional] |
|**checkCount** | **Integer** | Number of checks that are included within the pay period. |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



## Enum: IntervalCodeEnum

| Name | Value |
|---- | -----|
| ANNUAL | &quot;ANNUAL&quot; |
| BI_WEEKLY | &quot;BI_WEEKLY&quot; |
| MONTHLY | &quot;MONTHLY&quot; |
| QUARTERLY | &quot;QUARTERLY&quot; |
| SEMI_ANNUAL | &quot;SEMI_ANNUAL&quot; |
| SEMI_MONTHLY | &quot;SEMI_MONTHLY&quot; |
| WEEKLY | &quot;WEEKLY&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;COMPLETED&quot; |
| COMPLETED_BY_MEC | &quot;COMPLETED_BY_MEC&quot; |
| ENTRY | &quot;ENTRY&quot; |
| INITIAL | &quot;INITIAL&quot; |
| PROCESSING | &quot;PROCESSING&quot; |
| REISSUED | &quot;REISSUED&quot; |
| RELEASED | &quot;RELEASED&quot; |
| REVERSED | &quot;REVERSED&quot; |



