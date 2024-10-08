package org.ust.StructualDesignPattern.Facade.TicketBookingFacade;

public class SeatAvailability {

    public boolean checkAvailability(String movieName, int seatNumber){
        System.out.println("Checking seat availability for "+ movieName);
        return true; // assume seat is available
    }

}
