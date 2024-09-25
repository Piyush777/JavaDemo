package org.ust.SOLID.OCP;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    private List<NotificationChannel> channelList;

    public NotificationService(){
        this.channelList = new ArrayList<>();
    }

    public void addChannel(NotificationChannel notificationChannel){
        channelList.add(notificationChannel);
    }

    public void sendNotification(String message){
        for(NotificationChannel channel: channelList){
            channel.send(message);
        }
    }

}
