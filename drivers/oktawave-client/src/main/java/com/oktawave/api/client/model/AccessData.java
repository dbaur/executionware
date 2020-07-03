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
 * Instance access data
 */
@ApiModel(description = "Instance access data")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-03T15:23:33.358+01:00")
public class AccessData {
  @SerializedName("Password")
  private String password = null;

  @SerializedName("SshKeys")
  private List<InstanceSshKey> sshKeys = null;

  public AccessData password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Administrator password
   * @return password
  **/
  @ApiModelProperty(value = "Administrator password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public AccessData sshKeys(List<InstanceSshKey> sshKeys) {
    this.sshKeys = sshKeys;
    return this;
  }

  public AccessData addSshKeysItem(InstanceSshKey sshKeysItem) {
    if (this.sshKeys == null) {
      this.sshKeys = new ArrayList<InstanceSshKey>();
    }
    this.sshKeys.add(sshKeysItem);
    return this;
  }

   /**
   * SSH keys uploaded to instances
   * @return sshKeys
  **/
  @ApiModelProperty(value = "SSH keys uploaded to instances")
  public List<InstanceSshKey> getSshKeys() {
    return sshKeys;
  }

  public void setSshKeys(List<InstanceSshKey> sshKeys) {
    this.sshKeys = sshKeys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessData accessData = (AccessData) o;
    return Objects.equals(this.password, accessData.password) &&
        Objects.equals(this.sshKeys, accessData.sshKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, sshKeys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessData {\n");

      sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    sshKeys: ").append(toIndentedString(sshKeys)).append("\n");
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

