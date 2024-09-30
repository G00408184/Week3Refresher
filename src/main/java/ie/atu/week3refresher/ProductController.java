package ie.atu.week3refresher;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/GET")
    public List<Product> getProduct() {
        return productService.getProduct();
    }

    @PostMapping("/add")
    public String addProduct(@Valid @RequestBody Product product) {
        return productService.addProduct(product);
    }

    @PutMapping("/edit")
    public String editProduct(@Valid @RequestBody Product product) {
        return productService.updateProduct(product);
    }
    @DeleteMapping("/remove/{id}")
    public String removeProduct(@PathVariable String id) {
        return productService.deleteProductById(id);
    }

}
