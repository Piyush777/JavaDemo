package org.ust.CreationDesignPattern.Registry.ServiceRegistry;

public class EmailService implements Service{

    @Override
    public void execute() {
        System.out.println("Executing Email Service");
    }
}
