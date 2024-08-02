package com.betek.backend7.sesion6;

public class Libro {

    private String referencia;
    private String titulo;
    private String autor;
    private String editorial;
    private String genero;
    private Usuario usuario;

    public Libro(String referencia, String titulo, String autor, String editorial, String genero) {
        this.referencia = referencia;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.genero = genero;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "referencia='" + referencia + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
