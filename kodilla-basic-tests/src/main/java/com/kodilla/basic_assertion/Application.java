package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        // dodawanie liczb
        int a = 5;
        int b = 8;
        int sumResult = calculator.add(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda add działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda add nie działa poprawnie dla liczb " + a + " i " + b);
        }
        //odejmowanie liczb
        a = 12;
        b = 8;
        int subResult = calculator.sub(a, b);
        correct = ResultChecker.assertEquals(4, subResult);
        if (correct) {
            System.out.println("Metoda sub działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sub nie działa poprawnie dla liczb " + a + " i " + b);
        }
        //potęga liczby
        a = 8;
        int powResult = calculator.pow(a);
        correct = ResultChecker.assertEquals(64, powResult);
        if (correct) {
            System.out.println("Metoda pow działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda pow nie działa poprawnie dla liczby " + a);
        }
    }
}
