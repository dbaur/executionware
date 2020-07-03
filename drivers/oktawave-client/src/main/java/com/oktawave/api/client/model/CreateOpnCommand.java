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
 * Create OPN command
 */
@ApiModel(description = "Create OPN command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-03T15:23:33.358+01:00")
public class CreateOpnCommand {
  @SerializedName("OpnName")
  private String opnName = null;

  public CreateOpnCommand opnName(String opnName) {
    this.opnName = opnName;
    return this;
  }

   /**
   * OPN name
   * @return opnName
  **/
  @ApiModelProperty(required = true, value = "OPN name")
  public String getOpnName() {
    return opnName;
  }

  public void setOpnName(String opnName) {
    this.opnName = opnName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOpnCommand createOpnCommand = (CreateOpnCommand) o;
    return Objects.equals(this.opnName, createOpnCommand.opnName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opnName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOpnCommand {\n");
    
    sb.append("    opnName: ").append(toIndentedString(opnName)).append("\n");
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

