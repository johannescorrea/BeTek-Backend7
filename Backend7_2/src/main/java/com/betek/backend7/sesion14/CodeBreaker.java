package com.betek.backend7.sesion14;

public class CodeBreaker {

    private String numeroAdivinar;
    private int intentos;
    private int intentosMaximo;

    public CodeBreaker() {
        numeroAdivinar = "1234";
        intentos = 0;
        intentosMaximo = 10;

    }

    public String intentarNumero(String number) {
        String resultado = "";
        if (number.length() != 4) {
            throw new IllegalArgumentException("El número debe tener 4 dígitos");
        }

        if (numeroAdivinar.equals(number)) {
            resultado = "++++";
        } else {
            intentos++;
            if (intentos == intentosMaximo) {
                resultado = "Game Over";
            } else {
                int puntos = 0;
                int cruces = 0;
                for (int i = 0; i < number.length(); i++) {
                    String digito = number.substring(i, i + 1);
                    if (numeroAdivinar.contains(digito)) {
                        if (numeroAdivinar.indexOf(digito) == i) {
                            cruces++;
                        } else {
                            puntos++;
                        }
                    }
                }
                resultado += ".".repeat(puntos);
                resultado += "+".repeat(cruces);
            }
        }
        return resultado;
    }
}
