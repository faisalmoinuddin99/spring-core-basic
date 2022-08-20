package com.HomeWork.Time;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ControlRoom {
    public static void main(String[] args) {
        /*
        TimeServiceFactory timeServiceFactory = new TimeServiceFactory();
        TimeService timeService = timeServiceFactory.getTimeService("24hour");
        System.out.println(timeService.getCurrentTime());

         */

        ApplicationContext context = new AnnotationConfigApplicationContext("com.HomeWork.Time") ;
        TimeService timeService1 = (TimeService) context.getBean("timeService24HourFormat");
        System.out.println(timeService1.getCurrentTime());
    }
}
