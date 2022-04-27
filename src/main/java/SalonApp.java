public class SalonApp {
    public static void main(String[] args) {

        Osobowy osobowy = new Osobowy();
        osobowy.addModel(new Nissan("White","Almera"));
        osobowy.addModel(new Nissan("Red", "Xxx"));

        Salon salon = new Salon(osobowy);
        salon.prtAuto(1);
    }
}
