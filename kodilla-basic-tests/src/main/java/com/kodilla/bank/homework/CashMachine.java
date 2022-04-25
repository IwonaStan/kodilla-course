package com.kodilla.bank.homework;

public class CashMachine {

    public double[] transactions;
    private int sizeTab;
    double balance;
    int count;

    public CashMachine() {
        this.transactions = new double[0];
        this.sizeTab = 0;
        this.balance = 0;
        this.count = 0;
    }
// dodawanie transakcji do tablicy
    public void addTransaction(double value) {
        if (value!=0) {
            this.sizeTab++;
            double[] newTab = new double[this.sizeTab];
            System.arraycopy(transactions, 0, newTab, 0, transactions.length);
            newTab[this.sizeTab - 1] = value;
            this.transactions = newTab;
        }
    }
    public double[] getValues() {
        return transactions;
    }
//saldo bankomatu
    public double balanceOfCashMachine () {
        for (int i=0; i<this.transactions.length; i++) {
            balance += this.transactions[i];
        }
        return balance;
    }
//zliczanie transakcji
    public int countingTransactions() {
        count = this.transactions.length;
        return count;
    }
}
