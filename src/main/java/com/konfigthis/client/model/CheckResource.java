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
import com.konfigthis.client.model.Link;
import com.konfigthis.client.model.PayComponentResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * The state representation of Labor Assignments within a company.
 */
@ApiModel(description = "The state representation of Labor Assignments within a company.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CheckResource {
  public static final String SERIALIZED_NAME_WORKER_ID = "workerId";
  @SerializedName(SERIALIZED_NAME_WORKER_ID)
  private String workerId;

  public static final String SERIALIZED_NAME_PAYCHECK_ID = "paycheckId";
  @SerializedName(SERIALIZED_NAME_PAYCHECK_ID)
  private String paycheckId;

  public static final String SERIALIZED_NAME_PAY_PERIOD_ID = "payPeriodId";
  @SerializedName(SERIALIZED_NAME_PAY_PERIOD_ID)
  private String payPeriodId;

  public static final String SERIALIZED_NAME_CHECK_CORRELATION_ID = "checkCorrelationId";
  @SerializedName(SERIALIZED_NAME_CHECK_CORRELATION_ID)
  private String checkCorrelationId;

  public static final String SERIALIZED_NAME_BLOCK_AUTO_DISTRIBUTION = "blockAutoDistribution";
  @SerializedName(SERIALIZED_NAME_BLOCK_AUTO_DISTRIBUTION)
  private Boolean blockAutoDistribution;

  public static final String SERIALIZED_NAME_EARNINGS = "earnings";
  @SerializedName(SERIALIZED_NAME_EARNINGS)
  private List<PayComponentResource> earnings = null;

  public static final String SERIALIZED_NAME_DEDUCTIONS = "deductions";
  @SerializedName(SERIALIZED_NAME_DEDUCTIONS)
  private List<PayComponentResource> deductions = null;

  public static final String SERIALIZED_NAME_CHECK_DATE = "checkDate";
  @SerializedName(SERIALIZED_NAME_CHECK_DATE)
  private String checkDate;

  public static final String SERIALIZED_NAME_INFORMATIONAL = "informational";
  @SerializedName(SERIALIZED_NAME_INFORMATIONAL)
  private List<PayComponentResource> informational = null;

  public static final String SERIALIZED_NAME_TAXES = "taxes";
  @SerializedName(SERIALIZED_NAME_TAXES)
  private List<PayComponentResource> taxes = null;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;

  public CheckResource() {
  }

  
  public CheckResource(
     String paycheckId
  ) {
    this();
    this.paycheckId = paycheckId;
  }

  public CheckResource workerId(String workerId) {
    
    
    
    
    this.workerId = workerId;
    return this;
  }

   /**
   * The id assigned to the worker.
   * @return workerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "004UWBZQJ7GEB9TVWFR9", value = "The id assigned to the worker.")

  public String getWorkerId() {
    return workerId;
  }


  public void setWorkerId(String workerId) {
    
    
    
    this.workerId = workerId;
  }


   /**
   * The id of a single check that a workers has.
   * @return paycheckId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1020026552555444", value = "The id of a single check that a workers has.")

  public String getPaycheckId() {
    return paycheckId;
  }




  public CheckResource payPeriodId(String payPeriodId) {
    
    
    
    
    this.payPeriodId = payPeriodId;
    return this;
  }

   /**
   * The id for the unprocessed payperiod. 
   * @return payPeriodId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1020026427391732", value = "The id for the unprocessed payperiod. ")

  public String getPayPeriodId() {
    return payPeriodId;
  }


  public void setPayPeriodId(String payPeriodId) {
    
    
    
    this.payPeriodId = payPeriodId;
  }


  public CheckResource checkCorrelationId(String checkCorrelationId) {
    
    
    
    
    this.checkCorrelationId = checkCorrelationId;
    return this;
  }

   /**
   * Id that you define which is used for error handling/responses. This is not required when sending a single check.
   * @return checkCorrelationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id that you define which is used for error handling/responses. This is not required when sending a single check.")

  public String getCheckCorrelationId() {
    return checkCorrelationId;
  }


  public void setCheckCorrelationId(String checkCorrelationId) {
    
    
    
    this.checkCorrelationId = checkCorrelationId;
  }


  public CheckResource blockAutoDistribution(Boolean blockAutoDistribution) {
    
    
    
    
    this.blockAutoDistribution = blockAutoDistribution;
    return this;
  }

   /**
   * This is used optionally for blocking the auto distribution of the earnings on the workers if they are setup for auto distribution.
   * @return blockAutoDistribution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "This is used optionally for blocking the auto distribution of the earnings on the workers if they are setup for auto distribution.")

  public Boolean getBlockAutoDistribution() {
    return blockAutoDistribution;
  }


  public void setBlockAutoDistribution(Boolean blockAutoDistribution) {
    
    
    
    this.blockAutoDistribution = blockAutoDistribution;
  }


  public CheckResource earnings(List<PayComponentResource> earnings) {
    
    
    
    
    this.earnings = earnings;
    return this;
  }

  public CheckResource addEarningsItem(PayComponentResource earningsItem) {
    if (this.earnings == null) {
      this.earnings = new ArrayList<>();
    }
    this.earnings.add(earningsItem);
    return this;
  }

   /**
   * The earnings to apply to the check.Each earning needs to define as one of the following:1 .payHours: Will use the default hourly rate defined on the worker to apply the hours against. 2. payHours and payRate: Will allow you to define the monetary rate that the hours will be applied against. 3. payHours and payRateId: Will allow you to define which workers predefined pay rate the hours will be applied against. 4. payUnits: Will use the default hourly rate defined on the worker to apply the units against. 5. payUnits and payRate: Will allow you to define the monetary rate that the units will be applied against. 6. payUnits and payRateId: Will allow you to define which workers predefined pay rate the units will be applied against. 7. payAmount: Will allow you to define straight monetary amount.
   * @return earnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The earnings to apply to the check.Each earning needs to define as one of the following:1 .payHours: Will use the default hourly rate defined on the worker to apply the hours against. 2. payHours and payRate: Will allow you to define the monetary rate that the hours will be applied against. 3. payHours and payRateId: Will allow you to define which workers predefined pay rate the hours will be applied against. 4. payUnits: Will use the default hourly rate defined on the worker to apply the units against. 5. payUnits and payRate: Will allow you to define the monetary rate that the units will be applied against. 6. payUnits and payRateId: Will allow you to define which workers predefined pay rate the units will be applied against. 7. payAmount: Will allow you to define straight monetary amount.")

  public List<PayComponentResource> getEarnings() {
    return earnings;
  }


  public void setEarnings(List<PayComponentResource> earnings) {
    
    
    
    this.earnings = earnings;
  }


  public CheckResource deductions(List<PayComponentResource> deductions) {
    
    
    
    
    this.deductions = deductions;
    return this;
  }

  public CheckResource addDeductionsItem(PayComponentResource deductionsItem) {
    if (this.deductions == null) {
      this.deductions = new ArrayList<>();
    }
    this.deductions.add(deductionsItem);
    return this;
  }

   /**
   * Deduction pay components on the check.
   * @return deductions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deduction pay components on the check.")

  public List<PayComponentResource> getDeductions() {
    return deductions;
  }


  public void setDeductions(List<PayComponentResource> deductions) {
    
    
    
    this.deductions = deductions;
  }


  public CheckResource checkDate(String checkDate) {
    
    
    
    
    this.checkDate = checkDate;
    return this;
  }

   /**
   * The check date 
   * @return checkDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-05-12T20:00:00Z", value = "The check date ")

  public String getCheckDate() {
    return checkDate;
  }


  public void setCheckDate(String checkDate) {
    
    
    
    this.checkDate = checkDate;
  }


  public CheckResource informational(List<PayComponentResource> informational) {
    
    
    
    
    this.informational = informational;
    return this;
  }

  public CheckResource addInformationalItem(PayComponentResource informationalItem) {
    if (this.informational == null) {
      this.informational = new ArrayList<>();
    }
    this.informational.add(informationalItem);
    return this;
  }

   /**
   * Informational pay components on the check.
   * @return informational
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Informational pay components on the check.")

  public List<PayComponentResource> getInformational() {
    return informational;
  }


  public void setInformational(List<PayComponentResource> informational) {
    
    
    
    this.informational = informational;
  }


  public CheckResource taxes(List<PayComponentResource> taxes) {
    
    
    
    
    this.taxes = taxes;
    return this;
  }

  public CheckResource addTaxesItem(PayComponentResource taxesItem) {
    if (this.taxes == null) {
      this.taxes = new ArrayList<>();
    }
    this.taxes.add(taxesItem);
    return this;
  }

   /**
   * Tax pay components on the check.
   * @return taxes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tax pay components on the check.")

  public List<PayComponentResource> getTaxes() {
    return taxes;
  }


  public void setTaxes(List<PayComponentResource> taxes) {
    
    
    
    this.taxes = taxes;
  }


  public CheckResource links(List<Link> links) {
    
    
    
    
    this.links = links;
    return this;
  }

  public CheckResource addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Link> getLinks() {
    return links;
  }


  public void setLinks(List<Link> links) {
    
    
    
    this.links = links;
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
   * @return the CheckResource instance itself
   */
  public CheckResource putAdditionalProperty(String key, Object value) {
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
    CheckResource checkResource = (CheckResource) o;
    return Objects.equals(this.workerId, checkResource.workerId) &&
        Objects.equals(this.paycheckId, checkResource.paycheckId) &&
        Objects.equals(this.payPeriodId, checkResource.payPeriodId) &&
        Objects.equals(this.checkCorrelationId, checkResource.checkCorrelationId) &&
        Objects.equals(this.blockAutoDistribution, checkResource.blockAutoDistribution) &&
        Objects.equals(this.earnings, checkResource.earnings) &&
        Objects.equals(this.deductions, checkResource.deductions) &&
        Objects.equals(this.checkDate, checkResource.checkDate) &&
        Objects.equals(this.informational, checkResource.informational) &&
        Objects.equals(this.taxes, checkResource.taxes) &&
        Objects.equals(this.links, checkResource.links)&&
        Objects.equals(this.additionalProperties, checkResource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workerId, paycheckId, payPeriodId, checkCorrelationId, blockAutoDistribution, earnings, deductions, checkDate, informational, taxes, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckResource {\n");
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
    sb.append("    paycheckId: ").append(toIndentedString(paycheckId)).append("\n");
    sb.append("    payPeriodId: ").append(toIndentedString(payPeriodId)).append("\n");
    sb.append("    checkCorrelationId: ").append(toIndentedString(checkCorrelationId)).append("\n");
    sb.append("    blockAutoDistribution: ").append(toIndentedString(blockAutoDistribution)).append("\n");
    sb.append("    earnings: ").append(toIndentedString(earnings)).append("\n");
    sb.append("    deductions: ").append(toIndentedString(deductions)).append("\n");
    sb.append("    checkDate: ").append(toIndentedString(checkDate)).append("\n");
    sb.append("    informational: ").append(toIndentedString(informational)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("workerId");
    openapiFields.add("paycheckId");
    openapiFields.add("payPeriodId");
    openapiFields.add("checkCorrelationId");
    openapiFields.add("blockAutoDistribution");
    openapiFields.add("earnings");
    openapiFields.add("deductions");
    openapiFields.add("checkDate");
    openapiFields.add("informational");
    openapiFields.add("taxes");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CheckResource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CheckResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckResource is not found in the empty JSON string", CheckResource.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("workerId") != null && !jsonObj.get("workerId").isJsonNull()) && !jsonObj.get("workerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workerId").toString()));
      }
      if ((jsonObj.get("paycheckId") != null && !jsonObj.get("paycheckId").isJsonNull()) && !jsonObj.get("paycheckId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paycheckId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paycheckId").toString()));
      }
      if ((jsonObj.get("payPeriodId") != null && !jsonObj.get("payPeriodId").isJsonNull()) && !jsonObj.get("payPeriodId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payPeriodId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payPeriodId").toString()));
      }
      if ((jsonObj.get("checkCorrelationId") != null && !jsonObj.get("checkCorrelationId").isJsonNull()) && !jsonObj.get("checkCorrelationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checkCorrelationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkCorrelationId").toString()));
      }
      if (jsonObj.get("earnings") != null && !jsonObj.get("earnings").isJsonNull()) {
        JsonArray jsonArrayearnings = jsonObj.getAsJsonArray("earnings");
        if (jsonArrayearnings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("earnings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `earnings` to be an array in the JSON string but got `%s`", jsonObj.get("earnings").toString()));
          }

          // validate the optional field `earnings` (array)
          for (int i = 0; i < jsonArrayearnings.size(); i++) {
            PayComponentResource.validateJsonObject(jsonArrayearnings.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("deductions") != null && !jsonObj.get("deductions").isJsonNull()) {
        JsonArray jsonArraydeductions = jsonObj.getAsJsonArray("deductions");
        if (jsonArraydeductions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("deductions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `deductions` to be an array in the JSON string but got `%s`", jsonObj.get("deductions").toString()));
          }

          // validate the optional field `deductions` (array)
          for (int i = 0; i < jsonArraydeductions.size(); i++) {
            PayComponentResource.validateJsonObject(jsonArraydeductions.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("checkDate") != null && !jsonObj.get("checkDate").isJsonNull()) && !jsonObj.get("checkDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checkDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkDate").toString()));
      }
      if (jsonObj.get("informational") != null && !jsonObj.get("informational").isJsonNull()) {
        JsonArray jsonArrayinformational = jsonObj.getAsJsonArray("informational");
        if (jsonArrayinformational != null) {
          // ensure the json data is an array
          if (!jsonObj.get("informational").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `informational` to be an array in the JSON string but got `%s`", jsonObj.get("informational").toString()));
          }

          // validate the optional field `informational` (array)
          for (int i = 0; i < jsonArrayinformational.size(); i++) {
            PayComponentResource.validateJsonObject(jsonArrayinformational.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("taxes") != null && !jsonObj.get("taxes").isJsonNull()) {
        JsonArray jsonArraytaxes = jsonObj.getAsJsonArray("taxes");
        if (jsonArraytaxes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("taxes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `taxes` to be an array in the JSON string but got `%s`", jsonObj.get("taxes").toString()));
          }

          // validate the optional field `taxes` (array)
          for (int i = 0; i < jsonArraytaxes.size(); i++) {
            PayComponentResource.validateJsonObject(jsonArraytaxes.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            Link.validateJsonObject(jsonArraylinks.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckResource.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckResource>() {
           @Override
           public void write(JsonWriter out, CheckResource value) throws IOException {
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
           public CheckResource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CheckResource instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CheckResource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CheckResource
  * @throws IOException if the JSON string is invalid with respect to CheckResource
  */
  public static CheckResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckResource.class);
  }

 /**
  * Convert an instance of CheckResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
