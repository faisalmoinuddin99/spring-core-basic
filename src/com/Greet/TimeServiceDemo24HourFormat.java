package com.Greet;

import com.Greet.TimeServiceDemo;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TimeServiceDemo24HourFormat implements TimeServiceDemo {
    @Override
    public int getCurrentTime() {
        return LocalDateTime.now().getHour();
    }
}
