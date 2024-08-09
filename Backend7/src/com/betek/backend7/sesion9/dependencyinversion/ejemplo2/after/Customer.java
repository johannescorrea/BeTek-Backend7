package com.betek.backend7.sesion9.dependencyinversion.ejemplo2.after;

public class Customer {

    private String nombre;
    private String servicioNotificacionSeleccionado;


    public Customer(String nombre, String servicioNotificacionSeleccionado) {
        this.nombre = nombre;
        this.servicioNotificacionSeleccionado = servicioNotificacionSeleccionado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getServicioNotificacionSeleccionado() {
        return servicioNotificacionSeleccionado;
    }
}
