package com.baldrick.search.model;

import java.util.List;

public class ItemSpecifics {
  
  private String condition;
  private String model;
  private List<String> features;
  private String purchasedDate;
  private String location;
  private String sellerNotes;

  public ItemSpecifics() {};
          
  public ItemSpecifics(String condition, String model, List<String> features, String purchasedDate, String location, String sellerNotes) {
    this.condition = condition;
    this.model = model;
    this.features = features;
    this.purchasedDate = purchasedDate;
    this.location = location;
    this.sellerNotes = sellerNotes;
  }

  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public List<String> getFeatures() {
    return features;
  }

  public void setFeatures(List<String> features) {
    this.features = features;
  }

  public String getPurchasedDate() {
    return purchasedDate;
  }

  public void setPurchasedDate(String purchasedDate) {
    this.purchasedDate = purchasedDate;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getSellerNotes() {
    return sellerNotes;
  }

  public void setSellerNotes(String sellerNotes) {
    this.sellerNotes = sellerNotes;
  }
}
