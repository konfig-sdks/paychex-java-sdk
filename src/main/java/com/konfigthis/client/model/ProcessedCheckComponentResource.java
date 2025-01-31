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
import com.konfigthis.client.model.OrganizationResource2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * ProcessedCheckComponentResource
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProcessedCheckComponentResource {
  public static final String SERIALIZED_NAME_COMPONENT_ID = "componentId";
  @SerializedName(SERIALIZED_NAME_COMPONENT_ID)
  private String componentId;

  public static final String SERIALIZED_NAME_CHECK_COMPONENT_ID = "checkComponentId";
  @SerializedName(SERIALIZED_NAME_CHECK_COMPONENT_ID)
  private String checkComponentId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CLASSIFICATION_TYPE = "classificationType";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATION_TYPE)
  private String classificationType;

  /**
   * Gets or Sets effectOnPay
   */
  @JsonAdapter(EffectOnPayEnum.Adapter.class)
 public enum EffectOnPayEnum {
    ADDITION("ADDITION"),
    
    ADDITION_WITH_IN_OUT("ADDITION_WITH_IN_OUT"),
    
    EMPLOYER_INFORMATIONAL("EMPLOYER_INFORMATIONAL"),
    
    REDUCTION("REDUCTION");

    private String value;

    EffectOnPayEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EffectOnPayEnum fromValue(String value) {
      for (EffectOnPayEnum b : EffectOnPayEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EffectOnPayEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EffectOnPayEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EffectOnPayEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EffectOnPayEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EFFECT_ON_PAY = "effectOnPay";
  @SerializedName(SERIALIZED_NAME_EFFECT_ON_PAY)
  private EffectOnPayEnum effectOnPay;

  public static final String SERIALIZED_NAME_MEMOED = "memoed";
  @SerializedName(SERIALIZED_NAME_MEMOED)
  private Boolean memoed;

  public static final String SERIALIZED_NAME_LABOR_ASSIGNMENT_ID = "laborAssignmentId";
  @SerializedName(SERIALIZED_NAME_LABOR_ASSIGNMENT_ID)
  private String laborAssignmentId;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private OrganizationResource2 organization;

  public static final String SERIALIZED_NAME_JOB_NAME = "jobName";
  @SerializedName(SERIALIZED_NAME_JOB_NAME)
  private String jobName;

  public static final String SERIALIZED_NAME_JOB_ID = "jobId";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private String jobId;

  public static final String SERIALIZED_NAME_PAID_BY = "paidBy";
  @SerializedName(SERIALIZED_NAME_PAID_BY)
  private String paidBy;

  public static final String SERIALIZED_NAME_LINE_DATE = "lineDate";
  @SerializedName(SERIALIZED_NAME_LINE_DATE)
  private OffsetDateTime lineDate;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private String rate;

  public static final String SERIALIZED_NAME_HOURS = "hours";
  @SerializedName(SERIALIZED_NAME_HOURS)
  private String hours;

  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private String units;

  public ProcessedCheckComponentResource() {
  }

  public ProcessedCheckComponentResource componentId(String componentId) {
    
    
    
    
    this.componentId = componentId;
    return this;
  }

   /**
   * Get componentId
   * @return componentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getComponentId() {
    return componentId;
  }


  public void setComponentId(String componentId) {
    
    
    
    this.componentId = componentId;
  }


  public ProcessedCheckComponentResource checkComponentId(String checkComponentId) {
    
    
    
    
    this.checkComponentId = checkComponentId;
    return this;
  }

   /**
   * Get checkComponentId
   * @return checkComponentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCheckComponentId() {
    return checkComponentId;
  }


  public void setCheckComponentId(String checkComponentId) {
    
    
    
    this.checkComponentId = checkComponentId;
  }


  public ProcessedCheckComponentResource name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public ProcessedCheckComponentResource classificationType(String classificationType) {
    
    
    
    
    this.classificationType = classificationType;
    return this;
  }

   /**
   * Get classificationType
   * @return classificationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClassificationType() {
    return classificationType;
  }


  public void setClassificationType(String classificationType) {
    
    
    
    this.classificationType = classificationType;
  }


  public ProcessedCheckComponentResource effectOnPay(EffectOnPayEnum effectOnPay) {
    
    
    
    
    this.effectOnPay = effectOnPay;
    return this;
  }

   /**
   * Get effectOnPay
   * @return effectOnPay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EffectOnPayEnum getEffectOnPay() {
    return effectOnPay;
  }


  public void setEffectOnPay(EffectOnPayEnum effectOnPay) {
    
    
    
    this.effectOnPay = effectOnPay;
  }


  public ProcessedCheckComponentResource memoed(Boolean memoed) {
    
    
    
    
    this.memoed = memoed;
    return this;
  }

   /**
   * Get memoed
   * @return memoed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMemoed() {
    return memoed;
  }


  public void setMemoed(Boolean memoed) {
    
    
    
    this.memoed = memoed;
  }


  public ProcessedCheckComponentResource laborAssignmentId(String laborAssignmentId) {
    
    
    
    
    this.laborAssignmentId = laborAssignmentId;
    return this;
  }

   /**
   * Get laborAssignmentId
   * @return laborAssignmentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLaborAssignmentId() {
    return laborAssignmentId;
  }


  public void setLaborAssignmentId(String laborAssignmentId) {
    
    
    
    this.laborAssignmentId = laborAssignmentId;
  }


  public ProcessedCheckComponentResource organization(OrganizationResource2 organization) {
    
    
    
    
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrganizationResource2 getOrganization() {
    return organization;
  }


  public void setOrganization(OrganizationResource2 organization) {
    
    
    
    this.organization = organization;
  }


  public ProcessedCheckComponentResource jobName(String jobName) {
    
    
    
    
    this.jobName = jobName;
    return this;
  }

   /**
   * Get jobName
   * @return jobName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJobName() {
    return jobName;
  }


  public void setJobName(String jobName) {
    
    
    
    this.jobName = jobName;
  }


  public ProcessedCheckComponentResource jobId(String jobId) {
    
    
    
    
    this.jobId = jobId;
    return this;
  }

   /**
   * Get jobId
   * @return jobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJobId() {
    return jobId;
  }


  public void setJobId(String jobId) {
    
    
    
    this.jobId = jobId;
  }


  public ProcessedCheckComponentResource paidBy(String paidBy) {
    
    
    
    
    this.paidBy = paidBy;
    return this;
  }

   /**
   * Get paidBy
   * @return paidBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPaidBy() {
    return paidBy;
  }


  public void setPaidBy(String paidBy) {
    
    
    
    this.paidBy = paidBy;
  }


  public ProcessedCheckComponentResource lineDate(OffsetDateTime lineDate) {
    
    
    
    
    this.lineDate = lineDate;
    return this;
  }

   /**
   * Get lineDate
   * @return lineDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLineDate() {
    return lineDate;
  }


  public void setLineDate(OffsetDateTime lineDate) {
    
    
    
    this.lineDate = lineDate;
  }


  public ProcessedCheckComponentResource amount(String amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    
    
    
    this.amount = amount;
  }


  public ProcessedCheckComponentResource rate(String rate) {
    
    
    
    
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRate() {
    return rate;
  }


  public void setRate(String rate) {
    
    
    
    this.rate = rate;
  }


  public ProcessedCheckComponentResource hours(String hours) {
    
    
    
    
    this.hours = hours;
    return this;
  }

   /**
   * Get hours
   * @return hours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHours() {
    return hours;
  }


  public void setHours(String hours) {
    
    
    
    this.hours = hours;
  }


  public ProcessedCheckComponentResource units(String units) {
    
    
    
    
    this.units = units;
    return this;
  }

   /**
   * Get units
   * @return units
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUnits() {
    return units;
  }


  public void setUnits(String units) {
    
    
    
    this.units = units;
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
   * @return the ProcessedCheckComponentResource instance itself
   */
  public ProcessedCheckComponentResource putAdditionalProperty(String key, Object value) {
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
    ProcessedCheckComponentResource processedCheckComponentResource = (ProcessedCheckComponentResource) o;
    return Objects.equals(this.componentId, processedCheckComponentResource.componentId) &&
        Objects.equals(this.checkComponentId, processedCheckComponentResource.checkComponentId) &&
        Objects.equals(this.name, processedCheckComponentResource.name) &&
        Objects.equals(this.classificationType, processedCheckComponentResource.classificationType) &&
        Objects.equals(this.effectOnPay, processedCheckComponentResource.effectOnPay) &&
        Objects.equals(this.memoed, processedCheckComponentResource.memoed) &&
        Objects.equals(this.laborAssignmentId, processedCheckComponentResource.laborAssignmentId) &&
        Objects.equals(this.organization, processedCheckComponentResource.organization) &&
        Objects.equals(this.jobName, processedCheckComponentResource.jobName) &&
        Objects.equals(this.jobId, processedCheckComponentResource.jobId) &&
        Objects.equals(this.paidBy, processedCheckComponentResource.paidBy) &&
        Objects.equals(this.lineDate, processedCheckComponentResource.lineDate) &&
        Objects.equals(this.amount, processedCheckComponentResource.amount) &&
        Objects.equals(this.rate, processedCheckComponentResource.rate) &&
        Objects.equals(this.hours, processedCheckComponentResource.hours) &&
        Objects.equals(this.units, processedCheckComponentResource.units)&&
        Objects.equals(this.additionalProperties, processedCheckComponentResource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentId, checkComponentId, name, classificationType, effectOnPay, memoed, laborAssignmentId, organization, jobName, jobId, paidBy, lineDate, amount, rate, hours, units, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessedCheckComponentResource {\n");
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    checkComponentId: ").append(toIndentedString(checkComponentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    classificationType: ").append(toIndentedString(classificationType)).append("\n");
    sb.append("    effectOnPay: ").append(toIndentedString(effectOnPay)).append("\n");
    sb.append("    memoed: ").append(toIndentedString(memoed)).append("\n");
    sb.append("    laborAssignmentId: ").append(toIndentedString(laborAssignmentId)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    paidBy: ").append(toIndentedString(paidBy)).append("\n");
    sb.append("    lineDate: ").append(toIndentedString(lineDate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
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
    openapiFields.add("componentId");
    openapiFields.add("checkComponentId");
    openapiFields.add("name");
    openapiFields.add("classificationType");
    openapiFields.add("effectOnPay");
    openapiFields.add("memoed");
    openapiFields.add("laborAssignmentId");
    openapiFields.add("organization");
    openapiFields.add("jobName");
    openapiFields.add("jobId");
    openapiFields.add("paidBy");
    openapiFields.add("lineDate");
    openapiFields.add("amount");
    openapiFields.add("rate");
    openapiFields.add("hours");
    openapiFields.add("units");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProcessedCheckComponentResource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProcessedCheckComponentResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProcessedCheckComponentResource is not found in the empty JSON string", ProcessedCheckComponentResource.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("componentId") != null && !jsonObj.get("componentId").isJsonNull()) && !jsonObj.get("componentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `componentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("componentId").toString()));
      }
      if ((jsonObj.get("checkComponentId") != null && !jsonObj.get("checkComponentId").isJsonNull()) && !jsonObj.get("checkComponentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checkComponentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkComponentId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("classificationType") != null && !jsonObj.get("classificationType").isJsonNull()) && !jsonObj.get("classificationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `classificationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("classificationType").toString()));
      }
      if ((jsonObj.get("effectOnPay") != null && !jsonObj.get("effectOnPay").isJsonNull()) && !jsonObj.get("effectOnPay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effectOnPay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effectOnPay").toString()));
      }
      if ((jsonObj.get("laborAssignmentId") != null && !jsonObj.get("laborAssignmentId").isJsonNull()) && !jsonObj.get("laborAssignmentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `laborAssignmentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("laborAssignmentId").toString()));
      }
      // validate the optional field `organization`
      if (jsonObj.get("organization") != null && !jsonObj.get("organization").isJsonNull()) {
        OrganizationResource2.validateJsonObject(jsonObj.getAsJsonObject("organization"));
      }
      if ((jsonObj.get("jobName") != null && !jsonObj.get("jobName").isJsonNull()) && !jsonObj.get("jobName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jobName").toString()));
      }
      if ((jsonObj.get("jobId") != null && !jsonObj.get("jobId").isJsonNull()) && !jsonObj.get("jobId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jobId").toString()));
      }
      if ((jsonObj.get("paidBy") != null && !jsonObj.get("paidBy").isJsonNull()) && !jsonObj.get("paidBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paidBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paidBy").toString()));
      }
      if ((jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if ((jsonObj.get("rate") != null && !jsonObj.get("rate").isJsonNull()) && !jsonObj.get("rate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rate").toString()));
      }
      if ((jsonObj.get("hours") != null && !jsonObj.get("hours").isJsonNull()) && !jsonObj.get("hours").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hours` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hours").toString()));
      }
      if ((jsonObj.get("units") != null && !jsonObj.get("units").isJsonNull()) && !jsonObj.get("units").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `units` to be a primitive type in the JSON string but got `%s`", jsonObj.get("units").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProcessedCheckComponentResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProcessedCheckComponentResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProcessedCheckComponentResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProcessedCheckComponentResource.class));

       return (TypeAdapter<T>) new TypeAdapter<ProcessedCheckComponentResource>() {
           @Override
           public void write(JsonWriter out, ProcessedCheckComponentResource value) throws IOException {
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
           public ProcessedCheckComponentResource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProcessedCheckComponentResource instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProcessedCheckComponentResource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProcessedCheckComponentResource
  * @throws IOException if the JSON string is invalid with respect to ProcessedCheckComponentResource
  */
  public static ProcessedCheckComponentResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProcessedCheckComponentResource.class);
  }

 /**
  * Convert an instance of ProcessedCheckComponentResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

