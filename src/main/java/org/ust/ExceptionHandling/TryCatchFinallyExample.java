package org.ust.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class TryCatchFinallyExample {

    public static void main(String[] args) {
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader("non_existent_file.txt"));
            String line = reader.readLine();
            System.out.println("File content "+ line);
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("File not found! ");
        }catch (IOException ioException){
            System.out.println("Any I/O exception occured");
        }

        finally {
            System.out.println("Closing the file reader");
            try {
                //if(Objects.isNull(reader)){
                    reader.close();
                //}
            }catch (IOException ioException){
                System.out.println("Error while closing file");
            }catch (NullPointerException nullPointerException){
                System.out.println("Reader is null");
            }
        }

        //finally block always executes even if no exception occurs as follows
        int num;

        try{
            num = 10/2;
            System.out.println("Try Num "+num);
        }catch (ArithmeticException arithmeticException){
            System.out.println("Arithmetic exception found");
        }finally {
             num = 100/10;
            System.out.println("Finally num "+num);
        }
    }
}
