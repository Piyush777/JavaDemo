package org.ust.SOLID.OCP;

public class EmailNotification implements NotificationChannel{
    @Override
    public void send(String message) {
        System.out.println("Sending email "+ message);
        //Email Sending logic
    }
}
