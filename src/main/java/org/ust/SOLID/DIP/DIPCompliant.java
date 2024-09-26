package org.ust.SOLID.DIP;

public class DIPCompliant {


    interface MessageService{
        void sendMessage(String message);
    }

    static class EmailService implements MessageService{

        @Override
        public void sendMessage(String message) {
            System.out.println("Sending email "+ message);
        }
    }

    static class SMSService implements MessageService{

        @Override
        public void sendMessage(String message) {
            System.out.println("Sending SMS "+ message);
        }
    }

    static class Notification{
        private MessageService messageService;

        public Notification(MessageService messageService){
            this.messageService = messageService;
        }

        public void send(String message){
            messageService.sendMessage(message);
        }
    }

    public static void main(String[] args) {
        //inject email service
        MessageService emailService = new EmailService();
        Notification emailNotification = new Notification(emailService);
        emailNotification.send("Hello via email");

        //inject sms service
        SMSService smsService = new SMSService();
        Notification smsNotification = new Notification(smsService);
        smsNotification.send("Hello via SMS");
    }
}
