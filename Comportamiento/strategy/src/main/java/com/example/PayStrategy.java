package com.example;

public interface PayStrategy {
  boolean pay(int paymentAmount);

  void collectPaymentDetails();
}
