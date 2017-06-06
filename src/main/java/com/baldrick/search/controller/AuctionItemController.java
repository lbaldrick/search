package com.baldrick.search.controller;

import com.baldrick.search.model.ItemAuctionDetails;
import com.baldrick.search.service.AuctionItemSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/search/auctionItems/")
public class AuctionItemController {
  
  @Autowired
  AuctionItemSearchService auctionItemSearchService;

  @RequestMapping(value = "/id={id}")
  public ItemAuctionDetails getItemById(@PathVariable String id) {
    return auctionItemSearchService.getItemById(id);
  }
}
