package org.ust.SOLID.DIP;

public class DIPViolation {

    class EmailService{

        public void sendEmail(String message){
            System.out.println("Sending email "+ message);
        }
    }

    class Notification{

        private EmailService emailService;

        public Notification(){
            this.emailService = new EmailService();
        }

        public void send(String message){
            emailService.sendEmail(message);
        }
    }
}
