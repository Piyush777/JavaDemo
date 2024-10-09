package org.ust.StructualDesignPattern.Decorator.CoffeeMachine;

//ConcreteComponent: BasicCoffee
public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 2;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
