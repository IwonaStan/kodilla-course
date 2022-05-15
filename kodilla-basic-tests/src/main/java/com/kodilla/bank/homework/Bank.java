package com.kodilla.bank.homework;

public class Bank {

    CashMachine[] totalCashMachines;
    int numberOfCashMachines, varPositive, varNegative;
    double totalBalance, negBalance, posBalance, negAverage, posAverage;

    public Bank() {
        this.totalCashMachines = new CashMachine[0];
        this.numberOfCashMachines = this.varPositive = this.varNegative = 0;
        this.totalBalance = this.negBalance = this.posBalance = this.negAverage = posAverage = 0;
    }

    public int addMachines(CashMachine cashMachine) {
        this.numberOfCashMachines++;
        CashMachine[] newTab = new CashMachine[this.numberOfCashMachines];
        System.arraycopy(totalCashMachines, 0, newTab, 0, totalCashMachines.length);
        newTab[this.numberOfCashMachines - 1] = cashMachine;
        this.totalCashMachines = newTab;
        return numberOfCashMachines;
    }
    public double balanceOfCashMachines() {
        for(int i=0; i<numberOfCashMachines; i++) {
            totalBalance += totalCashMachines[i].balanceOfCashMachine();
        }
        return totalBalance;
    }
    public double negativeBalance() {
        for (int i=0; i<numberOfCashMachines; i++) {
            if (totalCashMachines[i].negativeTransaction<0)
                negBalance += totalCashMachines[i].negativeTransaction;
        }
        return negBalance;
    }
    public double positiveBalance() {
        for (int i=0; i<numberOfCashMachines; i++) {
            if (totalCashMachines[i].positiveTransaction>0)
                posBalance += totalCashMachines[i].positiveTransaction;
        }
        return posBalance;
    }
    public double averageNegativeTransaction() {
        for (int i=0; i<numberOfCashMachines; i++) {
            if (totalCashMachines[i].negativeTransaction<0)
                varNegative += totalCashMachines[i].countNegative;
        }
        negAverage = negBalance/varNegative;
        return negAverage;
    }
    public double averagePositiveTransaction() {
        for (int i=0; i<numberOfCashMachines; i++) {
            if (totalCashMachines[i].positiveTransaction>0)
                varPositive += totalCashMachines[i].countPositive;
        }
        posAverage = posBalance/varPositive;
        return posAverage;
    }
}
