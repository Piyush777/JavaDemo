package org.ust.SOLID.OCP;

public class SMSNotifcation implements NotificationChannel{
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: "+ message);
        //SMS sending logic
    }
}
