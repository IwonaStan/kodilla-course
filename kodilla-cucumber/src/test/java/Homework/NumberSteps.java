package Homework;

import io.cucumber.java8.En;
import org.junit.Assert;

public class NumberSteps implements En {

    private int number;
    private String answer;

    public NumberSteps() {
        Given("6", () -> {
            this.number = 6;
        });
        Given("10", () -> {
            this.number = 10;
        });
        Given("15", () -> {
            this.number = 15;
        });
        Given("4", () -> {
            this.number = 4;
        });
        Given("8", () -> {
            this.number = 8;
        });
        Given("11", () -> {
            this.number = 11;
        });

        When("I ask is divisible", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.checkNumber(this.number);
        });
        Then("I should told {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}
