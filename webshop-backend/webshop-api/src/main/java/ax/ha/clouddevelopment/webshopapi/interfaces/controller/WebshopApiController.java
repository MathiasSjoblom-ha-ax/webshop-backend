
package ax.ha.clouddevelopment.webshopapi.interfaces.controller;

import ax.ha.clouddevelopment.webshopapi.domain.service.NoteService;
import ax.ha.clouddevelopment.webshopapi.domain.service.WebshopService;
import ax.ha.clouddevelopment.webshopapi.interfaces.v1.webshop.ProductApi;
import ax.ha.clouddevelopment.webshopapi.interfaces.v1.webshop.ProductsApi;
import ax.ha.clouddevelopment.webshopapi.interfaces.v1.webshop.ShoppingCartApi;
import ax.ha.clouddevelopment.webshopapi.interfaces.v1.webshop.model.Product;
import ax.ha.clouddevelopment.webshopapi.interfaces.v1.webshop.model.ProductEntity;
import ax.ha.clouddevelopment.webshopapi.interfaces.v1.webshop.model.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * Controller for the webshop API
 *
 * @author Dag Karlsson <Dag.Karlsson@crosskey.fi>
 */
@RestController
public class WebshopApiController implements ProductApi, ShoppingCartApi {

    private final NoteService noteService;

    private final WebshopService webshopService;

    @Autowired
    public WebshopApiController(final NoteService noteService,
                                final WebshopService webshopService) {
        this.noteService = noteService;
        this.webshopService = webshopService;
    }

    @Override
    public ResponseEntity<Product> createProduct(Product product) {
        return null;
    }

    @Override
    public ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.ok(webshopService.getProducts().stream()
                .map(product -> new Product()
                        .ID(product.getId().toString())
                        .name(product.getName())
                        .description(product.getDescription())
                        .image(product.getImage())
                        .price(product.getPrice()))
                .collect(Collectors.toList()));
    }

    @Override
    public ResponseEntity<ShoppingCart> createShoppingCart(ShoppingCart shoppingCart) {
        return null;
    }

    @Override
    public ResponseEntity<List<ShoppingCart>> getShoppingCart() {
        return null;
    }
}