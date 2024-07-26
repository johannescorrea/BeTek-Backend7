package com.betek.backend7.sesion2;

import java.util.UUID;

public class CuentaAhorro {

    private String numeroCuenta;
    private String nombreUsuario;
    private String idUsuario;
    private int saldo;
    private String banco;
    private String sucursal;

    public CuentaAhorro() {
        //this(UUID.randomUUID().toString(), "", "", 0, "Bancolombia", "Oviedo");
        this("", "", 0);
    }

    public CuentaAhorro(String nombreUsuario, String idUsuario, int saldo) {
        this.nombreUsuario = nombreUsuario;
        this.idUsuario = idUsuario;
        this.saldo = saldo;
    }

    public CuentaAhorro(String numeroCuenta, String nombreUsuario, String idUsuario, int saldo, String banco, String sucursal) {
        this.numeroCuenta = numeroCuenta;
        this.nombreUsuario = nombreUsuario;
        this.idUsuario = idUsuario;
        this.saldo = saldo;
        this.banco = banco;
        this.sucursal = sucursal;
    }

    public int depositar(int valor) {
        if(valor + saldo <= 1000) {
            saldo = saldo + valor;
        }
        return saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
