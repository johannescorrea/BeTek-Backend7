package com.betek.backend7.sesion12;


public class ListaEnlazada {

    private Nodo head;
    private Nodo last;

    public void setHead(Nodo nuevoHead) {
        if (this.head == null){
            this.head = nuevoHead;
        } else {
            nuevoHead.siguiente = this.head;
            this.head = nuevoHead;
        }
    }

    public Nodo add(Integer valor) {
        Nodo nuevo = new Nodo();
        nuevo.valor = valor;
        if (this.head == null) {
            this.head = nuevo;
            this.last = nuevo;
        } else {
            this.last.siguiente = nuevo;
            this.last = nuevo;
        }
        return null;
    }
}
