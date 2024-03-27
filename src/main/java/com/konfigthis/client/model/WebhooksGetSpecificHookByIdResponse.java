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
 * WebhooksGetSpecificHookByIdResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebhooksGetSpecificHookByIdResponse {
  public static final String SERIALIZED_NAME_HOOK_ID = "hookId";
  @SerializedName(SERIALIZED_NAME_HOOK_ID)
  private String hookId;

  public static final String SERIALIZED_NAME_COMPANY_ID = "companyId";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private String companyId;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_AUTH_TYPE = "authType";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private String authType;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private String createdDate;

  public static final String SERIALIZED_NAME_DOMAINS = "domains";
  @SerializedName(SERIALIZED_NAME_DOMAINS)
  private List<String> domains = null;

  public WebhooksGetSpecificHookByIdResponse() {
  }

  public WebhooksGetSpecificHookByIdResponse hookId(String hookId) {
    
    
    
    
    this.hookId = hookId;
    return this;
  }

   /**
   * Get hookId
   * @return hookId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OAUTH2_BASIC", value = "")

  public String getHookId() {
    return hookId;
  }


  public void setHookId(String hookId) {
    
    
    
    this.hookId = hookId;
  }


  public WebhooksGetSpecificHookByIdResponse companyId(String companyId) {
    
    
    
    
    this.companyId = companyId;
    return this;
  }

   /**
   * Get companyId
   * @return companyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99Z5V9BTI8J2FCGESC05", value = "")

  public String getCompanyId() {
    return companyId;
  }


  public void setCompanyId(String companyId) {
    
    
    
    this.companyId = companyId;
  }


  public WebhooksGetSpecificHookByIdResponse uri(String uri) {
    
    
    
    
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://789mw789x4.execute-api.us-east-2.amazonaws.com/messages", value = "")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    
    
    
    this.uri = uri;
  }


  public WebhooksGetSpecificHookByIdResponse authType(String authType) {
    
    
    
    
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OAUTH2_BASIC", value = "")

  public String getAuthType() {
    return authType;
  }


  public void setAuthType(String authType) {
    
    
    
    this.authType = authType;
  }


  public WebhooksGetSpecificHookByIdResponse createdDate(String createdDate) {
    
    
    
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-07-28T00:37:25.149Z", value = "")

  public String getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(String createdDate) {
    
    
    
    this.createdDate = createdDate;
  }


  public WebhooksGetSpecificHookByIdResponse domains(List<String> domains) {
    
    
    
    
    this.domains = domains;
    return this;
  }

  public WebhooksGetSpecificHookByIdResponse addDomainsItem(String domainsItem) {
    if (this.domains == null) {
      this.domains = new ArrayList<>();
    }
    this.domains.add(domainsItem);
    return this;
  }

   /**
   * Get domains
   * @return domains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDomains() {
    return domains;
  }


  public void setDomains(List<String> domains) {
    
    
    
    this.domains = domains;
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
   * @return the WebhooksGetSpecificHookByIdResponse instance itself
   */
  public WebhooksGetSpecificHookByIdResponse putAdditionalProperty(String key, Object value) {
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
    WebhooksGetSpecificHookByIdResponse webhooksGetSpecificHookByIdResponse = (WebhooksGetSpecificHookByIdResponse) o;
    return Objects.equals(this.hookId, webhooksGetSpecificHookByIdResponse.hookId) &&
        Objects.equals(this.companyId, webhooksGetSpecificHookByIdResponse.companyId) &&
        Objects.equals(this.uri, webhooksGetSpecificHookByIdResponse.uri) &&
        Objects.equals(this.authType, webhooksGetSpecificHookByIdResponse.authType) &&
        Objects.equals(this.createdDate, webhooksGetSpecificHookByIdResponse.createdDate) &&
        Objects.equals(this.domains, webhooksGetSpecificHookByIdResponse.domains)&&
        Objects.equals(this.additionalProperties, webhooksGetSpecificHookByIdResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hookId, companyId, uri, authType, createdDate, domains, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhooksGetSpecificHookByIdResponse {\n");
    sb.append("    hookId: ").append(toIndentedString(hookId)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
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
    openapiFields.add("hookId");
    openapiFields.add("companyId");
    openapiFields.add("uri");
    openapiFields.add("authType");
    openapiFields.add("createdDate");
    openapiFields.add("domains");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhooksGetSpecificHookByIdResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhooksGetSpecificHookByIdResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhooksGetSpecificHookByIdResponse is not found in the empty JSON string", WebhooksGetSpecificHookByIdResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("hookId") != null && !jsonObj.get("hookId").isJsonNull()) && !jsonObj.get("hookId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hookId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hookId").toString()));
      }
      if ((jsonObj.get("companyId") != null && !jsonObj.get("companyId").isJsonNull()) && !jsonObj.get("companyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyId").toString()));
      }
      if ((jsonObj.get("uri") != null && !jsonObj.get("uri").isJsonNull()) && !jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      if ((jsonObj.get("authType") != null && !jsonObj.get("authType").isJsonNull()) && !jsonObj.get("authType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authType").toString()));
      }
      if ((jsonObj.get("createdDate") != null && !jsonObj.get("createdDate").isJsonNull()) && !jsonObj.get("createdDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdDate").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("domains") != null && !jsonObj.get("domains").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `domains` to be an array in the JSON string but got `%s`", jsonObj.get("domains").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhooksGetSpecificHookByIdResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhooksGetSpecificHookByIdResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhooksGetSpecificHookByIdResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhooksGetSpecificHookByIdResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhooksGetSpecificHookByIdResponse>() {
           @Override
           public void write(JsonWriter out, WebhooksGetSpecificHookByIdResponse value) throws IOException {
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
           public WebhooksGetSpecificHookByIdResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebhooksGetSpecificHookByIdResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebhooksGetSpecificHookByIdResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhooksGetSpecificHookByIdResponse
  * @throws IOException if the JSON string is invalid with respect to WebhooksGetSpecificHookByIdResponse
  */
  public static WebhooksGetSpecificHookByIdResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhooksGetSpecificHookByIdResponse.class);
  }

 /**
  * Convert an instance of WebhooksGetSpecificHookByIdResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

