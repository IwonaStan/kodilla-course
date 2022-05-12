package com.kodilla.bank.homework;

public class Bank {

    CashMachine[] totalCashMachines;
    int numberOfCashMachines;
    double balance;

    public Bank() {
        this.totalCashMachines = new CashMachine[0];
        this.numberOfCashMachines = 0;
        this.balance= 0;
    }

    public int addMachines(CashMachine cashMachine) {
        this.numberOfCashMachines++;
        CashMachine[] newTab = new CashMachine[this.numberOfCashMachines];
        System.arraycopy(totalCashMachines, 0, newTab, 0, totalCashMachines.length);
        totalCashMachines[numberOfCashMachines-1] = cashMachine;
        this.totalCashMachines = newTab;
        return numberOfCashMachines;
    }
/*
        public double balanceCashMachines (int numberOfCashMachines) {
            cashMachine.addTransaction(300);
            cashMachine.addTransaction(100);
            balance = cashMachine.balanceOfCashMachine()/numberOfCashMachines;
            System.out.println(balance +"oooo");
            return balance;
        }
*/

}
