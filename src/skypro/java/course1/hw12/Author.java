package skypro.java.course1.hw12;

import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Author author = (Author) obj;
        return Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName);
    }

    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
