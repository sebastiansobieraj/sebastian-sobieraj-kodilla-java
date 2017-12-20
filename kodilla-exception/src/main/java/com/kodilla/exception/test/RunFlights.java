package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class RunFlights {
    public static void main (String args[]) {

        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Wrocław", true);
        airports.put("Pyrzowice", false);
        airports.put("Poznań", true);
        airports.put("Okęcie", true);
        airports.put("Modiln", false);

        SearchFlights searcher = new SearchFlights(airports);
        Flight firstFlight = new Flight("Barcelona", "Okęcie");
        Flight secondFlight = new Flight("Wrocław", "Madryt");

        try {
            searcher.findFlight(firstFlight);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            searcher.findFlight(secondFlight);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
