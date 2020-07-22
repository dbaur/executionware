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
 * Delete events command
 */
@ApiModel(description = "Delete events command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-03T15:23:33.358+01:00")
public class DeleteEventsCommand {
  @SerializedName("DateFrom")
  private OffsetDateTime dateFrom = null;

  @SerializedName("DateTo")
  private OffsetDateTime dateTo = null;

  public DeleteEventsCommand dateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

   /**
   * Date from
   * @return dateFrom
  **/
  @ApiModelProperty(required = true, value = "Date from")
  public OffsetDateTime getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
  }

  public DeleteEventsCommand dateTo(OffsetDateTime dateTo) {
    this.dateTo = dateTo;
    return this;
  }

   /**
   * Date to
   * @return dateTo
  **/
  @ApiModelProperty(required = true, value = "Date to")
  public OffsetDateTime getDateTo() {
    return dateTo;
  }

  public void setDateTo(OffsetDateTime dateTo) {
    this.dateTo = dateTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteEventsCommand deleteEventsCommand = (DeleteEventsCommand) o;
    return Objects.equals(this.dateFrom, deleteEventsCommand.dateFrom) &&
        Objects.equals(this.dateTo, deleteEventsCommand.dateTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateFrom, dateTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteEventsCommand {\n");
    
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
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
