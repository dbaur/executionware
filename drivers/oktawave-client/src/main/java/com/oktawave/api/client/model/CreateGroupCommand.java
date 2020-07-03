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
 * Create group command
 */
@ApiModel(description = "Create group command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-03T15:23:33.358+01:00")
public class CreateGroupCommand {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("AffinityRuleType")
  private Integer affinityRuleType = 1403;

  public CreateGroupCommand name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateGroupCommand affinityRuleType(Integer affinityRuleType) {
    this.affinityRuleType = affinityRuleType;
    return this;
  }

   /**
   * Instances affinity rule type
   * @return affinityRuleType
  **/
  @ApiModelProperty(required = true, value = "Instances affinity rule type")
  public Integer getAffinityRuleType() {
    return affinityRuleType;
  }

  public void setAffinityRuleType(Integer affinityRuleType) {
    this.affinityRuleType = affinityRuleType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGroupCommand createGroupCommand = (CreateGroupCommand) o;
    return Objects.equals(this.name, createGroupCommand.name) &&
        Objects.equals(this.affinityRuleType, createGroupCommand.affinityRuleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, affinityRuleType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGroupCommand {\n");

      sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    affinityRuleType: ").append(toIndentedString(affinityRuleType)).append("\n");
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

