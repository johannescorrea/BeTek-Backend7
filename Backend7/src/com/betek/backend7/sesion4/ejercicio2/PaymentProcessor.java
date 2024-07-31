package com.betek.backend7.sesion4.ejercicio2;

public interface PaymentProcessor {

    String procesarPago(double valor);

    boolean devolverPago(String referencia);
}
