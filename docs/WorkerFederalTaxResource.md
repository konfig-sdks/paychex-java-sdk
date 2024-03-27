

# WorkerFederalTaxResource

The representational state of the a worker's federal tax setup.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**taxId** | **String** | The ID for the federal tax item. |  [optional] [readonly] |
|**filingStatus** | [**FilingStatusEnum**](#FilingStatusEnum) | Filing status. |  [optional] |
|**multipleJobs** | [**MultipleJobsEnum**](#MultipleJobsEnum) | See federal W-4 instructions. |  [optional] |
|**dependentsAmount** | **String** | See federal W-4 instructions. |  [optional] |
|**otherIncome** | **String** | See federal W-4 instructions. |  [optional] |
|**deductionsAmount** | **String** | See federal W-4 instructions. |  [optional] |
|**extraWithholdingAmount** | **String** | Additional tax you want withheld each pay period. |  [optional] |
|**taxesWithheld** | [**TaxesWithheldEnum**](#TaxesWithheldEnum) | Should federal taxes be withheld. |  [optional] |



## Enum: FilingStatusEnum

| Name | Value |
|---- | -----|
| SINGLE_OR_MARRIED_FILING_SEPARATELY | &quot;SINGLE_OR_MARRIED_FILING_SEPARATELY&quot; |
| MARRIED_FILING_JOINTLY | &quot;MARRIED_FILING_JOINTLY&quot; |
| HEAD_OF_HOUSEHOLD | &quot;HEAD_OF_HOUSEHOLD&quot; |



## Enum: MultipleJobsEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: TaxesWithheldEnum

| Name | Value |
|---- | -----|
| TRUE_FEDERAL_TAXES_WITHHELD | &quot;true &#x3D; Federal taxes withheld&quot; |
| FALSE_FEDERAL_TAXES_ARE_NOT_WITHHELD_EARNINGS_WILL_BE_REPORTED_TO_STATE_AND_FEDERAL_AGENCIES_ | &quot;false &#x3D; Federal taxes are NOT withheld. Earnings will be reported to state and federal agencies.&quot; |



