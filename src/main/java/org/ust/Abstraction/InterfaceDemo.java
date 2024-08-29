package org.ust.Abstraction;

interface Animal{
    int MAX_SPEED =25;
    //abstract methods
    void eat();
    void travel();

    default void makeSound(){
        System.out.println("Animal makes a sound.");
    }
}

class Dog implements Animal{

    public void eat(){

        System.out.println(" Dog eats");
    }

    public void travel(){

        System.out.println(" Dog travels");
    }

    @Override
    public void makeSound(){
        System.out.println("Dog barks.");
    }
}


public class InterfaceDemo {

    public static void main(String[] args) {

        Animal myDog = new Dog();
        myDog.eat();
        myDog.travel();
        myDog.makeSound();

        System.out.println("Max sprint speed of animal "+ Animal.MAX_SPEED);
        //not allowed as MAX_SPEED is a final variable
        //Animal.MAX_SPEED=30;

    }

}
