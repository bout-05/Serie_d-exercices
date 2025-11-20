package src.com.example.library.model;

public class Member {

    private String id;
    private String name;
    private String email;

    public Member(String I,String N,String E){
        this.id = I;
        this.name = N;
        this.email = E;
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    @Override
    public String toString(){
        return "id :"+ id+", name :"+name+", eamil :"+email+".\n";
    }
}
