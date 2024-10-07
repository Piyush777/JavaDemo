package org.ust.CreationDesignPattern.Registry.ServiceRegistry;

public class PaymentService implements Service{
    @Override
    public void execute() {
        System.out.println("Executing Payment Service");
    }
}
