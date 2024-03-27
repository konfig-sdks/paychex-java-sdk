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
import com.konfigthis.client.model.ClientName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * ClientNameVersion
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ClientNameVersion {
  public static final String SERIALIZED_NAME_CNV_ID = "cnvId";
  @SerializedName(SERIALIZED_NAME_CNV_ID)
  private Long cnvId;

  public static final String SERIALIZED_NAME_CNV_CLT_NM = "cnvCltNm";
  @SerializedName(SERIALIZED_NAME_CNV_CLT_NM)
  private String cnvCltNm;

  public static final String SERIALIZED_NAME_CNV_VER_STAT_CD = "cnvVerStatCd";
  @SerializedName(SERIALIZED_NAME_CNV_VER_STAT_CD)
  private String cnvVerStatCd;

  public static final String SERIALIZED_NAME_CNV_VAL_STAT_CD = "cnvValStatCd";
  @SerializedName(SERIALIZED_NAME_CNV_VAL_STAT_CD)
  private String cnvValStatCd;

  public static final String SERIALIZED_NAME_CNV_BEGN_EFF_DT = "cnvBegnEffDt";
  @SerializedName(SERIALIZED_NAME_CNV_BEGN_EFF_DT)
  private OffsetDateTime cnvBegnEffDt;

  public static final String SERIALIZED_NAME_CNV_END_EFF_DT = "cnvEndEffDt";
  @SerializedName(SERIALIZED_NAME_CNV_END_EFF_DT)
  private OffsetDateTime cnvEndEffDt;

  public static final String SERIALIZED_NAME_CNV_MOD_DT = "cnvModDt";
  @SerializedName(SERIALIZED_NAME_CNV_MOD_DT)
  private OffsetDateTime cnvModDt;

  public static final String SERIALIZED_NAME_CNV_MOD_BY_APP_NM = "cnvModByAppNm";
  @SerializedName(SERIALIZED_NAME_CNV_MOD_BY_APP_NM)
  private String cnvModByAppNm;

  public static final String SERIALIZED_NAME_CNV_MOD_BY_APP_USR_NM = "cnvModByAppUsrNm";
  @SerializedName(SERIALIZED_NAME_CNV_MOD_BY_APP_USR_NM)
  private String cnvModByAppUsrNm;

  public static final String SERIALIZED_NAME_CNV_MOD_BY_APP_SUB_NM = "cnvModByAppSubNm";
  @SerializedName(SERIALIZED_NAME_CNV_MOD_BY_APP_SUB_NM)
  private String cnvModByAppSubNm;

  public static final String SERIALIZED_NAME_CLT_NM_BY_CN_ID = "cltNmByCnId";
  @SerializedName(SERIALIZED_NAME_CLT_NM_BY_CN_ID)
  private ClientName cltNmByCnId;

  public ClientNameVersion() {
  }

  public ClientNameVersion cnvId(Long cnvId) {
    
    
    
    
    this.cnvId = cnvId;
    return this;
  }

   /**
   * Get cnvId
   * @return cnvId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCnvId() {
    return cnvId;
  }


  public void setCnvId(Long cnvId) {
    
    
    
    this.cnvId = cnvId;
  }


  public ClientNameVersion cnvCltNm(String cnvCltNm) {
    
    
    
    
    this.cnvCltNm = cnvCltNm;
    return this;
  }

   /**
   * Get cnvCltNm
   * @return cnvCltNm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCnvCltNm() {
    return cnvCltNm;
  }


  public void setCnvCltNm(String cnvCltNm) {
    
    
    
    this.cnvCltNm = cnvCltNm;
  }


  public ClientNameVersion cnvVerStatCd(String cnvVerStatCd) {
    
    
    
    
    this.cnvVerStatCd = cnvVerStatCd;
    return this;
  }

   /**
   * Get cnvVerStatCd
   * @return cnvVerStatCd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCnvVerStatCd() {
    return cnvVerStatCd;
  }


  public void setCnvVerStatCd(String cnvVerStatCd) {
    
    
    
    this.cnvVerStatCd = cnvVerStatCd;
  }


  public ClientNameVersion cnvValStatCd(String cnvValStatCd) {
    
    
    
    
    this.cnvValStatCd = cnvValStatCd;
    return this;
  }

   /**
   * Get cnvValStatCd
   * @return cnvValStatCd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCnvValStatCd() {
    return cnvValStatCd;
  }


  public void setCnvValStatCd(String cnvValStatCd) {
    
    
    
    this.cnvValStatCd = cnvValStatCd;
  }


  public ClientNameVersion cnvBegnEffDt(OffsetDateTime cnvBegnEffDt) {
    
    
    
    
    this.cnvBegnEffDt = cnvBegnEffDt;
    return this;
  }

   /**
   * Get cnvBegnEffDt
   * @return cnvBegnEffDt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCnvBegnEffDt() {
    return cnvBegnEffDt;
  }


  public void setCnvBegnEffDt(OffsetDateTime cnvBegnEffDt) {
    
    
    
    this.cnvBegnEffDt = cnvBegnEffDt;
  }


  public ClientNameVersion cnvEndEffDt(OffsetDateTime cnvEndEffDt) {
    
    
    
    
    this.cnvEndEffDt = cnvEndEffDt;
    return this;
  }

   /**
   * Get cnvEndEffDt
   * @return cnvEndEffDt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCnvEndEffDt() {
    return cnvEndEffDt;
  }


  public void setCnvEndEffDt(OffsetDateTime cnvEndEffDt) {
    
    
    
    this.cnvEndEffDt = cnvEndEffDt;
  }


  public ClientNameVersion cnvModDt(OffsetDateTime cnvModDt) {
    
    
    
    
    this.cnvModDt = cnvModDt;
    return this;
  }

   /**
   * Get cnvModDt
   * @return cnvModDt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCnvModDt() {
    return cnvModDt;
  }


  public void setCnvModDt(OffsetDateTime cnvModDt) {
    
    
    
    this.cnvModDt = cnvModDt;
  }


  public ClientNameVersion cnvModByAppNm(String cnvModByAppNm) {
    
    
    
    
    this.cnvModByAppNm = cnvModByAppNm;
    return this;
  }

   /**
   * Get cnvModByAppNm
   * @return cnvModByAppNm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCnvModByAppNm() {
    return cnvModByAppNm;
  }


  public void setCnvModByAppNm(String cnvModByAppNm) {
    
    
    
    this.cnvModByAppNm = cnvModByAppNm;
  }


  public ClientNameVersion cnvModByAppUsrNm(String cnvModByAppUsrNm) {
    
    
    
    
    this.cnvModByAppUsrNm = cnvModByAppUsrNm;
    return this;
  }

   /**
   * Get cnvModByAppUsrNm
   * @return cnvModByAppUsrNm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCnvModByAppUsrNm() {
    return cnvModByAppUsrNm;
  }


  public void setCnvModByAppUsrNm(String cnvModByAppUsrNm) {
    
    
    
    this.cnvModByAppUsrNm = cnvModByAppUsrNm;
  }


  public ClientNameVersion cnvModByAppSubNm(String cnvModByAppSubNm) {
    
    
    
    
    this.cnvModByAppSubNm = cnvModByAppSubNm;
    return this;
  }

   /**
   * Get cnvModByAppSubNm
   * @return cnvModByAppSubNm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCnvModByAppSubNm() {
    return cnvModByAppSubNm;
  }


  public void setCnvModByAppSubNm(String cnvModByAppSubNm) {
    
    
    
    this.cnvModByAppSubNm = cnvModByAppSubNm;
  }


  public ClientNameVersion cltNmByCnId(ClientName cltNmByCnId) {
    
    
    
    
    this.cltNmByCnId = cltNmByCnId;
    return this;
  }

   /**
   * Get cltNmByCnId
   * @return cltNmByCnId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClientName getCltNmByCnId() {
    return cltNmByCnId;
  }


  public void setCltNmByCnId(ClientName cltNmByCnId) {
    
    
    
    this.cltNmByCnId = cltNmByCnId;
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
   * @return the ClientNameVersion instance itself
   */
  public ClientNameVersion putAdditionalProperty(String key, Object value) {
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
    ClientNameVersion clientNameVersion = (ClientNameVersion) o;
    return Objects.equals(this.cnvId, clientNameVersion.cnvId) &&
        Objects.equals(this.cnvCltNm, clientNameVersion.cnvCltNm) &&
        Objects.equals(this.cnvVerStatCd, clientNameVersion.cnvVerStatCd) &&
        Objects.equals(this.cnvValStatCd, clientNameVersion.cnvValStatCd) &&
        Objects.equals(this.cnvBegnEffDt, clientNameVersion.cnvBegnEffDt) &&
        Objects.equals(this.cnvEndEffDt, clientNameVersion.cnvEndEffDt) &&
        Objects.equals(this.cnvModDt, clientNameVersion.cnvModDt) &&
        Objects.equals(this.cnvModByAppNm, clientNameVersion.cnvModByAppNm) &&
        Objects.equals(this.cnvModByAppUsrNm, clientNameVersion.cnvModByAppUsrNm) &&
        Objects.equals(this.cnvModByAppSubNm, clientNameVersion.cnvModByAppSubNm) &&
        Objects.equals(this.cltNmByCnId, clientNameVersion.cltNmByCnId)&&
        Objects.equals(this.additionalProperties, clientNameVersion.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cnvId, cnvCltNm, cnvVerStatCd, cnvValStatCd, cnvBegnEffDt, cnvEndEffDt, cnvModDt, cnvModByAppNm, cnvModByAppUsrNm, cnvModByAppSubNm, cltNmByCnId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientNameVersion {\n");
    sb.append("    cnvId: ").append(toIndentedString(cnvId)).append("\n");
    sb.append("    cnvCltNm: ").append(toIndentedString(cnvCltNm)).append("\n");
    sb.append("    cnvVerStatCd: ").append(toIndentedString(cnvVerStatCd)).append("\n");
    sb.append("    cnvValStatCd: ").append(toIndentedString(cnvValStatCd)).append("\n");
    sb.append("    cnvBegnEffDt: ").append(toIndentedString(cnvBegnEffDt)).append("\n");
    sb.append("    cnvEndEffDt: ").append(toIndentedString(cnvEndEffDt)).append("\n");
    sb.append("    cnvModDt: ").append(toIndentedString(cnvModDt)).append("\n");
    sb.append("    cnvModByAppNm: ").append(toIndentedString(cnvModByAppNm)).append("\n");
    sb.append("    cnvModByAppUsrNm: ").append(toIndentedString(cnvModByAppUsrNm)).append("\n");
    sb.append("    cnvModByAppSubNm: ").append(toIndentedString(cnvModByAppSubNm)).append("\n");
    sb.append("    cltNmByCnId: ").append(toIndentedString(cltNmByCnId)).append("\n");
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
    openapiFields.add("cnvId");
    openapiFields.add("cnvCltNm");
    openapiFields.add("cnvVerStatCd");
    openapiFields.add("cnvValStatCd");
    openapiFields.add("cnvBegnEffDt");
    openapiFields.add("cnvEndEffDt");
    openapiFields.add("cnvModDt");
    openapiFields.add("cnvModByAppNm");
    openapiFields.add("cnvModByAppUsrNm");
    openapiFields.add("cnvModByAppSubNm");
    openapiFields.add("cltNmByCnId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ClientNameVersion
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ClientNameVersion.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClientNameVersion is not found in the empty JSON string", ClientNameVersion.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("cnvCltNm") != null && !jsonObj.get("cnvCltNm").isJsonNull()) && !jsonObj.get("cnvCltNm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cnvCltNm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cnvCltNm").toString()));
      }
      if ((jsonObj.get("cnvVerStatCd") != null && !jsonObj.get("cnvVerStatCd").isJsonNull()) && !jsonObj.get("cnvVerStatCd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cnvVerStatCd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cnvVerStatCd").toString()));
      }
      if ((jsonObj.get("cnvValStatCd") != null && !jsonObj.get("cnvValStatCd").isJsonNull()) && !jsonObj.get("cnvValStatCd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cnvValStatCd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cnvValStatCd").toString()));
      }
      if ((jsonObj.get("cnvModByAppNm") != null && !jsonObj.get("cnvModByAppNm").isJsonNull()) && !jsonObj.get("cnvModByAppNm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cnvModByAppNm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cnvModByAppNm").toString()));
      }
      if ((jsonObj.get("cnvModByAppUsrNm") != null && !jsonObj.get("cnvModByAppUsrNm").isJsonNull()) && !jsonObj.get("cnvModByAppUsrNm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cnvModByAppUsrNm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cnvModByAppUsrNm").toString()));
      }
      if ((jsonObj.get("cnvModByAppSubNm") != null && !jsonObj.get("cnvModByAppSubNm").isJsonNull()) && !jsonObj.get("cnvModByAppSubNm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cnvModByAppSubNm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cnvModByAppSubNm").toString()));
      }
      // validate the optional field `cltNmByCnId`
      if (jsonObj.get("cltNmByCnId") != null && !jsonObj.get("cltNmByCnId").isJsonNull()) {
        ClientName.validateJsonObject(jsonObj.getAsJsonObject("cltNmByCnId"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClientNameVersion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClientNameVersion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClientNameVersion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClientNameVersion.class));

       return (TypeAdapter<T>) new TypeAdapter<ClientNameVersion>() {
           @Override
           public void write(JsonWriter out, ClientNameVersion value) throws IOException {
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
           public ClientNameVersion read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ClientNameVersion instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ClientNameVersion given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClientNameVersion
  * @throws IOException if the JSON string is invalid with respect to ClientNameVersion
  */
  public static ClientNameVersion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClientNameVersion.class);
  }

 /**
  * Convert an instance of ClientNameVersion to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
