package com.eduardordguez.solid.openclose;

import java.math.BigDecimal;

public class PayPalPaymentProcessor extends PaymentProcessor {

  @Override
  void processPayment(BigDecimal amount) {
    System.out.println("Processing PayPal payment of $" + amount.toString());
  }

}
