package com.betek.backend7.sesion8.longclass;

public class Room {
    private int id;
    private boolean available;

    public Room(int id) {
        this.id = id;
        this.available = true;
    }

    public int getId() {
        return id;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
