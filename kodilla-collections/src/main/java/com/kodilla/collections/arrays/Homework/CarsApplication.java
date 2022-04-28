package com.kodilla.collections.arrays.Homework;

import Interfaces.Homework.Car;
import Interfaces.Homework.Fiat;
import Interfaces.Homework.Polonez;
import Interfaces.Homework.Trabant;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {

        Random random = new Random();
        int size = random.nextInt(15);
        Car[] car = new Car[size];
        for (int i=0; i< car.length; i++)
            car[i] = drawCar();
        for (Car car1 : car)
            CarUtils.describeCar(car1);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawCarModel = random.nextInt(3);
        double speed1 = random.nextDouble() * 100 +1;
        double speed2 = random.nextDouble() * 100 +1;
        if (drawCarModel == 0)
            return new Polonez(speed1,speed2);
        else if (drawCarModel== 1)
            return new Fiat(speed1,speed2);
        else
            return new Trabant(speed1,speed2);
    }
}
