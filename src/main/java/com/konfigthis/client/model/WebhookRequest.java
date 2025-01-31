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
import com.konfigthis.client.model.Authentication1;
import com.konfigthis.client.model.Link;
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
 * This resource is for registering/unregistering webhooks.
 */
@ApiModel(description = "This resource is for registering/unregistering webhooks.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebhookRequest {
  public static final String SERIALIZED_NAME_HOOK_ID = "hookId";
  @SerializedName(SERIALIZED_NAME_HOOK_ID)
  private String hookId;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_COMPANY_ID = "companyId";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private String companyId;

  public static final String SERIALIZED_NAME_AUTHENTICATION = "authentication";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION)
  private Authentication1 authentication;

  public static final String SERIALIZED_NAME_DOMAINS = "domains";
  @SerializedName(SERIALIZED_NAME_DOMAINS)
  private List<String> domains = new ArrayList<>();

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;

  public WebhookRequest() {
  }

  public WebhookRequest hookId(String hookId) {
    
    
    
    
    this.hookId = hookId;
    return this;
  }

   /**
   * The unique identifier associated with this webhook. Not required for Posting.
   * @return hookId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier associated with this webhook. Not required for Posting.")

  public String getHookId() {
    return hookId;
  }


  public void setHookId(String hookId) {
    
    
    
    this.hookId = hookId;
  }


  public WebhookRequest uri(String uri) {
    
    
    
    
    this.uri = uri;
    return this;
  }

   /**
   * Enter a valid URL for the webhook to receive events.
   * @return uri
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Enter a valid URL for the webhook to receive events.")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    
    
    
    this.uri = uri;
  }


  public WebhookRequest companyId(String companyId) {
    
    
    
    
    this.companyId = companyId;
    return this;
  }

   /**
   * ID associated with desired company that will receive the webhook notifications. NOTE: If no Company ID is provided in the POST, then all companies linked to the app will receive notifications.
   * @return companyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID associated with desired company that will receive the webhook notifications. NOTE: If no Company ID is provided in the POST, then all companies linked to the app will receive notifications.")

  public String getCompanyId() {
    return companyId;
  }


  public void setCompanyId(String companyId) {
    
    
    
    this.companyId = companyId;
  }


  public WebhookRequest authentication(Authentication1 authentication) {
    
    
    
    
    this.authentication = authentication;
    return this;
  }

   /**
   * Get authentication
   * @return authentication
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Authentication1 getAuthentication() {
    return authentication;
  }


  public void setAuthentication(Authentication1 authentication) {
    
    
    
    this.authentication = authentication;
  }


  public WebhookRequest domains(List<String> domains) {
    
    
    
    
    this.domains = domains;
    return this;
  }

  public WebhookRequest addDomainsItem(String domainsItem) {
    this.domains.add(domainsItem);
    return this;
  }

   /**
   * List of available domains to register to. Refer to webhook documentation https://developer.paychex.com/documentation#operation/domains.
   * @return domains
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of available domains to register to. Refer to webhook documentation https://developer.paychex.com/documentation#operation/domains.")

  public List<String> getDomains() {
    return domains;
  }


  public void setDomains(List<String> domains) {
    
    
    
    this.domains = domains;
  }


  public WebhookRequest links(List<Link> links) {
    
    
    
    
    this.links = links;
    return this;
  }

  public WebhookRequest addLinksItem(Link linksItem) {
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
   * @return the WebhookRequest instance itself
   */
  public WebhookRequest putAdditionalProperty(String key, Object value) {
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
    WebhookRequest webhookRequest = (WebhookRequest) o;
    return Objects.equals(this.hookId, webhookRequest.hookId) &&
        Objects.equals(this.uri, webhookRequest.uri) &&
        Objects.equals(this.companyId, webhookRequest.companyId) &&
        Objects.equals(this.authentication, webhookRequest.authentication) &&
        Objects.equals(this.domains, webhookRequest.domains) &&
        Objects.equals(this.links, webhookRequest.links)&&
        Objects.equals(this.additionalProperties, webhookRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hookId, uri, companyId, authentication, domains, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookRequest {\n");
    sb.append("    hookId: ").append(toIndentedString(hookId)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
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
    openapiFields.add("hookId");
    openapiFields.add("uri");
    openapiFields.add("companyId");
    openapiFields.add("authentication");
    openapiFields.add("domains");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uri");
    openapiRequiredFields.add("authentication");
    openapiRequiredFields.add("domains");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookRequest is not found in the empty JSON string", WebhookRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("hookId") != null && !jsonObj.get("hookId").isJsonNull()) && !jsonObj.get("hookId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hookId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hookId").toString()));
      }
      if (!jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      if ((jsonObj.get("companyId") != null && !jsonObj.get("companyId").isJsonNull()) && !jsonObj.get("companyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyId").toString()));
      }
      // validate the required field `authentication`
      Authentication1.validateJsonObject(jsonObj.getAsJsonObject("authentication"));
      // ensure the required json array is present
      if (jsonObj.get("domains") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("domains").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `domains` to be an array in the JSON string but got `%s`", jsonObj.get("domains").toString()));
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
       if (!WebhookRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookRequest>() {
           @Override
           public void write(JsonWriter out, WebhookRequest value) throws IOException {
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
           public WebhookRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebhookRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebhookRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookRequest
  * @throws IOException if the JSON string is invalid with respect to WebhookRequest
  */
  public static WebhookRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookRequest.class);
  }

 /**
  * Convert an instance of WebhookRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

