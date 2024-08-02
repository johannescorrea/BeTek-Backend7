package com.betek.backend7.sesion4.ejercicio3;

public abstract class BaseEmpleado implements Empleado {

    private String nombre;
    private double salarioBase;
    private double porcentajeBonificacion;

    public BaseEmpleado(String nombre, double salarioBase, double porcentajeBonificacion) {
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
        return salarioBase + calcularBonificacion() + calcularHorasExtras();
    }

    public double calcularBonificacion() {
        return salarioBase * porcentajeBonificacion;
    }

    @Override
    public double calcularHorasExtras() {
        return 0;
    }
}
