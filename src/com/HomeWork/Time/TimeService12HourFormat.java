package com.HomeWork.Time;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


public class TimeService12HourFormat implements TimeService{
    @Override
    public int getCurrentTime() {
       int hour = LocalDateTime.now().getHour();
        return hour > 12 ? hour - 12 : hour;
    }
}
