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
 * Worker Pay Standard
 */
@ApiModel(description = "Worker Pay Standard")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PayStandardResource {
  /**
   * How often a worker is paid.
   */
  @JsonAdapter(PayFrequencyEnum.Adapter.class)
 public enum PayFrequencyEnum {
    WEEKLY("WEEKLY"),
    
    BI_WEEKLY("BI_WEEKLY"),
    
    SEMI_MONTHLY("SEMI_MONTHLY"),
    
    MONTHLY("MONTHLY");

    private String value;

    PayFrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PayFrequencyEnum fromValue(String value) {
      for (PayFrequencyEnum b : PayFrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PayFrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PayFrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PayFrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PayFrequencyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAY_FREQUENCY = "payFrequency";
  @SerializedName(SERIALIZED_NAME_PAY_FREQUENCY)
  private PayFrequencyEnum payFrequency;

  public static final String SERIALIZED_NAME_OVERTIME_FACTOR = "overtimeFactor";
  @SerializedName(SERIALIZED_NAME_OVERTIME_FACTOR)
  private String overtimeFactor;

  public static final String SERIALIZED_NAME_CALCULATED_PAY_PERIOD = "calculatedPayPeriod";
  @SerializedName(SERIALIZED_NAME_CALCULATED_PAY_PERIOD)
  private String calculatedPayPeriod;

  public static final String SERIALIZED_NAME_CALCULATED_ANNUAL_SALARY = "calculatedAnnualSalary";
  @SerializedName(SERIALIZED_NAME_CALCULATED_ANNUAL_SALARY)
  private String calculatedAnnualSalary;

  public PayStandardResource() {
  }

  public PayStandardResource payFrequency(PayFrequencyEnum payFrequency) {
    
    
    
    
    this.payFrequency = payFrequency;
    return this;
  }

   /**
   * How often a worker is paid.
   * @return payFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MONTHLY", value = "How often a worker is paid.")

  public PayFrequencyEnum getPayFrequency() {
    return payFrequency;
  }


  public void setPayFrequency(PayFrequencyEnum payFrequency) {
    
    
    
    this.payFrequency = payFrequency;
  }


  public PayStandardResource overtimeFactor(String overtimeFactor) {
    
    
    
    
    this.overtimeFactor = overtimeFactor;
    return this;
  }

   /**
   * Default overtime factor that would be applied for overtime work completed.
   * @return overtimeFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.5", value = "Default overtime factor that would be applied for overtime work completed.")

  public String getOvertimeFactor() {
    return overtimeFactor;
  }


  public void setOvertimeFactor(String overtimeFactor) {
    
    
    
    this.overtimeFactor = overtimeFactor;
  }


  public PayStandardResource calculatedPayPeriod(String calculatedPayPeriod) {
    
    
    
    
    this.calculatedPayPeriod = calculatedPayPeriod;
    return this;
  }

   /**
   * Calculated amount of compensation based on rate defaults.
   * @return calculatedPayPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1704.1", value = "Calculated amount of compensation based on rate defaults.")

  public String getCalculatedPayPeriod() {
    return calculatedPayPeriod;
  }


  public void setCalculatedPayPeriod(String calculatedPayPeriod) {
    
    
    
    this.calculatedPayPeriod = calculatedPayPeriod;
  }


  public PayStandardResource calculatedAnnualSalary(String calculatedAnnualSalary) {
    
    
    
    
    this.calculatedAnnualSalary = calculatedAnnualSalary;
    return this;
  }

   /**
   * Calculated amount of compensation based on calculatedPayPeriod and payFrequency.
   * @return calculatedAnnualSalary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20449.2", value = "Calculated amount of compensation based on calculatedPayPeriod and payFrequency.")

  public String getCalculatedAnnualSalary() {
    return calculatedAnnualSalary;
  }


  public void setCalculatedAnnualSalary(String calculatedAnnualSalary) {
    
    
    
    this.calculatedAnnualSalary = calculatedAnnualSalary;
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
   * @return the PayStandardResource instance itself
   */
  public PayStandardResource putAdditionalProperty(String key, Object value) {
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
    PayStandardResource payStandardResource = (PayStandardResource) o;
    return Objects.equals(this.payFrequency, payStandardResource.payFrequency) &&
        Objects.equals(this.overtimeFactor, payStandardResource.overtimeFactor) &&
        Objects.equals(this.calculatedPayPeriod, payStandardResource.calculatedPayPeriod) &&
        Objects.equals(this.calculatedAnnualSalary, payStandardResource.calculatedAnnualSalary)&&
        Objects.equals(this.additionalProperties, payStandardResource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payFrequency, overtimeFactor, calculatedPayPeriod, calculatedAnnualSalary, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayStandardResource {\n");
    sb.append("    payFrequency: ").append(toIndentedString(payFrequency)).append("\n");
    sb.append("    overtimeFactor: ").append(toIndentedString(overtimeFactor)).append("\n");
    sb.append("    calculatedPayPeriod: ").append(toIndentedString(calculatedPayPeriod)).append("\n");
    sb.append("    calculatedAnnualSalary: ").append(toIndentedString(calculatedAnnualSalary)).append("\n");
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
    openapiFields.add("payFrequency");
    openapiFields.add("overtimeFactor");
    openapiFields.add("calculatedPayPeriod");
    openapiFields.add("calculatedAnnualSalary");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayStandardResource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PayStandardResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayStandardResource is not found in the empty JSON string", PayStandardResource.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("payFrequency") != null && !jsonObj.get("payFrequency").isJsonNull()) && !jsonObj.get("payFrequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payFrequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payFrequency").toString()));
      }
      if ((jsonObj.get("overtimeFactor") != null && !jsonObj.get("overtimeFactor").isJsonNull()) && !jsonObj.get("overtimeFactor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `overtimeFactor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("overtimeFactor").toString()));
      }
      if ((jsonObj.get("calculatedPayPeriod") != null && !jsonObj.get("calculatedPayPeriod").isJsonNull()) && !jsonObj.get("calculatedPayPeriod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `calculatedPayPeriod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("calculatedPayPeriod").toString()));
      }
      if ((jsonObj.get("calculatedAnnualSalary") != null && !jsonObj.get("calculatedAnnualSalary").isJsonNull()) && !jsonObj.get("calculatedAnnualSalary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `calculatedAnnualSalary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("calculatedAnnualSalary").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayStandardResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayStandardResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayStandardResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayStandardResource.class));

       return (TypeAdapter<T>) new TypeAdapter<PayStandardResource>() {
           @Override
           public void write(JsonWriter out, PayStandardResource value) throws IOException {
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
           public PayStandardResource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PayStandardResource instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PayStandardResource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayStandardResource
  * @throws IOException if the JSON string is invalid with respect to PayStandardResource
  */
  public static PayStandardResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayStandardResource.class);
  }

 /**
  * Convert an instance of PayStandardResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

