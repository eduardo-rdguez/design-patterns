package com.eduardordguez.solid.singleresponsibility;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * The `Single Responsibility` principle states that a class should have one and only one reason
 * to change, meaning that a class should have only one job.
 */
public class SingleResponsibilityPrinciple {

  public static void main(String[] args) {
    BigDecimal amount = new BigDecimal(1000);
    Invoice invoice = new Invoice(UUID.randomUUID().toString(), amount);

    InvoiceRepository invoiceRepository = new InvoiceRepository();
    invoiceRepository.save(invoice);

    InvoiceReport invoiceReport = new InvoiceReport();
    invoiceReport.generate(invoice);

    InvoiceEmail invoiceEmail = new InvoiceEmail();
    invoiceEmail.send(invoice);
  }

}
