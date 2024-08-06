package com.betek.backend7.sesion8.longclass;

import java.util.ArrayList;
import java.util.List;

public class HotelManagementSystem {

    // Room management fields
    private List<Room> rooms;
    private int roomCount;

    // Customer management fields
    private List<Customer> customers;
    private int customerCount;

    // Booking management fields
    private List<Booking> bookings;
    private int bookingCount;

    public HotelManagementSystem() {
        this.rooms = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.bookings = new ArrayList<>();
        this.roomCount = 0;
        this.customerCount = 0;
        this.bookingCount = 0;
    }

    // Room management methods
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

    // Customer management methods
    public void addCustomer(Customer customer) {
        customers.add(customer);
        customerCount++;
    }

    public void removeCustomer(int customerId) {
        Customer customerToRemove = null;
        for (Customer customer : customers) {
            if (customer.getId() == customerId) {
                customerToRemove = customer;
                break;
            }
        }
        if (customerToRemove != null) {
            customers.remove(customerToRemove);
            customerCount--;
        }
    }

    public Customer findCustomerById(int customerId) {
        for (Customer customer : customers) {
            if (customer.getId() == customerId) {
                return customer;
            }
        }
        return null;
    }

    // Booking management methods
    public void createBooking(int roomId, int customerId) {
        Room room = findRoomById(roomId);
        Customer customer = findCustomerById(customerId);
        if (room != null && customer != null && room.isAvailable()) {
            Booking booking = new Booking(room, customer);
            bookings.add(booking);
            bookingCount++;
            room.setAvailable(false);
        }
    }

    public void cancelBooking(int bookingId) {
        Booking bookingToRemove = null;
        for (Booking booking : bookings) {
            if (booking.getId() == bookingId) {
                bookingToRemove = booking;
                break;
            }
        }
        if (bookingToRemove != null) {
            bookings.remove(bookingToRemove);
            bookingToRemove.getRoom().setAvailable(true);
            bookingCount--;
        }
    }

    private Room findRoomById(int roomId) {
        for (Room room : rooms) {
            if (room.getId() == roomId) {
                return room;
            }
        }
        return null;
    }
}

