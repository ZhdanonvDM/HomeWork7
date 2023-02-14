package pro.sky.java.course1.objectAndClass;

import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int year;

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public String toString() {
        return  "title='" + title + '\'' +
                ", author=" + author +
                ", year=" + year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
}
