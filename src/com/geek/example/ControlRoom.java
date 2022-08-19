package com.geek.example;

import java.util.ArrayList;
import java.util.List;

public class ControlRoom {
    public static void main(String[] args) {
        NotificationServiceFactory notificationServiceFactory = new NotificationServiceFactory();
        Notification notification = notificationServiceFactory.getNotificationService("push");
        List<String> names = new ArrayList<>();
        names.add("faisal");
        names.add("rahul");
        names.add("yadanesh");
        names.add("mayank");
        notification.notifyUser(names);
    }
}
