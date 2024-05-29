package com.eduardordguez.behavioral.templatemethod;

/**
 * The `XmlDataProcessor` concrete subclass extends the abstract class and provide concrete
 * implementations for the abstract methods defined in the superclass.
 */
public class XmlDataProcessor extends DataProcessor {

  @Override
  protected void loadData() {
    System.out.println("Loading data from XML file");
  }

  @Override
  protected void processData() {
    System.out.println("Processing XML data");
  }

  @Override
  protected void saveData() {
    System.out.println("Saving XML data");
  }

}
