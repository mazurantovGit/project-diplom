package com.floor.web.service;

import com.floor.web.entity.Bid;
import com.floor.web.repository.BidRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class BidService {

    private final BidRepository repository;

    public List<Bid> getAllBidByAuthorId(UUID uuid) {
        log.info("get all bid by id: {}", uuid);
        return repository.findAllByAuthorId(uuid);
    }

    public Bid getBidById(UUID uuid){
        log.info("get bid by id: {}", uuid);
        return repository.findById(uuid).orElseThrow(
                ()-> new IllegalArgumentException("bid with id:" + uuid + "does not exist"));
    }

    public Bid saveBid(Bid bid){
        log.info("save bid: {}", bid);
        return repository.save(bid);
    }

    public void deleteBid(UUID uuid){
        log.info("deleting bid by uuid: {}", uuid);
        repository.deleteById(uuid);
        log.info("deleted bid by uuid: {}", uuid);
    }



}
