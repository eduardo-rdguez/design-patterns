package com.eduardordguez.behavioral.strategy;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * `Strategy` is a behavioral design pattern that turns a set of behaviors into objects and makes
 * them interchangeable inside original context object.
 */
public class StrategyPattern {

  public static void main(String[] args) {
    Item itemA = new Item(UUID.randomUUID().toString(), new BigDecimal(100));
    Item itemB = new Item(UUID.randomUUID().toString(), new BigDecimal(200));

    Payment creditCardPayment = new CreditCardPayment(
        "Hector Kumar",
        "5425233430109903",
        "123",
        "04/2026"
    );

    Payment paypalPayment = new PaypalPayment("username@domain.com", "p4ssw0rd");

    ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.addItem(itemA);
    shoppingCart.addItem(itemB);
    shoppingCart.pay(creditCardPayment);
    shoppingCart.pay(paypalPayment);
  }

}
