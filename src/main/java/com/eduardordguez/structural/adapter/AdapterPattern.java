package com.eduardordguez.structural.adapter;

/**
 * `Adapter` is a structural design pattern that allows objects with incompatible
 * interfaces to collaborate.
 */
public class AdapterPattern {

  public static void main(String[] args) {
    OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine();
    CoffeeTouchscreen coffeeTouchscreen = new CoffeeTouchscreen(oldCoffeeMachine);

    coffeeTouchscreen.chooseFirstSelection();
    coffeeTouchscreen.chooseSecondSelection();
  }

}
