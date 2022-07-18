package basic_assertion;

public class Application {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        // dodawanie liczb
        double a = 5;
        double b = 8;
        double sumResult = calculator.add(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult, 3);
        if (correct) {
            System.out.println("Metoda add działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda add nie działa poprawnie dla liczb " + a + " i " + b);
        }
       //odejmowanie liczb
        a = 12;
        b = 8;
        double subResult = calculator.sub(a, b);
        correct = ResultChecker.assertEquals(4, subResult,3);
        if (correct) {
            System.out.println("Metoda sub działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sub nie działa poprawnie dla liczb " + a + " i " + b);
        }
        //potęga liczby
        a = -2;
        double powResult = calculator.pow(a);
        correct = ResultChecker.assertEquals(4, powResult,3);
        if (correct) {
            System.out.println("Metoda pow działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda pow nie działa poprawnie dla liczby " + a);
        }
    }
}
