package com.betek.backend7.sesion15.sets;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {


    @Test
    void library_testAddBook() {
        Library library = new Library();
        Book book = new Book("1234", "El Quijote", "Cervantes", "Planeta");
        library.addBook(book);
        assertEquals(1, library.getNumeroLibros());
    }

    @Test
    void library_testSameBook() {
        Library library = new Library();
        //Book book = new Book("1234", "El Quijote", "Cervantes", "Planeta");
        library.addBook(new Book("1234", "El Quijote", "Cervantes", "Planeta"));
        library.addBook(new Book("1234", "El Quijote", "Cervantes", "Planeta Editores"));
        assertEquals(1, library.getNumeroLibros());
    }

    @Test
    void library_testGetBooksOrderedById() {
        Library library = new Library();
        //Book book = new Book("1234", "El Quijote", "Cervantes", "Planeta");
        library.addBook(new Book("1234", "El Quijote", "Cervantes", "Planeta"));
        library.addBook(new Book("1232", "El Quijote", "Cervantes", "Planeta Editores"));
        library.addBook(new Book("1235", "El Ingenioso Quijote", "Cervantes", "Santillana"));

        Set<Book> books = library.getBooksOrderedByIsbn();

        Iterator<Book> iterator = books.iterator();
        assertEquals("1232", iterator.next().getIsbn());
        assertEquals("1234", iterator.next().getIsbn());
        assertEquals("1235", iterator.next().getIsbn());

    }

    @Test
    void library_testGetBooksOrderedByAuthor() {
        //Arrange - Preparación
        Library library = new Library();
        //Book book = new Book("1234", "El Quijote", "Cervantes", "Planeta");
        library.addBook(new Book("1234", "El Quijote", "Cervantes", "Planeta"));
        library.addBook(new Book("1232", "El señor de los Anillos", "Tolkien", "Planeta Editores"));
        library.addBook(new Book("1235", "Cien años de soledad", "Garcia Marquez", "Santillana"));

        //Act - Ejecución
        Collection<Book> books = library.getBooksOrderedByAuthor();

        //Assert - Validacion o comprobación de los resultados
        Iterator<Book> iterator = books.iterator();

        assertEquals("1234", iterator.next().getIsbn());
        assertEquals("1235", iterator.next().getIsbn());
        assertEquals("1232", iterator.next().getIsbn());

    }


    @Test
    void library_testGetBooksOrderedByAuthor2() {
        //Arrange - Preparación
        List<Book> library = new LinkedList<>();
        //Book book = new Book("1234", "El Quijote", "Cervantes", "Planeta");
        library.add(new Book("1234", "El Quijote", "Cervantes", "Planeta"));
        library.add(new Book("1232", "El señor de los Anillos", "Tolkien", "Planeta Editores"));
        library.add(new Book("1235", "Cien años de soledad", "Garcia Marquez", "Santillana"));

        Comparator<Book> compareByAuthor = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        };
        Collections.sort(library, compareByAuthor);

        //Assert - Validacion o comprobación de los resultados
        Iterator<Book> iterator = library.iterator();

        assertEquals("1234", iterator.next().getIsbn());
        assertEquals("1235", iterator.next().getIsbn());
        assertEquals("1232", iterator.next().getIsbn());

    }

    @Test
    void library_findByIsbn_shouldReturnNull() {
        Library library = new Library();
        //Book book = new Book("1234", "El Quijote", "Cervantes", "Planeta");
        library.addBook(new Book("1234", "El Quijote", "Cervantes", "Planeta"));

        Book abc = library.findByIsbn("abc");
        assertNull(abc);
    }
}