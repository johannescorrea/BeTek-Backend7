package com.betek.backend7.sesion9.dependencyinversion.ejemplo2.after;

public class EMailMessageService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message by email: " + message);
    }
}
