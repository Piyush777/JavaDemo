package org.ust.BehavioralDesignPattern.ObserverPattern.WeatherStation;

public interface Observer {

    void update(float temperature, float humidity, float pressure);
}
