package com.kodilla.abstracts.homework;

public class Doctor extends Job {

    public Doctor (double salary, String responsibilities) {
        super(salary, responsibilities);

        Job.setSalary(salary);
        Job.setResponsibilities(responsibilities);
    }
}
