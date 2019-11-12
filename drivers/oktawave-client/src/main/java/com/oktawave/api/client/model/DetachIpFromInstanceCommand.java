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
 * Detach IP from instance command
 */
@ApiModel(description = "Detach IP from instance command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-25T12:05:03.973+02:00")
public class DetachIpFromInstanceCommand {
  @SerializedName("IpId")
  private Integer ipId = null;

  public DetachIpFromInstanceCommand ipId(Integer ipId) {
    this.ipId = ipId;
    return this;
  }

   /**
   * IP address identifier
   * @return ipId
  **/
  @ApiModelProperty(required = true, value = "IP address identifier")
  public Integer getIpId() {
    return ipId;
  }

  public void setIpId(Integer ipId) {
    this.ipId = ipId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetachIpFromInstanceCommand detachIpFromInstanceCommand = (DetachIpFromInstanceCommand) o;
    return Objects.equals(this.ipId, detachIpFromInstanceCommand.ipId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetachIpFromInstanceCommand {\n");
    
    sb.append("    ipId: ").append(toIndentedString(ipId)).append("\n");
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

