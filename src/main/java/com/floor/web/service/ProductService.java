package com.floor.web.service;

import com.floor.web.entity.Product;
import com.floor.web.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository repository;


    public List<Product> getAllProductByAuthorId(UUID uuid) {
        log.info("get all product by id: {}", uuid);
        return repository.findAllByAuthorId(uuid);
    }

    public Optional<Product> getProductById(UUID uuid) {
        log.info("get product by id: {}", uuid);
        return repository.findById(uuid);
    }

    public Product saveProduct(Product product) {
        log.info("save product:{}", product);
        return repository.save(product);
    }

    public void deleteProductById(UUID uuid) {
        log.info("deleting product:{}", uuid);
        repository.deleteById(uuid);
        log.info("deleted product:{}", uuid);
    }
}
