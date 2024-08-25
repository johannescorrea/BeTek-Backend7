package com.betek.backend7.sesion16;

import java.util.function.Supplier;

public class GeneradorNumeros implements Supplier<Integer> {

    @Override
    public Integer get() {
        return (int)(Math.random() * 1000);
    }
}
