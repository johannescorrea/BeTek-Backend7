package com.betek.backend7.sesion8.longclass.after;

import com.betek.backend7.sesion8.longclass.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomService {

    private List<Room> rooms;
    private int roomCount;

    public RoomService() {
        this.rooms = new ArrayList<>();
        this.roomCount = 0;
    }

    public void addRoom(Room room) {
        rooms.add(room);
        roomCount++;
    }

    public void removeRoom(int roomId) {
        Room roomToRemove = null;
        for (Room room : rooms) {
            if (room.getId() == roomId) {
                roomToRemove = room;
                break;
            }
        }
        if (roomToRemove != null) {
            rooms.remove(roomToRemove);
            roomCount--;
        }
    }

    public List<Room> getAvailableRooms() {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.isAvailable()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public Room findRoomById(int roomId) {
        for (Room room : rooms) {
            if (room.getId() == roomId) {
                return room;
            }
        }
        return null;
    }
}
