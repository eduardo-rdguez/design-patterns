package com.eduardordguez.behavioral.strategy;

import java.math.BigDecimal;

/**
 * The `Payment` strategy interface defines a set of methods that all concrete strategies must
 * implement.
 */
public interface Payment {

  void pay(BigDecimal amount);

}
