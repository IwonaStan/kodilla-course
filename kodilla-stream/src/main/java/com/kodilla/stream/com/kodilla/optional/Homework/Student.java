package com.kodilla.stream.com.kodilla.optional.Homework;

public class Student {
    String name1;
    Teacher teacher;

    public Student(String name, Teacher teacher) {
        this.name1 = name;
        this.teacher = teacher;
    }

    public String getName1() {
        return name1;
    }
    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "Student: " + name1 + teacher;
    }
}
