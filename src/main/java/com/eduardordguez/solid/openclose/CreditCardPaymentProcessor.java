package com.eduardordguez.solid.openclose;

import java.math.BigDecimal;

public class CreditCardPaymentProcessor extends PaymentProcessor {

  @Override
  void processPayment(BigDecimal amount) {
    System.out.println("Processing credit card payment of $" + amount.toString());
  }

}
