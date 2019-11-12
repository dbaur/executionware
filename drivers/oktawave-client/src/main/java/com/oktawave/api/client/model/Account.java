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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Account model representing clients.
 */
@ApiModel(description = "Account model representing clients.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-25T12:05:03.973+02:00")
public class Account {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("Addresses")
  private List<Address> addresses = null;

  @SerializedName("Payment")
  private PaymentDetails payment = null;

  @SerializedName("Company")
  private CompanyDetails company = null;

  @SerializedName("FreemiumEnabled")
  private Boolean freemiumEnabled = null;

  public Account id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Id of account (client)
   * @return id
  **/
  @ApiModelProperty(value = "Id of account (client)")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Account addresses(List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  public Account addAddressesItem(Address addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<Address>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Account addressess
   * @return addresses
  **/
  @ApiModelProperty(value = "Account addressess")
  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

  public Account payment(PaymentDetails payment) {
    this.payment = payment;
    return this;
  }

   /**
   * Payment information
   * @return payment
  **/
  @ApiModelProperty(value = "Payment information")
  public PaymentDetails getPayment() {
    return payment;
  }

  public void setPayment(PaymentDetails payment) {
    this.payment = payment;
  }

  public Account company(CompanyDetails company) {
    this.company = company;
    return this;
  }

   /**
   * Company information for company account
   * @return company
  **/
  @ApiModelProperty(value = "Company information for company account")
  public CompanyDetails getCompany() {
    return company;
  }

  public void setCompany(CompanyDetails company) {
    this.company = company;
  }

  public Account freemiumEnabled(Boolean freemiumEnabled) {
    this.freemiumEnabled = freemiumEnabled;
    return this;
  }

   /**
   * Is Freemium enabled for account
   * @return freemiumEnabled
  **/
  @ApiModelProperty(value = "Is Freemium enabled for account")
  public Boolean isFreemiumEnabled() {
    return freemiumEnabled;
  }

  public void setFreemiumEnabled(Boolean freemiumEnabled) {
    this.freemiumEnabled = freemiumEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.id, account.id) &&
        Objects.equals(this.addresses, account.addresses) &&
        Objects.equals(this.payment, account.payment) &&
        Objects.equals(this.company, account.company) &&
        Objects.equals(this.freemiumEnabled, account.freemiumEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, addresses, payment, company, freemiumEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    freemiumEnabled: ").append(toIndentedString(freemiumEnabled)).append("\n");
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
