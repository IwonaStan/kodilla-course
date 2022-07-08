package Wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    Wallet wallet = new Wallet();
    CashSlot cashSlot = new CashSlot();
    Cashier cashier = new Cashier(cashSlot);

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });
        Given("I have deposited $0 in my wallet", () -> {
            wallet.deposit(0);
            Assert.assertEquals("Incorrect wallet balance", 0, wallet.getBalance());
        });
        When("I request $30", () -> {
            cashier.withdraw(wallet, 30);
        });
        When("I request $201", () -> {
            cashier.withdraw(wallet, 201);
        });
        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });
        Then("the balance of my wallet should be $170", () -> {
            Assert.assertEquals("Incorrect wallet balance", 170,  wallet.getBalance());
        });
        Then("$200 should be dispensed", () -> {
            Assert.assertEquals(200, cashSlot.getContents());
        });
        Then("$0 should be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });
    }
}
