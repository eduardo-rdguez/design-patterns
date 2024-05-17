package com.eduardordguez.behavioral.command;

/**
 * The `Command` superclass declares a common method `execute()` ensuring that every concrete
 * command knows how to perform its specific action.
 */
public abstract class Command {

  private boolean isExecute;

  public abstract void execute();

  public boolean isExecuted() {
    return isExecute;
  }

  public void setIsExecute(boolean isExecute) {
    this.isExecute = isExecute;
  }

}
