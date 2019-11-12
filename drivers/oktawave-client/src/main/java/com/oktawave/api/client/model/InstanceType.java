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
 * Instance type
 */
@ApiModel(description = "Instance type")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-25T12:05:03.973+02:00")
public class InstanceType {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Cpu")
  private Integer cpu = null;

  @SerializedName("Ram")
  private Integer ram = null;

  @SerializedName("AvailableForFreemium")
  private Boolean availableForFreemium = null;

  @SerializedName("Category")
  private DictionaryItem category = null;

  public InstanceType id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Id
   * @return id
  **/
  @ApiModelProperty(value = "Id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public InstanceType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InstanceType cpu(Integer cpu) {
    this.cpu = cpu;
    return this;
  }

   /**
   * Number of CPU
   * @return cpu
  **/
  @ApiModelProperty(value = "Number of CPU")
  public Integer getCpu() {
    return cpu;
  }

  public void setCpu(Integer cpu) {
    this.cpu = cpu;
  }

  public InstanceType ram(Integer ram) {
    this.ram = ram;
    return this;
  }

   /**
   * Memory in MB
   * @return ram
  **/
  @ApiModelProperty(value = "Memory in MB")
  public Integer getRam() {
    return ram;
  }

  public void setRam(Integer ram) {
    this.ram = ram;
  }

  public InstanceType availableForFreemium(Boolean availableForFreemium) {
    this.availableForFreemium = availableForFreemium;
    return this;
  }

   /**
   * Is available for Freemiuim
   * @return availableForFreemium
  **/
  @ApiModelProperty(value = "Is available for Freemiuim")
  public Boolean isAvailableForFreemium() {
    return availableForFreemium;
  }

  public void setAvailableForFreemium(Boolean availableForFreemium) {
    this.availableForFreemium = availableForFreemium;
  }

  public InstanceType category(DictionaryItem category) {
    this.category = category;
    return this;
  }

   /**
   * Category
   * @return category
  **/
  @ApiModelProperty(value = "Category")
  public DictionaryItem getCategory() {
    return category;
  }

  public void setCategory(DictionaryItem category) {
    this.category = category;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceType instanceType = (InstanceType) o;
    return Objects.equals(this.id, instanceType.id) &&
        Objects.equals(this.name, instanceType.name) &&
        Objects.equals(this.cpu, instanceType.cpu) &&
        Objects.equals(this.ram, instanceType.ram) &&
        Objects.equals(this.availableForFreemium, instanceType.availableForFreemium) &&
        Objects.equals(this.category, instanceType.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, cpu, ram, availableForFreemium, category);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
    sb.append("    availableForFreemium: ").append(toIndentedString(availableForFreemium)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

