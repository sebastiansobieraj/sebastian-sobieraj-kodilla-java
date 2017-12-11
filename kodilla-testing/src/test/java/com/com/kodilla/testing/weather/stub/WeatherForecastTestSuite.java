package com.com.kodilla.testing.weather.stub;

import org.junit.Assert;
import org.junit.Test;
import com.kodilla.testing.com.kodilla.testing.weather.stub.*;

public class WeatherForecastTestSuite {
    @Test
    public void testCalculateForecastWithStub(){
        //Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assert.assertEquals(5, quantityOfSensors);
    }
}
