package Homework;

public class NumberChecker {

    public String checkNumber(int number) {
        if (number % 3 == 0 || number % 5 == 0 || number % 15 == 0) {
            return "yes";
        }
        return "no";
    }
}
