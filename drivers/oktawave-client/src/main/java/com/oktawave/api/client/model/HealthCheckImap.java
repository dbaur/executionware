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
 * Imap health check
 */
@ApiModel(description = "Imap health check")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-03T15:23:33.358+01:00")
public class HealthCheckImap {
  @SerializedName("Port")
  private Integer port = null;

  @SerializedName("Timeout")
  private Integer timeout = null;

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

  public HealthCheckImap port(Integer port) {
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

  public HealthCheckImap timeout(Integer timeout) {
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

  public HealthCheckImap notificationTypes(List<DictionaryItem> notificationTypes) {
    this.notificationTypes = notificationTypes;
    return this;
  }

  public HealthCheckImap addNotificationTypesItem(DictionaryItem notificationTypesItem) {
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

  public HealthCheckImap notificationEventTypes(List<DictionaryItem> notificationEventTypes) {
    this.notificationEventTypes = notificationEventTypes;
    return this;
  }

  public HealthCheckImap addNotificationEventTypesItem(DictionaryItem notificationEventTypesItem) {
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

  public HealthCheckImap notificationTime(DictionaryItem notificationTime) {
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

  public HealthCheckImap locationsFailoverEnabled(Boolean locationsFailoverEnabled) {
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

  public HealthCheckImap errorTolerance(Integer errorTolerance) {
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

  public HealthCheckImap id(Integer id) {
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

  public HealthCheckImap interval(Integer interval) {
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

  public HealthCheckImap name(String name) {
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

  public HealthCheckImap address(String address) {
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

  public HealthCheckImap serviceType(DictionaryItem serviceType) {
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

  public HealthCheckImap state(DictionaryItem state) {
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

  public HealthCheckImap detailsLocation(String detailsLocation) {
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

  public HealthCheckImap paused(Boolean paused) {
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

  public HealthCheckImap suspended(Boolean suspended) {
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

  public HealthCheckImap lastInvalidCheck(OffsetDateTime lastInvalidCheck) {
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

  public HealthCheckImap lastValidCheck(OffsetDateTime lastValidCheck) {
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

    public HealthCheckImap description(String description) {
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
    HealthCheckImap healthCheckImap = (HealthCheckImap) o;
    return Objects.equals(this.port, healthCheckImap.port) &&
        Objects.equals(this.timeout, healthCheckImap.timeout) &&
        Objects.equals(this.notificationTypes, healthCheckImap.notificationTypes) &&
        Objects.equals(this.notificationEventTypes, healthCheckImap.notificationEventTypes) &&
        Objects.equals(this.notificationTime, healthCheckImap.notificationTime) &&
        Objects.equals(this.locationsFailoverEnabled, healthCheckImap.locationsFailoverEnabled) &&
        Objects.equals(this.errorTolerance, healthCheckImap.errorTolerance) &&
        Objects.equals(this.id, healthCheckImap.id) &&
        Objects.equals(this.interval, healthCheckImap.interval) &&
        Objects.equals(this.name, healthCheckImap.name) &&
        Objects.equals(this.address, healthCheckImap.address) &&
        Objects.equals(this.serviceType, healthCheckImap.serviceType) &&
        Objects.equals(this.state, healthCheckImap.state) &&
        Objects.equals(this.detailsLocation, healthCheckImap.detailsLocation) &&
        Objects.equals(this.paused, healthCheckImap.paused) &&
        Objects.equals(this.suspended, healthCheckImap.suspended) &&
        Objects.equals(this.lastInvalidCheck, healthCheckImap.lastInvalidCheck) &&
            Objects.equals(this.lastValidCheck, healthCheckImap.lastValidCheck) &&
            Objects.equals(this.description, healthCheckImap.description);
  }

  @Override
  public int hashCode() {
      return Objects.hash(port, timeout, notificationTypes, notificationEventTypes, notificationTime, locationsFailoverEnabled, errorTolerance, id, interval, name, address, serviceType, state, detailsLocation, paused, suspended, lastInvalidCheck, lastValidCheck, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckImap {\n");
    
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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
