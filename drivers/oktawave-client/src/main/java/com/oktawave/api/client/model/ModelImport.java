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

import java.util.Objects;

/**
 * Import
 */
@ApiModel(description = "Import")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-03T15:23:33.358+01:00")
public class ModelImport {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("CreationDate")
  private OffsetDateTime creationDate = null;

  @SerializedName("StartDate")
  private OffsetDateTime startDate = null;

  @SerializedName("EndDate")
  private OffsetDateTime endDate = null;

  @SerializedName("Size")
  private Integer size = null;

  @SerializedName("NetworkInterfacesCount")
  private Integer networkInterfacesCount = null;

  @SerializedName("DisksCount")
  private Integer disksCount = null;

  @SerializedName("Status")
  private DictionaryItem status = null;

  @SerializedName("CreationUser")
  private UserResource creationUser = null;

  public ModelImport id(Integer id) {
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

  public ModelImport name(String name) {
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

  public ModelImport creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Creation date
   * @return creationDate
  **/
  @ApiModelProperty(value = "Creation date")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public ModelImport startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Start date
   * @return startDate
  **/
  @ApiModelProperty(value = "Start date")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public ModelImport endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * End date
   * @return endDate
  **/
  @ApiModelProperty(value = "End date")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public ModelImport size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Total size in GB
   * @return size
  **/
  @ApiModelProperty(value = "Total size in GB")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public ModelImport networkInterfacesCount(Integer networkInterfacesCount) {
    this.networkInterfacesCount = networkInterfacesCount;
    return this;
  }

   /**
   * Network interfaces count
   * @return networkInterfacesCount
  **/
  @ApiModelProperty(value = "Network interfaces count")
  public Integer getNetworkInterfacesCount() {
    return networkInterfacesCount;
  }

  public void setNetworkInterfacesCount(Integer networkInterfacesCount) {
    this.networkInterfacesCount = networkInterfacesCount;
  }

  public ModelImport disksCount(Integer disksCount) {
    this.disksCount = disksCount;
    return this;
  }

   /**
   * Disks count
   * @return disksCount
  **/
  @ApiModelProperty(value = "Disks count")
  public Integer getDisksCount() {
    return disksCount;
  }

  public void setDisksCount(Integer disksCount) {
    this.disksCount = disksCount;
  }

  public ModelImport status(DictionaryItem status) {
    this.status = status;
    return this;
  }

   /**
   * Status
   * @return status
  **/
  @ApiModelProperty(value = "Status")
  public DictionaryItem getStatus() {
    return status;
  }

  public void setStatus(DictionaryItem status) {
    this.status = status;
  }

  public ModelImport creationUser(UserResource creationUser) {
    this.creationUser = creationUser;
    return this;
  }

   /**
   * User who created the import
   * @return creationUser
  **/
  @ApiModelProperty(value = "User who created the import")
  public UserResource getCreationUser() {
    return creationUser;
  }

  public void setCreationUser(UserResource creationUser) {
    this.creationUser = creationUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelImport _import = (ModelImport) o;
    return Objects.equals(this.id, _import.id) &&
        Objects.equals(this.name, _import.name) &&
        Objects.equals(this.creationDate, _import.creationDate) &&
        Objects.equals(this.startDate, _import.startDate) &&
        Objects.equals(this.endDate, _import.endDate) &&
        Objects.equals(this.size, _import.size) &&
        Objects.equals(this.networkInterfacesCount, _import.networkInterfacesCount) &&
        Objects.equals(this.disksCount, _import.disksCount) &&
        Objects.equals(this.status, _import.status) &&
        Objects.equals(this.creationUser, _import.creationUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, creationDate, startDate, endDate, size, networkInterfacesCount, disksCount, status, creationUser);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelImport {\n");

      sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    networkInterfacesCount: ").append(toIndentedString(networkInterfacesCount)).append("\n");
    sb.append("    disksCount: ").append(toIndentedString(disksCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creationUser: ").append(toIndentedString(creationUser)).append("\n");
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

