package com.kodilla.spring.basic.spring_configuration.Homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class CarApplicationTest {
    @Test
    public void ShouldCreateSUVModel () {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        SUV suv = (SUV) context.getBean("createSUV");
        String type = suv.getCarType();
        boolean lights = suv.hasHeadlightsTurnedOn(10);

        Assertions.assertEquals("Hello, this is SUV", type);
        Assertions.assertTrue(lights);
    }
    @Test
    public void ShouldCreateSedanModel () {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Sedan sedan = (Sedan) context.getBean("createSedan");
        String type = sedan.getCarType();
        boolean lights = sedan.hasHeadlightsTurnedOn(10);

        Assertions.assertEquals("Hello, this is Sedan", type);
        Assertions.assertTrue(lights);
    }
    @Test
    public void ShouldCreateCabrioModel () {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Cabrio cabrio  = (Cabrio) context.getBean("createCabrio");
        String type = cabrio.getCarType();
        boolean lights = cabrio.hasHeadlightsTurnedOn(10);

        Assertions.assertEquals("Hello, this is Cabrio", type);
        Assertions.assertTrue(lights);
    }
    @Test
    public void ShouldCreateCar () {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Car car  = (Car) context.getBean("randomCar");
        String type = car.getCarType();

        Assertions.assertNotNull(type);
    }
}