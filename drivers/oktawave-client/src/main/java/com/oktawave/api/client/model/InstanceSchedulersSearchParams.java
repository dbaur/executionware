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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.Objects;

/**
 * Search params for instance schedulers
 */
@ApiModel(description = "Search params for instance schedulers")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-03T15:23:33.358+01:00")
public class InstanceSchedulersSearchParams {
  @SerializedName("InstanceId")
  private Integer instanceId = null;

  @SerializedName("ActionTypeId")
  private Integer actionTypeId = null;

  @SerializedName("Query")
  private String query = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("OrderBy")
  private String orderBy = null;

  @SerializedName("SortExpression")
  private String sortExpression = null;

  /**
   * Sort direction
   */
  @JsonAdapter(SortDirectionEnum.Adapter.class)
  public enum SortDirectionEnum {
    DESCENDING("Descending"),
    
    ASCENDING("Ascending");

    private String value;

    SortDirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SortDirectionEnum fromValue(String text) {
      for (SortDirectionEnum b : SortDirectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SortDirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SortDirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SortDirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SortDirectionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("SortDirection")
  private SortDirectionEnum sortDirection = null;

  public InstanceSchedulersSearchParams instanceId(Integer instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Instance id filter
   * @return instanceId
  **/
  @ApiModelProperty(value = "Instance id filter")
  public Integer getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(Integer instanceId) {
    this.instanceId = instanceId;
  }

  public InstanceSchedulersSearchParams actionTypeId(Integer actionTypeId) {
    this.actionTypeId = actionTypeId;
    return this;
  }

   /**
   * Action type id filter
   * @return actionTypeId
  **/
  @ApiModelProperty(value = "Action type id filter")
  public Integer getActionTypeId() {
    return actionTypeId;
  }

  public void setActionTypeId(Integer actionTypeId) {
    this.actionTypeId = actionTypeId;
  }

  public InstanceSchedulersSearchParams query(String query) {
    this.query = query;
    return this;
  }

   /**
   * Query
   * @return query
  **/
  @ApiModelProperty(value = "Query")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public InstanceSchedulersSearchParams pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Page size
   * @return pageSize
  **/
  @ApiModelProperty(value = "Page size")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public InstanceSchedulersSearchParams pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Page number
   * @return pageNumber
  **/
  @ApiModelProperty(value = "Page number")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public InstanceSchedulersSearchParams orderBy(String orderBy) {
    this.orderBy = orderBy;
    return this;
  }

   /**
   * Order by
   * @return orderBy
  **/
  @ApiModelProperty(value = "Order by")
  public String getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }

   /**
   * Sort expression
   * @return sortExpression
  **/
  @ApiModelProperty(value = "Sort expression")
  public String getSortExpression() {
    return sortExpression;
  }

   /**
   * Sort direction
   * @return sortDirection
  **/
  @ApiModelProperty(value = "Sort direction")
  public SortDirectionEnum getSortDirection() {
    return sortDirection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceSchedulersSearchParams instanceSchedulersSearchParams = (InstanceSchedulersSearchParams) o;
    return Objects.equals(this.instanceId, instanceSchedulersSearchParams.instanceId) &&
        Objects.equals(this.actionTypeId, instanceSchedulersSearchParams.actionTypeId) &&
        Objects.equals(this.query, instanceSchedulersSearchParams.query) &&
        Objects.equals(this.pageSize, instanceSchedulersSearchParams.pageSize) &&
        Objects.equals(this.pageNumber, instanceSchedulersSearchParams.pageNumber) &&
        Objects.equals(this.orderBy, instanceSchedulersSearchParams.orderBy) &&
        Objects.equals(this.sortExpression, instanceSchedulersSearchParams.sortExpression) &&
        Objects.equals(this.sortDirection, instanceSchedulersSearchParams.sortDirection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, actionTypeId, query, pageSize, pageNumber, orderBy, sortExpression, sortDirection);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceSchedulersSearchParams {\n");

      sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    actionTypeId: ").append(toIndentedString(actionTypeId)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    sortExpression: ").append(toIndentedString(sortExpression)).append("\n");
    sb.append("    sortDirection: ").append(toIndentedString(sortDirection)).append("\n");
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

