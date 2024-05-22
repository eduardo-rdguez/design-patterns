package com.eduardordguez.solid.openclose;

import java.math.BigDecimal;

public class PaymentService {

  private final PaymentProcessor paymentProcessor;

  public PaymentService(PaymentProcessor paymentProcessor) {
    this.paymentProcessor = paymentProcessor;
  }

  public void completePayment(BigDecimal amount) {
    this.paymentProcessor.processPayment(amount);
  }

}
