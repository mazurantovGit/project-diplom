package com.floor.web.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.floor.web.entity.Product;
import com.floor.web.service.ProductService;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private final ProductService service;


    @GetMapping
    @JsonView
    public List<Product> list() {
        return service.getAll();
    }

    @GetMapping("/{uuid}")
    public List<Product> getAllProductByAuthor(@PathVariable UUID uuid) {
        return service.getAllProductByAuthorId(uuid);
    }

    @GetMapping("/{authorId}/{uuid}")
    public Product getProductById(@PathVariable UUID authorId, @PathVariable UUID uuid) {
        return service.getProductById(uuid);
    }

    @PutMapping
    public Product saveProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @DeleteMapping
    public void deleteProduct(UUID uuid) {
        service.deleteProductById(uuid);
    }
}
