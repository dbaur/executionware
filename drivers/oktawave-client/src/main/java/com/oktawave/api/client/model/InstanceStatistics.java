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
 * Basic instance statistics
 */
@ApiModel(description = "Basic instance statistics")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-03T15:23:33.358+01:00")
public class InstanceStatistics {
  @SerializedName("Instance")
  private BaseResource instance = null;

  @SerializedName("StatisticType")
  private BaseResource statisticType = null;

  @SerializedName("SampleTime")
  private OffsetDateTime sampleTime = null;

  @SerializedName("Details")
  private String details = null;

  @SerializedName("Value")
  private Long value = null;

  public InstanceStatistics instance(BaseResource instance) {
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

  public InstanceStatistics statisticType(BaseResource statisticType) {
    this.statisticType = statisticType;
    return this;
  }

   /**
   * Statistic type
   * @return statisticType
  **/
  @ApiModelProperty(value = "Statistic type")
  public BaseResource getStatisticType() {
    return statisticType;
  }

  public void setStatisticType(BaseResource statisticType) {
    this.statisticType = statisticType;
  }

  public InstanceStatistics sampleTime(OffsetDateTime sampleTime) {
    this.sampleTime = sampleTime;
    return this;
  }

   /**
   * Sample time
   * @return sampleTime
  **/
  @ApiModelProperty(value = "Sample time")
  public OffsetDateTime getSampleTime() {
    return sampleTime;
  }

  public void setSampleTime(OffsetDateTime sampleTime) {
    this.sampleTime = sampleTime;
  }

  public InstanceStatistics details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Details
   * @return details
  **/
  @ApiModelProperty(value = "Details")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public InstanceStatistics value(Long value) {
    this.value = value;
    return this;
  }

   /**
   * Value
   * @return value
  **/
  @ApiModelProperty(value = "Value")
  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceStatistics instanceStatistics = (InstanceStatistics) o;
    return Objects.equals(this.instance, instanceStatistics.instance) &&
        Objects.equals(this.statisticType, instanceStatistics.statisticType) &&
        Objects.equals(this.sampleTime, instanceStatistics.sampleTime) &&
        Objects.equals(this.details, instanceStatistics.details) &&
        Objects.equals(this.value, instanceStatistics.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instance, statisticType, sampleTime, details, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceStatistics {\n");

      sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    statisticType: ").append(toIndentedString(statisticType)).append("\n");
    sb.append("    sampleTime: ").append(toIndentedString(sampleTime)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

