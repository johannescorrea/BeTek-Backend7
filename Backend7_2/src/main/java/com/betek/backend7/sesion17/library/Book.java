package com.betek.backend7.sesion17.library;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private String genre;
    private double price;
    private int availableCopies;

    public Book(String title, String author, int publicationYear, String genre, double price, int availableCopies) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.price = price;
        this.availableCopies = availableCopies;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPublicationYear() { return publicationYear; }
    public String getGenre() { return genre; }
    public double getPrice() { return price; }
    public int getAvailableCopies() { return availableCopies; }

    public void decreaseAvailability() {
        if (availableCopies > 0) {
            availableCopies--;
        }
    }

    public void increaseAvailability() {
        availableCopies++;
    }

    @Override
    public String toString() {
        return title + " by " + author + ", " + publicationYear + " [" + genre + "] - $" + price + " (Available copies: " + availableCopies + ")";
    }
}
