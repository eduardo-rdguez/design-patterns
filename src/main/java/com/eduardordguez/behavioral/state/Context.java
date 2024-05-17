package com.eduardordguez.behavioral.state;

/**
 * The `Context` component is the class that contains the object whose behavior changes based on
 * its internal state.
 */
public class Context extends State {
  private State state;

  public Context(State state) {
    this.state = state;
  }

  @Override
  public void doAction() {
    this.state.doAction();
  }

  @Override
  public String getState() {
    return this.state.getState();
  }

  public void setState(State state) {
    this.state = state;
  }

}
