package com.kodilla.collections.adv.exercises.Homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public List<Flight> getFlightsTable() {
        List<Flight> flight = new ArrayList<>();
            flight.add(new Flight("Dublin", "Szczecin"));
            flight.add(new Flight("Szczecin", "Bergen"));
            flight.add(new Flight("Kraków", "Szczecin"));
            flight.add(new Flight("Szczecin", "Liverpool"));
        return flight;
    }
}