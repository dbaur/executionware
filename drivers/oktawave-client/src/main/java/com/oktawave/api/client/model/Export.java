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
 * Instance export task
 */
@ApiModel(description = "Instance export task")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-03T15:23:33.358+01:00")
public class Export {
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

  @SerializedName("Status")
  private DictionaryItem status = null;

  @SerializedName("OcsLocation")
  private String ocsLocation = null;

  @SerializedName("OcsProjectId")
  private String ocsProjectId = null;

  @SerializedName("TotalSpaceCapacity")
  private Integer totalSpaceCapacity = null;

  @SerializedName("Instance")
  private NamedResource instance = null;

  @SerializedName("CreationUser")
  private UserResource creationUser = null;

  @SerializedName("Origin")
  private DictionaryItem origin = null;

  @SerializedName("Scheduler")
  private BaseResource scheduler = null;

  public Export id(Integer id) {
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

  public Export name(String name) {
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

  public Export creationDate(OffsetDateTime creationDate) {
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

  public Export startDate(OffsetDateTime startDate) {
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

  public Export endDate(OffsetDateTime endDate) {
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

  public Export status(DictionaryItem status) {
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

  public Export ocsLocation(String ocsLocation) {
    this.ocsLocation = ocsLocation;
    return this;
  }

   /**
   * Location in OCS
   * @return ocsLocation
  **/
  @ApiModelProperty(value = "Location in OCS")
  public String getOcsLocation() {
    return ocsLocation;
  }

  public void setOcsLocation(String ocsLocation) {
    this.ocsLocation = ocsLocation;
  }

  public Export ocsProjectId(String ocsProjectId) {
    this.ocsProjectId = ocsProjectId;
    return this;
  }

   /**
   * OCS Project Id
   * @return ocsProjectId
  **/
  @ApiModelProperty(value = "OCS Project Id")
  public String getOcsProjectId() {
    return ocsProjectId;
  }

  public void setOcsProjectId(String ocsProjectId) {
    this.ocsProjectId = ocsProjectId;
  }

  public Export totalSpaceCapacity(Integer totalSpaceCapacity) {
    this.totalSpaceCapacity = totalSpaceCapacity;
    return this;
  }

   /**
   * Total space capacity in GB
   * @return totalSpaceCapacity
  **/
  @ApiModelProperty(value = "Total space capacity in GB")
  public Integer getTotalSpaceCapacity() {
    return totalSpaceCapacity;
  }

  public void setTotalSpaceCapacity(Integer totalSpaceCapacity) {
    this.totalSpaceCapacity = totalSpaceCapacity;
  }

  public Export instance(NamedResource instance) {
    this.instance = instance;
    return this;
  }

   /**
   * Instance
   * @return instance
  **/
  @ApiModelProperty(value = "Instance")
  public NamedResource getInstance() {
    return instance;
  }

  public void setInstance(NamedResource instance) {
    this.instance = instance;
  }

  public Export creationUser(UserResource creationUser) {
    this.creationUser = creationUser;
    return this;
  }

   /**
   * Creation user
   * @return creationUser
  **/
  @ApiModelProperty(value = "Creation user")
  public UserResource getCreationUser() {
    return creationUser;
  }

  public void setCreationUser(UserResource creationUser) {
    this.creationUser = creationUser;
  }

  public Export origin(DictionaryItem origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Origin
   * @return origin
  **/
  @ApiModelProperty(value = "Origin")
  public DictionaryItem getOrigin() {
    return origin;
  }

  public void setOrigin(DictionaryItem origin) {
    this.origin = origin;
  }

  public Export scheduler(BaseResource scheduler) {
    this.scheduler = scheduler;
    return this;
  }

   /**
   * Scheduler that launches export
   * @return scheduler
  **/
  @ApiModelProperty(value = "Scheduler that launches export")
  public BaseResource getScheduler() {
    return scheduler;
  }

  public void setScheduler(BaseResource scheduler) {
    this.scheduler = scheduler;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Export export = (Export) o;
    return Objects.equals(this.id, export.id) &&
        Objects.equals(this.name, export.name) &&
        Objects.equals(this.creationDate, export.creationDate) &&
        Objects.equals(this.startDate, export.startDate) &&
        Objects.equals(this.endDate, export.endDate) &&
        Objects.equals(this.status, export.status) &&
        Objects.equals(this.ocsLocation, export.ocsLocation) &&
        Objects.equals(this.ocsProjectId, export.ocsProjectId) &&
        Objects.equals(this.totalSpaceCapacity, export.totalSpaceCapacity) &&
        Objects.equals(this.instance, export.instance) &&
        Objects.equals(this.creationUser, export.creationUser) &&
        Objects.equals(this.origin, export.origin) &&
        Objects.equals(this.scheduler, export.scheduler);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, creationDate, startDate, endDate, status, ocsLocation, ocsProjectId, totalSpaceCapacity, instance, creationUser, origin, scheduler);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Export {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    ocsLocation: ").append(toIndentedString(ocsLocation)).append("\n");
    sb.append("    ocsProjectId: ").append(toIndentedString(ocsProjectId)).append("\n");
    sb.append("    totalSpaceCapacity: ").append(toIndentedString(totalSpaceCapacity)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    creationUser: ").append(toIndentedString(creationUser)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    scheduler: ").append(toIndentedString(scheduler)).append("\n");
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

