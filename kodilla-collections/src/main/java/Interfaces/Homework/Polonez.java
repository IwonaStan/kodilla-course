package Interfaces.Homework;

public class Polonez implements Car {

    double speedPlus;
    double speedMinus;
    double speedTotal;

    public Polonez (double speedPlus, double speedMinus) {
        this.speedPlus = speedPlus;
        this.speedMinus = speedMinus;
        this.speedTotal = 0;
    }

    public double increaseSpeed() { this.speedTotal += this.speedPlus; return speedTotal; }
    public double decreaseSpeed() { this.speedTotal -= this.speedMinus; return speedTotal; }
    public double getSpeed() {
        return speedTotal;
    }
}