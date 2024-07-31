package com.betek.backend7.sesion4.ejercicio3;

public class Contratista implements Colaborador {

    private String nombre;
    private double salarioBase;
    private double porcentajeBonificacion;

    public Contratista(String nombre, double salarioBase, double porcentajeBonificacion) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.porcentajeBonificacion = porcentajeBonificacion;
    }

    protected double getSalarioBase() {
        return salarioBase;
    }

    protected double getPorcentajeBonificacion() {
        return porcentajeBonificacion;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + calcularBonificacion();
    }

    public double calcularBonificacion() {
        return salarioBase * porcentajeBonificacion;
    }
}
