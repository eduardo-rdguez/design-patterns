package com.eduardordguez.creational.factorymethod;

/**
 * The `concrete product` is the class that implements the `product` interface and is the
 * object that creates the factory method.
 */
public class BudgetBreadKnife implements Knife {

  @Override
  public void sharpen() {
    System.out.println("Sharpening bread knife");
  }

  @Override
  public void polish() {
    System.out.println("Polishing bread knife");
  }

  @Override
  public void pack() {
    System.out.println("Packing bread knife");
  }

}
