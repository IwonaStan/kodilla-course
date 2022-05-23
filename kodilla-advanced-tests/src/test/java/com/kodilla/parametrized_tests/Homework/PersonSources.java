package com.kodilla.parametrized_tests.Homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {

    static Stream<Arguments> getBMI() {
        return Stream.of(
                Arguments.of(1.7, 40, "Very severely underweight"),
                Arguments.of(1.7, 45, "Severely underweight"),
                Arguments.of(1.7, 50, "Underweight"),
                Arguments.of(1.7, 55, "Normal (healthy weight)"),
                Arguments.of(1.7, 75, "Overweight"),
                Arguments.of(1.7, 90, "Obese Class I (Moderately obese)"),
                Arguments.of(1.7, 105, "Obese Class II (Severely obese)"),
                Arguments.of(1.7, 120, "Obese Class III (Very severely obese)"),
                Arguments.of(1.7, 135, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.7, 150, "Obese Class V (Super Obese)"),
                Arguments.of(1.7, 190, "Obese Class VI (Hyper Obese)")
        );
    }
}
