

# RelationshipResource

The relationship for this worker contract. Required for POST contacts.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**relationshipId** | **String** | The ID for the workers relationship to contact. |  [optional] |
|**relationWeid** | **String** | The ID for the workers specific relation. |  [optional] |
|**relationshipType** | [**RelationTypeResource1**](RelationTypeResource1.md) |  |  [optional] |
|**primary** | **Boolean** | Where to indicate if the contact is selected as Primary, where true &#x3D; Primary contact and false &#x3D; not Primary contact. |  [optional] |
|**person** | [**PersonResource**](PersonResource.md) |  |  [optional] |
|**entity** | [**EntityResource**](EntityResource.md) |  |  [optional] |



