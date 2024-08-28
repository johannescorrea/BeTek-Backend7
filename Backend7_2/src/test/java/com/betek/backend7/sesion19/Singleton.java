package com.betek.backend7.sesion19;

public class Singleton {

    private static final Singleton instance;
    static {
        System.out.println("Creando instancia en bloque estatico");
        String numConexiones = (String)System.getProperties().get("numeroConexiones");
        instance = new Singleton(numConexiones);
    }

    private String numeroConexiones;
    private String urlConexion;

    private Singleton(String numConexiones) {
        this.numeroConexiones = numConexiones;
    }

    public static Singleton getInstance() {
        System.out.println("Retornando instancia");
        return instance;
    }
}
