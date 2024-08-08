package com.betek.backend7.sesion9.dependencyinversion.ejemplo1.after;

public class Oracle implements ServicioBD {
    public void savePerson(String nombre, String apellido) {
        System.out.println("guardando persona");
    }
}
