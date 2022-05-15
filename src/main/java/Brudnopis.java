public class Brudnopis {
    public static void main(String[] args) {

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
            newTab[this.numberOfCashMachines - 1] = cashMachine;
            this.totalCashMachines = newTab;
            return numberOfCashMachines;
        }
        public double balanceOfCashMachines() {
            for(int i=0; i<numberOfCashMachines; i++) {
                balance += totalCashMachines[i].balanceOfCashMachine();
            }
            return balance;
        }
    }
}