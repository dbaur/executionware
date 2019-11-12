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
 * Create import command
 */
@ApiModel(description = "Create import command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-25T12:05:03.973+02:00")
public class CreateImportCommand {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("OcsFileLocation")
  private String ocsFileLocation = null;

  @SerializedName("OcsProjectId")
  private String ocsProjectId = null;

  public CreateImportCommand name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateImportCommand ocsFileLocation(String ocsFileLocation) {
    this.ocsFileLocation = ocsFileLocation;
    return this;
  }

   /**
   * OCS location to OVF file
   * @return ocsFileLocation
  **/
  @ApiModelProperty(required = true, value = "OCS location to OVF file")
  public String getOcsFileLocation() {
    return ocsFileLocation;
  }

  public void setOcsFileLocation(String ocsFileLocation) {
    this.ocsFileLocation = ocsFileLocation;
  }

  public CreateImportCommand ocsProjectId(String ocsProjectId) {
    this.ocsProjectId = ocsProjectId;
    return this;
  }

   /**
   * OCS Project Id
   * @return ocsProjectId
  **/
  @ApiModelProperty(required = true, value = "OCS Project Id")
  public String getOcsProjectId() {
    return ocsProjectId;
  }

  public void setOcsProjectId(String ocsProjectId) {
    this.ocsProjectId = ocsProjectId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateImportCommand createImportCommand = (CreateImportCommand) o;
    return Objects.equals(this.name, createImportCommand.name) &&
        Objects.equals(this.ocsFileLocation, createImportCommand.ocsFileLocation) &&
        Objects.equals(this.ocsProjectId, createImportCommand.ocsProjectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, ocsFileLocation, ocsProjectId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateImportCommand {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ocsFileLocation: ").append(toIndentedString(ocsFileLocation)).append("\n");
    sb.append("    ocsProjectId: ").append(toIndentedString(ocsProjectId)).append("\n");
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

