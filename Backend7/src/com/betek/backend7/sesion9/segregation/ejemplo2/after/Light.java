package com.betek.backend7.sesion9.segregation.ejemplo2.after;

public class Light implements Encendible {
    @Override
    public void turnOn() {
        System.out.println("Turning on the light...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the light...");
    }
}
