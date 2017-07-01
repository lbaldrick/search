package com.baldrick.search;

import com.baldrick.search.repository.index.AuctionItemSearchIndex;
import com.baldrick.search.service.AuctionItemSearchService;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@SpringBootApplication
public class Application {
  
    @Autowired
    private AuctionItemSearchService auctionItemSearchService;
    
    @Autowired
    private AuctionItemSearchIndex auctionItemSearchIndex;
 
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
   
    @PostConstruct
    public void onStartUp() {
      auctionItemSearchIndex.createIndex(auctionItemSearchService.getAllItems());
    } 
}