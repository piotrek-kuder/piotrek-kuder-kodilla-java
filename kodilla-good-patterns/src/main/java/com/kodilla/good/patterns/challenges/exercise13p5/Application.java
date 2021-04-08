package com.kodilla.good.patterns.challenges.exercise13p5;

import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        AirportsDatabase airportsDatabase = new AirportsDatabase();
        Map<String, List> airportsConnectionsMap = airportsDatabase.getAirportsConnectionsMap();
        ConnectionFinder connectionFinder = new ConnectionFinder(airportsConnectionsMap);

        connectionFinder.findDepartures("port1");
        connectionFinder.findDepartures("port2");
        connectionFinder.findDepartures("port3");
        connectionFinder.findDepartures("port4");
        connectionFinder.findDepartures("port5");
        connectionFinder.findDepartures("port6");
        connectionFinder.findDepartures("port7");

        connectionFinder.findArrivals("port1");
        connectionFinder.findArrivals("port2");
        connectionFinder.findArrivals("port3");
        connectionFinder.findArrivals("port4");
        connectionFinder.findArrivals("port5");
        connectionFinder.findArrivals("port6");
        connectionFinder.findArrivals("port7");

        connectionFinder.findIndirectConnections("port1", "port6");
        connectionFinder.findIndirectConnections("port1", "port2");
        connectionFinder.findIndirectConnections("port3", "port4");
        connectionFinder.findIndirectConnections("port3", "port7");
    }
}
