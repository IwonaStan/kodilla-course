import java.util.Scanner;
public class Colors {

    public static String getColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter letter: R, G or B:");
        String letter = scanner.nextLine().trim().toUpperCase();
        return letter;
    }

}
