package com.floor.web.repository;

import com.floor.web.entity.Bid;
import com.floor.web.entity.Client;
import com.floor.web.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.UUID;

@Repository
public interface ClientRepository extends JpaRepository<Client, UUID> {

   List<Client> findAllByAuthorId(UUID id);
}
