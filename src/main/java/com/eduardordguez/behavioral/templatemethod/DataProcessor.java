package com.eduardordguez.behavioral.templatemethod;

/**
 * The `DataProcessor` abstract class provides a skeleton for the algorithm, where certain steps
 * are defined but others are left abstract that subclasses can override. It may also include
 * concrete methods that are common to all subclasses and are used within the template method.
 */
public abstract class DataProcessor {

  /**
   * This is the `Template Method` that consists of a series of method calls (either abstract or
   * concrete) that make up the algorithm’s steps.
   */
  public final void process() {
    this.loadData();
    this.processData();
    this.saveData();
  }

  protected abstract void loadData();

  protected abstract void processData();

  protected abstract void saveData();

}
