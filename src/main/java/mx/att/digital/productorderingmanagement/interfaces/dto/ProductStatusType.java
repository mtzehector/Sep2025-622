package mx.att.digital.productorderingmanagement.interfaces.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.annotation.Generated;

/**
 * Possible values for the status of the product
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public enum ProductStatusType {
  
  CREATED("created"),
  
  PENDING_ACTIVE("pendingActive"),
  
  CANCELLED("cancelled"),
  
  ACTIVE("active"),
  
  PENDING_TERMINATE("pendingTerminate"),
  
  TERMINATED("terminated"),
  
  SUSPENDED("suspended"),
  
  ABORTED_("aborted ");

  private String value;

  ProductStatusType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProductStatusType fromValue(String value) {
    for (ProductStatusType b : ProductStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

