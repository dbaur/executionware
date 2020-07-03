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
 * Create instance command
 */
@ApiModel(description = "Create instance command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-03T15:23:33.358+01:00")
public class CreateInstanceCommand {
  @SerializedName("AuthorizationMethodId")
  private Integer authorizationMethodId = null;

  @SerializedName("DiskClass")
  private Integer diskClass = null;

  @SerializedName("DiskSize")
  private Integer diskSize = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("InstancesCount")
  private Integer instancesCount = null;

  @SerializedName("IPAddressId")
  private Integer ipAddressId = null;

  @SerializedName("SshKeysIds")
  private List<Integer> sshKeysIds = null;

  @SerializedName("SubregionId")
  private Integer subregionId = null;

  @SerializedName("TemplateId")
  private Integer templateId = null;

  @SerializedName("TypeId")
  private Integer typeId = null;

  @SerializedName("Freemium")
  private Boolean freemium = false;

  public CreateInstanceCommand authorizationMethodId(Integer authorizationMethodId) {
    this.authorizationMethodId = authorizationMethodId;
    return this;
  }

   /**
   * Authorization method (Password)
   * @return authorizationMethodId
  **/
  @ApiModelProperty(value = "Authorization method (Password)")
  public Integer getAuthorizationMethodId() {
    return authorizationMethodId;
  }

  public void setAuthorizationMethodId(Integer authorizationMethodId) {
    this.authorizationMethodId = authorizationMethodId;
  }

  public CreateInstanceCommand diskClass(Integer diskClass) {
    this.diskClass = diskClass;
    return this;
  }

   /**
   * Class of disk
   * @return diskClass
  **/
  @ApiModelProperty(value = "Class of disk")
  public Integer getDiskClass() {
    return diskClass;
  }

  public void setDiskClass(Integer diskClass) {
    this.diskClass = diskClass;
  }

  public CreateInstanceCommand diskSize(Integer diskSize) {
    this.diskSize = diskSize;
    return this;
  }

   /**
   * Size of disk in gigabytes
   * minimum: 5
   * maximum: 300
   * @return diskSize
  **/
  @ApiModelProperty(value = "Size of disk in gigabytes")
  public Integer getDiskSize() {
    return diskSize;
  }

  public void setDiskSize(Integer diskSize) {
    this.diskSize = diskSize;
  }

  public CreateInstanceCommand instanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

   /**
   * Name of an instance
   * @return instanceName
  **/
  @ApiModelProperty(required = true, value = "Name of an instance")
  public String getInstanceName() {
    return instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }

  public CreateInstanceCommand instancesCount(Integer instancesCount) {
    this.instancesCount = instancesCount;
    return this;
  }

   /**
   * Count of instances
   * minimum: 1
   * maximum: 5
   * @return instancesCount
  **/
  @ApiModelProperty(value = "Count of instances")
  public Integer getInstancesCount() {
    return instancesCount;
  }

  public void setInstancesCount(Integer instancesCount) {
    this.instancesCount = instancesCount;
  }

  public CreateInstanceCommand ipAddressId(Integer ipAddressId) {
    this.ipAddressId = ipAddressId;
    return this;
  }

   /**
   * Id of ip address
   * @return ipAddressId
  **/
  @ApiModelProperty(value = "Id of ip address")
  public Integer getIpAddressId() {
    return ipAddressId;
  }

  public void setIpAddressId(Integer ipAddressId) {
    this.ipAddressId = ipAddressId;
  }

  public CreateInstanceCommand sshKeysIds(List<Integer> sshKeysIds) {
    this.sshKeysIds = sshKeysIds;
    return this;
  }

  public CreateInstanceCommand addSshKeysIdsItem(Integer sshKeysIdsItem) {
    if (this.sshKeysIds == null) {
      this.sshKeysIds = new ArrayList<Integer>();
    }
    this.sshKeysIds.add(sshKeysIdsItem);
    return this;
  }

   /**
   * Id of ssh keys to be attached to the instance
   * @return sshKeysIds
  **/
  @ApiModelProperty(value = "Id of ssh keys to be attached to the instance")
  public List<Integer> getSshKeysIds() {
    return sshKeysIds;
  }

  public void setSshKeysIds(List<Integer> sshKeysIds) {
    this.sshKeysIds = sshKeysIds;
  }

  public CreateInstanceCommand subregionId(Integer subregionId) {
    this.subregionId = subregionId;
    return this;
  }

   /**
   * Id of target subregion
   * @return subregionId
  **/
  @ApiModelProperty(value = "Id of target subregion")
  public Integer getSubregionId() {
    return subregionId;
  }

  public void setSubregionId(Integer subregionId) {
    this.subregionId = subregionId;
  }

  public CreateInstanceCommand templateId(Integer templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Template id
   * @return templateId
  **/
  @ApiModelProperty(required = true, value = "Template id")
  public Integer getTemplateId() {
    return templateId;
  }

  public void setTemplateId(Integer templateId) {
    this.templateId = templateId;
  }

  public CreateInstanceCommand typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * Type of an instance
   * @return typeId
  **/
  @ApiModelProperty(value = "Type of an instance")
  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }

  public CreateInstanceCommand freemium(Boolean freemium) {
    this.freemium = freemium;
    return this;
  }

   /**
   * Freemium
   * @return freemium
  **/
  @ApiModelProperty(value = "Freemium")
  public Boolean isFreemium() {
    return freemium;
  }

  public void setFreemium(Boolean freemium) {
    this.freemium = freemium;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInstanceCommand createInstanceCommand = (CreateInstanceCommand) o;
    return Objects.equals(this.authorizationMethodId, createInstanceCommand.authorizationMethodId) &&
        Objects.equals(this.diskClass, createInstanceCommand.diskClass) &&
        Objects.equals(this.diskSize, createInstanceCommand.diskSize) &&
        Objects.equals(this.instanceName, createInstanceCommand.instanceName) &&
        Objects.equals(this.instancesCount, createInstanceCommand.instancesCount) &&
        Objects.equals(this.ipAddressId, createInstanceCommand.ipAddressId) &&
        Objects.equals(this.sshKeysIds, createInstanceCommand.sshKeysIds) &&
        Objects.equals(this.subregionId, createInstanceCommand.subregionId) &&
        Objects.equals(this.templateId, createInstanceCommand.templateId) &&
        Objects.equals(this.typeId, createInstanceCommand.typeId) &&
        Objects.equals(this.freemium, createInstanceCommand.freemium);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationMethodId, diskClass, diskSize, instanceName, instancesCount, ipAddressId, sshKeysIds, subregionId, templateId, typeId, freemium);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInstanceCommand {\n");

      sb.append("    authorizationMethodId: ").append(toIndentedString(authorizationMethodId)).append("\n");
    sb.append("    diskClass: ").append(toIndentedString(diskClass)).append("\n");
    sb.append("    diskSize: ").append(toIndentedString(diskSize)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instancesCount: ").append(toIndentedString(instancesCount)).append("\n");
    sb.append("    ipAddressId: ").append(toIndentedString(ipAddressId)).append("\n");
    sb.append("    sshKeysIds: ").append(toIndentedString(sshKeysIds)).append("\n");
    sb.append("    subregionId: ").append(toIndentedString(subregionId)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    freemium: ").append(toIndentedString(freemium)).append("\n");
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

