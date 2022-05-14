package com.kodilla.stream.exception;

public class FirstExample {
    public static void main(String[] args) {

        String userName = "John";
        String[] nameParts = userName.split(" ");
        System.out.println("First name: " + nameParts[0]);
        System.out.println("Last name: " + nameParts[1]);
    }
}
