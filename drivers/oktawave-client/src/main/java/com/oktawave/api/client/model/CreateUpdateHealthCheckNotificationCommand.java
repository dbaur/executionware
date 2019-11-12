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

import java.util.Objects;

/**
 * Create/update health check notification command
 */
@ApiModel(description = "Create/update health check notification command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-25T12:05:03.973+02:00")
public class CreateUpdateHealthCheckNotificationCommand {
  @SerializedName("Address")
  private String address = null;

  @SerializedName("NotificationTypeId")
  private Integer notificationTypeId = 1539;

  public CreateUpdateHealthCheckNotificationCommand address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Address
   * @return address
  **/
  @ApiModelProperty(required = true, value = "Address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public CreateUpdateHealthCheckNotificationCommand notificationTypeId(Integer notificationTypeId) {
    this.notificationTypeId = notificationTypeId;
    return this;
  }

   /**
   * Health check notification type (Dictionary 178)
   * @return notificationTypeId
  **/
  @ApiModelProperty(required = true, value = "Health check notification type (Dictionary 178)")
  public Integer getNotificationTypeId() {
    return notificationTypeId;
  }

  public void setNotificationTypeId(Integer notificationTypeId) {
    this.notificationTypeId = notificationTypeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUpdateHealthCheckNotificationCommand createUpdateHealthCheckNotificationCommand = (CreateUpdateHealthCheckNotificationCommand) o;
    return Objects.equals(this.address, createUpdateHealthCheckNotificationCommand.address) &&
        Objects.equals(this.notificationTypeId, createUpdateHealthCheckNotificationCommand.notificationTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, notificationTypeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUpdateHealthCheckNotificationCommand {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    notificationTypeId: ").append(toIndentedString(notificationTypeId)).append("\n");
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

