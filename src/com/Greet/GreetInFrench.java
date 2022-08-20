package com.Greet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GreetInFrench implements GreetingService{

    @Autowired
    @Qualifier("timeServiceDemo24HourFormat")
    private TimeServiceDemo timeServiceDemo ;

    @Override
    public void greet(String name) {
       int time = timeServiceDemo.getCurrentTime() ;
       String greetingMessage ;

       if (time < 17) {
           greetingMessage = "Bonjour" ;
       }else{
           greetingMessage = "Bonsoir" ;
       }
        System.out.println(greetingMessage + ", "+ name);
    }

}
