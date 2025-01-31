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
 * JobSegmentsConfigResource
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class JobSegmentsConfigResource {
  public static final String SERIALIZED_NAME_SEGMENT_NUMBER = "segmentNumber";
  @SerializedName(SERIALIZED_NAME_SEGMENT_NUMBER)
  private Integer segmentNumber;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SEGMENT_LENGTH = "segmentLength";
  @SerializedName(SERIALIZED_NAME_SEGMENT_LENGTH)
  private Integer segmentLength;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;

  public JobSegmentsConfigResource() {
  }

  public JobSegmentsConfigResource segmentNumber(Integer segmentNumber) {
    
    
    
    
    this.segmentNumber = segmentNumber;
    return this;
  }

   /**
   * Segment Number
   * @return segmentNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Segment Number")

  public Integer getSegmentNumber() {
    return segmentNumber;
  }


  public void setSegmentNumber(Integer segmentNumber) {
    
    
    
    this.segmentNumber = segmentNumber;
  }


  public JobSegmentsConfigResource name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Segment Name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Service Code", value = "Segment Name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public JobSegmentsConfigResource segmentLength(Integer segmentLength) {
    
    
    
    
    this.segmentLength = segmentLength;
    return this;
  }

   /**
   * Segment Length
   * @return segmentLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "Segment Length")

  public Integer getSegmentLength() {
    return segmentLength;
  }


  public void setSegmentLength(Integer segmentLength) {
    
    
    
    this.segmentLength = segmentLength;
  }


  public JobSegmentsConfigResource links(List<Link> links) {
    
    
    
    
    this.links = links;
    return this;
  }

  public JobSegmentsConfigResource addLinksItem(Link linksItem) {
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
   * @return the JobSegmentsConfigResource instance itself
   */
  public JobSegmentsConfigResource putAdditionalProperty(String key, Object value) {
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
    JobSegmentsConfigResource jobSegmentsConfigResource = (JobSegmentsConfigResource) o;
    return Objects.equals(this.segmentNumber, jobSegmentsConfigResource.segmentNumber) &&
        Objects.equals(this.name, jobSegmentsConfigResource.name) &&
        Objects.equals(this.segmentLength, jobSegmentsConfigResource.segmentLength) &&
        Objects.equals(this.links, jobSegmentsConfigResource.links)&&
        Objects.equals(this.additionalProperties, jobSegmentsConfigResource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentNumber, name, segmentLength, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobSegmentsConfigResource {\n");
    sb.append("    segmentNumber: ").append(toIndentedString(segmentNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    segmentLength: ").append(toIndentedString(segmentLength)).append("\n");
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
    openapiFields.add("segmentNumber");
    openapiFields.add("name");
    openapiFields.add("segmentLength");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobSegmentsConfigResource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JobSegmentsConfigResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobSegmentsConfigResource is not found in the empty JSON string", JobSegmentsConfigResource.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
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
       if (!JobSegmentsConfigResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobSegmentsConfigResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobSegmentsConfigResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobSegmentsConfigResource.class));

       return (TypeAdapter<T>) new TypeAdapter<JobSegmentsConfigResource>() {
           @Override
           public void write(JsonWriter out, JobSegmentsConfigResource value) throws IOException {
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
           public JobSegmentsConfigResource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             JobSegmentsConfigResource instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of JobSegmentsConfigResource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobSegmentsConfigResource
  * @throws IOException if the JSON string is invalid with respect to JobSegmentsConfigResource
  */
  public static JobSegmentsConfigResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobSegmentsConfigResource.class);
  }

 /**
  * Convert an instance of JobSegmentsConfigResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

