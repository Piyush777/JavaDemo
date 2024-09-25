package org.ust.SOLID.OCP;

public class DriverProgram {

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.addChannel(new EmailNotification());
        notificationService.addChannel(new SMSNotifcation());
        notificationService.sendNotification("Hello, World");

    }
}
