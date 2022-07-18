package bank.homework;

public class Bank {

    CashMachine[] totalCashMachines;
    int numberOfCashMachines;
    double totalBalance, negBalance, posBalance, negAverage, posAverage;

    public Bank() {
        this.totalCashMachines = new CashMachine[0];
        this.numberOfCashMachines = 0;
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
        double negativeBalance = 0;
        int varNegative = 0;
        for (int i=0; i<numberOfCashMachines; i++) {
            if (totalCashMachines[i].negativeTransaction<0) {
                negativeBalance += totalCashMachines[i].negativeTransaction;
                varNegative += totalCashMachines[i].countNegative;
            }
        }
        System.out.println(negativeBalance + " " + varNegative);
        negAverage = negativeBalance/(double) varNegative;
        return negAverage;
    }
    public double averagePositiveTransaction() {
        double varPositive = 0;
        int positiveBalance = 0;
        for (int i=0; i<numberOfCashMachines; i++) {
            if (totalCashMachines[i].positiveTransaction>0) {
                positiveBalance += totalCashMachines[i].positiveTransaction;
                varPositive += totalCashMachines[i].countPositive;
            }
        }
        posAverage = positiveBalance/(double) varPositive;
        return posAverage;
    }
}
