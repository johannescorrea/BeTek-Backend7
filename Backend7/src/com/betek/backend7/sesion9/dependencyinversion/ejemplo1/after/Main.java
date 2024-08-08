package com.betek.backend7.sesion9.dependencyinversion.ejemplo1.after;

public class Main {

    public static void main(String[] args) {
        ServicioPersona servicioPersona = new ServicioPersonaImpl(new MySql());
        servicioPersona.savePerson("Johannes", "Correa");
    }
}
