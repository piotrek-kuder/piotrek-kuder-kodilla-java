package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.List;

public class FlightFinderRunner {

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightList = new ArrayList<>();

        Flight flight1 = new Flight("airport1", "myFakePort");
        Flight flight2 = new Flight("airport1", "airport3");
        Flight flight3 = new Flight("airport5", "airport7");
        Flight flight4 = new Flight("airport4", "airport1");
        Flight flight5 = new Flight("airport1", "airport6");
        Flight flight6 = new Flight("airport7", "airport3");
        Flight flight7 = new Flight("Nibylandia", "airport2");
        Flight flight8 = new Flight("airport1", "airport2");

        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);
        flightList.add(flight4);
        flightList.add(flight5);
        flightList.add(flight6);
        flightList.add(flight7);
        flightList.add(flight8);

        for(Flight flight: flightList) {
            try {
                flightFinder.findFlight(flight);
            } catch (RouteNotFoundException e) {
                System.out.println("Route from: " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " not possible.");
                System.out.println(":::::: " + e + " ::::::\n");
            }
        }


    }
}
