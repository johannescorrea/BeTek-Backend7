package com.betek.backend7.sesion15.sets;

import java.util.Objects;

public class Book implements Comparable<Book> {

    private String isbn;
    private String title;
    private String author;
    private String editorial;

    public Book(String isbn, String title, String author, String editorial) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getEditorial() {
        return editorial;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;

        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    @Override
    public int compareTo(Book o) {
        return isbn.compareTo(o.isbn);
    }
}
