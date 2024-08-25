package com.betek.backend7.sesion16;

import java.util.List;
import java.util.function.Consumer;

public class ImpresoraListas implements Consumer<List<String>> {

    @Override
    public void accept(List<String> strings) {
        for(String s : strings) {
            System.out.println(s);
        }
    }
}
