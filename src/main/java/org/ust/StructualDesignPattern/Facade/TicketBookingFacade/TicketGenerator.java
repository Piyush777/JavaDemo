package org.ust.StructualDesignPattern.Facade.TicketBookingFacade;

public class TicketGenerator {

    public void generateTicket(String movieName, int seatNumber){

        System.out.println("Generating ticket for "+ movieName+" , Seat "+ seatNumber);
    }
}
