package com.betek.backend7.sesion4.ejercicio3;

public class Nomina {

    public double calcularTotalNomina(Colaborador[] colaboradores) {

        double totalNomina = 0;
        for (Colaborador colaborador : colaboradores) {
            totalNomina += colaborador.calcularSalario();
        }
        return totalNomina;
    }
}
