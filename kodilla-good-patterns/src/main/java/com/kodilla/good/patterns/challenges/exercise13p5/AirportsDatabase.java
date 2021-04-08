package com.kodilla.good.patterns.challenges.exercise13p5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AirportsDatabase {
    private final List<String> airport1Departures;
    private final List<String> airport2Departures;
    private final List<String> airport3Departures;
    private final List<String> airport4Departures;
    private final List<String> airport5Departures;
    private final List<String> airport6Departures;
    private final Map<String, List<String>> airportsConnectionsMap;

    public AirportsDatabase() {

        airport1Departures = new ArrayList<>();
        airport1Departures.add("port2");
        airport1Departures.add("port3");
        airport1Departures.add("port4");
        airport1Departures.add("port5");

        airport2Departures = new ArrayList<>();
        airport2Departures.add("port1");
        airport2Departures.add("port3");
        airport2Departures.add("port4");

        airport3Departures = new ArrayList<>();
        airport3Departures.add("port1");
        airport3Departures.add("port2");

        airport4Departures = new ArrayList<>();
        airport4Departures.add("port1");
        airport4Departures.add("port2");

        airport5Departures = new ArrayList<>();
        airport5Departures.add("port1");
        airport5Departures.add("port6");

        airport6Departures = new ArrayList<>();
        airport6Departures.add("port5");

        airportsConnectionsMap = new HashMap<>();
        airportsConnectionsMap.put("port1", airport1Departures);
        airportsConnectionsMap.put("port2", airport2Departures);
        airportsConnectionsMap.put("port3", airport3Departures);
        airportsConnectionsMap.put("port4", airport4Departures);
        airportsConnectionsMap.put("port5", airport5Departures);
        airportsConnectionsMap.put("port6", airport6Departures);
    }

    public Map<String, List<String>> getAirportsConnectionsMap() {
        return new HashMap<>(airportsConnectionsMap);
    }
}
