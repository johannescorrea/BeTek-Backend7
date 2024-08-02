package com.betek.backend7.sesion6.agregacion;

import com.betek.backend7.sesion6.Libro;
import com.betek.backend7.sesion6.Usuario;

import java.util.Arrays;

public class Biblioteca {

    private Libro[] libros;
    private Usuario[] usuarios;

    private int numLibros;
    private int numUsuarios;

    public Biblioteca() {
        libros = new Libro[100];
        usuarios = new Usuario[100];
        numLibros = 0;
        numUsuarios = 0;
    }

    public void adicionarLibro(Libro libro) {
        boolean existe = false;
        for (Libro libroAdicionado : libros) {
            if(libroAdicionado!=null && libro.getReferencia().equals(libroAdicionado.getReferencia())) {
                existe = true;
                break;
            }
        }
        if(!existe) {
            libros[numLibros] = libro;
            numLibros++;
        }
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios[numUsuarios] = usuario;
        numUsuarios++;
    }

    public void prestarLibro(Libro libro, Usuario usuario) {
        usuario.adicionarLibro(libro);
        libro.setUsuario(usuario);
    }

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("1", "Andres", "1234");
        Usuario usuario2 = new Usuario("2", "Carlos", "1234");
        Usuario usuario3 = new Usuario("3", "Jose", "1234");

        Libro libro1 = new Libro("1", "Harry Potter y el Prisionero de Azkaban", "JK Rowling", "Minotauro", "Fantasia");
        Libro libro2 = new Libro("2", "Cien annos de soledad", "GG Marquez", "Editorial", "Novela");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLibro(libro1);
        biblioteca.adicionarLibro(libro2);

        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);

        biblioteca.prestarLibro(libro1, usuario2);


        System.out.println(Arrays.toString(usuario1.getLibros()));
        System.out.println(libro1.getUsuario());

        biblioteca = null;
        System.out.println(usuario1);
    }
}
