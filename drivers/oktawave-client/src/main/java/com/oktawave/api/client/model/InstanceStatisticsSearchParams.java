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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Search params for instance statistics
 */
@ApiModel(description = "Search params for instance statistics")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-25T12:05:03.973+02:00")
public class InstanceStatisticsSearchParams {
  @SerializedName("StatisticInterval")
  private Integer statisticInterval = 1519;

  @SerializedName("DateFrom")
  private OffsetDateTime dateFrom = null;

  @SerializedName("DateTo")
  private OffsetDateTime dateTo = null;

  @SerializedName("StatisticTypes")
  private List<Integer> statisticTypes = new ArrayList<Integer>();

  public InstanceStatisticsSearchParams statisticInterval(Integer statisticInterval) {
    this.statisticInterval = statisticInterval;
    return this;
  }

   /**
   * Statistic interval
   * @return statisticInterval
  **/
  @ApiModelProperty(required = true, value = "Statistic interval")
  public Integer getStatisticInterval() {
    return statisticInterval;
  }

  public void setStatisticInterval(Integer statisticInterval) {
    this.statisticInterval = statisticInterval;
  }

  public InstanceStatisticsSearchParams dateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

   /**
   * Date from (utc timezone)
   * @return dateFrom
  **/
  @ApiModelProperty(required = true, value = "Date from (utc timezone)")
  public OffsetDateTime getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
  }

  public InstanceStatisticsSearchParams dateTo(OffsetDateTime dateTo) {
    this.dateTo = dateTo;
    return this;
  }

   /**
   * Date to (utc timezone)
   * @return dateTo
  **/
  @ApiModelProperty(required = true, value = "Date to (utc timezone)")
  public OffsetDateTime getDateTo() {
    return dateTo;
  }

  public void setDateTo(OffsetDateTime dateTo) {
    this.dateTo = dateTo;
  }

  public InstanceStatisticsSearchParams statisticTypes(List<Integer> statisticTypes) {
    this.statisticTypes = statisticTypes;
    return this;
  }

  public InstanceStatisticsSearchParams addStatisticTypesItem(Integer statisticTypesItem) {
    this.statisticTypes.add(statisticTypesItem);
    return this;
  }

   /**
   * Statistic types
   * @return statisticTypes
  **/
  @ApiModelProperty(required = true, value = "Statistic types")
  public List<Integer> getStatisticTypes() {
    return statisticTypes;
  }

  public void setStatisticTypes(List<Integer> statisticTypes) {
    this.statisticTypes = statisticTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceStatisticsSearchParams instanceStatisticsSearchParams = (InstanceStatisticsSearchParams) o;
    return Objects.equals(this.statisticInterval, instanceStatisticsSearchParams.statisticInterval) &&
        Objects.equals(this.dateFrom, instanceStatisticsSearchParams.dateFrom) &&
        Objects.equals(this.dateTo, instanceStatisticsSearchParams.dateTo) &&
        Objects.equals(this.statisticTypes, instanceStatisticsSearchParams.statisticTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statisticInterval, dateFrom, dateTo, statisticTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceStatisticsSearchParams {\n");
    
    sb.append("    statisticInterval: ").append(toIndentedString(statisticInterval)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    statisticTypes: ").append(toIndentedString(statisticTypes)).append("\n");
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

