package org.ust.Polymorphism;


class Animal{

    public void makeSound(){
        System.out.println("This animal makes a sound");
    }
}

class Dog extends Animal{

    @Override
    public void makeSound(){
        System.out.println("The dog barks");
    }

    public void bark(){
        System.out.println("This dog barks");
    }
}


class Puppy extends Dog{

    @Override
    public void makeSound(){
        System.out.println("The puppy barks faintly");
    }
}

public class DynamicPolymorphism {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        animal = new Dog();
        animal.makeSound();

        animal = new Puppy();
        animal.makeSound();

    }
}

