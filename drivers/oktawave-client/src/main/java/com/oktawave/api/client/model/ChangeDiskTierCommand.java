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
 * Change disk tier command
 */
@ApiModel(description = "Change disk tier command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-25T12:05:03.973+02:00")
public class ChangeDiskTierCommand {
  @SerializedName("TierId")
  private Integer tierId = null;

  public ChangeDiskTierCommand tierId(Integer tierId) {
    this.tierId = tierId;
    return this;
  }

   /**
   * Tier id
   * @return tierId
  **/
  @ApiModelProperty(required = true, value = "Tier id")
  public Integer getTierId() {
    return tierId;
  }

  public void setTierId(Integer tierId) {
    this.tierId = tierId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeDiskTierCommand changeDiskTierCommand = (ChangeDiskTierCommand) o;
    return Objects.equals(this.tierId, changeDiskTierCommand.tierId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tierId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeDiskTierCommand {\n");
    
    sb.append("    tierId: ").append(toIndentedString(tierId)).append("\n");
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

