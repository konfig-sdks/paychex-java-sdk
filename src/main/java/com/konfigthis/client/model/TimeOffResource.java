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
 * The representational state of a workers time off.
 */
@ApiModel(description = "The representational state of a workers time off.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TimeOffResource {
  public static final String SERIALIZED_NAME_POLICY_ID = "policyId";
  @SerializedName(SERIALIZED_NAME_POLICY_ID)
  private String policyId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private String balance;

  /**
   * Type of measurement type to be applied to the balance.
   */
  @JsonAdapter(MeasureEnum.Adapter.class)
 public enum MeasureEnum {
    HOURS("HOURS"),
    
    UNITS("UNITS");

    private String value;

    MeasureEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MeasureEnum fromValue(String value) {
      for (MeasureEnum b : MeasureEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MeasureEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MeasureEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MeasureEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MeasureEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MEASURE = "measure";
  @SerializedName(SERIALIZED_NAME_MEASURE)
  private MeasureEnum measure;

  public TimeOffResource() {
  }

  public TimeOffResource policyId(String policyId) {
    
    
    
    
    this.policyId = policyId;
    return this;
  }

   /**
   * The unique ID assigned to the company policy.
   * @return policyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "970002308485816", value = "The unique ID assigned to the company policy.")

  public String getPolicyId() {
    return policyId;
  }


  public void setPolicyId(String policyId) {
    
    
    
    this.policyId = policyId;
  }


  public TimeOffResource type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * The policy type the client has assigned at the company level
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Vacation", value = "The policy type the client has assigned at the company level")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public TimeOffResource name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the policy the client has assigned at the company level.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Vacation", value = "The name of the policy the client has assigned at the company level.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public TimeOffResource balance(String balance) {
    
    
    
    
    this.balance = balance;
    return this;
  }

   /**
   * The current balance for this worker, for the associated policy type.
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "40", value = "The current balance for this worker, for the associated policy type.")

  public String getBalance() {
    return balance;
  }


  public void setBalance(String balance) {
    
    
    
    this.balance = balance;
  }


  public TimeOffResource measure(MeasureEnum measure) {
    
    
    
    
    this.measure = measure;
    return this;
  }

   /**
   * Type of measurement type to be applied to the balance.
   * @return measure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HOURS", value = "Type of measurement type to be applied to the balance.")

  public MeasureEnum getMeasure() {
    return measure;
  }


  public void setMeasure(MeasureEnum measure) {
    
    
    
    this.measure = measure;
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
   * @return the TimeOffResource instance itself
   */
  public TimeOffResource putAdditionalProperty(String key, Object value) {
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
    TimeOffResource timeOffResource = (TimeOffResource) o;
    return Objects.equals(this.policyId, timeOffResource.policyId) &&
        Objects.equals(this.type, timeOffResource.type) &&
        Objects.equals(this.name, timeOffResource.name) &&
        Objects.equals(this.balance, timeOffResource.balance) &&
        Objects.equals(this.measure, timeOffResource.measure)&&
        Objects.equals(this.additionalProperties, timeOffResource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId, type, name, balance, measure, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffResource {\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    measure: ").append(toIndentedString(measure)).append("\n");
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
    openapiFields.add("policyId");
    openapiFields.add("type");
    openapiFields.add("name");
    openapiFields.add("balance");
    openapiFields.add("measure");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TimeOffResource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TimeOffResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimeOffResource is not found in the empty JSON string", TimeOffResource.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("policyId") != null && !jsonObj.get("policyId").isJsonNull()) && !jsonObj.get("policyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policyId").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("balance") != null && !jsonObj.get("balance").isJsonNull()) && !jsonObj.get("balance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `balance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balance").toString()));
      }
      if ((jsonObj.get("measure") != null && !jsonObj.get("measure").isJsonNull()) && !jsonObj.get("measure").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `measure` to be a primitive type in the JSON string but got `%s`", jsonObj.get("measure").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimeOffResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimeOffResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimeOffResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimeOffResource.class));

       return (TypeAdapter<T>) new TypeAdapter<TimeOffResource>() {
           @Override
           public void write(JsonWriter out, TimeOffResource value) throws IOException {
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
           public TimeOffResource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TimeOffResource instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TimeOffResource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TimeOffResource
  * @throws IOException if the JSON string is invalid with respect to TimeOffResource
  */
  public static TimeOffResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimeOffResource.class);
  }

 /**
  * Convert an instance of TimeOffResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

