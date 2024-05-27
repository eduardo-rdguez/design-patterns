package com.eduardordguez.structural.decorator;

import java.math.BigDecimal;

/**
 * The `SimpleCoffee` component is the object to which we want to add new behaviors or
 * responsibilities.
 */
public class SimpleCoffee implements Coffee {

  @Override
  public String getExtras() {
    return "";
  }

  @Override
  public BigDecimal getCost() {
    return new BigDecimal("5.0");
  }

}
