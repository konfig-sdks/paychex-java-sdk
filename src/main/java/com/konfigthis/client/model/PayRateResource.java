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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Worker Pay Rate
 */
@ApiModel(description = "Worker Pay Rate")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PayRateResource {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_RATE_ID = "rateId";
  @SerializedName(SERIALIZED_NAME_RATE_ID)
  private String rateId;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_RATE_NUMBER = "rateNumber";
  @SerializedName(SERIALIZED_NAME_RATE_NUMBER)
  private String rateNumber;

  /**
   * Type of rate.
   */
  @JsonAdapter(RateTypeEnum.Adapter.class)
 public enum RateTypeEnum {
    ANNUAL_SALARY("ANNUAL_SALARY"),
    
    PER_PAY_PERIOD_SALARY("PER_PAY_PERIOD_SALARY"),
    
    PIECEWORK_RATE("PIECEWORK_RATE"),
    
    DAILY_RATE("DAILY_RATE"),
    
    HOURLY_RATE("HOURLY_RATE");

    private String value;

    RateTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RateTypeEnum fromValue(String value) {
      for (RateTypeEnum b : RateTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RateTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RateTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RateTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RateTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RATE_TYPE = "rateType";
  @SerializedName(SERIALIZED_NAME_RATE_TYPE)
  private RateTypeEnum rateType;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_STANDARD_HOURS = "standardHours";
  @SerializedName(SERIALIZED_NAME_STANDARD_HOURS)
  private String standardHours;

  public static final String SERIALIZED_NAME_STANDARD_OVERTIME = "standardOvertime";
  @SerializedName(SERIALIZED_NAME_STANDARD_OVERTIME)
  private String standardOvertime;

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private Boolean _default;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "effectiveDate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  private String effectiveDate;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;

  public PayRateResource() {
  }

  
  public PayRateResource(
     String rateId
  ) {
    this();
    this.rateId = rateId;
  }

  public PayRateResource description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Describes the rate for the worker.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Security2", value = "Describes the rate for the worker.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


   /**
   * Unique identifier for this workers pay rate. **This ID will change if this is created for an IN_PROGRESS worker that is later completed within Flex**
   * @return rateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "970000054610137", value = "Unique identifier for this workers pay rate. **This ID will change if this is created for an IN_PROGRESS worker that is later completed within Flex**")

  public String getRateId() {
    return rateId;
  }




  public PayRateResource startDate(OffsetDateTime startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The date when the pay rate is going to begin.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date when the pay rate is going to begin.")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    
    
    
    this.startDate = startDate;
  }


  public PayRateResource rateNumber(String rateNumber) {
    
    
    
    
    this.rateNumber = rateNumber;
    return this;
  }

   /**
   * The number of the rate. A worker can have up to 5 different rates.
   * @return rateNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RATE_1", value = "The number of the rate. A worker can have up to 5 different rates.")

  public String getRateNumber() {
    return rateNumber;
  }


  public void setRateNumber(String rateNumber) {
    
    
    
    this.rateNumber = rateNumber;
  }


  public PayRateResource rateType(RateTypeEnum rateType) {
    
    
    
    
    this.rateType = rateType;
    return this;
  }

   /**
   * Type of rate.
   * @return rateType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RATE_1", value = "Type of rate.")

  public RateTypeEnum getRateType() {
    return rateType;
  }


  public void setRateType(RateTypeEnum rateType) {
    
    
    
    this.rateType = rateType;
  }


  public PayRateResource amount(String amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * The currency amount which this rate is applied.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "40.2", value = "The currency amount which this rate is applied.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    
    
    
    this.amount = amount;
  }


  public PayRateResource standardHours(String standardHours) {
    
    
    
    
    this.standardHours = standardHours;
    return this;
  }

   /**
   * Default standard hours that this rate is used with a pay frequency.
   * @return standardHours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25.25", value = "Default standard hours that this rate is used with a pay frequency.")

  public String getStandardHours() {
    return standardHours;
  }


  public void setStandardHours(String standardHours) {
    
    
    
    this.standardHours = standardHours;
  }


  public PayRateResource standardOvertime(String standardOvertime) {
    
    
    
    
    this.standardOvertime = standardOvertime;
    return this;
  }

   /**
   * Default over time hours that this rate is used with a pay frequency.
   * @return standardOvertime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.25", value = "Default over time hours that this rate is used with a pay frequency.")

  public String getStandardOvertime() {
    return standardOvertime;
  }


  public void setStandardOvertime(String standardOvertime) {
    
    
    
    this.standardOvertime = standardOvertime;
  }


  public PayRateResource _default(Boolean _default) {
    
    
    
    
    this._default = _default;
    return this;
  }

   /**
   * If this rate is the default one to apply on the worker.
   * @return _default
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If this rate is the default one to apply on the worker.")

  public Boolean getDefault() {
    return _default;
  }


  public void setDefault(Boolean _default) {
    
    
    
    this._default = _default;
  }


  public PayRateResource effectiveDate(String effectiveDate) {
    
    
    
    
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * The date when the pay rate becomes effective for the worker.(can be used only in POST/PATCH for an active worker)
   * @return effectiveDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date when the pay rate becomes effective for the worker.(can be used only in POST/PATCH for an active worker)")

  public String getEffectiveDate() {
    return effectiveDate;
  }


  public void setEffectiveDate(String effectiveDate) {
    
    
    
    this.effectiveDate = effectiveDate;
  }


  public PayRateResource links(List<Link> links) {
    
    
    
    
    this.links = links;
    return this;
  }

  public PayRateResource addLinksItem(Link linksItem) {
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
   * @return the PayRateResource instance itself
   */
  public PayRateResource putAdditionalProperty(String key, Object value) {
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
    PayRateResource payRateResource = (PayRateResource) o;
    return Objects.equals(this.description, payRateResource.description) &&
        Objects.equals(this.rateId, payRateResource.rateId) &&
        Objects.equals(this.startDate, payRateResource.startDate) &&
        Objects.equals(this.rateNumber, payRateResource.rateNumber) &&
        Objects.equals(this.rateType, payRateResource.rateType) &&
        Objects.equals(this.amount, payRateResource.amount) &&
        Objects.equals(this.standardHours, payRateResource.standardHours) &&
        Objects.equals(this.standardOvertime, payRateResource.standardOvertime) &&
        Objects.equals(this._default, payRateResource._default) &&
        Objects.equals(this.effectiveDate, payRateResource.effectiveDate) &&
        Objects.equals(this.links, payRateResource.links)&&
        Objects.equals(this.additionalProperties, payRateResource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, rateId, startDate, rateNumber, rateType, amount, standardHours, standardOvertime, _default, effectiveDate, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayRateResource {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rateId: ").append(toIndentedString(rateId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    rateNumber: ").append(toIndentedString(rateNumber)).append("\n");
    sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    standardHours: ").append(toIndentedString(standardHours)).append("\n");
    sb.append("    standardOvertime: ").append(toIndentedString(standardOvertime)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("rateId");
    openapiFields.add("startDate");
    openapiFields.add("rateNumber");
    openapiFields.add("rateType");
    openapiFields.add("amount");
    openapiFields.add("standardHours");
    openapiFields.add("standardOvertime");
    openapiFields.add("default");
    openapiFields.add("effectiveDate");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayRateResource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PayRateResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayRateResource is not found in the empty JSON string", PayRateResource.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("rateId") != null && !jsonObj.get("rateId").isJsonNull()) && !jsonObj.get("rateId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rateId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rateId").toString()));
      }
      if ((jsonObj.get("rateNumber") != null && !jsonObj.get("rateNumber").isJsonNull()) && !jsonObj.get("rateNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rateNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rateNumber").toString()));
      }
      if ((jsonObj.get("rateType") != null && !jsonObj.get("rateType").isJsonNull()) && !jsonObj.get("rateType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rateType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rateType").toString()));
      }
      if ((jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if ((jsonObj.get("standardHours") != null && !jsonObj.get("standardHours").isJsonNull()) && !jsonObj.get("standardHours").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standardHours` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standardHours").toString()));
      }
      if ((jsonObj.get("standardOvertime") != null && !jsonObj.get("standardOvertime").isJsonNull()) && !jsonObj.get("standardOvertime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standardOvertime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standardOvertime").toString()));
      }
      if ((jsonObj.get("effectiveDate") != null && !jsonObj.get("effectiveDate").isJsonNull()) && !jsonObj.get("effectiveDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effectiveDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effectiveDate").toString()));
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
       if (!PayRateResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayRateResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayRateResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayRateResource.class));

       return (TypeAdapter<T>) new TypeAdapter<PayRateResource>() {
           @Override
           public void write(JsonWriter out, PayRateResource value) throws IOException {
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
           public PayRateResource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PayRateResource instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PayRateResource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayRateResource
  * @throws IOException if the JSON string is invalid with respect to PayRateResource
  */
  public static PayRateResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayRateResource.class);
  }

 /**
  * Convert an instance of PayRateResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

