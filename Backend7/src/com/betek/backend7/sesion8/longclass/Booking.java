package com.betek.backend7.sesion8.longclass;

public class Booking {
    private static int bookingCounter = 1;
    private int id;
    private Room room;
    private Customer customer;

    public Booking(Room room, Customer customer) {
        this.id = bookingCounter++;
        this.room = room;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Room getRoom() {
        return room;
    }

    public Customer getCustomer() {
        return customer;
    }
}
