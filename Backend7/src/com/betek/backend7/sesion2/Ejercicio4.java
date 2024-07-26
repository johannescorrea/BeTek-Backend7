package com.betek.backend7.sesion2;

public class Ejercicio4 {

    public static void main(String[] args) {
        //Escribir los numeros pares entre 200 y 400
        int inicio = Integer.parseInt(args[0]);
        int fin = Integer.parseInt(args[1]);

        for (int i = inicio; i <= fin; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }

        }
    }
}
