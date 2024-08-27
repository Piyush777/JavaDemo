package org.ust.OOPS;

/*
    Problem Statement:



Problem: Create a Car Class
Objective: Write a Java program to model a simple car.

Requirements:

Define a Car class:

The class should have the following private fields:
String make (e.g., Toyota, Ford)
String model (e.g., Camry, Mustang)
int year (e.g., 2020, 2021)
double fuelLevel (fuel level in the tank, e.g., 50.0)
Constructor:

The class should have a constructor that initializes the make, model, and year. The fuelLevel should be initialized to 100.0 by default (full tank).
Methods:

Getters: Provide getter methods for all fields.
Setters: Provide setter methods for make, model, and year.
drive(double miles): A method that simulates driving the car a certain number of miles. It decreases the fuel level based on the distance driven (assume a fixed consumption rate of 0.05 gallons per mile). If there isn’t enough fuel, print a message and don’t decrease the fuel below 0.
refuel(double gallons): A method to refuel the car. This increases the fuel level by the specified amount of gallons, but the fuel level should not exceed 100.0.
Main Class:

Create a Main class with the main method.
Inside the main method, create an instance of the Car class.
Set the car’s make, model, and year.
Display the initial state of the car.
Simulate driving the car and refueling it, displaying the state after each action.
 */

public class Car {
    // Private fields
    private String make;
    private String model;
    private int year;
    private double fuelLevel;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelLevel = 100.0; // Full tank
    }

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    // Setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Drive method
    public void drive(double miles) {
        double fuelNeeded = miles * 0.05;
        if (fuelLevel >= fuelNeeded) {
            fuelLevel -= fuelNeeded;
            System.out.println("Driving " + miles + " miles...");
        } else {
            System.out.println("Not enough fuel to drive " + miles + " miles!");
        }
    }

    // Refuel method
    public void refuel(double gallons) {
        fuelLevel += gallons;
        if (fuelLevel > 100.0) {
            fuelLevel = 100.0; // Maximum fuel level
        }
        System.out.println("Refueling " + gallons + " gallons...");
    }
}

class Main {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", "Camry", 2020);

        // Display initial state
        System.out.println("Car make: " + myCar.getMake());
        System.out.println("Car model: " + myCar.getModel());
        System.out.println("Car year: " + myCar.getYear());
        System.out.println("Fuel level: " + myCar.getFuelLevel());
        System.out.println();

        // Drive the car
        myCar.drive(200);
        System.out.println("Fuel level after driving: " + myCar.getFuelLevel());
        System.out.println();

        // Refuel the car
        myCar.refuel(20);
        System.out.println("Fuel level after refueling: " + myCar.getFuelLevel());
        System.out.println();

        // Attempt to drive more than fuel allows
        myCar.drive(1000);
        System.out.println("Fuel level after driving: " + myCar.getFuelLevel());
    }
}
