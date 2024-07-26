package com.betek.backend7.sesion1;

public class Ejercicio2 {

    public static void main(String[] args) {
        //Reportar el nombre del mes según el valor numerico entre 1 y 12

        int numeroMes = Integer.parseInt(args[0]);

        switch (numeroMes) {
            case 1: {
                System.out.println("Enero");
                break;
            }
            case 2: System.out.println("Febrero"); break;
            case 3: System.out.println("Marzo"); break;
            case 4: System.out.println("Abril"); break;
            case 5: System.out.println("Mayo"); break;
            case 6: System.out.println("Junio"); break;
            case 7: System.out.println("Julio"); break;
            case 8: System.out.println("Agosto"); break;
            case 9: System.out.println("Septiembre"); break;
            case 10: System.out.println("Octubre"); break;
            case 11: System.out.println("Noviembre"); break;
            case 12: System.out.println("Diciembre"); break;
            default: System.out.println("El numero ingresado no corresponde a un mes del año"); break;
        }
    }
}
