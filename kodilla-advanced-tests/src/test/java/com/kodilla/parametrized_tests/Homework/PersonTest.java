package com.kodilla.parametrized_tests.Homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.Homework.PersonSources#getBMI")
    void getBMI1(double weight, double height) {
        Person person = new Person(weight, height);
        assertEquals("Very severely underweight", person.getBMI());
    }
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.Homework.PersonSources#getBMI")
    void getBMI2(double weight, double height) {
        Person person = new Person(weight, height);
        assertEquals("Severely underweight", person.getBMI());
    }
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.Homework.PersonSources#getBMI")
    void getBMI3(double weight, double height) {
        Person person = new Person(weight, height);
        assertEquals("Underweight", person.getBMI());
    }
}