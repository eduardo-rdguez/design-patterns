package com.eduardordguez.structural.decorator;

import java.math.BigDecimal;

/**
 * The concrete decorator `ChocolateBarDecorator` adds specific behaviors or responsibilities to
 * the component.
 */
public class ChocolateBarDecorator extends CoffeeDecorator {

  public ChocolateBarDecorator(Coffee coffee) {
    super(coffee);
  }

  @Override
  public String getExtras() {
    return super.getExtras() + " 'Chocolate bar'";
  }

  @Override
  public BigDecimal getCost() {
    return super.getCost().add(new BigDecimal("1.0"));
  }

}
