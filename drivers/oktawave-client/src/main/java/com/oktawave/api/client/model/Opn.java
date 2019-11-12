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
 * Virtual private network
 */
@ApiModel(description = "Virtual private network")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-25T12:05:03.973+02:00")
public class Opn {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("CreationDate")
  private OffsetDateTime creationDate = null;

  @SerializedName("LastChangeDate")
  private OffsetDateTime lastChangeDate = null;

  @SerializedName("CreationUser")
  private UserResource creationUser = null;

  @SerializedName("PrivateIps")
  private List<PrivateIp> privateIps = null;

  public Opn id(Integer id) {
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

  public Opn name(String name) {
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

  public Opn creationDate(OffsetDateTime creationDate) {
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

  public Opn lastChangeDate(OffsetDateTime lastChangeDate) {
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

  public Opn creationUser(UserResource creationUser) {
    this.creationUser = creationUser;
    return this;
  }

   /**
   * User who created the opn
   * @return creationUser
  **/
  @ApiModelProperty(value = "User who created the opn")
  public UserResource getCreationUser() {
    return creationUser;
  }

  public void setCreationUser(UserResource creationUser) {
    this.creationUser = creationUser;
  }

  public Opn privateIps(List<PrivateIp> privateIps) {
    this.privateIps = privateIps;
    return this;
  }

  public Opn addPrivateIpsItem(PrivateIp privateIpsItem) {
    if (this.privateIps == null) {
      this.privateIps = new ArrayList<PrivateIp>();
    }
    this.privateIps.add(privateIpsItem);
    return this;
  }

   /**
   * Private IPs
   * @return privateIps
  **/
  @ApiModelProperty(value = "Private IPs")
  public List<PrivateIp> getPrivateIps() {
    return privateIps;
  }

  public void setPrivateIps(List<PrivateIp> privateIps) {
    this.privateIps = privateIps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Opn opn = (Opn) o;
    return Objects.equals(this.id, opn.id) &&
        Objects.equals(this.name, opn.name) &&
        Objects.equals(this.creationDate, opn.creationDate) &&
        Objects.equals(this.lastChangeDate, opn.lastChangeDate) &&
        Objects.equals(this.creationUser, opn.creationUser) &&
        Objects.equals(this.privateIps, opn.privateIps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, creationDate, lastChangeDate, creationUser, privateIps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Opn {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    lastChangeDate: ").append(toIndentedString(lastChangeDate)).append("\n");
    sb.append("    creationUser: ").append(toIndentedString(creationUser)).append("\n");
    sb.append("    privateIps: ").append(toIndentedString(privateIps)).append("\n");
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

