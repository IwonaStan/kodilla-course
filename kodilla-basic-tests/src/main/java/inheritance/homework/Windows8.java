package inheritance.homework;

public class Windows8 extends OperatingSystem {

    public Windows8() {
        super(2012);
    }

    @Override
    public void turnOff() {
        System.out.println("For the next time, update your system to Windows10.");
    }
}
