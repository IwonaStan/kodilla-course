package com.kodilla.parametrized_tests.Homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {

    static Stream<Arguments> getBMI() {
        return Stream.of(
                Arguments.of(1.7, 40),
                Arguments.of(1.7, 45),
                Arguments.of(1.7, 50),
                Arguments.of(1.7, 55),
                Arguments.of(1.7, 75),
                Arguments.of(1.7, 90),
                Arguments.of(1.7, 105),
                Arguments.of(1.7, 120),
                Arguments.of(1.7, 135),
                Arguments.of(1.7, 150),
                Arguments.of(1.7, 190)
        );
    }
}
