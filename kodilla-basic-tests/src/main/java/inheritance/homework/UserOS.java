package inheritance.homework;
import java.util.Scanner;

public class UserOS {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select one of the options A or B");
        String letter = scanner.nextLine().trim().toUpperCase();

        WindowsXP windowsxp = new WindowsXP();
        Windows8 windows8 = new Windows8();

        switch (letter) {
            case "A":
                System.out.println("Windows XP was published in " +windowsxp.yearOfPublishment);
                System.out.println("Attempt to turn on the system...");
                windowsxp.turnOn();
                windowsxp.turnOff();
                scanner.close();
            break;
            case "B":
                System.out.println("Windows 8 was published in " +windows8.yearOfPublishment);
                System.out.println("Attempt to turn on the system...");
                windows8.turnOn();
                windows8.turnOff();
                scanner.close();
            break;
            default: System.out.println("Wrong choice.");
                     scanner.close();
        }
    }
}
