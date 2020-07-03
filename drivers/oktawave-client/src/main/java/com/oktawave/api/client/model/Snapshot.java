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
 * Snapshot
 */
@ApiModel(description = "Snapshot")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-03T15:23:33.358+01:00")
public class Snapshot {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Instance")
  private BaseResource instance = null;

  @SerializedName("CreationDate")
  private OffsetDateTime creationDate = null;

  @SerializedName("LastChangeDate")
  private OffsetDateTime lastChangeDate = null;

  @SerializedName("CreationUser")
  private UserResource creationUser = null;

  @SerializedName("IsSystem")
  private Boolean isSystem = null;

  @SerializedName("IsCurrent")
  private Boolean isCurrent = null;

  @SerializedName("SnapshotParent")
  private BaseResource snapshotParent = null;

  public Snapshot id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID
   * @return id
  **/
  @ApiModelProperty(value = "ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Snapshot name(String name) {
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

  public Snapshot description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @ApiModelProperty(value = "Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Snapshot instance(BaseResource instance) {
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

  public Snapshot creationDate(OffsetDateTime creationDate) {
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

  public Snapshot lastChangeDate(OffsetDateTime lastChangeDate) {
    this.lastChangeDate = lastChangeDate;
    return this;
  }

   /**
   * Last change date
   * @return lastChangeDate
  **/
  @ApiModelProperty(value = "Last change date")
  public OffsetDateTime getLastChangeDate() {
    return lastChangeDate;
  }

  public void setLastChangeDate(OffsetDateTime lastChangeDate) {
    this.lastChangeDate = lastChangeDate;
  }

  public Snapshot creationUser(UserResource creationUser) {
    this.creationUser = creationUser;
    return this;
  }

   /**
   * User who created the snapshot
   * @return creationUser
  **/
  @ApiModelProperty(value = "User who created the snapshot")
  public UserResource getCreationUser() {
    return creationUser;
  }

  public void setCreationUser(UserResource creationUser) {
    this.creationUser = creationUser;
  }

  public Snapshot isSystem(Boolean isSystem) {
    this.isSystem = isSystem;
    return this;
  }

   /**
   * Is system snapshot. Not created by the user.
   * @return isSystem
  **/
  @ApiModelProperty(value = "Is system snapshot. Not created by the user.")
  public Boolean isIsSystem() {
    return isSystem;
  }

  public void setIsSystem(Boolean isSystem) {
    this.isSystem = isSystem;
  }

  public Snapshot isCurrent(Boolean isCurrent) {
    this.isCurrent = isCurrent;
    return this;
  }

   /**
   * Is current
   * @return isCurrent
  **/
  @ApiModelProperty(value = "Is current")
  public Boolean isIsCurrent() {
    return isCurrent;
  }

  public void setIsCurrent(Boolean isCurrent) {
    this.isCurrent = isCurrent;
  }

  public Snapshot snapshotParent(BaseResource snapshotParent) {
    this.snapshotParent = snapshotParent;
    return this;
  }

   /**
   * Snapshot parent
   * @return snapshotParent
  **/
  @ApiModelProperty(value = "Snapshot parent")
  public BaseResource getSnapshotParent() {
    return snapshotParent;
  }

  public void setSnapshotParent(BaseResource snapshotParent) {
    this.snapshotParent = snapshotParent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Snapshot snapshot = (Snapshot) o;
    return Objects.equals(this.id, snapshot.id) &&
        Objects.equals(this.name, snapshot.name) &&
        Objects.equals(this.description, snapshot.description) &&
        Objects.equals(this.instance, snapshot.instance) &&
        Objects.equals(this.creationDate, snapshot.creationDate) &&
        Objects.equals(this.lastChangeDate, snapshot.lastChangeDate) &&
        Objects.equals(this.creationUser, snapshot.creationUser) &&
        Objects.equals(this.isSystem, snapshot.isSystem) &&
        Objects.equals(this.isCurrent, snapshot.isCurrent) &&
        Objects.equals(this.snapshotParent, snapshot.snapshotParent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, instance, creationDate, lastChangeDate, creationUser, isSystem, isCurrent, snapshotParent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Snapshot {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    lastChangeDate: ").append(toIndentedString(lastChangeDate)).append("\n");
    sb.append("    creationUser: ").append(toIndentedString(creationUser)).append("\n");
    sb.append("    isSystem: ").append(toIndentedString(isSystem)).append("\n");
    sb.append("    isCurrent: ").append(toIndentedString(isCurrent)).append("\n");
    sb.append("    snapshotParent: ").append(toIndentedString(snapshotParent)).append("\n");
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

