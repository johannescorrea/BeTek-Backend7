package com.betek.backend7.sesion4.ejercicio2;

import java.util.UUID;

public abstract class BasePaymentProcessor implements PaymentProcessor {

    @Override
    public String procesarPago(double valorPago){

        if (validarTranssacion(valorPago)){
            autenticarUsuario();
            ejecutarTransaccion();
            return retornarComprobante();
        } else {
            return "Transaccion no valida.";
        }

    }

    @Override
    public boolean devolverPago(String referencia) {
        return false;
    }

    protected boolean validarTranssacion(double valorPago){
        return valorPago > 0;
    }

    protected abstract void autenticarUsuario();

    protected abstract void ejecutarTransaccion();

    protected String retornarComprobante(){
        return UUID.randomUUID().toString();
    }
}
