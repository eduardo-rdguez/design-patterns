package com.eduardordguez.creational.factorymethod;

/**
 * The `concrete product` is the class that implements the `product` interface and is the
 * object that creates the factory method.
 */
public class BudgetChefKnife implements Knife {

  @Override
  public void sharpen() {
    System.out.println("Sharpening chef knife");
  }

  @Override
  public void polish() {
    System.out.println("Polishing chef knife");
  }

  @Override
  public void pack() {
    System.out.println("Packing chef knife");
  }

}
