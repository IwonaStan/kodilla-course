package com.kodilla.spring.basic.dependency_injection.Homework_Spring;

import org.springframework.stereotype.Component;

@Component
public class Display {

    public double display(double value) {
        System.out.println("-=-=-=-=-=-=-=-");
        System.out.println("    " + value);
        System.out.println("-=-=-=-=-=-=-=-");
        return value;
    }
}
