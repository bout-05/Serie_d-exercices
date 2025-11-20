package src_Copie.com.example.library.app;

import java.util.List; 

import src.com.example.library.model.Book;
import src.com.example.library.model.Member;
import src.com.example.library.service.LibraryService;

public class Main {
    public static void main(String[] args) {
        LibraryService Lb1 = new LibraryService();

        Book B1 = new Book("888-0-033-96436-1", "Java", "Erraji");
        Book B2 = new Book("999-0-022-9643-21", "djh", "Jack");
        Book B4 = new Book("999-0-022-9643-22", "ojfo", "Jack");
        Book B5 = new Book("999-0-022-9643-23", "lalk", "Jack");
        Book B3 = new Book("777-0-011-96436-3", "React", "Chiny");

        Member M1 = new Member("100", "Bout", "Bout@gmail.com");
        Member M2 = new Member("101", "Mustapha", "Mustapha@gmail.com");
        Member M3 = new Member("102", "Ali", "Ali@gmail.com");

        Lb1.addBook(B1);
        Lb1.addBook(B2);
        Lb1.addBook(B3);
        Lb1.addBook(B4);
        Lb1.addBook(B5);

        Lb1.addMember(M1);
        Lb1.addMember(M2);
        Lb1.addMember(M3);

        System.out.println("Books:");
        for (Book b : Lb1.getBooks()) {
            System.out.println(" - " + b);
        }

        System.out.println("\nMembers:");
        for (Member m : Lb1.getMembers()) {
            System.out.println(" - " + m);
        }

        System.out.println("\nBooks de 'Jack':");
        List<Book> resultat = Lb1.findBooksByAuthor("Jack");

        for (Book b : resultat) {
            System.out.println(" - " + b);
        }
    }
}
