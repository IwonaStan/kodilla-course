package bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        double[] transactions = cashMachine.getValues();
        assertEquals(0, transactions.length);
    }
    @Test
    public void AddElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(400.50);
        cashMachine.addTransaction(200.25);
        cashMachine.addTransaction(-600.25);

        double[] values = cashMachine.getValues();
        assertEquals(400.50, values[0]);
        assertEquals(200.25, values[1]);
        assertEquals(-600.25, values[2]);
    }
    @Test
    public void BalanceOfAllTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(265.35);
        cashMachine.addTransaction(0);
        cashMachine.addTransaction(851.30);
        cashMachine.addTransaction(-45.28);

        cashMachine.balanceOfCashMachine();

        assertEquals(1071.37,cashMachine.balance,2);
    }
    @Test
    public void CountingTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(265.35);
        cashMachine.addTransaction(0);
        cashMachine.addTransaction(851.30);
        cashMachine.addTransaction(-45.28);

        cashMachine.countingTransactions();

        assertEquals(3,cashMachine.count,2);
    }
}
