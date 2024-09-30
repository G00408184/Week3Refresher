package ie.atu.week3refresher;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@FeignClient(name = "Coms", url = "http://localhost:8081")
public interface OpenFeign {
    @GetMapping("/GET")
    List<Product> getProduct();

    String addProduct(Product product);
}
