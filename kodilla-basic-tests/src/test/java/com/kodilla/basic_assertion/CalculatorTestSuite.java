package com.kodilla.basic_assertion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
     @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 8;
        double sumResult = calculator.add(a, b);
        assertEquals(13, sumResult);
    }
   @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        double a = 12;
        double b = 8;
        double subResult = calculator.sub(a, b);
        assertEquals(4, subResult);
    }
    @Test
    public void testPow() {
        Calculator calculator = new Calculator();
        double a = 0;
        double powResult = calculator.pow(a);
        assertEquals(0, powResult);
    }
}