package org.ust.Composition;


class Engine{
    private final String type;
    private final int horsepower;

    public Engine(String type, int horsepower){

        this.type=type;
        this.horsepower=horsepower;
    }

    public String getType(){
        return type;
    }

    public int getHorsepower(){
        return horsepower;
    }

}

class Car{

    private final String model;
    private final Engine engine; //Car "has-a" Engine

    public Car(String model,Engine engine){
        this.model= model;
        this.engine=engine;
    }

    public void displayCarInfo(){

        System.out.println("Car Model: "+ model);
        System.out.println("Engine Type: "+engine.getType());
        System.out.println("Horsepower: "+ engine.getHorsepower());
    }
}

public class CarAndEngineDemo {

    public static void main(String[] args) {
        Engine petrolEngine = new Engine("Petrol", 1200);
        Car car = new Car("Toyota", petrolEngine);
        car.displayCarInfo();

        Engine deiselEngine = new Engine("Diesel",1300);
        car = new Car("Maruti",deiselEngine);
        car.displayCarInfo();


    }
}
