package org.ust.ExceptionHandling;

public class ErrorExample {

    public static void recursiveMethod(){
        recursiveMethod();
    }

    public static void main(String[] args) {
        recursiveMethod();
    }
}
