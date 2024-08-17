package com.betek.backend7.sesion13;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EditorTextoTest {

    private EditorTexto editorTexto;

    //Se ejecutan antes y despues de cada test
    @BeforeEach
    void setUp() {
        System.out.println("setUp");
        editorTexto = new EditorTexto();
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown");
    }

    //Se ejecutan antes y despues de todos los test
    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll");
    }

    @Test
    void testEscribir_debeRetornarElTexto() {
        editorTexto.escribir("Hola mundo");
        String textoActual = editorTexto.getTexto();
        Assertions.assertEquals("Hola mundo", textoActual);
    }


}