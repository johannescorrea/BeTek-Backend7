package com.betek.backend7.sesion9.openclosed.step3;

public class PaymentService {

    private CreditCardProcessor creditCardProcessor;
    private PaypalProcessor paypalProcessor;
    private BankTransferProcessor bankTransferProcessor;

    public PaymentService(CreditCardProcessor creditCardProcessor, PaypalProcessor paypalProcessor, BankTransferProcessor bankTransferProcessor) {
        this.creditCardProcessor = creditCardProcessor;
        this.paypalProcessor = paypalProcessor;
        this.bankTransferProcessor = bankTransferProcessor;
    }


    public void processPayment(String type, double amount) {
        if (type.equals("CreditCard")) {
            creditCardProcessor.processPayment(amount);
        } else if (type.equals("PayPal")) {
            paypalProcessor.processPayment(amount);
        } else if (type.equals("BankTransfer")) {
           bankTransferProcessor.processPayment(amount);
        } else {
            throw new IllegalArgumentException("Unknown payment type");
        }
    }

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new CreditCardProcessor(), new PaypalProcessor(), new BankTransferProcessor());
        paymentService.processPayment("CreditCard", 3500.0);
        paymentService.processPayment("PayPal", 150.0);
        paymentService.processPayment("BankTransfer", 30000.0);
    }
}
