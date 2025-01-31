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
 * The state representation of Labor Assignments within a company.
 */
@ApiModel(description = "The state representation of Labor Assignments within a company.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LaborAssignmentResource {
  public static final String SERIALIZED_NAME_LABOR_ASSIGNMENT_ID = "laborAssignmentId";
  @SerializedName(SERIALIZED_NAME_LABOR_ASSIGNMENT_ID)
  private String laborAssignmentId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organizationId";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private String organizationId;

  public static final String SERIALIZED_NAME_POSITION_ID = "positionId";
  @SerializedName(SERIALIZED_NAME_POSITION_ID)
  private String positionId;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;

  public static final String SERIALIZED_NAME_LOCATION_ID = "locationId";
  @SerializedName(SERIALIZED_NAME_LOCATION_ID)
  private String locationId;

  public LaborAssignmentResource() {
  }

  public LaborAssignmentResource laborAssignmentId(String laborAssignmentId) {
    
    
    
    
    this.laborAssignmentId = laborAssignmentId;
    return this;
  }

   /**
   * The unique identifier associated with this labor assignment representation.
   * @return laborAssignmentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "970001701620720", value = "The unique identifier associated with this labor assignment representation.")

  public String getLaborAssignmentId() {
    return laborAssignmentId;
  }


  public void setLaborAssignmentId(String laborAssignmentId) {
    
    
    
    this.laborAssignmentId = laborAssignmentId;
  }


  public LaborAssignmentResource name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the labor assignment.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Assignment 3", value = "The name of the labor assignment.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public LaborAssignmentResource startDate(OffsetDateTime startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date associated with this labor assignment.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-01-24T00:00Z", value = "The start date associated with this labor assignment.")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    
    
    
    this.startDate = startDate;
  }


  public LaborAssignmentResource endDate(OffsetDateTime endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date associated with this labor assignment.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2029-12-24T00:00Z", value = "The end date associated with this labor assignment.")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    
    
    
    this.endDate = endDate;
  }


  public LaborAssignmentResource organizationId(String organizationId) {
    
    
    
    
    this.organizationId = organizationId;
    return this;
  }

   /**
   * The organization associated with this labor assignment.
   * @return organizationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "970001701620691", value = "The organization associated with this labor assignment.")

  public String getOrganizationId() {
    return organizationId;
  }


  public void setOrganizationId(String organizationId) {
    
    
    
    this.organizationId = organizationId;
  }


  public LaborAssignmentResource positionId(String positionId) {
    
    
    
    
    this.positionId = positionId;
    return this;
  }

   /**
   * The position associated with this labor assignment.
   * @return positionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "970000180782611", value = "The position associated with this labor assignment.")

  public String getPositionId() {
    return positionId;
  }


  public void setPositionId(String positionId) {
    
    
    
    this.positionId = positionId;
  }


  public LaborAssignmentResource links(List<Link> links) {
    
    
    
    
    this.links = links;
    return this;
  }

  public LaborAssignmentResource addLinksItem(Link linksItem) {
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


  public LaborAssignmentResource locationId(String locationId) {
    
    
    
    
    this.locationId = locationId;
    return this;
  }

   /**
   * The locations associated with this labor assignment.
   * @return locationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "970001701620683", value = "The locations associated with this labor assignment.")

  public String getLocationId() {
    return locationId;
  }


  public void setLocationId(String locationId) {
    
    
    
    this.locationId = locationId;
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
   * @return the LaborAssignmentResource instance itself
   */
  public LaborAssignmentResource putAdditionalProperty(String key, Object value) {
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
    LaborAssignmentResource laborAssignmentResource = (LaborAssignmentResource) o;
    return Objects.equals(this.laborAssignmentId, laborAssignmentResource.laborAssignmentId) &&
        Objects.equals(this.name, laborAssignmentResource.name) &&
        Objects.equals(this.startDate, laborAssignmentResource.startDate) &&
        Objects.equals(this.endDate, laborAssignmentResource.endDate) &&
        Objects.equals(this.organizationId, laborAssignmentResource.organizationId) &&
        Objects.equals(this.positionId, laborAssignmentResource.positionId) &&
        Objects.equals(this.links, laborAssignmentResource.links) &&
        Objects.equals(this.locationId, laborAssignmentResource.locationId)&&
        Objects.equals(this.additionalProperties, laborAssignmentResource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(laborAssignmentId, name, startDate, endDate, organizationId, positionId, links, locationId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LaborAssignmentResource {\n");
    sb.append("    laborAssignmentId: ").append(toIndentedString(laborAssignmentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    positionId: ").append(toIndentedString(positionId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
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
    openapiFields.add("laborAssignmentId");
    openapiFields.add("name");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("organizationId");
    openapiFields.add("positionId");
    openapiFields.add("links");
    openapiFields.add("locationId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LaborAssignmentResource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LaborAssignmentResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LaborAssignmentResource is not found in the empty JSON string", LaborAssignmentResource.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("laborAssignmentId") != null && !jsonObj.get("laborAssignmentId").isJsonNull()) && !jsonObj.get("laborAssignmentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `laborAssignmentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("laborAssignmentId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("organizationId") != null && !jsonObj.get("organizationId").isJsonNull()) && !jsonObj.get("organizationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organizationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organizationId").toString()));
      }
      if ((jsonObj.get("positionId") != null && !jsonObj.get("positionId").isJsonNull()) && !jsonObj.get("positionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `positionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("positionId").toString()));
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
      if ((jsonObj.get("locationId") != null && !jsonObj.get("locationId").isJsonNull()) && !jsonObj.get("locationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LaborAssignmentResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LaborAssignmentResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LaborAssignmentResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LaborAssignmentResource.class));

       return (TypeAdapter<T>) new TypeAdapter<LaborAssignmentResource>() {
           @Override
           public void write(JsonWriter out, LaborAssignmentResource value) throws IOException {
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
           public LaborAssignmentResource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LaborAssignmentResource instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LaborAssignmentResource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LaborAssignmentResource
  * @throws IOException if the JSON string is invalid with respect to LaborAssignmentResource
  */
  public static LaborAssignmentResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LaborAssignmentResource.class);
  }

 /**
  * Convert an instance of LaborAssignmentResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

