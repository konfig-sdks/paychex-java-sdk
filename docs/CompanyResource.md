

# CompanyResource

The state representation of a company

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**companyId** | **String** | The unique identifier associated with this companies representation. |  [optional] |
|**displayId** | **String** | The client account number used for identification purposes. (no dash or spaces allowed, only the last 8 characters  of the ID) |  [optional] |
|**legalName** | **String** | The legal name of the company. |  [optional] |
|**legalId** | [**LegalIdResource**](LegalIdResource.md) |  |  [optional] |
|**communications** | [**List&lt;CommunicationResource&gt;**](CommunicationResource.md) |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



