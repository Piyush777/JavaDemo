package org.ust.SOLID.LSP;

public class LSPCompilant {


    static class Bird{

        public void eat(){

            System.out.println("Eating ..");
        }


    }

    static class FlyingBird extends Bird{
        public void fly(){

            System.out.println("Flying...");
        }
    }

    static class Sparrow extends FlyingBird{
        @Override
        public void fly(){
            System.out.println("Sparrow flying...");
        }
    }

    static class Penguin extends Bird{
        //No fly method as penguin cannot fly
    }

    public static void main(String[] args) {
        FlyingBird flyingBird = new Sparrow();
        flyingBird.fly();

        Bird eatingBird = new Penguin();
        eatingBird.eat();

        eatingBird = new Sparrow();
        eatingBird.eat();

        //the following code won't work
        //flyingBird = new Penguin();
    }
}
