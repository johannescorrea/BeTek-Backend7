package com.betek.backend7.sesion13;

import java.util.LinkedList;

public class Pila<T> {

    private LinkedList<T> elementos;

    public Pila() {
        elementos = new LinkedList<>();
    }

    public void add(T elemento) {
        elementos.addFirst(elemento);
    }

    public T remove() {
        return elementos.removeFirst();
    }

}
