package pe.learning.productservice.controller;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pe.learning.productservice.entity.Product;
import pe.learning.productservice.service.ProductService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    final ProductService productService;

    @GetMapping("/products")
    public List<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping("/product/{id}")
    public Product findById(@PathVariable Long id){
        return productService.findById(id);
    }

}
