package com.betek.backend7.sesion7.gestionautomotriz;

public class GestionAutomotriz {

    public static void main(String[] args) {
        Vehiculo mazda = new Automovil("mazda", 180, 5, "sedan");

        mazda.arrancar();
        System.out.println(mazda.obtenerEstado());
        mazda.acelerar(20);
        System.out.println(mazda.obtenerEstado());
        mazda.acelerar(20);
        mazda.frenar();
        System.out.println(mazda.obtenerEstado());
        mazda.detener();
        System.out.println(mazda.obtenerEstado());
    }
}
