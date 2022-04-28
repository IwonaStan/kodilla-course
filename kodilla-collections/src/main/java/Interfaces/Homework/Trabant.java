package Interfaces.Homework;

public class Trabant implements Car {

    private static double speed;

    public Trabant () {
        this.speed = 0;
    }

    public void increaseSpeed() {
        this.speed += 15;
    }
    public void decreaseSpeed() {
        this.speed -= 14;
    }
    public double getSpeed() {
        return speed;
    }
}
