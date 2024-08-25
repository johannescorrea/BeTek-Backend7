package com.betek.backend7.sesion14;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSources;

import static org.junit.jupiter.api.Assertions.*;

class CodeBreakerTest {

    private CodeBreaker codeBreaker;

    @BeforeEach
    void setUp() {
        codeBreaker = new CodeBreaker();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void intentarNumero_debeFallarSiValorEsMenor4Digitos() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> codeBreaker.intentarNumero("123"));

    }

    @Test
    void intentarNumero_debeFallarSiValorEsMayor4Digitos() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> codeBreaker.intentarNumero("123456"));
    }

    @Test
    void intentarNumero_debeRetornar4CrucesSiNumeroEsCorrecto() {
        String resultado = codeBreaker.intentarNumero("1234");
        assertEquals("++++", resultado);
    }

    @Test
    void intentarNumero_debeRetornarGameOverSiSuperaIntentos(){
        String resultado = "";
        for (int i = 0; i < 10; i++) {
            resultado = codeBreaker.intentarNumero("5467");
        }
        assertEquals("Game Over", resultado);
    }

    @Test
    void intentarNumero_debeRetornarVacioSiNingunNumeroExiste() {
        String resultado = codeBreaker.intentarNumero("5678");
        assertEquals("", resultado);
    }

    @ParameterizedTest
    @CsvSource({"5617,.","5612,..","3612,...","3412,....","1678,+","1278,++","1237,+++",
            "6137,.+","1324,..++"})
    void intentarNumero_debeRetornarSegunNumeroIngresado(String intento, String resultadoEsperado) {
        String resultado = codeBreaker.intentarNumero(intento);
        assertEquals(resultadoEsperado, resultado);
    }
}