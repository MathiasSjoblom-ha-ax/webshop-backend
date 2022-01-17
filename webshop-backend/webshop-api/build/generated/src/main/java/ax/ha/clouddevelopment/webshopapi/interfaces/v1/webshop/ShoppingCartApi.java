/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package ax.ha.clouddevelopment.webshopapi.interfaces.v1.webshop;

import ax.ha.clouddevelopment.webshopapi.interfaces.v1.webshop.model.ShoppingCart;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-17T01:38:18.470939900+02:00[Europe/Kiev]")

@Validated
@Api(value = "ShoppingCart", description = "the ShoppingCart API")
public interface ShoppingCartApi {

    /**
     * POST /ShoppingCart : Create a shoppingCart
     *
     * @param shoppingCart ShoppingCart to create (required)
     * @return ShoppingCarts response (status code 200)
     */
    @ApiOperation(value = "Create a shoppingCart", nickname = "createShoppingCart", notes = "", response = ShoppingCart.class, tags={ "ShoppingCarts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ShoppingCarts response", response = ShoppingCart.class) })
    @RequestMapping(value = "/ShoppingCart",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<ShoppingCart> createShoppingCart(@ApiParam(value = "ShoppingCart to create" ,required=true )  @Valid @RequestBody ShoppingCart shoppingCart);


    /**
     * GET /ShoppingCart : Retrieve all shoppingCarts
     *
     * @return ShoppingCarts response (status code 200)
     */
    @ApiOperation(value = "Retrieve all shoppingCarts", nickname = "getShoppingCart", notes = "", response = ShoppingCart.class, responseContainer = "List", tags={ "ShoppingCarts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ShoppingCarts response", response = ShoppingCart.class, responseContainer = "List") })
    @RequestMapping(value = "/ShoppingCart",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ShoppingCart>> getShoppingCart();

}
