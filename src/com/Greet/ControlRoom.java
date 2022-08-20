package com.Greet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ControlRoom {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.Greet");
        GreetingService greetingService = (GreetingService) context.getBean("greetInEnglish");
        greetingService.greet("faisal");
    }
}
