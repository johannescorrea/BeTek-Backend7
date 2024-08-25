package com.betek.backend7.sesion16;

import java.util.Arrays;
import java.util.List;

public class Funciones1 {

    public static void main(String[] args) {

        //Functional Interface
        FuncionNumerica sumador = new Sumador();
        System.out.println(sumador.operar(5, 3, 7));

        //Function
        Saludador saludador = new Saludador();
        System.out.println(saludador.apply("Juan"));

        //BiFunction
        Concatenador concatenador = new Concatenador();
        System.out.println(concatenador.apply("Hola", "Juan"));

        //Supplier
        GeneradorNumeros generador = new GeneradorNumeros();
        System.out.println(generador.get());
        System.out.println(generador.get());

        //Consumer
        ImpresoraListas impresora = new ImpresoraListas();
        impresora.accept(Arrays.asList("Juan", "Yesica", "Andres", "Mariana"));

        //Predicate
        ValidadorNumero esPar = new ValidadorNumero();
        System.out.println(esPar.test(8));
        System.out.println(esPar.test(9));

    }
}
