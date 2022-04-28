package Interfaces.Homework;

public class Polonez implements Car {

    private static double speed;

    public Polonez() {
        this.speed = 0;
    }

    public void increaseSpeed() {
        this.speed += 30;
    }
    public void decreaseSpeed() {
        this.speed -= 15;
    }
    public double getSpeed() {
        return speed;
    }
}
