package org.ust.CreationDesignPattern.Registry.LoggerExample;

public class LoggerRegistryDemo {

    public static void main(String[] args) {

        LoggerRegistry loggerRegistry = LoggerRegistry.getInstance();

        //Register logger
        loggerRegistry.registerLogger("console", new ConsoleLogger());
        loggerRegistry.registerLogger("file", new FileLogger());

        Logger consoleLogger = loggerRegistry.getLogger("console");
        consoleLogger.log("This is a console log message");

        Logger fileLogger = loggerRegistry.getLogger("file");
        fileLogger.log("This is a file log message");
    }
}
