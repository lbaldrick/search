package com.baldrick.search.repository.index;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class Index {
  protected final ConcurrentHashMap<String, ArrayList<String>> index;
  
  public Index() {
    this.index = new ConcurrentHashMap<>();
  }
  
  public void add(String key, String value) {
    Optional<ArrayList> values = Optional.ofNullable(this.index.get(key));
    
    if (values.isPresent()) {
      values.get().add(value);
    } else {
      this.index.put(key, new ArrayList<>(Arrays.asList(value)));
    }
  }
  
  public Optional<ArrayList<String>> get(String key) {
    return Optional.ofNullable(this.index.get(key));
  }
}
