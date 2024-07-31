package com.betek.backend7.sesion4.ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {
        BasePaymentProcessor processor = new CreditCardProcessor();
        System.out.println(processor.procesarPago(5000d));

        processor = new PaypalProcessor();
        System.out.println(processor.procesarPago(3000));
    }
}
