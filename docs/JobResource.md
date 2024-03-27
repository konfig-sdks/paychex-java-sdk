

# JobResource

The state representation of Jobs within a company.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**jobId** | **String** | The unique identifier associated with this job. |  [optional] [readonly] |
|**jobCorrelationId** | **String** | Id that you define which is used for error handling/responses. |  [optional] |
|**jobName** | **String** | The name of the job. |  [optional] |
|**startDate** | **OffsetDateTime** | The start date associated with this job. |  [optional] |
|**endDate** | **OffsetDateTime** | The end date associated with this job. |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |
|**jobNumber** | [**JobSegmentsResource**](JobSegmentsResource.md) |  |  [optional] |



