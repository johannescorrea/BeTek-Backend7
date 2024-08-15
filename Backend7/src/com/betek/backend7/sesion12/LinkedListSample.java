package com.betek.backend7.sesion12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListSample {

    public static void main(String[] args) {

        LinkedList<Integer> list = getValores();
        ArrayList<Long> list2 = new ArrayList<>();

        list.add(5);

        long inicio = System.currentTimeMillis();
        for (Integer numero : list) {
            System.out.println(numero);
        }
        long fin = System.currentTimeMillis();
        System.out.println("Se tdemoro" + (fin - inicio));


    }

    //Añadir 1000000 valores a un array list
    //Añadir 1000000 valores a un linked list

    //Comparar los tiempos de recorrer toda la lista
    //comparar los tiempos de buscar un valor por posicion o por el valor

    public static LinkedList<Integer> getValores() {
        LinkedList<Integer> list = new LinkedList();

        list.add(Integer.valueOf(10));

        return list;
    }
}
