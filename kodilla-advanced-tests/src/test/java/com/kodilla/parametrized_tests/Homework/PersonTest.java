package com.kodilla.parametrized_tests.Homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.Homework.PersonSources#getBMI")
    void getBMI1(double height, double weight, String expected) {
        Person person = new Person(height, weight);
        assertEquals(person.getBMI(),expected);
    }
}