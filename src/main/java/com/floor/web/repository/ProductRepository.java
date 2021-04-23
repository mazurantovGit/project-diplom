package com.floor.web.repository;

import com.floor.web.entity.Product;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, UUID> {

    List<Product> findAllByAuthorId(UUID id);
}
