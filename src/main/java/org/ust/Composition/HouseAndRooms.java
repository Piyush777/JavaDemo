package org.ust.Composition;
import java.util.*;

class Room{
    private final String name;

    public Room(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

class House{

    private final List<Room> roomList;

    public House(){
        this.roomList = new ArrayList<>();
    }

    public void addRoom(Room room){
        roomList.add(room);
    }

    public void showRooms() {
        for (Room room : roomList){
            System.out.println("Room :" + room.getName());
        }
    }

}
public class HouseAndRooms {
    public static void main(String[] args) {
        Room livingRoom = new Room("Living Room");
        Room bedRoom = new Room("Bedroom");
        House house = new House();
        house.addRoom(livingRoom);
        house.addRoom(bedRoom);
        house.showRooms();

    }
}
