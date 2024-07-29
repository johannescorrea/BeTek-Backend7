package com.betek.backend7.sesion4.ejercicio1;

public class Perro extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Ladrando");
    }

    @Override
    public void move() {
        System.out.println("Caminando");
    }

    @Override
    public void eat() {
        System.out.println("Mordiendo");
    }
}
