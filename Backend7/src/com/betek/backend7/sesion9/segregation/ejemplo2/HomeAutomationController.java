package com.betek.backend7.sesion9.segregation.ejemplo2;

import java.util.ArrayList;
import java.util.List;

public class HomeAutomationController {
    private List<HomeDevice> devices = new ArrayList<>();

    public void addDevice(HomeDevice device) {
        devices.add(device);
    }

    public void turnOnAllDevices() {
        for (HomeDevice device : devices) {
            device.turnOn();
        }
    }

    public void turnOffAllDevices() {
        for (HomeDevice device : devices) {
            device.turnOff();
        }
    }

    public void adjustAllDevices() {
        for (HomeDevice device : devices) {
            try {
                device.adjustSettings();
            } catch (UnsupportedOperationException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void startRecordingAllDevices() {
        for (HomeDevice device : devices) {
            try {
                device.startRecording();
            } catch (UnsupportedOperationException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void stopRecordingAllDevices() {
        for (HomeDevice device : devices) {
            try {
                device.stopRecording();
            } catch (UnsupportedOperationException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
