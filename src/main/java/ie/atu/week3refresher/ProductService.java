package ie.atu.week3refresher;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> productList = new ArrayList<>();

    public List<Product> getProduct() {
        return productList;
    }

    public String addProduct(Product product) {
        productList.add(product);
        return "Product added successfully";
    }

    public String updateProduct(Product product) {
        int index = findProductIndexById(product.getId());
        if (index == -1) {
            return "Product not found";
        }
        productList.set(index, product);
        return "Product updated successfully";
    }

    private int findProductIndexById(String id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public String deleteProductById(String id) {
        int index = findProductIndexById(id);
        if (index == -1) {
            return "Product not found";
        }
        productList.remove(index);
        return "Product removed successfully"; // Return a message indicating success
    }
}
