package parametrized_tests.Homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import parametrized_tests.Homework.GamblingMachine;
import parametrized_tests.Homework.InvalidNumbersException;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class GamblingMachineTestSuite {

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMchineSets.csv",numLinesToSkip = 0)
    public void GamblingMachineTest (String numbers) {

        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> check = new HashSet<>();

        String[] numb = numbers.split(" ");
        for (String test : numb) {
            check.add(Integer.valueOf(test));
        }
        System.out.println(check);

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(check));
    }
}