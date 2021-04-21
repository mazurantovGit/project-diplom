package com.floor.web.repository;

import com.floor.web.entity.Product;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {

   List<Product> getAllByAuthorId(UUID id);
}
