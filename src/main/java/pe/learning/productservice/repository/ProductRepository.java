package pe.learning.productservice.repository;

import org.springframework.data.repository.CrudRepository;
import pe.learning.productservice.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findAll();
    Optional<Product> findById(Long id);
}
