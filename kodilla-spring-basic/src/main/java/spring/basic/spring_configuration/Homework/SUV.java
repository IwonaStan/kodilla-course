package spring.basic.spring_configuration.Homework;

public class SUV implements Car {

    @Override
    public String getCarType() {
        String type = "Hello, this is SUV";
        return type;
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
