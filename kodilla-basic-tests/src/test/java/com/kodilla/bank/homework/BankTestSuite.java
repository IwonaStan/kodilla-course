package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void AddCashMachines() {
        Bank bank = new Bank();
        bank.addMachines(new CashMachine());
        bank.addMachines(new CashMachine());
        bank.addMachines(new CashMachine());

        assertEquals(3,bank.numberOfCashMachines);
    }
    @Test
    public void balanceOfCashMachines() {
        Bank bank = new Bank();
            CashMachine cashMachine1 = new CashMachine();
            cashMachine1.addTransaction(100);
            cashMachine1.addTransaction(100);
            bank.addMachines(cashMachine1);
                CashMachine cashMachine2 = new CashMachine();
                cashMachine2.addTransaction(200);
                bank.addMachines(cashMachine2);

        bank.balanceOfCashMachines();

        assertEquals(400,bank.totalBalance);
    }
    @Test
    public void negativeBalance() {
        Bank bank = new Bank();
            CashMachine cashMachine1 = new CashMachine();
            cashMachine1.addTransaction(100);
            cashMachine1.addTransaction(-100);
            bank.addMachines(cashMachine1);
                CashMachine cashMachine2 = new CashMachine();
                cashMachine2.addTransaction(200);
                cashMachine2.addTransaction(-100);
                cashMachine2.addTransaction(100);
                bank.addMachines(cashMachine2);

        bank.negativeBalance();

        assertEquals(-200,bank.negBalance);
    }
    @Test
    public void positiveBalance() {
        Bank bank = new Bank();
            CashMachine cashMachine1 = new CashMachine();
            cashMachine1.addTransaction(100);
            cashMachine1.addTransaction(-100);
            bank.addMachines(cashMachine1);
                CashMachine cashMachine2 = new CashMachine();
                cashMachine2.addTransaction(200);
                cashMachine2.addTransaction(-200);
                bank.addMachines(cashMachine2);

        bank.positiveBalance();

        assertEquals(300,bank.posBalance);
    }
    @Test
    public void averageNegativeTransaction() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(-100);
        cashMachine1.addTransaction(100);
        bank.addMachines(cashMachine1);
        //----------------------------
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(-200);
        cashMachine2.addTransaction(200);
        bank.addMachines(cashMachine2);
        //----------------------------
        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.addTransaction(-300);
        cashMachine3.addTransaction(300);
        bank.addMachines(cashMachine3);

        bank.averageNegativeTransaction();

        assertEquals(-200,bank.negAverage);
    }
    @Test
    public void averagePositiveTransaction() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(-100);
        cashMachine1.addTransaction(100);
        bank.addMachines(cashMachine1);
        //----------------------------
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(-200);
        cashMachine2.addTransaction(200);
        bank.addMachines(cashMachine2);
        //----------------------------
        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.addTransaction(-300);
        cashMachine3.addTransaction(300);
        bank.addMachines(cashMachine3);

        bank.averagePositiveTransaction();

        assertEquals(200,bank.posAverage);
    }
}
