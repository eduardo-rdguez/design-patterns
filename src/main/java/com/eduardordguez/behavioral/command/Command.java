package com.eduardordguez.behavioral.command;

/**
 * The `Command` superclass declares a common method `execute()` ensuring that every concrete
 * command knows how to perform its specific action.
 */
public abstract class Command {

  public abstract void execute();

}
