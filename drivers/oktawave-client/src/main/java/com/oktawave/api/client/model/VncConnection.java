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
 * VNC connection properties
 */
@ApiModel(description = "VNC connection properties")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-25T12:05:03.973+02:00")
public class VncConnection {
  @SerializedName("Instance")
  private BaseResource instance = null;

  @SerializedName("SourceIp")
  private String sourceIp = null;

  @SerializedName("Address")
  private String address = null;

  @SerializedName("Port")
  private Integer port = null;

  @SerializedName("Password")
  private String password = null;

  @SerializedName("OpenUntil")
  private OffsetDateTime openUntil = null;

  public VncConnection instance(BaseResource instance) {
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

  public VncConnection sourceIp(String sourceIp) {
    this.sourceIp = sourceIp;
    return this;
  }

   /**
   * Source ip
   * @return sourceIp
  **/
  @ApiModelProperty(value = "Source ip")
  public String getSourceIp() {
    return sourceIp;
  }

  public void setSourceIp(String sourceIp) {
    this.sourceIp = sourceIp;
  }

  public VncConnection address(String address) {
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

  public VncConnection port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Port
   * @return port
  **/
  @ApiModelProperty(value = "Port")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public VncConnection password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password
   * @return password
  **/
  @ApiModelProperty(value = "Password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public VncConnection openUntil(OffsetDateTime openUntil) {
    this.openUntil = openUntil;
    return this;
  }

   /**
   * Open until
   * @return openUntil
  **/
  @ApiModelProperty(value = "Open until")
  public OffsetDateTime getOpenUntil() {
    return openUntil;
  }

  public void setOpenUntil(OffsetDateTime openUntil) {
    this.openUntil = openUntil;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VncConnection vncConnection = (VncConnection) o;
    return Objects.equals(this.instance, vncConnection.instance) &&
        Objects.equals(this.sourceIp, vncConnection.sourceIp) &&
        Objects.equals(this.address, vncConnection.address) &&
        Objects.equals(this.port, vncConnection.port) &&
        Objects.equals(this.password, vncConnection.password) &&
        Objects.equals(this.openUntil, vncConnection.openUntil);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instance, sourceIp, address, port, password, openUntil);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VncConnection {\n");
    
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    openUntil: ").append(toIndentedString(openUntil)).append("\n");
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

