package com.betek.backend7.sesion9.segregation.ejemplo2;

public class SecurityCamera implements HomeDevice {
    @Override
    public void turnOn() {
        System.out.println("Turning on the security camera...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the security camera...");
    }

    @Override
    public void adjustSettings() {
        // Security cameras do not have adjustable settings, so this method is not used
        throw new UnsupportedOperationException("Adjust settings not supported by Security Camera");
    }

    @Override
    public void startRecording() {
        System.out.println("Starting recording...");
    }

    @Override
    public void stopRecording() {
        System.out.println("Stopping recording...");
    }
}
