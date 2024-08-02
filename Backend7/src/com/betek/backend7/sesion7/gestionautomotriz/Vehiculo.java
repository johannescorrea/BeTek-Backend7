package com.betek.backend7.sesion7.gestionautomotriz;

public interface Vehiculo {

    void arrancar();
    void detener();
    void acelerar(int velocidad);
    void frenar();
    String getMarca();
    String obtenerEstado();

}
