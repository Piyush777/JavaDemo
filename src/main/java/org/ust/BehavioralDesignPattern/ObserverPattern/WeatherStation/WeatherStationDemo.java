package org.ust.BehavioralDesignPattern.ObserverPattern.WeatherStation;

public class WeatherStationDemo {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay("First");

        weatherData.registerObserver(currentConditionsDisplay);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82,70, 29.7f);

        CurrentConditionsDisplay currentConditionsDisplay1 = new CurrentConditionsDisplay("Second");
        weatherData.registerObserver(currentConditionsDisplay1);

        weatherData.setMeasurements(85, 65, 30.4f);
        weatherData.setMeasurements(87,70, 29.7f);

        weatherData.removeObserver(currentConditionsDisplay);
        weatherData.setMeasurements(85, 68, 30.4f);
        weatherData.setMeasurements(87,61, 29.7f);
    }

}
