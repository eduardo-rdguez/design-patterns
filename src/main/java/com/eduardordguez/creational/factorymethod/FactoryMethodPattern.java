package com.eduardordguez.creational.factorymethod;

/**
 * `Factory Method` is a creational design pattern that provides an interface for creating
 * objects in a superclass, but allows subclasses to alter the type of objects that will be created.
 */
public class FactoryMethodPattern {

  public static void main(String[] args) {
    KnifeStore budgetKnifeStore = new BudgetKnifeStore();

    budgetKnifeStore.orderKnife(KnifeType.STEAK);
    budgetKnifeStore.orderKnife(KnifeType.BREAD);
    budgetKnifeStore.orderKnife(KnifeType.CHEF);
  }

}
