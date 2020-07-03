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
 * Heatlth check notification
 */
@ApiModel(description = "Heatlth check notification")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-03T15:23:33.358+01:00")
public class HealthCheckNotification {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("Address")
  private String address = null;

  @SerializedName("NotificationType")
  private DictionaryItem notificationType = null;

  public HealthCheckNotification id(Integer id) {
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

  public HealthCheckNotification address(String address) {
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

  public HealthCheckNotification notificationType(DictionaryItem notificationType) {
    this.notificationType = notificationType;
    return this;
  }

   /**
   * Notification type
   * @return notificationType
  **/
  @ApiModelProperty(value = "Notification type")
  public DictionaryItem getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(DictionaryItem notificationType) {
    this.notificationType = notificationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckNotification healthCheckNotification = (HealthCheckNotification) o;
    return Objects.equals(this.id, healthCheckNotification.id) &&
        Objects.equals(this.address, healthCheckNotification.address) &&
        Objects.equals(this.notificationType, healthCheckNotification.notificationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, address, notificationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
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

