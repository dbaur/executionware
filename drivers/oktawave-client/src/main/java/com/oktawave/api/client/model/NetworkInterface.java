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
 * Network interface
 */
@ApiModel(description = "Network interface")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-03T15:23:33.358+01:00")
public class NetworkInterface {
  @SerializedName("InterfaceId")
  private Integer interfaceId = null;

  @SerializedName("MacAddress")
  private String macAddress = null;

  @SerializedName("Instance")
  private NamedResource instance = null;

  @SerializedName("Opn")
  private NamedResource opn = null;

  @SerializedName("Address")
  private String address = null;

  @SerializedName("AddressV6")
  private String addressV6 = null;

  @SerializedName("Ip")
  private BaseResource ip = null;

  @SerializedName("Comment")
  private String comment = null;

  @SerializedName("RevDns")
  private String revDns = null;

  @SerializedName("RevDnsV6")
  private String revDnsV6 = null;

  @SerializedName("Subregion")
  private BaseResource subregion = null;

  @SerializedName("CreationUser")
  private UserResource creationUser = null;

  public NetworkInterface interfaceId(Integer interfaceId) {
    this.interfaceId = interfaceId;
    return this;
  }

   /**
   * Interface id
   * @return interfaceId
  **/
  @ApiModelProperty(value = "Interface id")
  public Integer getInterfaceId() {
    return interfaceId;
  }

  public void setInterfaceId(Integer interfaceId) {
    this.interfaceId = interfaceId;
  }

  public NetworkInterface macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

   /**
   * The MAC address of the network card associated with that IP address
   * @return macAddress
  **/
  @ApiModelProperty(value = "The MAC address of the network card associated with that IP address")
  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  public NetworkInterface instance(NamedResource instance) {
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

  public NetworkInterface opn(NamedResource opn) {
    this.opn = opn;
    return this;
  }

   /**
   * OPN
   * @return opn
  **/
  @ApiModelProperty(value = "OPN")
  public NamedResource getOpn() {
    return opn;
  }

  public void setOpn(NamedResource opn) {
    this.opn = opn;
  }

  public NetworkInterface address(String address) {
    this.address = address;
    return this;
  }

   /**
   * IP address version 4
   * @return address
  **/
  @ApiModelProperty(value = "IP address version 4")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public NetworkInterface addressV6(String addressV6) {
    this.addressV6 = addressV6;
    return this;
  }

   /**
   * IP address version 6
   * @return addressV6
  **/
  @ApiModelProperty(value = "IP address version 6")
  public String getAddressV6() {
    return addressV6;
  }

  public void setAddressV6(String addressV6) {
    this.addressV6 = addressV6;
  }

  public NetworkInterface ip(BaseResource ip) {
    this.ip = ip;
    return this;
  }

   /**
   * IP address
   * @return ip
  **/
  @ApiModelProperty(value = "IP address")
  public BaseResource getIp() {
    return ip;
  }

  public void setIp(BaseResource ip) {
    this.ip = ip;
  }

  public NetworkInterface comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Comment
   * @return comment
  **/
  @ApiModelProperty(value = "Comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public NetworkInterface revDns(String revDns) {
    this.revDns = revDns;
    return this;
  }

   /**
   * RevDNS
   * @return revDns
  **/
  @ApiModelProperty(value = "RevDNS")
  public String getRevDns() {
    return revDns;
  }

  public void setRevDns(String revDns) {
    this.revDns = revDns;
  }

  public NetworkInterface revDnsV6(String revDnsV6) {
    this.revDnsV6 = revDnsV6;
    return this;
  }

   /**
   * RevDNS v6
   * @return revDnsV6
  **/
  @ApiModelProperty(value = "RevDNS v6")
  public String getRevDnsV6() {
    return revDnsV6;
  }

  public void setRevDnsV6(String revDnsV6) {
    this.revDnsV6 = revDnsV6;
  }

  public NetworkInterface subregion(BaseResource subregion) {
    this.subregion = subregion;
    return this;
  }

   /**
   * Subregion
   * @return subregion
  **/
  @ApiModelProperty(value = "Subregion")
  public BaseResource getSubregion() {
    return subregion;
  }

  public void setSubregion(BaseResource subregion) {
    this.subregion = subregion;
  }

  public NetworkInterface creationUser(UserResource creationUser) {
    this.creationUser = creationUser;
    return this;
  }

   /**
   * User who created the network interface
   * @return creationUser
  **/
  @ApiModelProperty(value = "User who created the network interface")
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
    NetworkInterface networkInterface = (NetworkInterface) o;
    return Objects.equals(this.interfaceId, networkInterface.interfaceId) &&
        Objects.equals(this.macAddress, networkInterface.macAddress) &&
        Objects.equals(this.instance, networkInterface.instance) &&
        Objects.equals(this.opn, networkInterface.opn) &&
        Objects.equals(this.address, networkInterface.address) &&
        Objects.equals(this.addressV6, networkInterface.addressV6) &&
        Objects.equals(this.ip, networkInterface.ip) &&
        Objects.equals(this.comment, networkInterface.comment) &&
        Objects.equals(this.revDns, networkInterface.revDns) &&
        Objects.equals(this.revDnsV6, networkInterface.revDnsV6) &&
        Objects.equals(this.subregion, networkInterface.subregion) &&
        Objects.equals(this.creationUser, networkInterface.creationUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interfaceId, macAddress, instance, opn, address, addressV6, ip, comment, revDns, revDnsV6, subregion, creationUser);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkInterface {\n");

      sb.append("    interfaceId: ").append(toIndentedString(interfaceId)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    opn: ").append(toIndentedString(opn)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressV6: ").append(toIndentedString(addressV6)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    revDns: ").append(toIndentedString(revDns)).append("\n");
    sb.append("    revDnsV6: ").append(toIndentedString(revDnsV6)).append("\n");
    sb.append("    subregion: ").append(toIndentedString(subregion)).append("\n");
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

