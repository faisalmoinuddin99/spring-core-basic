package com.HomeWork.Time;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TimeService24HourFormat implements TimeService{
    @Override
    public int getCurrentTime() {
        return LocalDateTime.now().getHour();
    }
}
