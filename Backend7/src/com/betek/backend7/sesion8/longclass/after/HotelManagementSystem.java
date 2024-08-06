package com.betek.backend7.sesion8.longclass.after;

import com.betek.backend7.sesion8.longclass.Booking;
import com.betek.backend7.sesion8.longclass.Customer;
import com.betek.backend7.sesion8.longclass.Room;

import java.util.ArrayList;
import java.util.List;

public class HotelManagementSystem {

    private final RoomService roomService;
    private final CustomerService customerService;
    private final BookingService bookingService;

    public HotelManagementSystem(RoomService roomService, CustomerService customerService, BookingService bookingService) {
        this.customerService = customerService;
        this.roomService = roomService;
        this.bookingService = bookingService;
    }

    // Room management methods
    public void addRoom(Room room) {
        roomService.addRoom(room);
    }

    public void removeRoom(int roomId) {
        roomService.removeRoom(roomId);
    }

    public List<Room> getAvailableRooms() {
        return roomService.getAvailableRooms();
    }

    // Customer management methods
    public void addCustomer(Customer customer) {
        customerService.addCustomer(customer);
    }

    public void removeCustomer(int customerId) {
        customerService.removeCustomer(customerId);
    }

    public Customer findCustomerById(int customerId) {
        return customerService.findCustomerById(customerId);
    }

    // Booking management methods
    public void createBooking(int roomId, int customerId) {
        bookingService.createBooking(roomId, customerId);
    }

    public void cancelBooking(int bookingId) {
        bookingService.cancelBooking(bookingId);
    }
}

