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
 * The representational state of pay periods.
 */
@ApiModel(description = "The representational state of pay periods.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PayPeriodResource {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PAY_PERIOD_ID = "payPeriodId";
  @SerializedName(SERIALIZED_NAME_PAY_PERIOD_ID)
  private String payPeriodId;

  /**
   * Frequency of the payroll period.
   */
  @JsonAdapter(IntervalCodeEnum.Adapter.class)
 public enum IntervalCodeEnum {
    ANNUAL("ANNUAL"),
    
    BI_WEEKLY("BI_WEEKLY"),
    
    MONTHLY("MONTHLY"),
    
    QUARTERLY("QUARTERLY"),
    
    SEMI_ANNUAL("SEMI_ANNUAL"),
    
    SEMI_MONTHLY("SEMI_MONTHLY"),
    
    WEEKLY("WEEKLY");

    private String value;

    IntervalCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IntervalCodeEnum fromValue(String value) {
      for (IntervalCodeEnum b : IntervalCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IntervalCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IntervalCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IntervalCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IntervalCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INTERVAL_CODE = "intervalCode";
  @SerializedName(SERIALIZED_NAME_INTERVAL_CODE)
  private IntervalCodeEnum intervalCode;

  /**
   * The current state of the associated pay period.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    COMPLETED("COMPLETED"),
    
    COMPLETED_BY_MEC("COMPLETED_BY_MEC"),
    
    ENTRY("ENTRY"),
    
    INITIAL("INITIAL"),
    
    PROCESSING("PROCESSING"),
    
    REISSUED("REISSUED"),
    
    RELEASED("RELEASED"),
    
    REVERSED("REVERSED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_SUBMIT_BY_DATE = "submitByDate";
  @SerializedName(SERIALIZED_NAME_SUBMIT_BY_DATE)
  private OffsetDateTime submitByDate;

  public static final String SERIALIZED_NAME_CHECK_DATE = "checkDate";
  @SerializedName(SERIALIZED_NAME_CHECK_DATE)
  private OffsetDateTime checkDate;

  public static final String SERIALIZED_NAME_CHECK_COUNT = "checkCount";
  @SerializedName(SERIALIZED_NAME_CHECK_COUNT)
  private Integer checkCount;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;

  public PayPeriodResource() {
  }

  public PayPeriodResource description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * The description of the Pay Period.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Bi-weekly Payroll (1)", value = "The description of the Pay Period.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public PayPeriodResource payPeriodId(String payPeriodId) {
    
    
    
    
    this.payPeriodId = payPeriodId;
    return this;
  }

   /**
   * The unique identifier used to identify a pay period.
   * @return payPeriodId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "850000414675408", value = "The unique identifier used to identify a pay period.")

  public String getPayPeriodId() {
    return payPeriodId;
  }


  public void setPayPeriodId(String payPeriodId) {
    
    
    
    this.payPeriodId = payPeriodId;
  }


  public PayPeriodResource intervalCode(IntervalCodeEnum intervalCode) {
    
    
    
    
    this.intervalCode = intervalCode;
    return this;
  }

   /**
   * Frequency of the payroll period.
   * @return intervalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BI_WEEKLY", value = "Frequency of the payroll period.")

  public IntervalCodeEnum getIntervalCode() {
    return intervalCode;
  }


  public void setIntervalCode(IntervalCodeEnum intervalCode) {
    
    
    
    this.intervalCode = intervalCode;
  }


  public PayPeriodResource status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The current state of the associated pay period.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INITIAL", value = "The current state of the associated pay period.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public PayPeriodResource startDate(OffsetDateTime startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date associated with this pay period.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-02-27T00:00Z", value = "The start date associated with this pay period.")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    
    
    
    this.startDate = startDate;
  }


  public PayPeriodResource endDate(OffsetDateTime endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date associated with this pay period.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-03-11T00:00Z", value = "The end date associated with this pay period.")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    
    
    
    this.endDate = endDate;
  }


  public PayPeriodResource submitByDate(OffsetDateTime submitByDate) {
    
    
    
    
    this.submitByDate = submitByDate;
    return this;
  }

   /**
   * The date by which information for the pay run must be submitted in order to be guaranteed the information is included.
   * @return submitByDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-03-18T00:00Z", value = "The date by which information for the pay run must be submitted in order to be guaranteed the information is included.")

  public OffsetDateTime getSubmitByDate() {
    return submitByDate;
  }


  public void setSubmitByDate(OffsetDateTime submitByDate) {
    
    
    
    this.submitByDate = submitByDate;
  }


  public PayPeriodResource checkDate(OffsetDateTime checkDate) {
    
    
    
    
    this.checkDate = checkDate;
    return this;
  }

   /**
   * The date on which the checks associated with this pay period can be cashed.
   * @return checkDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-03-18T00:00Z", value = "The date on which the checks associated with this pay period can be cashed.")

  public OffsetDateTime getCheckDate() {
    return checkDate;
  }


  public void setCheckDate(OffsetDateTime checkDate) {
    
    
    
    this.checkDate = checkDate;
  }


  public PayPeriodResource checkCount(Integer checkCount) {
    
    
    
    
    this.checkCount = checkCount;
    return this;
  }

   /**
   * Number of checks that are included within the pay period.
   * @return checkCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Number of checks that are included within the pay period.")

  public Integer getCheckCount() {
    return checkCount;
  }


  public void setCheckCount(Integer checkCount) {
    
    
    
    this.checkCount = checkCount;
  }


  public PayPeriodResource links(List<Link> links) {
    
    
    
    
    this.links = links;
    return this;
  }

  public PayPeriodResource addLinksItem(Link linksItem) {
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
   * @return the PayPeriodResource instance itself
   */
  public PayPeriodResource putAdditionalProperty(String key, Object value) {
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
    PayPeriodResource payPeriodResource = (PayPeriodResource) o;
    return Objects.equals(this.description, payPeriodResource.description) &&
        Objects.equals(this.payPeriodId, payPeriodResource.payPeriodId) &&
        Objects.equals(this.intervalCode, payPeriodResource.intervalCode) &&
        Objects.equals(this.status, payPeriodResource.status) &&
        Objects.equals(this.startDate, payPeriodResource.startDate) &&
        Objects.equals(this.endDate, payPeriodResource.endDate) &&
        Objects.equals(this.submitByDate, payPeriodResource.submitByDate) &&
        Objects.equals(this.checkDate, payPeriodResource.checkDate) &&
        Objects.equals(this.checkCount, payPeriodResource.checkCount) &&
        Objects.equals(this.links, payPeriodResource.links)&&
        Objects.equals(this.additionalProperties, payPeriodResource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, payPeriodId, intervalCode, status, startDate, endDate, submitByDate, checkDate, checkCount, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayPeriodResource {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    payPeriodId: ").append(toIndentedString(payPeriodId)).append("\n");
    sb.append("    intervalCode: ").append(toIndentedString(intervalCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    submitByDate: ").append(toIndentedString(submitByDate)).append("\n");
    sb.append("    checkDate: ").append(toIndentedString(checkDate)).append("\n");
    sb.append("    checkCount: ").append(toIndentedString(checkCount)).append("\n");
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
    openapiFields.add("payPeriodId");
    openapiFields.add("intervalCode");
    openapiFields.add("status");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("submitByDate");
    openapiFields.add("checkDate");
    openapiFields.add("checkCount");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayPeriodResource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PayPeriodResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayPeriodResource is not found in the empty JSON string", PayPeriodResource.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("payPeriodId") != null && !jsonObj.get("payPeriodId").isJsonNull()) && !jsonObj.get("payPeriodId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payPeriodId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payPeriodId").toString()));
      }
      if ((jsonObj.get("intervalCode") != null && !jsonObj.get("intervalCode").isJsonNull()) && !jsonObj.get("intervalCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `intervalCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("intervalCode").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
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
       if (!PayPeriodResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayPeriodResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayPeriodResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayPeriodResource.class));

       return (TypeAdapter<T>) new TypeAdapter<PayPeriodResource>() {
           @Override
           public void write(JsonWriter out, PayPeriodResource value) throws IOException {
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
           public PayPeriodResource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PayPeriodResource instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PayPeriodResource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayPeriodResource
  * @throws IOException if the JSON string is invalid with respect to PayPeriodResource
  */
  public static PayPeriodResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayPeriodResource.class);
  }

 /**
  * Convert an instance of PayPeriodResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

