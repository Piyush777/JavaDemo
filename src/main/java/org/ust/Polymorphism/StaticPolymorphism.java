package org.ust.Polymorphism;

public class StaticPolymorphism {

    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a, int b, int c){
        return a+b+c;
    }

    public static int add(int a, double b){
        return a+(int)(b);
    }
}

class Main{
    public static void main(String[] args) {
        System.out.println("Add 2 Numbers: ");
        System.out.println("Add 2 & 3 :"+StaticPolymorphism.add(2,3));

        System.out.println("Add 3 Numbers: ");
        System.out.println("Add 2 & 3 & 4 :"+StaticPolymorphism.add(2,3,4));
    }
}
