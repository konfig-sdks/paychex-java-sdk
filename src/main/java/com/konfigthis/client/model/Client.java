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
import com.konfigthis.client.model.ClientAccountRelation;
import com.konfigthis.client.model.ClientAddress;
import com.konfigthis.client.model.ClientName;
import com.konfigthis.client.model.ClientVersion;
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
 * Client
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Client {
  public static final String SERIALIZED_NAME_LOCK_VERSION = "lockVersion";
  @SerializedName(SERIALIZED_NAME_LOCK_VERSION)
  private Long lockVersion;

  public static final String SERIALIZED_NAME_CREATED_BY_APPLICATION_NAME = "createdByApplicationName";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_APPLICATION_NAME)
  private String createdByApplicationName;

  public static final String SERIALIZED_NAME_CREATED_BY_USER_ID = "createdByUserId";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_USER_ID)
  private String createdByUserId;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_CREATED_BY_APPLICATION_SUB_PROCESS_NAME = "createdByApplicationSubProcessName";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_APPLICATION_SUB_PROCESS_NAME)
  private String createdByApplicationSubProcessName;

  public static final String SERIALIZED_NAME_CLIENT_ACCOUNT_RELATIONS = "clientAccountRelations";
  @SerializedName(SERIALIZED_NAME_CLIENT_ACCOUNT_RELATIONS)
  private List<ClientAccountRelation> clientAccountRelations = null;

  public static final String SERIALIZED_NAME_CLIENT_ADDRESSES = "clientAddresses";
  @SerializedName(SERIALIZED_NAME_CLIENT_ADDRESSES)
  private List<ClientAddress> clientAddresses = null;

  public static final String SERIALIZED_NAME_CLIENT_NAMES = "clientNames";
  @SerializedName(SERIALIZED_NAME_CLIENT_NAMES)
  private List<ClientName> clientNames = null;

  public static final String SERIALIZED_NAME_CLIENT_VERSIONS = "clientVersions";
  @SerializedName(SERIALIZED_NAME_CLIENT_VERSIONS)
  private List<ClientVersion> clientVersions = null;

  public static final String SERIALIZED_NAME_CEID = "ceid";
  @SerializedName(SERIALIZED_NAME_CEID)
  private String ceid;

  public Client() {
  }

  public Client lockVersion(Long lockVersion) {
    
    
    
    
    this.lockVersion = lockVersion;
    return this;
  }

   /**
   * Get lockVersion
   * @return lockVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getLockVersion() {
    return lockVersion;
  }


  public void setLockVersion(Long lockVersion) {
    
    
    
    this.lockVersion = lockVersion;
  }


  public Client createdByApplicationName(String createdByApplicationName) {
    
    
    
    
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


  public Client createdByUserId(String createdByUserId) {
    
    
    
    
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


  public Client createdDate(OffsetDateTime createdDate) {
    
    
    
    
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


  public Client createdByApplicationSubProcessName(String createdByApplicationSubProcessName) {
    
    
    
    
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


  public Client clientAccountRelations(List<ClientAccountRelation> clientAccountRelations) {
    
    
    
    
    this.clientAccountRelations = clientAccountRelations;
    return this;
  }

  public Client addClientAccountRelationsItem(ClientAccountRelation clientAccountRelationsItem) {
    if (this.clientAccountRelations == null) {
      this.clientAccountRelations = new ArrayList<>();
    }
    this.clientAccountRelations.add(clientAccountRelationsItem);
    return this;
  }

   /**
   * Get clientAccountRelations
   * @return clientAccountRelations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ClientAccountRelation> getClientAccountRelations() {
    return clientAccountRelations;
  }


  public void setClientAccountRelations(List<ClientAccountRelation> clientAccountRelations) {
    
    
    
    this.clientAccountRelations = clientAccountRelations;
  }


  public Client clientAddresses(List<ClientAddress> clientAddresses) {
    
    
    
    
    this.clientAddresses = clientAddresses;
    return this;
  }

  public Client addClientAddressesItem(ClientAddress clientAddressesItem) {
    if (this.clientAddresses == null) {
      this.clientAddresses = new ArrayList<>();
    }
    this.clientAddresses.add(clientAddressesItem);
    return this;
  }

   /**
   * Get clientAddresses
   * @return clientAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ClientAddress> getClientAddresses() {
    return clientAddresses;
  }


  public void setClientAddresses(List<ClientAddress> clientAddresses) {
    
    
    
    this.clientAddresses = clientAddresses;
  }


  public Client clientNames(List<ClientName> clientNames) {
    
    
    
    
    this.clientNames = clientNames;
    return this;
  }

  public Client addClientNamesItem(ClientName clientNamesItem) {
    if (this.clientNames == null) {
      this.clientNames = new ArrayList<>();
    }
    this.clientNames.add(clientNamesItem);
    return this;
  }

   /**
   * Get clientNames
   * @return clientNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ClientName> getClientNames() {
    return clientNames;
  }


  public void setClientNames(List<ClientName> clientNames) {
    
    
    
    this.clientNames = clientNames;
  }


  public Client clientVersions(List<ClientVersion> clientVersions) {
    
    
    
    
    this.clientVersions = clientVersions;
    return this;
  }

  public Client addClientVersionsItem(ClientVersion clientVersionsItem) {
    if (this.clientVersions == null) {
      this.clientVersions = new ArrayList<>();
    }
    this.clientVersions.add(clientVersionsItem);
    return this;
  }

   /**
   * Get clientVersions
   * @return clientVersions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ClientVersion> getClientVersions() {
    return clientVersions;
  }


  public void setClientVersions(List<ClientVersion> clientVersions) {
    
    
    
    this.clientVersions = clientVersions;
  }


  public Client ceid(String ceid) {
    
    
    
    
    this.ceid = ceid;
    return this;
  }

   /**
   * Get ceid
   * @return ceid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCeid() {
    return ceid;
  }


  public void setCeid(String ceid) {
    
    
    
    this.ceid = ceid;
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
   * @return the Client instance itself
   */
  public Client putAdditionalProperty(String key, Object value) {
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
    Client client = (Client) o;
    return Objects.equals(this.lockVersion, client.lockVersion) &&
        Objects.equals(this.createdByApplicationName, client.createdByApplicationName) &&
        Objects.equals(this.createdByUserId, client.createdByUserId) &&
        Objects.equals(this.createdDate, client.createdDate) &&
        Objects.equals(this.createdByApplicationSubProcessName, client.createdByApplicationSubProcessName) &&
        Objects.equals(this.clientAccountRelations, client.clientAccountRelations) &&
        Objects.equals(this.clientAddresses, client.clientAddresses) &&
        Objects.equals(this.clientNames, client.clientNames) &&
        Objects.equals(this.clientVersions, client.clientVersions) &&
        Objects.equals(this.ceid, client.ceid)&&
        Objects.equals(this.additionalProperties, client.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lockVersion, createdByApplicationName, createdByUserId, createdDate, createdByApplicationSubProcessName, clientAccountRelations, clientAddresses, clientNames, clientVersions, ceid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Client {\n");
    sb.append("    lockVersion: ").append(toIndentedString(lockVersion)).append("\n");
    sb.append("    createdByApplicationName: ").append(toIndentedString(createdByApplicationName)).append("\n");
    sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdByApplicationSubProcessName: ").append(toIndentedString(createdByApplicationSubProcessName)).append("\n");
    sb.append("    clientAccountRelations: ").append(toIndentedString(clientAccountRelations)).append("\n");
    sb.append("    clientAddresses: ").append(toIndentedString(clientAddresses)).append("\n");
    sb.append("    clientNames: ").append(toIndentedString(clientNames)).append("\n");
    sb.append("    clientVersions: ").append(toIndentedString(clientVersions)).append("\n");
    sb.append("    ceid: ").append(toIndentedString(ceid)).append("\n");
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
    openapiFields.add("lockVersion");
    openapiFields.add("createdByApplicationName");
    openapiFields.add("createdByUserId");
    openapiFields.add("createdDate");
    openapiFields.add("createdByApplicationSubProcessName");
    openapiFields.add("clientAccountRelations");
    openapiFields.add("clientAddresses");
    openapiFields.add("clientNames");
    openapiFields.add("clientVersions");
    openapiFields.add("ceid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Client
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Client.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Client is not found in the empty JSON string", Client.openapiRequiredFields.toString()));
        }
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
      if (jsonObj.get("clientAccountRelations") != null && !jsonObj.get("clientAccountRelations").isJsonNull()) {
        JsonArray jsonArrayclientAccountRelations = jsonObj.getAsJsonArray("clientAccountRelations");
        if (jsonArrayclientAccountRelations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("clientAccountRelations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `clientAccountRelations` to be an array in the JSON string but got `%s`", jsonObj.get("clientAccountRelations").toString()));
          }

          // validate the optional field `clientAccountRelations` (array)
          for (int i = 0; i < jsonArrayclientAccountRelations.size(); i++) {
            ClientAccountRelation.validateJsonObject(jsonArrayclientAccountRelations.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("clientAddresses") != null && !jsonObj.get("clientAddresses").isJsonNull()) {
        JsonArray jsonArrayclientAddresses = jsonObj.getAsJsonArray("clientAddresses");
        if (jsonArrayclientAddresses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("clientAddresses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `clientAddresses` to be an array in the JSON string but got `%s`", jsonObj.get("clientAddresses").toString()));
          }

          // validate the optional field `clientAddresses` (array)
          for (int i = 0; i < jsonArrayclientAddresses.size(); i++) {
            ClientAddress.validateJsonObject(jsonArrayclientAddresses.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("clientNames") != null && !jsonObj.get("clientNames").isJsonNull()) {
        JsonArray jsonArrayclientNames = jsonObj.getAsJsonArray("clientNames");
        if (jsonArrayclientNames != null) {
          // ensure the json data is an array
          if (!jsonObj.get("clientNames").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `clientNames` to be an array in the JSON string but got `%s`", jsonObj.get("clientNames").toString()));
          }

          // validate the optional field `clientNames` (array)
          for (int i = 0; i < jsonArrayclientNames.size(); i++) {
            ClientName.validateJsonObject(jsonArrayclientNames.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("clientVersions") != null && !jsonObj.get("clientVersions").isJsonNull()) {
        JsonArray jsonArrayclientVersions = jsonObj.getAsJsonArray("clientVersions");
        if (jsonArrayclientVersions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("clientVersions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `clientVersions` to be an array in the JSON string but got `%s`", jsonObj.get("clientVersions").toString()));
          }

          // validate the optional field `clientVersions` (array)
          for (int i = 0; i < jsonArrayclientVersions.size(); i++) {
            ClientVersion.validateJsonObject(jsonArrayclientVersions.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("ceid") != null && !jsonObj.get("ceid").isJsonNull()) && !jsonObj.get("ceid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ceid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ceid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Client.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Client' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Client> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Client.class));

       return (TypeAdapter<T>) new TypeAdapter<Client>() {
           @Override
           public void write(JsonWriter out, Client value) throws IOException {
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
           public Client read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Client instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Client given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Client
  * @throws IOException if the JSON string is invalid with respect to Client
  */
  public static Client fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Client.class);
  }

 /**
  * Convert an instance of Client to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

