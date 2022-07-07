package Wallet;

public class CashSlot {

    private int contents;
    Wallet wallet = new Wallet();

    public int getContents() {
        return contents;
    }
    public void dispense(int amount) {
        this.contents = amount;
    }
}
