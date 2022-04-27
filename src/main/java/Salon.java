public class Salon {

    Osobowy osobowy;

    public Salon (Osobowy osobowy) {
        this.osobowy = osobowy;
    }

    public void prtAuto (int number) {
        this.osobowy.print(number);
    }
}
