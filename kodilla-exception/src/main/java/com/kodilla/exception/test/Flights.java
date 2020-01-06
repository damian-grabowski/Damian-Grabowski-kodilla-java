package com.kodilla.exception.test;

public class Flights {
    public static void main(String[] args) {
        Flight berLon = new Flight("BER", "LON");
        Flight nycPar = new Flight("NYC", "PAR");
        Flight lonRom = new Flight("LON", "ROM");

        FlightSearcher flightSearcher = new FlightSearcher();

        try {
            boolean existBerLon = flightSearcher.findFlight(berLon);
            System.out.println("Flight Berlin - London: " + existBerLon);
        } catch (RouteNotFoundException e) {
            System.out.println("Correct airport name! ");
        }

        try {
            boolean existNycPar = flightSearcher.findFlight(nycPar);
            System.out.println("Flight New York - Paris: " + existNycPar);
        } catch (RouteNotFoundException e) {
            System.out.println("Correct airport name! ");
        }

        try {
            boolean existLonRom = flightSearcher.findFlight(lonRom);
            System.out.println("Flight London - Rome: " + existLonRom);
        } catch (RouteNotFoundException e) {
            System.out.println("Correct airport name! ");
        }
    }
}
