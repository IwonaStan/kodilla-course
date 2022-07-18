package inheritance.homework;

public class OperatingSystem {

    public int yearOfPublishment;

    public OperatingSystem (int yearOfPublishment) {
        this.yearOfPublishment = yearOfPublishment;
    }

    public void turnOn() {
        System.out.println("The operating system is turned on.");
    }
    public void turnOff() {
        System.out.println("The operating system is turned off.");
    }
    public int getYearOfPublishment() {return yearOfPublishment;}
}
