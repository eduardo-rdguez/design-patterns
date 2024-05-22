package com.eduardordguez.creational.factorymethod;

/**
 * The `concrete creator` is the subclass of the `creator` that implements the factory method to
 * create specific types of objects.
 */
public class BudgetKnifeStore extends KnifeStore {

  /**
   * Method that returns the `concrete product`.
   *
   * @param knifeType {@link KnifeType}
   * @return {@link Knife} type object.
   */
  @Override
  public Knife createKnife(KnifeType knifeType) {
    return switch (knifeType) {
      case STEAK -> new BudgetSteakKnife();
      case BREAD -> new BudgetBreadKnife();
      default -> new BudgetChefKnife();
    };
  }

}
