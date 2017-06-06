package com.baldrick.search.service;

import com.baldrick.search.model.ItemAuctionDetails;
import com.baldrick.search.repository.AuctionItemRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class AuctionItemSearchService {
 
  @Autowired
  AuctionItemRepository auctionItemRepository;
  
  public ItemAuctionDetails getItemById(@PathVariable String id) {
    return auctionItemRepository.findById(id);
  }
  
  public List<ItemAuctionDetails> getAllItems() {
    return auctionItemRepository.findAll();
  }
}
