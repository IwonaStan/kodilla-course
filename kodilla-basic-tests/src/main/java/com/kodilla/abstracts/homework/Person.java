package com.kodilla.abstracts.homework;
import java.util.Scanner;

public class Person {
    public static void main(String[] args) {

        String firstName[] = {"Jan", "Piotr", "Paweł"};
        int age[] = {20, 30, 40};
        String job[] = {"Teacher", "Doctor", "Driver"};

    Teacher teacher = new Teacher(2500.32,"\n-Teach teach students.\n-Make tests.");
    Doctor doctor = new Doctor(8800.25,"\n-Heal people.\n-Make injections.");
    Driver driver = new Driver(5020.00,"\n-Drive from town to town.\n-Avoid traffic jams.");
    Scanner scanner = new Scanner(System.in);

    System.out.println("Podaj ID There are" +firstName.length+" people in the base. Enter person ID:");
        int i = scanner.nextInt();

    switch (i) {
        case 1:
            System.out.println("Name:"+firstName[i-1]+" Age:"+age[i-1]+" Job:"+job[i-1]+
                    "\nSalary:"+teacher.salary+"PLN\nResponsibilities:" +teacher.responsibilities);
            break;
        case 2:
            System.out.println("Name:"+firstName[i-1]+" Age:"+age[i-1]+" Job:"+job[i-1]+
                    "\nSalary:"+doctor.salary+"PLN\nResponsibilities:" +doctor.responsibilities);
            break;
        case 3:
            System.out.println("Name:"+firstName[i-1]+" Age:"+age[i-1]+" Job:"+job[i-1]+
                    "\nSalary:"+driver.salary+"PLN\nResponsibilities:" +driver.responsibilities);
            break;
        default: System.out.println("Wrong choice.");
    }

    }
}
