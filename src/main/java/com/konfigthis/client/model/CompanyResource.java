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
import com.konfigthis.client.model.CommunicationResource;
import com.konfigthis.client.model.LegalIdResource;
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
 * The state representation of a company
 */
@ApiModel(description = "The state representation of a company")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CompanyResource {
  public static final String SERIALIZED_NAME_COMPANY_ID = "companyId";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private String companyId;

  public static final String SERIALIZED_NAME_DISPLAY_ID = "displayId";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ID)
  private String displayId;

  public static final String SERIALIZED_NAME_LEGAL_NAME = "legalName";
  @SerializedName(SERIALIZED_NAME_LEGAL_NAME)
  private String legalName;

  public static final String SERIALIZED_NAME_LEGAL_ID = "legalId";
  @SerializedName(SERIALIZED_NAME_LEGAL_ID)
  private LegalIdResource legalId;

  public static final String SERIALIZED_NAME_COMMUNICATIONS = "communications";
  @SerializedName(SERIALIZED_NAME_COMMUNICATIONS)
  private List<CommunicationResource> communications = null;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;

  public CompanyResource() {
  }

  public CompanyResource companyId(String companyId) {
    
    
    
    
    this.companyId = companyId;
    return this;
  }

   /**
   * The unique identifier associated with this companies representation.
   * @return companyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99Z5V9BTI8J2FCGESC05", value = "The unique identifier associated with this companies representation.")

  public String getCompanyId() {
    return companyId;
  }


  public void setCompanyId(String companyId) {
    
    
    
    this.companyId = companyId;
  }


  public CompanyResource displayId(String displayId) {
    
    
    
    
    this.displayId = displayId;
    return this;
  }

   /**
   * The client account number used for identification purposes. (no dash or spaces allowed, only the last 8 characters  of the ID)
   * @return displayId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "09620579", value = "The client account number used for identification purposes. (no dash or spaces allowed, only the last 8 characters  of the ID)")

  public String getDisplayId() {
    return displayId;
  }


  public void setDisplayId(String displayId) {
    
    
    
    this.displayId = displayId;
  }


  public CompanyResource legalName(String legalName) {
    
    
    
    
    this.legalName = legalName;
    return this;
  }

   /**
   * The legal name of the company.
   * @return legalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Monsters, Inc", value = "The legal name of the company.")

  public String getLegalName() {
    return legalName;
  }


  public void setLegalName(String legalName) {
    
    
    
    this.legalName = legalName;
  }


  public CompanyResource legalId(LegalIdResource legalId) {
    
    
    
    
    this.legalId = legalId;
    return this;
  }

   /**
   * Get legalId
   * @return legalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LegalIdResource getLegalId() {
    return legalId;
  }


  public void setLegalId(LegalIdResource legalId) {
    
    
    
    this.legalId = legalId;
  }


  public CompanyResource communications(List<CommunicationResource> communications) {
    
    
    
    
    this.communications = communications;
    return this;
  }

  public CompanyResource addCommunicationsItem(CommunicationResource communicationsItem) {
    if (this.communications == null) {
      this.communications = new ArrayList<>();
    }
    this.communications.add(communicationsItem);
    return this;
  }

   /**
   * Get communications
   * @return communications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CommunicationResource> getCommunications() {
    return communications;
  }


  public void setCommunications(List<CommunicationResource> communications) {
    
    
    
    this.communications = communications;
  }


  public CompanyResource links(List<Link> links) {
    
    
    
    
    this.links = links;
    return this;
  }

  public CompanyResource addLinksItem(Link linksItem) {
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
   * @return the CompanyResource instance itself
   */
  public CompanyResource putAdditionalProperty(String key, Object value) {
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
    CompanyResource companyResource = (CompanyResource) o;
    return Objects.equals(this.companyId, companyResource.companyId) &&
        Objects.equals(this.displayId, companyResource.displayId) &&
        Objects.equals(this.legalName, companyResource.legalName) &&
        Objects.equals(this.legalId, companyResource.legalId) &&
        Objects.equals(this.communications, companyResource.communications) &&
        Objects.equals(this.links, companyResource.links)&&
        Objects.equals(this.additionalProperties, companyResource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, displayId, legalName, legalId, communications, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyResource {\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    displayId: ").append(toIndentedString(displayId)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    legalId: ").append(toIndentedString(legalId)).append("\n");
    sb.append("    communications: ").append(toIndentedString(communications)).append("\n");
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
    openapiFields.add("companyId");
    openapiFields.add("displayId");
    openapiFields.add("legalName");
    openapiFields.add("legalId");
    openapiFields.add("communications");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CompanyResource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CompanyResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CompanyResource is not found in the empty JSON string", CompanyResource.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("companyId") != null && !jsonObj.get("companyId").isJsonNull()) && !jsonObj.get("companyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyId").toString()));
      }
      if ((jsonObj.get("displayId") != null && !jsonObj.get("displayId").isJsonNull()) && !jsonObj.get("displayId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayId").toString()));
      }
      if ((jsonObj.get("legalName") != null && !jsonObj.get("legalName").isJsonNull()) && !jsonObj.get("legalName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legalName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legalName").toString()));
      }
      // validate the optional field `legalId`
      if (jsonObj.get("legalId") != null && !jsonObj.get("legalId").isJsonNull()) {
        LegalIdResource.validateJsonObject(jsonObj.getAsJsonObject("legalId"));
      }
      if (jsonObj.get("communications") != null && !jsonObj.get("communications").isJsonNull()) {
        JsonArray jsonArraycommunications = jsonObj.getAsJsonArray("communications");
        if (jsonArraycommunications != null) {
          // ensure the json data is an array
          if (!jsonObj.get("communications").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `communications` to be an array in the JSON string but got `%s`", jsonObj.get("communications").toString()));
          }

          // validate the optional field `communications` (array)
          for (int i = 0; i < jsonArraycommunications.size(); i++) {
            CommunicationResource.validateJsonObject(jsonArraycommunications.get(i).getAsJsonObject());
          };
        }
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
       if (!CompanyResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CompanyResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CompanyResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CompanyResource.class));

       return (TypeAdapter<T>) new TypeAdapter<CompanyResource>() {
           @Override
           public void write(JsonWriter out, CompanyResource value) throws IOException {
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
           public CompanyResource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CompanyResource instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CompanyResource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CompanyResource
  * @throws IOException if the JSON string is invalid with respect to CompanyResource
  */
  public static CompanyResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CompanyResource.class);
  }

 /**
  * Convert an instance of CompanyResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
