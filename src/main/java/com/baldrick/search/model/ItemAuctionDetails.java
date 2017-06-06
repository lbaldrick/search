package com.baldrick.search.model;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ItemAuctionDetails")
public class ItemAuctionDetails {
  @Id
  private String id;
  private ItemDetails itemDetails;
  private double currentBid;
  private long expiryTimestamp;
  private double buyNowPrice;
  private List<Bid> history;
  private String sellerUsername;
  
  public ItemAuctionDetails() {};

  public ItemAuctionDetails(String id, ItemDetails itemDetails, double currentBid, long expiryTimestamp, double buyNowPrice, List<Bid> history, String sellerUsername) {
    this.id = id;
    this.itemDetails = itemDetails;
    this.currentBid = currentBid;
    this.expiryTimestamp = expiryTimestamp;
    this.buyNowPrice = buyNowPrice;
    this.history = history;
    this.sellerUsername = sellerUsername;
  }

  public String getId() {
    return id;
  }

  public ItemDetails getItemDetails() {
    return itemDetails;
  }

  public double getCurrentBid() {
    return currentBid;
  }

  public long getExpiryTimestamp() {
    return expiryTimestamp;
  }

  public double getBuyNowPrice() {
    return buyNowPrice;
  }

  public List<Bid> getHistory() {
    return history;
  }

  public String getSellerUsername() {
    return sellerUsername;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setItemDetails(ItemDetails itemDetails) {
    this.itemDetails = itemDetails;
  }

  public void setCurrentBid(double currentBid) {
    this.currentBid = currentBid;
  }

  public void setExpiryTimestamp(long expiryTimestamp) {
    this.expiryTimestamp = expiryTimestamp;
  }

  public void setBuyNowPrice(double buyNowPrice) {
    this.buyNowPrice = buyNowPrice;
  }

  public void setHistory(List<Bid> history) {
    this.history = history;
  }

  public void setSeller(String sellerUsername) {
    this.sellerUsername = sellerUsername;
  } 
}
