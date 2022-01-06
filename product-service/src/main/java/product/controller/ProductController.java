package product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import product.model.Product;
import product.repo.ProductRepository;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products/{id}")
    public Product getProducts(@PathVariable int id) {
        return productRepository.findById(id).get();
    }
}
