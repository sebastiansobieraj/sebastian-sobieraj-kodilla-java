package com.kodilla.good.patterns.flights;

import java.util.HashSet;

public class FlightDatabase {

    private static HashSet<Flight> flightsDatabase = new HashSet<>();

    public static HashSet<Flight> getFlightsDatabase() {
        Flight wroGda = new Flight("Wrocław", "Gdańsk");
        Flight wroWawa = new Flight("Wrocław", "Warszawa");
        Flight wroKrk = new Flight("Wrocław", "Kraków");
        Flight wawaKrk = new Flight("Warszawa", "Kraków");
        Flight wawaBer = new Flight("Warszawa", "Berlin");
        Flight wawaGda = new Flight("Warszawa", "Gdańsk");
        Flight krkGda = new Flight("Kraków", "Gdańsk");
        Flight berMad = new Flight("Berlin", "Madryt");
        Flight gdaWawa = new Flight("Gdańsk", "Warszawa");

        flightsDatabase.add(wroGda);
        flightsDatabase.add(wroWawa);
        flightsDatabase.add(wroKrk);
        flightsDatabase.add(wawaKrk);
        flightsDatabase.add(wawaBer);
        flightsDatabase.add(wawaGda);
        flightsDatabase.add(krkGda);
        flightsDatabase.add(berMad);
        flightsDatabase.add(gdaWawa);

        return flightsDatabase;
    }
}
