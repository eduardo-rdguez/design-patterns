package com.eduardordguez.behavioral.state;

public class StatePattern {

  public static void main(String[] args) {
    State turnOnState = new TurnOnState();
    State turnOffState = new TurnOffState();

    Context context = new Context(turnOffState);

    context.setState(turnOnState);
    context.doAction();
    context.getState();

    context.setState(turnOffState);
    context.doAction();
    context.getState();
  }

}
