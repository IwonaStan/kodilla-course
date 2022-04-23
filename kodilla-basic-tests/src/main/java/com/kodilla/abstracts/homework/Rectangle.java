package com.kodilla.abstracts.homework;
public class Rectangle extends Shape {

    @Override
    public void circuit(double sidA, double sidB) {
        System.out.println("Circuit of the rectangle is: " +(2*(sidA+sidB)));
    }
    @Override
    public void area(double sidA, double sidB) {
        System.out.println("Area of the rectangle is: " +(sidA*sidB));
    }

}
