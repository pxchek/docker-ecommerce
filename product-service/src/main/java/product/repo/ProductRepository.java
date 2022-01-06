package product.repo;

import org.springframework.data.repository.CrudRepository;
import product.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
