package com.kodilla.good.patterns.flights;

public class FlightRunner {
    public static void main (String args[]){
        FlightSearcher flightSearcher = new FlightSearcher();

        flightSearcher.searchFlightsFromCity("Wrocław");
        flightSearcher.searchFlightsToCity("Wrocław");
        flightSearcher.searchFlightsWithChange("Wrocław", "Warszawa", "Berlin");
    }
}
