package com.betek.backend7.sesion13;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Sesion13 {

    public static void main(String[] args) {

        Cola<Integer> cola = new Cola<>();
        cola.add(50);
        cola.add(100);
        cola.add(150);

        Integer value = cola.read();
        System.out.println("Valor leido: " + value);


        testCola(new LinkedList<>());
        testCola(new PriorityQueue<>());



    }

    private static void testCola(Queue<Integer> cola) {
        cola.add(50);
        cola.add(100);
        cola.add(150);
        System.out.println("Valor leido de cola: " + cola.peek());
    }
}
