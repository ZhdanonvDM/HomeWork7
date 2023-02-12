package pro.sky.java.course1.objectAndClass;

public class Author {
    private String firstName;
    private String surname;

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public Author(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }
}


