package com.betek.backend7.sesion9.dependencyinversion.ejemplo2;

public class SMSService {
    public void sendSMS(String message) {
        // Logic to send SMS
        System.out.println("SMS sent: " + message);
    }
}
