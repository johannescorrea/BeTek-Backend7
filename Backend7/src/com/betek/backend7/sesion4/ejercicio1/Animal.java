package com.betek.backend7.sesion4.ejercicio1;

public abstract class Animal {

    public static final String CONSTANTE = "constante";
    private final String valor = "valor";

    public void makeSound() {
        System.out.println("Haciendo un sonido");
    }

    public void move() {
        System.out.println("Moviendonos");
    }

    //definicion de metodos
    //acceso [abstract|final] retorno nombre(params....)

    public abstract void eat();

    public final void breathe() {
        System.out.println("Respirando");
    }
}
