package collections.Interfaces.Homework;

public class Trabant implements Car {

    int speedPlus;
    int speedMinus;
    int speedTotal;

    public Trabant(int speedPlus, int speedMinus) {
        this.speedPlus = speedPlus;
        this.speedMinus = speedMinus;
        this.speedTotal = 0;
    }

    public void increaseSpeed() {
        this.speedTotal += this.speedPlus;
    }

    public void decreaseSpeed() {
        this.speedTotal -= this.speedMinus;
    }

    public int getSpeed() {
        return speedTotal;
    }

    public int getSpeedPlus() {
        return speedPlus;
    }

    public int getSpeedMinus() {
        return speedMinus;
    }
}
