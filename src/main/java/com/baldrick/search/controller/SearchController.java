package com.baldrick.search.controller;

import com.baldrick.search.model.ItemAuctionDetails;
import com.baldrick.search.service.AuctionItemSearchService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/search/auctionItems/")
public class SearchController {
  
  @Autowired
  private AuctionItemSearchService auctionItemSearchService;

  @RequestMapping(value = "/id={id}", method = RequestMethod.GET)
  public ItemAuctionDetails getItemById(@PathVariable String id) {
    return auctionItemSearchService.getItemById(id);
  }
  
  @RequestMapping(value = "/query={query}", method = RequestMethod.GET)
  public List<ItemAuctionDetails> search(@PathVariable String query) {
    return auctionItemSearchService.query(query);
  }
  
  @RequestMapping(value = "/createItem", method = RequestMethod.POST)
  public ItemAuctionDetails search(@RequestBody ItemAuctionDetails item) {
      return auctionItemSearchService.createItem(item);
  }
}
