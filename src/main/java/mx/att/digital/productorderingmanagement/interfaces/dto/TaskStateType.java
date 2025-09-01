package mx.att.digital.productorderingmanagement.interfaces.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.annotation.Generated;

/**
 * Possible values for the state of a task
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public enum TaskStateType {
  
  ACKNOWLEDGED("acknowledged"),
  
  TERMINATED_WITH_ERROR("terminatedWithError"),
  
  IN_PROGRESS("inProgress"),
  
  DONE("done");

  private String value;

  TaskStateType(String value) {
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
  public static TaskStateType fromValue(String value) {
    for (TaskStateType b : TaskStateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

