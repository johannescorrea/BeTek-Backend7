package com.betek.backend7.sesion12;

import java.util.Arrays;

public class Arreglos {

    public static void main(String[] args) {

        Integer[] numeros = new Integer[10];
        insert(numeros, 0, 3);
        insert(numeros, 1, 4);
        insert(numeros, 1, 5);
        System.out.println(contains(numeros, 6));
        System.out.println(contains(numeros, 4));
    }

    private static void insert(Integer[] numeros, int posicion, int valor) {
        if (posicion < numeros.length) {
            if (numeros[posicion] == null) {
                numeros[posicion] = valor;
            } else {
                if (numeros[numeros.length-1] == null) {
                    for (int i = numeros.length-1; i > posicion; i--) {
                        numeros[i] = numeros[i-1];
                    }
                    numeros[posicion] = valor;
                } else {
                    throw new IllegalArgumentException("");
                }
            }

        }
    }

    private static boolean contains(Integer[] numeros, Integer valor) {
        Arrays.sort(numeros);
        return Arrays.binarySearch(numeros, valor) != -1;
    }
}
