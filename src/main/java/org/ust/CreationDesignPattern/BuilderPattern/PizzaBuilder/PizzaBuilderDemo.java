package org.ust.CreationDesignPattern.BuilderPattern.PizzaBuilder;

public class PizzaBuilderDemo {


    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder("12")
                //.cheese(true)
                //.pepperoni(true)
                .mushroom(true)
                .build();
        System.out.println(pizza);
    }
}
