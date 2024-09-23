package org.ust.ExceptionHandling;

public class CustomCheckedExceptionExample {

    static class InvalidAgeException extends Exception{
        public InvalidAgeException(String message){
            super(message);
        }
    }

    public static void checkAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be 18 or older");
        }else {
            System.out.println("Valid Age: " + age);
        }
    }

    public static void main(String[] args) {
        try{
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught exception "+ e.getMessage());
        }

        try {
            checkAge(25);
        } catch (InvalidAgeException e) {
            System.out.println("Caught exception "+ e.getMessage());
        }
    }


}
