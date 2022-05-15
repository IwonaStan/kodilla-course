package com.kodilla.bank.homework;

public class Brudnopis {
    public static void main(String[] args) {

        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(-100);
        cashMachine1.addTransaction(100);
        bank.addMachines(cashMachine1);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(-200);
        cashMachine2.addTransaction(200);
        bank.addMachines(cashMachine2);

        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.addTransaction(-300);
        cashMachine3.addTransaction(300);
        bank.addMachines(cashMachine3);

        System.out.println(bank.positiveBalance());
        System.out.println(bank.averagePositiveTransaction());
        System.out.println("xx "+bank.posAverage);
        System.out.println(bank.negativeBalance());
        System.out.println(bank.averageNegativeTransaction());
        System.out.println("xx "+bank.negAverage);

    }
}
