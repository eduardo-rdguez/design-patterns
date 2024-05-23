package com.eduardordguez.structural.adapter;

/**
 * The `CoffeeTouchscreen` adapter class implements the target interface and internally uses an
 * instance of the adaptee to make it compatible with the target interface.
 */
public class CoffeeTouchscreen implements CoffeeMachine {

  private final OldCoffeeMachine oldCoffeeMachine;

  public CoffeeTouchscreen(OldCoffeeMachine oldCoffeeMachine) {
    this.oldCoffeeMachine = oldCoffeeMachine;
  }

  @Override
  public void chooseFirstSelection() {
    oldCoffeeMachine.selectA();
  }

  @Override
  public void chooseSecondSelection() {
    oldCoffeeMachine.selectB();
  }

}
