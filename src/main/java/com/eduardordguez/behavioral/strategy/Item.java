package com.eduardordguez.behavioral.strategy;

import java.math.BigDecimal;

public class Item {

  private String upc;
  private BigDecimal price;

  public Item(String upc, BigDecimal price) {
    this.upc = upc;
    this.price = price;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public String getUpc() {
    return upc;
  }

  public void setUpc(String upc) {
    this.upc = upc;
  }

}
