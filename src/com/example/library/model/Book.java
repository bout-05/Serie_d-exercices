package src.com.example.library.model;

public class Book {

    private String isbn;
    private String title;
    private String author;

    public Book(String I,String T,String A){
        this.isbn = I;
        this.title = T;
        this.author = A;
    }

    public String getIsbn(){
        return this.isbn;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    @Override
    public String toString(){
        return "isbn:"+ isbn+", title: " + title+", author: "+author+".\n";
    }
}
