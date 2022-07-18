package parametrized_tests.Homework;

public class InvalidNumbersException extends Exception {
    public InvalidNumbersException() {
        super("Wrong numbers provided");
    }
}
