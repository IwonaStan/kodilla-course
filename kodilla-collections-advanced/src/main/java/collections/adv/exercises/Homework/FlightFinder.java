package collections.adv.exercises.Homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    FlightRepository flightRepository = new FlightRepository();

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> from = new ArrayList<>();
        for(Flight flight:flightRepository.getFlightsTable()) {
            if (flight.getDeparture() == departure)
                from.add(new Flight(flight.getDeparture(),flight.getArrival()));
        }
        return from;
    }
    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flightTo = new ArrayList<>();
        for(Flight flight:flightRepository.getFlightsTable()) {
            if (flight.getArrival() == arrival)
                flightTo.add(new Flight(flight.getDeparture(),flight.getArrival()));
        }
        return flightTo;
    }
}
