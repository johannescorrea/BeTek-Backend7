package com.betek.backend7.sesion2;

public class EjercicioEncapsulamiento {

    public static void main(String[] args) {
        //Instanciamos una nueva cuenta de ahorro
        CuentaAhorro cuentaAhorro = new CuentaAhorro();
        CuentaAhorro cuentaAhorro2 = new CuentaAhorro("123456", "Mariana Ramirez", "10230123456", 100000, "Banco de Bogota", "Oviedo");
        //Depositamos 1000 pesos
        int valorDeposito = 500;
        if (cuentaAhorro.getSaldo() <= 1000) {
            cuentaAhorro.setSaldo(cuentaAhorro.getSaldo()+valorDeposito);
        }
        cuentaAhorro.setSaldo(1000);
        cuentaAhorro.setSaldo(2000);
        System.out.println(cuentaAhorro.getNumeroCuenta());
        System.out.println(cuentaAhorro.getSaldo());
    }
}
