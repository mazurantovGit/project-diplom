package com.floor.web.controller;

import com.floor.web.entity.Client;
import com.floor.web.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/client")
public class ClientController {

    private final ClientService service;

    @GetMapping("/{uuid}")
    public List<Client> getAllClientByAuthorId(@PathVariable UUID uuid){
        return service.getAllClientByAuthorId(uuid);
    }

    @GetMapping("/{authorId}/{uuid}")
    public Client getClientById(@PathVariable UUID authorId, @PathVariable UUID uuid){
        return service.getClientById(uuid);
    }

    @PutMapping
    public Client saveClient(@RequestBody Client client){
        return service.saveClient(client);
    }

    @DeleteMapping
    public void deleteClientById(UUID uuid){
        service.deleteById(uuid);
    }
}
