package collections.adv.exercises.Homework;

public class Flight {

    String departure;
    String arrival;

    public Flight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }
    public String getArrival() {
        return arrival;
    }

    @Override
    public String toString() {
        return "Flight: " + "departure=" + departure + ", arrival=" + arrival + '\n';
    }
}
