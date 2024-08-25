package com.betek.backend7.sesion16;

import java.util.function.Predicate;

public class ValidadorNumero implements Predicate<Integer> {

    @Override
    public boolean test(Integer numero) {
        return numero % 2 == 0;
    }
}
