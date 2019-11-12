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
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ApiCollectionOcsProject
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-25T12:05:03.973+02:00")
public class ApiCollectionOcsProject {
  @SerializedName("Items")
  private List<OcsProject> items = null;

  @SerializedName("Meta")
  private ApiCollectionMetadata meta = null;

  public ApiCollectionOcsProject items(List<OcsProject> items) {
    this.items = items;
    return this;
  }

  public ApiCollectionOcsProject addItemsItem(OcsProject itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<OcsProject>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<OcsProject> getItems() {
    return items;
  }

  public void setItems(List<OcsProject> items) {
    this.items = items;
  }

  public ApiCollectionOcsProject meta(ApiCollectionMetadata meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(value = "")
  public ApiCollectionMetadata getMeta() {
    return meta;
  }

  public void setMeta(ApiCollectionMetadata meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCollectionOcsProject apiCollectionOcsProject = (ApiCollectionOcsProject) o;
    return Objects.equals(this.items, apiCollectionOcsProject.items) &&
        Objects.equals(this.meta, apiCollectionOcsProject.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCollectionOcsProject {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

