package com.geek.example;

public class NotificationServiceFactory {
    public Notification getNotificationService(String medium){
        if (medium.equals("sms")){
            return new SMS() ;
        }else if(medium.equals("email")) {
            return new Email() ;
        }else if(medium.equals("push")){
            return new PushNotification() ;
        }else {
            throw new RuntimeException("Service not available") ;
        }
    }
}
