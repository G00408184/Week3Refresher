package ie.atu.week3refresher;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")

@AllArgsConstructor
public class ProductController {

      private OpenFeign caller;

      private ProductService productService;

    @GetMapping("/GET")
    public List<Product> getProduct() {
      return caller.getProduct();    }

    @PostMapping("/add")
    public String addProduct(@Valid @RequestBody Product product) {
        return caller.addProduct(product);
    }

    @PutMapping("/edit")
    public String editProduct(@Valid @RequestBody Product product) {
        return productService.updateProduct(product);
    }
    @DeleteMapping("/remove/{id}")
    public String removeProduct(@PathVariable String id) { return productService.deleteProductById(id);}

}
