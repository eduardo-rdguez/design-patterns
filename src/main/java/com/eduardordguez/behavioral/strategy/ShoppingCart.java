package com.eduardordguez.behavioral.strategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * The `ShoppingCart` context holds a reference to a strategy object and delegates the task to it.
 */
public class ShoppingCart {

  private final List<Item> items;

  public ShoppingCart() {
    this.items = new ArrayList<>();
  }

  public void addItem(Item item) {
    this.items.add(item);
  }

  public void removeItem(Item item) {
    this.items.remove(item);
  }

  public BigDecimal calculateTotal() {
    return items.stream()
        .map(Item::getPrice)
        .reduce(BigDecimal.ZERO, BigDecimal::add);
  }

  public void pay(Payment payment) {
    payment.pay(calculateTotal());
  }

}

