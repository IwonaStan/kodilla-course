package collections.arrays.Homework;

import collections.Interfaces.Homework.Car;
import collections.Interfaces.Homework.Fiat;
import collections.Interfaces.Homework.Polonez;
import collections.Interfaces.Homework.Trabant;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {

        CarUtils carUtils = new CarUtils();
        Random random = new Random();
        int size = random.nextInt(15);
        Car[] car = new Car[size];
        for (int i=0; i< car.length; i++)
            car[i] = drawCar();
        for (Car car1 : car)
            carUtils.describeCar(car1);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawCarModel = random.nextInt(3);
        int speed1 = random.nextInt() * 100 +1;
        int speed2 = random.nextInt() * 100 +1;
        if (drawCarModel == 0)
            return new Polonez(speed1,speed2);
        else if (drawCarModel== 1)
            return new Fiat(speed1,speed2);
        else
            return new Trabant(speed1,speed2);
    }
}
