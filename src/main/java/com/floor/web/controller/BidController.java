package com.floor.web.controller;

import com.floor.web.entity.Bid;
import com.floor.web.service.BidService;
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
@RequestMapping("/bid")
public class BidController {

    private final BidService service;

    @GetMapping("/{uuid}")
    public List<Bid> getAllBidByAuthorId(@PathVariable UUID uuid) {
        return service.getAllBidByAuthorId(uuid);
    }

    @GetMapping("/{authorId}/{uuid}")
    public Bid getProductById(@PathVariable UUID uuid) {
        return service.getBidById(uuid);
    }

    @PutMapping
    private Bid saveBid(@RequestBody Bid bid) {
        return service.saveBid(bid);
    }

    @DeleteMapping
    private void deleteBid(UUID uuid) {
        service.deleteBid(uuid);
    }
}
