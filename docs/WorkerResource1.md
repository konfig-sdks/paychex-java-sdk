

# WorkerResource1


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**workerId** | **String** | The unique identifier associated with this worker representation. |  [optional] |
|**employeeId** | **String** | The workers employee identification information. |  [optional] |
|**workerType** | [**WorkerTypeEnum**](#WorkerTypeEnum) | The type of worker. This data field cannot be PATCHED. |  [optional] |
|**employmentType** | [**EmploymentTypeEnum**](#EmploymentTypeEnum) | The type of employment for the worker. |  [optional] |
|**exemptionType** | [**ExemptionTypeEnum**](#ExemptionTypeEnum) | The Overtime classification of the worker. This data field cannot be PATCHED for ACTIVE workers. |  [optional] |
|**birthDate** | **OffsetDateTime** | The workers date of birth. It cannot be greater than today&#39;s date. |  [optional] |
|**sex** | [**SexEnum**](#SexEnum) |  |  [optional] |
|**ethnicityCode** | **String** | Disclaimer:This parameter is not visible in Flex for the client. This data field cannot be PATCHED for ACTIVE workers. |  [optional] |
|**hireDate** | **OffsetDateTime** | The date which the worker was hired. It cannot be PATCHED for ACTIVE workers. |  [optional] |
|**clockId** | **String** | The clock ID of the worker that can be an identification for other systems. |  [optional] |
|**name** | [**NameResource1**](NameResource1.md) |  |  [optional] |
|**legalId** | [**LegalIdResource1**](LegalIdResource1.md) |  |  [optional] |
|**laborAssignmentId** | **String** | The workers home labor assignment. This data field cannot be POSTED or PATCHED. |  [optional] |
|**locationId** | **String** | The workers location. This data field cannot be POSTED or PATCHED. |  [optional] |
|**jobId** | **String** | The workers home job. This data field cannot be POSTED or PATCHED. |  [optional] |
|**job** | [**JobTitleResource1**](JobTitleResource1.md) |  |  [optional] |
|**organization** | [**OrganizationResource1**](OrganizationResource1.md) |  |  [optional] |
|**supervisor** | [**SupervisorResource1**](SupervisorResource1.md) |  |  [optional] |
|**currentStatus** | [**Status1**](Status1.md) |  |  [optional] |
|**communications** | [**List&lt;CommunicationResource1&gt;**](CommunicationResource1.md) | Worker Communications. This data field cannot be updated for worker endpoint. |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |
|**workerCorrelationId** | **String** | Id that you define which is used for error handling/responses.This data field is used while POSTING multiple IN_PROGRESS workers |  [optional] |



## Enum: WorkerTypeEnum

| Name | Value |
|---- | -----|
| EMPLOYEE | &quot;EMPLOYEE&quot; |
| CONTRACTOR | &quot;CONTRACTOR&quot; |
| INDEPENDENT_CONTRACTOR | &quot;INDEPENDENT_CONTRACTOR&quot; |



## Enum: EmploymentTypeEnum

| Name | Value |
|---- | -----|
| FULL_TIME | &quot;FULL_TIME&quot; |
| PART_TIME | &quot;PART_TIME&quot; |



## Enum: ExemptionTypeEnum

| Name | Value |
|---- | -----|
| EXEMPT | &quot;EXEMPT&quot; |
| NON_EXEMPT | &quot;NON_EXEMPT&quot; |



## Enum: SexEnum

| Name | Value |
|---- | -----|
| MALE | &quot;MALE&quot; |
| FEMALE | &quot;FEMALE&quot; |
| NOT_SPECIFIED | &quot;NOT_SPECIFIED&quot; |



