package com.eduardordguez.behavioral.state;

/**
 * The `State` component is the interface that defines the common methods for all concrete state
 * classes.
 */
public abstract class State {

  public abstract void doAction();

  public abstract String getState();

}
