package com.betek.backend7.sesion7.gestionautomotriz;

public abstract class VehiculoBase implements Vehiculo {

    protected String marca;
    protected int velocidad;
    protected boolean enMovimiento;
    protected int velocidadMaxima;

    public VehiculoBase(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void arrancar() {
        this.velocidad = 1;
        enMovimiento = true;
    }

    @Override
    public void acelerar(int velocidad) {
        if (enMovimiento) {
            if (this.velocidad + velocidad <= velocidadMaxima) {
                this.velocidad += velocidad;
            } else {
                System.out.println("No se puede superar la velocidad maxima");
            }
        } else {
            System.out.println("El vehiculo no está en movimiento");
        }
    }

    @Override
    public void frenar() {
        if (enMovimiento && velocidad > 10) {
            this.velocidad -= 10;
            System.out.println("Frenando vehiculo. Nueva velocidad es" + this.velocidad);
        }
    }

    @Override
    public void detener() {
        while(velocidad >= 10) {
            frenar();
        }
        velocidad = 0;
        enMovimiento = false;
    }

    public int getVelocidadActual() {
        return velocidad;
    }

    public String getMarca() {
        return marca;
    }


    public String obtenerEstado() {
        if (enMovimiento) {
            return "Vehiculo en movimiento, velocidad actual es:" + this.velocidad;
        } else {
            return "Vehiculo detenido";
        }
    }
}
