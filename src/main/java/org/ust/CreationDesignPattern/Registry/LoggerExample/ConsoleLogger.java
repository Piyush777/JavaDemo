package org.ust.CreationDesignPattern.Registry.LoggerExample;

public class ConsoleLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Console Logger: "+ message);
    }
}
