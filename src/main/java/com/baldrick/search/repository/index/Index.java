package com.baldrick.search.repository.index;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class Index<T, F> {
  protected final ConcurrentHashMap<T, ArrayList<F>> index;
  
  public Index() {
    this.index = new ConcurrentHashMap<>();
  }
  
  public void add(T key, F value) {
    Optional<ArrayList> values = Optional.ofNullable(this.index.get(key));
    
    if (values.isPresent()) {
      values.get().add(value);
    } else {
      this.index.put(key, new ArrayList<>(Arrays.asList(value)));
    }
  }
  
  public Optional<ArrayList<F>> get(T key) {
    return Optional.ofNullable(this.index.get(key));
  }
}
