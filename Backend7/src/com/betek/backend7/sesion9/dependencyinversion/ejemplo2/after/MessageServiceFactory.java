package com.betek.backend7.sesion9.dependencyinversion.ejemplo2.after;

public class MessageServiceFactory {

    public static MessageService getMessageService(String messageServiceName) {

        if ("sms".equals(messageServiceName)) {
            return new SMSMessageService();
        } else if ("email".equals(messageServiceName)) {
            return new EMailMessageService();
        } else {
            throw new IllegalArgumentException("Message Service desconocido");
        }
    }
}
