package com.eduardordguez.solid.singleresponsibility;

import java.math.BigDecimal;

public class Invoice {

  private String number;
  private BigDecimal amount;

  public Invoice(String number, BigDecimal amount) {
    this.number = number;
    this.amount = amount;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

}
