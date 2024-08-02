package com.betek.backend7.sesion7.gestionautomotriz;

public class Automovil extends  VehiculoBase {

    private int numeroPasajeros;
    private String tipo;


    public Automovil(String marca, int velocidadMaxima, int numeroPasajeros, String tipo) {
        super(marca, velocidadMaxima);
        this.numeroPasajeros = numeroPasajeros;
        this.tipo = tipo;
    }

    @Override
    public void acelerar(int velocidad) {
        if (velocidad > 0) {
            System.out.printf("El automovil %s esta acelerando %s kms/hora", marca, velocidad);
            super.acelerar(velocidad);

        } else {
            System.out.println("Error, para acelerar la velocidad debe ser mayor que 0.");
        }

    }
}
