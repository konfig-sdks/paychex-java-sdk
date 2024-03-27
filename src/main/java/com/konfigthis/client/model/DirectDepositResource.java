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
 * Worker direct deposit
 */
@ApiModel(description = "Worker direct deposit")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DirectDepositResource {
  public static final String SERIALIZED_NAME_DIRECT_DEPOSIT_ID = "directDepositId";
  @SerializedName(SERIALIZED_NAME_DIRECT_DEPOSIT_ID)
  private String directDepositId;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  /**
   * A type of payment for the direct deposit.
   */
  @JsonAdapter(PaymentTypeEnum.Adapter.class)
 public enum PaymentTypeEnum {
    FLAT_DOLLAR_AMOUNT("FLAT_DOLLAR_AMOUNT"),
    
    PERCENTAGE("PERCENTAGE"),
    
    REMAINDER("REMAINDER");

    private String value;

    PaymentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentTypeEnum fromValue(String value) {
      for (PaymentTypeEnum b : PaymentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PaymentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PaymentTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYMENT_TYPE = "paymentType";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TYPE)
  private PaymentTypeEnum paymentType;

  /**
   * Financial institutions account type. This data field cannot be PATCHED.
   */
  @JsonAdapter(AccountTypeEnum.Adapter.class)
 public enum AccountTypeEnum {
    CHECKING("CHECKING"),
    
    SAVINGS("SAVINGS"),
    
    CREDIT_CARD("CREDIT_CARD");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountTypeEnum fromValue(String value) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccountTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "accountType";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private AccountTypeEnum accountType;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;

  public static final String SERIALIZED_NAME_ROUTING_NUMBER = "routingNumber";
  @SerializedName(SERIALIZED_NAME_ROUTING_NUMBER)
  private String routingNumber;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private String priority;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;

  public DirectDepositResource() {
  }

  
  public DirectDepositResource(
     String directDepositId
  ) {
    this();
    this.directDepositId = directDepositId;
  }

   /**
   * The ID for the direct deposit item.
   * @return directDepositId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1020026420675252", value = "The ID for the direct deposit item.")

  public String getDirectDepositId() {
    return directDepositId;
  }




  public DirectDepositResource startDate(OffsetDateTime startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The date that this direct deposit will be applied to future pay periods. This data field cannot be PATCHED.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-09-11T00:00Z", value = "The date that this direct deposit will be applied to future pay periods. This data field cannot be PATCHED.")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    
    
    
    this.startDate = startDate;
  }


  public DirectDepositResource paymentType(PaymentTypeEnum paymentType) {
    
    
    
    
    this.paymentType = paymentType;
    return this;
  }

   /**
   * A type of payment for the direct deposit.
   * @return paymentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PERCENTAGE", value = "A type of payment for the direct deposit.")

  public PaymentTypeEnum getPaymentType() {
    return paymentType;
  }


  public void setPaymentType(PaymentTypeEnum paymentType) {
    
    
    
    this.paymentType = paymentType;
  }


  public DirectDepositResource accountType(AccountTypeEnum accountType) {
    
    
    
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Financial institutions account type. This data field cannot be PATCHED.
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CHECKING", value = "Financial institutions account type. This data field cannot be PATCHED.")

  public AccountTypeEnum getAccountType() {
    return accountType;
  }


  public void setAccountType(AccountTypeEnum accountType) {
    
    
    
    this.accountType = accountType;
  }


  public DirectDepositResource value(Double value) {
    
    
    
    
    this.value = value;
    return this;
  }

  public DirectDepositResource value(Integer value) {
    
    
    
    
    this.value = value.doubleValue();
    return this;
  }

   /**
   * The amount to be applied to this direct deposit.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "75", value = "The amount to be applied to this direct deposit.")

  public Double getValue() {
    return value;
  }


  public void setValue(Double value) {
    
    
    
    this.value = value;
  }


  public DirectDepositResource routingNumber(String routingNumber) {
    
    
    
    
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * The financial institutions routing number.This data field cannot be PATCHED.
   * @return routingNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "222371863", value = "The financial institutions routing number.This data field cannot be PATCHED.")

  public String getRoutingNumber() {
    return routingNumber;
  }


  public void setRoutingNumber(String routingNumber) {
    
    
    
    this.routingNumber = routingNumber;
  }


  public DirectDepositResource accountNumber(String accountNumber) {
    
    
    
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * The financial institutions account number.This data field cannot be PATCHED.
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "The financial institutions account number.This data field cannot be PATCHED.")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    
    
    
    this.accountNumber = accountNumber;
  }


  public DirectDepositResource priority(String priority) {
    
    
    
    
    this.priority = priority;
    return this;
  }

   /**
   * The priority order for which the direct deposits will be performed in. When a new direct deposit is added the priority will be assigned. The priority can be modified only by swapping with a different direct deposit using the bulk PATCH. A paymentType of REMAINDER will show a priority of 99 and can&#39;t be modified.This data field cannot be PATCHED.
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The priority order for which the direct deposits will be performed in. When a new direct deposit is added the priority will be assigned. The priority can be modified only by swapping with a different direct deposit using the bulk PATCH. A paymentType of REMAINDER will show a priority of 99 and can't be modified.This data field cannot be PATCHED.")

  public String getPriority() {
    return priority;
  }


  public void setPriority(String priority) {
    
    
    
    this.priority = priority;
  }


  public DirectDepositResource links(List<Link> links) {
    
    
    
    
    this.links = links;
    return this;
  }

  public DirectDepositResource addLinksItem(Link linksItem) {
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
   * @return the DirectDepositResource instance itself
   */
  public DirectDepositResource putAdditionalProperty(String key, Object value) {
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
    DirectDepositResource directDepositResource = (DirectDepositResource) o;
    return Objects.equals(this.directDepositId, directDepositResource.directDepositId) &&
        Objects.equals(this.startDate, directDepositResource.startDate) &&
        Objects.equals(this.paymentType, directDepositResource.paymentType) &&
        Objects.equals(this.accountType, directDepositResource.accountType) &&
        Objects.equals(this.value, directDepositResource.value) &&
        Objects.equals(this.routingNumber, directDepositResource.routingNumber) &&
        Objects.equals(this.accountNumber, directDepositResource.accountNumber) &&
        Objects.equals(this.priority, directDepositResource.priority) &&
        Objects.equals(this.links, directDepositResource.links)&&
        Objects.equals(this.additionalProperties, directDepositResource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directDepositId, startDate, paymentType, accountType, value, routingNumber, accountNumber, priority, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectDepositResource {\n");
    sb.append("    directDepositId: ").append(toIndentedString(directDepositId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
    openapiFields.add("directDepositId");
    openapiFields.add("startDate");
    openapiFields.add("paymentType");
    openapiFields.add("accountType");
    openapiFields.add("value");
    openapiFields.add("routingNumber");
    openapiFields.add("accountNumber");
    openapiFields.add("priority");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DirectDepositResource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DirectDepositResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DirectDepositResource is not found in the empty JSON string", DirectDepositResource.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("directDepositId") != null && !jsonObj.get("directDepositId").isJsonNull()) && !jsonObj.get("directDepositId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `directDepositId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("directDepositId").toString()));
      }
      if ((jsonObj.get("paymentType") != null && !jsonObj.get("paymentType").isJsonNull()) && !jsonObj.get("paymentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentType").toString()));
      }
      if ((jsonObj.get("accountType") != null && !jsonObj.get("accountType").isJsonNull()) && !jsonObj.get("accountType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountType").toString()));
      }
      if ((jsonObj.get("routingNumber") != null && !jsonObj.get("routingNumber").isJsonNull()) && !jsonObj.get("routingNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `routingNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("routingNumber").toString()));
      }
      if ((jsonObj.get("accountNumber") != null && !jsonObj.get("accountNumber").isJsonNull()) && !jsonObj.get("accountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountNumber").toString()));
      }
      if ((jsonObj.get("priority") != null && !jsonObj.get("priority").isJsonNull()) && !jsonObj.get("priority").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `priority` to be a primitive type in the JSON string but got `%s`", jsonObj.get("priority").toString()));
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
       if (!DirectDepositResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DirectDepositResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DirectDepositResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DirectDepositResource.class));

       return (TypeAdapter<T>) new TypeAdapter<DirectDepositResource>() {
           @Override
           public void write(JsonWriter out, DirectDepositResource value) throws IOException {
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
           public DirectDepositResource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DirectDepositResource instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DirectDepositResource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DirectDepositResource
  * @throws IOException if the JSON string is invalid with respect to DirectDepositResource
  */
  public static DirectDepositResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DirectDepositResource.class);
  }

 /**
  * Convert an instance of DirectDepositResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

