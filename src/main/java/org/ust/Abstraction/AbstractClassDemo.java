package org.ust.Abstraction;

abstract class AbstractClass{

    public abstract void abstractMethod();
}


abstract class AnimalAbstractClass{

    private String name;

    public AnimalAbstractClass(String name){

        this.name = name;
    }

    public abstract void makeSound();

    public void eat(){

        System.out.println(name +" is eating.");
    }
}

class DogConcreteClass extends AnimalAbstractClass{

    public DogConcreteClass(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class CatConcreteClass extends AnimalAbstractClass{

    public CatConcreteClass(String name){

        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

}

public class AbstractClassDemo {

    public static void main(String[] args) {
        AnimalAbstractClass dog  = new DogConcreteClass("Buddy");
        dog.makeSound();
        dog.eat();

        AnimalAbstractClass cat = new CatConcreteClass("Whiskers");
        cat.makeSound();
        cat.eat();
    }

}
