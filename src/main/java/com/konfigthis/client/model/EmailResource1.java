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
import com.konfigthis.client.model.WorkerErrorResource;
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
 * EmailResource1
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmailResource1 {
  public static final String SERIALIZED_NAME_PRIMARY_EMAIL = "primaryEmail";
  @SerializedName(SERIALIZED_NAME_PRIMARY_EMAIL)
  private String primaryEmail;

  public static final String SERIALIZED_NAME_SECONDARY_EMAIL = "secondaryEmail";
  @SerializedName(SERIALIZED_NAME_SECONDARY_EMAIL)
  private String secondaryEmail;

  public static final String SERIALIZED_NAME_CONNECTION_NAME = "connectionName";
  @SerializedName(SERIALIZED_NAME_CONNECTION_NAME)
  private String connectionName;

  public static final String SERIALIZED_NAME_DISPLAY_ID = "displayId";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ID)
  private String displayId;

  public static final String SERIALIZED_NAME_LEGAL_NAME = "legalName";
  @SerializedName(SERIALIZED_NAME_LEGAL_NAME)
  private String legalName;

  /**
   * Gets or Sets notificationType
   */
  @JsonAdapter(NotificationTypeEnum.Adapter.class)
 public enum NotificationTypeEnum {
    CONNECTION_ERROR("CONNECTION_ERROR"),
    
    DATA_ERROR("DATA_ERROR"),
    
    WORKER_CHECK_ERROR("WORKER_CHECK_ERROR"),
    
    MULTI_ID_SPI_REJECT("MULTI_ID_SPI_REJECT"),
    
    EMPLOYEE_OVERTIME_NOTIFICATION("EMPLOYEE_OVERTIME_NOTIFICATION"),
    
    COMPANY_PAY_PERIOD_ERROR("COMPANY_PAY_PERIOD_ERROR"),
    
    PAYROLL_CONFIRMATION("PAYROLL_CONFIRMATION"),
    
    COMPANY_JOBCODE("COMPANY_JOBCODE"),
    
    OFFBOARDING_SURVEY("OFFBOARDING_SURVEY"),
    
    OFFBOARDING_ERROR("OFFBOARDING_ERROR"),
    
    WORKER_PUNCH_OR_ADJUSTMENT_ERROR("WORKER_PUNCH_OR_ADJUSTMENT_ERROR"),
    
    WORKER_SCHEDULE_ERROR("WORKER_SCHEDULE_ERROR");

    private String value;

    NotificationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NotificationTypeEnum fromValue(String value) {
      for (NotificationTypeEnum b : NotificationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NotificationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NotificationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NotificationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NotificationTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NOTIFICATION_TYPE = "notificationType";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_TYPE)
  private NotificationTypeEnum notificationType;

  public static final String SERIALIZED_NAME_WORKER_ERRORS = "workerErrors";
  @SerializedName(SERIALIZED_NAME_WORKER_ERRORS)
  private List<WorkerErrorResource> workerErrors = null;

  public static final String SERIALIZED_NAME_PAY_PERIOD = "payPeriod";
  @SerializedName(SERIALIZED_NAME_PAY_PERIOD)
  private String payPeriod;

  public static final String SERIALIZED_NAME_PARTNER_LOCATION_ID = "partnerLocationId";
  @SerializedName(SERIALIZED_NAME_PARTNER_LOCATION_ID)
  private String partnerLocationId;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_SOURCE_JOB_NAME = "sourceJobName";
  @SerializedName(SERIALIZED_NAME_SOURCE_JOB_NAME)
  private String sourceJobName;

  public static final String SERIALIZED_NAME_BCC = "bcc";
  @SerializedName(SERIALIZED_NAME_BCC)
  private String bcc;

  public static final String SERIALIZED_NAME_EMPLOYEE_FIRST_NAME = "employeeFirstName";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_FIRST_NAME)
  private String employeeFirstName;

  public static final String SERIALIZED_NAME_EMPLOYEE_LAST_NAME = "employeeLastName";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_LAST_NAME)
  private String employeeLastName;

  public static final String SERIALIZED_NAME_LINK_TO_SURVEY = "linkToSurvey";
  @SerializedName(SERIALIZED_NAME_LINK_TO_SURVEY)
  private String linkToSurvey;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;

  public EmailResource1() {
  }

  public EmailResource1 primaryEmail(String primaryEmail) {
    
    
    
    
    this.primaryEmail = primaryEmail;
    return this;
  }

   /**
   * Get primaryEmail
   * @return primaryEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrimaryEmail() {
    return primaryEmail;
  }


  public void setPrimaryEmail(String primaryEmail) {
    
    
    
    this.primaryEmail = primaryEmail;
  }


  public EmailResource1 secondaryEmail(String secondaryEmail) {
    
    
    
    
    this.secondaryEmail = secondaryEmail;
    return this;
  }

   /**
   * Get secondaryEmail
   * @return secondaryEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecondaryEmail() {
    return secondaryEmail;
  }


  public void setSecondaryEmail(String secondaryEmail) {
    
    
    
    this.secondaryEmail = secondaryEmail;
  }


  public EmailResource1 connectionName(String connectionName) {
    
    
    
    
    this.connectionName = connectionName;
    return this;
  }

   /**
   * Get connectionName
   * @return connectionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConnectionName() {
    return connectionName;
  }


  public void setConnectionName(String connectionName) {
    
    
    
    this.connectionName = connectionName;
  }


  public EmailResource1 displayId(String displayId) {
    
    
    
    
    this.displayId = displayId;
    return this;
  }

   /**
   * Get displayId
   * @return displayId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayId() {
    return displayId;
  }


  public void setDisplayId(String displayId) {
    
    
    
    this.displayId = displayId;
  }


  public EmailResource1 legalName(String legalName) {
    
    
    
    
    this.legalName = legalName;
    return this;
  }

   /**
   * Get legalName
   * @return legalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLegalName() {
    return legalName;
  }


  public void setLegalName(String legalName) {
    
    
    
    this.legalName = legalName;
  }


  public EmailResource1 notificationType(NotificationTypeEnum notificationType) {
    
    
    
    
    this.notificationType = notificationType;
    return this;
  }

   /**
   * Get notificationType
   * @return notificationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NotificationTypeEnum getNotificationType() {
    return notificationType;
  }


  public void setNotificationType(NotificationTypeEnum notificationType) {
    
    
    
    this.notificationType = notificationType;
  }


  public EmailResource1 workerErrors(List<WorkerErrorResource> workerErrors) {
    
    
    
    
    this.workerErrors = workerErrors;
    return this;
  }

  public EmailResource1 addWorkerErrorsItem(WorkerErrorResource workerErrorsItem) {
    if (this.workerErrors == null) {
      this.workerErrors = new ArrayList<>();
    }
    this.workerErrors.add(workerErrorsItem);
    return this;
  }

   /**
   * Get workerErrors
   * @return workerErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<WorkerErrorResource> getWorkerErrors() {
    return workerErrors;
  }


  public void setWorkerErrors(List<WorkerErrorResource> workerErrors) {
    
    
    
    this.workerErrors = workerErrors;
  }


  public EmailResource1 payPeriod(String payPeriod) {
    
    
    
    
    this.payPeriod = payPeriod;
    return this;
  }

   /**
   * Get payPeriod
   * @return payPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPayPeriod() {
    return payPeriod;
  }


  public void setPayPeriod(String payPeriod) {
    
    
    
    this.payPeriod = payPeriod;
  }


  public EmailResource1 partnerLocationId(String partnerLocationId) {
    
    
    
    
    this.partnerLocationId = partnerLocationId;
    return this;
  }

   /**
   * Get partnerLocationId
   * @return partnerLocationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPartnerLocationId() {
    return partnerLocationId;
  }


  public void setPartnerLocationId(String partnerLocationId) {
    
    
    
    this.partnerLocationId = partnerLocationId;
  }


  public EmailResource1 state(String state) {
    
    
    
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    
    
    
    this.state = state;
  }


  public EmailResource1 sourceJobName(String sourceJobName) {
    
    
    
    
    this.sourceJobName = sourceJobName;
    return this;
  }

   /**
   * Get sourceJobName
   * @return sourceJobName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSourceJobName() {
    return sourceJobName;
  }


  public void setSourceJobName(String sourceJobName) {
    
    
    
    this.sourceJobName = sourceJobName;
  }


  public EmailResource1 bcc(String bcc) {
    
    
    
    
    this.bcc = bcc;
    return this;
  }

   /**
   * Get bcc
   * @return bcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBcc() {
    return bcc;
  }


  public void setBcc(String bcc) {
    
    
    
    this.bcc = bcc;
  }


  public EmailResource1 employeeFirstName(String employeeFirstName) {
    
    
    
    
    this.employeeFirstName = employeeFirstName;
    return this;
  }

   /**
   * Get employeeFirstName
   * @return employeeFirstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmployeeFirstName() {
    return employeeFirstName;
  }


  public void setEmployeeFirstName(String employeeFirstName) {
    
    
    
    this.employeeFirstName = employeeFirstName;
  }


  public EmailResource1 employeeLastName(String employeeLastName) {
    
    
    
    
    this.employeeLastName = employeeLastName;
    return this;
  }

   /**
   * Get employeeLastName
   * @return employeeLastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmployeeLastName() {
    return employeeLastName;
  }


  public void setEmployeeLastName(String employeeLastName) {
    
    
    
    this.employeeLastName = employeeLastName;
  }


  public EmailResource1 linkToSurvey(String linkToSurvey) {
    
    
    
    
    this.linkToSurvey = linkToSurvey;
    return this;
  }

   /**
   * Get linkToSurvey
   * @return linkToSurvey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLinkToSurvey() {
    return linkToSurvey;
  }


  public void setLinkToSurvey(String linkToSurvey) {
    
    
    
    this.linkToSurvey = linkToSurvey;
  }


  public EmailResource1 links(List<Link> links) {
    
    
    
    
    this.links = links;
    return this;
  }

  public EmailResource1 addLinksItem(Link linksItem) {
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
   * @return the EmailResource1 instance itself
   */
  public EmailResource1 putAdditionalProperty(String key, Object value) {
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
    EmailResource1 emailResource1 = (EmailResource1) o;
    return Objects.equals(this.primaryEmail, emailResource1.primaryEmail) &&
        Objects.equals(this.secondaryEmail, emailResource1.secondaryEmail) &&
        Objects.equals(this.connectionName, emailResource1.connectionName) &&
        Objects.equals(this.displayId, emailResource1.displayId) &&
        Objects.equals(this.legalName, emailResource1.legalName) &&
        Objects.equals(this.notificationType, emailResource1.notificationType) &&
        Objects.equals(this.workerErrors, emailResource1.workerErrors) &&
        Objects.equals(this.payPeriod, emailResource1.payPeriod) &&
        Objects.equals(this.partnerLocationId, emailResource1.partnerLocationId) &&
        Objects.equals(this.state, emailResource1.state) &&
        Objects.equals(this.sourceJobName, emailResource1.sourceJobName) &&
        Objects.equals(this.bcc, emailResource1.bcc) &&
        Objects.equals(this.employeeFirstName, emailResource1.employeeFirstName) &&
        Objects.equals(this.employeeLastName, emailResource1.employeeLastName) &&
        Objects.equals(this.linkToSurvey, emailResource1.linkToSurvey) &&
        Objects.equals(this.links, emailResource1.links)&&
        Objects.equals(this.additionalProperties, emailResource1.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryEmail, secondaryEmail, connectionName, displayId, legalName, notificationType, workerErrors, payPeriod, partnerLocationId, state, sourceJobName, bcc, employeeFirstName, employeeLastName, linkToSurvey, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailResource1 {\n");
    sb.append("    primaryEmail: ").append(toIndentedString(primaryEmail)).append("\n");
    sb.append("    secondaryEmail: ").append(toIndentedString(secondaryEmail)).append("\n");
    sb.append("    connectionName: ").append(toIndentedString(connectionName)).append("\n");
    sb.append("    displayId: ").append(toIndentedString(displayId)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    workerErrors: ").append(toIndentedString(workerErrors)).append("\n");
    sb.append("    payPeriod: ").append(toIndentedString(payPeriod)).append("\n");
    sb.append("    partnerLocationId: ").append(toIndentedString(partnerLocationId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    sourceJobName: ").append(toIndentedString(sourceJobName)).append("\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    employeeFirstName: ").append(toIndentedString(employeeFirstName)).append("\n");
    sb.append("    employeeLastName: ").append(toIndentedString(employeeLastName)).append("\n");
    sb.append("    linkToSurvey: ").append(toIndentedString(linkToSurvey)).append("\n");
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
    openapiFields.add("primaryEmail");
    openapiFields.add("secondaryEmail");
    openapiFields.add("connectionName");
    openapiFields.add("displayId");
    openapiFields.add("legalName");
    openapiFields.add("notificationType");
    openapiFields.add("workerErrors");
    openapiFields.add("payPeriod");
    openapiFields.add("partnerLocationId");
    openapiFields.add("state");
    openapiFields.add("sourceJobName");
    openapiFields.add("bcc");
    openapiFields.add("employeeFirstName");
    openapiFields.add("employeeLastName");
    openapiFields.add("linkToSurvey");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmailResource1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmailResource1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmailResource1 is not found in the empty JSON string", EmailResource1.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("primaryEmail") != null && !jsonObj.get("primaryEmail").isJsonNull()) && !jsonObj.get("primaryEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primaryEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primaryEmail").toString()));
      }
      if ((jsonObj.get("secondaryEmail") != null && !jsonObj.get("secondaryEmail").isJsonNull()) && !jsonObj.get("secondaryEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondaryEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secondaryEmail").toString()));
      }
      if ((jsonObj.get("connectionName") != null && !jsonObj.get("connectionName").isJsonNull()) && !jsonObj.get("connectionName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connectionName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connectionName").toString()));
      }
      if ((jsonObj.get("displayId") != null && !jsonObj.get("displayId").isJsonNull()) && !jsonObj.get("displayId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayId").toString()));
      }
      if ((jsonObj.get("legalName") != null && !jsonObj.get("legalName").isJsonNull()) && !jsonObj.get("legalName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legalName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legalName").toString()));
      }
      if ((jsonObj.get("notificationType") != null && !jsonObj.get("notificationType").isJsonNull()) && !jsonObj.get("notificationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notificationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notificationType").toString()));
      }
      if (jsonObj.get("workerErrors") != null && !jsonObj.get("workerErrors").isJsonNull()) {
        JsonArray jsonArrayworkerErrors = jsonObj.getAsJsonArray("workerErrors");
        if (jsonArrayworkerErrors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("workerErrors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `workerErrors` to be an array in the JSON string but got `%s`", jsonObj.get("workerErrors").toString()));
          }

          // validate the optional field `workerErrors` (array)
          for (int i = 0; i < jsonArrayworkerErrors.size(); i++) {
            WorkerErrorResource.validateJsonObject(jsonArrayworkerErrors.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("payPeriod") != null && !jsonObj.get("payPeriod").isJsonNull()) && !jsonObj.get("payPeriod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payPeriod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payPeriod").toString()));
      }
      if ((jsonObj.get("partnerLocationId") != null && !jsonObj.get("partnerLocationId").isJsonNull()) && !jsonObj.get("partnerLocationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnerLocationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnerLocationId").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("sourceJobName") != null && !jsonObj.get("sourceJobName").isJsonNull()) && !jsonObj.get("sourceJobName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceJobName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceJobName").toString()));
      }
      if ((jsonObj.get("bcc") != null && !jsonObj.get("bcc").isJsonNull()) && !jsonObj.get("bcc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bcc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bcc").toString()));
      }
      if ((jsonObj.get("employeeFirstName") != null && !jsonObj.get("employeeFirstName").isJsonNull()) && !jsonObj.get("employeeFirstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeFirstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeFirstName").toString()));
      }
      if ((jsonObj.get("employeeLastName") != null && !jsonObj.get("employeeLastName").isJsonNull()) && !jsonObj.get("employeeLastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeLastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeLastName").toString()));
      }
      if ((jsonObj.get("linkToSurvey") != null && !jsonObj.get("linkToSurvey").isJsonNull()) && !jsonObj.get("linkToSurvey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linkToSurvey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linkToSurvey").toString()));
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
       if (!EmailResource1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmailResource1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmailResource1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmailResource1.class));

       return (TypeAdapter<T>) new TypeAdapter<EmailResource1>() {
           @Override
           public void write(JsonWriter out, EmailResource1 value) throws IOException {
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
           public EmailResource1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmailResource1 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmailResource1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmailResource1
  * @throws IOException if the JSON string is invalid with respect to EmailResource1
  */
  public static EmailResource1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmailResource1.class);
  }

 /**
  * Convert an instance of EmailResource1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

