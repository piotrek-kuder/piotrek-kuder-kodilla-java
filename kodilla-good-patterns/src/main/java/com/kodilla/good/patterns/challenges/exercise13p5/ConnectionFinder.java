package com.kodilla.good.patterns.challenges.exercise13p5;

import java.util.List;
import java.util.Map;

public class ConnectionFinder {

    private final Map<String, List<String>> connectionsMap;

    public ConnectionFinder(Map<String, List<String>> connectionsMap) {
        this.connectionsMap = connectionsMap;
    }

    public void findDepartures(String airport) {

        System.out.println("\n From: " + airport + "  you can travel to:");

        connectionsMap.entrySet().stream().filter(entry -> entry.getKey().contains(airport))
                .flatMap(entry -> entry.getValue().stream())
                .forEach(System.out::println);
    }

    public void findArrivals(String airport) {

        System.out.println("\n You can travel to " + airport + " from: ");

        connectionsMap.entrySet().stream().filter(map -> map.getValue().contains(airport))
                .map(entry -> entry.getKey())
                .forEach(System.out::println);
    }

    public void findIndirectConnections(String start, String endpoint) {

        System.out.println("\nYou can travel from " + start + " to " + endpoint + " via: " );

        connectionsMap.entrySet().stream().filter(map -> map.getValue().contains(start) && map.getValue().contains(endpoint))
                .map(entry -> entry.getKey())
                .forEach(System.out::println);

    }
}
