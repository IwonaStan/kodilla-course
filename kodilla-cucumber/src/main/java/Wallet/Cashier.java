package Wallet;

public class Cashier {

    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if(wallet.getBalance()>=amount)
             cashSlot.dispense(amount);
        else cashSlot.dispense(wallet.getBalance());
    }
}
