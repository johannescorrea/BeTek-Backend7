package com.betek.backend7.sesion9.openclosed.step3;

public class BankTransferProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        if (amount > 50000) {
            throw new IllegalArgumentException("Bank transfer payment cannot be greater than $50000");
        }
        System.out.println("Processing bank transfer payment of $" + amount);
    }
}
