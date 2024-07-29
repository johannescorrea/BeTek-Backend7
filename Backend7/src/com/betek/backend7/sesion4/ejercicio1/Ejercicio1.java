package com.betek.backend7.sesion4.ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        Animal animal = new Pajaro();
        displayAnimal(animal);
    }

    private static void displayAnimal(Animal animal) {

        animal.eat();
    }
}
