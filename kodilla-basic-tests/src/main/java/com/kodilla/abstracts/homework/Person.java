package com.kodilla.abstracts.homework;
import java.util.Scanner;

public class Person {
    public static void main(String[] args) {

        String firstName[] = {"Jan", "Piotr", "Paweł"};
        int age[] = {20, 30, 40};
        String job[] = {"Teacher", "Doctor", "Driver"};

    Teacher teacher = new Teacher(0,"");
    Doctor doctor = new Doctor(0,"");
    Driver driver = new Driver(0,"");
    Scanner scanner = new Scanner(System.in);

    System.out.println("Podaj ID There are" +firstName.length+" people in the base. Enter person ID:");
        int i = scanner.nextInt();

    switch (i) {
        case 1:
            System.out.println("Name:"+firstName[i-1]+" Age:"+age[i-1]+" Job:"+job[i-1]+
                    "\nSalary:"+teacher.getSalary()+"PLN\nResponsibilities:" +teacher.getResponsibilities());
            break;
        case 2:
            System.out.println("Name:"+firstName[i-1]+" Age:"+age[i-1]+" Job:"+job[i-1]+
                    "\nSalary:"+doctor.getSalary()+"PLN\nResponsibilities:" +doctor.getResponsibilities());
            break;
        case 3:
            System.out.println("Name:"+firstName[i-1]+" Age:"+age[i-1]+" Job:"+job[i-1]+
                    "\nSalary:"+driver.getSalary()+"PLN\nResponsibilities:" +driver.getResponsibilities());
            break;
        default: System.out.println("Wrong choice.");
    }

    }
}
