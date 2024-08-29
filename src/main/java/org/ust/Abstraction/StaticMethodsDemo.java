package org.ust.Abstraction;


interface Vehicle{

    static void cleanVehicle(){
        System.out.println("Cleaning the vehicle");
    }
}


public class StaticMethodsDemo {
    public static void main(String[] args) {
        Vehicle.cleanVehicle();
    }
}
