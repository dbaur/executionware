/*
 * Oktawave API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.oktawave.api.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Http health check
 */
@ApiModel(description = "Http health check")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-03T15:23:33.358+01:00")
public class HealthCheckHttp {
  @SerializedName("HttpMethod")
  private DictionaryItem httpMethod = null;

  @SerializedName("ContentRegularExpression")
  private String contentRegularExpression = null;

  @SerializedName("ContentNegativeRegularExpression")
  private String contentNegativeRegularExpression = null;

  @SerializedName("Port")
  private Integer port = null;

  @SerializedName("Timeout")
  private Integer timeout = null;

  @SerializedName("Content")
  private String content = null;

  @SerializedName("ContentType")
  private String contentType = null;

  @SerializedName("NotificationTypes")
  private List<DictionaryItem> notificationTypes = null;

  @SerializedName("NotificationEventTypes")
  private List<DictionaryItem> notificationEventTypes = null;

  @SerializedName("NotificationTime")
  private DictionaryItem notificationTime = null;

  @SerializedName("LocationsFailoverEnabled")
  private Boolean locationsFailoverEnabled = null;

  @SerializedName("ErrorTolerance")
  private Integer errorTolerance = null;

  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("Interval")
  private Integer interval = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Address")
  private String address = null;

  @SerializedName("ServiceType")
  private DictionaryItem serviceType = null;

  @SerializedName("State")
  private DictionaryItem state = null;

  @SerializedName("DetailsLocation")
  private String detailsLocation = null;

  @SerializedName("Paused")
  private Boolean paused = null;

  @SerializedName("Suspended")
  private Boolean suspended = null;

  @SerializedName("LastInvalidCheck")
  private OffsetDateTime lastInvalidCheck = null;

  @SerializedName("LastValidCheck")
  private OffsetDateTime lastValidCheck = null;

    @SerializedName("Description")
    private String description = null;

  public HealthCheckHttp httpMethod(DictionaryItem httpMethod) {
    this.httpMethod = httpMethod;
    return this;
  }

   /**
   * Health check http method type
   * @return httpMethod
  **/
  @ApiModelProperty(value = "Health check http method type")
  public DictionaryItem getHttpMethod() {
    return httpMethod;
  }

  public void setHttpMethod(DictionaryItem httpMethod) {
    this.httpMethod = httpMethod;
  }

  public HealthCheckHttp contentRegularExpression(String contentRegularExpression) {
    this.contentRegularExpression = contentRegularExpression;
    return this;
  }

   /**
   * The content has to match the expression
   * @return contentRegularExpression
  **/
  @ApiModelProperty(value = "The content has to match the expression")
  public String getContentRegularExpression() {
    return contentRegularExpression;
  }

  public void setContentRegularExpression(String contentRegularExpression) {
    this.contentRegularExpression = contentRegularExpression;
  }

  public HealthCheckHttp contentNegativeRegularExpression(String contentNegativeRegularExpression) {
    this.contentNegativeRegularExpression = contentNegativeRegularExpression;
    return this;
  }

   /**
   * The content cannot match the expression
   * @return contentNegativeRegularExpression
  **/
  @ApiModelProperty(value = "The content cannot match the expression")
  public String getContentNegativeRegularExpression() {
    return contentNegativeRegularExpression;
  }

  public void setContentNegativeRegularExpression(String contentNegativeRegularExpression) {
    this.contentNegativeRegularExpression = contentNegativeRegularExpression;
  }

  public HealthCheckHttp port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Port
   * @return port
  **/
  @ApiModelProperty(value = "Port")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public HealthCheckHttp timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Timeout
   * @return timeout
  **/
  @ApiModelProperty(value = "Timeout")
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  public HealthCheckHttp content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Content
   * @return content
  **/
  @ApiModelProperty(value = "Content")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public HealthCheckHttp contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Content type
   * @return contentType
  **/
  @ApiModelProperty(value = "Content type")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public HealthCheckHttp notificationTypes(List<DictionaryItem> notificationTypes) {
    this.notificationTypes = notificationTypes;
    return this;
  }

  public HealthCheckHttp addNotificationTypesItem(DictionaryItem notificationTypesItem) {
    if (this.notificationTypes == null) {
      this.notificationTypes = new ArrayList<DictionaryItem>();
    }
    this.notificationTypes.add(notificationTypesItem);
    return this;
  }

   /**
   * Notification types enabled for a health check
   * @return notificationTypes
  **/
  @ApiModelProperty(value = "Notification types enabled for a health check")
  public List<DictionaryItem> getNotificationTypes() {
    return notificationTypes;
  }

  public void setNotificationTypes(List<DictionaryItem> notificationTypes) {
    this.notificationTypes = notificationTypes;
  }

  public HealthCheckHttp notificationEventTypes(List<DictionaryItem> notificationEventTypes) {
    this.notificationEventTypes = notificationEventTypes;
    return this;
  }

  public HealthCheckHttp addNotificationEventTypesItem(DictionaryItem notificationEventTypesItem) {
    if (this.notificationEventTypes == null) {
      this.notificationEventTypes = new ArrayList<DictionaryItem>();
    }
    this.notificationEventTypes.add(notificationEventTypesItem);
    return this;
  }

   /**
   * Event types with enabled notification
   * @return notificationEventTypes
  **/
  @ApiModelProperty(value = "Event types with enabled notification")
  public List<DictionaryItem> getNotificationEventTypes() {
    return notificationEventTypes;
  }

  public void setNotificationEventTypes(List<DictionaryItem> notificationEventTypes) {
    this.notificationEventTypes = notificationEventTypes;
  }

  public HealthCheckHttp notificationTime(DictionaryItem notificationTime) {
    this.notificationTime = notificationTime;
    return this;
  }

   /**
   * Time when notification is sent
   * @return notificationTime
  **/
  @ApiModelProperty(value = "Time when notification is sent")
  public DictionaryItem getNotificationTime() {
    return notificationTime;
  }

  public void setNotificationTime(DictionaryItem notificationTime) {
    this.notificationTime = notificationTime;
  }

  public HealthCheckHttp locationsFailoverEnabled(Boolean locationsFailoverEnabled) {
    this.locationsFailoverEnabled = locationsFailoverEnabled;
    return this;
  }

   /**
   * Use random substitute locations in case of location breakdown
   * @return locationsFailoverEnabled
  **/
  @ApiModelProperty(value = "Use random substitute locations in case of location breakdown")
  public Boolean isLocationsFailoverEnabled() {
    return locationsFailoverEnabled;
  }

  public void setLocationsFailoverEnabled(Boolean locationsFailoverEnabled) {
    this.locationsFailoverEnabled = locationsFailoverEnabled;
  }

  public HealthCheckHttp errorTolerance(Integer errorTolerance) {
    this.errorTolerance = errorTolerance;
    return this;
  }

   /**
   * How many (%) locations have to report an error to consider it a breakdown
   * @return errorTolerance
  **/
  @ApiModelProperty(value = "How many (%) locations have to report an error to consider it a breakdown")
  public Integer getErrorTolerance() {
    return errorTolerance;
  }

  public void setErrorTolerance(Integer errorTolerance) {
    this.errorTolerance = errorTolerance;
  }

  public HealthCheckHttp id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Id
   * @return id
  **/
  @ApiModelProperty(value = "Id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public HealthCheckHttp interval(Integer interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Interval
   * @return interval
  **/
  @ApiModelProperty(value = "Interval")
  public Integer getInterval() {
    return interval;
  }

  public void setInterval(Integer interval) {
    this.interval = interval;
  }

  public HealthCheckHttp name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HealthCheckHttp address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Address
   * @return address
  **/
  @ApiModelProperty(value = "Address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public HealthCheckHttp serviceType(DictionaryItem serviceType) {
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Type
   * @return serviceType
  **/
  @ApiModelProperty(value = "Type")
  public DictionaryItem getServiceType() {
    return serviceType;
  }

  public void setServiceType(DictionaryItem serviceType) {
    this.serviceType = serviceType;
  }

  public HealthCheckHttp state(DictionaryItem state) {
    this.state = state;
    return this;
  }

   /**
   * State
   * @return state
  **/
  @ApiModelProperty(value = "State")
  public DictionaryItem getState() {
    return state;
  }

  public void setState(DictionaryItem state) {
    this.state = state;
  }

  public HealthCheckHttp detailsLocation(String detailsLocation) {
    this.detailsLocation = detailsLocation;
    return this;
  }

   /**
   * Details url
   * @return detailsLocation
  **/
  @ApiModelProperty(value = "Details url")
  public String getDetailsLocation() {
    return detailsLocation;
  }

  public void setDetailsLocation(String detailsLocation) {
    this.detailsLocation = detailsLocation;
  }

  public HealthCheckHttp paused(Boolean paused) {
    this.paused = paused;
    return this;
  }

   /**
   * Is paused
   * @return paused
  **/
  @ApiModelProperty(value = "Is paused")
  public Boolean isPaused() {
    return paused;
  }

  public void setPaused(Boolean paused) {
    this.paused = paused;
  }

  public HealthCheckHttp suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

   /**
   * Is suspended
   * @return suspended
  **/
  @ApiModelProperty(value = "Is suspended")
  public Boolean isSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public HealthCheckHttp lastInvalidCheck(OffsetDateTime lastInvalidCheck) {
    this.lastInvalidCheck = lastInvalidCheck;
    return this;
  }

   /**
   * Last invalid check
   * @return lastInvalidCheck
  **/
  @ApiModelProperty(value = "Last invalid check")
  public OffsetDateTime getLastInvalidCheck() {
    return lastInvalidCheck;
  }

  public void setLastInvalidCheck(OffsetDateTime lastInvalidCheck) {
    this.lastInvalidCheck = lastInvalidCheck;
  }

  public HealthCheckHttp lastValidCheck(OffsetDateTime lastValidCheck) {
    this.lastValidCheck = lastValidCheck;
    return this;
  }

   /**
   * Last valid check
   * @return lastValidCheck
  **/
  @ApiModelProperty(value = "Last valid check")
  public OffsetDateTime getLastValidCheck() {
    return lastValidCheck;
  }

  public void setLastValidCheck(OffsetDateTime lastValidCheck) {
    this.lastValidCheck = lastValidCheck;
  }

    public HealthCheckHttp description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description
     *
     * @return description
     **/
    @ApiModelProperty(value = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckHttp healthCheckHttp = (HealthCheckHttp) o;
    return Objects.equals(this.httpMethod, healthCheckHttp.httpMethod) &&
        Objects.equals(this.contentRegularExpression, healthCheckHttp.contentRegularExpression) &&
        Objects.equals(this.contentNegativeRegularExpression, healthCheckHttp.contentNegativeRegularExpression) &&
        Objects.equals(this.port, healthCheckHttp.port) &&
        Objects.equals(this.timeout, healthCheckHttp.timeout) &&
        Objects.equals(this.content, healthCheckHttp.content) &&
        Objects.equals(this.contentType, healthCheckHttp.contentType) &&
        Objects.equals(this.notificationTypes, healthCheckHttp.notificationTypes) &&
        Objects.equals(this.notificationEventTypes, healthCheckHttp.notificationEventTypes) &&
        Objects.equals(this.notificationTime, healthCheckHttp.notificationTime) &&
        Objects.equals(this.locationsFailoverEnabled, healthCheckHttp.locationsFailoverEnabled) &&
        Objects.equals(this.errorTolerance, healthCheckHttp.errorTolerance) &&
        Objects.equals(this.id, healthCheckHttp.id) &&
        Objects.equals(this.interval, healthCheckHttp.interval) &&
        Objects.equals(this.name, healthCheckHttp.name) &&
        Objects.equals(this.address, healthCheckHttp.address) &&
        Objects.equals(this.serviceType, healthCheckHttp.serviceType) &&
        Objects.equals(this.state, healthCheckHttp.state) &&
        Objects.equals(this.detailsLocation, healthCheckHttp.detailsLocation) &&
        Objects.equals(this.paused, healthCheckHttp.paused) &&
        Objects.equals(this.suspended, healthCheckHttp.suspended) &&
        Objects.equals(this.lastInvalidCheck, healthCheckHttp.lastInvalidCheck) &&
            Objects.equals(this.lastValidCheck, healthCheckHttp.lastValidCheck) &&
            Objects.equals(this.description, healthCheckHttp.description);
  }

  @Override
  public int hashCode() {
      return Objects.hash(httpMethod, contentRegularExpression, contentNegativeRegularExpression, port, timeout, content, contentType, notificationTypes, notificationEventTypes, notificationTime, locationsFailoverEnabled, errorTolerance, id, interval, name, address, serviceType, state, detailsLocation, paused, suspended, lastInvalidCheck, lastValidCheck, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckHttp {\n");

    sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
    sb.append("    contentRegularExpression: ").append(toIndentedString(contentRegularExpression)).append("\n");
    sb.append("    contentNegativeRegularExpression: ").append(toIndentedString(contentNegativeRegularExpression)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    notificationTypes: ").append(toIndentedString(notificationTypes)).append("\n");
    sb.append("    notificationEventTypes: ").append(toIndentedString(notificationEventTypes)).append("\n");
    sb.append("    notificationTime: ").append(toIndentedString(notificationTime)).append("\n");
    sb.append("    locationsFailoverEnabled: ").append(toIndentedString(locationsFailoverEnabled)).append("\n");
    sb.append("    errorTolerance: ").append(toIndentedString(errorTolerance)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    detailsLocation: ").append(toIndentedString(detailsLocation)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    lastInvalidCheck: ").append(toIndentedString(lastInvalidCheck)).append("\n");
    sb.append("    lastValidCheck: ").append(toIndentedString(lastValidCheck)).append("\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

