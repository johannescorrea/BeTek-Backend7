package com.betek.backend7.sesion9.dependencyinversion.ejemplo2;

public class  Main {
    public static void main(String[] args) {
        Notification notification = new Notification();
        notification.sendNotification("Hello, this is a test message!");
    }
}
