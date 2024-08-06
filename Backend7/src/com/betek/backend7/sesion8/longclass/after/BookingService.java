package com.betek.backend7.sesion8.longclass.after;

import com.betek.backend7.sesion8.longclass.Booking;
import com.betek.backend7.sesion8.longclass.Customer;
import com.betek.backend7.sesion8.longclass.Room;

import java.util.ArrayList;
import java.util.List;

public class BookingService {

    private List<Booking> bookings;
    private int bookingCount;

    private final RoomService roomService;
    private final CustomerService customerService;

    public BookingService(RoomService roomService, CustomerService customerService) {
        this.roomService = roomService;
        this.customerService = customerService;
        bookings = new ArrayList<Booking>();
        bookingCount = 0;
    }

    public void createBooking(int roomId, int customerId) {
        Room room = roomService.findRoomById(roomId);
        Customer customer = customerService.findCustomerById(customerId);
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
}
