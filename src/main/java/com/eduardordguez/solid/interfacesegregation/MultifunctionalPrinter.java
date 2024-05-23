package com.eduardordguez.solid.interfacesegregation;

/**
 * The `MultiFunctionPrinter` class implements all the interfaces because it supports all the
 * functionalities.
 */
public class MultifunctionalPrinter implements Copy, Scan, Print {

  @Override
  public void copy(Document document) {
    System.out.println("Copying: " + document.getContent());
  }

  @Override
  public void print(Document document) {
    System.out.println("Printing: " + document.getContent());
  }

  @Override
  public void scan(Document document) {
    System.out.println("Scanning: " + document.getContent());
  }

}
