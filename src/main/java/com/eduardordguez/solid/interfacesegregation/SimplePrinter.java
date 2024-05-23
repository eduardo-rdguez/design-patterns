package com.eduardordguez.solid.interfacesegregation;

/**
 * The `SimplePrinter`class implements only the Print interface because it only needs to print
 * documents.
 */
public class SimplePrinter implements Print {

  @Override
  public void print(Document document) {
    System.out.println("Printing: " + document.getContent());
  }

}
