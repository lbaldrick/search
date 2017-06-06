package com.baldrick.search.model;

public class Bid {
  private Long timestamp;
  private String username;
  private double bid;
  
  public Bid() {};

  public Bid(String username, Long timestamp, double bid) {
    this.timestamp = timestamp;
    this.username = username;
    this.bid = bid;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public double getBid() {
    return bid;
  }

  public void setBid(double bid) {
    this.bid = bid;
  }
}
