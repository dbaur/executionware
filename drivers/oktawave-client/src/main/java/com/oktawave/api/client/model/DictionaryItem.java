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
 * Dictionary item
 */
@ApiModel(description = "Dictionary item")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-03T15:23:33.358+01:00")
public class DictionaryItem {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("Label")
  private String label = null;

  @SerializedName("Dictionary")
  private Resource dictionary = null;

  public DictionaryItem id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID
   * @return id
  **/
  @ApiModelProperty(value = "ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public DictionaryItem label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Label
   * @return label
  **/
  @ApiModelProperty(value = "Label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public DictionaryItem dictionary(Resource dictionary) {
    this.dictionary = dictionary;
    return this;
  }

   /**
   * Dictionary
   * @return dictionary
  **/
  @ApiModelProperty(value = "Dictionary")
  public Resource getDictionary() {
    return dictionary;
  }

  public void setDictionary(Resource dictionary) {
    this.dictionary = dictionary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryItem dictionaryItem = (DictionaryItem) o;
    return Objects.equals(this.id, dictionaryItem.id) &&
        Objects.equals(this.label, dictionaryItem.label) &&
        Objects.equals(this.dictionary, dictionaryItem.dictionary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, dictionary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    dictionary: ").append(toIndentedString(dictionary)).append("\n");
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

