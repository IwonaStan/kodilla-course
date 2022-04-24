package com.kodilla.abstracts.homework;

public class Doctor extends Job {

    double salary_D;
    String responsibilities_D;

    public Doctor(double salary, String responsibilities) {
        super(salary, responsibilities);
        this.salary_D = salary;
        this.responsibilities_D = responsibilities;
    }

    @Override
    public double getSalary() {
        salary_D = 8800.25;
        return salary_D;
    }
    @Override
    public String getResponsibilities() {
        responsibilities_D = "\n-Heal people.\n-Make injections.";
        return responsibilities_D;
    }
}
