package com.betek.backend7.sesion17.library;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books;
    private Map<User, List<BookRental>> rentals;

    public Library(List<Book> books) {
        this.books = books;
        this.rentals = new HashMap<>();
    }

    public void addUser(User user) {
        rentals.put(user, new ArrayList<>());
    }

    public void rentBook(User user, String title) {
        Optional<Book> optBook = findBookByTitle(title);

        optBook.ifPresentOrElse(book -> {
                    if (book.getAvailableCopies() > 0) {
                        book.decreaseAvailability();
                        rentals.get(user).add(new BookRental(book, LocalDate.now(), LocalDate.now().plusWeeks(2)));
                    }
                },
                () -> System.out.println("Book not available for rent."));
    }

    public void returnBook(User user, String title) {
        List<BookRental> userRentals = rentals.get(user);
        BookRental rentalToReturn = null;

        for (BookRental rental : userRentals) {
            if (rental.getBook().getTitle().equalsIgnoreCase(title)) {
                rentalToReturn = rental;
                break;
            }
        }

        if (rentalToReturn != null) {
            userRentals.remove(rentalToReturn);
            rentalToReturn.getBook().increaseAvailability();
        }
    }

    public boolean isBookRented(String title) {
        return rentals.values().stream()
                .flatMap(rentalList -> rentalList.stream()) //Stream<BookRental>
                .anyMatch(rental -> rental.getBook().getTitle().equalsIgnoreCase(title));

    }

    public List<BookRental> getBooksRentedByUser(User user) {
        return rentals.getOrDefault(user, Collections.emptyList());
    }

    private Optional<Book> findBookByTitle(String title) {
        return books.stream().filter(book -> book.getTitle().equalsIgnoreCase(title))
                .findFirst();
    }

    // Filter books by publication year
    public List<Book> filterBooksByYear(int year) {
        return books.stream().filter(book -> book.getPublicationYear() == year).toList();
    }

    // Filter books by author
    public List<Book> findBooksByAuthor(String author) {
        return books.stream().filter(book -> book.getAuthor().equalsIgnoreCase(author)).toList();
    }

    // Filter books by genre
    public List<Book> findBooksByGenre(String genre) {
        return books.stream().filter(book -> book.getGenre().equalsIgnoreCase(genre)).toList();
    }

    private List<Book> findBy(Predicate<Book> predicate) {
        return books.stream().filter(predicate).toList();
    }

    // Map books to their titles
    public List<String> getBookTitles() {
        List<String> titles = new ArrayList<>();
        for (Book book : books) {
            titles.add(book.getTitle());
        }
        return titles;
    }

    // Sort books by price
    public List<Book> sortBooksByPrice() {
        List<Book> sortedBooks = new ArrayList<>(books);
        sortedBooks.sort(new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return Double.compare(b1.getPrice(), b2.getPrice());
            }
        });
        return sortedBooks;
    }

    // Short-circuit operation: find any book by genre
    public Book findAnyBookByGenre(String genre) {
        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase(genre)) {
                return book;
            }
        }
        return null;
    }

    // Group books by genre
    public Map<String, List<Book>> groupBooksByGenre() {
        return books.stream().collect(Collectors.groupingBy(Book::getGenre));
    }

    public Map<User, List<BookRental>> getRentals() {
        return rentals;
    }
}
