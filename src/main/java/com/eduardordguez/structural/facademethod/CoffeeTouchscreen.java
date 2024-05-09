package com.eduardordguez.structural.facademethod;

/**
 * `Facade Method` provides a unified interface to a set of interfaces in a subsystem. It
 * simplifies the usage of the subsystem by providing a higher-level interface. Clients interact
 * with the facade rather than directly with the subsystem components.
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
