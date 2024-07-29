package com.betek.backend7.sesion4.ejercicio1;

public class Pajaro extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Cantando");
    }

    @Override
    public void move() {
        System.out.println("Volando");
    }

    @Override
    public void eat() {
        System.out.println("Picando");
    }
}
