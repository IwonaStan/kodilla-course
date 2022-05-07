package com.kodilla.abstracts.homework;

public class Person {

    private Job job;
    private String firstName;
    private int age;

    public Person(Job job, String firstName, int age) {
        this.job = job;
        this.firstName = firstName;
        this.age = age;
    }
    public void printJob(Job job) {
        System.out.println(job);
    }
    public Job getJob() {
        return job;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getAge() {
        return age;
    }

}