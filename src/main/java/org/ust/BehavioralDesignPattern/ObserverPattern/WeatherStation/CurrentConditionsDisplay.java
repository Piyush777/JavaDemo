package org.ust.BehavioralDesignPattern.ObserverPattern.WeatherStation;

public class CurrentConditionsDisplay implements Observer{
    private float temperature;
    private float pressure;
    private float humidity;
    String name;

    public CurrentConditionsDisplay(String name){
        this.name = name;
    }


    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.humidity=humidity;
        this.pressure=pressure;
        this.temperature=temperature;

        display();
    }

    private void display(){
        System.out.println("Display: "+this.name+" Current conditions: "+ temperature +" F degrees and "+ humidity+" % humidity and "+ pressure+" bar pressure");
    }
}
