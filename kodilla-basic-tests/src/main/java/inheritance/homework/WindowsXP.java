package inheritance.homework;

public class WindowsXP extends OperatingSystem {

    public WindowsXP() {
        super(2001);
    }

    @Override
    public void turnOn() {
        System.out.println("System can't be turned on, because is too old.");
    }
}
