package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearcher {

    public void searchFlightsFromCity (String city){
        List<Flight> depatureCities = FlightDatabase.getFlightsDatabase().stream()
                .filter(departure -> departure.getDepartureAirport().equals(city))
                .collect(Collectors.toList());
        System.out.println("\nFlights from: " + city);
        depatureCities.forEach(System.out::println);
    }

    public void searchFlightsToCity (String city){
        List<Flight> arrivalCities = FlightDatabase.getFlightsDatabase().stream()
                .filter(arrival -> arrival.getArrivalAirport().equals(city))
                .collect(Collectors.toList());
        System.out.println("\nFlights to: " + city);
        arrivalCities.forEach(System.out::println);
    }

    public void searchFlightsWithChange (String departureCity, String changeCity, String arrivalCity){
        List<Flight> firstFlight = FlightDatabase.getFlightsDatabase().stream()
                .filter(departure -> departure.getDepartureAirport().equals(departureCity))
                .filter(change -> change.getArrivalAirport().equals(changeCity))
                .collect(Collectors.toList());

        List<Flight> secondFlight = FlightDatabase.getFlightsDatabase().stream()
                .filter(change -> change.getArrivalAirport().equals(arrivalCity))
                .filter(arrival -> arrival.getArrivalAirport().equals(arrivalCity))
                .collect(Collectors.toList());

        System.out.println("\nFlights from " + departureCity + " via " + changeCity + " to " + arrivalCity);
        firstFlight.forEach(System.out::println);
        secondFlight.forEach(System.out::println);
    }
}
