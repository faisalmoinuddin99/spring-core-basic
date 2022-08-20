package com.Greet;

import com.HomeWork.Time.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class GreetInEnglish implements GreetingService{

    @Autowired
    @Qualifier("timeServiceDemo24HourFormat")
    private TimeServiceDemo timeService ;


    public void greet(String name){
        int time = timeService.getCurrentTime() ;
        String greetMessage ;
        if(time < 12){
            greetMessage = "Good Morning" ;
        }else {
            greetMessage = "Good Afternoon" ;
        }
        System.out.println(greetMessage + ", " + name);
    }
}
