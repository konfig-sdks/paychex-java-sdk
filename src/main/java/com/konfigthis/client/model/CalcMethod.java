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
 * CalcMethod
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CalcMethod {
  public static final String SERIALIZED_NAME_CCM_ID = "ccmId";
  @SerializedName(SERIALIZED_NAME_CCM_ID)
  private Long ccmId;

  public static final String SERIALIZED_NAME_DEFAULT_TYPE_ID = "defaultTypeId";
  @SerializedName(SERIALIZED_NAME_DEFAULT_TYPE_ID)
  private Long defaultTypeId;

  public static final String SERIALIZED_NAME_DEFAULT_TYPE = "defaultType";
  @SerializedName(SERIALIZED_NAME_DEFAULT_TYPE)
  private String defaultType;

  public static final String SERIALIZED_NAME_CALC_TYPE_ID = "calcTypeId";
  @SerializedName(SERIALIZED_NAME_CALC_TYPE_ID)
  private Long calcTypeId;

  public static final String SERIALIZED_NAME_CALCULATION_TYPE = "calculationType";
  @SerializedName(SERIALIZED_NAME_CALCULATION_TYPE)
  private String calculationType;

  public static final String SERIALIZED_NAME_CALC_TYPE = "calcType";
  @SerializedName(SERIALIZED_NAME_CALC_TYPE)
  private String calcType;

  public static final String SERIALIZED_NAME_CALC_ADJ_TYPE = "calcAdjType";
  @SerializedName(SERIALIZED_NAME_CALC_ADJ_TYPE)
  private String calcAdjType;

  public static final String SERIALIZED_NAME_IS_INCLUDE_MEMO_HOURS = "isIncludeMemoHours";
  @SerializedName(SERIALIZED_NAME_IS_INCLUDE_MEMO_HOURS)
  private Boolean isIncludeMemoHours;

  public static final String SERIALIZED_NAME_IS_TIERED_BY_PCT = "isTieredByPct";
  @SerializedName(SERIALIZED_NAME_IS_TIERED_BY_PCT)
  private Boolean isTieredByPct;

  public static final String SERIALIZED_NAME_IS_MATCH_CALC_AS_PCT = "isMatchCalcAsPct";
  @SerializedName(SERIALIZED_NAME_IS_MATCH_CALC_AS_PCT)
  private Boolean isMatchCalcAsPct;

  public static final String SERIALIZED_NAME_CALC_ADJ_TYPE_ID = "calcAdjTypeId";
  @SerializedName(SERIALIZED_NAME_CALC_ADJ_TYPE_ID)
  private Long calcAdjTypeId;

  public static final String SERIALIZED_NAME_PAY_RATE_OVRD_TYPE_ID = "payRateOvrdTypeId";
  @SerializedName(SERIALIZED_NAME_PAY_RATE_OVRD_TYPE_ID)
  private Long payRateOvrdTypeId;

  public static final String SERIALIZED_NAME_PAY_RATE_OVRD_TYPE = "payRateOvrdType";
  @SerializedName(SERIALIZED_NAME_PAY_RATE_OVRD_TYPE)
  private String payRateOvrdType;

  public CalcMethod() {
  }

  public CalcMethod ccmId(Long ccmId) {
    
    
    
    
    this.ccmId = ccmId;
    return this;
  }

   /**
   * Get ccmId
   * @return ccmId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCcmId() {
    return ccmId;
  }


  public void setCcmId(Long ccmId) {
    
    
    
    this.ccmId = ccmId;
  }


  public CalcMethod defaultTypeId(Long defaultTypeId) {
    
    
    
    
    this.defaultTypeId = defaultTypeId;
    return this;
  }

   /**
   * Get defaultTypeId
   * @return defaultTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getDefaultTypeId() {
    return defaultTypeId;
  }


  public void setDefaultTypeId(Long defaultTypeId) {
    
    
    
    this.defaultTypeId = defaultTypeId;
  }


  public CalcMethod defaultType(String defaultType) {
    
    
    
    
    this.defaultType = defaultType;
    return this;
  }

   /**
   * Get defaultType
   * @return defaultType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDefaultType() {
    return defaultType;
  }


  public void setDefaultType(String defaultType) {
    
    
    
    this.defaultType = defaultType;
  }


  public CalcMethod calcTypeId(Long calcTypeId) {
    
    
    
    
    this.calcTypeId = calcTypeId;
    return this;
  }

   /**
   * Get calcTypeId
   * @return calcTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCalcTypeId() {
    return calcTypeId;
  }


  public void setCalcTypeId(Long calcTypeId) {
    
    
    
    this.calcTypeId = calcTypeId;
  }


  public CalcMethod calculationType(String calculationType) {
    
    
    
    
    this.calculationType = calculationType;
    return this;
  }

   /**
   * Get calculationType
   * @return calculationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCalculationType() {
    return calculationType;
  }


  public void setCalculationType(String calculationType) {
    
    
    
    this.calculationType = calculationType;
  }


  public CalcMethod calcType(String calcType) {
    
    
    
    
    this.calcType = calcType;
    return this;
  }

   /**
   * Get calcType
   * @return calcType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCalcType() {
    return calcType;
  }


  public void setCalcType(String calcType) {
    
    
    
    this.calcType = calcType;
  }


  public CalcMethod calcAdjType(String calcAdjType) {
    
    
    
    
    this.calcAdjType = calcAdjType;
    return this;
  }

   /**
   * Get calcAdjType
   * @return calcAdjType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCalcAdjType() {
    return calcAdjType;
  }


  public void setCalcAdjType(String calcAdjType) {
    
    
    
    this.calcAdjType = calcAdjType;
  }


  public CalcMethod isIncludeMemoHours(Boolean isIncludeMemoHours) {
    
    
    
    
    this.isIncludeMemoHours = isIncludeMemoHours;
    return this;
  }

   /**
   * Get isIncludeMemoHours
   * @return isIncludeMemoHours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsIncludeMemoHours() {
    return isIncludeMemoHours;
  }


  public void setIsIncludeMemoHours(Boolean isIncludeMemoHours) {
    
    
    
    this.isIncludeMemoHours = isIncludeMemoHours;
  }


  public CalcMethod isTieredByPct(Boolean isTieredByPct) {
    
    
    
    
    this.isTieredByPct = isTieredByPct;
    return this;
  }

   /**
   * Get isTieredByPct
   * @return isTieredByPct
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsTieredByPct() {
    return isTieredByPct;
  }


  public void setIsTieredByPct(Boolean isTieredByPct) {
    
    
    
    this.isTieredByPct = isTieredByPct;
  }


  public CalcMethod isMatchCalcAsPct(Boolean isMatchCalcAsPct) {
    
    
    
    
    this.isMatchCalcAsPct = isMatchCalcAsPct;
    return this;
  }

   /**
   * Get isMatchCalcAsPct
   * @return isMatchCalcAsPct
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsMatchCalcAsPct() {
    return isMatchCalcAsPct;
  }


  public void setIsMatchCalcAsPct(Boolean isMatchCalcAsPct) {
    
    
    
    this.isMatchCalcAsPct = isMatchCalcAsPct;
  }


  public CalcMethod calcAdjTypeId(Long calcAdjTypeId) {
    
    
    
    
    this.calcAdjTypeId = calcAdjTypeId;
    return this;
  }

   /**
   * Get calcAdjTypeId
   * @return calcAdjTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCalcAdjTypeId() {
    return calcAdjTypeId;
  }


  public void setCalcAdjTypeId(Long calcAdjTypeId) {
    
    
    
    this.calcAdjTypeId = calcAdjTypeId;
  }


  public CalcMethod payRateOvrdTypeId(Long payRateOvrdTypeId) {
    
    
    
    
    this.payRateOvrdTypeId = payRateOvrdTypeId;
    return this;
  }

   /**
   * Get payRateOvrdTypeId
   * @return payRateOvrdTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getPayRateOvrdTypeId() {
    return payRateOvrdTypeId;
  }


  public void setPayRateOvrdTypeId(Long payRateOvrdTypeId) {
    
    
    
    this.payRateOvrdTypeId = payRateOvrdTypeId;
  }


  public CalcMethod payRateOvrdType(String payRateOvrdType) {
    
    
    
    
    this.payRateOvrdType = payRateOvrdType;
    return this;
  }

   /**
   * Get payRateOvrdType
   * @return payRateOvrdType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPayRateOvrdType() {
    return payRateOvrdType;
  }


  public void setPayRateOvrdType(String payRateOvrdType) {
    
    
    
    this.payRateOvrdType = payRateOvrdType;
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
   * @return the CalcMethod instance itself
   */
  public CalcMethod putAdditionalProperty(String key, Object value) {
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
    CalcMethod calcMethod = (CalcMethod) o;
    return Objects.equals(this.ccmId, calcMethod.ccmId) &&
        Objects.equals(this.defaultTypeId, calcMethod.defaultTypeId) &&
        Objects.equals(this.defaultType, calcMethod.defaultType) &&
        Objects.equals(this.calcTypeId, calcMethod.calcTypeId) &&
        Objects.equals(this.calculationType, calcMethod.calculationType) &&
        Objects.equals(this.calcType, calcMethod.calcType) &&
        Objects.equals(this.calcAdjType, calcMethod.calcAdjType) &&
        Objects.equals(this.isIncludeMemoHours, calcMethod.isIncludeMemoHours) &&
        Objects.equals(this.isTieredByPct, calcMethod.isTieredByPct) &&
        Objects.equals(this.isMatchCalcAsPct, calcMethod.isMatchCalcAsPct) &&
        Objects.equals(this.calcAdjTypeId, calcMethod.calcAdjTypeId) &&
        Objects.equals(this.payRateOvrdTypeId, calcMethod.payRateOvrdTypeId) &&
        Objects.equals(this.payRateOvrdType, calcMethod.payRateOvrdType)&&
        Objects.equals(this.additionalProperties, calcMethod.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccmId, defaultTypeId, defaultType, calcTypeId, calculationType, calcType, calcAdjType, isIncludeMemoHours, isTieredByPct, isMatchCalcAsPct, calcAdjTypeId, payRateOvrdTypeId, payRateOvrdType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalcMethod {\n");
    sb.append("    ccmId: ").append(toIndentedString(ccmId)).append("\n");
    sb.append("    defaultTypeId: ").append(toIndentedString(defaultTypeId)).append("\n");
    sb.append("    defaultType: ").append(toIndentedString(defaultType)).append("\n");
    sb.append("    calcTypeId: ").append(toIndentedString(calcTypeId)).append("\n");
    sb.append("    calculationType: ").append(toIndentedString(calculationType)).append("\n");
    sb.append("    calcType: ").append(toIndentedString(calcType)).append("\n");
    sb.append("    calcAdjType: ").append(toIndentedString(calcAdjType)).append("\n");
    sb.append("    isIncludeMemoHours: ").append(toIndentedString(isIncludeMemoHours)).append("\n");
    sb.append("    isTieredByPct: ").append(toIndentedString(isTieredByPct)).append("\n");
    sb.append("    isMatchCalcAsPct: ").append(toIndentedString(isMatchCalcAsPct)).append("\n");
    sb.append("    calcAdjTypeId: ").append(toIndentedString(calcAdjTypeId)).append("\n");
    sb.append("    payRateOvrdTypeId: ").append(toIndentedString(payRateOvrdTypeId)).append("\n");
    sb.append("    payRateOvrdType: ").append(toIndentedString(payRateOvrdType)).append("\n");
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
    openapiFields.add("ccmId");
    openapiFields.add("defaultTypeId");
    openapiFields.add("defaultType");
    openapiFields.add("calcTypeId");
    openapiFields.add("calculationType");
    openapiFields.add("calcType");
    openapiFields.add("calcAdjType");
    openapiFields.add("isIncludeMemoHours");
    openapiFields.add("isTieredByPct");
    openapiFields.add("isMatchCalcAsPct");
    openapiFields.add("calcAdjTypeId");
    openapiFields.add("payRateOvrdTypeId");
    openapiFields.add("payRateOvrdType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CalcMethod
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CalcMethod.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CalcMethod is not found in the empty JSON string", CalcMethod.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("defaultType") != null && !jsonObj.get("defaultType").isJsonNull()) && !jsonObj.get("defaultType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultType").toString()));
      }
      if ((jsonObj.get("calculationType") != null && !jsonObj.get("calculationType").isJsonNull()) && !jsonObj.get("calculationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `calculationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("calculationType").toString()));
      }
      if ((jsonObj.get("calcType") != null && !jsonObj.get("calcType").isJsonNull()) && !jsonObj.get("calcType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `calcType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("calcType").toString()));
      }
      if ((jsonObj.get("calcAdjType") != null && !jsonObj.get("calcAdjType").isJsonNull()) && !jsonObj.get("calcAdjType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `calcAdjType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("calcAdjType").toString()));
      }
      if ((jsonObj.get("payRateOvrdType") != null && !jsonObj.get("payRateOvrdType").isJsonNull()) && !jsonObj.get("payRateOvrdType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payRateOvrdType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payRateOvrdType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CalcMethod.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CalcMethod' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CalcMethod> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CalcMethod.class));

       return (TypeAdapter<T>) new TypeAdapter<CalcMethod>() {
           @Override
           public void write(JsonWriter out, CalcMethod value) throws IOException {
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
           public CalcMethod read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CalcMethod instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CalcMethod given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CalcMethod
  * @throws IOException if the JSON string is invalid with respect to CalcMethod
  */
  public static CalcMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CalcMethod.class);
  }

 /**
  * Convert an instance of CalcMethod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
