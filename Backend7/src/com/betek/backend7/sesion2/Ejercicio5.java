package com.betek.backend7.sesion2;

public class Ejercicio5 {

    public static void main(String[] args) {
        //Imprimir los numeros pares ingresados a través de los argumentos

        for (String valor : args) {
            int numero = Integer.parseInt(valor);
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        }
    }
}
