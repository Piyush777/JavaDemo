package org.ust.StructualDesignPattern.Decorator.CoffeeMachine;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public double getCost(){
        return super.getCost()+0.2;
    }

    public String getDescription(){

        return super.getDescription()+" ,Sugar";
    }
}
