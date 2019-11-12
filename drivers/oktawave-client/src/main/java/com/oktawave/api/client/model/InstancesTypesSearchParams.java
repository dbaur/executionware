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
 * Search params for instances types
 */
@ApiModel(description = "Search params for instances types")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-25T12:05:03.973+02:00")
public class InstancesTypesSearchParams {
  @SerializedName("CategoryId")
  private Integer categoryId = null;

  @SerializedName("AvailableForFreemium")
  private Boolean availableForFreemium = null;

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

  public InstancesTypesSearchParams categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Category id
   * @return categoryId
  **/
  @ApiModelProperty(value = "Category id")
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public InstancesTypesSearchParams availableForFreemium(Boolean availableForFreemium) {
    this.availableForFreemium = availableForFreemium;
    return this;
  }

   /**
   * Is available for freemium
   * @return availableForFreemium
  **/
  @ApiModelProperty(value = "Is available for freemium")
  public Boolean isAvailableForFreemium() {
    return availableForFreemium;
  }

  public void setAvailableForFreemium(Boolean availableForFreemium) {
    this.availableForFreemium = availableForFreemium;
  }

  public InstancesTypesSearchParams pageSize(Integer pageSize) {
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

  public InstancesTypesSearchParams pageNumber(Integer pageNumber) {
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

  public InstancesTypesSearchParams orderBy(String orderBy) {
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
    InstancesTypesSearchParams instancesTypesSearchParams = (InstancesTypesSearchParams) o;
    return Objects.equals(this.categoryId, instancesTypesSearchParams.categoryId) &&
        Objects.equals(this.availableForFreemium, instancesTypesSearchParams.availableForFreemium) &&
        Objects.equals(this.pageSize, instancesTypesSearchParams.pageSize) &&
        Objects.equals(this.pageNumber, instancesTypesSearchParams.pageNumber) &&
        Objects.equals(this.orderBy, instancesTypesSearchParams.orderBy) &&
        Objects.equals(this.sortExpression, instancesTypesSearchParams.sortExpression) &&
        Objects.equals(this.sortDirection, instancesTypesSearchParams.sortDirection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, availableForFreemium, pageSize, pageNumber, orderBy, sortExpression, sortDirection);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstancesTypesSearchParams {\n");
    
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    availableForFreemium: ").append(toIndentedString(availableForFreemium)).append("\n");
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
