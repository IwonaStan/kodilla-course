package spring.basic.spring_configuration.Homework;

public class Sedan implements Car {

    @Override
    public String getCarType() {
        return ("Hello, this is Sedan");
    }
    @Override
    public boolean hasHeadlightsTurnedOn(int time) {
        if (time > 6 && time < 22) {
            return true;
        }
        else {
            return false;
        }
    }
}
