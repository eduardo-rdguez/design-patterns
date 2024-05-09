package com.eduardordguez.structural.facademethod;

/***
 * The `client` is given just one interface that can use to interact with the system. This hides
 * all the complexities.
 */
public interface CoffeeMachine {

  void chooseFirstSelection();

  void chooseSecondSelection();

}
