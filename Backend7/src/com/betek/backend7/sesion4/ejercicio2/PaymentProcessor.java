package com.betek.backend7.sesion4.ejercicio2;

import java.util.UUID;

public abstract class PaymentProcessor {

    public String procesarPago(double valorPago){

        if (validarTranssacion(valorPago)){
            autenticarUsuario();
            ejecutarTransaccion();
            return retornarComprobante();
        } else {
            return "Transaccion no valida.";
        }

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
