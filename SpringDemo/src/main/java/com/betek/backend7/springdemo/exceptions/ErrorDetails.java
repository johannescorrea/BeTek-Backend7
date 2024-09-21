package com.betek.backend7.springdemo.exceptions;

public class ErrorDetails {

    private String mensaje;
    private String detalles;

    public ErrorDetails(String mensaje, String detalles) {
        this.mensaje = mensaje;
        this.detalles = detalles;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getDetalles() {
        return detalles;
    }

}
