package com.eduardordguez.behavioral.templatemethod;

/**
 * The `CsvDataProcessor` concrete subclass extends the abstract class and provide concrete
 * implementations for the abstract methods defined in the superclass.
 */
public class CsvDataProcessor extends DataProcessor {

  @Override
  protected void loadData() {
    System.out.println("Loading data from CSV file");
  }

  @Override
  protected void processData() {
    System.out.println("Processing CSV data");
  }

  @Override
  protected void saveData() {
    System.out.println("Saving CSV data");
  }

}
