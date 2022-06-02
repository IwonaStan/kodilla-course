package com.kodilla.spring.basic.dependency_injection.Homework_Spring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class CalculatorTest {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        Calculator bean = context.getBean(Calculator.class);
        double c;

    @Test
    public void shouldAddCorrectly() {
        c = bean.add(20.00,60.66);
        Assertions.assertEquals(80.66, c);
    }
    @Test
    public void shouldSubtractCorrectly() {
        c = bean.subtract(55.55,11.11);
        Assertions.assertEquals(44.44, c);
    }
    @Test
    public void shouldMultiplyCorrectly() {
        c = bean.multiply(33.30,2.2);
        Assertions.assertEquals(73.26, c);
    }
    @Test
    public void shouldDivideCorrectly() {
        c = bean.divide(73.26,2.2);
        Assertions.assertEquals(33.30, c);
    }
}