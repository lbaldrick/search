package com.baldrick.search.service;

import com.baldrick.search.model.ItemAuctionDetails;
import com.baldrick.search.repository.AuctionItemRepository;
import com.baldrick.search.repository.index.AuctionItemSearchIndex;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuctionItemSearchService {
 
  @Autowired
  AuctionItemRepository auctionItemRepository;
  
  @Autowired
  private AuctionItemSearchIndex auctionItemSearchIndex;
  
  public ItemAuctionDetails getItemById(String id) {
    return auctionItemRepository.findById(id);
  }
  
  public List<ItemAuctionDetails> getAllItems() {
    return auctionItemRepository.findAll();
  }
  
  public List<ItemAuctionDetails> query(String query) {
    Optional<ArrayList> resultIds = auctionItemSearchIndex.get(query);
    
    if (resultIds.isPresent()) {
      return (List<ItemAuctionDetails>) auctionItemRepository.findAll(resultIds.get());
    }
    
    return new ArrayList<>();
  }
  
  public ItemAuctionDetails createItem(ItemAuctionDetails item) {
    return auctionItemRepository.insert(item);
  }
}
