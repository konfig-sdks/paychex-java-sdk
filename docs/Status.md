

# Status

The workers employment status information. This data field cannot be POSTED and PATCHED for IN_PROGRESS worker.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**workerStatusId** | **String** | The unique identifier associated with this status representation. |  [optional] |
|**statusType** | [**StatusTypeEnum**](#StatusTypeEnum) | The workers current status. |  [optional] |
|**statusReason** | **String** | The detailed reason of the workers current status. |  [optional] |



## Enum: StatusTypeEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| TERMINATED | &quot;TERMINATED&quot; |
| PENDING | &quot;PENDING&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |



