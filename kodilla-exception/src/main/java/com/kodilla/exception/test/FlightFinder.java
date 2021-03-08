package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException{

        Map<String, Boolean> airportsMap = new HashMap<>();
        airportsMap.put("airport1", true);
        airportsMap.put("airport2", true);
        airportsMap.put("airport3", true);
        airportsMap.put("airport4", true);
        airportsMap.put("airport5", false);
        airportsMap.put("airport6", false);
        airportsMap.put("airport7", false);

        String departurePort = flight.getDepartureAirport();
        String arrivalPort = flight.getArrivalAirport();
        String firstPart = "";
        String secondPart = "";

        if(airportsMap.containsKey(departurePort)) {

            if(airportsMap.get(departurePort)) {
                firstPart = "Departure port " + departurePort + " AVAILABLE, ";
            } else {
                firstPart = "Departure port " + departurePort + " NOT AVAILABLE, ";
            }

        } else {
            System.out.println("\n" + departurePort + " does not exist.");
            throw new RouteNotFoundException();
        }

        if(airportsMap.containsKey(arrivalPort)) {

            if(airportsMap.get(arrivalPort)) {
                secondPart = "Arrival port " + arrivalPort + " AVAILABLE.";
            }else {
                secondPart = "Arrival port " + arrivalPort + " NOT AVAILABLE.";
            }

        } else {
            System.out.println("\n" + arrivalPort + " does not exist.");
            throw new RouteNotFoundException();
        }

        System.out.println(firstPart + secondPart);
    }
}
