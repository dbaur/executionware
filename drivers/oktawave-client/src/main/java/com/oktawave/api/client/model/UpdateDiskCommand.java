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
 * Update disk command
 */
@ApiModel(description = "Update disk command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-03T15:23:33.358+01:00")
public class UpdateDiskCommand {
  @SerializedName("DiskName")
  private String diskName = "Disk name";

  @SerializedName("SpaceCapacity")
  private Integer spaceCapacity = 5;

  @SerializedName("TierId")
  private Integer tierId = 48;

  @SerializedName("SubregionId")
  private Integer subregionId = null;

  @SerializedName("InstanceIdsList")
  private List<Integer> instanceIdsList = null;

  public UpdateDiskCommand diskName(String diskName) {
    this.diskName = diskName;
    return this;
  }

   /**
   * Name of disk
   * @return diskName
  **/
  @ApiModelProperty(required = true, value = "Name of disk")
  public String getDiskName() {
    return diskName;
  }

  public void setDiskName(String diskName) {
    this.diskName = diskName;
  }

  public UpdateDiskCommand spaceCapacity(Integer spaceCapacity) {
    this.spaceCapacity = spaceCapacity;
    return this;
  }

   /**
   * Space capacity in GB
   * @return spaceCapacity
  **/
  @ApiModelProperty(required = true, value = "Space capacity in GB")
  public Integer getSpaceCapacity() {
    return spaceCapacity;
  }

  public void setSpaceCapacity(Integer spaceCapacity) {
    this.spaceCapacity = spaceCapacity;
  }

  public UpdateDiskCommand tierId(Integer tierId) {
    this.tierId = tierId;
    return this;
  }

   /**
   * Tier id
   * @return tierId
  **/
  @ApiModelProperty(required = true, value = "Tier id")
  public Integer getTierId() {
    return tierId;
  }

  public void setTierId(Integer tierId) {
    this.tierId = tierId;
  }

  public UpdateDiskCommand subregionId(Integer subregionId) {
    this.subregionId = subregionId;
    return this;
  }

   /**
   * Subregion identifier
   * @return subregionId
  **/
  @ApiModelProperty(required = true, value = "Subregion identifier")
  public Integer getSubregionId() {
    return subregionId;
  }

  public void setSubregionId(Integer subregionId) {
    this.subregionId = subregionId;
  }

  public UpdateDiskCommand instanceIdsList(List<Integer> instanceIdsList) {
    this.instanceIdsList = instanceIdsList;
    return this;
  }

  public UpdateDiskCommand addInstanceIdsListItem(Integer instanceIdsListItem) {
    if (this.instanceIdsList == null) {
      this.instanceIdsList = new ArrayList<Integer>();
    }
    this.instanceIdsList.add(instanceIdsListItem);
    return this;
  }

   /**
   * Instance ids list
   * @return instanceIdsList
  **/
  @ApiModelProperty(value = "Instance ids list")
  public List<Integer> getInstanceIdsList() {
    return instanceIdsList;
  }

  public void setInstanceIdsList(List<Integer> instanceIdsList) {
    this.instanceIdsList = instanceIdsList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDiskCommand updateDiskCommand = (UpdateDiskCommand) o;
    return Objects.equals(this.diskName, updateDiskCommand.diskName) &&
        Objects.equals(this.spaceCapacity, updateDiskCommand.spaceCapacity) &&
        Objects.equals(this.tierId, updateDiskCommand.tierId) &&
        Objects.equals(this.subregionId, updateDiskCommand.subregionId) &&
        Objects.equals(this.instanceIdsList, updateDiskCommand.instanceIdsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diskName, spaceCapacity, tierId, subregionId, instanceIdsList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDiskCommand {\n");
    
    sb.append("    diskName: ").append(toIndentedString(diskName)).append("\n");
    sb.append("    spaceCapacity: ").append(toIndentedString(spaceCapacity)).append("\n");
    sb.append("    tierId: ").append(toIndentedString(tierId)).append("\n");
    sb.append("    subregionId: ").append(toIndentedString(subregionId)).append("\n");
    sb.append("    instanceIdsList: ").append(toIndentedString(instanceIdsList)).append("\n");
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

