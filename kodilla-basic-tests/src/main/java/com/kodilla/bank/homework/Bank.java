package com.kodilla.bank.homework;

public class Bank {

    CashMachine[] totalCashMachines;
    int numberOfCashMachines, sizeTab;
    double helpTab[];
    double value, variable;

    public Bank() {
        this.totalCashMachines = new CashMachine[0];
        this.helpTab = new double[0];
        this.numberOfCashMachines = this.sizeTab = 0;
        this.value = this.variable = 0;
    }

    public void addMachines() {
        this.numberOfCashMachines++;
        CashMachine[] newTab = new CashMachine[this.numberOfCashMachines];
        System.arraycopy(totalCashMachines, 0, newTab, 0, totalCashMachines.length);
        this.totalCashMachines = newTab;
    }
    public void addPayment(double value) {
            this.sizeTab++;
            double[] newTab = new double[this.sizeTab];
            System.arraycopy(helpTab, 0, newTab, 0, helpTab.length);
            newTab[this.sizeTab - 1] = value;
            this.helpTab = newTab;
    }
    public double Payment() {
        for (int i=0; i<helpTab.length; i++) {
            if (helpTab[i]<0) {
                value+=helpTab[i];
            }
        }
        return value;
    }
    public double PaymentOnAccount() {
        for (int i=0; i<helpTab.length; i++) {
            if (helpTab[i]>0) {
                value+=helpTab[i];
            }
        }
        return value;
    }
    public double AveragePayment() {
        for (int i=0; i<helpTab.length; i++) {
            if (helpTab[i]<0) {
                value+=helpTab[i];
                variable++;
            }
        }
        value = Math.abs(value/variable);
        return value;
    }
    public double AveragePaymentOnAccount() {
        for (int i=0; i<helpTab.length; i++) {
            if (helpTab[i]>0) {
                value+=helpTab[i];
                variable++;
            }
        }
        value = (value/variable);
        return value;
    }
}
