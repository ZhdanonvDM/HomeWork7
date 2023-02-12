package pro.sky.java.course1.objectAndClass;

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

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
}
