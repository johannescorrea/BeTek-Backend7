package com.betek.backend7.sesion17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

        List<String> nombres = Arrays.asList("Juan", "Pedro", "Maria", "Ana", "Luis", "Carlos", "Jose", "Antonio", "Rosa", "Laura");
        //obtenerNombresGrandes(nombres, 5);

        imprimirLista(obtenerNombresGrandesStream(nombres, 5));

        Optional<String> primero = encontrarPrimeroQueEmpiezaPorStream(nombres, "A");
        System.out.println(primero.orElseGet(() -> "No se encontró ninguno"));

        primero = encontrarPrimeroQueEmpiezaPorStream(nombres, "Z");
        System.out.println(primero.orElseGet(() -> "No se encontró ninguno"));

        Stream<String> stream = nombres.stream()
                .filter(nombre -> nombre.startsWith("C"));
        System.out.println(stream);

    }



    private static List<String> obtenerNombresGrandes(List<String> nombres, int longitudMinima) {
        List<String> nuevaLista = new ArrayList<>();
        for (String nombre : nombres){
            if (nombre.length() > longitudMinima){
                nuevaLista.add(nombre.toUpperCase());
            }
        }
        return nuevaLista;
    }

    private static List<String> obtenerNombresGrandesStream(List<String> nombres, int longitudMinima) {
        return nombres.stream()
                .filter(Objects::nonNull)
                .filter(nombre -> nombre.length() > longitudMinima)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    private static List<Integer> obtenerLongitudes(List<String> nombres) {
        return nombres.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
    }

    private static void imprimirLista(List<String> strings) {
        strings.forEach(System.out::println);
    }

    private static String encontrarPrimeroQueEmpiezaPor(List<String> nombres, String letra) {
        String primero = null;
        for (String nombre : nombres){
            if (nombre.startsWith(letra)){
                primero = nombre;
                break;
            }
        }
        return primero;
    }

    private static Optional<String> encontrarPrimeroQueEmpiezaPorStream(List<String> nombres, String letra) {
        return nombres.stream()
                .filter(nombre -> nombre.startsWith(letra))
                .findAny();
    }
}
