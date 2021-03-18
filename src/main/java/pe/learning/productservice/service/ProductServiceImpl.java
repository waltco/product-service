package pe.learning.productservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.learning.productservice.entity.Product;
import pe.learning.productservice.repository.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

    final ProductRepository productRepository;

    @Value("${server.port}")
    private String port;

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        log.info(port);
        return productRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Product findById(Long id) {
        log.info(port);
        return productRepository.findById(id).orElse(new Product());
    }
}
