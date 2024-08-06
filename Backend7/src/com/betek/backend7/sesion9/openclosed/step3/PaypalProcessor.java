package com.betek.backend7.sesion9.openclosed.step3;

public class PaypalProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        if (amount <= 100) {
            throw new IllegalArgumentException("PayPal payment must be greater than $100");
        }
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
