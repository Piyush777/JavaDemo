package org.ust.ExceptionHandling;

public class CustomUncheckedExceptionExample {

    static class NegativeNumberException extends RuntimeException{
        public NegativeNumberException(String message){
            super(message);
        }
    }

    public static double squareRoot(int number){
        if(number<0){
            throw new NegativeNumberException("Number must be non-negative");
        }else{
            return Math.sqrt(number);
        }
    }

    public static void main(String[] args) {
        try{
            System.out.println(squareRoot(-5));
        }catch (NegativeNumberException negativeNumberException){
            System.out.println("Caught exception "+ negativeNumberException.getMessage());
        }

        try{
            System.out.println(squareRoot(16));
        }catch (NegativeNumberException negativeNumberException){
            System.out.println("Caught exception "+ negativeNumberException.getMessage());
        }
    }
}
