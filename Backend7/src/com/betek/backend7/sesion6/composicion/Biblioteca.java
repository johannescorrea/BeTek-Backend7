package com.betek.backend7.sesion6.composicion;

import com.betek.backend7.sesion6.Libro;
import com.betek.backend7.sesion6.Usuario;

//Ejercicio de composicion, la biblioteca requiere tener libros para poder ser instanciada.
public class Biblioteca {

    private final Libro[] libros;
    private Usuario[] usuarios;

    //Esto es composición con libros, porque si no le entrego libros a la instancia de biblioteca, falla.
    public Biblioteca(Libro[] libros) {
        if (libros != null && libros.length > 0) {
            //validar que hayan libros
            this.libros = libros;
        } else {
            throw new IllegalArgumentException("Libros no puede ser nulo o vacio");
        }

    }

    public void listarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("1", "Harry Potter y el Prisionero de Azkaban", "JK Rowling", "Minotauro", "Fantasia");
        Libro libro2 = new Libro("2", "Cien annos de soledad", "GG Marquez", "Editorial", "Novela");

        Biblioteca bpp = new Biblioteca(new Libro[]{libro1, libro2});
        bpp.listarLibros();

        Biblioteca biblioteca = new Biblioteca(null);
    }
}
