package com.eduardordguez.solid.interfacesegregation;

/**
 * The `Interface Segregation` principle states that a client should never be forced to implement
 * an interface that it does not use, or clients should not be forced to depend on methods they do
 * not use.
 */
public class InterfaceSegregationPrinciple {

  public static void main(String[] args) {
    Document document = new Document("This is a sample document");

    SimplePrinter simplePrinter = new SimplePrinter();
    simplePrinter.print(document);

    MultifunctionalPrinter multifunctionalPrinter = new MultifunctionalPrinter();
    multifunctionalPrinter.copy(document);
    multifunctionalPrinter.scan(document);
    multifunctionalPrinter.print(document);
  }

}
