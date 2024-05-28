package com.eduardordguez.behavioral.strategy;

import java.math.BigDecimal;

/**
 * The `PaypalPayment` concrete strategy provides a specific algorithm or behavior for performing
 * the task defined by the strategy interface.
 */
public class CreditCardPayment implements Payment {

  private final String cardholderName;
  private final String cardNumber;
  private final String cvv;
  private final String expirationDate;

  public CreditCardPayment(String cardholderName, String cardNumber, String cvv, String expirationDate) {
    this.cardholderName = cardholderName;
    this.cardNumber = cardNumber;
    this.cvv = cvv;
    this.expirationDate = expirationDate;
  }

  @Override
  public void pay(BigDecimal amount) {
    System.out.println("Processing credit card payment of $" + amount);
  }

}
