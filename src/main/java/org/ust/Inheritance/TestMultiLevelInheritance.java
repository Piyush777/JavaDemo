package org.ust.Inheritance;



class AnimalClass{
    void eat(){
        System.out.println("This animal eats food.");
    }
}

class DogClass extends AnimalClass{

    void bark(){
        System.out.println("This dog barks.");
    }
}

class Puppy extends DogClass{

    void weep(){
        System.out.println("The puppy weeps.");
    }
}

public class TestMultiLevelInheritance {
    public static void main(String[] args) {
        System.out.println("Dog Class");

        DogClass dogClass  = new DogClass();
        dogClass.eat();
        dogClass.bark();

        System.out.println("Puppy Class");
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.weep();

        System.out.println("Animal Class");
        AnimalClass animalClass = new AnimalClass();
        animalClass.eat();

    }
}
