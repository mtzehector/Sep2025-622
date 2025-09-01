package mx.att.digital.productorderingmanagement.interfaces.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.net.URI;
import java.util.Objects;

/**
 * It&#39;s a Quote item that has been executed previously.
 */

@Schema(name = "QuoteItemRef", description = "It's a Quote item that has been executed previously.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class QuoteItemRef implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;

  private String href;

  private String name;

  private String quoteHref;

  private String quoteId;

  private String quoteName;

  private String atBaseType;

  private URI atSchemaLocation;

  private String atType;

  private String atReferredType;

  public QuoteItemRef() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public QuoteItemRef(String id, String quoteId) {
    this.id = id;
    this.quoteId = quoteId;
  }

  public QuoteItemRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Id of an item of a quote
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "Id of an item of a quote", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public QuoteItemRef href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference of the related entity.
   * @return href
   */
  
  @Schema(name = "href", description = "Reference of the related entity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public QuoteItemRef name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the related entity.
   * @return name
   */
  
  @Schema(name = "name", description = "Name of the related entity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public QuoteItemRef quoteHref(String quoteHref) {
    this.quoteHref = quoteHref;
    return this;
  }

  /**
   * Reference of the related entity.
   * @return quoteHref
   */
  
  @Schema(name = "quoteHref", description = "Reference of the related entity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quoteHref")
  public String getQuoteHref() {
    return quoteHref;
  }

  public void setQuoteHref(String quoteHref) {
    this.quoteHref = quoteHref;
  }

  public QuoteItemRef quoteId(String quoteId) {
    this.quoteId = quoteId;
    return this;
  }

  /**
   * Unique identifier of a related entity.
   * @return quoteId
   */
  @NotNull 
  @Schema(name = "quoteId", description = "Unique identifier of a related entity.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("quoteId")
  public String getQuoteId() {
    return quoteId;
  }

  public void setQuoteId(String quoteId) {
    this.quoteId = quoteId;
  }

  public QuoteItemRef quoteName(String quoteName) {
    this.quoteName = quoteName;
    return this;
  }

  /**
   * Name of the related entity.
   * @return quoteName
   */
  
  @Schema(name = "quoteName", description = "Name of the related entity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quoteName")
  public String getQuoteName() {
    return quoteName;
  }

  public void setQuoteName(String quoteName) {
    this.quoteName = quoteName;
  }

  public QuoteItemRef atBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
   */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@baseType")
  public String getAtBaseType() {
    return atBaseType;
  }

  public void setAtBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
  }

  public QuoteItemRef atSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
   */
  @Valid 
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@schemaLocation")
  public URI getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public QuoteItemRef atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class entity name
   * @return atType
   */
  
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class entity name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public QuoteItemRef atReferredType(String atReferredType) {
    this.atReferredType = atReferredType;
    return this;
  }

  /**
   * The actual type of the target instance when needed for disambiguation.
   * @return atReferredType
   */
  
  @Schema(name = "@referredType", description = "The actual type of the target instance when needed for disambiguation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@referredType")
  public String getAtReferredType() {
    return atReferredType;
  }

  public void setAtReferredType(String atReferredType) {
    this.atReferredType = atReferredType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteItemRef quoteItemRef = (QuoteItemRef) o;
    return Objects.equals(this.id, quoteItemRef.id) &&
        Objects.equals(this.href, quoteItemRef.href) &&
        Objects.equals(this.name, quoteItemRef.name) &&
        Objects.equals(this.quoteHref, quoteItemRef.quoteHref) &&
        Objects.equals(this.quoteId, quoteItemRef.quoteId) &&
        Objects.equals(this.quoteName, quoteItemRef.quoteName) &&
        Objects.equals(this.atBaseType, quoteItemRef.atBaseType) &&
        Objects.equals(this.atSchemaLocation, quoteItemRef.atSchemaLocation) &&
        Objects.equals(this.atType, quoteItemRef.atType) &&
        Objects.equals(this.atReferredType, quoteItemRef.atReferredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, quoteHref, quoteId, quoteName, atBaseType, atSchemaLocation, atType, atReferredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteItemRef {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quoteHref: ").append(toIndentedString(quoteHref)).append("\n");
    sb.append("    quoteId: ").append(toIndentedString(quoteId)).append("\n");
    sb.append("    quoteName: ").append(toIndentedString(quoteName)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atReferredType: ").append(toIndentedString(atReferredType)).append("\n");
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

