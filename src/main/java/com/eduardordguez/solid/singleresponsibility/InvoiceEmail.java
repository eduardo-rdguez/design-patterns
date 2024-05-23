package com.eduardordguez.solid.singleresponsibility;

public class InvoiceEmail {

  void send(Invoice invoice) {
    System.out.println("Sending email for invoice: " + invoice.getNumber());
  }

}
