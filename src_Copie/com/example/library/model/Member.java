package src_Copie.com.example.library.model;

public final class Member {

    private final String id;
    private final String name;
    private final String email;

    public Member(String I,String N,String E){
        if(I == null || N == null || !E.contains("@")){
            throw new IllegalArgumentException("Les information invalide !");
        }else{
            this.id = I;
            this.name = N;
            this.email = E;
        }
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
