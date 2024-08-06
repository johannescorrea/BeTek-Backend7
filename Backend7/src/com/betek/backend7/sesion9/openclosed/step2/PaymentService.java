package com.betek.backend7.sesion9.openclosed.step2;

public class PaymentService {
    public void processPayment(String type, double amount) {
        if (type.equals("CreditCard")) {
            if (amount > 3000) {
                amount += amount * 0.05; // Surcharge of 5%
            }
            System.out.println("Processing credit card payment of $" + amount);
        } else if (type.equals("PayPal")) {
            if (amount <= 100) {
                throw new IllegalArgumentException("PayPal payment must be greater than $100");
            }
            System.out.println("Processing PayPal payment of $" + amount);
        } else if (type.equals("BankTransfer")) {
            if (amount > 50000) {
                throw new IllegalArgumentException("Bank transfer payment cannot be greater than $50000");
            }
            System.out.println("Processing bank transfer payment of $" + amount);
        } else {
            throw new IllegalArgumentException("Unknown payment type");
        }
    }

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment("CreditCard", 3500.0);
        paymentService.processPayment("PayPal", 150.0);
        paymentService.processPayment("BankTransfer", 30000.0);
    }
}
