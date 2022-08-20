package org.homework.calculator;

import org.homework.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    @Qualifier("additionService")
    private MathService mathService1 ;

    @Autowired
    @Qualifier("subtractionService")
    private MathService mathService2 ;

    public int compute(String op, int x, int y){
        int result = 0 ;
        if(op.equals("add")) {
          return mathService1.operate(x,y) ;
        }else if(op.equals("sub")) {
            return mathService2.operate(x,y) ;
        }
        throw new RuntimeException(op + " not supported.") ;
    }


}
