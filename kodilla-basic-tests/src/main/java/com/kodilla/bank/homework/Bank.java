package com.kodilla.bank.homework;

public class Bank {

    private int[] cashMachines;
    double [] helpTab;
    int numberOfCashMachines, sizeTab;
    double value, variable;
    CashMachine cashMachine = new CashMachine();

    public Bank() {
        this.cashMachines = new int[0];
        this.helpTab = new double[0];
        this.numberOfCashMachines = this.sizeTab = 0;
        this.value = this.variable = 0;
    }

    public void addMachines() {
        this.numberOfCashMachines++;
        int[] newTab = new int[this.numberOfCashMachines];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        this.cashMachines = newTab;
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
