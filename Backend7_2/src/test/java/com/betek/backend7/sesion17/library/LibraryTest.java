package com.betek.backend7.sesion17.library;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;
    private User user;
    private Book book1, book2, book3, book4;

    @BeforeEach
    public void setUp() {
        book1 = new Book("Book One", "Author A", 2021, "Fiction", 9.99, 3);
        book2 = new Book("Book Two", "Author B", 2023, "Non-Fiction", 14.99, 2);
        book3 = new Book("Book Three", "Author A", 2023, "Fiction", 19.99, 1);
        book4 = new Book("Book Four", "Author D", 2022, "Fantasy", 24.99, 0);

        library = new Library(List.of(book1, book2, book3, book4));
        user = new User("John Doe", "jhondoe@email.com");
        library.addUser(user);
    }

    @Test
    public void testRentBook() {
        library.rentBook(user, "Book One");
        List<BookRental> rentedBooks = library.getBooksRentedByUser(user);
        assertEquals(1, rentedBooks.size());
        assertEquals("Book One", rentedBooks.get(0).getBook().getTitle());
        assertEquals(2, rentedBooks.get(0).getBook().getAvailableCopies());
    }

    @Test
    public void testReturnBook() {
        library.rentBook(user, "Book One");
        library.returnBook(user, "Book One");
        List<BookRental> rentedBooks = library.getBooksRentedByUser(user);
        assertEquals(0, rentedBooks.size());
        assertEquals(3, book1.getAvailableCopies());
    }

    @Test
    public void testRentBook_NoAvailability() {
        library.rentBook(user, "Book Four");
        List<BookRental> rentedBooks = library.getBooksRentedByUser(user);
        assertEquals(0, rentedBooks.size());
    }

    @Test
    public void testIsBookRented() {
        library.rentBook(user, "Book One");
        assertTrue(library.isBookRented("Book One"));
        assertFalse(library.isBookRented("Book Two"));
    }

    @Test
    public void testFilterBooksByYear() {
        List<Book> books2023 = library.filterBooksByYear(2023);
        assertEquals(2, books2023.size());
        assertTrue(books2023.contains(book2));
        assertTrue(books2023.contains(book3));
    }

    @Test
    public void testFindBooksByAuthor() {
        List<Book> authorABooks = library.findBooksByAuthor("Author A");
        assertEquals(2, authorABooks.size());
        assertTrue(authorABooks.contains(book1));
        assertTrue(authorABooks.contains(book3));
    }

    @Test
    public void testFindBooksByGenre() {
        List<Book> fictionBooks = library.findBooksByGenre("Fiction");
        assertEquals(2, fictionBooks.size());
        assertTrue(fictionBooks.contains(book1));
        assertTrue(fictionBooks.contains(book3));
    }

    @Test
    public void testGetBookTitles() {
        List<String> titles = library.getBookTitles();
        assertEquals(4, titles.size());
        assertTrue(titles.contains("Book One"));
        assertTrue(titles.contains("Book Two"));
        assertTrue(titles.contains("Book Three"));
        assertTrue(titles.contains("Book Four"));
    }

    @Test
    public void testSortBooksByPrice() {
        List<Book> sortedBooks = library.sortBooksByPrice();
        assertEquals(book1, sortedBooks.get(0));
        assertEquals(book4, sortedBooks.get(3));
    }

    @Test
    public void testFindAnyBookByGenre() {
        Book anyFiction = library.findAnyBookByGenre("Fiction");
        assertNotNull(anyFiction);
        assertTrue(anyFiction.getGenre().equalsIgnoreCase("Fiction"));
    }

    @Test
    public void testGroupBooksByGenre() {
        Map<String, List<Book>> booksByGenre = library.groupBooksByGenre();
        assertEquals(3, booksByGenre.size());
        assertEquals(2, booksByGenre.get("Fiction").size());
        assertEquals(1, booksByGenre.get("Fantasy").size());
        assertEquals(1, booksByGenre.get("Non-Fiction").size());
    }
}