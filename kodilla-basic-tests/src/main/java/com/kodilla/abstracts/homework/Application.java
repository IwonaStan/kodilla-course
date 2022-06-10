package com.kodilla.abstracts.homework;
import java.util.Scanner;

class Application {
    public static void main (String[] args) {

        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter S to find the square,");
        System.out.println("Enter R to find the rectangle,");
        System.out.println("Enter C to find the circle:");
        String letter = scanner.nextLine().trim().toUpperCase();

        switch (letter) {
            case "S" :
                System.out.println("Enter the side of the square:");
                double side = scanner.nextDouble();
                square.area(side, side);
                square.circuit(side, side);
                scanner.close();
                break;
            case "R" :
                System.out.println("Enter the side 'a' of the rectangle:");
                double sideA = scanner.nextDouble();
                System.out.println("Enter the side 'b' of the rectangle:");
                double sideB = scanner.nextDouble();
                rectangle.area(sideA, sideB);
                rectangle.circuit(sideA, sideB);
                scanner.close();
                break;
            case "C" :
                System.out.println("Enter radius of the circle:");
                double radius= scanner.nextDouble();
                circle.area(radius, radius);
                circle.circuit(radius, radius);
                scanner.close();
                break;
            default: System.out.println("Wrong choice.");
                     scanner.close();
        }

    }
}
