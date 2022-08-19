package com.HomeWork.Time;

public class ControlRoom {
    public static void main(String[] args) {
        TimeServiceFactory timeServiceFactory = new TimeServiceFactory();
        TimeService timeService = timeServiceFactory.getTimeService("24hour");
        System.out.println(timeService.getCurrentTime());
    }
}
