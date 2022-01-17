package ax.ha.clouddevelopment.webshopapi.interfaces.v1.webshop.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Representation of a shoppingCart
 */
@ApiModel(description = "Representation of a shoppingCart")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-17T01:38:18.470939900+02:00[Europe/Kiev]")

public class ShoppingCart   {
  @JsonProperty("amount")
  private Integer amount;

  @JsonProperty("productID")
  private Integer productID;

  public ShoppingCart amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @ApiModelProperty(value = "")


  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public ShoppingCart productID(Integer productID) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShoppingCart shoppingCart = (ShoppingCart) o;
    return Objects.equals(this.amount, shoppingCart.amount) &&
        Objects.equals(this.productID, shoppingCart.productID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, productID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShoppingCart {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    productID: ").append(toIndentedString(productID)).append("\n");
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

