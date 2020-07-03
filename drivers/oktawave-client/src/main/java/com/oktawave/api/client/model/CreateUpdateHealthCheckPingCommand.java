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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Create/update ping health check command
 */
@ApiModel(description = "Create/update ping health check command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-03T15:23:33.358+01:00")
public class CreateUpdateHealthCheckPingCommand {
  @SerializedName("PackageSize")
  private Integer packageSize = 64;

  @SerializedName("ReplyTimeout")
  private Integer replyTimeout = 3000;

  @SerializedName("ErrorTolerance")
  private Integer errorTolerance = 51;

  @SerializedName("Name")
  private String name = "";

  @SerializedName("Address")
  private String address = "";

  @SerializedName("Interval")
  private Integer interval = 60;

  @SerializedName("Paused")
  private Boolean paused = false;

  @SerializedName("LocationsFailoverEnabled")
  private Boolean locationsFailoverEnabled = true;

  @SerializedName("NotificationTypeIds")
  private List<Integer> notificationTypeIds = null;

  @SerializedName("NotificationEventTypeIds")
  private List<Integer> notificationEventTypeIds = null;

  @SerializedName("NotificationTimeId")
  private Integer notificationTimeId = 1594;

    @SerializedName("Description")
    private String description = null;

  public CreateUpdateHealthCheckPingCommand packageSize(Integer packageSize) {
    this.packageSize = packageSize;
    return this;
  }

   /**
   * Data package size [bytes]
   * minimum: 1
   * maximum: 65535
   * @return packageSize
  **/
  @ApiModelProperty(required = true, value = "Data package size [bytes]")
  public Integer getPackageSize() {
    return packageSize;
  }

  public void setPackageSize(Integer packageSize) {
    this.packageSize = packageSize;
  }

  public CreateUpdateHealthCheckPingCommand replyTimeout(Integer replyTimeout) {
    this.replyTimeout = replyTimeout;
    return this;
  }

   /**
   * Maximum waiting time for a response [ms]
   * minimum: 1
   * maximum: 120000
   * @return replyTimeout
  **/
  @ApiModelProperty(required = true, value = "Maximum waiting time for a response [ms]")
  public Integer getReplyTimeout() {
    return replyTimeout;
  }

  public void setReplyTimeout(Integer replyTimeout) {
    this.replyTimeout = replyTimeout;
  }

  public CreateUpdateHealthCheckPingCommand errorTolerance(Integer errorTolerance) {
    this.errorTolerance = errorTolerance;
    return this;
  }

   /**
   * How many (%) locations have to report an error to consider it a breakdown
   * minimum: 1
   * maximum: 100
   * @return errorTolerance
  **/
  @ApiModelProperty(required = true, value = "How many (%) locations have to report an error to consider it a breakdown")
  public Integer getErrorTolerance() {
    return errorTolerance;
  }

  public void setErrorTolerance(Integer errorTolerance) {
    this.errorTolerance = errorTolerance;
  }

  public CreateUpdateHealthCheckPingCommand name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Health check name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Health check name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateUpdateHealthCheckPingCommand address(String address) {
    this.address = address;
    return this;
  }

   /**
   * URL or IP address of the monitored service
   * @return address
  **/
  @ApiModelProperty(required = true, value = "URL or IP address of the monitored service")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public CreateUpdateHealthCheckPingCommand interval(Integer interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Time interval between health checks, in seconds
   * @return interval
  **/
  @ApiModelProperty(required = true, value = "Time interval between health checks, in seconds")
  public Integer getInterval() {
    return interval;
  }

  public void setInterval(Integer interval) {
    this.interval = interval;
  }

  public CreateUpdateHealthCheckPingCommand paused(Boolean paused) {
    this.paused = paused;
    return this;
  }

   /**
   * Is paused
   * @return paused
  **/
  @ApiModelProperty(required = true, value = "Is paused")
  public Boolean isPaused() {
    return paused;
  }

  public void setPaused(Boolean paused) {
    this.paused = paused;
  }

  public CreateUpdateHealthCheckPingCommand locationsFailoverEnabled(Boolean locationsFailoverEnabled) {
    this.locationsFailoverEnabled = locationsFailoverEnabled;
    return this;
  }

   /**
   * Use random substitute locations in case of location breakdown
   * @return locationsFailoverEnabled
  **/
  @ApiModelProperty(required = true, value = "Use random substitute locations in case of location breakdown")
  public Boolean isLocationsFailoverEnabled() {
    return locationsFailoverEnabled;
  }

  public void setLocationsFailoverEnabled(Boolean locationsFailoverEnabled) {
    this.locationsFailoverEnabled = locationsFailoverEnabled;
  }

  public CreateUpdateHealthCheckPingCommand notificationTypeIds(List<Integer> notificationTypeIds) {
    this.notificationTypeIds = notificationTypeIds;
    return this;
  }

  public CreateUpdateHealthCheckPingCommand addNotificationTypeIdsItem(Integer notificationTypeIdsItem) {
    if (this.notificationTypeIds == null) {
      this.notificationTypeIds = new ArrayList<Integer>();
    }
    this.notificationTypeIds.add(notificationTypeIdsItem);
    return this;
  }

   /**
   * Notification types enabled for a health check
   * @return notificationTypeIds
  **/
  @ApiModelProperty(value = "Notification types enabled for a health check")
  public List<Integer> getNotificationTypeIds() {
    return notificationTypeIds;
  }

  public void setNotificationTypeIds(List<Integer> notificationTypeIds) {
    this.notificationTypeIds = notificationTypeIds;
  }

  public CreateUpdateHealthCheckPingCommand notificationEventTypeIds(List<Integer> notificationEventTypeIds) {
    this.notificationEventTypeIds = notificationEventTypeIds;
    return this;
  }

  public CreateUpdateHealthCheckPingCommand addNotificationEventTypeIdsItem(Integer notificationEventTypeIdsItem) {
    if (this.notificationEventTypeIds == null) {
      this.notificationEventTypeIds = new ArrayList<Integer>();
    }
    this.notificationEventTypeIds.add(notificationEventTypeIdsItem);
    return this;
  }

   /**
   * Event types with enabled notification
   * @return notificationEventTypeIds
  **/
  @ApiModelProperty(value = "Event types with enabled notification")
  public List<Integer> getNotificationEventTypeIds() {
    return notificationEventTypeIds;
  }

  public void setNotificationEventTypeIds(List<Integer> notificationEventTypeIds) {
    this.notificationEventTypeIds = notificationEventTypeIds;
  }

  public CreateUpdateHealthCheckPingCommand notificationTimeId(Integer notificationTimeId) {
    this.notificationTimeId = notificationTimeId;
    return this;
  }

   /**
   * Time when notification is sent
   * @return notificationTimeId
  **/
  @ApiModelProperty(required = true, value = "Time when notification is sent")
  public Integer getNotificationTimeId() {
    return notificationTimeId;
  }

  public void setNotificationTimeId(Integer notificationTimeId) {
    this.notificationTimeId = notificationTimeId;
  }

    public CreateUpdateHealthCheckPingCommand description(String description) {
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
    CreateUpdateHealthCheckPingCommand createUpdateHealthCheckPingCommand = (CreateUpdateHealthCheckPingCommand) o;
    return Objects.equals(this.packageSize, createUpdateHealthCheckPingCommand.packageSize) &&
        Objects.equals(this.replyTimeout, createUpdateHealthCheckPingCommand.replyTimeout) &&
        Objects.equals(this.errorTolerance, createUpdateHealthCheckPingCommand.errorTolerance) &&
        Objects.equals(this.name, createUpdateHealthCheckPingCommand.name) &&
        Objects.equals(this.address, createUpdateHealthCheckPingCommand.address) &&
        Objects.equals(this.interval, createUpdateHealthCheckPingCommand.interval) &&
        Objects.equals(this.paused, createUpdateHealthCheckPingCommand.paused) &&
        Objects.equals(this.locationsFailoverEnabled, createUpdateHealthCheckPingCommand.locationsFailoverEnabled) &&
        Objects.equals(this.notificationTypeIds, createUpdateHealthCheckPingCommand.notificationTypeIds) &&
        Objects.equals(this.notificationEventTypeIds, createUpdateHealthCheckPingCommand.notificationEventTypeIds) &&
            Objects.equals(this.notificationTimeId, createUpdateHealthCheckPingCommand.notificationTimeId) &&
            Objects.equals(this.description, createUpdateHealthCheckPingCommand.description);
  }

  @Override
  public int hashCode() {
      return Objects.hash(packageSize, replyTimeout, errorTolerance, name, address, interval, paused, locationsFailoverEnabled, notificationTypeIds, notificationEventTypeIds, notificationTimeId, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUpdateHealthCheckPingCommand {\n");

    sb.append("    packageSize: ").append(toIndentedString(packageSize)).append("\n");
    sb.append("    replyTimeout: ").append(toIndentedString(replyTimeout)).append("\n");
    sb.append("    errorTolerance: ").append(toIndentedString(errorTolerance)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    locationsFailoverEnabled: ").append(toIndentedString(locationsFailoverEnabled)).append("\n");
    sb.append("    notificationTypeIds: ").append(toIndentedString(notificationTypeIds)).append("\n");
    sb.append("    notificationEventTypeIds: ").append(toIndentedString(notificationEventTypeIds)).append("\n");
    sb.append("    notificationTimeId: ").append(toIndentedString(notificationTimeId)).append("\n");
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

