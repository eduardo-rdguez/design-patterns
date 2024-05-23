package com.eduardordguez.solid.singleresponsibility;

public class InvoiceReport {

  public void generate(Invoice invoice) {
    System.out.println("Generating report for invoice: " + invoice.getNumber());
  }

}
