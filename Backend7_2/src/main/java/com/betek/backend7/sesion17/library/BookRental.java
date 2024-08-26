package com.betek.backend7.sesion17.library;

import java.time.LocalDate;

public class BookRental {
    private Book book;
    private LocalDate rentalDate;
    private LocalDate devolutionDate;

    public BookRental(Book book, LocalDate rentalDate, LocalDate devolutionDate) {
        this.book = book;
        this.rentalDate = rentalDate;
        this.devolutionDate = devolutionDate;
    }

    public Book getBook() { return book; }
    public LocalDate getRentalDate() { return rentalDate; }
    public LocalDate getDevolutionDate() { return devolutionDate; }

    @Override
    public String toString() {
        return book.getTitle() + " rented on " + rentalDate + " to be returned by " + devolutionDate;
    }
}
