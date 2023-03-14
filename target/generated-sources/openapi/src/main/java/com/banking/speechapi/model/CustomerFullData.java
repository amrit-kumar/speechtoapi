package com.banking.speechapi.model;

import java.util.Objects;
import com.banking.speechapi.model.Customer;
import com.banking.speechapi.model.CustomerFullDataAllOf;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Full data of the customer.
 */
@ApiModel(description = "Full data of the customer.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-12T19:57:22.899764400+05:30[Asia/Calcutta]")
public class CustomerFullData   {
  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("customerId")
  private Long customerId;

  public CustomerFullData firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of the customer
   * @return firstName
  */
  @ApiModelProperty(value = "First name of the customer")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CustomerFullData lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of the customer
   * @return lastName
  */
  @ApiModelProperty(value = "Last name of the customer")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CustomerFullData customerId(Long customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * The ID of the customer
   * @return customerId
  */
  @ApiModelProperty(value = "The ID of the customer")


  public Long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerFullData customerFullData = (CustomerFullData) o;
    return Objects.equals(this.firstName, customerFullData.firstName) &&
        Objects.equals(this.lastName, customerFullData.lastName) &&
        Objects.equals(this.customerId, customerFullData.customerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, customerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerFullData {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

