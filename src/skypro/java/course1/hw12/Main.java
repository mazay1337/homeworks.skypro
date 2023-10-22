package skypro.java.course1.hw12;

import skypro.java.course1.hw12.Author;
import skypro.java.course1.hw12.Book;

public class Main {
    public static void  main(String[] args) {
        Author rowling = new Author("Joanne", "Rowling");
        Author roberts = new Author("Gregory", "Roberts");
        Author akunin = new Author("Boris", "Akunin");

        Book harryPotter1 = new Book(rowling, "Harry Potter and the Philosophi Stone", 1997);
        Book shantaram = new Book(roberts,"Shantaram", 2003);
        Book azazel = new Book(akunin,"Azazel", 1998);

        harryPotter1.setPublicationYear(1999);

        System.out.println(harryPotter1);
        System.out.println(shantaram);
        System.out.println(azazel);

    }
}