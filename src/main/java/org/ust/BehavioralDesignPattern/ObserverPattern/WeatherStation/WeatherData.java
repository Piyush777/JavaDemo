package org.ust.BehavioralDesignPattern.ObserverPattern.WeatherStation;

import java.util.ArrayList;
import java.util.List;

//Concrete Subject
public class WeatherData implements Subject{
    private List<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observerList = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observerList){
            observer.update(temperature,humidity,pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature= temperature;
        this.humidity = humidity;
        this.pressure=pressure;
        notifyObservers();
    }



}
