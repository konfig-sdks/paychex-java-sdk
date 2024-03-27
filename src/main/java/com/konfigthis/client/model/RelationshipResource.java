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
import com.konfigthis.client.model.EntityResource;
import com.konfigthis.client.model.PersonResource;
import com.konfigthis.client.model.RelationTypeResource1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * The relationship for this worker contract. Required for POST contacts.
 */
@ApiModel(description = "The relationship for this worker contract. Required for POST contacts.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RelationshipResource {
  public static final String SERIALIZED_NAME_RELATIONSHIP_ID = "relationshipId";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIP_ID)
  private String relationshipId;

  public static final String SERIALIZED_NAME_RELATION_WEID = "relationWeid";
  @SerializedName(SERIALIZED_NAME_RELATION_WEID)
  private String relationWeid;

  public static final String SERIALIZED_NAME_RELATIONSHIP_TYPE = "relationshipType";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIP_TYPE)
  private RelationTypeResource1 relationshipType;

  public static final String SERIALIZED_NAME_PRIMARY = "primary";
  @SerializedName(SERIALIZED_NAME_PRIMARY)
  private Boolean primary;

  public static final String SERIALIZED_NAME_PERSON = "person";
  @SerializedName(SERIALIZED_NAME_PERSON)
  private PersonResource person;

  public static final String SERIALIZED_NAME_ENTITY = "entity";
  @SerializedName(SERIALIZED_NAME_ENTITY)
  private EntityResource entity;

  public RelationshipResource() {
  }

  public RelationshipResource relationshipId(String relationshipId) {
    
    
    
    
    this.relationshipId = relationshipId;
    return this;
  }

   /**
   * The ID for the workers relationship to contact.
   * @return relationshipId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID for the workers relationship to contact.")

  public String getRelationshipId() {
    return relationshipId;
  }


  public void setRelationshipId(String relationshipId) {
    
    
    
    this.relationshipId = relationshipId;
  }


  public RelationshipResource relationWeid(String relationWeid) {
    
    
    
    
    this.relationWeid = relationWeid;
    return this;
  }

   /**
   * The ID for the workers specific relation.
   * @return relationWeid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID for the workers specific relation.")

  public String getRelationWeid() {
    return relationWeid;
  }


  public void setRelationWeid(String relationWeid) {
    
    
    
    this.relationWeid = relationWeid;
  }


  public RelationshipResource relationshipType(RelationTypeResource1 relationshipType) {
    
    
    
    
    this.relationshipType = relationshipType;
    return this;
  }

   /**
   * Get relationshipType
   * @return relationshipType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RelationTypeResource1 getRelationshipType() {
    return relationshipType;
  }


  public void setRelationshipType(RelationTypeResource1 relationshipType) {
    
    
    
    this.relationshipType = relationshipType;
  }


  public RelationshipResource primary(Boolean primary) {
    
    
    
    
    this.primary = primary;
    return this;
  }

   /**
   * Where to indicate if the contact is selected as Primary, where true &#x3D; Primary contact and false &#x3D; not Primary contact.
   * @return primary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Where to indicate if the contact is selected as Primary, where true = Primary contact and false = not Primary contact.")

  public Boolean getPrimary() {
    return primary;
  }


  public void setPrimary(Boolean primary) {
    
    
    
    this.primary = primary;
  }


  public RelationshipResource person(PersonResource person) {
    
    
    
    
    this.person = person;
    return this;
  }

   /**
   * Get person
   * @return person
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PersonResource getPerson() {
    return person;
  }


  public void setPerson(PersonResource person) {
    
    
    
    this.person = person;
  }


  public RelationshipResource entity(EntityResource entity) {
    
    
    
    
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EntityResource getEntity() {
    return entity;
  }


  public void setEntity(EntityResource entity) {
    
    
    
    this.entity = entity;
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
   * @return the RelationshipResource instance itself
   */
  public RelationshipResource putAdditionalProperty(String key, Object value) {
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
    RelationshipResource relationshipResource = (RelationshipResource) o;
    return Objects.equals(this.relationshipId, relationshipResource.relationshipId) &&
        Objects.equals(this.relationWeid, relationshipResource.relationWeid) &&
        Objects.equals(this.relationshipType, relationshipResource.relationshipType) &&
        Objects.equals(this.primary, relationshipResource.primary) &&
        Objects.equals(this.person, relationshipResource.person) &&
        Objects.equals(this.entity, relationshipResource.entity)&&
        Objects.equals(this.additionalProperties, relationshipResource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationshipId, relationWeid, relationshipType, primary, person, entity, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationshipResource {\n");
    sb.append("    relationshipId: ").append(toIndentedString(relationshipId)).append("\n");
    sb.append("    relationWeid: ").append(toIndentedString(relationWeid)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
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
    openapiFields.add("relationshipId");
    openapiFields.add("relationWeid");
    openapiFields.add("relationshipType");
    openapiFields.add("primary");
    openapiFields.add("person");
    openapiFields.add("entity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RelationshipResource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RelationshipResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RelationshipResource is not found in the empty JSON string", RelationshipResource.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("relationshipId") != null && !jsonObj.get("relationshipId").isJsonNull()) && !jsonObj.get("relationshipId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relationshipId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relationshipId").toString()));
      }
      if ((jsonObj.get("relationWeid") != null && !jsonObj.get("relationWeid").isJsonNull()) && !jsonObj.get("relationWeid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relationWeid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relationWeid").toString()));
      }
      // validate the optional field `relationshipType`
      if (jsonObj.get("relationshipType") != null && !jsonObj.get("relationshipType").isJsonNull()) {
        RelationTypeResource1.validateJsonObject(jsonObj.getAsJsonObject("relationshipType"));
      }
      // validate the optional field `person`
      if (jsonObj.get("person") != null && !jsonObj.get("person").isJsonNull()) {
        PersonResource.validateJsonObject(jsonObj.getAsJsonObject("person"));
      }
      // validate the optional field `entity`
      if (jsonObj.get("entity") != null && !jsonObj.get("entity").isJsonNull()) {
        EntityResource.validateJsonObject(jsonObj.getAsJsonObject("entity"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RelationshipResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RelationshipResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RelationshipResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RelationshipResource.class));

       return (TypeAdapter<T>) new TypeAdapter<RelationshipResource>() {
           @Override
           public void write(JsonWriter out, RelationshipResource value) throws IOException {
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
           public RelationshipResource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RelationshipResource instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RelationshipResource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RelationshipResource
  * @throws IOException if the JSON string is invalid with respect to RelationshipResource
  */
  public static RelationshipResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RelationshipResource.class);
  }

 /**
  * Convert an instance of RelationshipResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

