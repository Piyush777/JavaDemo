package org.ust.CreationDesignPattern.Registry.LoggerExample;

public class FileLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.println("FileLogger: "+ message);
    }
}
