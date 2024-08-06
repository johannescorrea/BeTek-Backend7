package com.betek.backend7.sesion9.openclosed.step3;

public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        if (amount > 3000) {
            amount += amount * 0.05; // Surcharge of 5%
        }
        System.out.println("Processing credit card payment of $" + amount);
    }
}
