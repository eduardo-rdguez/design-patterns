package com.eduardordguez.structural.decorator;

import java.math.BigDecimal;

/**
 * The concrete decorator `MilkDecorator` adds specific behaviors or responsibilities to the
 * component.
 */
public class MilkDecorator extends CoffeeDecorator {

  public MilkDecorator(Coffee coffee) {
    super(coffee);
  }

  @Override
  public String getExtras() {
    return super.getExtras() + " 'Milk'";
  }

  @Override
  public BigDecimal getCost() {
    return super.getCost().add(new BigDecimal("1.5"));
  }

}
