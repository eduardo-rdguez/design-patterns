package com.eduardordguez.behavioral.state;

/**
 * The `Concrete State` component encapsulates the behavior associated with a specific state of
 * the `Context`.
 */
public class TurnOffState extends State {

  @Override
  public void doAction() {
    // do something
  }

  @Override
  public String getState() {
    return "TurnOff";
  }

}
