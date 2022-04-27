package com.kodilla.abstracts.homework;

public abstract class Job {

    private static double salary;
    private static String responsibilities;

    public Job (double salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public static double setSalary(double salary) {
        return salary;
    }
    public static String setResponsibilities(String responsibilities) {
        return responsibilities;
    }

    public static double getSalary() {
        return salary;
    }
    public static String getResponsibilities() {
        return responsibilities;
    }
}
