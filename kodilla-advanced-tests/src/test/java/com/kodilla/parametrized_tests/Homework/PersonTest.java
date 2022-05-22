package com.kodilla.parametrized_tests.Homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.Homework.PersonSources#getBMI")
    void getBMI(double weight, double height) {
        Person person = new Person(weight, height);
        assertEquals("Very severely underweight", person.getBMI());
    }
}