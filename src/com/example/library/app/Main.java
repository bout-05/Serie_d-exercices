package src.com.example.library.app;

import src.com.example.library.model.Book;
import src.com.example.library.model.Member;
import src.com.example.library.service.LibraryService;

public class Main {
    public static void main(String[] args) {
        LibraryService Lb1 = new LibraryService();

        Book B1 = new Book("888-0-033-96436-1", "Java", "Erraji");
        Book B2 = new Book("999-0-022-96436-2", "Cand", "Jack");
        Book B3 = new Book("777-0-011-96436-3", "React", "Chiny");

        Member M1 = new Member("100", "Bout", "Bout@gmail.com");
        Member M2 = new Member("101", "Mustapha", "Mustapha@gmail.com");
        Member M3 = new Member("102", "Ali", "Ali@gmail.com");

        Lb1.addBook(B1);
        Lb1.addBook(B2);
        Lb1.addBook(B3);

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
    }
}
