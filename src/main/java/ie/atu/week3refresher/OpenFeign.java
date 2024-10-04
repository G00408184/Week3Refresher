package ie.atu.week3refresher;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@FeignClient(name = "Coms", url = "http://localhost:8081/inventory")
public interface OpenFeign {
    @GetMapping("/GET")
    List<Product> getProduct();
    @PostMapping("/add")
    String addProduct(Product product);
}
