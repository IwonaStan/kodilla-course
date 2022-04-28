package com.kodilla.abstracts.homework;

public class Person {

    private Job job;
    private String firstName;
    private int age;

    public Person (Job job, String firstName, int age) {
        this.job = job;
        this.firstName = firstName;
        this.age = age;
    }

    public void setFirstName(String firstName) { this.firstName = firstName;}
    public void setAge(int age) { this.age = age;}

    public String getFirstName() { return firstName;}
    public int getAge() { return age;}
}