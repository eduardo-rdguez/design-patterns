package com.eduardordguez.creational.factorymethod;

/**
 * The `concrete creator` is the subclass of the `creator` that implements the factory method to
 * create specific types of objects.
 */
public class BudgetKnifeStore extends KnifeStore {

  /**
   * Method that returns the `concrete product`.
   *
   * @param knifeType {@link String}
   * @return {@link Knife} type object.
   */
  @Override
  public Knife createKnife(String knifeType) {
    return switch (knifeType) {
      case "Steak" -> new BudgetSteakKnife();
      case "Bread" -> new BudgetBreadKnife();
      default -> new BudgetChefKnife();
    };
  }

}
