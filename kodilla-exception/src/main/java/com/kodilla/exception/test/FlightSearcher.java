package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {

    private final Map<String, Boolean> airportMap = new HashMap<>();

    {
        airportMap.put("BER", true);
        airportMap.put("LON", true);
        airportMap.put("PAR", false);
        airportMap.put("NYC", false);
        airportMap.put("ROM", true);
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        return findAirport(flight.getArrivalAirport()) && findAirport(flight.getDepartureAirport());
    }

    private boolean findAirport(String airportName) throws RouteNotFoundException {
        if (airportMap.containsKey(airportName)) {
            return airportMap.get(airportName);
        } else {
            throw new RouteNotFoundException("Airport does not exist!");
        }
    }
}
