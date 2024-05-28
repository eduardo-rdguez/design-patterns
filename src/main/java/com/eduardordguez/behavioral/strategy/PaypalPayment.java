package com.eduardordguez.behavioral.strategy;

import java.math.BigDecimal;

/**
 * The `PaypalPayment` concrete strategy provides a specific algorithm or behavior for performing
 * the task defined by the strategy interface.
 */
public class PaypalPayment implements Payment {

  private final String email;
  private final String password;

  public PaypalPayment(String email, String password) {
    this.email = email;
    this.password = password;
  }

  @Override
  public void pay(BigDecimal amount) {
    System.out.println("Processing PayPal payment of $" + amount);
  }

}
