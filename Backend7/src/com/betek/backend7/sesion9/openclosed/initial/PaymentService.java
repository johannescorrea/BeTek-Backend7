package com.betek.backend7.sesion9.openclosed.initial;

public class PaymentService {
    public void processPayment(double amount) {
        if (amount <= 100 || amount > 50000) {
            throw new IllegalArgumentException("Payment must be greater than $100 and cannot be greater than $50000");
        } else if (amount > 3000) {
            amount += amount * 0.05; // Surcharge of 5%
        }
        System.out.printf("Processing Payment for %s%n", amount);

    }

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment(3500.0);
        paymentService.processPayment(150.0);
        paymentService.processPayment(30000.0);
        try {
            paymentService.processPayment(65000.0);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    //Limite inferior de 100 es para pagos con payoal
    //Limite superior de 50000 es para pagos con transferencias bancarias
    //y el sobrecargo es con tarjeta de credito.

}
