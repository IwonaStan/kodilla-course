package com.kodilla.collections.arrays.Homework;

import Interfaces.Homework.Car;
import Interfaces.Homework.Fiat;
import Interfaces.Homework.Polonez;
import Interfaces.Homework.Trabant;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("+-+ +-+-+ +-+ +-+-+ +-+");
        System.out.println("Car model: " +getCarModel(car));
        System.out.println("Increasing speed: " +car.increaseSpeed());
        System.out.println("Decreasing speed: " +car.decreaseSpeed());
    }
    private static String getCarModel(Car car) {
        if (car instanceof Polonez)
            return "Polonez";
        else if (car instanceof Fiat)
            return "Fiat";
        else if (car instanceof Trabant)
            return "Trabant";
        else
            return "Unknown car model.";
    }
}
