import java.util.Scanner;
public class UserDialogs {

    public static String getUsername() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine().trim();
            if (name.length() >= 2) {
                scanner.close();
                return name;
            }
            System.out.println("Name is too short. Try again.");
        }
    }

    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select calculation (A-add, S-subtract, D-divide, M-multiply):");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "A":                 scanner.close(); return "ADD"; 
                case "S":                 scanner.close(); return "SUB";
                case "D":                 scanner.close(); return "DIV";
                case "M":                 scanner.close(); return "MUL";
                default:
                    System.out.println("Wrong calculation. Try again.");
                    scanner.close();
            }
        }
    }

    public static int getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int val = scanner.nextInt();
        scanner.close();
        return val;
    }
}