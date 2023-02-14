package pro.sky.java.course1.objectAndClass;

public class ApplicationLaunch {
    public static void main(String[] args) {
        Author author1 = new Author("Ivan", "Ivanov");
        Author author2 = new Author("Pert", "Petrov");
        Book book1 = new Book ("Book1", author1, 1983);
        Book book2 = new Book ("Book2", author2, 1985);
        book1.setYear(1987);
        System.out.println(book1);
    }
}
