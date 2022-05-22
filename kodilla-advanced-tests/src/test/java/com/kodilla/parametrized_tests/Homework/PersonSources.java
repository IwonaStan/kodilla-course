package com.kodilla.parametrized_tests.Homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {

    static Stream<Arguments> getBMI() {
        return Stream.of(
                Arguments.of(40, 170),
                Arguments.of(45, 170),
                Arguments.of(50, 170),
                Arguments.of(55, 170),
                Arguments.of(75, 170),
                Arguments.of(90, 170),
                Arguments.of(105, 170),
                Arguments.of(120, 170),
                Arguments.of(135, 170),
                Arguments.of(150, 170),
                Arguments.of(190, 170)
        );
    }
}
