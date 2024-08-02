package com.betek.backend7.sesion6;

public class Usuario {

    public static final int NUMERO_MAXIMO_LIBROS = 10;

    private String identificacion;
    private String nombre;
    private String telefono;
    private Libro[] libros;

    public Usuario(String identificacion, String nombre, String telefono) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.telefono = telefono;
        libros = new Libro[NUMERO_MAXIMO_LIBROS];
    }

    public void adicionarLibro(Libro libro) {
        if (libros.length < NUMERO_MAXIMO_LIBROS) {
            libros[libros.length - 1] = libro;
        }
    }

    public Libro[] getLibros() {
        return libros;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "telefono='" + telefono + '\'' +
                ", nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                '}';
    }
}
