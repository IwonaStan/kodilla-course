package com.kodilla.abstracts.homework;

public class Teacher extends Job {

    double salary_T;
    String responsibilities_T;

    public Teacher(double salary, String responsibilities) {
        super(salary, responsibilities);
        this.salary_T = salary;
        this.responsibilities_T = responsibilities;
    }

    @Override
    public double getSalary() {
        salary_T = 2500.32;
        return salary_T;
    }
    @Override
    public String getResponsibilities() {
        responsibilities_T = "\n-Teach teach students.\n-Make tests.";
        return responsibilities_T;
    }


}
