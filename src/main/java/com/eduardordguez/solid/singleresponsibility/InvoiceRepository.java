package com.eduardordguez.solid.singleresponsibility;

public class InvoiceRepository {

  public void save(Invoice invoice) {
    System.out.println("Saving invoice: " + invoice.getNumber());
  }

}
