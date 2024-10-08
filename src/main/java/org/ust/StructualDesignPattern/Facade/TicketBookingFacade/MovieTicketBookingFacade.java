package org.ust.StructualDesignPattern.Facade.TicketBookingFacade;

public class MovieTicketBookingFacade {

    private SeatAvailability seatAvailability;
    private Payment payment;
    private TicketGenerator ticketGenerator;

    public MovieTicketBookingFacade(){
        this.seatAvailability = new SeatAvailability();
        this.payment = new Payment();
        this.ticketGenerator = new TicketGenerator();
    }

    public void bookTicket(String movieName, int seatNumber, double amount){

        if(seatAvailability.checkAvailability(movieName, seatNumber)){

            if(payment.makePayment(amount)){
                ticketGenerator.generateTicket(movieName, seatNumber);
            }else{
                System.out.println("Payment failed. Booking cancelled");
            }
        }else{
            System.out.println("Seat Not Available");
        }
    }
}
