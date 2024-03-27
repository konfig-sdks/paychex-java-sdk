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
 * ClientPayComponentFrequency
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ClientPayComponentFrequency {
  public static final String SERIALIZED_NAME_CF_ID = "cfId";
  @SerializedName(SERIALIZED_NAME_CF_ID)
  private Long cfId;

  public static final String SERIALIZED_NAME_FREQUENCY_OPTION_ID = "frequencyOptionId";
  @SerializedName(SERIALIZED_NAME_FREQUENCY_OPTION_ID)
  private Long frequencyOptionId;

  public static final String SERIALIZED_NAME_FREQ_TYPE_ID = "freqTypeId";
  @SerializedName(SERIALIZED_NAME_FREQ_TYPE_ID)
  private Long freqTypeId;

  public static final String SERIALIZED_NAME_FREQUENCY_TYPE = "frequencyType";
  @SerializedName(SERIALIZED_NAME_FREQUENCY_TYPE)
  private String frequencyType;

  public static final String SERIALIZED_NAME_FREQ_TYPE = "freqType";
  @SerializedName(SERIALIZED_NAME_FREQ_TYPE)
  private String freqType;

  public static final String SERIALIZED_NAME_PAY_FREQ_ID = "payFreqId";
  @SerializedName(SERIALIZED_NAME_PAY_FREQ_ID)
  private Long payFreqId;

  public static final String SERIALIZED_NAME_PAY_FREQUENCY = "payFrequency";
  @SerializedName(SERIALIZED_NAME_PAY_FREQUENCY)
  private String payFrequency;

  public static final String SERIALIZED_NAME_PAY_FREQ = "payFreq";
  @SerializedName(SERIALIZED_NAME_PAY_FREQ)
  private String payFreq;

  public static final String SERIALIZED_NAME_FIRST_PERIOD_OCCURRENCE_ID = "firstPeriodOccurrenceId";
  @SerializedName(SERIALIZED_NAME_FIRST_PERIOD_OCCURRENCE_ID)
  private Long firstPeriodOccurrenceId;

  public static final String SERIALIZED_NAME_FIRST_PERIOD_OCCURRENCE_TYPE = "firstPeriodOccurrenceType";
  @SerializedName(SERIALIZED_NAME_FIRST_PERIOD_OCCURRENCE_TYPE)
  private String firstPeriodOccurrenceType;

  public static final String SERIALIZED_NAME_FIRST_FREQUENCY_PERIOD = "firstFrequencyPeriod";
  @SerializedName(SERIALIZED_NAME_FIRST_FREQUENCY_PERIOD)
  private String firstFrequencyPeriod;

  public static final String SERIALIZED_NAME_FIRST_PERIOD_OCCURRENCE = "firstPeriodOccurrence";
  @SerializedName(SERIALIZED_NAME_FIRST_PERIOD_OCCURRENCE)
  private String firstPeriodOccurrence;

  public static final String SERIALIZED_NAME_SECOND_PERIOD_OCCURRENCE_ID = "secondPeriodOccurrenceId";
  @SerializedName(SERIALIZED_NAME_SECOND_PERIOD_OCCURRENCE_ID)
  private Long secondPeriodOccurrenceId;

  public static final String SERIALIZED_NAME_SECOND_PERIOD_OCCURRENCE_TYPE = "secondPeriodOccurrenceType";
  @SerializedName(SERIALIZED_NAME_SECOND_PERIOD_OCCURRENCE_TYPE)
  private String secondPeriodOccurrenceType;

  public static final String SERIALIZED_NAME_SECOND_FREQUENCY_PERIOD = "secondFrequencyPeriod";
  @SerializedName(SERIALIZED_NAME_SECOND_FREQUENCY_PERIOD)
  private String secondFrequencyPeriod;

  public static final String SERIALIZED_NAME_SECOND_PERIOD_OCCURRENCE = "secondPeriodOccurrence";
  @SerializedName(SERIALIZED_NAME_SECOND_PERIOD_OCCURRENCE)
  private String secondPeriodOccurrence;

  public static final String SERIALIZED_NAME_INTERVAL_VALUE = "intervalValue";
  @SerializedName(SERIALIZED_NAME_INTERVAL_VALUE)
  private Integer intervalValue;

  public static final String SERIALIZED_NAME_FIRST_CHECK_RULE_ID = "firstCheckRuleId";
  @SerializedName(SERIALIZED_NAME_FIRST_CHECK_RULE_ID)
  private Long firstCheckRuleId;

  public static final String SERIALIZED_NAME_FIRST_CHECK_RULE_TYPE = "firstCheckRuleType";
  @SerializedName(SERIALIZED_NAME_FIRST_CHECK_RULE_TYPE)
  private String firstCheckRuleType;

  public static final String SERIALIZED_NAME_FIRST_CHECK_RULE = "firstCheckRule";
  @SerializedName(SERIALIZED_NAME_FIRST_CHECK_RULE)
  private String firstCheckRule;

  public static final String SERIALIZED_NAME_FIRST_CHECK_ONLY = "firstCheckOnly";
  @SerializedName(SERIALIZED_NAME_FIRST_CHECK_ONLY)
  private Boolean firstCheckOnly;

  public ClientPayComponentFrequency() {
  }

  public ClientPayComponentFrequency cfId(Long cfId) {
    
    
    
    
    this.cfId = cfId;
    return this;
  }

   /**
   * Get cfId
   * @return cfId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCfId() {
    return cfId;
  }


  public void setCfId(Long cfId) {
    
    
    
    this.cfId = cfId;
  }


  public ClientPayComponentFrequency frequencyOptionId(Long frequencyOptionId) {
    
    
    
    
    this.frequencyOptionId = frequencyOptionId;
    return this;
  }

   /**
   * Get frequencyOptionId
   * @return frequencyOptionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getFrequencyOptionId() {
    return frequencyOptionId;
  }


  public void setFrequencyOptionId(Long frequencyOptionId) {
    
    
    
    this.frequencyOptionId = frequencyOptionId;
  }


  public ClientPayComponentFrequency freqTypeId(Long freqTypeId) {
    
    
    
    
    this.freqTypeId = freqTypeId;
    return this;
  }

   /**
   * Get freqTypeId
   * @return freqTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getFreqTypeId() {
    return freqTypeId;
  }


  public void setFreqTypeId(Long freqTypeId) {
    
    
    
    this.freqTypeId = freqTypeId;
  }


  public ClientPayComponentFrequency frequencyType(String frequencyType) {
    
    
    
    
    this.frequencyType = frequencyType;
    return this;
  }

   /**
   * Get frequencyType
   * @return frequencyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFrequencyType() {
    return frequencyType;
  }


  public void setFrequencyType(String frequencyType) {
    
    
    
    this.frequencyType = frequencyType;
  }


  public ClientPayComponentFrequency freqType(String freqType) {
    
    
    
    
    this.freqType = freqType;
    return this;
  }

   /**
   * Get freqType
   * @return freqType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFreqType() {
    return freqType;
  }


  public void setFreqType(String freqType) {
    
    
    
    this.freqType = freqType;
  }


  public ClientPayComponentFrequency payFreqId(Long payFreqId) {
    
    
    
    
    this.payFreqId = payFreqId;
    return this;
  }

   /**
   * Get payFreqId
   * @return payFreqId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getPayFreqId() {
    return payFreqId;
  }


  public void setPayFreqId(Long payFreqId) {
    
    
    
    this.payFreqId = payFreqId;
  }


  public ClientPayComponentFrequency payFrequency(String payFrequency) {
    
    
    
    
    this.payFrequency = payFrequency;
    return this;
  }

   /**
   * Get payFrequency
   * @return payFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPayFrequency() {
    return payFrequency;
  }


  public void setPayFrequency(String payFrequency) {
    
    
    
    this.payFrequency = payFrequency;
  }


  public ClientPayComponentFrequency payFreq(String payFreq) {
    
    
    
    
    this.payFreq = payFreq;
    return this;
  }

   /**
   * Get payFreq
   * @return payFreq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPayFreq() {
    return payFreq;
  }


  public void setPayFreq(String payFreq) {
    
    
    
    this.payFreq = payFreq;
  }


  public ClientPayComponentFrequency firstPeriodOccurrenceId(Long firstPeriodOccurrenceId) {
    
    
    
    
    this.firstPeriodOccurrenceId = firstPeriodOccurrenceId;
    return this;
  }

   /**
   * Get firstPeriodOccurrenceId
   * @return firstPeriodOccurrenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getFirstPeriodOccurrenceId() {
    return firstPeriodOccurrenceId;
  }


  public void setFirstPeriodOccurrenceId(Long firstPeriodOccurrenceId) {
    
    
    
    this.firstPeriodOccurrenceId = firstPeriodOccurrenceId;
  }


  public ClientPayComponentFrequency firstPeriodOccurrenceType(String firstPeriodOccurrenceType) {
    
    
    
    
    this.firstPeriodOccurrenceType = firstPeriodOccurrenceType;
    return this;
  }

   /**
   * Get firstPeriodOccurrenceType
   * @return firstPeriodOccurrenceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstPeriodOccurrenceType() {
    return firstPeriodOccurrenceType;
  }


  public void setFirstPeriodOccurrenceType(String firstPeriodOccurrenceType) {
    
    
    
    this.firstPeriodOccurrenceType = firstPeriodOccurrenceType;
  }


  public ClientPayComponentFrequency firstFrequencyPeriod(String firstFrequencyPeriod) {
    
    
    
    
    this.firstFrequencyPeriod = firstFrequencyPeriod;
    return this;
  }

   /**
   * Get firstFrequencyPeriod
   * @return firstFrequencyPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstFrequencyPeriod() {
    return firstFrequencyPeriod;
  }


  public void setFirstFrequencyPeriod(String firstFrequencyPeriod) {
    
    
    
    this.firstFrequencyPeriod = firstFrequencyPeriod;
  }


  public ClientPayComponentFrequency firstPeriodOccurrence(String firstPeriodOccurrence) {
    
    
    
    
    this.firstPeriodOccurrence = firstPeriodOccurrence;
    return this;
  }

   /**
   * Get firstPeriodOccurrence
   * @return firstPeriodOccurrence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstPeriodOccurrence() {
    return firstPeriodOccurrence;
  }


  public void setFirstPeriodOccurrence(String firstPeriodOccurrence) {
    
    
    
    this.firstPeriodOccurrence = firstPeriodOccurrence;
  }


  public ClientPayComponentFrequency secondPeriodOccurrenceId(Long secondPeriodOccurrenceId) {
    
    
    
    
    this.secondPeriodOccurrenceId = secondPeriodOccurrenceId;
    return this;
  }

   /**
   * Get secondPeriodOccurrenceId
   * @return secondPeriodOccurrenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSecondPeriodOccurrenceId() {
    return secondPeriodOccurrenceId;
  }


  public void setSecondPeriodOccurrenceId(Long secondPeriodOccurrenceId) {
    
    
    
    this.secondPeriodOccurrenceId = secondPeriodOccurrenceId;
  }


  public ClientPayComponentFrequency secondPeriodOccurrenceType(String secondPeriodOccurrenceType) {
    
    
    
    
    this.secondPeriodOccurrenceType = secondPeriodOccurrenceType;
    return this;
  }

   /**
   * Get secondPeriodOccurrenceType
   * @return secondPeriodOccurrenceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecondPeriodOccurrenceType() {
    return secondPeriodOccurrenceType;
  }


  public void setSecondPeriodOccurrenceType(String secondPeriodOccurrenceType) {
    
    
    
    this.secondPeriodOccurrenceType = secondPeriodOccurrenceType;
  }


  public ClientPayComponentFrequency secondFrequencyPeriod(String secondFrequencyPeriod) {
    
    
    
    
    this.secondFrequencyPeriod = secondFrequencyPeriod;
    return this;
  }

   /**
   * Get secondFrequencyPeriod
   * @return secondFrequencyPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecondFrequencyPeriod() {
    return secondFrequencyPeriod;
  }


  public void setSecondFrequencyPeriod(String secondFrequencyPeriod) {
    
    
    
    this.secondFrequencyPeriod = secondFrequencyPeriod;
  }


  public ClientPayComponentFrequency secondPeriodOccurrence(String secondPeriodOccurrence) {
    
    
    
    
    this.secondPeriodOccurrence = secondPeriodOccurrence;
    return this;
  }

   /**
   * Get secondPeriodOccurrence
   * @return secondPeriodOccurrence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecondPeriodOccurrence() {
    return secondPeriodOccurrence;
  }


  public void setSecondPeriodOccurrence(String secondPeriodOccurrence) {
    
    
    
    this.secondPeriodOccurrence = secondPeriodOccurrence;
  }


  public ClientPayComponentFrequency intervalValue(Integer intervalValue) {
    
    
    
    
    this.intervalValue = intervalValue;
    return this;
  }

   /**
   * Get intervalValue
   * @return intervalValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIntervalValue() {
    return intervalValue;
  }


  public void setIntervalValue(Integer intervalValue) {
    
    
    
    this.intervalValue = intervalValue;
  }


  public ClientPayComponentFrequency firstCheckRuleId(Long firstCheckRuleId) {
    
    
    
    
    this.firstCheckRuleId = firstCheckRuleId;
    return this;
  }

   /**
   * Get firstCheckRuleId
   * @return firstCheckRuleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getFirstCheckRuleId() {
    return firstCheckRuleId;
  }


  public void setFirstCheckRuleId(Long firstCheckRuleId) {
    
    
    
    this.firstCheckRuleId = firstCheckRuleId;
  }


  public ClientPayComponentFrequency firstCheckRuleType(String firstCheckRuleType) {
    
    
    
    
    this.firstCheckRuleType = firstCheckRuleType;
    return this;
  }

   /**
   * Get firstCheckRuleType
   * @return firstCheckRuleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstCheckRuleType() {
    return firstCheckRuleType;
  }


  public void setFirstCheckRuleType(String firstCheckRuleType) {
    
    
    
    this.firstCheckRuleType = firstCheckRuleType;
  }


  public ClientPayComponentFrequency firstCheckRule(String firstCheckRule) {
    
    
    
    
    this.firstCheckRule = firstCheckRule;
    return this;
  }

   /**
   * Get firstCheckRule
   * @return firstCheckRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstCheckRule() {
    return firstCheckRule;
  }


  public void setFirstCheckRule(String firstCheckRule) {
    
    
    
    this.firstCheckRule = firstCheckRule;
  }


  public ClientPayComponentFrequency firstCheckOnly(Boolean firstCheckOnly) {
    
    
    
    
    this.firstCheckOnly = firstCheckOnly;
    return this;
  }

   /**
   * Get firstCheckOnly
   * @return firstCheckOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getFirstCheckOnly() {
    return firstCheckOnly;
  }


  public void setFirstCheckOnly(Boolean firstCheckOnly) {
    
    
    
    this.firstCheckOnly = firstCheckOnly;
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
   * @return the ClientPayComponentFrequency instance itself
   */
  public ClientPayComponentFrequency putAdditionalProperty(String key, Object value) {
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
    ClientPayComponentFrequency clientPayComponentFrequency = (ClientPayComponentFrequency) o;
    return Objects.equals(this.cfId, clientPayComponentFrequency.cfId) &&
        Objects.equals(this.frequencyOptionId, clientPayComponentFrequency.frequencyOptionId) &&
        Objects.equals(this.freqTypeId, clientPayComponentFrequency.freqTypeId) &&
        Objects.equals(this.frequencyType, clientPayComponentFrequency.frequencyType) &&
        Objects.equals(this.freqType, clientPayComponentFrequency.freqType) &&
        Objects.equals(this.payFreqId, clientPayComponentFrequency.payFreqId) &&
        Objects.equals(this.payFrequency, clientPayComponentFrequency.payFrequency) &&
        Objects.equals(this.payFreq, clientPayComponentFrequency.payFreq) &&
        Objects.equals(this.firstPeriodOccurrenceId, clientPayComponentFrequency.firstPeriodOccurrenceId) &&
        Objects.equals(this.firstPeriodOccurrenceType, clientPayComponentFrequency.firstPeriodOccurrenceType) &&
        Objects.equals(this.firstFrequencyPeriod, clientPayComponentFrequency.firstFrequencyPeriod) &&
        Objects.equals(this.firstPeriodOccurrence, clientPayComponentFrequency.firstPeriodOccurrence) &&
        Objects.equals(this.secondPeriodOccurrenceId, clientPayComponentFrequency.secondPeriodOccurrenceId) &&
        Objects.equals(this.secondPeriodOccurrenceType, clientPayComponentFrequency.secondPeriodOccurrenceType) &&
        Objects.equals(this.secondFrequencyPeriod, clientPayComponentFrequency.secondFrequencyPeriod) &&
        Objects.equals(this.secondPeriodOccurrence, clientPayComponentFrequency.secondPeriodOccurrence) &&
        Objects.equals(this.intervalValue, clientPayComponentFrequency.intervalValue) &&
        Objects.equals(this.firstCheckRuleId, clientPayComponentFrequency.firstCheckRuleId) &&
        Objects.equals(this.firstCheckRuleType, clientPayComponentFrequency.firstCheckRuleType) &&
        Objects.equals(this.firstCheckRule, clientPayComponentFrequency.firstCheckRule) &&
        Objects.equals(this.firstCheckOnly, clientPayComponentFrequency.firstCheckOnly)&&
        Objects.equals(this.additionalProperties, clientPayComponentFrequency.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfId, frequencyOptionId, freqTypeId, frequencyType, freqType, payFreqId, payFrequency, payFreq, firstPeriodOccurrenceId, firstPeriodOccurrenceType, firstFrequencyPeriod, firstPeriodOccurrence, secondPeriodOccurrenceId, secondPeriodOccurrenceType, secondFrequencyPeriod, secondPeriodOccurrence, intervalValue, firstCheckRuleId, firstCheckRuleType, firstCheckRule, firstCheckOnly, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientPayComponentFrequency {\n");
    sb.append("    cfId: ").append(toIndentedString(cfId)).append("\n");
    sb.append("    frequencyOptionId: ").append(toIndentedString(frequencyOptionId)).append("\n");
    sb.append("    freqTypeId: ").append(toIndentedString(freqTypeId)).append("\n");
    sb.append("    frequencyType: ").append(toIndentedString(frequencyType)).append("\n");
    sb.append("    freqType: ").append(toIndentedString(freqType)).append("\n");
    sb.append("    payFreqId: ").append(toIndentedString(payFreqId)).append("\n");
    sb.append("    payFrequency: ").append(toIndentedString(payFrequency)).append("\n");
    sb.append("    payFreq: ").append(toIndentedString(payFreq)).append("\n");
    sb.append("    firstPeriodOccurrenceId: ").append(toIndentedString(firstPeriodOccurrenceId)).append("\n");
    sb.append("    firstPeriodOccurrenceType: ").append(toIndentedString(firstPeriodOccurrenceType)).append("\n");
    sb.append("    firstFrequencyPeriod: ").append(toIndentedString(firstFrequencyPeriod)).append("\n");
    sb.append("    firstPeriodOccurrence: ").append(toIndentedString(firstPeriodOccurrence)).append("\n");
    sb.append("    secondPeriodOccurrenceId: ").append(toIndentedString(secondPeriodOccurrenceId)).append("\n");
    sb.append("    secondPeriodOccurrenceType: ").append(toIndentedString(secondPeriodOccurrenceType)).append("\n");
    sb.append("    secondFrequencyPeriod: ").append(toIndentedString(secondFrequencyPeriod)).append("\n");
    sb.append("    secondPeriodOccurrence: ").append(toIndentedString(secondPeriodOccurrence)).append("\n");
    sb.append("    intervalValue: ").append(toIndentedString(intervalValue)).append("\n");
    sb.append("    firstCheckRuleId: ").append(toIndentedString(firstCheckRuleId)).append("\n");
    sb.append("    firstCheckRuleType: ").append(toIndentedString(firstCheckRuleType)).append("\n");
    sb.append("    firstCheckRule: ").append(toIndentedString(firstCheckRule)).append("\n");
    sb.append("    firstCheckOnly: ").append(toIndentedString(firstCheckOnly)).append("\n");
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
    openapiFields.add("cfId");
    openapiFields.add("frequencyOptionId");
    openapiFields.add("freqTypeId");
    openapiFields.add("frequencyType");
    openapiFields.add("freqType");
    openapiFields.add("payFreqId");
    openapiFields.add("payFrequency");
    openapiFields.add("payFreq");
    openapiFields.add("firstPeriodOccurrenceId");
    openapiFields.add("firstPeriodOccurrenceType");
    openapiFields.add("firstFrequencyPeriod");
    openapiFields.add("firstPeriodOccurrence");
    openapiFields.add("secondPeriodOccurrenceId");
    openapiFields.add("secondPeriodOccurrenceType");
    openapiFields.add("secondFrequencyPeriod");
    openapiFields.add("secondPeriodOccurrence");
    openapiFields.add("intervalValue");
    openapiFields.add("firstCheckRuleId");
    openapiFields.add("firstCheckRuleType");
    openapiFields.add("firstCheckRule");
    openapiFields.add("firstCheckOnly");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ClientPayComponentFrequency
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ClientPayComponentFrequency.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClientPayComponentFrequency is not found in the empty JSON string", ClientPayComponentFrequency.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("frequencyType") != null && !jsonObj.get("frequencyType").isJsonNull()) && !jsonObj.get("frequencyType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `frequencyType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("frequencyType").toString()));
      }
      if ((jsonObj.get("freqType") != null && !jsonObj.get("freqType").isJsonNull()) && !jsonObj.get("freqType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `freqType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("freqType").toString()));
      }
      if ((jsonObj.get("payFrequency") != null && !jsonObj.get("payFrequency").isJsonNull()) && !jsonObj.get("payFrequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payFrequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payFrequency").toString()));
      }
      if ((jsonObj.get("payFreq") != null && !jsonObj.get("payFreq").isJsonNull()) && !jsonObj.get("payFreq").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payFreq` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payFreq").toString()));
      }
      if ((jsonObj.get("firstPeriodOccurrenceType") != null && !jsonObj.get("firstPeriodOccurrenceType").isJsonNull()) && !jsonObj.get("firstPeriodOccurrenceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstPeriodOccurrenceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstPeriodOccurrenceType").toString()));
      }
      if ((jsonObj.get("firstFrequencyPeriod") != null && !jsonObj.get("firstFrequencyPeriod").isJsonNull()) && !jsonObj.get("firstFrequencyPeriod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstFrequencyPeriod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstFrequencyPeriod").toString()));
      }
      if ((jsonObj.get("firstPeriodOccurrence") != null && !jsonObj.get("firstPeriodOccurrence").isJsonNull()) && !jsonObj.get("firstPeriodOccurrence").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstPeriodOccurrence` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstPeriodOccurrence").toString()));
      }
      if ((jsonObj.get("secondPeriodOccurrenceType") != null && !jsonObj.get("secondPeriodOccurrenceType").isJsonNull()) && !jsonObj.get("secondPeriodOccurrenceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondPeriodOccurrenceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secondPeriodOccurrenceType").toString()));
      }
      if ((jsonObj.get("secondFrequencyPeriod") != null && !jsonObj.get("secondFrequencyPeriod").isJsonNull()) && !jsonObj.get("secondFrequencyPeriod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondFrequencyPeriod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secondFrequencyPeriod").toString()));
      }
      if ((jsonObj.get("secondPeriodOccurrence") != null && !jsonObj.get("secondPeriodOccurrence").isJsonNull()) && !jsonObj.get("secondPeriodOccurrence").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondPeriodOccurrence` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secondPeriodOccurrence").toString()));
      }
      if ((jsonObj.get("firstCheckRuleType") != null && !jsonObj.get("firstCheckRuleType").isJsonNull()) && !jsonObj.get("firstCheckRuleType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstCheckRuleType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstCheckRuleType").toString()));
      }
      if ((jsonObj.get("firstCheckRule") != null && !jsonObj.get("firstCheckRule").isJsonNull()) && !jsonObj.get("firstCheckRule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstCheckRule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstCheckRule").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClientPayComponentFrequency.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClientPayComponentFrequency' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClientPayComponentFrequency> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClientPayComponentFrequency.class));

       return (TypeAdapter<T>) new TypeAdapter<ClientPayComponentFrequency>() {
           @Override
           public void write(JsonWriter out, ClientPayComponentFrequency value) throws IOException {
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
           public ClientPayComponentFrequency read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ClientPayComponentFrequency instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ClientPayComponentFrequency given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClientPayComponentFrequency
  * @throws IOException if the JSON string is invalid with respect to ClientPayComponentFrequency
  */
  public static ClientPayComponentFrequency fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClientPayComponentFrequency.class);
  }

 /**
  * Convert an instance of ClientPayComponentFrequency to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
