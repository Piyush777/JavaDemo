package org.ust.StructualDesignPattern.Facade.TicketBookingFacade;

public class MovieBookingFacadeDemo {

    public static void main(String[] args) {
        MovieTicketBookingFacade movieTicketBookingFacade = new MovieTicketBookingFacade();
        movieTicketBookingFacade.bookTicket("Avenger: Endgame", 5, 2500);
    }
}
