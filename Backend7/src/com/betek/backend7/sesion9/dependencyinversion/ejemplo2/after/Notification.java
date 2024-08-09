package com.betek.backend7.sesion9.dependencyinversion.ejemplo2.after;

public class Notification {

    public Notification() {
    }

    public void sendNotification(String message, Customer customer) {
        MessageService messageService = MessageServiceFactory.getMessageService(customer.getServicioNotificacionSeleccionado());
        messageService.sendMessage(message);
    }
}
