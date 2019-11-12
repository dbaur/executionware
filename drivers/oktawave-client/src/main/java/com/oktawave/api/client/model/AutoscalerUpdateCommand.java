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
 * Instance autoscaler configuration update command
 */
@ApiModel(description = "Instance autoscaler configuration update command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-25T12:05:03.973+02:00")
public class AutoscalerUpdateCommand {
  @SerializedName("AutoscalingParameterType")
  private Integer autoscalingParameterType = null;

  @SerializedName("MinRam")
  private Integer minRam = null;

  @SerializedName("MaxRam")
  private Integer maxRam = null;

  @SerializedName("MinCpu")
  private Integer minCpu = null;

  @SerializedName("MaxCpu")
  private Integer maxCpu = null;

  @SerializedName("HasAgreedToIncreaseClass")
  private Boolean hasAgreedToIncreaseClass = null;

  @SerializedName("HasAgreedToDecreaseClass")
  private Boolean hasAgreedToDecreaseClass = null;

  @SerializedName("HasAgreedToRestart")
  private Boolean hasAgreedToRestart = null;

  @SerializedName("RestartTimeFrom")
  private String restartTimeFrom = null;

  @SerializedName("RestartTimeTo")
  private String restartTimeTo = null;

  @SerializedName("TimeZoneName")
  private String timeZoneName = null;

  public AutoscalerUpdateCommand autoscalingParameterType(Integer autoscalingParameterType) {
    this.autoscalingParameterType = autoscalingParameterType;
    return this;
  }

   /**
   * Autoscaling parameter type
   * @return autoscalingParameterType
  **/
  @ApiModelProperty(value = "Autoscaling parameter type")
  public Integer getAutoscalingParameterType() {
    return autoscalingParameterType;
  }

  public void setAutoscalingParameterType(Integer autoscalingParameterType) {
    this.autoscalingParameterType = autoscalingParameterType;
  }

  public AutoscalerUpdateCommand minRam(Integer minRam) {
    this.minRam = minRam;
    return this;
  }

   /**
   * Minimum RAM capacity in megabytes
   * @return minRam
  **/
  @ApiModelProperty(value = "Minimum RAM capacity in megabytes")
  public Integer getMinRam() {
    return minRam;
  }

  public void setMinRam(Integer minRam) {
    this.minRam = minRam;
  }

  public AutoscalerUpdateCommand maxRam(Integer maxRam) {
    this.maxRam = maxRam;
    return this;
  }

   /**
   * Maximum RAM capacity in megabytes
   * @return maxRam
  **/
  @ApiModelProperty(value = "Maximum RAM capacity in megabytes")
  public Integer getMaxRam() {
    return maxRam;
  }

  public void setMaxRam(Integer maxRam) {
    this.maxRam = maxRam;
  }

  public AutoscalerUpdateCommand minCpu(Integer minCpu) {
    this.minCpu = minCpu;
    return this;
  }

   /**
   * Minimum CPU count
   * @return minCpu
  **/
  @ApiModelProperty(value = "Minimum CPU count")
  public Integer getMinCpu() {
    return minCpu;
  }

  public void setMinCpu(Integer minCpu) {
    this.minCpu = minCpu;
  }

  public AutoscalerUpdateCommand maxCpu(Integer maxCpu) {
    this.maxCpu = maxCpu;
    return this;
  }

   /**
   * Maximum CPU count
   * @return maxCpu
  **/
  @ApiModelProperty(value = "Maximum CPU count")
  public Integer getMaxCpu() {
    return maxCpu;
  }

  public void setMaxCpu(Integer maxCpu) {
    this.maxCpu = maxCpu;
  }

  public AutoscalerUpdateCommand hasAgreedToIncreaseClass(Boolean hasAgreedToIncreaseClass) {
    this.hasAgreedToIncreaseClass = hasAgreedToIncreaseClass;
    return this;
  }

   /**
   * Instance class increase agreement
   * @return hasAgreedToIncreaseClass
  **/
  @ApiModelProperty(value = "Instance class increase agreement")
  public Boolean isHasAgreedToIncreaseClass() {
    return hasAgreedToIncreaseClass;
  }

  public void setHasAgreedToIncreaseClass(Boolean hasAgreedToIncreaseClass) {
    this.hasAgreedToIncreaseClass = hasAgreedToIncreaseClass;
  }

  public AutoscalerUpdateCommand hasAgreedToDecreaseClass(Boolean hasAgreedToDecreaseClass) {
    this.hasAgreedToDecreaseClass = hasAgreedToDecreaseClass;
    return this;
  }

   /**
   * Instance class decrease agreement
   * @return hasAgreedToDecreaseClass
  **/
  @ApiModelProperty(value = "Instance class decrease agreement")
  public Boolean isHasAgreedToDecreaseClass() {
    return hasAgreedToDecreaseClass;
  }

  public void setHasAgreedToDecreaseClass(Boolean hasAgreedToDecreaseClass) {
    this.hasAgreedToDecreaseClass = hasAgreedToDecreaseClass;
  }

  public AutoscalerUpdateCommand hasAgreedToRestart(Boolean hasAgreedToRestart) {
    this.hasAgreedToRestart = hasAgreedToRestart;
    return this;
  }

   /**
   * Restart agreement
   * @return hasAgreedToRestart
  **/
  @ApiModelProperty(value = "Restart agreement")
  public Boolean isHasAgreedToRestart() {
    return hasAgreedToRestart;
  }

  public void setHasAgreedToRestart(Boolean hasAgreedToRestart) {
    this.hasAgreedToRestart = hasAgreedToRestart;
  }

  public AutoscalerUpdateCommand restartTimeFrom(String restartTimeFrom) {
    this.restartTimeFrom = restartTimeFrom;
    return this;
  }

   /**
   * Restart time lower limit in HH:mm format
   * @return restartTimeFrom
  **/
  @ApiModelProperty(value = "Restart time lower limit in HH:mm format")
  public String getRestartTimeFrom() {
    return restartTimeFrom;
  }

  public void setRestartTimeFrom(String restartTimeFrom) {
    this.restartTimeFrom = restartTimeFrom;
  }

  public AutoscalerUpdateCommand restartTimeTo(String restartTimeTo) {
    this.restartTimeTo = restartTimeTo;
    return this;
  }

   /**
   * Restart time upper limit in  HH:mm format
   * @return restartTimeTo
  **/
  @ApiModelProperty(value = "Restart time upper limit in  HH:mm format")
  public String getRestartTimeTo() {
    return restartTimeTo;
  }

  public void setRestartTimeTo(String restartTimeTo) {
    this.restartTimeTo = restartTimeTo;
  }

  public AutoscalerUpdateCommand timeZoneName(String timeZoneName) {
    this.timeZoneName = timeZoneName;
    return this;
  }

   /**
   * Timezone name
   * @return timeZoneName
  **/
  @ApiModelProperty(value = "Timezone name")
  public String getTimeZoneName() {
    return timeZoneName;
  }

  public void setTimeZoneName(String timeZoneName) {
    this.timeZoneName = timeZoneName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoscalerUpdateCommand autoscalerUpdateCommand = (AutoscalerUpdateCommand) o;
    return Objects.equals(this.autoscalingParameterType, autoscalerUpdateCommand.autoscalingParameterType) &&
        Objects.equals(this.minRam, autoscalerUpdateCommand.minRam) &&
        Objects.equals(this.maxRam, autoscalerUpdateCommand.maxRam) &&
        Objects.equals(this.minCpu, autoscalerUpdateCommand.minCpu) &&
        Objects.equals(this.maxCpu, autoscalerUpdateCommand.maxCpu) &&
        Objects.equals(this.hasAgreedToIncreaseClass, autoscalerUpdateCommand.hasAgreedToIncreaseClass) &&
        Objects.equals(this.hasAgreedToDecreaseClass, autoscalerUpdateCommand.hasAgreedToDecreaseClass) &&
        Objects.equals(this.hasAgreedToRestart, autoscalerUpdateCommand.hasAgreedToRestart) &&
        Objects.equals(this.restartTimeFrom, autoscalerUpdateCommand.restartTimeFrom) &&
        Objects.equals(this.restartTimeTo, autoscalerUpdateCommand.restartTimeTo) &&
        Objects.equals(this.timeZoneName, autoscalerUpdateCommand.timeZoneName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoscalingParameterType, minRam, maxRam, minCpu, maxCpu, hasAgreedToIncreaseClass, hasAgreedToDecreaseClass, hasAgreedToRestart, restartTimeFrom, restartTimeTo, timeZoneName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoscalerUpdateCommand {\n");
    
    sb.append("    autoscalingParameterType: ").append(toIndentedString(autoscalingParameterType)).append("\n");
    sb.append("    minRam: ").append(toIndentedString(minRam)).append("\n");
    sb.append("    maxRam: ").append(toIndentedString(maxRam)).append("\n");
    sb.append("    minCpu: ").append(toIndentedString(minCpu)).append("\n");
    sb.append("    maxCpu: ").append(toIndentedString(maxCpu)).append("\n");
    sb.append("    hasAgreedToIncreaseClass: ").append(toIndentedString(hasAgreedToIncreaseClass)).append("\n");
    sb.append("    hasAgreedToDecreaseClass: ").append(toIndentedString(hasAgreedToDecreaseClass)).append("\n");
    sb.append("    hasAgreedToRestart: ").append(toIndentedString(hasAgreedToRestart)).append("\n");
    sb.append("    restartTimeFrom: ").append(toIndentedString(restartTimeFrom)).append("\n");
    sb.append("    restartTimeTo: ").append(toIndentedString(restartTimeTo)).append("\n");
    sb.append("    timeZoneName: ").append(toIndentedString(timeZoneName)).append("\n");
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
