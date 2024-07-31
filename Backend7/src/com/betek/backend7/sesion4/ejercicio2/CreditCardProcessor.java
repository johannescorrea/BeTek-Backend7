package com.betek.backend7.sesion4.ejercicio2;

public class CreditCardProcessor extends BasePaymentProcessor implements Sobrecupo {

    @Override
    protected void autenticarUsuario() {
        System.out.println("Autenticando Tarjeta de credico.");
    }

    @Override
    protected void ejecutarTransaccion() {
        System.out.println("Ejecutando Transaccion en tarjeta de credico.");
    }

    @Override
    public boolean devolverPago(String referencia) {
        return false;
    }

    @Override
    public boolean soportaSobrecupo() {
        return false;
    }

    @Override
    public double getSobrecupo() {
        return 0;
    }

    @Override
    public void setSobrecupo(double sobrecupo) {

    }
}
