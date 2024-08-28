package org.ust.Inheritance;

interface CanBark{
    void bark();
}

interface CanMeow{
    void meow();
}

class DogDerivedClass implements CanBark,CanMeow{

    @Override
    public void bark() {
        System.out.println("The dog barks.");
    }

    @Override
    public void meow() {
        System.out.println("The dog cannot meow.");
    }
}

class CatDerivedClass implements CanMeow,CanBark{

    @Override
    public void bark() {
        System.out.println("The cat cannot bark.");
    }

    @Override
    public void meow() {
        System.out.println("The cat meows.");
    }
}



public class TestMultipleInheritance  {
    public static void main(String[] args) {

        System.out.println("\n Dog Derived Class");
        DogDerivedClass dogDerivedClass = new DogDerivedClass();
        dogDerivedClass.bark();
        dogDerivedClass.meow();

        System.out.println("\n Cat Derived Class");

        CatDerivedClass catDerivedClass = new CatDerivedClass();
        catDerivedClass.bark();
        catDerivedClass.meow();
    }

}
