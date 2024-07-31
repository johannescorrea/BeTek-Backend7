package com.betek.backend7.sesion4.ejercicio2;

public class PaypalProcessor extends BasePaymentProcessor {
    @Override
    protected void autenticarUsuario() {
        System.out.println("Autenticando Paypal.");
    }

    @Override
    protected void ejecutarTransaccion() {
        System.out.println("Ejecutando Transaccion en Paypal.");
    }

    @Override
    protected boolean validarTranssacion(double valorPago) {
        return valorPago > 5000;
    }


}
