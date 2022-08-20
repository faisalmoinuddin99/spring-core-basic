package com.Greet;

import com.Greet.TimeServiceDemo;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TimeService12HourFormatDemo implements TimeServiceDemo {
    @Override
    public int getCurrentTime() {
       int hour = LocalDateTime.now().getHour();
        return hour > 12 ? hour - 12 : hour;
    }
}
