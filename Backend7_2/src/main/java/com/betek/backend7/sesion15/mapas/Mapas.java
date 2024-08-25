package com.betek.backend7.sesion15.mapas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.List;

public class Mapas {

    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        map.put("71781586", "Johannes Correa");
        map.put("91818912", "Johannes Correa");
        map.put("812891289", "Yesica Villalobos");

        System.out.println(map.get("71781586"));
        System.out.println(map.get("abcv"));
        System.out.println(map.containsKey("abcv"));
        map.put("71781586", "Carlos Palacio");
        System.out.println(map.get("71781586"));

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //Como puedo tener un mapa donde para una misma llave tenga multiples valores
        HashMap<String, List<String>> map2 = new HashMap<>();
        map2.put("estudiantes", List.of("Johannes Correa", "Carlos Palacio"));
        map2.put("profesores", List.of("Johannes Correa", "Carlos Palacio"));

        if(map2.containsKey("estudiantes")) {
            List<String> estudiantes = map2.get("estudiantes");
            estudiantes.add("Sara");
            map2.put("estudiantes", estudiantes);
        }
    }
}
