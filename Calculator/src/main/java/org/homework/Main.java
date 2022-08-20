package org.homework;

import org.homework.calculator.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.homework");
        Calculator calculator = (Calculator) context.getBean("calculator");
        int output = calculator.compute("sub", 100, 20);
        System.out.println(output);
    }
}