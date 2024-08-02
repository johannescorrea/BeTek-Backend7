package com.betek.backend7.sesion7.gestionautomotriz;

public class Motocicleta extends VehiculoBase {

    private int cilindraje;

    public Motocicleta(String marca, int velocidadMaxima, int cilindraje) {
        super(marca, velocidadMaxima);
        this.cilindraje = cilindraje;
    }

    //modifiquemos el metodo acelerar para que valide:
    //Si el cilindraje de la moto es < 200, puede acelerar solo hasta un 80% de la velocidad maxima


    @Override
    public void acelerar(int velocidad) {
        if (velocidad > 0) {
            double ochentaPorciento = (double) velocidadMaxima * 0.8;
            if (cilindraje < 200)  {
                if(this.velocidad + velocidad < ochentaPorciento) {
                    super.acelerar(velocidad);
                } else {
                    this.velocidad = (int)ochentaPorciento;
                }
            } else {
                super.acelerar(velocidad);
            }
        }

        super.acelerar(velocidad);
    }
}
