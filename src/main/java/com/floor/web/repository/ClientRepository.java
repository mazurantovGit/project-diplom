package com.floor.web.repository;

import com.floor.web.entity.Client;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, UUID> {

    List<Client> findAllByAuthorId(UUID id);
}
