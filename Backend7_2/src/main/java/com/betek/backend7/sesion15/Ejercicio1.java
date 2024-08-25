package com.betek.backend7.sesion15;

import com.betek.backend7.sesion15.exceptions.ArchivoNoEncontradoException;
import com.betek.backend7.sesion15.exceptions.NombreNoValidoException;

import java.io.IOException;

public class Ejercicio1 {

    public static void main(String[] args) {

        Ejercicio1 ejercicio1 = new Ejercicio1();

        try {
            ejercicio1.leerArchivo(null);
            System.out.println("Archivo encontrado");
        } catch (ArchivoNoEncontradoException | NullPointerException ex) {
            ex.printStackTrace();
            System.out.println("Archivo no encontrado: " + ex.getMessage());
        } finally {
            System.out.println("Ejecutando finally");
        }

    }

    public String leerArchivo(String nombreArchivo) throws ArchivoNoEncontradoException {
        try {
            abrirArchivo(nombreArchivo);
        } finally {
            System.out.println("Ejecutando finally en leerArchivo");
        }
        return "";
    }

    /**
     *
     * @param nombreArchivo
     * @throws ArchivoNoEncontradoException
     * @throws NombreNoValidoException
     */
    private void abrirArchivo(String nombreArchivo) throws ArchivoNoEncontradoException, NombreNoValidoException {
//        if(nombreArchivo == null) {
//            throw new NombreNoValidoException("Nombre del archivo invalido");
//        }
        if (nombreArchivo.equals("archivo.txt")) {
            throw new ArchivoNoEncontradoException("Archivo no encontrado");
        }
    }

}
