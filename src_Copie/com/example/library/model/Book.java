package src_Copie.com.example.library.model;

public final class Book {

    private final String isbn;
    private final String title;
    private final String author;

    public Book(String I,String T,String A){
        if(I == null || T == null || A == null){
            throw new IllegalArgumentException("Acuun information !");
        }else{
            this.isbn = I;
            this.title = T;
            this.author = A;
        }
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
