package pe.learning.productservice.service;

import pe.learning.productservice.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product findById(Long id) ;
}
