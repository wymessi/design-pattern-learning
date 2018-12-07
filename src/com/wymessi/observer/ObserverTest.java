package com.wymessi.observer;

public class ObserverTest {
    
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay c = new CurrentConditionDisplay(weatherData);
        StatisticConditionDisplay s = new StatisticConditionDisplay(weatherData);
        weatherData.addObserver(c);
        weatherData.addObserver(s);
        weatherData.setMeasurements(1f, 1f, 1f);
    }
}
