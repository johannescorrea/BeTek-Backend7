package com.betek.backend7.sesion16;

import java.util.function.BiFunction;

public class Concatenador implements BiFunction<String, String, String> {

    @Override
    public String apply(String string1, String string2) {
        return string1 + " " + string2;
    }
}
