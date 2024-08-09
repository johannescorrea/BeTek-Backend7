package com.betek.backend7.sesion9.dependencyinversion.ejemplo2;

public class  Main {
    public static void main(String[] args) {
        Notification notification = new Notification();
        notification.sendNotification("Hello, this is a test message!");

        /*
        1. Queremos que las notificaciones dependan de las preferencias del cliente
        2. El cliente puede decidir si quiere recibir la notificacion via SMS o EMAIL, de forma excluyente
         */
    }
}
