package Interfaces.Homework;

public class CarRace {
    public static void main(String[] args) {

        Polonez polonez = new Polonez();
        doRace (polonez);
        Fiat fiat = new Fiat();
        doRace(fiat);
        Trabant trabant = new Trabant();
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
