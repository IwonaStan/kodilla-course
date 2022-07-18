package collections.Interfaces.Homework;

public class Fiat implements Car {

    int speedPlus;
    int speedMinus;
    int speedTotal;

    public Fiat (int speedPlus, int speedMinus) {
        this.speedPlus = speedPlus;
        this.speedMinus = speedMinus;
        this.speedTotal = 0;
      }

    public void increaseSpeed() { speedTotal += speedPlus; }
    public void decreaseSpeed() { speedTotal -= speedMinus; }
    public int getSpeed() { return speedTotal; }
    public int getSpeedPlus() { return speedPlus; }
    public int getSpeedMinus() { return speedMinus; }
}