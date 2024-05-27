package com.eduardordguez.structural.decorator;

import java.math.BigDecimal;

/**
 * The `CoffeeDecorator` abstract class is responsible for adding new behaviors to the wrapped
 * component object.
 */
public abstract class CoffeeDecorator implements Coffee {

  protected Coffee coffeeDecorator;

  public CoffeeDecorator(Coffee coffee) {
    this.coffeeDecorator = coffee;
  }

  @Override
  public String getExtras() {
    return this.coffeeDecorator.getExtras();
  }

  @Override
  public BigDecimal getCost() {
    return this.coffeeDecorator.getCost();
  }

}
