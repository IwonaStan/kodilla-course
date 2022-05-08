package com.kodilla.abstracts.homework;

public abstract class Job {

    private double salary;
    private String responsibilities;

    public Job (double salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    @Override
    public String toString() {
        return "salary: " + salary +" PLN \n"+ responsibilities;
    }

    public String getResponsibilities() {
        return responsibilities;
    }
}
