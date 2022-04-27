package com.kodilla.abstracts.homework;

public class Person {

    private String job;
    private String firstName;
    private int age;

    public Person (String job, String firstName, int age) {
        this.job = job;
        this.firstName = firstName;
        this.age = age;
    }

    public void setJob(String job) { this.job = job;}
    public void setFirstName(String firstName) { this.firstName = firstName;}
    public void setAge(int age) { this.age = age;}

    public String getJob() { return job; }
    public String getFirstName() { return firstName;}
    public int getAge() { return age;}

    public void print() {
        System.out.println("Salary:" + Job.getSalary() + "\n" + Job.getResponsibilities());
    }
}