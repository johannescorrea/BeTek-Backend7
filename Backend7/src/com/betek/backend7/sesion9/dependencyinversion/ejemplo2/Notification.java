package com.betek.backend7.sesion9.dependencyinversion.ejemplo2;

public class Notification {
    private EmailService emailService = new EmailService();
    private SMSService smsService = new SMSService();

    public void sendNotification(String message) {
        emailService.sendEmail(message);
        smsService.sendSMS(message);
    }
}
