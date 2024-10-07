package org.ust.CreationDesignPattern.Registry.ServiceRegistry;

public class ServiceRegistryDemo {

    public static void main(String[] args) {
        ServiceRegistry serviceRegistry = ServiceRegistry.getInstance();

        //Registering services
        serviceRegistry.registerService("email", new EmailService());
        serviceRegistry.registerService("payment", new PaymentService());

        Service emailService = serviceRegistry.getService("email");
        emailService.execute();

        Service paymentService = serviceRegistry.getService("payment");
        paymentService.execute();
    }
}
