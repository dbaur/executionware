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
 * Represents disk connection to instance
 */
@ApiModel(description = "Represents disk connection to instance")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-25T12:05:03.973+02:00")
public class DiskConnection {
  @SerializedName("Instance")
  private BaseResource instance = null;

  @SerializedName("Controller")
  private Integer controller = null;

  @SerializedName("Slot")
  private Integer slot = null;

  @SerializedName("IsSystemDisk")
  private Boolean isSystemDisk = null;

  public DiskConnection instance(BaseResource instance) {
    this.instance = instance;
    return this;
  }

   /**
   * Instance
   * @return instance
  **/
  @ApiModelProperty(value = "Instance")
  public BaseResource getInstance() {
    return instance;
  }

  public void setInstance(BaseResource instance) {
    this.instance = instance;
  }

  public DiskConnection controller(Integer controller) {
    this.controller = controller;
    return this;
  }

   /**
   * Controller
   * @return controller
  **/
  @ApiModelProperty(value = "Controller")
  public Integer getController() {
    return controller;
  }

  public void setController(Integer controller) {
    this.controller = controller;
  }

  public DiskConnection slot(Integer slot) {
    this.slot = slot;
    return this;
  }

   /**
   * Slot
   * @return slot
  **/
  @ApiModelProperty(value = "Slot")
  public Integer getSlot() {
    return slot;
  }

  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  public DiskConnection isSystemDisk(Boolean isSystemDisk) {
    this.isSystemDisk = isSystemDisk;
    return this;
  }

   /**
   * If is system disk
   * @return isSystemDisk
  **/
  @ApiModelProperty(value = "If is system disk")
  public Boolean isIsSystemDisk() {
    return isSystemDisk;
  }

  public void setIsSystemDisk(Boolean isSystemDisk) {
    this.isSystemDisk = isSystemDisk;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiskConnection diskConnection = (DiskConnection) o;
    return Objects.equals(this.instance, diskConnection.instance) &&
        Objects.equals(this.controller, diskConnection.controller) &&
        Objects.equals(this.slot, diskConnection.slot) &&
        Objects.equals(this.isSystemDisk, diskConnection.isSystemDisk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instance, controller, slot, isSystemDisk);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiskConnection {\n");
    
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
    sb.append("    isSystemDisk: ").append(toIndentedString(isSystemDisk)).append("\n");
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

