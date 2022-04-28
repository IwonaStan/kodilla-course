package Interfaces.Homework;

public class CarRace {
    public static void main(String[] args) {

        Polonez polonez = new Polonez(50,45);
        doRace (polonez);
        Fiat fiat = new Fiat(45,35);
        doRace(fiat);
        Trabant trabant = new Trabant(40,25);
        doRace(trabant);
    }
    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
