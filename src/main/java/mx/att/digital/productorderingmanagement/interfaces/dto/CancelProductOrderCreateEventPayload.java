package mx.att.digital.productorderingmanagement.interfaces.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.io.Serializable;
import java.util.Objects;

/**
 * The event data structure
 */

@Schema(name = "CancelProductOrderCreateEventPayload", description = "The event data structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class CancelProductOrderCreateEventPayload implements Serializable {

  private static final long serialVersionUID = 1L;

  private CancelProductOrder cancelProductOrder;

  public CancelProductOrderCreateEventPayload cancelProductOrder(CancelProductOrder cancelProductOrder) {
    this.cancelProductOrder = cancelProductOrder;
    return this;
  }

  /**
   * Get cancelProductOrder
   * @return cancelProductOrder
   */
  @Valid 
  @Schema(name = "cancelProductOrder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cancelProductOrder")
  public CancelProductOrder getCancelProductOrder() {
    return cancelProductOrder;
  }

  public void setCancelProductOrder(CancelProductOrder cancelProductOrder) {
    this.cancelProductOrder = cancelProductOrder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelProductOrderCreateEventPayload cancelProductOrderCreateEventPayload = (CancelProductOrderCreateEventPayload) o;
    return Objects.equals(this.cancelProductOrder, cancelProductOrderCreateEventPayload.cancelProductOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelProductOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelProductOrderCreateEventPayload {\n");
    sb.append("    cancelProductOrder: ").append(toIndentedString(cancelProductOrder)).append("\n");
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

