package com.HomeWork.Time;

public class TimeServiceFactory {
    public TimeService getTimeService(String format){
        if (format.equals("12hour")){
            return new TimeService12HourFormat() ;
        }else if (format.equals("24hour")){
            return new TimeService24HourFormat() ;
        }else {
            throw new RuntimeException("No time service exist") ;
        }
    }
}
