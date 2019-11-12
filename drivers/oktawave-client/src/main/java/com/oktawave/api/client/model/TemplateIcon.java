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
 * Icon file
 */
@ApiModel(description = "Icon file")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-25T12:05:03.973+02:00")
public class TemplateIcon {
  @SerializedName("FileName")
  private String fileName = null;

  @SerializedName("FileSource")
  private String fileSource = null;

  public TemplateIcon fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * File name
   * @return fileName
  **/
  @ApiModelProperty(required = true, value = "File name")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public TemplateIcon fileSource(String fileSource) {
    this.fileSource = fileSource;
    return this;
  }

   /**
   * File source in Base64
   * @return fileSource
  **/
  @ApiModelProperty(required = true, value = "File source in Base64")
  public String getFileSource() {
    return fileSource;
  }

  public void setFileSource(String fileSource) {
    this.fileSource = fileSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateIcon templateIcon = (TemplateIcon) o;
    return Objects.equals(this.fileName, templateIcon.fileName) &&
        Objects.equals(this.fileSource, templateIcon.fileSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, fileSource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateIcon {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSource: ").append(toIndentedString(fileSource)).append("\n");
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
