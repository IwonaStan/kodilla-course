package com.kodilla.bank.homework;

public class App {
    public static void main(String[] args) {

        Bank bank = new Bank();
        CashMachine cashMachine = new CashMachine();
        bank.addMachines(cashMachine);

        System.out.println(bank.numberOfCashMachines);
      //  bank.balanceCashMachines(2);
        //System.out.println(bank.balanceCashMachines(2)/ bank.numberOfCashMachines+" zzz");
    }
}
