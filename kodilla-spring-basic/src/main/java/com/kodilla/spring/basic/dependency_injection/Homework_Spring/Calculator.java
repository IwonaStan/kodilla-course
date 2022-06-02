package com.kodilla.spring.basic.dependency_injection.Homework_Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    Display display;
    @Autowired
    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        return (display.display(a+b));
    }
    public double subtract(double a, double b) {
        return (display.display(a-b));
    }
    public double multiply(double a, double b) {
        return (display.display(a*b));
    }
    public double divide(double a, double b) {
        return (display.display(a/b));
    }
}
