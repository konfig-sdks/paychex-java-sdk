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
import com.konfigthis.client.model.PayComponentFrequencyTypeResource;
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
 * The state representation of generic pay frequencies.
 */
@ApiModel(description = "The state representation of generic pay frequencies.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FrequencyCombinationUnitResource {
  public static final String SERIALIZED_NAME_PAY_FREQUENCY = "payFrequency";
  @SerializedName(SERIALIZED_NAME_PAY_FREQUENCY)
  private String payFrequency;

  public static final String SERIALIZED_NAME_PAY_COMPONENT_FREQUENCY = "payComponentFrequency";
  @SerializedName(SERIALIZED_NAME_PAY_COMPONENT_FREQUENCY)
  private PayComponentFrequencyTypeResource payComponentFrequency;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;

  public FrequencyCombinationUnitResource() {
  }

  public FrequencyCombinationUnitResource payFrequency(String payFrequency) {
    
    
    
    
    this.payFrequency = payFrequency;
    return this;
  }

   /**
   * Frequency which the pay component would be applied.
   * @return payFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WEEKLY", value = "Frequency which the pay component would be applied.")

  public String getPayFrequency() {
    return payFrequency;
  }


  public void setPayFrequency(String payFrequency) {
    
    
    
    this.payFrequency = payFrequency;
  }


  public FrequencyCombinationUnitResource payComponentFrequency(PayComponentFrequencyTypeResource payComponentFrequency) {
    
    
    
    
    this.payComponentFrequency = payComponentFrequency;
    return this;
  }

   /**
   * Get payComponentFrequency
   * @return payComponentFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PayComponentFrequencyTypeResource getPayComponentFrequency() {
    return payComponentFrequency;
  }


  public void setPayComponentFrequency(PayComponentFrequencyTypeResource payComponentFrequency) {
    
    
    
    this.payComponentFrequency = payComponentFrequency;
  }


  public FrequencyCombinationUnitResource links(List<Link> links) {
    
    
    
    
    this.links = links;
    return this;
  }

  public FrequencyCombinationUnitResource addLinksItem(Link linksItem) {
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
   * @return the FrequencyCombinationUnitResource instance itself
   */
  public FrequencyCombinationUnitResource putAdditionalProperty(String key, Object value) {
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
    FrequencyCombinationUnitResource frequencyCombinationUnitResource = (FrequencyCombinationUnitResource) o;
    return Objects.equals(this.payFrequency, frequencyCombinationUnitResource.payFrequency) &&
        Objects.equals(this.payComponentFrequency, frequencyCombinationUnitResource.payComponentFrequency) &&
        Objects.equals(this.links, frequencyCombinationUnitResource.links)&&
        Objects.equals(this.additionalProperties, frequencyCombinationUnitResource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payFrequency, payComponentFrequency, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrequencyCombinationUnitResource {\n");
    sb.append("    payFrequency: ").append(toIndentedString(payFrequency)).append("\n");
    sb.append("    payComponentFrequency: ").append(toIndentedString(payComponentFrequency)).append("\n");
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
    openapiFields.add("payFrequency");
    openapiFields.add("payComponentFrequency");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FrequencyCombinationUnitResource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FrequencyCombinationUnitResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FrequencyCombinationUnitResource is not found in the empty JSON string", FrequencyCombinationUnitResource.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("payFrequency") != null && !jsonObj.get("payFrequency").isJsonNull()) && !jsonObj.get("payFrequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payFrequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payFrequency").toString()));
      }
      // validate the optional field `payComponentFrequency`
      if (jsonObj.get("payComponentFrequency") != null && !jsonObj.get("payComponentFrequency").isJsonNull()) {
        PayComponentFrequencyTypeResource.validateJsonObject(jsonObj.getAsJsonObject("payComponentFrequency"));
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
       if (!FrequencyCombinationUnitResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FrequencyCombinationUnitResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FrequencyCombinationUnitResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FrequencyCombinationUnitResource.class));

       return (TypeAdapter<T>) new TypeAdapter<FrequencyCombinationUnitResource>() {
           @Override
           public void write(JsonWriter out, FrequencyCombinationUnitResource value) throws IOException {
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
           public FrequencyCombinationUnitResource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FrequencyCombinationUnitResource instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FrequencyCombinationUnitResource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FrequencyCombinationUnitResource
  * @throws IOException if the JSON string is invalid with respect to FrequencyCombinationUnitResource
  */
  public static FrequencyCombinationUnitResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FrequencyCombinationUnitResource.class);
  }

 /**
  * Convert an instance of FrequencyCombinationUnitResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

