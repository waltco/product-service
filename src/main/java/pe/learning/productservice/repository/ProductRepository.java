package pe.learning.productservice.repository;

import org.springframework.data.repository.CrudRepository;
import pe.learning.productservice.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
