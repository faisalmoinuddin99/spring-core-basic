package com.geek.example;

import java.util.List;
import java.util.function.Consumer;

public class Email implements Notification{
    @Override
    public void notifyUser(List<String> names) {
        Consumer<String> message = i->{
            System.out.println("Via Email notification " + i);
        } ;
        names.forEach(message);
    }
}
