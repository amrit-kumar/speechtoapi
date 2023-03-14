package com.banking.speechapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomerFullDataAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-12T19:57:22.899764400+05:30[Asia/Calcutta]")
public class CustomerFullDataAllOf   {
  @JsonProperty("customerId")
  private Long customerId;

  public CustomerFullDataAllOf customerId(Long customerId) {
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
    CustomerFullDataAllOf customerFullDataAllOf = (CustomerFullDataAllOf) o;
    return Objects.equals(this.customerId, customerFullDataAllOf.customerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerFullDataAllOf {\n");
    
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

