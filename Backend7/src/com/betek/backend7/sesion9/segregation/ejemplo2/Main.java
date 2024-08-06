package com.betek.backend7.sesion9.segregation.ejemplo2;

public class Main {
    public static void main(String[] args) {
        HomeAutomationController controller = new HomeAutomationController();

        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        SecurityCamera securityCamera = new SecurityCamera();

        controller.addDevice(light);
        controller.addDevice(thermostat);
        controller.addDevice(securityCamera);

        controller.turnOnAllDevices();
        controller.turnOffAllDevices();

        controller.adjustAllDevices();
        controller.startRecordingAllDevices();
        controller.stopRecordingAllDevices();
    }
}
