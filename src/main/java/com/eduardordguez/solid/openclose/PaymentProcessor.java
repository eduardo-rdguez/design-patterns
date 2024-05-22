package com.eduardordguez.solid.openclose;

import java.math.BigDecimal;

public abstract class PaymentProcessor {

  abstract void processPayment(BigDecimal amount);

}
