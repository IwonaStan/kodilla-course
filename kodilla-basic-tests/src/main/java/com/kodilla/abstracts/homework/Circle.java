package com.kodilla.abstracts.homework;
public class Circle extends Shape {

    final double PI = 3.14159;

    @Override
    public void circuit(double r, double r1) {
        System.out.println("Circuit of the circle is: " +(2*PI*r));
    }
    @Override
    public void area(double r, double r1) {
        System.out.println("Area of the circle is: " +(PI*(r*r)));
    }
}
