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
import com.konfigthis.client.model.Client;
import com.konfigthis.client.model.ClientAccount;
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
 * ClientAccountRegistration
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ClientAccountRegistration {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_END_REASON_CODE = "endReasonCode";
  @SerializedName(SERIALIZED_NAME_END_REASON_CODE)
  private String endReasonCode;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_CREATED_BY_APPLICATION_NAME = "createdByApplicationName";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_APPLICATION_NAME)
  private String createdByApplicationName;

  public static final String SERIALIZED_NAME_CREATED_BY_USER_ID = "createdByUserId";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_USER_ID)
  private String createdByUserId;

  public static final String SERIALIZED_NAME_CREATED_BY_APPLICATION_SUB_PROCESS_NAME = "createdByApplicationSubProcessName";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_APPLICATION_SUB_PROCESS_NAME)
  private String createdByApplicationSubProcessName;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private OffsetDateTime modifiedDate;

  public static final String SERIALIZED_NAME_MODIFIED_BY_APPLICATION_NAME = "modifiedByApplicationName";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY_APPLICATION_NAME)
  private String modifiedByApplicationName;

  public static final String SERIALIZED_NAME_MODIFIED_BY_APPLICATION_SUB_PROCESS_NAME = "modifiedByApplicationSubProcessName";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY_APPLICATION_SUB_PROCESS_NAME)
  private String modifiedByApplicationSubProcessName;

  public static final String SERIALIZED_NAME_MODIFIED_BY_USER_ID = "modifiedByUserId";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY_USER_ID)
  private String modifiedByUserId;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  private Client client;

  public static final String SERIALIZED_NAME_CLIENT_ACCOUNT = "clientAccount";
  @SerializedName(SERIALIZED_NAME_CLIENT_ACCOUNT)
  private ClientAccount clientAccount;

  public ClientAccountRegistration() {
  }

  public ClientAccountRegistration id(Long id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    
    
    
    this.id = id;
  }


  public ClientAccountRegistration startDate(OffsetDateTime startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    
    
    
    this.startDate = startDate;
  }


  public ClientAccountRegistration endDate(OffsetDateTime endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    
    
    
    this.endDate = endDate;
  }


  public ClientAccountRegistration endReasonCode(String endReasonCode) {
    
    
    
    
    this.endReasonCode = endReasonCode;
    return this;
  }

   /**
   * Get endReasonCode
   * @return endReasonCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEndReasonCode() {
    return endReasonCode;
  }


  public void setEndReasonCode(String endReasonCode) {
    
    
    
    this.endReasonCode = endReasonCode;
  }


  public ClientAccountRegistration createdDate(OffsetDateTime createdDate) {
    
    
    
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    
    
    
    this.createdDate = createdDate;
  }


  public ClientAccountRegistration createdByApplicationName(String createdByApplicationName) {
    
    
    
    
    this.createdByApplicationName = createdByApplicationName;
    return this;
  }

   /**
   * Get createdByApplicationName
   * @return createdByApplicationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedByApplicationName() {
    return createdByApplicationName;
  }


  public void setCreatedByApplicationName(String createdByApplicationName) {
    
    
    
    this.createdByApplicationName = createdByApplicationName;
  }


  public ClientAccountRegistration createdByUserId(String createdByUserId) {
    
    
    
    
    this.createdByUserId = createdByUserId;
    return this;
  }

   /**
   * Get createdByUserId
   * @return createdByUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedByUserId() {
    return createdByUserId;
  }


  public void setCreatedByUserId(String createdByUserId) {
    
    
    
    this.createdByUserId = createdByUserId;
  }


  public ClientAccountRegistration createdByApplicationSubProcessName(String createdByApplicationSubProcessName) {
    
    
    
    
    this.createdByApplicationSubProcessName = createdByApplicationSubProcessName;
    return this;
  }

   /**
   * Get createdByApplicationSubProcessName
   * @return createdByApplicationSubProcessName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedByApplicationSubProcessName() {
    return createdByApplicationSubProcessName;
  }


  public void setCreatedByApplicationSubProcessName(String createdByApplicationSubProcessName) {
    
    
    
    this.createdByApplicationSubProcessName = createdByApplicationSubProcessName;
  }


  public ClientAccountRegistration modifiedDate(OffsetDateTime modifiedDate) {
    
    
    
    
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }


  public void setModifiedDate(OffsetDateTime modifiedDate) {
    
    
    
    this.modifiedDate = modifiedDate;
  }


  public ClientAccountRegistration modifiedByApplicationName(String modifiedByApplicationName) {
    
    
    
    
    this.modifiedByApplicationName = modifiedByApplicationName;
    return this;
  }

   /**
   * Get modifiedByApplicationName
   * @return modifiedByApplicationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModifiedByApplicationName() {
    return modifiedByApplicationName;
  }


  public void setModifiedByApplicationName(String modifiedByApplicationName) {
    
    
    
    this.modifiedByApplicationName = modifiedByApplicationName;
  }


  public ClientAccountRegistration modifiedByApplicationSubProcessName(String modifiedByApplicationSubProcessName) {
    
    
    
    
    this.modifiedByApplicationSubProcessName = modifiedByApplicationSubProcessName;
    return this;
  }

   /**
   * Get modifiedByApplicationSubProcessName
   * @return modifiedByApplicationSubProcessName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModifiedByApplicationSubProcessName() {
    return modifiedByApplicationSubProcessName;
  }


  public void setModifiedByApplicationSubProcessName(String modifiedByApplicationSubProcessName) {
    
    
    
    this.modifiedByApplicationSubProcessName = modifiedByApplicationSubProcessName;
  }


  public ClientAccountRegistration modifiedByUserId(String modifiedByUserId) {
    
    
    
    
    this.modifiedByUserId = modifiedByUserId;
    return this;
  }

   /**
   * Get modifiedByUserId
   * @return modifiedByUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModifiedByUserId() {
    return modifiedByUserId;
  }


  public void setModifiedByUserId(String modifiedByUserId) {
    
    
    
    this.modifiedByUserId = modifiedByUserId;
  }


  public ClientAccountRegistration client(Client client) {
    
    
    
    
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Client getClient() {
    return client;
  }


  public void setClient(Client client) {
    
    
    
    this.client = client;
  }


  public ClientAccountRegistration clientAccount(ClientAccount clientAccount) {
    
    
    
    
    this.clientAccount = clientAccount;
    return this;
  }

   /**
   * Get clientAccount
   * @return clientAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClientAccount getClientAccount() {
    return clientAccount;
  }


  public void setClientAccount(ClientAccount clientAccount) {
    
    
    
    this.clientAccount = clientAccount;
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
   * @return the ClientAccountRegistration instance itself
   */
  public ClientAccountRegistration putAdditionalProperty(String key, Object value) {
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
    ClientAccountRegistration clientAccountRegistration = (ClientAccountRegistration) o;
    return Objects.equals(this.id, clientAccountRegistration.id) &&
        Objects.equals(this.startDate, clientAccountRegistration.startDate) &&
        Objects.equals(this.endDate, clientAccountRegistration.endDate) &&
        Objects.equals(this.endReasonCode, clientAccountRegistration.endReasonCode) &&
        Objects.equals(this.createdDate, clientAccountRegistration.createdDate) &&
        Objects.equals(this.createdByApplicationName, clientAccountRegistration.createdByApplicationName) &&
        Objects.equals(this.createdByUserId, clientAccountRegistration.createdByUserId) &&
        Objects.equals(this.createdByApplicationSubProcessName, clientAccountRegistration.createdByApplicationSubProcessName) &&
        Objects.equals(this.modifiedDate, clientAccountRegistration.modifiedDate) &&
        Objects.equals(this.modifiedByApplicationName, clientAccountRegistration.modifiedByApplicationName) &&
        Objects.equals(this.modifiedByApplicationSubProcessName, clientAccountRegistration.modifiedByApplicationSubProcessName) &&
        Objects.equals(this.modifiedByUserId, clientAccountRegistration.modifiedByUserId) &&
        Objects.equals(this.client, clientAccountRegistration.client) &&
        Objects.equals(this.clientAccount, clientAccountRegistration.clientAccount)&&
        Objects.equals(this.additionalProperties, clientAccountRegistration.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startDate, endDate, endReasonCode, createdDate, createdByApplicationName, createdByUserId, createdByApplicationSubProcessName, modifiedDate, modifiedByApplicationName, modifiedByApplicationSubProcessName, modifiedByUserId, client, clientAccount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientAccountRegistration {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    endReasonCode: ").append(toIndentedString(endReasonCode)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdByApplicationName: ").append(toIndentedString(createdByApplicationName)).append("\n");
    sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
    sb.append("    createdByApplicationSubProcessName: ").append(toIndentedString(createdByApplicationSubProcessName)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    modifiedByApplicationName: ").append(toIndentedString(modifiedByApplicationName)).append("\n");
    sb.append("    modifiedByApplicationSubProcessName: ").append(toIndentedString(modifiedByApplicationSubProcessName)).append("\n");
    sb.append("    modifiedByUserId: ").append(toIndentedString(modifiedByUserId)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    clientAccount: ").append(toIndentedString(clientAccount)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("endReasonCode");
    openapiFields.add("createdDate");
    openapiFields.add("createdByApplicationName");
    openapiFields.add("createdByUserId");
    openapiFields.add("createdByApplicationSubProcessName");
    openapiFields.add("modifiedDate");
    openapiFields.add("modifiedByApplicationName");
    openapiFields.add("modifiedByApplicationSubProcessName");
    openapiFields.add("modifiedByUserId");
    openapiFields.add("client");
    openapiFields.add("clientAccount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ClientAccountRegistration
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ClientAccountRegistration.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClientAccountRegistration is not found in the empty JSON string", ClientAccountRegistration.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("endReasonCode") != null && !jsonObj.get("endReasonCode").isJsonNull()) && !jsonObj.get("endReasonCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endReasonCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endReasonCode").toString()));
      }
      if ((jsonObj.get("createdByApplicationName") != null && !jsonObj.get("createdByApplicationName").isJsonNull()) && !jsonObj.get("createdByApplicationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdByApplicationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdByApplicationName").toString()));
      }
      if ((jsonObj.get("createdByUserId") != null && !jsonObj.get("createdByUserId").isJsonNull()) && !jsonObj.get("createdByUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdByUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdByUserId").toString()));
      }
      if ((jsonObj.get("createdByApplicationSubProcessName") != null && !jsonObj.get("createdByApplicationSubProcessName").isJsonNull()) && !jsonObj.get("createdByApplicationSubProcessName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdByApplicationSubProcessName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdByApplicationSubProcessName").toString()));
      }
      if ((jsonObj.get("modifiedByApplicationName") != null && !jsonObj.get("modifiedByApplicationName").isJsonNull()) && !jsonObj.get("modifiedByApplicationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedByApplicationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedByApplicationName").toString()));
      }
      if ((jsonObj.get("modifiedByApplicationSubProcessName") != null && !jsonObj.get("modifiedByApplicationSubProcessName").isJsonNull()) && !jsonObj.get("modifiedByApplicationSubProcessName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedByApplicationSubProcessName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedByApplicationSubProcessName").toString()));
      }
      if ((jsonObj.get("modifiedByUserId") != null && !jsonObj.get("modifiedByUserId").isJsonNull()) && !jsonObj.get("modifiedByUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedByUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedByUserId").toString()));
      }
      // validate the optional field `client`
      if (jsonObj.get("client") != null && !jsonObj.get("client").isJsonNull()) {
        Client.validateJsonObject(jsonObj.getAsJsonObject("client"));
      }
      // validate the optional field `clientAccount`
      if (jsonObj.get("clientAccount") != null && !jsonObj.get("clientAccount").isJsonNull()) {
        ClientAccount.validateJsonObject(jsonObj.getAsJsonObject("clientAccount"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClientAccountRegistration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClientAccountRegistration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClientAccountRegistration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClientAccountRegistration.class));

       return (TypeAdapter<T>) new TypeAdapter<ClientAccountRegistration>() {
           @Override
           public void write(JsonWriter out, ClientAccountRegistration value) throws IOException {
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
           public ClientAccountRegistration read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ClientAccountRegistration instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ClientAccountRegistration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClientAccountRegistration
  * @throws IOException if the JSON string is invalid with respect to ClientAccountRegistration
  */
  public static ClientAccountRegistration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClientAccountRegistration.class);
  }

 /**
  * Convert an instance of ClientAccountRegistration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
