package com.baldrick.search.repository;

import com.baldrick.search.model.ItemAuctionDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuctionItemRepository extends MongoRepository<ItemAuctionDetails, String> {

    public ItemAuctionDetails findById(String id);

}
