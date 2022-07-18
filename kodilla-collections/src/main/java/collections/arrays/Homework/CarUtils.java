package collections.arrays.Homework;

import collections.Interfaces.Homework.Car;
import collections.Interfaces.Homework.Fiat;
import collections.Interfaces.Homework.Polonez;
import collections.Interfaces.Homework.Trabant;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("+-+ +-+-+ +-+ +-+-+ +-+");
        System.out.println("Car model: " +getCarModel(car));
        System.out.println("Increasing speed: " +car.getSpeedPlus());
        System.out.println("Decreasing speed: " +car.getSpeedMinus());
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
