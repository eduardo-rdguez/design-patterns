package com.eduardordguez.behavioral.command;

/**
 * The `Invoker` is the one responsible for initiating command execution.
 */
public class ContactControl {

  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void submit() {
    command.execute();
  }

}
