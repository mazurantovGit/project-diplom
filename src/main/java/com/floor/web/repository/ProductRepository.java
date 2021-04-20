package com.floor.web.repository;

import com.floor.web.entity.Product;
import java.util.UUID;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface ProductRepository extends ReactiveCrudRepository<Product, UUID> {

    Flux<Product> getAllByAuthorId(UUID id);
}
