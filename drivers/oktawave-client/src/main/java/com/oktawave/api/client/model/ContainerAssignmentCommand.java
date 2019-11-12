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
 * Container assignment
 */
@ApiModel(description = "Container assignment")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-25T12:05:03.973+02:00")
public class ContainerAssignmentCommand {
  @SerializedName("InstanceId")
  private Integer instanceId = null;

  @SerializedName("IpId")
  private Integer ipId = null;

  public ContainerAssignmentCommand instanceId(Integer instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Id of an instance
   * @return instanceId
  **/
  @ApiModelProperty(required = true, value = "Id of an instance")
  public Integer getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(Integer instanceId) {
    this.instanceId = instanceId;
  }

  public ContainerAssignmentCommand ipId(Integer ipId) {
    this.ipId = ipId;
    return this;
  }

   /**
   * Ip address for load balancer
   * @return ipId
  **/
  @ApiModelProperty(required = true, value = "Ip address for load balancer")
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
    ContainerAssignmentCommand containerAssignmentCommand = (ContainerAssignmentCommand) o;
    return Objects.equals(this.instanceId, containerAssignmentCommand.instanceId) &&
        Objects.equals(this.ipId, containerAssignmentCommand.ipId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, ipId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerAssignmentCommand {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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

