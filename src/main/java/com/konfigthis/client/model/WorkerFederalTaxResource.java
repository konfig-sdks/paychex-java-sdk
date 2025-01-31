/*
 * External API
 *   # Developer Resources  Refer [Developer Resources](https://developer.paychex.com/resources/overview/) for more details on API specification 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * The representational state of the a worker&#39;s federal tax setup.
 */
@ApiModel(description = "The representational state of the a worker's federal tax setup.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WorkerFederalTaxResource {
  public static final String SERIALIZED_NAME_TAX_ID = "taxId";
  @SerializedName(SERIALIZED_NAME_TAX_ID)
  private String taxId;

  /**
   * Filing status.
   */
  @JsonAdapter(FilingStatusEnum.Adapter.class)
 public enum FilingStatusEnum {
    SINGLE_OR_MARRIED_FILING_SEPARATELY("SINGLE_OR_MARRIED_FILING_SEPARATELY"),
    
    MARRIED_FILING_JOINTLY("MARRIED_FILING_JOINTLY"),
    
    HEAD_OF_HOUSEHOLD("HEAD_OF_HOUSEHOLD");

    private String value;

    FilingStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FilingStatusEnum fromValue(String value) {
      for (FilingStatusEnum b : FilingStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FilingStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FilingStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FilingStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FilingStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FILING_STATUS = "filingStatus";
  @SerializedName(SERIALIZED_NAME_FILING_STATUS)
  private FilingStatusEnum filingStatus;

  /**
   * See federal W-4 instructions.
   */
  @JsonAdapter(MultipleJobsEnum.Adapter.class)
 public enum MultipleJobsEnum {
    TRUE("true"),
    
    FALSE("false");

    private String value;

    MultipleJobsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MultipleJobsEnum fromValue(String value) {
      for (MultipleJobsEnum b : MultipleJobsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MultipleJobsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MultipleJobsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MultipleJobsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MultipleJobsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MULTIPLE_JOBS = "multipleJobs";
  @SerializedName(SERIALIZED_NAME_MULTIPLE_JOBS)
  private MultipleJobsEnum multipleJobs;

  public static final String SERIALIZED_NAME_DEPENDENTS_AMOUNT = "dependentsAmount";
  @SerializedName(SERIALIZED_NAME_DEPENDENTS_AMOUNT)
  private String dependentsAmount;

  public static final String SERIALIZED_NAME_OTHER_INCOME = "otherIncome";
  @SerializedName(SERIALIZED_NAME_OTHER_INCOME)
  private String otherIncome;

  public static final String SERIALIZED_NAME_DEDUCTIONS_AMOUNT = "deductionsAmount";
  @SerializedName(SERIALIZED_NAME_DEDUCTIONS_AMOUNT)
  private String deductionsAmount;

  public static final String SERIALIZED_NAME_EXTRA_WITHHOLDING_AMOUNT = "extraWithholdingAmount";
  @SerializedName(SERIALIZED_NAME_EXTRA_WITHHOLDING_AMOUNT)
  private String extraWithholdingAmount;

  /**
   * Should federal taxes be withheld.
   */
  @JsonAdapter(TaxesWithheldEnum.Adapter.class)
 public enum TaxesWithheldEnum {
    TRUE_FEDERAL_TAXES_WITHHELD("true = Federal taxes withheld"),
    
    FALSE_FEDERAL_TAXES_ARE_NOT_WITHHELD_EARNINGS_WILL_BE_REPORTED_TO_STATE_AND_FEDERAL_AGENCIES_("false = Federal taxes are NOT withheld. Earnings will be reported to state and federal agencies.");

    private String value;

    TaxesWithheldEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TaxesWithheldEnum fromValue(String value) {
      for (TaxesWithheldEnum b : TaxesWithheldEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TaxesWithheldEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TaxesWithheldEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TaxesWithheldEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TaxesWithheldEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TAXES_WITHHELD = "taxesWithheld";
  @SerializedName(SERIALIZED_NAME_TAXES_WITHHELD)
  private TaxesWithheldEnum taxesWithheld;

  public WorkerFederalTaxResource() {
  }

  
  public WorkerFederalTaxResource(
     String taxId
  ) {
    this();
    this.taxId = taxId;
  }

   /**
   * The ID for the federal tax item.
   * @return taxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3520000118851387", value = "The ID for the federal tax item.")

  public String getTaxId() {
    return taxId;
  }




  public WorkerFederalTaxResource filingStatus(FilingStatusEnum filingStatus) {
    
    
    
    
    this.filingStatus = filingStatus;
    return this;
  }

   /**
   * Filing status.
   * @return filingStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MARRIED_FILING_JOINTLY", value = "Filing status.")

  public FilingStatusEnum getFilingStatus() {
    return filingStatus;
  }


  public void setFilingStatus(FilingStatusEnum filingStatus) {
    
    
    
    this.filingStatus = filingStatus;
  }


  public WorkerFederalTaxResource multipleJobs(MultipleJobsEnum multipleJobs) {
    
    
    
    
    this.multipleJobs = multipleJobs;
    return this;
  }

   /**
   * See federal W-4 instructions.
   * @return multipleJobs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FALSE", value = "See federal W-4 instructions.")

  public MultipleJobsEnum getMultipleJobs() {
    return multipleJobs;
  }


  public void setMultipleJobs(MultipleJobsEnum multipleJobs) {
    
    
    
    this.multipleJobs = multipleJobs;
  }


  public WorkerFederalTaxResource dependentsAmount(String dependentsAmount) {
    
    
    
    
    this.dependentsAmount = dependentsAmount;
    return this;
  }

   /**
   * See federal W-4 instructions.
   * @return dependentsAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123.45", value = "See federal W-4 instructions.")

  public String getDependentsAmount() {
    return dependentsAmount;
  }


  public void setDependentsAmount(String dependentsAmount) {
    
    
    
    this.dependentsAmount = dependentsAmount;
  }


  public WorkerFederalTaxResource otherIncome(String otherIncome) {
    
    
    
    
    this.otherIncome = otherIncome;
    return this;
  }

   /**
   * See federal W-4 instructions.
   * @return otherIncome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "23.45", value = "See federal W-4 instructions.")

  public String getOtherIncome() {
    return otherIncome;
  }


  public void setOtherIncome(String otherIncome) {
    
    
    
    this.otherIncome = otherIncome;
  }


  public WorkerFederalTaxResource deductionsAmount(String deductionsAmount) {
    
    
    
    
    this.deductionsAmount = deductionsAmount;
    return this;
  }

   /**
   * See federal W-4 instructions.
   * @return deductionsAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.45", value = "See federal W-4 instructions.")

  public String getDeductionsAmount() {
    return deductionsAmount;
  }


  public void setDeductionsAmount(String deductionsAmount) {
    
    
    
    this.deductionsAmount = deductionsAmount;
  }


  public WorkerFederalTaxResource extraWithholdingAmount(String extraWithholdingAmount) {
    
    
    
    
    this.extraWithholdingAmount = extraWithholdingAmount;
    return this;
  }

   /**
   * Additional tax you want withheld each pay period.
   * @return extraWithholdingAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.45", value = "Additional tax you want withheld each pay period.")

  public String getExtraWithholdingAmount() {
    return extraWithholdingAmount;
  }


  public void setExtraWithholdingAmount(String extraWithholdingAmount) {
    
    
    
    this.extraWithholdingAmount = extraWithholdingAmount;
  }


  public WorkerFederalTaxResource taxesWithheld(TaxesWithheldEnum taxesWithheld) {
    
    
    
    
    this.taxesWithheld = taxesWithheld;
    return this;
  }

   /**
   * Should federal taxes be withheld.
   * @return taxesWithheld
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Should federal taxes be withheld.")

  public TaxesWithheldEnum getTaxesWithheld() {
    return taxesWithheld;
  }


  public void setTaxesWithheld(TaxesWithheldEnum taxesWithheld) {
    
    
    
    this.taxesWithheld = taxesWithheld;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the WorkerFederalTaxResource instance itself
   */
  public WorkerFederalTaxResource putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkerFederalTaxResource workerFederalTaxResource = (WorkerFederalTaxResource) o;
    return Objects.equals(this.taxId, workerFederalTaxResource.taxId) &&
        Objects.equals(this.filingStatus, workerFederalTaxResource.filingStatus) &&
        Objects.equals(this.multipleJobs, workerFederalTaxResource.multipleJobs) &&
        Objects.equals(this.dependentsAmount, workerFederalTaxResource.dependentsAmount) &&
        Objects.equals(this.otherIncome, workerFederalTaxResource.otherIncome) &&
        Objects.equals(this.deductionsAmount, workerFederalTaxResource.deductionsAmount) &&
        Objects.equals(this.extraWithholdingAmount, workerFederalTaxResource.extraWithholdingAmount) &&
        Objects.equals(this.taxesWithheld, workerFederalTaxResource.taxesWithheld)&&
        Objects.equals(this.additionalProperties, workerFederalTaxResource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxId, filingStatus, multipleJobs, dependentsAmount, otherIncome, deductionsAmount, extraWithholdingAmount, taxesWithheld, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkerFederalTaxResource {\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    filingStatus: ").append(toIndentedString(filingStatus)).append("\n");
    sb.append("    multipleJobs: ").append(toIndentedString(multipleJobs)).append("\n");
    sb.append("    dependentsAmount: ").append(toIndentedString(dependentsAmount)).append("\n");
    sb.append("    otherIncome: ").append(toIndentedString(otherIncome)).append("\n");
    sb.append("    deductionsAmount: ").append(toIndentedString(deductionsAmount)).append("\n");
    sb.append("    extraWithholdingAmount: ").append(toIndentedString(extraWithholdingAmount)).append("\n");
    sb.append("    taxesWithheld: ").append(toIndentedString(taxesWithheld)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("taxId");
    openapiFields.add("filingStatus");
    openapiFields.add("multipleJobs");
    openapiFields.add("dependentsAmount");
    openapiFields.add("otherIncome");
    openapiFields.add("deductionsAmount");
    openapiFields.add("extraWithholdingAmount");
    openapiFields.add("taxesWithheld");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkerFederalTaxResource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkerFederalTaxResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkerFederalTaxResource is not found in the empty JSON string", WorkerFederalTaxResource.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("taxId") != null && !jsonObj.get("taxId").isJsonNull()) && !jsonObj.get("taxId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxId").toString()));
      }
      if ((jsonObj.get("filingStatus") != null && !jsonObj.get("filingStatus").isJsonNull()) && !jsonObj.get("filingStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filingStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filingStatus").toString()));
      }
      if ((jsonObj.get("multipleJobs") != null && !jsonObj.get("multipleJobs").isJsonNull()) && !jsonObj.get("multipleJobs").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `multipleJobs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("multipleJobs").toString()));
      }
      if ((jsonObj.get("dependentsAmount") != null && !jsonObj.get("dependentsAmount").isJsonNull()) && !jsonObj.get("dependentsAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dependentsAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dependentsAmount").toString()));
      }
      if ((jsonObj.get("otherIncome") != null && !jsonObj.get("otherIncome").isJsonNull()) && !jsonObj.get("otherIncome").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `otherIncome` to be a primitive type in the JSON string but got `%s`", jsonObj.get("otherIncome").toString()));
      }
      if ((jsonObj.get("deductionsAmount") != null && !jsonObj.get("deductionsAmount").isJsonNull()) && !jsonObj.get("deductionsAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deductionsAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deductionsAmount").toString()));
      }
      if ((jsonObj.get("extraWithholdingAmount") != null && !jsonObj.get("extraWithholdingAmount").isJsonNull()) && !jsonObj.get("extraWithholdingAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extraWithholdingAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extraWithholdingAmount").toString()));
      }
      if ((jsonObj.get("taxesWithheld") != null && !jsonObj.get("taxesWithheld").isJsonNull()) && !jsonObj.get("taxesWithheld").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxesWithheld` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxesWithheld").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkerFederalTaxResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkerFederalTaxResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkerFederalTaxResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkerFederalTaxResource.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkerFederalTaxResource>() {
           @Override
           public void write(JsonWriter out, WorkerFederalTaxResource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkerFederalTaxResource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WorkerFederalTaxResource instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkerFederalTaxResource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkerFederalTaxResource
  * @throws IOException if the JSON string is invalid with respect to WorkerFederalTaxResource
  */
  public static WorkerFederalTaxResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkerFederalTaxResource.class);
  }

 /**
  * Convert an instance of WorkerFederalTaxResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

