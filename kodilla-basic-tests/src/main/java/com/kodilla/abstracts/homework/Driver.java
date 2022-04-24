package com.kodilla.abstracts.homework;

public class Driver extends Job {

    double salary_Dr;
    String responsibilities_Dr;

    public Driver(double salary, String responsibilities) {
        super(salary, responsibilities);
        this.salary_Dr = salary;
        this.responsibilities_Dr = responsibilities;
    }

    @Override
    public double getSalary() {
        salary_Dr = 5020.00;
        return salary_Dr;
    }
    @Override
    public String getResponsibilities() {
        responsibilities_Dr = "\n-Drive from town to town.\n-Avoid traffic jams.";
        return responsibilities_Dr;
    }
}
