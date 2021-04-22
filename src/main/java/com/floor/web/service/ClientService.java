package com.floor.web.service;

import com.floor.web.entity.Client;
import com.floor.web.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class ClientService {

    private final ClientRepository repository;

    public List<Client> getAllClientByAuthorId(UUID uuid){
        log.info("get all client by AuthorId: {}", uuid);
        return repository.findAllByAuthorId(uuid);
    }

    public Client getClientById(UUID uuid){
        log.info("get client By id: {}", uuid);
        return repository.findById(uuid).orElseThrow(
                ()-> new IllegalArgumentException("bid with id:" + uuid + "does not exist"));
    }

    public Client saveClient(Client Client){
        log.info("save client: {}", Client);
        return repository.save(Client);
    }

    public void deleteById(UUID uuid){
        log.info("deleting client by uuid: {}",uuid);
        repository.deleteById(uuid);
        log.info("deleted client by uuid: {}",uuid);
    }
}
