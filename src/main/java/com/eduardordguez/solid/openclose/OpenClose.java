package com.eduardordguez.solid.openclose;

import java.math.BigDecimal;

/**
 * `Open-Close Principle` states that software entities (classes, modules, functions, and so on)
 * should be open for extension, but closed for modification.
 */
public class OpenClose {

  public static void main(String[] args) {
    CreditCardPaymentProcessor creditCardPaymentProcessor = new CreditCardPaymentProcessor();
    PayPalPaymentProcessor payPalPaymentProcessor = new PayPalPaymentProcessor();

    PaymentService creditCardPaymentService = new PaymentService(creditCardPaymentProcessor);
    PaymentService payPalPaymentService = new PaymentService(payPalPaymentProcessor);

    BigDecimal amount = new BigDecimal(1000);

    creditCardPaymentService.completePayment(amount);
    payPalPaymentService.completePayment(amount);
  }

}
