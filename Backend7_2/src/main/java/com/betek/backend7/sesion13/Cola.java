package com.betek.backend7.sesion13;

import java.util.LinkedList;

public class Cola<T> {

    private LinkedList<T> elementos;


    public Cola() {
        elementos = new LinkedList<>();
    }

    public void add(T elemento) {
        elementos.add(elemento);
    }

    public T remove() {
        return elementos.remove();
    }

    public T read() {
        return elementos.getFirst();
    }
}
