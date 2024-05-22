package com.eduardordguez.creational.factorymethod;

public class FactoryMethod {

  public static void main(String[] args) {
    KnifeStore budgetKnifeStore = new BudgetKnifeStore();

    budgetKnifeStore.orderKnife(KnifeType.STEAK);
    budgetKnifeStore.orderKnife(KnifeType.BREAD);
    budgetKnifeStore.orderKnife(KnifeType.CHEF);
  }

}
