package com.betek.backend7.sesion21;

public class Oveja implements Cloneable {
    private String nombre;
    private int edad;

    public Oveja(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Oveja(Oveja oveja) {
        this.nombre = oveja.nombre;
        this.edad = oveja.edad;
    }

    public Oveja clone() {
        return new Oveja(this);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Oveja{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
