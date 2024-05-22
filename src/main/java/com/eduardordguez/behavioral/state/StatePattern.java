package com.eduardordguez.behavioral.state;

/**
 * `State` is a behavioral design pattern that lets an object alter its behavior when its internal
 * state changes. It appears as if the object changed its class.
 */
public class StatePattern {

  public static void main(String[] args) {
    State turnOnState = new TurnOnState();
    State turnOffState = new TurnOffState();

    Context context = new Context(turnOffState);
    System.out.println("Init state: " + context.getState());

    context.setState(turnOnState);
    context.doAction();
    System.out.println("Second state: " + context.getState());

    context.setState(turnOffState);
    context.doAction();
    System.out.println("Third state: " + context.getState());
  }

}
