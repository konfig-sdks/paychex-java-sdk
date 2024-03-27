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
 * The state representation of Locations within a company.
 */
@ApiModel(description = "The state representation of Locations within a company.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LocationResource {
  public static final String SERIALIZED_NAME_LOCATION_ID = "locationId";
  @SerializedName(SERIALIZED_NAME_LOCATION_ID)
  private String locationId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private CommunicationResource address;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;

  public static final String SERIALIZED_NAME_MOVED_IN = "movedIn";
  @SerializedName(SERIALIZED_NAME_MOVED_IN)
  private OffsetDateTime movedIn;

  public static final String SERIALIZED_NAME_MOVED_OUT = "movedOut";
  @SerializedName(SERIALIZED_NAME_MOVED_OUT)
  private OffsetDateTime movedOut;

  public LocationResource() {
  }

  public LocationResource locationId(String locationId) {
    
    
    
    
    this.locationId = locationId;
    return this;
  }

   /**
   * The unique identifier associated with this locations representation.
   * @return locationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "970000082973090", value = "The unique identifier associated with this locations representation.")

  public String getLocationId() {
    return locationId;
  }


  public void setLocationId(String locationId) {
    
    
    
    this.locationId = locationId;
  }


  public LocationResource name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the location.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Default Location", value = "The name of the location.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public LocationResource address(CommunicationResource address) {
    
    
    
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommunicationResource getAddress() {
    return address;
  }


  public void setAddress(CommunicationResource address) {
    
    
    
    this.address = address;
  }


  public LocationResource links(List<Link> links) {
    
    
    
    
    this.links = links;
    return this;
  }

  public LocationResource addLinksItem(Link linksItem) {
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


  public LocationResource movedIn(OffsetDateTime movedIn) {
    
    
    
    
    this.movedIn = movedIn;
    return this;
  }

   /**
   * The date which the location was moved into.
   * @return movedIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date which the location was moved into.")

  public OffsetDateTime getMovedIn() {
    return movedIn;
  }


  public void setMovedIn(OffsetDateTime movedIn) {
    
    
    
    this.movedIn = movedIn;
  }


  public LocationResource movedOut(OffsetDateTime movedOut) {
    
    
    
    
    this.movedOut = movedOut;
    return this;
  }

   /**
   * The date which the location was moved out.
   * @return movedOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date which the location was moved out.")

  public OffsetDateTime getMovedOut() {
    return movedOut;
  }


  public void setMovedOut(OffsetDateTime movedOut) {
    
    
    
    this.movedOut = movedOut;
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
   * @return the LocationResource instance itself
   */
  public LocationResource putAdditionalProperty(String key, Object value) {
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
    LocationResource locationResource = (LocationResource) o;
    return Objects.equals(this.locationId, locationResource.locationId) &&
        Objects.equals(this.name, locationResource.name) &&
        Objects.equals(this.address, locationResource.address) &&
        Objects.equals(this.links, locationResource.links) &&
        Objects.equals(this.movedIn, locationResource.movedIn) &&
        Objects.equals(this.movedOut, locationResource.movedOut)&&
        Objects.equals(this.additionalProperties, locationResource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, name, address, links, movedIn, movedOut, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationResource {\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    movedIn: ").append(toIndentedString(movedIn)).append("\n");
    sb.append("    movedOut: ").append(toIndentedString(movedOut)).append("\n");
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
    openapiFields.add("locationId");
    openapiFields.add("name");
    openapiFields.add("address");
    openapiFields.add("links");
    openapiFields.add("movedIn");
    openapiFields.add("movedOut");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LocationResource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LocationResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LocationResource is not found in the empty JSON string", LocationResource.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("locationId") != null && !jsonObj.get("locationId").isJsonNull()) && !jsonObj.get("locationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        CommunicationResource.validateJsonObject(jsonObj.getAsJsonObject("address"));
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
       if (!LocationResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocationResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocationResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocationResource.class));

       return (TypeAdapter<T>) new TypeAdapter<LocationResource>() {
           @Override
           public void write(JsonWriter out, LocationResource value) throws IOException {
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
           public LocationResource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LocationResource instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LocationResource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocationResource
  * @throws IOException if the JSON string is invalid with respect to LocationResource
  */
  public static LocationResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocationResource.class);
  }

 /**
  * Convert an instance of LocationResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

