package com.betek.backend7.sesion9.segregation.ejemplo2;

public class Thermostat implements HomeDevice {
    @Override
    public void turnOn() {
        System.out.println("Turning on the thermostat...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the thermostat...");
    }

    @Override
    public void adjustSettings() {
        System.out.println("Adjusting thermostat settings...");
    }

    @Override
    public void startRecording() {
        // Thermostats cannot record, so this method is not used
        throw new UnsupportedOperationException("Start recording not supported by Thermostat");
    }

    @Override
    public void stopRecording() {
        // Thermostats cannot record, so this method is not used
        throw new UnsupportedOperationException("Stop recording not supported by Thermostat");
    }
}
