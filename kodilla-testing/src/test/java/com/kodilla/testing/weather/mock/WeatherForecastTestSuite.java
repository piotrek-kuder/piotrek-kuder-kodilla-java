package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    private static Map<String, Double> temperaturesMap = new HashMap<>();

    @BeforeAll
    public static void prepareTemperaturesMap() {
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
    }
    @BeforeEach
    public void whenThenReturn() {
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }
    @Mock
    Temperatures temperaturesMock;

    @Test
    void testCalculateForecastWithMock() {
        //Given
        //Temperatures temperaturesMock = mock(Temperatures.class);   --------> wywalamy, bo jest adnotacja @Mock + @ExtendWith
        //when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap); -------> transfered to @BeforeEach
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        assertEquals(5, quantityOfSensors);
    }
    @Test
    void testCalculateAverageTempWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double result = weatherForecast.calculateAverageTemperature();
        //Then
        assertEquals(25.56, result);
    }
    @Test
    void testCalculateMedianaTempWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double result = weatherForecast.calculateMedianaTemperature();
        //Then
        assertEquals(25.5, result);
    }
}
