package com.kodilla.stream.com.kodilla.optional.Homework;

public class Teacher {
    String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return " Teacher: " + name;
    }
}
