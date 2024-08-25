package com.betek.backend7.sesion16.optionals;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

public class Library {

    //Vamos a crear un Set de libros

    private Set<Book> books;

    public Library() {
        books = new TreeSet<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public int getNumeroLibros() {
        return books.size();
    }


    public Set<Book> getBooksOrderedByIsbn() {
        return books;
    }

    public Collection<Book> getBooksOrderedByAuthor() {
        Comparator<Book> compareByAuthor = (b1, b2) -> b1.getAuthor().compareTo(b2.getAuthor());

        List<Book> ordered = new LinkedList<>(books);
        ordered.sort(compareByAuthor);
        return ordered;
    }

    public Optional<Book> findByIsbn(String isbn) {
        Book book = null;
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                book = b;
                break;
            }
        }
        return Optional.ofNullable(book);
    }

}
