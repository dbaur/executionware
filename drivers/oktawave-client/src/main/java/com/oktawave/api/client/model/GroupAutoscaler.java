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
 * Group autoscaler settings
 */
@ApiModel(description = "Group autoscaler settings")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-25T12:05:03.973+02:00")
public class GroupAutoscaler {
  @SerializedName("ExpansionType")
  private DictionaryItem expansionType = null;

  @SerializedName("MinimumInstanceNumber")
  private Integer minimumInstanceNumber = null;

  @SerializedName("MaximumInstanceNumber")
  private Integer maximumInstanceNumber = null;

  @SerializedName("Instances")
  private List<GroupAutoscalerInstance> instances = null;

  public GroupAutoscaler expansionType(DictionaryItem expansionType) {
    this.expansionType = expansionType;
    return this;
  }

   /**
   * Expansion type
   * @return expansionType
  **/
  @ApiModelProperty(value = "Expansion type")
  public DictionaryItem getExpansionType() {
    return expansionType;
  }

  public void setExpansionType(DictionaryItem expansionType) {
    this.expansionType = expansionType;
  }

  public GroupAutoscaler minimumInstanceNumber(Integer minimumInstanceNumber) {
    this.minimumInstanceNumber = minimumInstanceNumber;
    return this;
  }

   /**
   * Minimum instance number in group
   * @return minimumInstanceNumber
  **/
  @ApiModelProperty(value = "Minimum instance number in group")
  public Integer getMinimumInstanceNumber() {
    return minimumInstanceNumber;
  }

  public void setMinimumInstanceNumber(Integer minimumInstanceNumber) {
    this.minimumInstanceNumber = minimumInstanceNumber;
  }

  public GroupAutoscaler maximumInstanceNumber(Integer maximumInstanceNumber) {
    this.maximumInstanceNumber = maximumInstanceNumber;
    return this;
  }

   /**
   * Minimum instance number in group
   * @return maximumInstanceNumber
  **/
  @ApiModelProperty(value = "Minimum instance number in group")
  public Integer getMaximumInstanceNumber() {
    return maximumInstanceNumber;
  }

  public void setMaximumInstanceNumber(Integer maximumInstanceNumber) {
    this.maximumInstanceNumber = maximumInstanceNumber;
  }

  public GroupAutoscaler instances(List<GroupAutoscalerInstance> instances) {
    this.instances = instances;
    return this;
  }

  public GroupAutoscaler addInstancesItem(GroupAutoscalerInstance instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<GroupAutoscalerInstance>();
    }
    this.instances.add(instancesItem);
    return this;
  }

   /**
   * Instances to scaling
   * @return instances
  **/
  @ApiModelProperty(value = "Instances to scaling")
  public List<GroupAutoscalerInstance> getInstances() {
    return instances;
  }

  public void setInstances(List<GroupAutoscalerInstance> instances) {
    this.instances = instances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupAutoscaler groupAutoscaler = (GroupAutoscaler) o;
    return Objects.equals(this.expansionType, groupAutoscaler.expansionType) &&
        Objects.equals(this.minimumInstanceNumber, groupAutoscaler.minimumInstanceNumber) &&
        Objects.equals(this.maximumInstanceNumber, groupAutoscaler.maximumInstanceNumber) &&
        Objects.equals(this.instances, groupAutoscaler.instances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expansionType, minimumInstanceNumber, maximumInstanceNumber, instances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupAutoscaler {\n");
    
    sb.append("    expansionType: ").append(toIndentedString(expansionType)).append("\n");
    sb.append("    minimumInstanceNumber: ").append(toIndentedString(minimumInstanceNumber)).append("\n");
    sb.append("    maximumInstanceNumber: ").append(toIndentedString(maximumInstanceNumber)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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
