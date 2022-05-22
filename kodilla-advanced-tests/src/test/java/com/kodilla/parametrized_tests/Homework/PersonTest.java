package com.kodilla.parametrized_tests.Homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.Homework.PersonSources#getBMI")
    void getBMI1(double height, double weight) {
        Person person = new Person(height, weight);
        assertEquals("Very severely underweight", person.getBMI());
    }
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.Homework.PersonSources#getBMI")
    void getBMI2(double height, double weight) {
        Person person = new Person(height, weight);
        assertEquals("Severely underweight", person.getBMI());
    }
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.Homework.PersonSources#getBMI")
    void getBMI3(double height, double weight) {
        Person person = new Person(height, weight);
        assertEquals("Underweight", person.getBMI());
    }
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.Homework.PersonSources#getBMI")
    void getBMI4(double height, double weight) {
        Person person = new Person(height, weight);
        assertEquals("Normal (healthy weight)", person.getBMI());
    }
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.Homework.PersonSources#getBMI")
    void getBMI5(double height, double weight) {
        Person person = new Person(height, weight);
        assertEquals("Overweight", person.getBMI());
    }
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.Homework.PersonSources#getBMI")
    void getBMI6(double height, double weight) {
        Person person = new Person(height, weight);
        assertEquals("Obese Class I (Moderately obese)", person.getBMI());
    }
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.Homework.PersonSources#getBMI")
    void getBMI7(double height, double weight) {
        Person person = new Person(height, weight);
        assertEquals("Obese Class II (Severely obese)", person.getBMI());
    }
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.Homework.PersonSources#getBMI")
    void getBMI8(double height, double weight) {
        Person person = new Person(height, weight);
        assertEquals("Obese Class III (Very severely obese)", person.getBMI());
    }
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.Homework.PersonSources#getBMI")
    void getBMI9(double height, double weight) {
        Person person = new Person(height, weight);
        assertEquals("Obese Class IV (Morbidly Obese)", person.getBMI());
    }
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.Homework.PersonSources#getBMI")
    void getBMI10(double height, double weight) {
        Person person = new Person(height, weight);
        assertEquals("Obese Class V (Super Obese)", person.getBMI());
    }
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.Homework.PersonSources#getBMI")
    void getBMI11(double height, double weight) {
        Person person = new Person(height, weight);
        assertEquals("Obese Class VI (Hyper Obese)", person.getBMI());
    }
}