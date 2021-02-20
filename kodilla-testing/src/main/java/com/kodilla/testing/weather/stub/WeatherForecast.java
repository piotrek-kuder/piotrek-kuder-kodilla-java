package com.kodilla.testing.weather.stub;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {
        double sumTemp = 0;

        for (Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()) {
            sumTemp = sumTemp + temperature.getValue();
        }
        return sumTemp/5;
    }

    public double calculateMedianaTemperature() {
        int i = 0;
        double mediana;
        double list[] = new double[temperatures.getTemperatures().size()];

        for(Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()) {
            list[i] = temperature.getValue();
            i++;
        }
        //sorting list
        Arrays.sort(list);

        int middleOfList = list.length/2;

        if (list.length % 2 == 0) {                 //calculating for even list.length
            mediana = (list[middleOfList - 1] + list[middleOfList]) / 2;
        } else {                                    //calculating for odd list.length
            mediana = list[middleOfList];
        }
        return mediana;
    }
}