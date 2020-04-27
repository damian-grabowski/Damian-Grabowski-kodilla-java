package com.kodilla.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {

        Airport waw = new Airport("WAW");
        Airport fra = new Airport("FRA");
        Airport krk = new Airport("KRK");
        Airport wro = new Airport("WRO");

        FlightSearchProcessor flightSearch = new FlightSearchProcessor();
        flightSearch.addFlight(new Flight("LO19020", waw, wro));
        flightSearch.addFlight(new Flight("LO19021", krk, fra));
        flightSearch.addFlight(new Flight("LO19022", wro, krk));
        flightSearch.addFlight(new Flight("LO19023", fra, waw));
        flightSearch.addFlight(new Flight("LO19024", wro, fra));

        System.out.println("Flights by selected departure airport");
        System.out.println(flightSearch.searchDepartureAirport(fra));

        System.out.println("Flights by selected arrival airport");
        System.out.println(flightSearch.searchArrivalAirport(krk));

        System.out.println("Transfer flights");
        System.out.println(flightSearch.searchTransferFlight(waw, fra, wro));
    }
}
