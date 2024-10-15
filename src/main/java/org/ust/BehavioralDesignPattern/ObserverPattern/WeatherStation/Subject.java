package org.ust.BehavioralDesignPattern.ObserverPattern.WeatherStation;

public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
