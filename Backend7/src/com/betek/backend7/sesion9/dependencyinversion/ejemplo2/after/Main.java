package com.betek.backend7.sesion9.dependencyinversion.ejemplo2.after;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Johannes", "sms");
        Customer customer2 = new Customer("Mariana", "email");
        Customer customer3 = new Customer("Yesica", "fax");

        Notification notification = new Notification();

        notification.sendNotification("Hola", customer1);
        notification.sendNotification("Hola", customer2);
        notification.sendNotification("Hola", customer3);
    }
}
