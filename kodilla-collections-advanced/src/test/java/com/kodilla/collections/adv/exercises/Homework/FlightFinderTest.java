package com.kodilla.collections.adv.exercises.Homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    FlightFinder flightFinder = new FlightFinder();

    @Test
    void findFlightsFrom() {
        assertEquals(2,flightFinder.findFlightsFrom("Szczecin").size());
    }
    @Test
    void findFlightsFromWithWrongDeparture() {
        assertEquals(0,flightFinder.findFlightsFrom("Wilkowyje").size());
    }
    @Test
    void findFlightsTo() {
        assertEquals(2,flightFinder.findFlightsTo("Szczecin").size());
    }
    @Test
    void findFlightsToWithWrongArrival() {
        assertEquals(0,flightFinder.findFlightsTo("Wilkowyje").size());
    }
}