package com.betek.backend7.sesion9.segregation.ejemplo2;

public class Light implements HomeDevice {
    @Override
    public void turnOn() {
        System.out.println("Turning on the light...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the light...");
    }

    @Override
    public void adjustSettings() {
        // Lights do not have adjustable settings, so this method is not used
        throw new UnsupportedOperationException("Adjust settings not supported by Light");
    }

    @Override
    public void startRecording() {
        // Lights cannot record, so this method is not used
        throw new UnsupportedOperationException("Start recording not supported by Light");
    }

    @Override
    public void stopRecording() {
        // Lights cannot record, so this method is not used
        throw new UnsupportedOperationException("Stop recording not supported by Light");
    }
}

