package com.Greet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ControlRoom {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.Greet");
        GreetingService greetingService1 = (GreetingService) context.getBean("greetInEnglish");
        GreetingService greetingService2 = (GreetingService) context.getBean("greetInEnglish") ;
//        greetingService1.greet("faisal");
        System.out.println(greetingService1 == greetingService2); // true
    }
}
