package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void AddCashMachines() {
        Bank bank = new Bank();
        bank.addMachines();
        bank.addMachines();
        bank.addMachines();

        assertEquals(3,bank.numberOfCashMachines);
    }
    @Test
    public void Payments() {
        Bank bank = new Bank();
        bank.addPayment(-200.20);
        bank.addPayment(300.30);
        bank.addPayment(0);
        bank.addPayment(-400.40);
        bank.addPayment(500.50);

        assertEquals(-600.60,bank.Payment(),2);
    }
    @Test
    public void PaymentsOnAccount() {
        Bank bank = new Bank();
        bank.addPayment(-200.20);
        bank.addPayment(300.30);
        bank.addPayment(0);
        bank.addPayment(-400.40);
        bank.addPayment(500.50);

        assertEquals(800.80,bank.PaymentOnAccount(),2);
    }
    @Test
    public void AveragePayments() {
        Bank bank = new Bank();
        bank.addPayment(-200.20);
        bank.addPayment(300.30);
        bank.addPayment(0);
        bank.addPayment(-400.40);
        bank.addPayment(500.50);

        assertEquals(300.30,bank.AveragePayment(),2);
    }
    @Test
    public void AveragePaymentsOnAccount() {
        Bank bank = new Bank();
        bank.addPayment(-200.20);
        bank.addPayment(300.30);
        bank.addPayment(0);
        bank.addPayment(-400.40);
        bank.addPayment(500.50);

        assertEquals(400.40,bank.AveragePaymentOnAccount(),2);
    }
}
