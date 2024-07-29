package com.betek.backend7.sesion4.ejercicio2;

public class CreditCardProcessor extends PaymentProcessor{

    @Override
    protected void autenticarUsuario() {
        System.out.println("Autenticando Tarjeta de credico.");
    }

    @Override
    protected void ejecutarTransaccion() {
        System.out.println("Ejecutando Transaccion en tarjeta de credico.");
    }
}
