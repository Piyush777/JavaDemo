package org.ust.StructualDesignPattern.Facade.TicketBookingFacade;

public class Payment {

    public boolean makePayment(double amount){
        System.out.println("Processing amount of INR "+ amount);
        return true;
    }
}
