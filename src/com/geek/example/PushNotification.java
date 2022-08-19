package com.geek.example;

import java.util.List;
import java.util.function.Consumer;

public class PushNotification implements Notification{
    @Override
    public void notifyUser(List<String> names) {
        Consumer<String> message = i->{
            System.out.println("Via push notification " + i);
        } ;
        names.forEach(message);
    }
}
