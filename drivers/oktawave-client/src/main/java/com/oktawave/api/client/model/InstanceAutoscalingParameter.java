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
 * Instance autoscaling configuration
 */
@ApiModel(description = "Instance autoscaling configuration")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-03T15:23:33.358+01:00")
public class InstanceAutoscalingParameter {
  @SerializedName("AutoscalingParameterType")
  private DictionaryItem autoscalingParameterType = null;

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
  private NullableTime restartTimeFrom = null;

  @SerializedName("RestartTimeTo")
  private NullableTime restartTimeTo = null;

  @SerializedName("TimeZoneName")
  private String timeZoneName = null;

  public InstanceAutoscalingParameter autoscalingParameterType(DictionaryItem autoscalingParameterType) {
    this.autoscalingParameterType = autoscalingParameterType;
    return this;
  }

   /**
   * Autoscaling parameter type
   * @return autoscalingParameterType
  **/
  @ApiModelProperty(value = "Autoscaling parameter type")
  public DictionaryItem getAutoscalingParameterType() {
    return autoscalingParameterType;
  }

  public void setAutoscalingParameterType(DictionaryItem autoscalingParameterType) {
    this.autoscalingParameterType = autoscalingParameterType;
  }

  public InstanceAutoscalingParameter minRam(Integer minRam) {
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

  public InstanceAutoscalingParameter maxRam(Integer maxRam) {
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

  public InstanceAutoscalingParameter minCpu(Integer minCpu) {
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

  public InstanceAutoscalingParameter maxCpu(Integer maxCpu) {
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

  public InstanceAutoscalingParameter hasAgreedToIncreaseClass(Boolean hasAgreedToIncreaseClass) {
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

  public InstanceAutoscalingParameter hasAgreedToDecreaseClass(Boolean hasAgreedToDecreaseClass) {
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

  public InstanceAutoscalingParameter hasAgreedToRestart(Boolean hasAgreedToRestart) {
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

  public InstanceAutoscalingParameter restartTimeFrom(NullableTime restartTimeFrom) {
    this.restartTimeFrom = restartTimeFrom;
    return this;
  }

   /**
   * Restart time lower limit
   * @return restartTimeFrom
  **/
  @ApiModelProperty(value = "Restart time lower limit")
  public NullableTime getRestartTimeFrom() {
    return restartTimeFrom;
  }

  public void setRestartTimeFrom(NullableTime restartTimeFrom) {
    this.restartTimeFrom = restartTimeFrom;
  }

  public InstanceAutoscalingParameter restartTimeTo(NullableTime restartTimeTo) {
    this.restartTimeTo = restartTimeTo;
    return this;
  }

   /**
   * Restart time upper limit
   * @return restartTimeTo
  **/
  @ApiModelProperty(value = "Restart time upper limit")
  public NullableTime getRestartTimeTo() {
    return restartTimeTo;
  }

  public void setRestartTimeTo(NullableTime restartTimeTo) {
    this.restartTimeTo = restartTimeTo;
  }

  public InstanceAutoscalingParameter timeZoneName(String timeZoneName) {
    this.timeZoneName = timeZoneName;
    return this;
  }

   /**
   * Time zone name (https://www.iana.org/time-zones)
   * @return timeZoneName
  **/
  @ApiModelProperty(value = "Time zone name (https://www.iana.org/time-zones)")
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
    InstanceAutoscalingParameter instanceAutoscalingParameter = (InstanceAutoscalingParameter) o;
    return Objects.equals(this.autoscalingParameterType, instanceAutoscalingParameter.autoscalingParameterType) &&
        Objects.equals(this.minRam, instanceAutoscalingParameter.minRam) &&
        Objects.equals(this.maxRam, instanceAutoscalingParameter.maxRam) &&
        Objects.equals(this.minCpu, instanceAutoscalingParameter.minCpu) &&
        Objects.equals(this.maxCpu, instanceAutoscalingParameter.maxCpu) &&
        Objects.equals(this.hasAgreedToIncreaseClass, instanceAutoscalingParameter.hasAgreedToIncreaseClass) &&
        Objects.equals(this.hasAgreedToDecreaseClass, instanceAutoscalingParameter.hasAgreedToDecreaseClass) &&
        Objects.equals(this.hasAgreedToRestart, instanceAutoscalingParameter.hasAgreedToRestart) &&
        Objects.equals(this.restartTimeFrom, instanceAutoscalingParameter.restartTimeFrom) &&
        Objects.equals(this.restartTimeTo, instanceAutoscalingParameter.restartTimeTo) &&
        Objects.equals(this.timeZoneName, instanceAutoscalingParameter.timeZoneName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoscalingParameterType, minRam, maxRam, minCpu, maxCpu, hasAgreedToIncreaseClass, hasAgreedToDecreaseClass, hasAgreedToRestart, restartTimeFrom, restartTimeTo, timeZoneName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceAutoscalingParameter {\n");

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
