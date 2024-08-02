package com.betek.backend7.sesion4.ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {
        Colaborador[] colaboradores = {
                new EmpleadoJunior("Jesus", 1000000d, 0.2), //1.2000.000
                new EmpleadoMid("Carlos", 2000000d, 0.3), //2.600.000
                new EmpleadoSenior("Mariana", 5000000d, 0.3, 1), //6.500.000
                new EmpleadoSenior("Natalia", 5000000d, 0.3, 3), //7.000.000
                new Contratista("Andres", 5000000d, 0.1) // 5.500.000
        };

        Nomina nomina = new Nomina();
        System.out.println("Total Nomina" + nomina.calcularTotalNomina(colaboradores)); //22.800.000
    }
}
