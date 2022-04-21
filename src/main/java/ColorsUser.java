public class ColorsUser {
    public static void main(String[] args) {

        String a = Colors.getColor();

        switch(a) {
            case "R": System.out.println("Red"); break;
            case "G": System.out.println("Green"); break;
            case "B": System.out.println("Blue"); break;
            default: System.out.println("Wrong choice.");
        }
    }
}
