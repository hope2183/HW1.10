package ru.skypro;

import java.util.Objects;

public class Book {
    private final Author author;
    private final String title;
    private int publisherYear;
    public Book (Author author, String title, int publisherYear){
        this.author = author;
        this.title = title;
        this.publisherYear = publisherYear;
    }


    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublisherYear() {
        return publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }

    @Override
    public String toString() {
        return "Book: " + title + " by "+author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publisherYear == book.publisherYear && Objects.equals(author, book.author) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, publisherYear);
    }
}
