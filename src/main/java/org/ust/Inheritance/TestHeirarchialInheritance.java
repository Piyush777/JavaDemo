package org.ust.Inheritance;


class AnimalBaseClass{
    void eat(){
        System.out.println("This animal eats food.");
    }
}

class DogSubClass extends AnimalBaseClass{

    void bark(){
        System.out.println("This dog barks.");
    }
}

class CatSubClass extends AnimalBaseClass{

    void meow(){
        System.out.println("This cat meows.");
    }
}

public class TestHeirarchialInheritance {
    public static void main(String[] args) {
        System.out.println("Dog SubClass");

        DogSubClass dogSubClass  = new DogSubClass();
        dogSubClass.eat();
        dogSubClass.bark();

        System.out.println("Cat SubClass");
        CatSubClass catSubClass = new CatSubClass();
        catSubClass.eat();
        catSubClass.meow();

    }
}

