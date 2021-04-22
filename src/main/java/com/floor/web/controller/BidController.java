package com.floor.web.controller;

import com.floor.web.entity.Bid;
import com.floor.web.entity.Product;
import com.floor.web.repository.BidRepository;
import com.floor.web.service.BidService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bid")
public class BidController {

    private final BidService service;

    @GetMapping("/{uuid}")
    public List<Bid> getAllBidByAuthorId(@PathVariable UUID uuid){
        return service.getAllBidByAuthorId(uuid);
    }

    @GetMapping("/{authorId}/{uuid}")
    public Bid getProductById(@PathVariable UUID uuid){
        return service.getBidById(uuid);
    }

    @PutMapping
    private Bid saveBid(@RequestBody Bid bid){
        return service.saveBid(bid);
    }

    @DeleteMapping
    private void deleteBid(UUID uuid){
        service.deleteBid(uuid);
    }
}
