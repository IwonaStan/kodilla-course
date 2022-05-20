package com.kodilla.parametrized_tests.Homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class GamblingMachineTestSuite {

    @ParameterizedTest
    @ValueSource(strings = {"C:\\Users\\HP\\IdeaProjects\\codilla-course\\kodilla-advanced-tests\\src\\test\\resources\\tooSmallSize.csv", "C:\\Users\\HP\\IdeaProjects\\codilla-course\\kodilla-advanced-tests\\src\\test\\resources\\tooBigSize.csv", "C:\\Users\\HP\\IdeaProjects\\codilla-course\\kodilla-advanced-tests\\src\\test\\resources\\tooSmallNumber.csv", "C:\\Users\\HP\\IdeaProjects\\codilla-course\\kodilla-advanced-tests\\src\\test\\resources\\tooBigNumber.csv"})
    public void GamblingMachineTestSuite (String path) throws FileNotFoundException {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> check = new HashSet<>();
        Scanner in = new Scanner(new File(path));
        String number;
        while (in.hasNextLine()) {
            number = in.nextLine();
            check.add(Integer.valueOf(number));
        }
        System.out.println(check);

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(check));
    }
}
