package org.ust.StructualDesignPattern.Decorator.CoffeeMachine;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public double getCost(){
        return super.getCost()+0.5;
    }

    public String getDescription(){
        return super.getDescription()+" , Milk";
    }
}
