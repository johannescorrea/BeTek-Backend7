package com.betek.backend7.sesion15.exceptions;

public class ArchivoNoEncontradoException extends Exception {

    public ArchivoNoEncontradoException(String mensaje) {
        super(mensaje);
    }

    public ArchivoNoEncontradoException(String mensaje, Throwable rootCause) {
        super(mensaje, rootCause);
    }
}
