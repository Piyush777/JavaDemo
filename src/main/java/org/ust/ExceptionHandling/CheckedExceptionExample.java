package org.ust.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {


    public static void main(String[] args)  {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("non_existent_file.txt"));
            int sum=0;
            System.out.println(sum);
        }catch ( IOException ioException){
            System.out.println("File Not found or Cannot be Opened");
            ioException.printStackTrace();
        } catch (ArithmeticException arithmeticException){
            System.out.println("Handling Arithmetic exception here");
        }

    }
}
