package ax.ha.clouddevelopment.webshopapi.interfaces.v1.webshop.model;

import java.util.Objects;
import ax.ha.clouddevelopment.webshopapi.interfaces.v1.webshop.model.ShoppingCart;
import ax.ha.clouddevelopment.webshopapi.interfaces.v1.webshop.model.ShoppingCartEntityAnyOf;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ShoppingCartEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-17T01:38:18.470939900+02:00[Europe/Kiev]")

public class ShoppingCartEntity   {
  @JsonProperty("amount")
  private String amount;

  @JsonProperty("productID")
  private Integer productID;

  @JsonProperty("id")
  private UUID id;

  public ShoppingCartEntity amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public ShoppingCartEntity productID(Integer productID) {
    this.productID = productID;
    return this;
  }

  /**
   * Get productID
   * @return productID
  */
  @ApiModelProperty(value = "")


  public Integer getProductID() {
    return productID;
  }

  public void setProductID(Integer productID) {
    this.productID = productID;
  }

  public ShoppingCartEntity id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShoppingCartEntity shoppingCartEntity = (ShoppingCartEntity) o;
    return Objects.equals(this.amount, shoppingCartEntity.amount) &&
        Objects.equals(this.productID, shoppingCartEntity.productID) &&
        Objects.equals(this.id, shoppingCartEntity.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, productID, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShoppingCartEntity {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    productID: ").append(toIndentedString(productID)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

