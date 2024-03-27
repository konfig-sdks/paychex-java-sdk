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
import com.konfigthis.client.model.ClientNameVersion;
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
 * ClientName
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ClientName {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

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

  public static final String SERIALIZED_NAME_CLIENTS = "clients";
  @SerializedName(SERIALIZED_NAME_CLIENTS)
  private Client clients;

  public static final String SERIALIZED_NAME_CLIENT_NAME_VERSIONS = "clientNameVersions";
  @SerializedName(SERIALIZED_NAME_CLIENT_NAME_VERSIONS)
  private List<ClientNameVersion> clientNameVersions = null;

  public ClientName() {
  }

  public ClientName id(Long id) {
    
    
    
    
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


  public ClientName type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public ClientName createdDate(OffsetDateTime createdDate) {
    
    
    
    
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


  public ClientName createdByApplicationName(String createdByApplicationName) {
    
    
    
    
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


  public ClientName createdByUserId(String createdByUserId) {
    
    
    
    
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


  public ClientName createdByApplicationSubProcessName(String createdByApplicationSubProcessName) {
    
    
    
    
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


  public ClientName clients(Client clients) {
    
    
    
    
    this.clients = clients;
    return this;
  }

   /**
   * Get clients
   * @return clients
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Client getClients() {
    return clients;
  }


  public void setClients(Client clients) {
    
    
    
    this.clients = clients;
  }


  public ClientName clientNameVersions(List<ClientNameVersion> clientNameVersions) {
    
    
    
    
    this.clientNameVersions = clientNameVersions;
    return this;
  }

  public ClientName addClientNameVersionsItem(ClientNameVersion clientNameVersionsItem) {
    if (this.clientNameVersions == null) {
      this.clientNameVersions = new ArrayList<>();
    }
    this.clientNameVersions.add(clientNameVersionsItem);
    return this;
  }

   /**
   * Get clientNameVersions
   * @return clientNameVersions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ClientNameVersion> getClientNameVersions() {
    return clientNameVersions;
  }


  public void setClientNameVersions(List<ClientNameVersion> clientNameVersions) {
    
    
    
    this.clientNameVersions = clientNameVersions;
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
   * @return the ClientName instance itself
   */
  public ClientName putAdditionalProperty(String key, Object value) {
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
    ClientName clientName = (ClientName) o;
    return Objects.equals(this.id, clientName.id) &&
        Objects.equals(this.type, clientName.type) &&
        Objects.equals(this.createdDate, clientName.createdDate) &&
        Objects.equals(this.createdByApplicationName, clientName.createdByApplicationName) &&
        Objects.equals(this.createdByUserId, clientName.createdByUserId) &&
        Objects.equals(this.createdByApplicationSubProcessName, clientName.createdByApplicationSubProcessName) &&
        Objects.equals(this.clients, clientName.clients) &&
        Objects.equals(this.clientNameVersions, clientName.clientNameVersions)&&
        Objects.equals(this.additionalProperties, clientName.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, createdDate, createdByApplicationName, createdByUserId, createdByApplicationSubProcessName, clients, clientNameVersions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientName {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdByApplicationName: ").append(toIndentedString(createdByApplicationName)).append("\n");
    sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
    sb.append("    createdByApplicationSubProcessName: ").append(toIndentedString(createdByApplicationSubProcessName)).append("\n");
    sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
    sb.append("    clientNameVersions: ").append(toIndentedString(clientNameVersions)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("createdDate");
    openapiFields.add("createdByApplicationName");
    openapiFields.add("createdByUserId");
    openapiFields.add("createdByApplicationSubProcessName");
    openapiFields.add("clients");
    openapiFields.add("clientNameVersions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ClientName
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ClientName.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClientName is not found in the empty JSON string", ClientName.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
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
      // validate the optional field `clients`
      if (jsonObj.get("clients") != null && !jsonObj.get("clients").isJsonNull()) {
        Client.validateJsonObject(jsonObj.getAsJsonObject("clients"));
      }
      if (jsonObj.get("clientNameVersions") != null && !jsonObj.get("clientNameVersions").isJsonNull()) {
        JsonArray jsonArrayclientNameVersions = jsonObj.getAsJsonArray("clientNameVersions");
        if (jsonArrayclientNameVersions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("clientNameVersions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `clientNameVersions` to be an array in the JSON string but got `%s`", jsonObj.get("clientNameVersions").toString()));
          }

          // validate the optional field `clientNameVersions` (array)
          for (int i = 0; i < jsonArrayclientNameVersions.size(); i++) {
            ClientNameVersion.validateJsonObject(jsonArrayclientNameVersions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClientName.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClientName' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClientName> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClientName.class));

       return (TypeAdapter<T>) new TypeAdapter<ClientName>() {
           @Override
           public void write(JsonWriter out, ClientName value) throws IOException {
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
           public ClientName read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ClientName instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ClientName given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClientName
  * @throws IOException if the JSON string is invalid with respect to ClientName
  */
  public static ClientName fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClientName.class);
  }

 /**
  * Convert an instance of ClientName to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

