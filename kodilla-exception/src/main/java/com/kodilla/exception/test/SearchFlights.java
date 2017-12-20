package com.kodilla.exception.test;

import java.util.Map;

public class SearchFlights {
    Map<String, Boolean> airportName;

    public SearchFlights(Map<String, Boolean> airportName) {
        this.airportName = airportName;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException{

        if (airportName.containsKey(flight.getArrivalAirport())){
            for (Map.Entry<String, Boolean> entry : airportName.entrySet()){
                if (entry.getKey().equals(flight.getArrivalAirport())){
                    System.out.println("Airport: " + flight.getArrivalAirport() + ". Possibilty of flight - " + entry.getValue());
                }
            }
        } else {
            throw new RouteNotFoundException("Airport is not found");
        }
     }
}
