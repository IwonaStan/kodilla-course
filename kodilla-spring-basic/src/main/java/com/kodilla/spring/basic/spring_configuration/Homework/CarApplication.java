package com.kodilla.spring.basic.spring_configuration.Homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class CarApplication {

    @Bean
    public SUV createSUV() {
        return new SUV();
    }
    @Bean
    public Sedan createSedan() {
        return new Sedan();
    }
    @Bean
    public Cabrio createCabrio() {
        return new Cabrio();
    }
    @Bean
    public void randomCar() {
        Car car;
        Random generator = new Random();
        int auto = generator.nextInt(4);
        int time = generator.nextInt(24);

        switch (auto) {
            case 0: {
                System.out.println("-=-=-=-=-=-=-=\n Winter \n-=-=-=-=-=-=-=");
                car = new Sedan();
                car.getCarType();
                System.out.println(car.getCarType());
                car.hasHeadlightsTurnedOn(time);
            }
            break;
            case 1: {
                System.out.println("-=-=-=-=-=-=-=\n Spring \n-=-=-=-=-=-=-=");
                car = new SUV();
                car.getCarType();
                System.out.println(car.getCarType());
                car.hasHeadlightsTurnedOn(time);
            }
            break;
            case 2: {
                System.out.println("-=-=-=-=-=-=-=\n Summer \n-=-=-=-=-=-=-=");
                car = new Cabrio();
                car.getCarType();
                System.out.println(car.getCarType());
                car.hasHeadlightsTurnedOn(time);
            }
            break;
            case 3: {
                System.out.println("-=-=-=-=-=-=-=\n Autumn \n-=-=-=-=-=-=-=");
                car = new SUV();
                car.getCarType();
                System.out.println(car.getCarType());
                car.hasHeadlightsTurnedOn(time);
            }
            break;
            default: break;
        }
    }
}