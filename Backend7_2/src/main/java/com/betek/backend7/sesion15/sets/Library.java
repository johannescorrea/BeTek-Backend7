package com.betek.backend7.sesion15.sets;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
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
        Comparator<Book> compareByAuthor = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        };

        List<Book> ordered = new LinkedList<>(books);
        ordered.sort(compareByAuthor);
        return ordered;
    }

    /**
     *
     * @param isbn
     * @return Retorna un book o null si no hay un libro con el isbn dado
     */
    public Book findByIsbn(String isbn) {
        Book book = null;
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                book = b;
                break;
            }
        }
        return book;
    }

}
