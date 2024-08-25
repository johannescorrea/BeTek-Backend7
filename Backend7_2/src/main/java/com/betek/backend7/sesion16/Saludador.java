package com.betek.backend7.sesion16;

import java.util.function.Function;

public class Saludador implements Function<String, String> {

    @Override
    public String apply(String s) {
        return "Hola! " + s;
    }
}
