package com.betek.backend7.sesion16.optionals;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void findByIsbn() {
        Library library = new Library();
        //Book book = new Book("1234", "El Quijote", "Cervantes", "Planeta");
        library.addBook(new Book("1234", "El Quijote", "Cervantes", "Planeta"));

        Optional<Book> abc = library.findByIsbn("1234");

        abc.ifPresentOrElse(
                book -> assertEquals("Cervantes", book.getAuthor()),
                () -> {
                    fail("No se ha encontrado el libro");
                });


        abc.ifPresent(book -> assertEquals("Cervantes", book.getAuthor()));

    }
}