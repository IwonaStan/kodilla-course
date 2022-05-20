package com.kodilla.parametrized_tests.Homework;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GamblingMachine {

    public int howManyWins(Set<Integer> userNumbers) throws InvalidNumbersException {
        validateNumbers(userNumbers);
        Set<Integer> computerNumbers = generateComputerNumbers();
        int count = 0;
        for (Integer number : userNumbers) {
            if (computerNumbers.contains(number)) {
                count++;
            }
        }
        return count;
    }
    private void validateNumbers(Set<Integer> numbers) throws InvalidNumbersException {
        if (numbers.size() != 6) {
            System.out.println("zly rozmiar seta\n");
            throw new InvalidNumbersException();
        }
        if (numbers.stream().anyMatch(number -> number < 1 || number > 49)) {
            System.out.println("liczba spoza zakresu\n");
            throw new InvalidNumbersException();
        }
    }
    private Set<Integer> generateComputerNumbers() {
        Set<Integer> numbers = new HashSet<>();
        Random generator = new Random();
        while(numbers.size() < 6) {
            numbers.add(generator.nextInt(49) + 1);
        }
        return numbers;
    }
}
