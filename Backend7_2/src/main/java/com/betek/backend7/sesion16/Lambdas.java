package com.betek.backend7.sesion16;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambdas {

    public static void main(String[] args) {

        //Function
        Function<String, String> saludador = (string) -> "Hola! " + string;
        System.out.println(saludador.apply("Juan"));

        //BiFunction
        BiFunction<String, String, String> concatenador = (string1, string2) -> string1 + " " + string2;
        System.out.println(concatenador.apply("Hola", "Juan"));

        //Consumer
        Consumer<String> printLength = s -> System.out.println(s.length());
        printLength.accept("Hola mundo, esto es una prueba");

        //Supplier
        Supplier<Integer> generateNumber = () -> (int)(Math.random() * 1000);
        System.out.println(generateNumber.get());

        //Lambda con multiples lineas
        Function<String, String> saludador2 = (string) -> {
            if (string == null || string.isEmpty()) {
                return "Hola Anonimo!";
            } else {
                return "Hola! " + string;
            }
        };
        System.out.println(saludador2.apply(""));

        //Predicate
        Predicate<Integer> esPar = (value) -> value % 2 == 0;
        System.out.println(esPar.test(8));

        //Lamda de funcion propia
        FuncionNumerica sumador = (a, b, c) -> a + b + c;
        System.out.println(sumador.operar(5, 3, 7));
    }
}
