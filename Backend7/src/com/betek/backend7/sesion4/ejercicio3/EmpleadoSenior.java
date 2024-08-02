package com.betek.backend7.sesion4.ejercicio3;

public class EmpleadoSenior extends BaseEmpleado {
    private int aniosAntiguedad;

    public EmpleadoSenior(String nombre, double salarioBase, double porcentajeBonificacion, int aniosAntiguedad) {
        super(nombre, salarioBase, porcentajeBonificacion);
        this.aniosAntiguedad = aniosAntiguedad;
    }

    @Override
    public double calcularBonificacion(){
        if (aniosAntiguedad >= 2){
            return getSalarioBase() * (getPorcentajeBonificacion() + 0.1);
        } else {
            return super.calcularBonificacion();
        }
    }
}
