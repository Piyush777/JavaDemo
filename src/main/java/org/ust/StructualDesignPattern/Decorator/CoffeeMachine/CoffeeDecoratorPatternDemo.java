package org.ust.StructualDesignPattern.Decorator.CoffeeMachine;

public class CoffeeDecoratorPatternDemo {

    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription()+" $ "+ coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription()+" $ "+ coffee.getCost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription()+" $ "+ coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription()+" $ "+ coffee.getCost());


    }
}
//synchronise(coffee)
//Reentrant(coffee)
