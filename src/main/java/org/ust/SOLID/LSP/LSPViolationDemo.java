package org.ust.SOLID.LSP;



class Bird{
    public void fly(){
        System.out.println("Flying...");
    }
}

class Sparrow extends Bird{
    @Override
    public void fly(){
        System.out.println("Sparrow flying...");
    }
}

class Penguin extends Bird{
    @Override
    public void fly(){
        throw new UnsupportedOperationException("Penguin cannot fly");
    }
}

public class LSPViolationDemo {
    public static void main(String[] args) {

        Bird bird = new Sparrow();
        bird.fly();

        //Replacing One bird object with another
        bird = new Penguin();
        bird.fly();
    }
}
