package Interfaces.Homework;

public class Fiat implements Car {

    private static double speed;

    public Fiat () {
        this.speed = 0;
    }

    public void increaseSpeed() {
        this.speed += 25;
    }
    public void decreaseSpeed() {
        this.speed -= 20;
    }
    public double getSpeed() {
        return speed;
    }
}
